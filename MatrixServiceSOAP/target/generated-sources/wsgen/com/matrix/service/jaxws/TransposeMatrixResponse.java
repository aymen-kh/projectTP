
package com.matrix.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.matrix.service.Matrix;

@XmlRootElement(name = "transposeMatrixResponse", namespace = "http://service.matrix.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transposeMatrixResponse", namespace = "http://service.matrix.com/")
public class TransposeMatrixResponse {

    @XmlElement(name = "transposedMatrix", namespace = "")
    private Matrix transposedMatrix;

    /**
     * 
     * @return
     *     returns Matrix
     */
    public Matrix getTransposedMatrix() {
        return this.transposedMatrix;
    }

    /**
     * 
     * @param transposedMatrix
     *     the value for the transposedMatrix property
     */
    public void setTransposedMatrix(Matrix transposedMatrix) {
        this.transposedMatrix = transposedMatrix;
    }

}
