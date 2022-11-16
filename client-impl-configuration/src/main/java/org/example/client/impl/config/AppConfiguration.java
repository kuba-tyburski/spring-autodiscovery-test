package org.example.client.impl.config;

import org.example.client.api.Transformer;
import org.example.client.impl.transformers.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.logging.Logger;

@Configuration
public class AppConfiguration {
    private Logger log = Logger.getLogger(AppConfiguration.class.getName());

    @Bean
    public List<Transformer> test() {
        LongMultiplyTransformer longMultiplyTransformer = new LongMultiplyTransformer();
        LongSubtractTransformer longSubtractTransformer = new LongSubtractTransformer();
        ToLongTransformer toLongTransformer = new ToLongTransformer();
        ToUpperStrTransformer toUpperStrTransformer = new ToUpperStrTransformer();
        ToWrapperTransformer toWrapperTransformer = new ToWrapperTransformer();

        List<Transformer> transformerList = List.of(
                toUpperStrTransformer,
                toLongTransformer,
                longMultiplyTransformer,
                longSubtractTransformer,
                toWrapperTransformer
        );

        log.info("transformerList: " + transformerList);
        return transformerList;
    }
}
