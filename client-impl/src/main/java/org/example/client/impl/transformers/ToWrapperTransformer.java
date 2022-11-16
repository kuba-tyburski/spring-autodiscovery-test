package org.example.client.impl.transformers;

import org.example.client.api.Transformer;
import org.example.client.impl.domain.Wrapper;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.UUID;
import java.util.logging.Logger;

@Component
@Order(value=5)
public class ToWrapperTransformer implements Transformer<Long, Wrapper> {
    private Logger log = Logger.getLogger(ToWrapperTransformer.class.getName());

    @Override
    public Wrapper transform(Long in) {
        Wrapper out = new Wrapper(UUID.randomUUID().toString(), in);
        log.info("input: " + in);
        log.info("output: " + out);
        return out;
    }
}
