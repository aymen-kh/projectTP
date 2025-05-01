
package com.matrix.service.client;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for matrix complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="matrix"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cols" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="data" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="rows" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "matrix", propOrder = {
    "cols",
    "data",
    "rows"
})
public class Matrix {

    protected int cols;
    @XmlElement(nillable = true)
    protected List<DoubleArray> data;
    protected int rows;

    /**
     * Gets the value of the cols property.
     * 
     */
    public int getCols() {
        return cols;
    }

    /**
     * Sets the value of the cols property.
     * 
     */
    public void setCols(int value) {
        this.cols = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the data property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getData() {
        if (data == null) {
            data = new ArrayList<DoubleArray>();
        }
        return this.data;
    }

    /**
     * Gets the value of the rows property.
     * 
     */
    public int getRows() {
        return rows;
    }

    /**
     * Sets the value of the rows property.
     * 
     */
    public void setRows(int value) {
        this.rows = value;
    }

}
