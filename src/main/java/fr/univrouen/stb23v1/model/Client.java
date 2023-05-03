package fr.univrouen.stb23v1.model;

import jakarta.xml.bind.annotation.*;

import java.util.List;

@XmlAccessorType(XmlAccessType.NONE)
public class Client {
    @XmlElement
    private String entity;

    @XmlElement
    private Person person;

    @XmlElements({
            @XmlElement(name="mail")
    })
    private List<String> mails;

    @XmlElements({
            @XmlElement(name="tel")
    })
    private List<String> tels;

    public Client(String entity, Person person,
                  List<String> mails, List<String> tels){
        this.entity = entity;
        this.mails = mails;
        this.tels =tels;
        this.person = person;
    }
}
