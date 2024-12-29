package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.C4495af;
import com.xiaomi.push.C4498ai;
import com.xiaomi.push.C4521az;
import com.xiaomi.push.C4815r;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.xiaomi.push.service.bg */
public final class C4887bg implements C4845af {

    /* renamed from: a */
    private static volatile C4887bg f10092a;

    /* renamed from: a */
    private long f10093a;

    /* renamed from: a */
    Context f10094a;

    /* renamed from: a */
    private SharedPreferences f10095a;

    /* renamed from: a */
    private ConcurrentHashMap<String, C4888a> f10096a = new ConcurrentHashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public volatile boolean f10097a = false;

    /* renamed from: com.xiaomi.push.service.bg$a */
    public static abstract class C4888a implements Runnable {

        /* renamed from: a */
        long f10098a;

        /* renamed from: a */
        String f10099a;

        C4888a(String str, long j) {
            this.f10099a = str;
            this.f10098a = j;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo25953a(C4887bg bgVar);

        public void run() {
            if (C4887bg.mo25902a() != null) {
                Context context = C4887bg.mo25902a().f10094a;
                if (C4521az.m13367c(context)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    SharedPreferences a = C4887bg.m15692a(C4887bg.mo25902a());
                    if (currentTimeMillis - a.getLong(":ts-" + this.f10099a, 0) > this.f10098a || C4495af.m13264a(context)) {
                        SharedPreferences.Editor edit = C4887bg.m15692a(C4887bg.mo25902a()).edit();
                        C4815r.m15379a(edit.putLong(":ts-" + this.f10099a, System.currentTimeMillis()));
                        mo25953a(C4887bg.mo25902a());
                    }
                }
            }
        }
    }

    private C4887bg(Context context) {
        this.f10094a = context.getApplicationContext();
        this.f10095a = context.getSharedPreferences("sync", 0);
    }

    /* renamed from: a */
    public static C4887bg m15694a(Context context) {
        if (f10092a == null) {
            synchronized (C4887bg.class) {
                if (f10092a == null) {
                    f10092a = new C4887bg(context);
                }
            }
        }
        return f10092a;
    }

    /* renamed from: a */
    public String mo25950a(String str, String str2) {
        SharedPreferences sharedPreferences = this.f10095a;
        return sharedPreferences.getString(str + Constants.COLON_SEPARATOR + str2, "");
    }

    /* renamed from: a */
    public void m15698a() {
        if (!this.f10097a) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f10093a >= 3600000) {
                this.f10093a = currentTimeMillis;
                this.f10097a = true;
                C4498ai.m13271a(this.f10094a).mo24726a((Runnable) new C4889bh(this), (int) (Math.random() * 10.0d));
            }
        }
    }

    /* renamed from: a */
    public void mo25951a(C4888a aVar) {
        if (this.f10096a.putIfAbsent(aVar.f10099a, aVar) == null) {
            C4498ai.m13271a(this.f10094a).mo24726a((Runnable) aVar, ((int) (Math.random() * 30.0d)) + 10);
        }
    }

    /* renamed from: a */
    public void mo25952a(String str, String str2, String str3) {
        SharedPreferences.Editor edit = f10092a.f10095a.edit();
        C4815r.m15379a(edit.putString(str + Constants.COLON_SEPARATOR + str2, str3));
    }
}
