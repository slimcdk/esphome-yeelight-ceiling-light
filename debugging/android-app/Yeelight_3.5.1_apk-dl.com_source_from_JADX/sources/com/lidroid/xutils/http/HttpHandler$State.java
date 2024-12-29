package com.lidroid.xutils.http;

public enum HttpHandler$State {
    WAITING(0),
    STARTED(1),
    LOADING(2),
    FAILURE(3),
    CANCELLED(4),
    SUCCESS(5);
    
    private int value;

    private HttpHandler$State(int i) {
        this.value = 0;
        this.value = i;
    }

    public static HttpHandler$State valueOf(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? FAILURE : SUCCESS : CANCELLED : FAILURE : LOADING : STARTED : WAITING;
    }

    public int value() {
        return this.value;
    }
}
