package com.yeelight.yeelib.device.models;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yeelight.yeelib.device.models.j */
public abstract class C7628j {

    /* renamed from: a */
    public List<C7629a> f15586a = new ArrayList();

    /* renamed from: b */
    public String f15587b;

    /* renamed from: com.yeelight.yeelib.device.models.j$a */
    public class C7629a {

        /* renamed from: a */
        public C7630b f15588a;

        /* renamed from: b */
        public boolean f15589b = true;

        public C7629a(C7628j jVar, C7630b bVar) {
            this.f15588a = bVar;
        }

        /* renamed from: a */
        public C7630b mo29077a() {
            return this.f15588a;
        }

        /* renamed from: b */
        public boolean mo29078b() {
            return this.f15589b;
        }
    }

    /* renamed from: com.yeelight.yeelib.device.models.j$b */
    public enum C7630b {
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
        FLOW_TAB,
        CUSTOMIZED_TAB,
        BTN_MUTE,
        BTN_MUTE_MIC,
        CUSTOM_SCENE_BRIGHT,
        CUSTOM_SCENE_CT,
        CUSTOM_SCENE_COLOR,
        CUSTOM_SCENE_SUSPEND
    }

    public C7628j(String str) {
        this.f15587b = str;
    }

    /* renamed from: a */
    public String mo29075a() {
        return this.f15587b;
    }

    /* renamed from: b */
    public boolean mo29076b(C7630b bVar) {
        for (C7629a next : this.f15586a) {
            if (next.mo29077a() == bVar && next.mo29078b()) {
                return true;
            }
        }
        return false;
    }
}
