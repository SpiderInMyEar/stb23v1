package fr.univrouen.stb23v1.model;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.util.FileCopyUtils;

import java.io.*;

import static java.nio.charset.StandardCharsets.UTF_8;

public class TestSTB {
    public String loadFileXML(){
        Resource resource = new DefaultResourceLoader().
        getResource("classpath:test0.xml");

        try (Reader reader = new InputStreamReader(resource.getInputStream(), UTF_8)) {
            return FileCopyUtils.copyToString(reader);
        } catch (Exception e) {
            return "An exception occured :"+e.toString();
        }
    }
}
