package fr.univrouen.stb23v1.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class GetController {
    @GetMapping("/resume")
    public String getListRSSinXML() {
        return "Envoi de la liste des STB";
    }
    @GetMapping("/stbid")
    public String getRSSinXML(
            @RequestParam(value = "id") String texte) {
        return ("Détail de la STB n°" + texte);
    }

    @GetMapping("/test")
    public String getTestinXML(
            @RequestParam(value = "id") Integer id,
            @RequestParam(value = "titre") String titre){
        return ("Test :\nid = " + id + "\ntitre = " + titre);
    }


}