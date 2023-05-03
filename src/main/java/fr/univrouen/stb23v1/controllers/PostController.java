package fr.univrouen.stb23v1.controllers;
import fr.univrouen.stb23v1.model.Client;
import fr.univrouen.stb23v1.model.Person;
import fr.univrouen.stb23v1.model.STB;
import fr.univrouen.stb23v1.model.TestSTB;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

@RestController
public class PostController {
    @RequestMapping(value = "/testpost", method = RequestMethod.POST,
            consumes = "application/xml")
    public String postTest(@RequestBody String flux) {
        return ("<result><response>Message reçu : </response>"
        + flux + "</result>");
    }

    @PostMapping(value = "/poststb", produces = MediaType.APPLICATION_XML_VALUE)
    @ResponseBody
    public String postSTB() {
        TestSTB stb = new TestSTB();
        return stb.loadFileXML();
    }

    @RequestMapping(value = "/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public @ResponseBody STB getXML() {
        ArrayList<String> tels = new ArrayList<>();
        tels.add("000101245");
        STB stb = new STB(0.1, "TestSTB", Date.valueOf(LocalDate.now()), "Test of an stb",
                new Client("TestEntity",
                        new Person("Mr", "Miller", "Martin"),
                        new ArrayList<>(), tels
                        ));
        return stb;
    }
}
