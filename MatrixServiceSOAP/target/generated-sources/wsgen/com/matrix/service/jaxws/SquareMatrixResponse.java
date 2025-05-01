
package com.matrix.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.matrix.service.Matrix;

@XmlRootElement(name = "squareMatrixResponse", namespace = "http://service.matrix.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "squareMatrixResponse", namespace = "http://service.matrix.com/")
public class SquareMatrixResponse {

    @XmlElement(name = "squaredMatrix", namespace = "")
    private Matrix squaredMatrix;

    /**
     * 
     * @return
     *     returns Matrix
     */
    public Matrix getSquaredMatrix() {
        return this.squaredMatrix;
    }

    /**
     * 
     * @param squaredMatrix
     *     the value for the squaredMatrix property
     */
    public void setSquaredMatrix(Matrix squaredMatrix) {
        this.squaredMatrix = squaredMatrix;
    }

}
