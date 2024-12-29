package com.p022mi.iot.runtime;

import com.p022mi.iot.common.instance.DiscoveryType;

/* renamed from: com.mi.iot.runtime.CtrlRuntimeClass */
public class CtrlRuntimeClass {
    private Class<?> clazz;
    private DiscoveryType type;

    public CtrlRuntimeClass(DiscoveryType discoveryType, Class<?> cls) {
        this.type = discoveryType;
        this.clazz = cls;
    }

    public Class<?> getClazz() {
        return this.clazz;
    }

    public DiscoveryType getType() {
        return this.type;
    }
}
