package p172i6;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p147d6.C8949e;
import p152e6.C9001b;
import p152e6.C9003c;

/* renamed from: i6.c */
public class C9126c extends Thread {

    /* renamed from: c */
    private static final C9003c f16888c = C9001b.m21450a(C9126c.class);

    /* renamed from: d */
    private static final C9126c f16889d = new C9126c();

    /* renamed from: a */
    private boolean f16890a;

    /* renamed from: b */
    private final List<C8949e> f16891b = new CopyOnWriteArrayList();

    private C9126c() {
    }

    /* renamed from: b */
    public static synchronized void m21934b(C8949e eVar) {
        synchronized (C9126c.class) {
            C9126c cVar = f16889d;
            cVar.f16891b.remove(eVar);
            if (cVar.f16891b.size() == 0) {
                cVar.m21937e();
            }
        }
    }

    /* renamed from: c */
    private synchronized void m21935c() {
        try {
            if (!this.f16890a) {
                Runtime.getRuntime().addShutdownHook(this);
            }
            this.f16890a = true;
        } catch (Exception e) {
            C9003c cVar = f16888c;
            cVar.mo36849d(e);
            cVar.mo36855i("shutdown already commenced", new Object[0]);
        }
        return;
    }

    /* renamed from: d */
    public static synchronized void m21936d(C8949e... eVarArr) {
        synchronized (C9126c.class) {
            C9126c cVar = f16889d;
            cVar.f16891b.addAll(Arrays.asList(eVarArr));
            if (cVar.f16891b.size() > 0) {
                cVar.m21935c();
            }
        }
    }

    /* renamed from: e */
    private synchronized void m21937e() {
        try {
            this.f16890a = false;
            Runtime.getRuntime().removeShutdownHook(this);
        } catch (Exception e) {
            C9003c cVar = f16888c;
            cVar.mo36849d(e);
            cVar.mo36855i("shutdown already commenced", new Object[0]);
        }
        return;
    }

    public void run() {
        for (C8949e next : f16889d.f16891b) {
            try {
                if (next.mo36748n0()) {
                    next.stop();
                    f16888c.mo36850e("Stopped {}", next);
                }
            } catch (Exception e) {
                f16888c.mo36848c(e);
            }
        }
    }
}
