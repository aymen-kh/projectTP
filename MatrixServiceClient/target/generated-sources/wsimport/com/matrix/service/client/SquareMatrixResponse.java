
package com.matrix.service.client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for squareMatrixResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="squareMatrixResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="squaredMatrix" type="{http://service.matrix.com/}matrix" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "squareMatrixResponse", propOrder = {
    "squaredMatrix"
})
public class SquareMatrixResponse {

    protected Matrix squaredMatrix;

    /**
     * Gets the value of the squaredMatrix property.
     * 
     * @return
     *     possible object is
     *     {@link Matrix }
     *     
     */
    public Matrix getSquaredMatrix() {
        return squaredMatrix;
    }

    /**
     * Sets the value of the squaredMatrix property.
     * 
     * @param value
     *     allowed object is
     *     {@link Matrix }
     *     
     */
    public void setSquaredMatrix(Matrix value) {
        this.squaredMatrix = value;
    }

}
