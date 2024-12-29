package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.xiaomi.push.bm */
public class C4539bm {

    /* renamed from: a */
    private static volatile C4539bm f8228a;

    /* renamed from: a */
    private Context f8229a;

    private C4539bm(Context context) {
        this.f8229a = context;
    }

    /* renamed from: a */
    public static C4539bm m13458a(Context context) {
        if (f8228a == null) {
            synchronized (C4539bm.class) {
                if (f8228a == null) {
                    f8228a = new C4539bm(context);
                }
            }
        }
        return f8228a;
    }

    /* renamed from: a */
    public synchronized long mo24775a(String str, String str2, long j) {
        try {
        } catch (Throwable unused) {
            return j;
        }
        return this.f8229a.getSharedPreferences(str, 4).getLong(str2, j);
    }

    /* renamed from: a */
    public synchronized String mo24776a(String str, String str2, String str3) {
        try {
        } catch (Throwable unused) {
            return str3;
        }
        return this.f8229a.getSharedPreferences(str, 4).getString(str2, str3);
    }

    /* renamed from: a */
    public synchronized void m13461a(String str, String str2, long j) {
        SharedPreferences.Editor edit = this.f8229a.getSharedPreferences(str, 4).edit();
        edit.putLong(str2, j);
        edit.commit();
    }

    /* renamed from: a */
    public synchronized void m13462a(String str, String str2, String str3) {
        SharedPreferences.Editor edit = this.f8229a.getSharedPreferences(str, 4).edit();
        edit.putString(str2, str3);
        edit.commit();
    }
}
