
package com.service.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.service.ws.Libro;

@XmlRootElement(name = "getLibroByIdResponse", namespace = "http://ws.service.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLibroByIdResponse", namespace = "http://ws.service.com/")
public class GetLibroByIdResponse {

    @XmlElement(name = "return", namespace = "")
    private Libro _return;

    /**
     * 
     * @return
     *     returns Libro
     */
    public Libro getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(Libro _return) {
        this._return = _return;
    }

}
