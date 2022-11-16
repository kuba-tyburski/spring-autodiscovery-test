package org.example;

import org.example.factory.TransformerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Core {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Core.class, args);
        TransformerFactory transformerFactory = context.getBean(TransformerFactory.class);
        transformerFactory.chainTransform("bl qw 1234124 las df1124zxc1");
    }
}
