package com.p022mi.iot.common.handler;

import com.p022mi.iot.common.error.IotError;
import com.p022mi.iot.common.instance.Property;
import java.util.List;

/* renamed from: com.mi.iot.common.handler.ModifyPropertyHandler */
public interface ModifyPropertyHandler {
    void onFail(IotError iotError);

    void onModifyFail(List<Property> list);

    void onModifySuccess(List<Property> list);
}
