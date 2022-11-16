package org.example.client.impl.transformers;

import org.example.client.api.Transformer;

import java.util.logging.Logger;

public class ToLongTransformer implements Transformer<String, Long> {
    private Logger log = Logger.getLogger(ToLongTransformer.class.getName());

    @Override
    public Long transform(String in) {
        long out = Long.parseLong(in.replaceAll("[^0-9]+", ""));
        log.info("input: " + in);
        log.info("output: " + out);
        return out;
    }
}
