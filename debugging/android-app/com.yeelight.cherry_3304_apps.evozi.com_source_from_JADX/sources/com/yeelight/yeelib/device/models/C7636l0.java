package com.yeelight.yeelib.device.models;

import com.yeelight.yeelib.utils.C10539d;

/* renamed from: com.yeelight.yeelib.device.models.l0 */
public class C7636l0 extends C7620f {
    /* renamed from: a */
    public byte[] mo29081a() {
        Object[] objArr = this.f15576b;
        int length = objArr.length;
        String str = "";
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(obj == null ? "" : obj.toString());
            str = sb.toString();
        }
        return C10539d.m25671b(str);
    }

    public String toString() {
        Object[] objArr = this.f15576b;
        int length = objArr.length;
        String str = "";
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(obj == null ? "" : obj.toString());
            str = sb.toString();
        }
        return this.f15575a + " " + str;
    }
}
