package com.json.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;
import java.io.IOException;
import java.util.Locale;

@Configuration
public class FreemarkerConfiguration {

    public static final String RESOURCES_TEMPLATES = "src/main/resources/templates";

    @Bean("freemarkerDefaultConfiguration")
    public freemarker.template.Configuration freemarkerDefaultConfiguration() throws IOException {
        freemarker.template.Configuration myCfg = new freemarker.template.Configuration(freemarker.template.Configuration.VERSION_2_3_31);
        myCfg.setDirectoryForTemplateLoading(new File(RESOURCES_TEMPLATES));
        Locale locale = new Locale(Locale.ITALIAN.getLanguage());
        myCfg.setLocale(locale);
        return myCfg;
    }
}
