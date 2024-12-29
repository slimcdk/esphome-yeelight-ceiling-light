package com.yeelight.yeelib.device.xiaomi.base;

import com.p022mi.iot.common.error.IotError;

/* renamed from: com.yeelight.yeelib.device.xiaomi.base.a */
public interface C8251a<T> {
    void onFailed(IotError iotError);

    void onSucceed(T t);
}
