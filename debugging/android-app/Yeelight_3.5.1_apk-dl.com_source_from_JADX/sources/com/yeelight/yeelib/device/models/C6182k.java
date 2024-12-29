package com.yeelight.yeelib.device.models;

import com.yeelight.yeelib.device.models.ProductModelBase;

/* renamed from: com.yeelight.yeelib.device.models.k */
public class C6182k extends ProductModelBase {
    public C6182k(String str, boolean z) {
        super(str);
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.BTN_POWER));
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.BTN_COLOR));
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.BTN_FLOW));
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.BTN_SCENE));
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.BTN_CAMERA));
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.CONTROL_COLOR_V));
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.CONTROL_COLOR_H));
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.CONTROL_FLOW_V));
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.CONTROL_FLOW_H));
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.SCENE_BRIGHT));
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.SCENE_COLOR));
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.SCENE_FLOW));
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.COLOR_TAB));
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.FLOW_TAB));
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.CUSTOM_SCENE_BRIGHT));
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.CUSTOM_SCENE_COLOR));
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.CUSTOM_SCENE_SUSPEND));
    }
}
