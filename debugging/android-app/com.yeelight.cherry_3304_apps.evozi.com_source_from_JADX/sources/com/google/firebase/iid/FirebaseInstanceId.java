package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.util.p106s.C1666b;
import com.google.firebase.C2800a;
import com.google.firebase.C2816c;
import com.google.firebase.installations.C3277h;
import com.google.firebase.p131g.C3193b;
import com.google.firebase.p131g.C3195d;
import com.google.firebase.p132h.C3198c;
import com.google.firebase.p138k.C3317h;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.concurrent.GuardedBy;
import p011c.p012a.p019b.p028b.p038e.C0619h;
import p011c.p012a.p019b.p028b.p038e.C0623k;

public class FirebaseInstanceId {

    /* renamed from: i */
    private static final long f6177i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j */
    private static C3208b0 f6178j;
    @GuardedBy("FirebaseInstanceId.class")
    @VisibleForTesting

    /* renamed from: k */
    private static ScheduledExecutorService f6179k;
    @VisibleForTesting

    /* renamed from: a */
    private final Executor f6180a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2816c f6181b;

    /* renamed from: c */
    private final C3245q f6182c;

    /* renamed from: d */
    private final C3215d1 f6183d;

    /* renamed from: e */
    private final C3255v f6184e;

    /* renamed from: f */
    private final C3277h f6185f;
    @GuardedBy("this")

    /* renamed from: g */
    private boolean f6186g;

    /* renamed from: h */
    private final C3202a f6187h;

    /* renamed from: com.google.firebase.iid.FirebaseInstanceId$a */
    private class C3202a {

        /* renamed from: a */
        private boolean f6188a;

        /* renamed from: b */
        private final C3195d f6189b;
        @GuardedBy("this")

        /* renamed from: c */
        private boolean f6190c;
        @GuardedBy("this")
        @Nullable

        /* renamed from: d */
        private C3193b<C2800a> f6191d;
        @GuardedBy("this")
        @Nullable

        /* renamed from: e */
        private Boolean f6192e;

        C3202a(C3195d dVar) {
            this.f6189b = dVar;
        }

        /* renamed from: b */
        private final synchronized void m10018b() {
            if (!this.f6190c) {
                this.f6188a = m10020d();
                Boolean c = m10019c();
                this.f6192e = c;
                if (c == null && this.f6188a) {
                    C3206a1 a1Var = new C3206a1(this);
                    this.f6191d = a1Var;
                    this.f6189b.mo17112a(C2800a.class, a1Var);
                }
                this.f6190c = true;
            }
        }

