package com.yeelight.yeelib.device.models;

import com.miot.service.manager.timer.TimerCodec;

/* renamed from: com.yeelight.yeelib.device.models.e */
public class C7618e extends C7620f {
    public C7618e(String str, Object[] objArr) {
        this.f15575a = str;
        this.f15576b = objArr;
    }

    /* renamed from: a */
    public String mo29066a() {
        String str = this.f15575a;
        for (Object obj : this.f15576b) {
            str = str + obj.toString();
        }
        while (str.length() < 36) {
            str = str + TimerCodec.DISENABLE;
        }
        return str;
    }
}
