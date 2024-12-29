package com.google.firebase.installations;

import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.C1609u;
import com.google.firebase.C2816c;
import com.google.firebase.installations.p135q.C3291b;
import com.google.firebase.installations.p135q.C3292c;
import com.google.firebase.installations.p135q.C3294d;
import com.google.firebase.installations.p136r.C3302c;
import com.google.firebase.installations.p136r.C3303d;
import com.google.firebase.installations.p136r.C3306e;
import com.google.firebase.p132h.C3198c;
import com.google.firebase.p138k.C3317h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p011c.p012a.p019b.p028b.p038e.C0619h;
import p011c.p012a.p019b.p028b.p038e.C0620i;

/* renamed from: com.google.firebase.installations.g */
public class C3274g implements C3277h {

    /* renamed from: k */
    private static final Object f6334k = new Object();

    /* renamed from: l */
    private static final ThreadFactory f6335l = new C3275a();

    /* renamed from: a */
    private final C2816c f6336a;

    /* renamed from: b */
    private final C3302c f6337b;

    /* renamed from: c */
    private final C3292c f6338c;

    /* renamed from: d */
    private final C3287p f6339d;

    /* renamed from: e */
    private final C3291b f6340e;

    /* renamed from: f */
    private final C3285n f6341f;

    /* renamed from: g */
    private final Object f6342g;

    /* renamed from: h */
    private final ExecutorService f6343h;

    /* renamed from: i */
    private final ExecutorService f6344i;
    @GuardedBy("lock")

    /* renamed from: j */
    private final List<C3286o> f6345j;

    /* renamed from: com.google.firebase.installations.g$a */
    class C3275a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f6346a = new AtomicInteger(1);

