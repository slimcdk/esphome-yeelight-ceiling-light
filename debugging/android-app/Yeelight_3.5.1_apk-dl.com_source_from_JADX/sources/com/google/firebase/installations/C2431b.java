package com.google.firebase.installations;

import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.tasks.C1872a;
import com.google.android.gms.tasks.C1874c;
import com.google.firebase.C2406d;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.local.C2440b;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.remote.C2450c;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p065m0.C3339g;
import p070n1.C3377h;
import p077o1.C3502b;
import p081p1.C10262a;
import p081p1.C10263b;
import p081p1.C3595c;
import p081p1.C3596e;
import p085q1.C3616a;
import p089r1.C3623a;

/* renamed from: com.google.firebase.installations.b */
public class C2431b implements C3595c {

    /* renamed from: m */
    private static final Object f4091m = new Object();

    /* renamed from: n */
    private static final ThreadFactory f4092n = new C2432a();

    /* renamed from: a */
    private final C2406d f4093a;

    /* renamed from: b */
    private final C2450c f4094b;

    /* renamed from: c */
    private final PersistedInstallation f4095c;

    /* renamed from: d */
    private final C2436e f4096d;

    /* renamed from: e */
    private final C3623a f4097e;

    /* renamed from: f */
    private final C3596e f4098f;

    /* renamed from: g */
    private final Object f4099g;

    /* renamed from: h */
    private final ExecutorService f4100h;

    /* renamed from: i */
    private final ExecutorService f4101i;
    @GuardedBy("this")

    /* renamed from: j */
    private String f4102j;
    @GuardedBy("FirebaseInstallations.this")

    /* renamed from: k */
    private Set<C3616a> f4103k;
    @GuardedBy("lock")

    /* renamed from: l */
    private final List<C2435d> f4104l;

    /* renamed from: com.google.firebase.installations.b$a */
    class C2432a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f4105a = new AtomicInteger(1);

