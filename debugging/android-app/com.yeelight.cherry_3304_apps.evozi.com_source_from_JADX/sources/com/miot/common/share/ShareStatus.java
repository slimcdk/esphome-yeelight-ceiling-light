package com.miot.common.share;

public enum ShareStatus {
    pending(0),
    accept(1),
    reject(2);
    
    final int mCode;

    private ShareStatus(int i) {
        this.mCode = i;
    }

    public int getCode() {
        return this.mCode;
    }
}
