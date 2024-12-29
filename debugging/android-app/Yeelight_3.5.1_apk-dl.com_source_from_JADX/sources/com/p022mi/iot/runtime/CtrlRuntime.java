package com.p022mi.iot.runtime;

import android.content.Context;
import com.p022mi.iot.common.handler.CommonHandler;
import com.p022mi.iot.common.handler.CompletedHandler;
import com.p022mi.iot.common.handler.WritePropertyHandler;
import com.p022mi.iot.common.instance.Action;
import com.p022mi.iot.common.instance.Device;
import com.p022mi.iot.common.instance.Property;
import java.util.List;

/* renamed from: com.mi.iot.runtime.CtrlRuntime */
public interface CtrlRuntime {
    void destroy();

    void getDeviceList(CommonHandler<List<Device>> commonHandler, int i);

    void getProperties(Device device, List<Property> list, CommonHandler<List<Property>> commonHandler, int i);

    void init(Context context);

    void invokeAction(Action action, CommonHandler<Action> commonHandler, int i);

    void pairing(Device device, String str, CompletedHandler completedHandler);

    void setProperties(Device device, List<Property> list, WritePropertyHandler writePropertyHandler, int i);

    void start();

    void stop();

    void subscribe(Device device, List<Property> list, CommonHandler<List<Property>> commonHandler, int i);

    void unSubscribe(Device device, List<Property> list, CommonHandler<List<Property>> commonHandler, int i);
}
