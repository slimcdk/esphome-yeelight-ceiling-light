package com.lidroid.xutils.http.client;

public enum HttpRequest$HttpMethod {
    GET("GET"),
    POST("POST"),
    PUT("PUT"),
    HEAD("HEAD"),
    MOVE("MOVE"),
    COPY("COPY"),
    DELETE("DELETE"),
    OPTIONS("OPTIONS"),
    TRACE("TRACE"),
    CONNECT("CONNECT");
    
    private final String value;

    private HttpRequest$HttpMethod(String str) {
        this.value = str;
    }

    public String toString() {
        return this.value;
    }
}
