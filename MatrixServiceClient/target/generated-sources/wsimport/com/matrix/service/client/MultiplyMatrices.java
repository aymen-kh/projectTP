
package com.matrix.service.client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for multiplyMatrices complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="multiplyMatrices"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="matrixA" type="{http://service.matrix.com/}matrix" minOccurs="0"/&gt;
 *         &lt;element name="matrixB" type="{http://service.matrix.com/}matrix" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "multiplyMatrices", propOrder = {
    "matrixA",
    "matrixB"
})
public class MultiplyMatrices {

    protected Matrix matrixA;
    protected Matrix matrixB;

    /**
     * Gets the value of the matrixA property.
     * 
     * @return
     *     possible object is
     *     {@link Matrix }
     *     
     */
    public Matrix getMatrixA() {
        return matrixA;
    }

    /**
     * Sets the value of the matrixA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Matrix }
     *     
     */
    public void setMatrixA(Matrix value) {
        this.matrixA = value;
    }

    /**
     * Gets the value of the matrixB property.
     * 
     * @return
     *     possible object is
     *     {@link Matrix }
     *     
     */
    public Matrix getMatrixB() {
        return matrixB;
    }

    /**
     * Sets the value of the matrixB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Matrix }
     *     
     */
    public void setMatrixB(Matrix value) {
        this.matrixB = value;
    }

}
