package com.yeelight.yeelib.device.xiaomi.base;

import com.p146mi.iot.common.error.IotError;

/* renamed from: com.yeelight.yeelib.device.xiaomi.base.a */
public interface C9763a<T> {
    void onFailed(IotError iotError);

    void onSucceed(T t);
}
