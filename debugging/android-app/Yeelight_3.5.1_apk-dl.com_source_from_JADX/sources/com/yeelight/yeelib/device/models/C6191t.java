package com.yeelight.yeelib.device.models;

import com.yeelight.yeelib.device.models.ProductModelBase;

/* renamed from: com.yeelight.yeelib.device.models.t */
public class C6191t extends ProductModelBase {
    public C6191t(String str, boolean z) {
        super(str);
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.BTN_POWER));
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.BTN_COLOR));
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.BTN_SCENE));
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.BTN_CAMERA));
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.CONTROL_COLOR_V));
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.CONTROL_COLOR_H));
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.SCENE_BRIGHT));
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.SCENE_COLOR));
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.COLOR_TAB));
    }
}
