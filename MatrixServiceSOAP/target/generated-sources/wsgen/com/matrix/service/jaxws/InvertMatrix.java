
package com.matrix.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.matrix.service.Matrix;

@XmlRootElement(name = "invertMatrix", namespace = "http://service.matrix.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "invertMatrix", namespace = "http://service.matrix.com/")
public class InvertMatrix {

    @XmlElement(name = "matrix", namespace = "")
    private Matrix matrix;

    /**
     * 
     * @return
     *     returns Matrix
     */
    public Matrix getMatrix() {
        return this.matrix;
    }

    /**
     * 
     * @param matrix
     *     the value for the matrix property
     */
    public void setMatrix(Matrix matrix) {
        this.matrix = matrix;
    }

}
