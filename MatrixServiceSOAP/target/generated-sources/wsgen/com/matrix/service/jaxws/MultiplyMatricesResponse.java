
package com.matrix.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.matrix.service.Matrix;

@XmlRootElement(name = "multiplyMatricesResponse", namespace = "http://service.matrix.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "multiplyMatricesResponse", namespace = "http://service.matrix.com/")
public class MultiplyMatricesResponse {

    @XmlElement(name = "resultMatrix", namespace = "")
    private Matrix resultMatrix;

    /**
     * 
     * @return
     *     returns Matrix
     */
    public Matrix getResultMatrix() {
        return this.resultMatrix;
    }

    /**
     * 
     * @param resultMatrix
     *     the value for the resultMatrix property
     */
    public void setResultMatrix(Matrix resultMatrix) {
        this.resultMatrix = resultMatrix;
    }

}