        C3275a() {
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", new Object[]{Integer.valueOf(this.f6346a.getAndIncrement())}));
        }
    }

    /* renamed from: com.google.firebase.installations.g$b */
    static /* synthetic */ class C3276b {

        /* renamed from: a */
        static final /* synthetic */ int[] f6347a;

        /* renamed from: b */
        static final /* synthetic */ int[] f6348b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        static {
            /*
                com.google.firebase.installations.r.e$b[] r0 = com.google.firebase.installations.p136r.C3306e.C3308b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6348b = r0
                r1 = 1
                com.google.firebase.installations.r.e$b r2 = com.google.firebase.installations.p136r.C3306e.C3308b.OK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f6348b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.installations.r.e$b r3 = com.google.firebase.installations.p136r.C3306e.C3308b.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = f6348b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.installations.r.e$b r3 = com.google.firebase.installations.p136r.C3306e.C3308b.AUTH_ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.google.firebase.installations.r.d$b[] r2 = com.google.firebase.installations.p136r.C3303d.C3305b.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f6347a = r2
                com.google.firebase.installations.r.d$b r3 = com.google.firebase.installations.p136r.C3303d.C3305b.OK     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f6347a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.google.firebase.installations.r.d$b r2 = com.google.firebase.installations.p136r.C3303d.C3305b.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C3274g.C3276b.<clinit>():void");
        }
    }

    C3274g(C2816c cVar, @Nullable C3317h hVar, @Nullable C3198c cVar2) {
        this(new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), f6335l), cVar, new C3302c(cVar.mo17061g(), hVar, cVar2), new C3292c(cVar), new C3287p(), new C3291b(cVar), new C3285n());
    }

    C3274g(ExecutorService executorService, C2816c cVar, C3302c cVar2, C3292c cVar3, C3287p pVar, C3291b bVar, C3285n nVar) {
        this.f6342g = new Object();
        this.f6345j = new ArrayList();
        this.f6336a = cVar;
        this.f6337b = cVar2;
        this.f6338c = cVar3;
        this.f6339d = pVar;
        this.f6340e = bVar;
        this.f6341f = nVar;
        this.f6343h = executorService;
        this.f6344i = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), f6335l);
    }

    /* renamed from: e */
    private C0619h<C3283m> m10149e() {
        C0620i iVar = new C0620i();
        C3281k kVar = new C3281k(this.f6339d, iVar);
        synchronized (this.f6342g) {
            this.f6345j.add(kVar);
        }
        return iVar.mo8666a();
    }

    /* renamed from: f */
    private C0619h<String> m10150f() {
        C0620i iVar = new C0620i();
        C3282l lVar = new C3282l(iVar);
        synchronized (this.f6342g) {
            this.f6345j.add(lVar);
        }
        return iVar.mo8666a();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m10151g() {
        m10155k(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void m10152h() {
        m10155k(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final void m10153i() {
        m10155k(false);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m10154j(boolean r3) {
        /*
            r2 = this;
            com.google.firebase.installations.q.d r0 = r2.m10157o()
            boolean r1 = r0.mo17928i()     // Catch:{ IOException -> 0x004e }
            if (r1 != 0) goto L_0x0022
            boolean r1 = r0.mo17931l()     // Catch:{ IOException -> 0x004e }
            if (r1 == 0) goto L_0x0011
            goto L_0x0022
        L_0x0011:
            if (r3 != 0) goto L_0x001d
            com.google.firebase.installations.p r3 = r2.f6339d     // Catch:{ IOException -> 0x004e }
            boolean r3 = r3.mo17904b(r0)     // Catch:{ IOException -> 0x004e }
            if (r3 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            return
        L_0x001d:
            com.google.firebase.installations.q.d r3 = r2.m10156l(r0)     // Catch:{ IOException -> 0x004e }
            goto L_0x0026
        L_0x0022:
            com.google.firebase.installations.q.d r3 = r2.m10161t(r0)     // Catch:{ IOException -> 0x004e }
        L_0x0026:
            com.google.firebase.installations.q.c r0 = r2.f6338c
            r0.mo17926a(r3)
            boolean r0 = r3.mo17928i()
            if (r0 == 0) goto L_0x003c
            com.google.firebase.installations.i r0 = new com.google.firebase.installations.i
            com.google.firebase.installations.i$a r1 = com.google.firebase.installations.C3278i.C3279a.BAD_CONFIG
            r0.<init>(r1)
        L_0x0038:
            r2.m10162u(r3, r0)
            goto L_0x004d
        L_0x003c:
            boolean r0 = r3.mo17929j()
            if (r0 == 0) goto L_0x004a
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "cleared fid due to auth error"
            r0.<init>(r1)
            goto L_0x0038
        L_0x004a:
            r2.m10163v(r3)
        L_0x004d:
            return
        L_0x004e:
            r3 = move-exception
            r2.m10162u(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C3274g.m10154j(boolean):void");
    }

    /* renamed from: k */
    private final void m10155k(boolean z) {
        C3294d o = m10157o();
        if (z) {
            o = o.mo17934p();
        }
        m10163v(o);
        this.f6344i.execute(C3273f.m10145b(this, z));
    }

    /* renamed from: l */
    private C3294d m10156l(@NonNull C3294d dVar) {
        C3306e d = this.f6337b.mo17964d(mo17896m(), dVar.mo17907d(), mo17898p(), dVar.mo17910f());
        int i = C3276b.f6348b[d.mo17953b().ordinal()];
        if (i == 1) {
            return dVar.mo17933o(d.mo17954c(), d.mo17955d(), this.f6339d.mo17903a());
        } else if (i == 2) {
            return dVar.mo17935q("BAD CONFIG");
        } else {
            if (i == 3) {
                return dVar.mo17936r();
            }
            throw new IOException();
        }
    }

    /* renamed from: o */
    private C3294d m10157o() {
        C3294d c;
        synchronized (f6334k) {
            C3269b a = C3269b.m10140a(this.f6336a.mo17061g(), "generatefid.lock");
            try {
                c = this.f6338c.mo17927c();
                if (c.mo17929j()) {
                    String s = m10160s(c);
                    C3292c cVar = this.f6338c;
                    c = c.mo17938t(s);
                    cVar.mo17926a(c);
                }
                if (a != null) {
                    a.mo17889b();
                }
            } catch (Throwable th) {
                if (a != null) {
                    a.mo17889b();
                }
                throw th;
            }
        }
        return c;
    }

    /* renamed from: r */
    private void m10159r() {
        C1609u.m4471g(mo17897n());
        C1609u.m4471g(mo17898p());
        C1609u.m4471g(mo17896m());
    }

    /* renamed from: s */
    private String m10160s(C3294d dVar) {
        if ((!this.f6336a.mo17063i().equals("CHIME_ANDROID_SDK") && !this.f6336a.mo17067q()) || !dVar.mo17932m()) {
            return this.f6341f.mo17902a();
        }
        String f = this.f6340e.mo17924f();
        return TextUtils.isEmpty(f) ? this.f6341f.mo17902a() : f;
    }

    /* renamed from: t */
    private C3294d m10161t(C3294d dVar) {
        C3303d c = this.f6337b.mo17963c(mo17896m(), dVar.mo17907d(), mo17898p(), mo17897n(), dVar.mo17907d().length() == 11 ? this.f6340e.mo17925i() : null);
        int i = C3276b.f6347a[c.mo17942e().ordinal()];
        if (i == 1) {
            return dVar.mo17937s(c.mo17940c(), c.mo17941d(), this.f6339d.mo17903a(), c.mo17939b().mo17954c(), c.mo17939b().mo17955d());
        } else if (i == 2) {
            return dVar.mo17935q("BAD CONFIG");
        } else {
            throw new IOException();
        }
    }

    /* renamed from: u */
    private void m10162u(C3294d dVar, Exception exc) {
        synchronized (this.f6342g) {
            Iterator<C3286o> it = this.f6345j.iterator();
            while (it.hasNext()) {
                if (it.next().mo17900a(dVar, exc)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: v */
    private void m10163v(C3294d dVar) {
        synchronized (this.f6342g) {
            Iterator<C3286o> it = this.f6345j.iterator();
            while (it.hasNext()) {
                if (it.next().mo17901b(dVar)) {
                    it.remove();
                }
            }
        }
    }

    @NonNull
    /* renamed from: a */
    public C0619h<C3283m> mo17894a(boolean z) {
        ExecutorService executorService;
        Runnable runnable;
        m10159r();
        C0619h<C3283m> e = m10149e();
        if (z) {
            executorService = this.f6343h;
            runnable = C3271d.m10143b(this);
        } else {
            executorService = this.f6343h;
            runnable = C3272e.m10144b(this);
        }
        executorService.execute(runnable);
        return e;
    }

    @NonNull
    public C0619h<String> getId() {
        m10159r();
        C0619h<String> f = m10150f();
        this.f6343h.execute(C3270c.m10142b(this));
        return f;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: m */
    public String mo17896m() {
        return this.f6336a.mo17064j().mo17741b();
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: n */
    public String mo17897n() {
        return this.f6336a.mo17064j().mo17742c();
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: p */
    public String mo17898p() {
        return TextUtils.isEmpty(this.f6336a.mo17064j().mo17744e()) ? this.f6336a.mo17064j().mo17743d() : this.f6336a.mo17064j().mo17744e();
    }
}
