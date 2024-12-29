package com.yeelight.yeelib.device.models;

import com.yeelight.yeelib.device.models.ProductModelBase;

/* renamed from: com.yeelight.yeelib.device.models.v */
public class C6193v extends ProductModelBase {
    public C6193v(String str) {
        super(str);
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.BTN_POWER));
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.CUSTOM_SCENE_BRIGHT));
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.CUSTOM_SCENE_SUSPEND));
    }
}
