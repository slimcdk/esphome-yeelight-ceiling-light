package com.miot.service.common.miotcloud;

public interface HttpCallback<T> {
    void onFailed(int i, String str);

    void onSucceed(T t);
}
