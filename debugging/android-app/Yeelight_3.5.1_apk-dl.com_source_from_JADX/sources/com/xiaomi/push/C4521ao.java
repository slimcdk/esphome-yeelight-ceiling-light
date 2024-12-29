package com.xiaomi.push;

import android.os.Handler;
import android.os.Looper;
import androidx.core.location.LocationRequestCompat;
import com.xiaomi.channel.commonutils.logger.C4408b;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.xiaomi.push.ao */
public class C4521ao {

    /* renamed from: a */
    private int f7558a;

    /* renamed from: a */
    private Handler f7559a;

    /* renamed from: a */
    private C4522a f7560a;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public volatile C4523b f7561a;

    /* renamed from: a */
    private volatile boolean f7562a;

    /* renamed from: b */
    private final boolean f7563b;

    /* renamed from: com.xiaomi.push.ao$a */
    private class C4522a extends Thread {

        /* renamed from: a */
        private final LinkedBlockingQueue<C4523b> f7565a = new LinkedBlockingQueue<>();

        public C4522a() {
            super("PackageProcessor");
        }

        /* renamed from: a */
        private void m12884a(int i, C4523b bVar) {
            try {
                C4521ao.m12876a(C4521ao.this).sendMessage(C4521ao.m12876a(C4521ao.this).obtainMessage(i, bVar));
            } catch (Exception e) {
                C4408b.m12478a((Throwable) e);
            }
        }

        /* renamed from: a */
        public void mo28746a(C4523b bVar) {
            try {
                this.f7565a.add(bVar);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void run() {
            long a = C4521ao.m12876a(C4521ao.this) > 0 ? (long) C4521ao.m12876a(C4521ao.this) : LocationRequestCompat.PASSIVE_INTERVAL;
            while (!C4521ao.m12876a(C4521ao.this)) {
                try {
                    C4523b poll = this.f7565a.poll(a, TimeUnit.SECONDS);
                    C4523b unused = C4521ao.this.f7561a = poll;
                    if (poll != null) {
                        m12884a(0, poll);
                        poll.mo28749b();
                        m12884a(1, poll);
                    } else if (C4521ao.m12876a(C4521ao.this) > 0) {
                        C4521ao.m12876a(C4521ao.this);
                    }
                } catch (InterruptedException e) {
                    C4408b.m12478a((Throwable) e);
                }
            }
        }
    }

    /* renamed from: com.xiaomi.push.ao$b */
    public static abstract class C4523b {
        /* renamed from: a */
        public void mo28748a() {
        }

        /* renamed from: b */
        public abstract void mo28749b();

        /* renamed from: c */
        public void mo28750c() {
        }
    }

    public C4521ao() {
        this(false);
    }

    public C4521ao(boolean z) {
        this(z, 0);
    }

    public C4521ao(boolean z, int i) {
        this.f7559a = null;
        this.f7562a = false;
        this.f7558a = 0;
        this.f7559a = new C4524ap(this, Looper.getMainLooper());
        this.f7563b = z;
        this.f7558a = i;
    }

    /* renamed from: a */
    private synchronized void m12879a() {
        this.f7560a = null;
        this.f7562a = true;
    }

    /* renamed from: a */
    public synchronized void mo28744a(C4523b bVar) {
        if (this.f7560a == null) {
            C4522a aVar = new C4522a();
            this.f7560a = aVar;
            aVar.setDaemon(this.f7563b);
            this.f7562a = false;
            this.f7560a.start();
        }
        this.f7560a.mo28746a(bVar);
    }

    /* renamed from: a */
    public void mo28745a(C4523b bVar, long j) {
        this.f7559a.postDelayed(new C4525aq(this, bVar), j);
    }
}
