package org.example.client.api;

public interface Transformer<A,B> {
    B transform(A a);
}
