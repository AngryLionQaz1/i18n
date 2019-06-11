package com.snow.i18n;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableSwagger2Doc
@SpringBootApplication
public class I18nApplication {

    public static void main(String[] args) {
        SpringApplication.run(I18nApplication.class, args);
    }

}
