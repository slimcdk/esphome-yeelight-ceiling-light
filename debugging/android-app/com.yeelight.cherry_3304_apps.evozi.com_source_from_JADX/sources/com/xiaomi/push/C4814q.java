package com.xiaomi.push;

import android.content.SharedPreferences;

/* renamed from: com.xiaomi.push.q */
class C4814q implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C4812p f9867a;

    /* renamed from: a */
    final /* synthetic */ String f9868a;

    /* renamed from: b */
    final /* synthetic */ String f9869b;

    /* renamed from: c */
    final /* synthetic */ String f9870c;

    C4814q(C4812p pVar, String str, String str2, String str3) {
        this.f9867a = pVar;
        this.f9868a = str;
        this.f9869b = str2;
        this.f9870c = str3;
    }

    public void run() {
        SharedPreferences.Editor edit = this.f9867a.f9858a.getSharedPreferences(this.f9868a, 4).edit();
        edit.putString(this.f9869b, this.f9870c);
        edit.commit();
    }
}
