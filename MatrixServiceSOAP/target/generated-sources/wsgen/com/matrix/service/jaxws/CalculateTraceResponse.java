
package com.matrix.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "calculateTraceResponse", namespace = "http://service.matrix.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculateTraceResponse", namespace = "http://service.matrix.com/")
public class CalculateTraceResponse {

    @XmlElement(name = "trace", namespace = "")
    private double trace;

    /**
     * 
     * @return
     *     returns double
     */
    public double getTrace() {
        return this.trace;
    }

    /**
     * 
     * @param trace
     *     the value for the trace property
     */
    public void setTrace(double trace) {
        this.trace = trace;
    }

}
