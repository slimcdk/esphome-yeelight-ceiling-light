package p164h.p211a.p212a.p228h.p232d0;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p164h.p211a.p212a.p228h.p233x.C11153e;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.h.d0.c */
public class C11113c extends Thread {

    /* renamed from: c */
    private static final C11158c f21983c = C11156b.m29015a(C11113c.class);

    /* renamed from: d */
    private static final C11113c f21984d = new C11113c();

    /* renamed from: a */
    private boolean f21985a;

    /* renamed from: b */
    private final List<C11153e> f21986b = new CopyOnWriteArrayList();

    private C11113c() {
    }

    /* renamed from: b */
    public static synchronized void m28829b(C11153e eVar) {
        synchronized (C11113c.class) {
            f21984d.f21986b.remove(eVar);
            if (f21984d.f21986b.size() == 0) {
                f21984d.m28832e();
            }
        }
    }

    /* renamed from: c */
    private synchronized void m28830c() {
        try {
            if (!this.f21985a) {
                Runtime.getRuntime().addShutdownHook(this);
            }
            this.f21985a = true;
        } catch (Exception e) {
            f21983c.mo35488d(e);
            f21983c.mo35494j("shutdown already commenced", new Object[0]);
        }
        return;
    }

    /* renamed from: d */
    public static synchronized void m28831d(C11153e... eVarArr) {
        synchronized (C11113c.class) {
            f21984d.f21986b.addAll(Arrays.asList(eVarArr));
            if (f21984d.f21986b.size() > 0) {
                f21984d.m28830c();
            }
        }
    }

    /* renamed from: e */
    private synchronized void m28832e() {
        try {
            this.f21985a = false;
            Runtime.getRuntime().removeShutdownHook(this);
        } catch (Exception e) {
            f21983c.mo35488d(e);
            f21983c.mo35494j("shutdown already commenced", new Object[0]);
        }
        return;
    }

    public void run() {
        for (C11153e next : f21984d.f21986b) {
            try {
                if (next.mo35452j0()) {
                    next.stop();
                    f21983c.mo35489e("Stopped {}", next);
                }
            } catch (Exception e) {
                f21983c.mo35487c(e);
            }
        }
    }
}
