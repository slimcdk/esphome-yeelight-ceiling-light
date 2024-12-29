package org.eclipse.jetty.client;

import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import org.apache.commons.p194io.IOUtils;
import org.eclipse.jetty.client.C9871g;
import org.eclipse.jetty.client.C9880k;
import org.eclipse.jetty.http.C9894g;
import org.eclipse.jetty.http.PathMap;
import p147d6.C8942b;
import p147d6.C8948d;
import p152e6.C9001b;
import p152e6.C9003c;
import p217u5.C10534a;
import p217u5.C10539f;
import p225w5.C11940d;
import p225w5.C11946h;
import p225w5.C11950k;

public class HttpDestination implements C8948d {

    /* renamed from: q */
    private static final C9003c f17863q = C9001b.m21450a(HttpDestination.class);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final List<C9877j> f17864a = new LinkedList();

    /* renamed from: b */
    private final List<C9861a> f17865b = new LinkedList();

    /* renamed from: c */
    private final BlockingQueue<Object> f17866c = new ArrayBlockingQueue(10, true);

    /* renamed from: d */
    private final List<C9861a> f17867d = new ArrayList();

    /* renamed from: e */
    private final C9871g f17868e;

    /* renamed from: f */
    private final C9866b f17869f;

    /* renamed from: g */
    private final boolean f17870g;

    /* renamed from: h */
    private final C11946h f17871h;

    /* renamed from: i */
    private volatile int f17872i;

    /* renamed from: j */
    private volatile int f17873j;

    /* renamed from: k */
    private int f17874k = 0;

    /* renamed from: l */
    private int f17875l = 0;

    /* renamed from: m */
    private volatile C9866b f17876m;

    /* renamed from: n */
    private C10534a f17877n;

    /* renamed from: o */
    private PathMap f17878o;

    /* renamed from: p */
    private List<C9894g> f17879p;

    /* renamed from: org.eclipse.jetty.client.HttpDestination$a */
    private class C9860a extends C9870f {

        /* renamed from: B */
        private final C9880k.C9883c f17880B;

        /* renamed from: C */
        private final C9877j f17881C;

        public C9860a(C9866b bVar, C9880k.C9883c cVar, C9877j jVar) {
            this.f17880B = cVar;
            this.f17881C = jVar;
            mo39606N("CONNECT");
            mo39619b0(jVar.mo39640v());
            String bVar2 = bVar.toString();
            mo39612T(bVar2);
            mo39620c("Host", bVar2);
            mo39620c("Proxy-Connection", "keep-alive");
            mo39620c("User-Agent", "Jetty-Client");
        }

