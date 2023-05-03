package fr.univrouen.stb23v1.model;

import jakarta.xml.bind.annotation.*;

import java.io.Serializable;
import java.util.Date;

@XmlRootElement(name = "stb")
@XmlAccessorType(XmlAccessType.NONE)
public class STB implements Serializable {
    private static final long serialVersionUID = 1L;
    @XmlElement
    private String title;
    @XmlElement
    private Double version;
    @XmlElement
    private Date date;
    @XmlElement
    private String description;
    @XmlElement
    private Client client;

    public STB(Double ver, String title, Date date, String description,
               Client client) {
        super();
        this.version = ver;
        this.title = title;
        this.date = date;
        this.client = client;
    }
    public STB() {
    }
    @Override
    public String toString() {
        return "TEST";
    }
}