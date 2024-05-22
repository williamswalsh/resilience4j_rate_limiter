package ie.williamswalsh.paymentservice.model;

import lombok.Data;

import java.util.Objects;

public record Success(String msg) implements Type {
    public Success {
        Objects.requireNonNull(msg);
    }
}
