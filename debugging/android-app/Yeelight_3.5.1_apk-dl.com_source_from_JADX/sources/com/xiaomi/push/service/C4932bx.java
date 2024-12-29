package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.C4513ai;
import com.xiaomi.push.C4516al;
import com.xiaomi.push.C4551bj;
import com.xiaomi.push.C4992t;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.xiaomi.push.service.bx */
public final class C4932bx implements C4883ar {

    /* renamed from: a */
    private static volatile C4932bx f9635a;

    /* renamed from: a */
    private long f9636a;

    /* renamed from: a */
    Context f9637a;

    /* renamed from: a */
    private SharedPreferences f9638a;

    /* renamed from: a */
    private ConcurrentHashMap<String, C4933a> f9639a = new ConcurrentHashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public volatile boolean f9640a = false;

    /* renamed from: com.xiaomi.push.service.bx$a */
    public static abstract class C4933a implements Runnable {

        /* renamed from: a */
        long f9641a;

        /* renamed from: a */
        String f9642a;

        C4933a(String str, long j) {
            this.f9642a = str;
            this.f9641a = j;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo29965a(C4932bx bxVar);

        public void run() {
            if (C4932bx.mo29970a() != null) {
                Context context = C4932bx.mo29970a().f9637a;
                if (C4551bj.m13002d(context)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    SharedPreferences a = C4932bx.m15483a(C4932bx.mo29970a());
                    if (currentTimeMillis - a.getLong(":ts-" + this.f9642a, 0) > this.f9641a || C4513ai.m12851a(context)) {
                        SharedPreferences.Editor edit = C4932bx.m15483a(C4932bx.mo29970a()).edit();
                        C4992t.m15731a(edit.putLong(":ts-" + this.f9642a, System.currentTimeMillis()));
                        mo29965a(C4932bx.mo29970a());
                    }
                }
            }
        }
    }

    private C4932bx(Context context) {
        this.f9637a = context.getApplicationContext();
        this.f9638a = context.getSharedPreferences("sync", 0);
    }

    /* renamed from: a */
    public static C4932bx m15485a(Context context) {
        if (f9635a == null) {
            synchronized (C4932bx.class) {
                if (f9635a == null) {
                    f9635a = new C4932bx(context);
                }
            }
        }
        return f9635a;
    }

    /* renamed from: a */
    public String mo30032a(String str, String str2) {
        SharedPreferences sharedPreferences = this.f9638a;
        return sharedPreferences.getString(str + Constants.COLON_SEPARATOR + str2, "");
    }

    /* renamed from: a */
    public void m15489a() {
        if (!this.f9640a) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f9636a >= 3600000) {
                this.f9636a = currentTimeMillis;
                this.f9640a = true;
                C4516al.m12857a(this.f9637a).mo28734a((Runnable) new C4934by(this), (int) (Math.random() * 10.0d));
            }
        }
    }

    /* renamed from: a */
    public void mo30033a(C4933a aVar) {
        if (this.f9639a.putIfAbsent(aVar.f9642a, aVar) == null) {
            C4516al.m12857a(this.f9637a).mo28734a((Runnable) aVar, ((int) (Math.random() * 30.0d)) + 10);
        }
    }

    /* renamed from: a */
    public void mo30034a(String str, String str2, String str3) {
        SharedPreferences.Editor edit = f9635a.f9638a.edit();
        C4992t.m15731a(edit.putString(str + Constants.COLON_SEPARATOR + str2, str3));
    }
}
