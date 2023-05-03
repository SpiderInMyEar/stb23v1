package fr.univrouen.stb23v1.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.NONE)
public class Person {
    @XmlAttribute
    private String gender;
    @XmlAttribute(required = true)
    private String lastname;
    @XmlValue
    private String value;

    public Person(String gender, String lastname, String value){
        this(lastname, value);
        this.gender = gender;
    }
    public Person(String lastname, String value){
        this.lastname =lastname;
        this.value = value;
    }

}
