
package com.matrix.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.matrix.service.Matrix;

@XmlRootElement(name = "invertMatrixResponse", namespace = "http://service.matrix.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "invertMatrixResponse", namespace = "http://service.matrix.com/")
public class InvertMatrixResponse {

    @XmlElement(name = "inverseMatrix", namespace = "")
    private Matrix inverseMatrix;

    /**
     * 
     * @return
     *     returns Matrix
     */
    public Matrix getInverseMatrix() {
        return this.inverseMatrix;
    }

    /**
     * 
     * @param inverseMatrix
     *     the value for the inverseMatrix property
     */
    public void setInverseMatrix(Matrix inverseMatrix) {
        this.inverseMatrix = inverseMatrix;
    }

}
