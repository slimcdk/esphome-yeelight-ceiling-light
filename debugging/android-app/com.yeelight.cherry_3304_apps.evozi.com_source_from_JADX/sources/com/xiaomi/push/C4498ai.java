package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.SparseArray;
import com.xiaomi.channel.commonutils.logger.C3989b;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.xiaomi.push.ai */
public class C4498ai {

    /* renamed from: a */
    private static volatile C4498ai f8153a;

    /* renamed from: a */
    private SharedPreferences f8154a;

    /* renamed from: a */
    private SparseArray<ScheduledFuture> f8155a = new SparseArray<>();

    /* renamed from: a */
    private Object f8156a = new Object();

    /* renamed from: a */
    private ScheduledThreadPoolExecutor f8157a = new ScheduledThreadPoolExecutor(1);

    /* renamed from: com.xiaomi.push.ai$a */
    public static abstract class C4499a implements Runnable {
        /* renamed from: a */
        public abstract int mo22734a();
    }

    /* renamed from: com.xiaomi.push.ai$b */
    private static class C4500b implements Runnable {

        /* renamed from: a */
        C4499a f8158a;

        public C4500b(C4499a aVar) {
            this.f8158a = aVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo24732a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo24733b() {
        }

        public void run() {
            mo24732a();
            this.f8158a.run();
            mo24733b();
        }
    }

    private C4498ai(Context context) {
        this.f8154a = context.getSharedPreferences("mipush_extra", 0);
    }

    /* renamed from: a */
    public static C4498ai m13271a(Context context) {
        if (f8153a == null) {
            synchronized (C4498ai.class) {
                if (f8153a == null) {
                    f8153a = new C4498ai(context);
                }
            }
        }
        return f8153a;
    }

    /* renamed from: a */
    private static String mo24727a(int i) {
        return "last_job_time" + i;
    }

    /* renamed from: a */
    private ScheduledFuture mo24728a(C4499a aVar) {
        ScheduledFuture scheduledFuture;
        synchronized (this.f8156a) {
            scheduledFuture = this.f8155a.get(aVar.mo22734a());
        }
        return scheduledFuture;
    }

    /* renamed from: a */
    public void mo24725a(Runnable runnable) {
        mo24726a(runnable, 0);
    }

    /* renamed from: a */
    public void mo24726a(Runnable runnable, int i) {
        this.f8157a.schedule(runnable, (long) i, TimeUnit.SECONDS);
    }

    /* renamed from: a */
    public boolean m13277a(int i) {
        synchronized (this.f8156a) {
            ScheduledFuture scheduledFuture = this.f8155a.get(i);
            if (scheduledFuture == null) {
                return false;
            }
            this.f8155a.remove(i);
            return scheduledFuture.cancel(false);
        }
    }

    /* renamed from: a */
    public boolean m13278a(C4499a aVar) {
        return mo24731b(aVar, 0);
    }

    /* renamed from: a */
    public boolean mo24729a(C4499a aVar, int i) {
        return mo24730a(aVar, i, 0);
    }

    /* renamed from: a */
    public boolean mo24730a(C4499a aVar, int i, int i2) {
        if (aVar == null || mo24728a(aVar) != null) {
            return false;
        }
        String a = mo24727a(aVar.mo22734a());
        C4501aj ajVar = new C4501aj(this, aVar, a);
        long abs = Math.abs(System.currentTimeMillis() - this.f8154a.getLong(a, 0)) / 1000;
        if (abs < ((long) (i - i2))) {
            i2 = (int) (((long) i) - abs);
        }
        try {
            ScheduledFuture<?> scheduleAtFixedRate = this.f8157a.scheduleAtFixedRate(ajVar, (long) i2, (long) i, TimeUnit.SECONDS);
            synchronized (this.f8156a) {
                this.f8155a.put(aVar.mo22734a(), scheduleAtFixedRate);
            }
            return true;
        } catch (Exception e) {
            C3989b.m10678a((Throwable) e);
            return true;
        }
    }

    /* renamed from: b */
    public boolean mo24731b(C4499a aVar, int i) {
        if (aVar == null || mo24728a(aVar) != null) {
            return false;
        }
        ScheduledFuture<?> schedule = this.f8157a.schedule(new C4502ak(this, aVar), (long) i, TimeUnit.SECONDS);
        synchronized (this.f8156a) {
            this.f8155a.put(aVar.mo22734a(), schedule);
        }
        return true;
    }
}
