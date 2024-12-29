package com.xiaomi.push;

import android.content.SharedPreferences;

/* renamed from: com.xiaomi.push.s */
class C4837s implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C4836r f9345a;

    /* renamed from: a */
    final /* synthetic */ String f9346a;

    /* renamed from: b */
    final /* synthetic */ String f9347b;

    /* renamed from: c */
    final /* synthetic */ String f9348c;

    C4837s(C4836r rVar, String str, String str2, String str3) {
        this.f9345a = rVar;
        this.f9346a = str;
        this.f9347b = str2;
        this.f9348c = str3;
    }

    public void run() {
        SharedPreferences.Editor edit = this.f9345a.f9342a.getSharedPreferences(this.f9346a, 4).edit();
        edit.putString(this.f9347b, this.f9348c);
        edit.commit();
    }
}
