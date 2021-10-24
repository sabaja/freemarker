package com.json.service;

import freemarker.template.Configuration;
import freemarker.template.Template;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;

@Component
public class FreemarkerService {

    private static final String DATE = "date";
    @Autowired

    @Qualifier("freemarkerDefaultConfiguration")
    private Configuration freemarkerDefaultConfiguration;


    public String getTemplate() throws Exception {
        final Template template = freemarkerDefaultConfiguration.getTemplate(DATE + ".ftlh");
        try (FileOutputStream output = new FileOutputStream(new File("src/main/resources/templates/out/" + DATE.concat(".html")))) {
            template.process(null, new OutputStreamWriter(output));
//            return Files.readString(output.g)
        }
        return Strings.EMPTY;
    }
}