        @Nullable
        /* renamed from: c */
        private final Boolean m10019c() {
            ApplicationInfo applicationInfo;
            Context g = FirebaseInstanceId.this.f6181b.mo17061g();
            SharedPreferences sharedPreferences = g.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = g.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(g.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* renamed from: d */
        private final boolean m10020d() {
            try {
                Class.forName("com.google.firebase.messaging.FirebaseMessaging");
                return true;
            } catch (ClassNotFoundException unused) {
                Context g = FirebaseInstanceId.this.f6181b.mo17061g();
                Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent.setPackage(g.getPackageName());
                ResolveInfo resolveService = g.getPackageManager().resolveService(intent, 0);
                return (resolveService == null || resolveService.serviceInfo == null) ? false : true;
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
            return r1.f6188a && com.google.firebase.iid.FirebaseInstanceId.m9994i(r1.f6193f).mo17066p();
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized boolean mo17800a() {
            /*
                r1 = this;
                monitor-enter(r1)
                r1.m10018b()     // Catch:{ all -> 0x0025 }
                java.lang.Boolean r0 = r1.f6192e     // Catch:{ all -> 0x0025 }
                if (r0 == 0) goto L_0x0010
                java.lang.Boolean r0 = r1.f6192e     // Catch:{ all -> 0x0025 }
                boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0025 }
                monitor-exit(r1)
                return r0
            L_0x0010:
                boolean r0 = r1.f6188a     // Catch:{ all -> 0x0025 }
                if (r0 == 0) goto L_0x0023
                com.google.firebase.iid.FirebaseInstanceId r0 = com.google.firebase.iid.FirebaseInstanceId.this     // Catch:{ all -> 0x0025 }
                com.google.firebase.c r0 = r0.f6181b     // Catch:{ all -> 0x0025 }
                boolean r0 = r0.mo17066p()     // Catch:{ all -> 0x0025 }
                if (r0 == 0) goto L_0x0023
                r0 = 1
            L_0x0021:
                monitor-exit(r1)
                return r0
            L_0x0023:
                r0 = 0
                goto L_0x0021
            L_0x0025:
                r0 = move-exception
                monitor-exit(r1)
                goto L_0x0029
            L_0x0028:
                throw r0
            L_0x0029:
                goto L_0x0028
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceId.C3202a.mo17800a():boolean");
        }
    }

    FirebaseInstanceId(C2816c cVar, C3195d dVar, C3317h hVar, C3198c cVar2, C3277h hVar2) {
        this(cVar, new C3245q(cVar.mo17061g()), C3250s0.m10107b(), C3250s0.m10107b(), dVar, hVar, cVar2, hVar2);
    }

    private FirebaseInstanceId(C2816c cVar, C3245q qVar, Executor executor, Executor executor2, C3195d dVar, C3317h hVar, C3198c cVar2, C3277h hVar2) {
        Executor executor3 = executor2;
        this.f6186g = false;
        if (C3245q.m10095b(cVar) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (f6178j == null) {
                    f6178j = new C3208b0(cVar.mo17061g());
                }
            }
            this.f6181b = cVar;
            this.f6182c = qVar;
            this.f6183d = new C3215d1(cVar, qVar, executor, hVar, cVar2, hVar2);
            this.f6180a = executor3;
            this.f6187h = new C3202a(dVar);
            Executor executor4 = executor;
            this.f6184e = new C3255v(executor);
            this.f6185f = hVar2;
            executor3.execute(new C3256v0(this));
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public final void m9988A() {
        if (mo17793q(mo17794r())) {
            m9989B();
        }
    }

    /* renamed from: B */
    private final synchronized void m9989B() {
        if (!this.f6186g) {
            mo17791l(0);
        }
    }

    /* renamed from: C */
    private final String m9990C() {
        try {
            f6178j.mo17808e(this.f6181b.mo17065k());
            C0619h<String> id = this.f6185f.getId();
            C1609u.m4476l(id, "Task must not be null");
            CountDownLatch countDownLatch = new CountDownLatch(1);
            id.mo8642c(C3260x0.f6304a, new C3258w0(countDownLatch));
            countDownLatch.await(30000, TimeUnit.MILLISECONDS);
            if (id.mo8654o()) {
                return id.mo8650k();
            }
            if (id.mo8652m()) {
                throw new CancellationException("Task is already canceled");
            }
            throw new IllegalStateException(id.mo8649j());
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: D */
    private final String m9991D() {
        return "[DEFAULT]".equals(this.f6181b.mo17063i()) ? "" : this.f6181b.mo17065k();
    }

    @NonNull
    /* renamed from: b */
    public static FirebaseInstanceId m9992b() {
        return getInstance(C2816c.m8559h());
    }

    /* renamed from: d */
    private final C0619h<C3204a> m9993d(String str, String str2) {
        return C0623k.m538e(null).mo8648i(this.f6180a, new C3254u0(this, str, m9996k(str2)));
    }

    @NonNull
    @Keep
    public static FirebaseInstanceId getInstance(@NonNull C2816c cVar) {
        return (FirebaseInstanceId) cVar.mo17060f(FirebaseInstanceId.class);
    }

    /* renamed from: j */
    private final <T> T m9995j(C0619h<T> hVar) {
        try {
            return C0623k.m535b(hVar, 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    mo17796w();
                }
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e);
            }
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    /* renamed from: k */
    private static String m9996k(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) ? "*" : str;
    }

    /* renamed from: m */
    private static void m9997m(@NonNull C2816c cVar) {
        C1609u.m4472h(cVar.mo17064j().mo17744e(), "FirebaseApp has to define a valid projectId.");
        C1609u.m4472h(cVar.mo17064j().mo17742c(), "FirebaseApp has to define a valid applicationId.");
        C1609u.m4472h(cVar.mo17064j().mo17741b(), "FirebaseApp has to define a valid apiKey.");
    }

    /* renamed from: n */
    static void m9998n(Runnable runnable, long j) {
        synchronized (FirebaseInstanceId.class) {
            if (f6179k == null) {
                f6179k = new ScheduledThreadPoolExecutor(1, new C1666b("FirebaseInstanceId"));
            }
            f6179k.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    @Nullable
    @VisibleForTesting
    /* renamed from: s */
    private final C3205a0 m10000s(String str, String str2) {
        return f6178j.mo17805a(m9991D(), str, str2);
    }

    /* renamed from: v */
    static boolean m10002v() {
        if (!Log.isLoggable("FirebaseInstanceId", 3)) {
            return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3);
        }
        return true;
    }

    @WorkerThread
    @NonNull
    /* renamed from: a */
    public String mo17785a() {
        m9997m(this.f6181b);
        m9988A();
        return m9990C();
    }

    @WorkerThread
    @Nullable
    /* renamed from: c */
    public String mo17786c(@NonNull String str, @NonNull String str2) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((C3204a) m9995j(m9993d(str, str2))).mo17803a();
        }
        throw new IOException("MAIN_THREAD");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ C0619h mo17787e(String str, String str2, C0619h hVar) {
        String C = m9990C();
        C3205a0 s = m10000s(str, str2);
        return !mo17793q(s) ? C0623k.m538e(new C3213d(C, s.f6197a)) : this.f6184e.mo17864b(str, str2, new C3264z0(this, C, str, str2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ C0619h mo17788f(String str, String str2, String str3) {
        return this.f6183d.mo17814a(str, str2, str3).mo8656q(this.f6180a, new C3262y0(this, str2, str3, str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ C0619h mo17789g(String str, String str2, String str3, String str4) {
        f6178j.mo17807d(m9991D(), str, str2, str4, this.f6182c.mo17857e());
        return C0623k.m538e(new C3213d(str3, str4));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final C2816c mo17790h() {
        return this.f6181b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final synchronized void mo17791l(long j) {
        m9998n(new C3217e0(this, Math.min(Math.max(30, j << 1), f6177i)), j);
        this.f6186g = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final synchronized void mo17792p(boolean z) {
        this.f6186g = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final boolean mo17793q(@Nullable C3205a0 a0Var) {
        return a0Var == null || a0Var.mo17804c(this.f6182c.mo17857e());
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: r */
    public final C3205a0 mo17794r() {
        return m10000s(C3245q.m10095b(this.f6181b), "*");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final String mo17795u() {
        return mo17786c(C3245q.m10095b(this.f6181b), "*");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final synchronized void mo17796w() {
        f6178j.mo17806c();
        if (this.f6187h.mo17800a()) {
            m9989B();
        }
    }

    @VisibleForTesting
    /* renamed from: x */
    public final boolean mo17797x() {
        return this.f6182c.mo17855c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final void mo17798y() {
        f6178j.mo17809h(m9991D());
        m9989B();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final /* synthetic */ void mo17799z() {
        if (this.f6187h.mo17800a()) {
            m9988A();
        }
    }
}
