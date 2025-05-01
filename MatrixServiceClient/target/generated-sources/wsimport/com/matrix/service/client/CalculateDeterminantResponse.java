
package com.matrix.service.client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for calculateDeterminantResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="calculateDeterminantResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="determinant" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculateDeterminantResponse", propOrder = {
    "determinant"
})
public class CalculateDeterminantResponse {

    protected double determinant;

    /**
     * Gets the value of the determinant property.
     * 
     */
    public double getDeterminant() {
        return determinant;
    }

    /**
     * Sets the value of the determinant property.
     * 
     */
    public void setDeterminant(double value) {
        this.determinant = value;
    }

}
