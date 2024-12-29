package com.yeelight.yeelib.device.models;

import com.yeelight.yeelib.device.models.C7628j;

/* renamed from: com.yeelight.yeelib.device.models.a0 */
public class C7611a0 extends C7628j {
    public C7611a0(String str) {
        super(str);
        this.f15586a.add(new C7628j.C7629a(this, C7628j.C7630b.BTN_POWER));
        this.f15586a.add(new C7628j.C7629a(this, C7628j.C7630b.BTN_CT));
        this.f15586a.add(new C7628j.C7629a(this, C7628j.C7630b.BTN_SCENE));
        this.f15586a.add(new C7628j.C7629a(this, C7628j.C7630b.CONTROL_CT_V));
        this.f15586a.add(new C7628j.C7629a(this, C7628j.C7630b.SCENE_BRIGHT));
    }
}
