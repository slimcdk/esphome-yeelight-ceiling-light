package p164h.p211a.p212a.p222f.p224w;

import com.miot.service.connection.wifi.SmartConfigDataProvider;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import p154d.p155b.C10730p;
import p154d.p155b.p204f0.C10709c;
import p154d.p155b.p204f0.C10711e;
import p164h.p211a.p212a.p222f.C11032i;
import p164h.p211a.p212a.p222f.C11037n;
import p164h.p211a.p212a.p222f.C11040p;
import p164h.p211a.p212a.p228h.C11126j;
import p164h.p211a.p212a.p228h.C11128l;

/* renamed from: h.a.a.f.w.f */
public class C11057f extends C11051b {

    /* renamed from: j */
    private final boolean f21745j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public volatile C11032i[] f21746k;

    /* renamed from: l */
    private boolean f21747l;

    /* renamed from: h.a.a.f.w.f$a */
    class C11058a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ClassLoader f21748a;

        /* renamed from: b */
        final /* synthetic */ int f21749b;

        /* renamed from: c */
        final /* synthetic */ C11128l f21750c;

        /* renamed from: d */
        final /* synthetic */ CountDownLatch f21751d;

        C11058a(ClassLoader classLoader, int i, C11128l lVar, CountDownLatch countDownLatch) {
            this.f21748a = classLoader;
            this.f21749b = i;
            this.f21750c = lVar;
            this.f21751d = countDownLatch;
        }

        public void run() {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            try {
                Thread.currentThread().setContextClassLoader(this.f21748a);
                C11057f.this.f21746k[this.f21749b].start();
            } catch (Throwable th) {
                Thread.currentThread().setContextClassLoader(contextClassLoader);
                this.f21751d.countDown();
                throw th;
            }
            Thread.currentThread().setContextClassLoader(contextClassLoader);
            this.f21751d.countDown();
        }
    }

    public C11057f() {
        this.f21747l = false;
        this.f21745j = false;
    }

    public C11057f(boolean z) {
        this.f21747l = false;
        this.f21745j = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J0 */
    public Object mo35049J0(Object obj, Class cls) {
        C11032i[] n = mo34903n();
        int i = 0;
        while (n != null && i < n.length) {
            obj = mo35050K0(n[i], obj, cls);
            i++;
        }
        return obj;
    }

    /* renamed from: L */
    public void mo34757L(String str, C11037n nVar, C10709c cVar, C10711e eVar) {
        if (this.f21746k != null && mo35452j0()) {
            C11128l lVar = null;
            for (int i = 0; i < this.f21746k.length; i++) {
                try {
                    this.f21746k[i].mo34757L(str, nVar, cVar, eVar);
                } catch (IOException e) {
                    throw e;
                } catch (RuntimeException e2) {
                    throw e2;
                } catch (Exception e3) {
                    if (lVar == null) {
                        lVar = new C11128l();
                    }
                    lVar.mo35374a(e3);
                }
            }
            if (lVar == null) {
                return;
            }
            if (lVar.mo35379f() == 1) {
                throw new C10730p(lVar.mo35375b(0));
            }
            throw new C10730p((Throwable) lVar);
        }
    }

    /* renamed from: N0 */
    public void mo35095N0(C11032i iVar) {
        mo35086O0((C11032i[]) C11126j.m28881d(mo34903n(), iVar, C11032i.class));
    }

    /* renamed from: O0 */
    public void mo35086O0(C11032i[] iVarArr) {
        if (this.f21745j || !mo35452j0()) {
            C11032i[] iVarArr2 = this.f21746k == null ? null : (C11032i[]) this.f21746k.clone();
            this.f21746k = iVarArr;
            C11040p d = mo34900d();
            C11128l lVar = new C11128l();
            int i = 0;
            int i2 = 0;
            while (iVarArr != null && i2 < iVarArr.length) {
                if (iVarArr[i2].mo34900d() != d) {
                    iVarArr[i2].mo34901i(d);
                }
                i2++;
            }
            if (mo34900d() != null) {
                mo34900d().mo35003Q0().mo35468g(this, iVarArr2, iVarArr, SmartConfigDataProvider.KEY_HANDLER);
            }
            while (iVarArr2 != null && i < iVarArr2.length) {
                if (iVarArr2[i] != null) {
                    try {
                        if (iVarArr2[i].mo35452j0()) {
                            iVarArr2[i].stop();
                        }
                    } catch (Throwable th) {
                        lVar.mo35374a(th);
                    }
                }
                i++;
            }
            lVar.mo35378e();
            return;
        }
        throw new IllegalStateException("STARTED");
    }

    /* renamed from: i */
    public void mo34901i(C11040p pVar) {
        if (!mo35452j0()) {
            C11040p d = mo34900d();
            super.mo34901i(pVar);
            C11032i[] n = mo34903n();
            int i = 0;
            while (n != null && i < n.length) {
                n[i].mo34901i(pVar);
                i++;
            }
            if (pVar != null && pVar != d) {
                pVar.mo35003Q0().mo35468g(this, (Object[]) null, this.f21746k, SmartConfigDataProvider.KEY_HANDLER);
                return;
            }
            return;
        }
        throw new IllegalStateException("STARTED");
    }

    /* renamed from: n */
    public C11032i[] mo34903n() {
        return this.f21746k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public void mo34262p0() {
        C11128l lVar = new C11128l();
        if (this.f21746k != null) {
            if (this.f21747l) {
                CountDownLatch countDownLatch = new CountDownLatch(this.f21746k.length);
                ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
                for (int i = 0; i < this.f21746k.length; i++) {
                    mo34900d().mo35008V0().mo35291e0(new C11058a(contextClassLoader, i, lVar, countDownLatch));
                }
                countDownLatch.await();
            } else {
                for (int i2 = 0; i2 < this.f21746k.length; i2++) {
                    try {
                        this.f21746k[i2].start();
                    } catch (Throwable th) {
                        lVar.mo35374a(th);
                    }
                }
            }
        }
        super.mo34262p0();
        lVar.mo35376c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q0 */
    public void mo34263q0() {
        C11128l lVar = new C11128l();
        try {
            super.mo34263q0();
        } catch (Throwable th) {
            lVar.mo35374a(th);
        }
        if (this.f21746k != null) {
            int length = this.f21746k.length;
            while (true) {
                int i = length - 1;
                if (length <= 0) {
                    break;
                }
                try {
                    this.f21746k[i].stop();
                } catch (Throwable th2) {
                    lVar.mo35374a(th2);
                }
                length = i;
            }
        }
        lVar.mo35376c();
    }
}
