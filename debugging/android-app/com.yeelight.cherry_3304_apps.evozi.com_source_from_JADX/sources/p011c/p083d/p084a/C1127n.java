package p011c.p083d.p084a;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p011c.p083d.p084a.C1110e;
import p011c.p083d.p084a.p085d0.C1024k;
import p011c.p083d.p084a.p085d0.p087n.C1090h;

/* renamed from: c.d.a.n */
public final class C1127n {

    /* renamed from: a */
    private int f1790a = 64;

    /* renamed from: b */
    private int f1791b = 5;

    /* renamed from: c */
    private ExecutorService f1792c;

    /* renamed from: d */
    private final Deque<C1110e.C1113c> f1793d = new ArrayDeque();

    /* renamed from: e */
    private final Deque<C1110e.C1113c> f1794e = new ArrayDeque();

    /* renamed from: f */
    private final Deque<C1110e> f1795f = new ArrayDeque();

    /* renamed from: g */
    private void m2689g() {
        if (this.f1794e.size() < this.f1790a && !this.f1793d.isEmpty()) {
            Iterator<C1110e.C1113c> it = this.f1793d.iterator();
            while (it.hasNext()) {
                C1110e.C1113c next = it.next();
                if (m2690h(next) < this.f1791b) {
                    it.remove();
                    this.f1794e.add(next);
                    mo9735f().execute(next);
                }
                if (this.f1794e.size() >= this.f1790a) {
                    return;
                }
            }
        }
    }

    /* renamed from: h */
    private int m2690h(C1110e.C1113c cVar) {
        int i = 0;
        for (C1110e.C1113c i2 : this.f1794e) {
            if (i2.mo9677i().equals(cVar.mo9677i())) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: a */
    public synchronized void mo9730a(Object obj) {
        for (C1110e.C1113c next : this.f1793d) {
            if (C1024k.m2095f(obj, next.mo9678j())) {
                next.mo9675g();
            }
        }
        for (C1110e.C1113c next2 : this.f1794e) {
            if (C1024k.m2095f(obj, next2.mo9678j())) {
                next2.mo9676h().f1647c = true;
                C1090h hVar = next2.mo9676h().f1649e;
                if (hVar != null) {
                    hVar.mo9634l();
                }
            }
        }
        for (C1110e next3 : this.f1795f) {
            if (C1024k.m2095f(obj, next3.mo9674j())) {
                next3.mo9669d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo9731b(C1110e.C1113c cVar) {
        if (this.f1794e.size() >= this.f1790a || m2690h(cVar) >= this.f1791b) {
            this.f1793d.add(cVar);
        } else {
            this.f1794e.add(cVar);
            mo9735f().execute(cVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized void mo9732c(C1110e eVar) {
        this.f1795f.add(eVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized void mo9733d(C1110e.C1113c cVar) {
        if (this.f1794e.remove(cVar)) {
            m2689g();
        } else {
            throw new AssertionError("AsyncCall wasn't running!");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized void mo9734e(C1110e eVar) {
        if (!this.f1795f.remove(eVar)) {
            throw new AssertionError("Call wasn't in-flight!");
        }
    }

    /* renamed from: f */
    public synchronized ExecutorService mo9735f() {
        if (this.f1792c == null) {
            this.f1792c = new ThreadPoolExecutor(0, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 60, TimeUnit.SECONDS, new SynchronousQueue(), C1024k.m2106q("OkHttp Dispatcher", false));
        }
        return this.f1792c;
    }
}
