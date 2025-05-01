
package com.matrix.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "calculateDeterminantResponse", namespace = "http://service.matrix.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculateDeterminantResponse", namespace = "http://service.matrix.com/")
public class CalculateDeterminantResponse {

    @XmlElement(name = "determinant", namespace = "")
    private double determinant;

    /**
     * 
     * @return
     *     returns double
     */
    public double getDeterminant() {
        return this.determinant;
    }

    /**
     * 
     * @param determinant
     *     the value for the determinant property
     */
    public void setDeterminant(double determinant) {
        this.determinant = determinant;
    }

}
