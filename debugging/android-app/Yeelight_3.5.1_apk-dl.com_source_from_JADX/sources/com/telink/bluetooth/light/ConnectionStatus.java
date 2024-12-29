package com.telink.bluetooth.light;

public enum ConnectionStatus {
    OFF(0),
    ON(1),
    OFFLINE(2);
    
    private final int value;

    private ConnectionStatus(int i) {
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }
}
