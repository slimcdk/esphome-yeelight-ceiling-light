package com.xiaomi.push.service;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Base64;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4558bm;
import com.xiaomi.push.C4777i;
import com.xiaomi.push.C4783if;
import com.xiaomi.push.C4788ik;
import com.xiaomi.push.C4797it;
import com.xiaomi.push.C4804iz;

/* renamed from: com.xiaomi.push.service.n */
public class C4971n {
    /* renamed from: a */
    public static C4788ik m15581a(C4783if ifVar) {
        byte[] a = ifVar.mo29558a();
        C4788ik ikVar = new C4788ik();
        try {
            C4797it.m14833a(ikVar, a);
            return ikVar;
        } catch (C4804iz unused) {
            return null;
        }
    }

    /* renamed from: a */
    static void m15582a(Context context, Intent intent) {
        if (intent != null) {
            String stringExtra = intent.getStringExtra("ext_fcm_container_buffer");
            String stringExtra2 = intent.getStringExtra("mipush_app_package");
            if (!TextUtils.isEmpty(stringExtra) && !TextUtils.isEmpty(stringExtra2)) {
                try {
                    byte[] b = m15585b(Base64.decode(stringExtra, 2), context.getSharedPreferences("mipush_apps_scrt", 0).getString(stringExtra2, (String) null));
                    if (b != null) {
                        C4874al.m15221a(context, C4990y.m15707a(b), b);
                    } else {
                        C4408b.m12464a("notify fcm notification error ：dencrypt failed");
                    }
                } catch (Throwable th) {
                    C4408b.m12477a("notify fcm notification error ", th);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m15583a(Context context, String str, String str2) {
        if (context != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            context.getSharedPreferences("mipush_apps_scrt", 0).edit().putString(str, str2).apply();
        }
    }

    /* renamed from: a */
    public static byte[] m15584a(byte[] bArr, String str) {
        if (TextUtils.isEmpty(str)) {
            C4408b.m12464a("secret is empty, return null");
            return null;
        }
        try {
            return C4777i.m14413b(C4558bm.m13029a(str), bArr);
        } catch (Exception e) {
            C4408b.m12477a("encryption error. ", (Throwable) e);
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m15585b(byte[] bArr, String str) {
        if (TextUtils.isEmpty(str)) {
            C4408b.m12464a("secret is empty, return null");
            return null;
        }
        try {
            return C4777i.m14412a(C4558bm.m13029a(str), bArr);
        } catch (Exception e) {
            C4408b.m12477a("dencryption error. ", (Throwable) e);
            return null;
        }
    }
}
