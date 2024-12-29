package com.squareup.haha.guava.base;

public abstract class Ticker {
    static {
        new Ticker() {
            public final long read() {
                return System.nanoTime();
            }
        };
    }

    protected Ticker() {
    }

    public abstract long read();
}
