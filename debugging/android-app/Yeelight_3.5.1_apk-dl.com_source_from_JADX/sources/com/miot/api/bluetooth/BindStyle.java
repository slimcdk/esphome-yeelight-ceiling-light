package com.miot.api.bluetooth;

public enum BindStyle {
    UNKNOWN(0),
    STRONG(1),
    WEAK(2);
    
    public int style;

    private BindStyle(int i) {
        this.style = i;
    }
}
