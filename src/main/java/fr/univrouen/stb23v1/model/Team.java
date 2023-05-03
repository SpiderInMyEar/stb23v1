package fr.univrouen.stb23v1.model;


import jakarta.xml.bind.annotation.*;

import java.util.List;


@XmlAccessorType(XmlAccessType.NONE)
public class Team {
    @XmlElements({
         @XmlElement(name = "member")
    })
    private List<Member> members;

    public Team(List<Member> mem){
        members = mem;
    }
}
