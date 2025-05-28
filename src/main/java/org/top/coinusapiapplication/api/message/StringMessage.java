package org.top.coinusapiapplication.api.message;

import java.io.Serializable;

public class StringMessage implements OutputMessage {
    private final String message;

    public StringMessage(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return message;
    }
}
