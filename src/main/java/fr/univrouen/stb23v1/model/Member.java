package fr.univrouen.stb23v1.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;

import java.util.List;

@XmlAccessorType(XmlAccessType.NONE)
public class Member {
    @XmlElement
    private Person person;
    @XmlElement
    private String mail;

    @XmlElements({
            @XmlElement(name = "function")
    })
    private List<String> functions;

    public Member(Person p, String m, List<String> functions){
        this.functions = functions;
        mail = m;
        person = p;
    }
}
