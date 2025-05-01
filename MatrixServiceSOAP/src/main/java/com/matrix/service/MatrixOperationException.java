package com.matrix.service;

/**
 * Custom exception for matrix operations that fail due to constraints or invalid inputs.
 */
public class MatrixOperationException extends Exception {
    
    /**
     * Creates a new MatrixOperationException with the specified error message.
     * 
     * @param message the detail message
     */
    public MatrixOperationException(String message) {
        super(message);
    }
    
    /**
     * Creates a new MatrixOperationException with the specified error message and cause.
     * 
     * @param message the detail message
     * @param cause the cause of the exception
     */
    public MatrixOperationException(String message, Throwable cause) {
        super(message, cause);
    }
}