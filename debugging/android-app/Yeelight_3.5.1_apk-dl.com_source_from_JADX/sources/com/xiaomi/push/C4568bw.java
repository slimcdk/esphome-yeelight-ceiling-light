package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.xiaomi.push.bw */
public class C4568bw {

    /* renamed from: a */
    private static volatile C4568bw f7669a;

    /* renamed from: a */
    private Context f7670a;

    private C4568bw(Context context) {
        this.f7670a = context;
    }

    /* renamed from: a */
    public static C4568bw m13070a(Context context) {
        if (f7669a == null) {
            synchronized (C4568bw.class) {
                if (f7669a == null) {
                    f7669a = new C4568bw(context);
                }
            }
        }
        return f7669a;
    }

    /* renamed from: a */
    public synchronized long mo28789a(String str, String str2, long j) {
        try {
        } catch (Throwable unused) {
            return j;
        }
        return this.f7670a.getSharedPreferences(str, 4).getLong(str2, j);
    }

    /* renamed from: a */
    public synchronized String mo28790a(String str, String str2, String str3) {
        try {
        } catch (Throwable unused) {
            return str3;
        }
        return this.f7670a.getSharedPreferences(str, 4).getString(str2, str3);
    }

    /* renamed from: a */
    public synchronized void m13073a(String str, String str2, long j) {
        SharedPreferences.Editor edit = this.f7670a.getSharedPreferences(str, 4).edit();
        edit.putLong(str2, j);
        edit.commit();
    }

    /* renamed from: a */
    public synchronized void m13074a(String str, String str2, String str3) {
        SharedPreferences.Editor edit = this.f7670a.getSharedPreferences(str, 4).edit();
        edit.putString(str2, str3);
        edit.commit();
    }
}
