
package com.service.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.service.ws.Libro;

@XmlRootElement(name = "addLibro", namespace = "http://ws.service.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addLibro", namespace = "http://ws.service.com/")
public class AddLibro {

    @XmlElement(name = "arg0", namespace = "")
    private Libro arg0;

    /**
     * 
     * @return
     *     returns Libro
     */
    public Libro getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(Libro arg0) {
        this.arg0 = arg0;
    }

}
