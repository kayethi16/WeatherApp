package com.weather.adarsh.data.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cityZip", propOrder = { "cityZip" })
@XmlRootElement(name = "InputParameters", namespace = "http://www.adarsh.waether.com")
public class InputParameters {

    @XmlElement(required = true, namespace = "http://www.adarsh.weather.com")
    private int cityZip;

    public int getCityZipE() {
        return cityZip;
    }

    public void setCityZip(int zip) {
        this.cityZip = zip;
    }

}