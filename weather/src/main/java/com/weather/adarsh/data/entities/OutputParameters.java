package com.weather.adarsh.data.entities;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "cityZip" })
@XmlRootElement(name = "OutputParameters", namespace = "http://adarsh.weather.com")
public class OutputParameters {

    @XmlElement(required = true, namespace = "http://adrsh.waether..com")
    private int cityZip;

    public int getCityZip() {
        return this.cityZip;
    }

    public void setCityZip(int cityZip) {
        this.cityZip= cityZip;
    }

}