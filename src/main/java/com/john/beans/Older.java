package com.john.beans;

import org.springframework.context.annotation.Bean;

public class Older {
    private Sugar sugar;

    public Sugar getSugar() {
        return sugar;
    }

    public void setSugar(Sugar sugar) {
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        return "Older{" +
                "sugar=" + sugar +
                '}';
    }
}
