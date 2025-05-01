package com.matrix.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.soap.MTOM;

/**
 * SOAP Web Service for matrix operations.
 */
@WebService(serviceName = "MatrixService")
@MTOM
public class MatrixService {

    /**
     * Adds two matrices.
     * Condition: The matrices must have the same dimensions.
     * 
     * @param matrixA First matrix
     * @param matrixB Second matrix
     * @return The sum of the two matrices
     * @throws MatrixOperationException if matrices have different dimensions
     */
    @WebMethod(operationName = "addMatrices")
    @WebResult(name = "resultMatrix")
    public Matrix addMatrices(
            @WebParam(name = "matrixA") Matrix matrixA, 
            @WebParam(name = "matrixB") Matrix matrixB) throws MatrixOperationException {
        
        // Check if matrices have the same dimensions
        if (matrixA.getRows() != matrixB.getRows() || matrixA.getCols() != matrixB.getCols()) {
            throw new MatrixOperationException("Matrices must have the same dimensions for addition.");
        }
        
        int rows = matrixA.getRows();
        int cols = matrixA.getCols();
        Matrix result = new Matrix(rows, cols);
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.set(i, j, matrixA.get(i, j) + matrixB.get(i, j));
            }
        }
        
        return result;
    }
    
    /**
     * Multiplies two matrices.
     * Condition: Number of columns of A = Number of rows of B.
     * 
     * @param matrixA First matrix
     * @param matrixB Second matrix
     * @return The product of the two matrices
     * @throws MatrixOperationException if matrix dimensions are incompatible
     */
    @WebMethod(operationName = "multiplyMatrices")
    @WebResult(name = "resultMatrix")
    public Matrix multiplyMatrices(
            @WebParam(name = "matrixA") Matrix matrixA, 
            @WebParam(name = "matrixB") Matrix matrixB) throws MatrixOperationException {
        
        // Check if matrices can be multiplied
        if (matrixA.getCols() != matrixB.getRows()) {
            throw new MatrixOperationException("Number of columns in first matrix must equal number of rows in second matrix.");
        }
        
        int rowsA = matrixA.getRows();
        int colsB = matrixB.getCols();
        int colsA = matrixA.getCols(); // Same as rowsB
        
        Matrix result = new Matrix(rowsA, colsB);
        
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                double sum = 0;
                for (int k = 0; k < colsA; k++) {
                    sum += matrixA.get(i, k) * matrixB.get(k, j);
                }
                result.set(i, j, sum);
            }
        }
        
        return result;
    }
    
    /**
     * Calculates the determinant of a square matrix.
     * Condition: Matrix must be square.
     * 
     * @param matrix Input matrix
     * @return The determinant value
     * @throws MatrixOperationException if the matrix is not square
     */
    @WebMethod(operationName = "calculateDeterminant")
    @WebResult(name = "determinant")
    public double calculateDeterminant(
            @WebParam(name = "matrix") Matrix matrix) throws MatrixOperationException {
        
        // Check if matrix is square
        if (!matrix.isSquare()) {
            throw new MatrixOperationException("Determinant can only be calculated for square matrices.");
        }
        
        int n = matrix.getRows();
        return determinant(matrix.getData(), n);
    }
    
    /**
     * Recursive helper method to calculate determinant.
     */
    private double determinant(double[][] matrix, int n) {
        if (n == 1) {
            return matrix[0][0];
        }
        
        if (n == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }
        
        double det = 0;
        double[][] submatrix = new double[n-1][n-1];
        
        for (int c = 0; c < n; c++) {
            // Get cofactor matrix
            int subi = 0;
            for (int i = 1; i < n; i++) {
                int subj = 0;
                for (int j = 0; j < n; j++) {
                    if (j == c) continue;
                    submatrix[subi][subj] = matrix[i][j];
                    subj++;
                }
                subi++;
            }
            
            // Alternate sign based on column
            det += Math.pow(-1, c) * matrix[0][c] * determinant(submatrix, n-1);
        }
        
        return det;
    }
    
    /**
     * Calculates the inverse of a square matrix.
     * Condition: Matrix must be square and determinant must not be zero.
     * 
     * @param matrix Input matrix
     * @return The inverse matrix
     * @throws MatrixOperationException if the matrix is not square or has zero determinant
     */
    @WebMethod(operationName = "invertMatrix")
    @WebResult(name = "inverseMatrix")
    public Matrix invertMatrix(
            @WebParam(name = "matrix") Matrix matrix) throws MatrixOperationException {
        
        // Check if matrix is square
        if (!matrix.isSquare()) {
            throw new MatrixOperationException("Matrix must be square to calculate inverse.");
        }
        
        // Check if determinant is non-zero
        double det = calculateDeterminant(matrix);
        if (Math.abs(det) < 1e-10) { // Using epsilon for floating-point comparison
            throw new MatrixOperationException("Matrix inverse doesn't exist (determinant is zero).");
        }
        
        int n = matrix.getRows();
        double[][] data = matrix.getData();
        double[][] result = new double[n][n];
        
        if (n == 1) {
            result[0][0] = 1.0 / data[0][0];
        } else {
            // Create adjoint matrix
            double[][] adjoint = new double[n][n];
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    // Get cofactor matrix
                    double[][] cofactor = new double[n-1][n-1];
                    int cofactorRow = 0;
                    
                    for (int row = 0; row < n; row++) {
                        if (row == i) continue;
                        int cofactorCol = 0;
                        for (int col = 0; col < n; col++) {
                            if (col == j) continue;
                            cofactor[cofactorRow][cofactorCol] = data[row][col];
                            cofactorCol++;
                        }
                        cofactorRow++;
                    }
                    
                    // Calculate cofactor
                    double cofactorDet = determinant(cofactor, n-1);
                    adjoint[j][i] = Math.pow(-1, i + j) * cofactorDet; // Note: i and j are swapped for transpose
                }
            }
            
            // Divide adjoint by determinant
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    result[i][j] = adjoint[i][j] / det;
                }
            }
        }
        
        return new Matrix(result);
    }
    
    /**
     * Calculates the transpose of a matrix.
     * 
     * @param matrix Input matrix
     * @return Transposed matrix (rows and columns swapped)
     */
    @WebMethod(operationName = "transposeMatrix")
    @WebResult(name = "transposedMatrix")
    public Matrix transposeMatrix(
            @WebParam(name = "matrix") Matrix matrix) {
        
        int rows = matrix.getRows();
        int cols = matrix.getCols();
        Matrix result = new Matrix(cols, rows); // Note: dimensions are swapped
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.set(j, i, matrix.get(i, j));
            }
        }
        
        return result;
    }
    
    /**
     * Multiplies a matrix by a scalar value.
     * 
     * @param matrix Input matrix
     * @param scalar Scalar value
     * @return Matrix with all elements multiplied by the scalar
     */
    @WebMethod(operationName = "multiplyByScalar")
    @WebResult(name = "resultMatrix")
    public Matrix multiplyByScalar(
            @WebParam(name = "matrix") Matrix matrix, 
            @WebParam(name = "scalar") double scalar) {
        
        int rows = matrix.getRows();
        int cols = matrix.getCols();
        Matrix result = new Matrix(rows, cols);
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.set(i, j, matrix.get(i, j) * scalar);
            }
        }
        
        return result;
    }
    
    /**
     * Calculates the trace of a matrix (sum of diagonal elements).
     * Condition: Matrix must be square.
     * 
     * @param matrix Input matrix
     * @return The trace value
     * @throws MatrixOperationException if the matrix is not square
     */
    @WebMethod(operationName = "calculateTrace")
    @WebResult(name = "trace")
    public double calculateTrace(
            @WebParam(name = "matrix") Matrix matrix) throws MatrixOperationException {
        
        // Check if matrix is square
        if (!matrix.isSquare()) {
            throw new MatrixOperationException("Trace can only be calculated for square matrices.");
        }
        
        int n = matrix.getRows();
        double trace = 0;
        
        for (int i = 0; i < n; i++) {
            trace += matrix.get(i, i);
        }
        
        return trace;
    }
    
    /**
     * Calculates the square of a matrix (matrix multiplied by itself).
     * Condition: Matrix must be square.
     * 
     * @param matrix Input matrix
     * @return The squared matrix
     * @throws MatrixOperationException if the matrix is not square
     */
    @WebMethod(operationName = "squareMatrix")
    @WebResult(name = "squaredMatrix")
    public Matrix squareMatrix(
            @WebParam(name = "matrix") Matrix matrix) throws MatrixOperationException {
        
        // Check if matrix is square
        if (!matrix.isSquare()) {
            throw new MatrixOperationException("Matrix must be square to calculate its square.");
        }
        
        // Use the multiply method to multiply the matrix by itself
        return multiplyMatrices(matrix, matrix);
    }
}