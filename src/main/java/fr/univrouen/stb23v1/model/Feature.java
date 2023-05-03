package fr.univrouen.stb23v1.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;

import java.util.Date;

@XmlAccessorType(XmlAccessType.NONE)

public class Feature {
    @XmlAttribute(required = true)
    private String name;
    @XmlAttribute(required = true)
    private Integer section;
    @XmlAttribute(required = true)
    private Integer number;

    @XmlElement
    private String description;
    @XmlElement
    private Integer priority;
    @XmlElement
    private Date delivery;
    @XmlElement
    private String comment;

    public Feature(String description, Integer priority){
        this.description = description;
        this.priority = priority;
    }

    public Feature(String description, Integer priority,
                   Date delivery, String com){
        this(description, priority);
        this.comment = com;
        this.delivery = delivery;
    }

}
