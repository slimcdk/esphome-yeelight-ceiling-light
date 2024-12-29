package com.xiaomi.mistatistic.sdk.controller;

import android.annotation.TargetApi;
import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.xiaomi.mistatistic.sdk.controller.C4115d;

/* renamed from: com.xiaomi.mistatistic.sdk.controller.e */
public class C4120e {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static String f7055a;

    /* renamed from: b */
    private static String f7056b;

    /* renamed from: com.xiaomi.mistatistic.sdk.controller.e$a */
    private static class C4121a implements C4115d.C4118a {

        /* renamed from: a */
        private Context f7057a;

        public C4121a(Context context) {
            this.f7057a = context;
        }

        /* renamed from: a */
        public void mo22986a() {
            String a = C4137k.m11205a(this.f7057a, "device_id", "");
            if (TextUtils.isEmpty(a)) {
                String unused = C4120e.f7055a = C4120e.m11124a(this.f7057a);
                C4137k.m11212b(this.f7057a, "device_id", C4120e.f7055a);
                C4130h.m11178b("DeviceIdHolder", "persisted deviceId " + C4120e.f7055a);
                return;
            }
            String unused2 = C4120e.f7055a = a;
        }
    }

    /* renamed from: a */
    public static String m11124a(Context context) {
        String str;
        String str2;
        if (TextUtils.isEmpty(f7055a)) {
            String b = m11127b(context);
            String c = C4162q.m11297c(context);
            String a = C4162q.m11287a();
            str2 = C4162q.m11298c(b + c + a);
            str = String.format("deviceId %s, %s, %s, %s", new Object[]{str2, b, c, a});
        } else {
            str2 = f7055a;
            str = String.format("cached deviceId %s", new Object[]{str2});
        }
        C4130h.m11178b("DeviceIdHolder", str);
        return str2;
    }

    @TargetApi(9)
    /* renamed from: b */
    public static String m11127b(Context context) {
        try {
            if (TextUtils.isEmpty(f7056b)) {
                String a = C4137k.m11205a(context, "imei", "");
                f7056b = a;
                if (TextUtils.isEmpty(a)) {
                    if (context.getPackageManager().checkPermission("android.permission.READ_PHONE_STATE", context.getPackageName()) == 0) {
                        String deviceId = ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
                        f7056b = deviceId;
                        C4137k.m11212b(context, "imei", deviceId);
                    } else {
                        C4130h.m11183d("cannot get READ_PHONE_STATE permission");
                    }
                }
            }
        } catch (Throwable th) {
            C4130h.m11176a("getImei exception:", th);
        }
        if (TextUtils.isEmpty(f7056b)) {
            C4130h.m11181c("Imei is empty");
        }
        return f7056b;
    }

    /* renamed from: a */
    public String mo23042a() {
        String str = f7055a;
        if (str != null) {
            return str;
        }
        C4115d.m11118a().mo23037a((C4115d.C4118a) new C4121a(C4113c.m11105a()));
        return null;
    }
}
