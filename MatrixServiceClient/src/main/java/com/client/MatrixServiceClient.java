package com.client;

import com.matrix.service.client.*;
import javax.xml.namespace.QName;
import java.net.URL;
import java.util.Arrays;

public class MatrixServiceClient {
    public static void main(String[] args) {
        try {
            // The WSDL URL for the deployed service
            URL url = new URL("http://localhost:8086/services/MatrixService?wsdl");
            
            // QName for the service (namespace URI and local part)
            QName qname = new QName("http://service.matrix.com/", "MatrixService");
            
            System.out.println("Creating service client...");
            MatrixService_Service service = new MatrixService_Service(url, qname);
            MatrixService matrixService = service.getMatrixServicePort();
            
            // Test case 1: Matrix Addition
            System.out.println("\nTesting Matrix Addition:");
            Matrix matrixA = createMatrix(new double[][]{{1, 2}, {3, 4}});
            Matrix matrixB = createMatrix(new double[][]{{5, 6}, {7, 8}});
            
            Matrix result = matrixService.addMatrices(matrixA, matrixB);
            printMatrix("Result of addition:", result);

            // Test case 2: Matrix Multiplication
            System.out.println("\nTesting Matrix Multiplication:");
            result = matrixService.multiplyMatrices(matrixA, matrixB);
            printMatrix("Result of multiplication:", result);

            // Test case 3: Determinant
            System.out.println("\nTesting Determinant:");
            double det = matrixService.calculateDeterminant(matrixA);
            System.out.println("Determinant of matrix A: " + det);

            // Test case 4: Transpose
            System.out.println("\nTesting Transpose:");
            result = matrixService.transposeMatrix(matrixA);
            printMatrix("Transpose of matrix A:", result);

            // Test case 5: Scalar Multiplication
            System.out.println("\nTesting Scalar Multiplication:");
            result = matrixService.multiplyByScalar(matrixA, 2.0);
            printMatrix("Matrix A multiplied by 2:", result);

            // Test case 6: Trace
            System.out.println("\nTesting Trace:");
            double trace = matrixService.calculateTrace(matrixA);
            System.out.println("Trace of matrix A: " + trace);

            // Test case 7: Matrix Square
            System.out.println("\nTesting Matrix Square:");
            result = matrixService.squareMatrix(matrixA);
            printMatrix("Square of matrix A:", result);

            // Test case 8: Matrix Inverse
            System.out.println("\nTesting Matrix Inverse:");
            result = matrixService.invertMatrix(matrixA);
            printMatrix("Inverse of matrix A:", result);

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static Matrix createMatrix(double[][] data) {
        Matrix matrix = new Matrix();
        for (double[] row : data) {
            DoubleArray doubleArray = new DoubleArray();
            for (double value : row) {
                doubleArray.getItem().add(value);
            }
            matrix.getData().add(doubleArray);
        }
        return matrix;
    }

    private static void printMatrix(String message, Matrix matrix) {
        System.out.println(message);
        for (DoubleArray row : matrix.getData()) {
            for (Double value : row.getItem()) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}