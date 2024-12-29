package com.xiaomi.push;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4516al;
import com.xiaomi.push.service.C4898ba;

/* renamed from: com.xiaomi.push.dr */
public class C4629dr {

    /* renamed from: a */
    private static volatile C4629dr f7831a;

    /* renamed from: a */
    private Context f7832a;

    /* renamed from: a */
    private C4630a f7833a;

    /* renamed from: com.xiaomi.push.dr$a */
    public interface C4630a {
        /* renamed from: a */
        void mo28918a();
    }

    private C4629dr(Context context) {
        this.f7832a = context;
    }

    /* renamed from: a */
    public static int m13336a(int i) {
        return Math.max(60, i);
    }

    /* renamed from: a */
    public static C4629dr m13337a(Context context) {
        if (f7831a == null) {
            synchronized (C4629dr.class) {
                if (f7831a == null) {
                    f7831a = new C4629dr(context);
                }
            }
        }
        return f7831a;
    }

    /* renamed from: a */
    private void m13339a(C4898ba baVar, C4516al alVar, boolean z) {
        if (baVar.mo29996a(C4765ho.UploadSwitch.mo29322a(), true)) {
            C4634dv dvVar = new C4634dv(this.f7832a);
            if (z) {
                alVar.mo28736a((C4516al.C4517a) dvVar, m13336a(baVar.mo29988a(C4765ho.UploadFrequency.mo29322a(), 86400)));
            } else {
                alVar.mo28735a((C4516al.C4517a) dvVar);
            }
        }
    }

    /* renamed from: a */
    private boolean mo28917a() {
        try {
            Context context = this.f7832a;
            if (!(context instanceof Application)) {
                context = context.getApplicationContext();
            }
            ((Application) context).registerActivityLifecycleCallbacks(new C4623dl(this.f7832a, String.valueOf(System.currentTimeMillis() / 1000)));
            return true;
        } catch (Exception e) {
            C4408b.m12478a((Throwable) e);
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m13341b() {
        C4630a aVar;
        C4516al a = C4516al.m12857a(this.f7832a);
        C4898ba a2 = C4898ba.m15362a(this.f7832a);
        SharedPreferences sharedPreferences = this.f7832a.getSharedPreferences("mipush_extra", 0);
        long currentTimeMillis = System.currentTimeMillis();
        long j = sharedPreferences.getLong("first_try_ts", currentTimeMillis);
        if (j == currentTimeMillis) {
            sharedPreferences.edit().putLong("first_try_ts", currentTimeMillis).commit();
        }
        if (Math.abs(currentTimeMillis - j) >= 172800000) {
            m13339a(a2, a, false);
            if (a2.mo29996a(C4765ho.StorageCollectionSwitch.mo29322a(), true)) {
                int a3 = m13336a(a2.mo29988a(C4765ho.StorageCollectionFrequency.mo29322a(), 86400));
                a.mo28737a(new C4633du(this.f7832a, a3), a3, 0);
            }
            if (C4830m.m14998a(this.f7832a) && (aVar = this.f7833a) != null) {
                aVar.mo28918a();
            }
            if (a2.mo29996a(C4765ho.ActivityTSSwitch.mo29322a(), false)) {
                mo28917a();
            }
            m13339a(a2, a, true);
        }
    }

    /* renamed from: a */
    public void m13342a() {
        C4516al.m12857a(this.f7832a).mo28733a((Runnable) new C4631ds(this));
    }
}
