package com.yeelight.yeelib.device.models;

import com.yeelight.yeelib.device.models.C7628j;

/* renamed from: com.yeelight.yeelib.device.models.v */
public class C7648v extends C7628j {
    public C7648v(String str) {
        this(str, false);
    }

    public C7648v(String str, boolean z) {
        super(str);
        this.f15586a.add(new C7628j.C7629a(this, C7628j.C7630b.BTN_POWER));
        this.f15586a.add(new C7628j.C7629a(this, C7628j.C7630b.BTN_CT));
        this.f15586a.add(new C7628j.C7629a(this, C7628j.C7630b.BTN_SCENE));
        this.f15586a.add(new C7628j.C7629a(this, C7628j.C7630b.CONTROL_CT_V));
        this.f15586a.add(new C7628j.C7629a(this, C7628j.C7630b.CONTROL_CT_H));
        this.f15586a.add(new C7628j.C7629a(this, C7628j.C7630b.SCENE_BRIGHT));
        this.f15586a.add(new C7628j.C7629a(this, C7628j.C7630b.SCENE_CT));
        this.f15586a.add(new C7628j.C7629a(this, C7628j.C7630b.CT_TAB));
        this.f15586a.add(new C7628j.C7629a(this, C7628j.C7630b.CUSTOM_SCENE_BRIGHT));
        this.f15586a.add(new C7628j.C7629a(this, C7628j.C7630b.CUSTOM_SCENE_CT));
        this.f15586a.add(new C7628j.C7629a(this, C7628j.C7630b.CUSTOM_SCENE_SUSPEND));
    }
}