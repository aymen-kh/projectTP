
package com.matrix.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.matrix.service.Matrix;

@XmlRootElement(name = "multiplyByScalar", namespace = "http://service.matrix.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "multiplyByScalar", namespace = "http://service.matrix.com/", propOrder = {
    "matrix",
    "scalar"
})
public class MultiplyByScalar {

    @XmlElement(name = "matrix", namespace = "")
    private Matrix matrix;
    @XmlElement(name = "scalar", namespace = "")
    private double scalar;

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

    /**
     * 
     * @return
     *     returns double
     */
    public double getScalar() {
        return this.scalar;
    }

    /**
     * 
     * @param scalar
     *     the value for the scalar property
     */
    public void setScalar(double scalar) {
        this.scalar = scalar;
    }

}
