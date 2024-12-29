package com.xiaomi.push;

import android.os.Handler;
import android.os.Looper;
import com.xiaomi.channel.commonutils.logger.C3989b;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.xiaomi.push.al */
public class C4503al {

    /* renamed from: a */
    private int f8162a;

    /* renamed from: a */
    private Handler f8163a;

    /* renamed from: a */
    private C4504a f8164a;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public volatile C4505b f8165a;

    /* renamed from: a */
    private volatile boolean f8166a;

    /* renamed from: b */
    private final boolean f8167b;

    /* renamed from: com.xiaomi.push.al$a */
    private class C4504a extends Thread {

        /* renamed from: a */
        private final LinkedBlockingQueue<C4505b> f8169a = new LinkedBlockingQueue<>();

        public C4504a() {
            super("PackageProcessor");
        }

        /* renamed from: a */
        private void m13296a(int i, C4505b bVar) {
            try {
                C4503al.m13288a(C4503al.this).sendMessage(C4503al.m13288a(C4503al.this).obtainMessage(i, bVar));
            } catch (Exception e) {
                C3989b.m10678a((Throwable) e);
            }
        }

        /* renamed from: a */
        public void mo24737a(C4505b bVar) {
            try {
                this.f8169a.add(bVar);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void run() {
            long a = C4503al.m13288a(C4503al.this) > 0 ? (long) C4503al.m13288a(C4503al.this) : Long.MAX_VALUE;
            while (!C4503al.m13288a(C4503al.this)) {
                try {
                    C4505b poll = this.f8169a.poll(a, TimeUnit.SECONDS);
                    C4505b unused = C4503al.this.f8165a = poll;
                    if (poll != null) {
                        m13296a(0, poll);
                        poll.mo24740b();
                        m13296a(1, poll);
                    } else if (C4503al.m13288a(C4503al.this) > 0) {
                        C4503al.m13288a(C4503al.this);
                    }
                } catch (InterruptedException e) {
                    C3989b.m10678a((Throwable) e);
                }
            }
        }
    }

    /* renamed from: com.xiaomi.push.al$b */
    public static abstract class C4505b {
        /* renamed from: a */
        public void mo24739a() {
        }

        /* renamed from: b */
        public abstract void mo24740b();

        /* renamed from: c */
        public void mo24741c() {
        }
    }

    public C4503al() {
        this(false);
    }

    public C4503al(boolean z) {
        this(z, 0);
    }

    public C4503al(boolean z, int i) {
        this.f8163a = null;
        this.f8166a = false;
        this.f8162a = 0;
        this.f8163a = new C4506am(this, Looper.getMainLooper());
        this.f8167b = z;
        this.f8162a = i;
    }

    /* renamed from: a */
    private synchronized void m13291a() {
        this.f8164a = null;
        this.f8166a = true;
    }

    /* renamed from: a */
    public synchronized void mo24735a(C4505b bVar) {
        if (this.f8164a == null) {
            C4504a aVar = new C4504a();
            this.f8164a = aVar;
            aVar.setDaemon(this.f8167b);
            this.f8166a = false;
            this.f8164a.start();
        }
        this.f8164a.mo24737a(bVar);
    }

    /* renamed from: a */
    public void mo24736a(C4505b bVar, long j) {
        this.f8163a.postDelayed(new C4507an(this, bVar), j);
    }
}
