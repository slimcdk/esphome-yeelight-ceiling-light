package p156f;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import p156f.C4399z;
import p156f.p157g0.C4345c;

/* renamed from: f.n */
public final class C4380n {

    /* renamed from: a */
    private int f7811a = 64;

    /* renamed from: b */
    private int f7812b = 5;
    @Nullable

    /* renamed from: c */
    private Runnable f7813c;
    @Nullable

    /* renamed from: d */
    private ExecutorService f7814d;

    /* renamed from: e */
    private final Deque<C4399z.C4401b> f7815e = new ArrayDeque();

    /* renamed from: f */
    private final Deque<C4399z.C4401b> f7816f = new ArrayDeque();

    /* renamed from: g */
    private final Deque<C4399z> f7817g = new ArrayDeque();

    /* renamed from: d */
    private <T> void m12554d(Deque<T> deque, T t) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t)) {
                runnable = this.f7813c;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (!m12555g() && runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: g */
    private boolean m12555g() {
        int i;
        boolean z;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<C4399z.C4401b> it = this.f7815e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C4399z.C4401b next = it.next();
                if (this.f7816f.size() >= this.f7811a) {
                    break;
                } else if (m12556i(next) < this.f7812b) {
                    it.remove();
                    arrayList.add(next);
                    this.f7816f.add(next);
                }
            }
            z = mo24054h() > 0;
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((C4399z.C4401b) arrayList.get(i)).mo24190k(mo24051c());
        }
        return z;
    }

    /* renamed from: i */
    private int m12556i(C4399z.C4401b bVar) {
        int i = 0;
        for (C4399z.C4401b next : this.f7816f) {
            if (!next.mo24191n().f7932f && next.mo24192o().equals(bVar.mo24192o())) {
                i++;
            }
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo24049a(C4399z.C4401b bVar) {
        synchronized (this) {
            this.f7815e.add(bVar);
        }
        m12555g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo24050b(C4399z zVar) {
        this.f7817g.add(zVar);
    }

    /* renamed from: c */
    public synchronized ExecutorService mo24051c() {
        if (this.f7814d == null) {
            this.f7814d = new ThreadPoolExecutor(0, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 60, TimeUnit.SECONDS, new SynchronousQueue(), C4345c.m12350G("OkHttp Dispatcher", false));
        }
        return this.f7814d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo24052e(C4399z.C4401b bVar) {
        m12554d(this.f7816f, bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo24053f(C4399z zVar) {
        m12554d(this.f7817g, zVar);
    }

    /* renamed from: h */
    public synchronized int mo24054h() {
        return this.f7816f.size() + this.f7817g.size();
    }
}
