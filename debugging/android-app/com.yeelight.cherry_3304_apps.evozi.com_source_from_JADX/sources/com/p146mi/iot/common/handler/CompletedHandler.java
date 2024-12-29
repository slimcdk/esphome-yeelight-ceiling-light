package com.p146mi.iot.common.handler;

import com.p146mi.iot.common.error.IotError;

/* renamed from: com.mi.iot.common.handler.CompletedHandler */
public interface CompletedHandler {
    void onFailed(IotError iotError);

    void onSucceed();
}
