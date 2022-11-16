package org.example.client.impl.transformers;

import org.example.client.api.Transformer;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Order(value=3)
public class LongMultiplyTransformer implements Transformer<Long, Long> {
    private Logger log = Logger.getLogger(LongMultiplyTransformer.class.getName());

    @Override
    public Long transform(Long in) {
        long out = in * 2;
        log.info("input: " + in);
        log.info("output: " + out);
        return out;
    }
}
