package com.p146mi.iot.common.handler;

import com.p146mi.iot.common.error.IotError;

/* renamed from: com.mi.iot.common.handler.CommonHandler */
public interface CommonHandler<T> {
    void onFailed(IotError iotError);

    void onSucceed(T t);
}
