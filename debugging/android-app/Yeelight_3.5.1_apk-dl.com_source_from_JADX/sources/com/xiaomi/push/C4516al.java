package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import com.xiaomi.channel.commonutils.logger.C4408b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.xiaomi.push.al */
public class C4516al {

    /* renamed from: a */
    private static volatile C4516al f7548a;

    /* renamed from: a */
    private SharedPreferences f7549a;

    /* renamed from: a */
    private Object f7550a = new Object();

    /* renamed from: a */
    private Map<String, ScheduledFuture> f7551a = new HashMap();

    /* renamed from: a */
    private ScheduledThreadPoolExecutor f7552a = new ScheduledThreadPoolExecutor(1);

    /* renamed from: com.xiaomi.push.al$a */
    public static abstract class C4517a implements Runnable {
        /* renamed from: a */
        public abstract String mo28479a();
    }

    /* renamed from: com.xiaomi.push.al$b */
    private static class C4518b implements Runnable {

        /* renamed from: a */
        C4517a f7553a;

        public C4518b(C4517a aVar) {
            this.f7553a = aVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo28741a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo28742b() {
        }

        public void run() {
            mo28741a();
            this.f7553a.run();
            mo28742b();
        }
    }

    private C4516al(Context context) {
        this.f7549a = context.getSharedPreferences("mipush_extra", 0);
    }

    /* renamed from: a */
    public static C4516al m12857a(Context context) {
        if (f7548a == null) {
            synchronized (C4516al.class) {
                if (f7548a == null) {
                    f7548a = new C4516al(context);
                }
            }
        }
        return f7548a;
    }

    /* renamed from: a */
    private static String mo28739a(String str) {
        return "last_job_time" + str;
    }

    /* renamed from: a */
    private ScheduledFuture mo28735a(C4517a aVar) {
        ScheduledFuture scheduledFuture;
        synchronized (this.f7550a) {
            scheduledFuture = this.f7551a.get(aVar.mo28479a());
        }
        return scheduledFuture;
    }

    /* renamed from: a */
    public void mo28733a(Runnable runnable) {
        mo28734a(runnable, 0);
    }

    /* renamed from: a */
    public void mo28734a(Runnable runnable, int i) {
        this.f7552a.schedule(runnable, (long) i, TimeUnit.SECONDS);
    }

    /* renamed from: a */
    public boolean m12864a(C4517a aVar) {
        return mo28740b(aVar, 0);
    }

    /* renamed from: a */
    public boolean mo28736a(C4517a aVar, int i) {
        return mo28737a(aVar, i, 0);
    }

    /* renamed from: a */
    public boolean mo28737a(C4517a aVar, int i, int i2) {
        return mo28738a(aVar, i, i2, false);
    }

    /* renamed from: a */
    public boolean mo28738a(C4517a aVar, int i, int i2, boolean z) {
        if (aVar == null || mo28735a(aVar) != null) {
            return false;
        }
        String a = mo28739a(aVar.mo28479a());
        C4519am amVar = new C4519am(this, aVar, z, a);
        if (!z) {
            long abs = Math.abs(System.currentTimeMillis() - this.f7549a.getLong(a, 0)) / 1000;
            if (abs < ((long) (i - i2))) {
                i2 = (int) (((long) i) - abs);
            }
        }
        try {
            ScheduledFuture<?> scheduleAtFixedRate = this.f7552a.scheduleAtFixedRate(amVar, (long) i2, (long) i, TimeUnit.SECONDS);
            synchronized (this.f7550a) {
                this.f7551a.put(aVar.mo28479a(), scheduleAtFixedRate);
            }
            return true;
        } catch (Exception e) {
            C4408b.m12478a((Throwable) e);
            return true;
        }
    }

    /* renamed from: a */
    public boolean m12868a(String str) {
        synchronized (this.f7550a) {
            ScheduledFuture scheduledFuture = this.f7551a.get(str);
            if (scheduledFuture == null) {
                return false;
            }
            this.f7551a.remove(str);
            return scheduledFuture.cancel(false);
        }
    }

    /* renamed from: b */
    public boolean mo28740b(C4517a aVar, int i) {
        if (aVar == null || mo28735a(aVar) != null) {
            return false;
        }
        ScheduledFuture<?> schedule = this.f7552a.schedule(new C4520an(this, aVar), (long) i, TimeUnit.SECONDS);
        synchronized (this.f7550a) {
            this.f7551a.put(aVar.mo28479a(), schedule);
        }
        return true;
    }
}
