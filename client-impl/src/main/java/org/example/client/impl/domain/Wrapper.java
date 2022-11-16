package org.example.client.impl.domain;

import java.util.Objects;

public class Wrapper {
    private final String id;
    private final Long value;

    public Wrapper(String id, Long value) {
        this.id = id;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public Long getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wrapper wrapper = (Wrapper) o;
        return Objects.equals(id, wrapper.id) && Objects.equals(value, wrapper.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, value);
    }

    @Override
    public String toString() {
        return "Wrapper{" +
                "id='" + id + '\'' +
                ", value=" + value +
                '}';
    }
}
