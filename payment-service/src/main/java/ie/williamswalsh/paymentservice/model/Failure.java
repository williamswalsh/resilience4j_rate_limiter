package ie.williamswalsh.paymentservice.model;

import java.util.Objects;

public record Failure(String msg) implements Type {
    public Failure {
        Objects.requireNonNull(msg);
    }
}
