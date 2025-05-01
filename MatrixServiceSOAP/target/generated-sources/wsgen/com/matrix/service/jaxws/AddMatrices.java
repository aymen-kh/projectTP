
package com.matrix.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.matrix.service.Matrix;

@XmlRootElement(name = "addMatrices", namespace = "http://service.matrix.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addMatrices", namespace = "http://service.matrix.com/", propOrder = {
    "matrixA",
    "matrixB"
})
public class AddMatrices {

    @XmlElement(name = "matrixA", namespace = "")
    private Matrix matrixA;
    @XmlElement(name = "matrixB", namespace = "")
    private Matrix matrixB;

    /**
     * 
     * @return
     *     returns Matrix
     */
    public Matrix getMatrixA() {
        return this.matrixA;
    }

    /**
     * 
     * @param matrixA
     *     the value for the matrixA property
     */
    public void setMatrixA(Matrix matrixA) {
        this.matrixA = matrixA;
    }

    /**
     * 
     * @return
     *     returns Matrix
     */
    public Matrix getMatrixB() {
        return this.matrixB;
    }

    /**
     * 
     * @param matrixB
     *     the value for the matrixB property
     */
    public void setMatrixB(Matrix matrixB) {
        this.matrixB = matrixB;
    }

}
