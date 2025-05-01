package com.matrix.service;

import java.io.Serializable;

/**
 * Represents a matrix with operations for SOAP web service.
 */
public class Matrix implements Serializable {
    private int rows;
    private int cols;
    private double[][] data;

    // Default constructor required for JAXB marshalling/unmarshalling
    public Matrix() {
        this.rows = 0;
        this.cols = 0;
        this.data = new double[0][0];
    }

    /**
     * Create a matrix with the specified dimensions.
     * 
     * @param rows number of rows
     * @param cols number of columns
     */
    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new double[rows][cols];
    }
    
    /**
     * Create a matrix with the provided data.
     * 
     * @param data 2D array containing matrix elements
     */
    public Matrix(double[][] data) {
        this.rows = data.length;
        this.cols = data[0].length;
        this.data = new double[rows][cols];
        
        // Copy the data to avoid reference issues
        for (int i = 0; i < rows; i++) {
            System.arraycopy(data[i], 0, this.data[i], 0, cols);
        }
    }

    /**
     * Get the number of rows.
     * 
     * @return number of rows
     */
    public int getRows() {
        return rows;
    }

    /**
     * Set the number of rows.
     * 
     * @param rows number of rows
     */
    public void setRows(int rows) {
        this.rows = rows;
    }

    /**
     * Get the number of columns.
     * 
     * @return number of columns
     */
    public int getCols() {
        return cols;
    }

    /**
     * Set the number of columns.
     * 
     * @param cols number of columns
     */
    public void setCols(int cols) {
        this.cols = cols;
    }

    /**
     * Get the matrix data.
     * 
     * @return 2D array containing matrix elements
     */
    public double[][] getData() {
        return data;
    }

    /**
     * Set the matrix data.
     * 
     * @param data 2D array containing matrix elements
     */
    public void setData(double[][] data) {
        this.data = data;
        if (data != null && data.length > 0) {
            this.rows = data.length;
            this.cols = data[0].length;
        }
    }

    /**
     * Check if the matrix is square (rows = columns).
     * 
     * @return true if matrix is square, false otherwise
     */
    public boolean isSquare() {
        return rows == cols;
    }

    /**
     * Get a specific element in the matrix.
     * 
     * @param row row index
     * @param col column index
     * @return value at specified position
     */
    public double get(int row, int col) {
        return data[row][col];
    }

    /**
     * Set a specific element in the matrix.
     * 
     * @param row row index
     * @param col column index
     * @param value value to set
     */
    public void set(int row, int col, double value) {
        data[row][col] = value;
    }
}