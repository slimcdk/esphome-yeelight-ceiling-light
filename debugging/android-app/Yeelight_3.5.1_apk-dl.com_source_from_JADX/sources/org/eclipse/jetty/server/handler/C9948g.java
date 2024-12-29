package org.eclipse.jetty.server.handler;

import com.miot.service.connection.wifi.SmartConfigDataProvider;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import javax.servlet.ServletException;
import javax.servlet.http.C9277a;
import javax.servlet.http.C9279c;
import org.eclipse.jetty.util.LazyList;
import org.eclipse.jetty.util.MultiException;
import p239z5.C12175i;
import p239z5.C12181o;
import p239z5.C12187r;

/* renamed from: org.eclipse.jetty.server.handler.g */
public class C9948g extends C9941b {

    /* renamed from: j */
    private final boolean f18259j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public volatile C12175i[] f18260k;

    /* renamed from: l */
    private boolean f18261l;

    /* renamed from: org.eclipse.jetty.server.handler.g$a */
    class C9949a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ClassLoader f18262a;

        /* renamed from: b */
        final /* synthetic */ int f18263b;

        /* renamed from: c */
        final /* synthetic */ MultiException f18264c;

        /* renamed from: d */
        final /* synthetic */ CountDownLatch f18265d;

        C9949a(ClassLoader classLoader, int i, MultiException multiException, CountDownLatch countDownLatch) {
            this.f18262a = classLoader;
            this.f18263b = i;
            this.f18264c = multiException;
            this.f18265d = countDownLatch;
        }

        public void run() {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            try {
                Thread.currentThread().setContextClassLoader(this.f18262a);
                C9948g.this.f18260k[this.f18263b].start();
            } catch (Throwable th) {
                Thread.currentThread().setContextClassLoader(contextClassLoader);
                this.f18265d.countDown();
                throw th;
            }
            Thread.currentThread().setContextClassLoader(contextClassLoader);
            this.f18265d.countDown();
        }
    }

    public C9948g() {
        this.f18261l = false;
        this.f18259j = false;
    }

    public C9948g(boolean z) {
        this.f18261l = false;
        this.f18259j = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O0 */
    public Object mo39920O0(Object obj, Class cls) {
        C12175i[] o = mo39981o();
        int i = 0;
        while (o != null && i < o.length) {
            obj = mo39922P0(o[i], obj, cls);
            i++;
        }
        return obj;
    }

    /* renamed from: S0 */
    public void mo39980S0(C12175i iVar) {
        mo39970T0((C12175i[]) LazyList.addToArray(mo39981o(), iVar, C12175i.class));
    }

    /* renamed from: T0 */
    public void mo39970T0(C12175i[] iVarArr) {
        if (this.f18259j || !mo36748n0()) {
            C12175i[] iVarArr2 = this.f18260k == null ? null : (C12175i[]) this.f18260k.clone();
            this.f18260k = iVarArr;
            C12187r c = mo39919c();
            MultiException multiException = new MultiException();
            int i = 0;
            int i2 = 0;
            while (iVarArr != null && i2 < iVarArr.length) {
                if (iVarArr[i2].mo39919c() != c) {
                    iVarArr[i2].mo26716i(c);
                }
                i2++;
            }
            if (mo39919c() != null) {
                mo39919c().mo43169V0().mo36767g(this, iVarArr2, iVarArr, SmartConfigDataProvider.KEY_HANDLER);
            }
            while (iVarArr2 != null && i < iVarArr2.length) {
                if (iVarArr2[i] != null) {
                    try {
                        if (iVarArr2[i].mo36748n0()) {
                            iVarArr2[i].stop();
                        }
                    } catch (Throwable th) {
                        multiException.add(th);
                    }
                }
                i++;
            }
            multiException.ifExceptionThrowRuntime();
            return;
        }
        throw new IllegalStateException("STARTED");
    }

    /* renamed from: i */
    public void mo26716i(C12187r rVar) {
        if (!mo36748n0()) {
            C12187r c = mo39919c();
            super.mo26716i(rVar);
            C12175i[] o = mo39981o();
            int i = 0;
            while (o != null && i < o.length) {
                o[i].mo26716i(rVar);
                i++;
            }
            if (rVar != null && rVar != c) {
                rVar.mo43169V0().mo36767g(this, (Object[]) null, this.f18260k, SmartConfigDataProvider.KEY_HANDLER);
                return;
            }
            return;
        }
        throw new IllegalStateException("STARTED");
    }

    /* renamed from: o */
    public C12175i[] mo39981o() {
        return this.f18260k;
    }

    /* renamed from: q */
    public void mo39972q(String str, C12181o oVar, C9277a aVar, C9279c cVar) {
        if (this.f18260k != null && mo36748n0()) {
            MultiException multiException = null;
            for (int i = 0; i < this.f18260k.length; i++) {
                try {
                    this.f18260k[i].mo39972q(str, oVar, aVar, cVar);
                } catch (IOException e) {
                    throw e;
                } catch (RuntimeException e2) {
                    throw e2;
                } catch (Exception e3) {
                    if (multiException == null) {
                        multiException = new MultiException();
                    }
                    multiException.add(e3);
                }
            }
            if (multiException == null) {
                return;
            }
            if (multiException.size() == 1) {
                throw new ServletException(multiException.getThrowable(0));
            }
            throw new ServletException((Throwable) multiException);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public void mo26547u0() {
        MultiException multiException = new MultiException();
        if (this.f18260k != null) {
            if (this.f18261l) {
                CountDownLatch countDownLatch = new CountDownLatch(this.f18260k.length);
                ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
                for (int i = 0; i < this.f18260k.length; i++) {
                    mo39919c().mo43174a1().mo37186h0(new C9949a(contextClassLoader, i, multiException, countDownLatch));
                }
                countDownLatch.await();
            } else {
                for (int i2 = 0; i2 < this.f18260k.length; i2++) {
                    try {
                        this.f18260k[i2].start();
                    } catch (Throwable th) {
                        multiException.add(th);
                    }
                }
            }
        }
        super.mo26547u0();
        multiException.ifExceptionThrow();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v0 */
    public void mo26548v0() {
        MultiException multiException = new MultiException();
        try {
            super.mo26548v0();
        } catch (Throwable th) {
            multiException.add(th);
        }
        if (this.f18260k != null) {
            int length = this.f18260k.length;
            while (true) {
                int i = length - 1;
                if (length <= 0) {
                    break;
                }
                try {
                    this.f18260k[i].stop();
                } catch (Throwable th2) {
                    multiException.add(th2);
                }
                length = i;
            }
        }
        multiException.ifExceptionThrow();
    }
}
