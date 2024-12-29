package com.miot.api.bluetooth.response;

public interface BleResponse<T> {
    void onResponse(int i, T t);
}
