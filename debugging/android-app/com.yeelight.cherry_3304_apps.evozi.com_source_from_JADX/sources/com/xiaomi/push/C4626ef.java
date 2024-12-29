package com.xiaomi.push;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.xiaomi.mipush.sdk.Constants;

/* renamed from: com.xiaomi.push.ef */
public class C4626ef extends C4624ed {

    /* renamed from: a */
    private boolean f8443a;

    /* renamed from: b */
    private boolean f8444b;

    /* renamed from: c */
    private boolean f8445c;

    /* renamed from: d */
    private boolean f8446d;

    /* renamed from: e */
    private boolean f8447e;

    public C4626ef(Context context, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(context, i);
        this.f8443a = z;
        this.f8444b = z2;
        this.f8445c = z3;
        this.f8446d = z4;
        this.f8447e = z5;
    }

    /* renamed from: b */
    private String m13811b() {
        if (!this.f8443a) {
            return "off";
        }
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) this.f8438a.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.heightPixels + Constants.ACCEPT_TIME_SEPARATOR_SP + displayMetrics.widthPixels;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: c */
    private String m13812c() {
        if (!this.f8444b) {
            return "off";
        }
        try {
            return Build.VERSION.RELEASE;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: d */
    private String m13813d() {
        if (!this.f8445c) {
            return "off";
        }
        try {
            return String.valueOf(Build.VERSION.SDK_INT);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: e */
    private String m13814e() {
        if (!this.f8446d) {
            return "off";
        }
        try {
            return Settings.Secure.getString(this.f8438a.getContentResolver(), "android_id");
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: f */
    private String m13815f() {
        if (!this.f8447e) {
            return "off";
        }
        try {
            return ((TelephonyManager) this.f8438a.getSystemService("phone")).getSimOperator();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: a */
    public int mo22734a() {
        return 3;
    }

    /* renamed from: a */
    public C4741ho m13817a() {
        return C4741ho.DeviceInfoV2;
    }

    /* renamed from: a */
    public String m13818a() {
        return m13811b() + "|" + m13812c() + "|" + m13813d() + "|" + m13814e() + "|" + m13815f();
    }
}
