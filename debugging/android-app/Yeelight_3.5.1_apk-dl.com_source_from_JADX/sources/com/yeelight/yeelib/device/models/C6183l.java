package com.yeelight.yeelib.device.models;

import com.yeelight.yeelib.device.models.ProductModelBase;

/* renamed from: com.yeelight.yeelib.device.models.l */
public class C6183l extends ProductModelBase {
    public C6183l(String str) {
        this(str, false);
    }

    public C6183l(String str, boolean z) {
        super(str);
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.BTN_POWER));
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.BTN_CT));
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.BTN_SCENE));
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.CONTROL_CT_V));
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.CONTROL_CT_H));
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.SCENE_BRIGHT));
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.SCENE_CT));
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.CT_TAB));
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.CUSTOM_SCENE_BRIGHT));
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.CUSTOM_SCENE_CT));
        this.f12701a.add(new ProductModelBase.C6170a(this, ProductModelBase.CapabilityType.CUSTOM_SCENE_SUSPEND));
    }
}
