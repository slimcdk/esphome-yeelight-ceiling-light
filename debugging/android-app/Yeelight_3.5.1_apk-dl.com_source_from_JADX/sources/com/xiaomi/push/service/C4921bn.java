package com.xiaomi.push.service;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import com.xiaomi.push.C4509ae;

/* renamed from: com.xiaomi.push.service.bn */
public class C4921bn {

    /* renamed from: a */
    private static C4921bn f9607a;

    /* renamed from: a */
    private int f9608a = 0;

    /* renamed from: a */
    private Context f9609a;

    private C4921bn(Context context) {
        this.f9609a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C4921bn m15441a(Context context) {
        if (f9607a == null) {
            f9607a = new C4921bn(context);
        }
        return f9607a;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public int mo30023a() {
        int i = this.f9608a;
        if (i != 0) {
            return i;
        }
        try {
            this.f9608a = Settings.Global.getInt(this.f9609a.getContentResolver(), "device_provisioned", 0);
        } catch (Exception unused) {
        }
        return this.f9608a;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public Uri m15443a() {
        return Settings.Global.getUriFor("device_provisioned");
    }

    /* renamed from: a */
    public boolean m15444a() {
        String str = C4509ae.f7537a;
        return str.contains("xmsf") || str.contains("xiaomi") || str.contains("miui");
    }
}