        /* access modifiers changed from: protected */
        /* renamed from: C */
        public void mo39516C() {
            int f0 = mo39561f0();
            if (f0 == 200) {
                this.f17880B.mo39650a();
            } else if (f0 == 504) {
                mo39517z();
            } else {
                mo26744y(new ProtocolException("Proxy: " + this.f17880B.mo39658h() + Constants.COLON_SEPARATOR + this.f17880B.mo39675y() + " didn't return http return code 200, but " + f0 + " while trying to request: " + this.f17881C.mo39627j().toString()));
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: x */
        public void mo26743x(Throwable th) {
            HttpDestination.this.mo39504n(th);
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public void mo26744y(Throwable th) {
            HttpDestination.this.f17864a.remove(this.f17881C);
            if (this.f17881C.mo39616X(9)) {
                this.f17881C.mo39628k().mo39547i(th);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: z */
        public void mo39517z() {
            HttpDestination.this.f17864a.remove(this.f17881C);
            if (this.f17881C.mo39616X(8)) {
                this.f17881C.mo39628k().mo39541c();
            }
        }
    }

    HttpDestination(C9871g gVar, C9866b bVar, boolean z) {
        this.f17868e = gVar;
        this.f17869f = bVar;
        this.f17870g = z;
        this.f17872i = gVar.mo39569U0();
        this.f17873j = gVar.mo39570V0();
        String a = bVar.mo39550a();
        if (bVar.mo39551b() != (z ? 443 : 80)) {
            a = a + Constants.COLON_SEPARATOR + bVar.mo39551b();
        }
        this.f17871h = new C11946h(a);
    }

    /* renamed from: b */
    public void mo39492b(String str, C10534a aVar) {
        synchronized (this) {
            if (this.f17878o == null) {
                this.f17878o = new PathMap();
            }
            this.f17878o.put(str, aVar);
        }
    }

    /* renamed from: c */
    public void mo39493c() {
        synchronized (this) {
            for (C9861a m : this.f17865b) {
                m.mo39521m();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo39494d(C9877j jVar) {
        C10534a aVar;
        List<C9894g> list = this.f17879p;
        if (list != null) {
            StringBuilder sb = null;
            for (C9894g next : list) {
                if (sb == null) {
                    sb = new StringBuilder();
                } else {
                    sb.append("; ");
                }
                sb.append(next.mo39771d());
                sb.append("=");
                sb.append(next.mo39773f());
            }
            if (sb != null) {
                jVar.mo39620c("Cookie", sb.toString());
            }
        }
        PathMap pathMap = this.f17878o;
        if (!(pathMap == null || (aVar = (C10534a) pathMap.match(jVar.mo39634q())) == null)) {
            aVar.mo42191a(jVar);
        }
        jVar.mo39603K(this);
        C9861a i = mo39499i();
        if (i != null) {
            mo39510t(i, jVar);
            return;
        }
        boolean z = false;
        synchronized (this) {
            if (this.f17864a.size() != this.f17873j) {
                this.f17864a.add(jVar);
                if (this.f17865b.size() + this.f17874k < this.f17872i) {
                    z = true;
                }
            } else {
                throw new RejectedExecutionException("Queue full for address " + this.f17869f);
            }
        }
        if (z) {
            mo39515x();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo39495e(C9877j jVar) {
        synchronized (this) {
            this.f17864a.remove(jVar);
        }
    }

    /* renamed from: f */
    public C9866b mo39496f() {
        return this.f17869f;
    }

    /* renamed from: g */
    public C11940d mo39497g() {
        return this.f17871h;
    }

    /* renamed from: h */
    public C9871g mo39498h() {
        return this.f17868e;
    }

    /* renamed from: i */
    public C9861a mo39499i() {
        C9861a aVar = null;
        do {
            synchronized (this) {
                if (aVar != null) {
                    this.f17865b.remove(aVar);
                    aVar.mo39521m();
                    aVar = null;
                }
                if (this.f17867d.size() > 0) {
                    List<C9861a> list = this.f17867d;
                    aVar = list.remove(list.size() - 1);
                }
            }
            if (aVar == null) {
                return null;
            }
        } while (!aVar.mo39520l());
        return aVar;
    }

    /* renamed from: j */
    public C9866b mo39500j() {
        return this.f17876m;
    }

    /* renamed from: k */
    public C10534a mo39501k() {
        return this.f17877n;
    }

    /* renamed from: l */
    public boolean mo39502l() {
        return this.f17876m != null;
    }

    /* renamed from: m */
    public boolean mo39503m() {
        return this.f17870g;
    }

    /* renamed from: n */
    public void mo39504n(Throwable th) {
        boolean z;
        synchronized (this) {
            z = true;
            this.f17874k--;
            int i = this.f17875l;
            if (i > 0) {
                this.f17875l = i - 1;
            } else {
                if (this.f17864a.size() > 0) {
                    C9877j remove = this.f17864a.remove(0);
                    if (remove.mo39616X(9)) {
                        remove.mo39628k().mo39540b(th);
                    }
                    if (!this.f17864a.isEmpty() && this.f17868e.mo36748n0()) {
                        th = null;
                    }
                }
                th = null;
            }
            z = false;
        }
        if (z) {
            mo39515x();
        }
        if (th != null) {
            try {
                this.f17866c.put(th);
            } catch (InterruptedException e) {
                f17863q.mo36849d(e);
            }
        }
    }

    /* renamed from: o */
    public void mo39505o(Throwable th) {
        synchronized (this) {
            this.f17874k--;
            if (this.f17864a.size() > 0) {
                C9877j remove = this.f17864a.remove(0);
                if (remove.mo39616X(9)) {
                    remove.mo39628k().mo39547i(th);
                }
            }
        }
    }

    /* renamed from: p */
    public void mo39506p(C9861a aVar) {
        synchronized (this) {
            this.f17874k--;
            this.f17865b.add(aVar);
            int i = this.f17875l;
            if (i > 0) {
                this.f17875l = i - 1;
            } else {
                if (this.f17864a.size() == 0) {
                    aVar.mo39529t();
                    this.f17867d.add(aVar);
                } else {
                    C11950k g = aVar.mo42448g();
                    if (!mo39502l() || !(g instanceof C9880k.C9883c)) {
                        mo39510t(aVar, this.f17864a.remove(0));
                    } else {
                        C9860a aVar2 = new C9860a(mo39496f(), (C9880k.C9883c) g, this.f17864a.get(0));
                        aVar2.mo39604L(mo39500j());
                        mo39510t(aVar, aVar2);
                    }
                }
                aVar = null;
            }
        }
        if (aVar != null) {
            try {
                this.f17866c.put(aVar);
            } catch (InterruptedException e) {
                f17863q.mo36849d(e);
            }
        }
    }

    /* renamed from: p0 */
    public void mo26544p0(Appendable appendable, String str) {
        synchronized (this) {
            appendable.append(String.valueOf(this) + "idle=" + this.f17867d.size() + " pending=" + this.f17874k).append(IOUtils.LINE_SEPARATOR_UNIX);
            C8942b.m21357G0(appendable, str, this.f17865b);
        }
    }

    /* renamed from: q */
    public void mo39507q(C9877j jVar) {
        jVar.mo39628k().mo39546h();
        jVar.mo39602J();
        mo39494d(jVar);
    }

    /* renamed from: r */
    public void mo39508r(C9861a aVar, boolean z) {
        boolean z2;
        if (aVar.mo39525p()) {
            aVar.mo39531u(false);
        }
        if (z) {
            try {
                aVar.mo39521m();
            } catch (IOException e) {
                f17863q.mo36849d(e);
            }
        }
        if (this.f17868e.mo36748n0()) {
            if (z || !aVar.mo42448g().isOpen()) {
                synchronized (this) {
                    this.f17865b.remove(aVar);
                    z2 = !this.f17864a.isEmpty();
                }
                if (z2) {
                    mo39515x();
                    return;
                }
                return;
            }
            synchronized (this) {
                if (this.f17864a.size() == 0) {
                    aVar.mo39529t();
                    this.f17867d.add(aVar);
                } else {
                    mo39510t(aVar, this.f17864a.remove(0));
                }
                notifyAll();
            }
        }
    }

    /* renamed from: s */
    public void mo39509s(C9861a aVar) {
        aVar.mo42447f((aVar == null || aVar.mo42448g() == null) ? -1 : (long) aVar.mo42448g().mo39655f());
        boolean z = false;
        synchronized (this) {
            this.f17867d.remove(aVar);
            this.f17865b.remove(aVar);
            if (!this.f17864a.isEmpty() && this.f17868e.mo36748n0()) {
                z = true;
            }
        }
        if (z) {
            mo39515x();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo39510t(C9861a aVar, C9877j jVar) {
        synchronized (this) {
            if (!aVar.mo39527r(jVar)) {
                if (jVar.mo39636s() <= 1) {
                    this.f17864a.add(0, jVar);
                }
                mo39509s(aVar);
            }
        }
    }

    public synchronized String toString() {
        return String.format("HttpDestination@%x//%s:%d(%d/%d,%d,%d/%d)%n", new Object[]{Integer.valueOf(hashCode()), this.f17869f.mo39550a(), Integer.valueOf(this.f17869f.mo39551b()), Integer.valueOf(this.f17865b.size()), Integer.valueOf(this.f17872i), Integer.valueOf(this.f17867d.size()), Integer.valueOf(this.f17864a.size()), Integer.valueOf(this.f17873j)});
    }

    /* renamed from: u */
    public void mo39512u(C9877j jVar) {
        LinkedList<String> X0 = this.f17868e.mo39573X0();
        if (X0 != null) {
            int size = X0.size();
            while (size > 0) {
                String str = X0.get(size - 1);
                try {
                    jVar.mo39605M((C9875h) Class.forName(str).getDeclaredConstructor(new Class[]{HttpDestination.class, C9877j.class}).newInstance(new Object[]{this, jVar}));
                    size--;
                } catch (Exception e) {
                    throw new IOException("Unable to instantiate registered listener for destination: " + str, e) {
                        final /* synthetic */ Exception val$e;

                        {
                            this.val$e = r3;
                            initCause(r3);
                        }
                    };
                }
            }
        }
        if (this.f17868e.mo39580b1()) {
            jVar.mo39605M(new C10539f(this, jVar));
        }
        mo39494d(jVar);
    }

    /* renamed from: v */
    public void mo39513v(C9866b bVar) {
        this.f17876m = bVar;
    }

    /* renamed from: w */
    public void mo39514w(C10534a aVar) {
        this.f17877n = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo39515x() {
        try {
            synchronized (this) {
                this.f17874k++;
            }
            C9871g.C9873b bVar = this.f17868e.f17925o;
            if (bVar != null) {
                bVar.mo39594U(this);
            }
        } catch (Exception e) {
            f17863q.mo36848c(e);
            mo39504n(e);
        }
    }
}
