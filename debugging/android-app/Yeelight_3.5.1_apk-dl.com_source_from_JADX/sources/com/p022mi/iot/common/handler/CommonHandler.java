package com.p022mi.iot.common.handler;

import com.p022mi.iot.common.error.IotError;

/* renamed from: com.mi.iot.common.handler.CommonHandler */
public interface CommonHandler<T> {
    void onFailed(IotError iotError);

    void onSucceed(T t);
}
