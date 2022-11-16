package org.example.client.impl.transformers;

import org.example.client.api.Transformer;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Locale;
import java.util.logging.Logger;

@Component
@Order(value=1)
public class ToUpperStrTransformer implements Transformer<String, String> {
    private Logger log = Logger.getLogger(ToUpperStrTransformer.class.getName());

    @Override
    public String transform(String in) {
        String out = in.toUpperCase(Locale.ROOT);
        log.info("input: " + in);
        log.info("output: " + out);
        return out;
    }
}
