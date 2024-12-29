package com.miot.api;

public interface CompletionHandler {
    void onFailed(int i, String str);

    void onSucceed();
}
