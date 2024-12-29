package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;

/* renamed from: com.xiaomi.push.ee */
public class C4625ee extends C4624ed {

    /* renamed from: a */
    private boolean f8439a;

    /* renamed from: b */
    private boolean f8440b;

    /* renamed from: c */
    private boolean f8441c;

    /* renamed from: d */
    private boolean f8442d;

    public C4625ee(Context context, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        super(context, i);
        this.f8439a = z;
        this.f8440b = z2;
        if (C4808l.m15366d()) {
            this.f8440b = false;
        }
        this.f8441c = z3;
        this.f8442d = z4;
    }

    /* renamed from: a */
    private String m13803a(Context context) {
        return !this.f8442d ? "off" : "";
    }

    /* renamed from: b */
    private String m13804b() {
        if (!this.f8439a) {
            return "off";
        }
        try {
            String c = m13805c();
            if (TextUtils.isEmpty(c)) {
                return "";
            }
            return C4532bf.m13431a(c) + Constants.ACCEPT_TIME_SEPARATOR_SP + C4532bf.m13440b(c);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: c */
    private String m13805c() {
        return "";
    }

    /* renamed from: d */
    private String m13806d() {
        return !this.f8440b ? "off" : "";
    }

    /* renamed from: e */
    private String m13807e() {
        return !this.f8441c ? "off" : "";
    }

    /* renamed from: a */
    public int mo22734a() {
        return 13;
    }

    /* renamed from: a */
    public C4741ho m13809a() {
        return C4741ho.DeviceBaseInfo;
    }

    /* renamed from: a */
    public String m13810a() {
        return m13804b() + "|" + m13806d() + "|" + m13807e() + "|" + m13803a(this.f8438a);
    }
}
