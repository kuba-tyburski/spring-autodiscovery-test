package org.example.factory;

import org.example.client.api.Transformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class TransformerFactory {
    private Logger log = Logger.getLogger(TransformerFactory.class.getName());

    private List<Transformer> transformerList;

    @Autowired
    public TransformerFactory(List<Transformer> transformerList) {
        this.transformerList = transformerList;
        log.info("transformerList: " + transformerList);
    }

    public Object chainTransform(Object input) {
        Object mutableInput = input;
        for (Transformer transformer : transformerList) {
            mutableInput = transformer.transform(mutableInput);
        }

        return mutableInput;
    }
}
