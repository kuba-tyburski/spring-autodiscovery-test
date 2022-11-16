package org.example.client.impl.transformers;

import org.example.client.api.Transformer;

import java.util.logging.Logger;

public class LongSubtractTransformer implements Transformer<Long, Long> {
    private Logger log = Logger.getLogger(LongSubtractTransformer.class.getName());

    @Override
    public Long transform(Long in) {
        long out = in - 2;
        log.info("input: " + in);
        log.info("output: " + out);
        return out;
    }
}
