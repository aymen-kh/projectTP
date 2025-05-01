
package com.matrix.service.client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transposeMatrixResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transposeMatrixResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transposedMatrix" type="{http://service.matrix.com/}matrix" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transposeMatrixResponse", propOrder = {
    "transposedMatrix"
})
public class TransposeMatrixResponse {

    protected Matrix transposedMatrix;

    /**
     * Gets the value of the transposedMatrix property.
     * 
     * @return
     *     possible object is
     *     {@link Matrix }
     *     
     */
    public Matrix getTransposedMatrix() {
        return transposedMatrix;
    }

    /**
     * Sets the value of the transposedMatrix property.
     * 
     * @param value
     *     allowed object is
     *     {@link Matrix }
     *     
     */
    public void setTransposedMatrix(Matrix value) {
        this.transposedMatrix = value;
    }

}
