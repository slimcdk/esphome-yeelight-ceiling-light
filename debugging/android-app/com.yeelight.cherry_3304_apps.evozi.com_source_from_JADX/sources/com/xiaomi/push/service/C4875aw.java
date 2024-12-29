package com.xiaomi.push.service;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import com.xiaomi.push.C4491ab;

/* renamed from: com.xiaomi.push.service.aw */
public class C4875aw {

    /* renamed from: a */
    private static C4875aw f10054a;

    /* renamed from: a */
    private int f10055a = 0;

    /* renamed from: a */
    private Context f10056a;

    private C4875aw(Context context) {
        this.f10056a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C4875aw m15643a(Context context) {
        if (f10054a == null) {
            f10054a = new C4875aw(context);
        }
        return f10054a;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public int mo25938a() {
        int i = this.f10055a;
        if (i != 0) {
            return i;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            try {
                this.f10055a = Settings.Global.getInt(this.f10056a.getContentResolver(), "device_provisioned", 0);
            } catch (Exception unused) {
            }
            return this.f10055a;
        }
        int i2 = Settings.Secure.getInt(this.f10056a.getContentResolver(), "device_provisioned", 0);
        this.f10055a = i2;
        return i2;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public Uri m15645a() {
        return Build.VERSION.SDK_INT >= 17 ? Settings.Global.getUriFor("device_provisioned") : Settings.Secure.getUriFor("device_provisioned");
    }

    /* renamed from: a */
    public boolean m15646a() {
        return C4491ab.f8142a.contains("xmsf") || C4491ab.f8142a.contains("xiaomi") || C4491ab.f8142a.contains("miui");
    }
}
