package fr.univrouen.stb23v1.model;

import jakarta.xml.bind.annotation.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

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
    @XmlElement
    private Team team;
    @XmlElementWrapper(name="features")
    @XmlElements({
            @XmlElement(name = "feature")
    })
    private List<Feature> features;

    public STB(Double ver, String title, Date date, String description,
               Client client, Team team, List<Feature> feats) {
        super();
        this.version = ver;
        this.title = title;
        this.date = date;
        this.client = client;
        this.team = team;
        features = feats;
    }
    public STB() {
    }
    @Override
    public String toString() {
        return "TEST";
    }
}