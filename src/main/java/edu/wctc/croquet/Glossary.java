package edu.wctc.croquet;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.nio.file.Paths;


public class Glossary {
//    private GlossaryTerm[] glossaryArr;
//
//    public GlossaryTerm[] getGlossary() {
//        return glossaryArr;
//    }
//
//    @PostConstruct
//    public void initGlossary() {
//        ObjectMapper mapper = new ObjectMapper();
//        try {
//            glossaryArr = mapper.readValue(Paths.get("croquetGlossary.json").toFile(), GlossaryTerm[].class);
//        } catch (IOException e) {
//            e.printStackTrace();
//            glossaryArr= new GlossaryTerm[0];
//        }
//    }
}
