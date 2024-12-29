package okhttp3;

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
import okhttp3.C3555y;
import p056k5.C3300c;

/* renamed from: okhttp3.n */
public final class C3536n {

    /* renamed from: a */
    private int f5784a = 64;

    /* renamed from: b */
    private int f5785b = 5;
    @Nullable

    /* renamed from: c */
    private Runnable f5786c;
    @Nullable

    /* renamed from: d */
    private ExecutorService f5787d;

    /* renamed from: e */
    private final Deque<C3555y.C3557b> f5788e = new ArrayDeque();

    /* renamed from: f */
    private final Deque<C3555y.C3557b> f5789f = new ArrayDeque();

    /* renamed from: g */
    private final Deque<C3555y> f5790g = new ArrayDeque();

    /* renamed from: c */
    private <T> void m9757c(Deque<T> deque, T t) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t)) {
                runnable = this.f5786c;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (!m9758e() && runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: e */
    private boolean m9758e() {
        int i;
        boolean z;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<C3555y.C3557b> it = this.f5788e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C3555y.C3557b next = it.next();
                if (this.f5789f.size() >= this.f5784a) {
                    break;
                } else if (m9759g(next) < this.f5785b) {
                    it.remove();
                    arrayList.add(next);
                    this.f5789f.add(next);
                }
            }
            z = mo24513f() > 0;
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((C3555y.C3557b) arrayList.get(i)).mo24649d(mo24511b());
        }
        return z;
    }

    /* renamed from: g */
    private int m9759g(C3555y.C3557b bVar) {
        int i = 0;
        for (C3555y.C3557b next : this.f5789f) {
            if (!next.mo24650f().f5905f && next.mo24651o().equals(bVar.mo24651o())) {
                i++;
            }
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo24510a(C3555y.C3557b bVar) {
        synchronized (this) {
            this.f5788e.add(bVar);
        }
        m9758e();
    }

    /* renamed from: b */
    public synchronized ExecutorService mo24511b() {
        if (this.f5787d == null) {
            this.f5787d = new ThreadPoolExecutor(0, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 60, TimeUnit.SECONDS, new SynchronousQueue(), C3300c.m8912F("OkHttp Dispatcher", false));
        }
        return this.f5787d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo24512d(C3555y.C3557b bVar) {
        m9757c(this.f5789f, bVar);
    }

    /* renamed from: f */
    public synchronized int mo24513f() {
        return this.f5789f.size() + this.f5790g.size();
    }
}
