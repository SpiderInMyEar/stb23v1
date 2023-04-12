package fr.univrouen.stb23v1.controllers;
import fr.univrouen.stb23v1.model.STB;
import fr.univrouen.stb23v1.model.TestSTB;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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
        STB stb = new STB(123,"Test STB","2023-04-01T14:22:33");
        return stb;
    }
}
