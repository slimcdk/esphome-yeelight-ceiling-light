package com.yeelight.yeelib.device.models;

import java.util.ArrayList;
import java.util.List;

public abstract class ProductModelBase {

    /* renamed from: a */
    public List<C6170a> f12701a = new ArrayList();

    /* renamed from: b */
    public String f12702b;

    public enum CapabilityType {
        BTN_POWER,
        BTN_COLOR,
        BTN_CT,
        BTN_NIGHT_LIGHT,
        BTN_FLOW,
        BTN_SCENE,
        BTN_CAMERA,
        CONTROL_COLOR_V,
        CONTROL_COLOR_H,
        CONTROL_CT_V,
        CONTROL_CT_H,
        CONTROL_FLOW_V,
        CONTROL_FLOW_H,
        SCENE_BRIGHT,
        SCENE_COLOR,
        SCENE_CT,
        SCENE_FLOW,
        SCENE_NL,
        CT_TAB,
        COLOR_TAB,
        MOON_TAB,
        MOON_WITH_CT_TAB,
        FLOW_TAB,
        CUSTOMIZED_TAB,
        BTN_MUTE,
        BTN_MUTE_MIC,
        CUSTOM_SCENE_BRIGHT,
        CUSTOM_SCENE_CT,
        CUSTOM_SCENE_COLOR,
        CUSTOM_SCENE_SUSPEND
    }

    /* renamed from: com.yeelight.yeelib.device.models.ProductModelBase$a */
    public class C6170a {

        /* renamed from: a */
        public CapabilityType f12703a;

        /* renamed from: b */
        public boolean f12704b = true;

        public C6170a(ProductModelBase productModelBase, CapabilityType capabilityType) {
            this.f12703a = capabilityType;
        }

        /* renamed from: a */
        public CapabilityType mo31882a() {
            return this.f12703a;
        }

        /* renamed from: b */
        public boolean mo31883b() {
            return this.f12704b;
        }
    }

    public ProductModelBase(String str) {
        this.f12702b = str;
    }

    /* renamed from: a */
    public String mo31880a() {
        return this.f12702b;
    }

    /* renamed from: b */
    public boolean mo31881b(CapabilityType capabilityType) {
        for (C6170a next : this.f12701a) {
            if (next.mo31882a() == capabilityType && next.mo31883b()) {
                return true;
            }
        }
        return false;
    }
}
