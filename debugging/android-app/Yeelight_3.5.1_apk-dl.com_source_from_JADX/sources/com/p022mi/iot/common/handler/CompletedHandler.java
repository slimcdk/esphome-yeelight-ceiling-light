package com.p022mi.iot.common.handler;

import com.p022mi.iot.common.error.IotError;

/* renamed from: com.mi.iot.common.handler.CompletedHandler */
public interface CompletedHandler {
    void onFailed(IotError iotError);

    void onSucceed();
}