        C2432a() {
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", new Object[]{Integer.valueOf(this.f4105a.getAndIncrement())}));
        }
    }

    /* renamed from: com.google.firebase.installations.b$b */
    static /* synthetic */ class C2433b {

        /* renamed from: a */
        static final /* synthetic */ int[] f4106a;

        /* renamed from: b */
        static final /* synthetic */ int[] f4107b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        static {
            /*
                com.google.firebase.installations.remote.TokenResult$ResponseCode[] r0 = com.google.firebase.installations.remote.TokenResult.ResponseCode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4107b = r0
                r1 = 1
                com.google.firebase.installations.remote.TokenResult$ResponseCode r2 = com.google.firebase.installations.remote.TokenResult.ResponseCode.OK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f4107b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.installations.remote.TokenResult$ResponseCode r3 = com.google.firebase.installations.remote.TokenResult.ResponseCode.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = f4107b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.installations.remote.TokenResult$ResponseCode r3 = com.google.firebase.installations.remote.TokenResult.ResponseCode.AUTH_ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.google.firebase.installations.remote.InstallationResponse$ResponseCode[] r2 = com.google.firebase.installations.remote.InstallationResponse.ResponseCode.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f4106a = r2
                com.google.firebase.installations.remote.InstallationResponse$ResponseCode r3 = com.google.firebase.installations.remote.InstallationResponse.ResponseCode.OK     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f4106a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.google.firebase.installations.remote.InstallationResponse$ResponseCode r2 = com.google.firebase.installations.remote.InstallationResponse.ResponseCode.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C2431b.C2433b.<clinit>():void");
        }
    }

    C2431b(C2406d dVar, @NonNull C3502b<C3377h> bVar) {
        this(new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), f4092n), dVar, new C2450c(dVar.mo18983j(), bVar), new PersistedInstallation(dVar), C2436e.m6526c(), new C3623a(dVar), new C3596e());
    }

    C2431b(ExecutorService executorService, C2406d dVar, C2450c cVar, PersistedInstallation persistedInstallation, C2436e eVar, C3623a aVar, C3596e eVar2) {
        this.f4099g = new Object();
        this.f4103k = new HashSet();
        this.f4104l = new ArrayList();
        this.f4093a = dVar;
        this.f4094b = cVar;
        this.f4095c = persistedInstallation;
        this.f4096d = eVar;
        this.f4097e = aVar;
        this.f4098f = eVar2;
        this.f4100h = executorService;
        this.f4101i = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), f4092n);
    }

    /* renamed from: c */
    private C3339g<String> m6499c() {
        C1872a aVar = new C1872a();
        m6500d(new C2434c(aVar));
        return aVar.mo14736a();
    }

    /* renamed from: d */
    private void m6500d(C2435d dVar) {
        synchronized (this.f4099g) {
            this.f4104l.add(dVar);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004a  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m6510q(boolean r3) {
        /*
            r2 = this;
            com.google.firebase.installations.local.b r0 = r2.m6507m()
            boolean r1 = r0.mo19085i()     // Catch:{ FirebaseInstallationsException -> 0x005c }
            if (r1 != 0) goto L_0x0022
            boolean r1 = r0.mo19088l()     // Catch:{ FirebaseInstallationsException -> 0x005c }
            if (r1 == 0) goto L_0x0011
            goto L_0x0022
        L_0x0011:
            if (r3 != 0) goto L_0x001d
            com.google.firebase.installations.e r3 = r2.f4096d     // Catch:{ FirebaseInstallationsException -> 0x005c }
            boolean r3 = r3.mo19063f(r0)     // Catch:{ FirebaseInstallationsException -> 0x005c }
            if (r3 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            return
        L_0x001d:
            com.google.firebase.installations.local.b r3 = r2.m6503g(r0)     // Catch:{ FirebaseInstallationsException -> 0x005c }
            goto L_0x0026
        L_0x0022:
            com.google.firebase.installations.local.b r3 = r2.m6514u(r0)     // Catch:{ FirebaseInstallationsException -> 0x005c }
        L_0x0026:
            r2.m6509p(r3)
            r2.m6518y(r0, r3)
            boolean r0 = r3.mo19087k()
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = r3.mo19068d()
            r2.m6517x(r0)
        L_0x0039:
            boolean r0 = r3.mo19085i()
            if (r0 == 0) goto L_0x004a
            com.google.firebase.installations.FirebaseInstallationsException r3 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$Status r0 = com.google.firebase.installations.FirebaseInstallationsException.Status.BAD_CONFIG
            r3.<init>(r0)
        L_0x0046:
            r2.m6515v(r3)
            goto L_0x005b
        L_0x004a:
            boolean r0 = r3.mo19086j()
            if (r0 == 0) goto L_0x0058
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r3.<init>(r0)
            goto L_0x0046
        L_0x0058:
            r2.m6516w(r3)
        L_0x005b:
            return
        L_0x005c:
            r3 = move-exception
            r2.m6515v(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C2431b.m6510q(boolean):void");
    }

    /* renamed from: f */
    private final void m6502f(boolean z) {
        C2440b n = m6508n();
        if (z) {
            n = n.mo19091p();
        }
        m6516w(n);
        this.f4101i.execute(new C10263b(this, z));
    }

    /* renamed from: g */
    private C2440b m6503g(@NonNull C2440b bVar) {
        TokenResult e = this.f4094b.mo19121e(mo19054h(), bVar.mo19068d(), mo19056o(), bVar.mo19071f());
        int i = C2433b.f4107b[e.mo19107b().ordinal()];
        if (i == 1) {
            return bVar.mo19090o(e.mo19108c(), e.mo19109d(), this.f4096d.mo19061b());
        } else if (i == 2) {
            return bVar.mo19092q("BAD CONFIG");
        } else {
            if (i == 3) {
                m6517x((String) null);
                return bVar.mo19093r();
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    /* renamed from: j */
    private synchronized String m6504j() {
        return this.f4102j;
    }

    @NonNull
    /* renamed from: k */
    public static C2431b m6505k() {
        return m6506l(C2406d.m6394k());
    }

    @NonNull
    /* renamed from: l */
    public static C2431b m6506l(@NonNull C2406d dVar) {
        C0917i.m1411b(dVar != null, "Null is not a valid value of FirebaseApp.");
        return (C2431b) dVar.mo18982i(C3595c.class);
    }

    /* renamed from: m */
    private C2440b m6507m() {
        C2440b d;
        synchronized (f4091m) {
            C2430a a = C2430a.m6495a(this.f4093a.mo18983j(), "generatefid.lock");
            try {
                d = this.f4095c.mo19065d();
                if (a != null) {
                    a.mo19052b();
                }
            } catch (Throwable th) {
                if (a != null) {
                    a.mo19052b();
                }
                throw th;
            }
        }
        return d;
    }

    /* renamed from: n */
    private C2440b m6508n() {
        C2440b d;
        synchronized (f4091m) {
            C2430a a = C2430a.m6495a(this.f4093a.mo18983j(), "generatefid.lock");
            try {
                d = this.f4095c.mo19065d();
                if (d.mo19086j()) {
                    d = this.f4095c.mo19064b(d.mo19095t(m6513t(d)));
                }
                if (a != null) {
                    a.mo19052b();
                }
            } catch (Throwable th) {
                if (a != null) {
                    a.mo19052b();
                }
                throw th;
            }
        }
        return d;
    }

    /* renamed from: p */
    private void m6509p(C2440b bVar) {
        synchronized (f4091m) {
            C2430a a = C2430a.m6495a(this.f4093a.mo18983j(), "generatefid.lock");
            try {
                this.f4095c.mo19064b(bVar);
                if (a != null) {
                    a.mo19052b();
                }
            } catch (Throwable th) {
                if (a != null) {
                    a.mo19052b();
                }
                throw th;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m6511r() {
        m6502f(false);
    }

    /* renamed from: s */
    private void m6512s() {
        C0917i.m1416g(mo19055i(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C0917i.m1416g(mo19056o(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C0917i.m1416g(mo19054h(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C0917i.m1411b(C2436e.m6529h(mo19055i()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C0917i.m1411b(C2436e.m6528g(mo19054h()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* renamed from: t */
    private String m6513t(C2440b bVar) {
        if ((!this.f4093a.mo18984l().equals("CHIME_ANDROID_SDK") && !this.f4093a.mo18988t()) || !bVar.mo19089m()) {
            return this.f4098f.mo25895a();
        }
        String f = this.f4097e.mo25924f();
        return TextUtils.isEmpty(f) ? this.f4098f.mo25895a() : f;
    }

    /* renamed from: u */
    private C2440b m6514u(C2440b bVar) {
        InstallationResponse d = this.f4094b.mo19120d(mo19054h(), bVar.mo19068d(), mo19056o(), mo19055i(), (bVar.mo19068d() == null || bVar.mo19068d().length() != 11) ? null : this.f4097e.mo25925i());
        int i = C2433b.f4106a[d.mo19099e().ordinal()];
        if (i == 1) {
            return bVar.mo19094s(d.mo19097c(), d.mo19098d(), this.f4096d.mo19061b(), d.mo19096b().mo19108c(), d.mo19096b().mo19109d());
        } else if (i == 2) {
            return bVar.mo19092q("BAD CONFIG");
        } else {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    /* renamed from: v */
    private void m6515v(Exception exc) {
        synchronized (this.f4099g) {
            Iterator<C2435d> it = this.f4104l.iterator();
            while (it.hasNext()) {
                if (it.next().mo19058a(exc)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: w */
    private void m6516w(C2440b bVar) {
        synchronized (this.f4099g) {
            Iterator<C2435d> it = this.f4104l.iterator();
            while (it.hasNext()) {
                if (it.next().mo19059b(bVar)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: x */
    private synchronized void m6517x(String str) {
        this.f4102j = str;
    }

    /* renamed from: y */
    private synchronized void m6518y(C2440b bVar, C2440b bVar2) {
        if (this.f4103k.size() != 0 && !bVar.mo19068d().equals(bVar2.mo19068d())) {
            for (C3616a a : this.f4103k) {
                a.mo25920a(bVar2.mo19068d());
            }
        }
    }

    @NonNull
    public C3339g<String> getId() {
        m6512s();
        String j = m6504j();
        if (j != null) {
            return C1874c.m4951e(j);
        }
        C3339g<String> c = m6499c();
        this.f4100h.execute(new C10262a(this));
        return c;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: h */
    public String mo19054h() {
        return this.f4093a.mo18985m().mo19044b();
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: i */
    public String mo19055i() {
        return this.f4093a.mo18985m().mo19045c();
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: o */
    public String mo19056o() {
        return this.f4093a.mo18985m().mo19047e();
    }
}
