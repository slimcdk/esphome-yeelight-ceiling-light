package com.yeelight.yeelib.device.models;

import com.yeelight.yeelib.device.models.ProductModelBase;

/* renamed from: com.yeelight.yeelib.device.models.h */
public class C6179h extends ProductModelBase {
    public C6179h(String str) {
        super(str);
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.BTN_POWER));
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.BTN_CT));
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.BTN_SCENE));
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.BTN_NIGHT_LIGHT));
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.CONTROL_CT_V));
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.CONTROL_CT_H));
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.SCENE_BRIGHT));
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.SCENE_CT));
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.SCENE_NL));
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.CT_TAB));
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.MOON_TAB));
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.CUSTOM_SCENE_BRIGHT));
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.CUSTOM_SCENE_CT));
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.CUSTOM_SCENE_SUSPEND));
    }
}
