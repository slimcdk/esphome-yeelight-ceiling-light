package com.miot.api;

public interface CommonHandler<T> {
    void onFailed(int i, String str);

    void onSucceed(T t);
}
