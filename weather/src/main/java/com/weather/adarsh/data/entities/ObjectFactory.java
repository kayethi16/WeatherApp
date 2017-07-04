package com.weather.adarsh.data.entities;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

    public ObjectFactory() {
    }

    public InputParameters createYourRequest() {
        return new InputParameters();
    }

    public OutputParameters createYourResponse() {
        return new OutputParameters();
    }

}
