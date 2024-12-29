package com.p022mi.iot.common.handler;

import com.p022mi.iot.common.error.IotError;
import com.p022mi.iot.runtime.wan.http.bean.PropertyBeen;

/* renamed from: com.mi.iot.common.handler.WritePropertyHandler */
public interface WritePropertyHandler {
    void onFailed(IotError iotError);

    void onSucceed(PropertyBeen propertyBeen);
}
