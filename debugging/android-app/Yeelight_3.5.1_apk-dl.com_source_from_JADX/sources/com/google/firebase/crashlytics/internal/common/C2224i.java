package com.google.firebase.crashlytics.internal.common;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.C1872a;
import com.google.android.gms.tasks.C1874c;
import com.google.firebase.crashlytics.internal.common.C2245o;
import com.google.firebase.crashlytics.internal.model.C2323a0;
import com.google.firebase.crashlytics.internal.settings.C2395d;
import com.google.firebase.crashlytics.internal.settings.C2402h;
import com.miot.common.device.parser.xml.DddTag;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import p011b1.C0582c;
import p011b1.C0597i;
import p033f1.C3160f;
import p065m0.C3338f;
import p065m0.C3339g;
import p118y0.C3909a;
import p118y0.C3916f;
import p118y0.C3917g;
import p121z0.C3923a;

/* renamed from: com.google.firebase.crashlytics.internal.common.i */
class C2224i {

    /* renamed from: q */
    static final FilenameFilter f3552q = C2223h.f3551a;

    /* renamed from: a */
    private final Context f3553a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2248q f3554b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C2242l f3555c;

    /* renamed from: d */
    private final C0597i f3556d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C2215g f3557e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C2254t f3558f;

    /* renamed from: g */
    private final C3160f f3559g;

    /* renamed from: h */
    private final C2203a f3560h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C0582c f3561i;

    /* renamed from: j */
    private final C3909a f3562j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C3923a f3563k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C2206b0 f3564l;

    /* renamed from: m */
    private C2245o f3565m;

    /* renamed from: n */
    final C1872a<Boolean> f3566n = new C1872a<>();

    /* renamed from: o */
    final C1872a<Boolean> f3567o = new C1872a<>();

    /* renamed from: p */
    final C1872a<Void> f3568p = new C1872a<>();

    /* renamed from: com.google.firebase.crashlytics.internal.common.i$a */
    class C2225a implements C2245o.C2246a {
        C2225a() {
        }

        /* renamed from: a */
        public void mo18565a(@NonNull C2402h hVar, @NonNull Thread thread, @NonNull Throwable th) {
            C2224i.this.mo18551G(hVar, thread, th);
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.i$b */
    class C2226b implements Callable<C3339g<Void>> {

        /* renamed from: a */
        final /* synthetic */ long f3570a;

        /* renamed from: b */
        final /* synthetic */ Throwable f3571b;

        /* renamed from: c */
        final /* synthetic */ Thread f3572c;

        /* renamed from: d */
        final /* synthetic */ C2402h f3573d;

        /* renamed from: e */
        final /* synthetic */ boolean f3574e;

        /* renamed from: com.google.firebase.crashlytics.internal.common.i$b$a */
        class C2227a implements C3338f<C2395d, Void> {

            /* renamed from: a */
            final /* synthetic */ Executor f3576a;

            /* renamed from: b */
            final /* synthetic */ String f3577b;

            C2227a(Executor executor, String str) {
                this.f3576a = executor;
                this.f3577b = str;
            }

            @NonNull
            /* renamed from: b */
            public C3339g<Void> mo18568a(@Nullable C2395d dVar) {
                String str = null;
                if (dVar == null) {
                    C3916f.m11190f().mo26407k("Received null app settings, cannot send reports at crash time.");
                    return C1874c.m4951e(null);
                }
                C3339g[] gVarArr = new C3339g[2];
                gVarArr[0] = C2224i.this.m5639M();
                C2206b0 h = C2224i.this.f3564l;
                Executor executor = this.f3576a;
                if (C2226b.this.f3574e) {
                    str = this.f3577b;
                }
                gVarArr[1] = h.mo18529w(executor, str);
                return C1874c.m4953g(gVarArr);
            }
        }

        C2226b(long j, Throwable th, Thread thread, C2402h hVar, boolean z) {
            this.f3570a = j;
            this.f3571b = th;
            this.f3572c = thread;
            this.f3573d = hVar;
            this.f3574e = z;
        }

        /* renamed from: a */
        public C3339g<Void> call() {
            long b = C2224i.m5636F(this.f3570a);
            String c = C2224i.this.m5633C();
            if (c == null) {
                C3916f.m11190f().mo26401d("Tried to write a fatal exception while no session was open.");
                return C1874c.m4951e(null);
            }
            C2224i.this.f3555c.mo18598a();
            C2224i.this.f3564l.mo18524r(this.f3571b, this.f3572c, c, b);
            C2224i.this.m5662w(this.f3570a);
            C2224i.this.mo18562t(this.f3573d);
            C2224i.this.m5661v(new C2213f(C2224i.this.f3558f).toString());
            if (!C2224i.this.f3554b.mo18607d()) {
                return C1874c.m4951e(null);
            }
            Executor c2 = C2224i.this.f3557e.mo18540c();
            return this.f3573d.mo18972a().mo14772o(c2, new C2227a(c2, c));
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.i$c */
    class C2228c implements C3338f<Void, Boolean> {
        C2228c(C2224i iVar) {
        }

        @NonNull
        /* renamed from: b */
        public C3339g<Boolean> mo18568a(@Nullable Void voidR) {
            return C1874c.m4951e(Boolean.TRUE);
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.i$d */
    class C2229d implements C3338f<Boolean, Void> {

        /* renamed from: a */
        final /* synthetic */ C3339g f3579a;

        /* renamed from: com.google.firebase.crashlytics.internal.common.i$d$a */
        class C2230a implements Callable<C3339g<Void>> {

            /* renamed from: a */
            final /* synthetic */ Boolean f3581a;

            /* renamed from: com.google.firebase.crashlytics.internal.common.i$d$a$a */
            class C2231a implements C3338f<C2395d, Void> {

                /* renamed from: a */
                final /* synthetic */ Executor f3583a;

                C2231a(Executor executor) {
                    this.f3583a = executor;
                }

                @NonNull
                /* renamed from: b */
                public C3339g<Void> mo18568a(@Nullable C2395d dVar) {
                    if (dVar == null) {
                        C3916f.m11190f().mo26407k("Received null app settings at app startup. Cannot send cached reports");
                    } else {
                        C3339g unused = C2224i.this.m5639M();
                        C2224i.this.f3564l.mo18528v(this.f3583a);
                        C2224i.this.f3568p.mo14740e(null);
                    }
                    return C1874c.m4951e(null);
                }
            }

            C2230a(Boolean bool) {
                this.f3581a = bool;
            }

            /* renamed from: a */
            public C3339g<Void> call() {
                if (!this.f3581a.booleanValue()) {
                    C3916f.m11190f().mo26405i("Deleting cached crash reports...");
                    C2224i.m5659r(C2224i.this.mo18554K());
                    C2224i.this.f3564l.mo18527u();
                    C2224i.this.f3568p.mo14740e(null);
                    return C1874c.m4951e(null);
                }
                C3916f.m11190f().mo26399b("Sending cached crash reports...");
                C2224i.this.f3554b.mo18606c(this.f3581a.booleanValue());
                Executor c = C2224i.this.f3557e.mo18540c();
                return C2229d.this.f3579a.mo14772o(c, new C2231a(c));
            }
        }

        C2229d(C3339g gVar) {
            this.f3579a = gVar;
        }

        @NonNull
        /* renamed from: b */
        public C3339g<Void> mo18568a(@Nullable Boolean bool) {
            return C2224i.this.f3557e.mo18543i(new C2230a(bool));
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.i$e */
    class C2232e implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ long f3585a;

        /* renamed from: b */
        final /* synthetic */ String f3586b;

        C2232e(long j, String str) {
            this.f3585a = j;
            this.f3586b = str;
        }

        /* renamed from: a */
        public Void call() {
            if (C2224i.this.mo18553I()) {
                return null;
            }
            C2224i.this.f3561i.mo10936g(this.f3585a, this.f3586b);
            return null;
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.i$f */
    class C2233f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ long f3588a;

        /* renamed from: b */
        final /* synthetic */ Throwable f3589b;

        /* renamed from: c */
        final /* synthetic */ Thread f3590c;

        C2233f(long j, Throwable th, Thread thread) {
            this.f3588a = j;
            this.f3589b = th;
            this.f3590c = thread;
        }

        public void run() {
            if (!C2224i.this.mo18553I()) {
                long b = C2224i.m5636F(this.f3588a);
                String c = C2224i.this.m5633C();
                if (c == null) {
                    C3916f.m11190f().mo26407k("Tried to write a non-fatal exception while no session was open.");
                } else {
                    C2224i.this.f3564l.mo18525s(this.f3589b, this.f3590c, c, b);
                }
            }
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.i$g */
    class C2234g implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ String f3592a;

        C2234g(String str) {
            this.f3592a = str;
        }

        /* renamed from: a */
        public Void call() {
            C2224i.this.m5661v(this.f3592a);
            return null;
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.i$h */
    class C2235h implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ long f3594a;

        C2235h(long j) {
            this.f3594a = j;
        }

        /* renamed from: a */
        public Void call() {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", this.f3594a);
            C2224i.this.f3563k.mo26422a("_ae", bundle);
            return null;
        }
    }

    C2224i(Context context, C2215g gVar, C2254t tVar, C2248q qVar, C3160f fVar, C2242l lVar, C2203a aVar, C0597i iVar, C0582c cVar, C2206b0 b0Var, C3909a aVar2, C3923a aVar3) {
        new AtomicBoolean(false);
        this.f3553a = context;
        this.f3557e = gVar;
        this.f3558f = tVar;
        this.f3554b = qVar;
        this.f3559g = fVar;
        this.f3555c = lVar;
        this.f3560h = aVar;
        this.f3556d = iVar;
        this.f3561i = cVar;
        this.f3562j = aVar2;
        this.f3563k = aVar3;
        this.f3564l = b0Var;
    }

    /* renamed from: A */
    private static boolean m5631A() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: B */
    private Context m5632B() {
        return this.f3553a;
    }

    /* access modifiers changed from: private */
    @Nullable
    /* renamed from: C */
    public String m5633C() {
        SortedSet<String> n = this.f3564l.mo18522n();
        if (!n.isEmpty()) {
            return n.first();
        }
        return null;
    }

    /* renamed from: D */
    private static long m5634D() {
        return m5636F(System.currentTimeMillis());
    }

    @NonNull
    /* renamed from: E */
    static List<C2257w> m5635E(C3917g gVar, String str, C3160f fVar, byte[] bArr) {
        File o = fVar.mo23668o(str, "user-data");
        File o2 = fVar.mo23668o(str, "keys");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2211e("logs_file", "logs", bArr));
        arrayList.add(new C2253s("crash_meta_file", "metadata", gVar.mo26396f()));
        arrayList.add(new C2253s("session_meta_file", "session", gVar.mo26395e()));
        arrayList.add(new C2253s("app_meta_file", "app", gVar.mo26391a()));
        arrayList.add(new C2253s("device_meta_file", DddTag.DEVICE, gVar.mo26393c()));
        arrayList.add(new C2253s("os_meta_file", "os", gVar.mo26392b()));
        arrayList.add(new C2253s("minidump_file", "minidump", gVar.mo26394d()));
        arrayList.add(new C2253s("user_meta_file", "user", o));
        arrayList.add(new C2253s("keys_file", "keys", o2));
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public static long m5636F(long j) {
        return j / 1000;
    }

    /* renamed from: L */
    private C3339g<Void> m5638L(long j) {
        if (m5631A()) {
            C3916f.m11190f().mo26407k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return C1874c.m4951e(null);
        }
        C3916f.m11190f().mo26399b("Logging app exception event to Firebase Analytics");
        return C1874c.m4949c(new ScheduledThreadPoolExecutor(1), new C2235h(j));
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public C3339g<Void> m5639M() {
        ArrayList arrayList = new ArrayList();
        for (File next : mo18554K()) {
            try {
                arrayList.add(m5638L(Long.parseLong(next.getName().substring(3))));
            } catch (NumberFormatException unused) {
                C3916f f = C3916f.m11190f();
                f.mo26407k("Could not parse app exception timestamp from file " + next.getName());
            }
            next.delete();
        }
        return C1874c.m4952f(arrayList);
    }

    /* renamed from: R */
    private C3339g<Boolean> m5640R() {
        if (this.f3554b.mo18607d()) {
            C3916f.m11190f().mo26399b("Automatic data collection is enabled. Allowing upload.");
            this.f3566n.mo14740e(Boolean.FALSE);
            return C1874c.m4951e(Boolean.TRUE);
        }
        C3916f.m11190f().mo26399b("Automatic data collection is disabled.");
        C3916f.m11190f().mo26405i("Notifying that unsent reports are available.");
        this.f3566n.mo14740e(Boolean.TRUE);
        C3339g<TContinuationResult> p = this.f3554b.mo18608g().mo14773p(new C2228c(this));
        C3916f.m11190f().mo26399b("Waiting for send/deleteUnsentReports to be called.");
        return C2220g0.m5628j(p, this.f3567o.mo14736a());
    }

    /* renamed from: S */
    private void m5641S(String str) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            List historicalProcessExitReasons = ((ActivityManager) this.f3553a.getSystemService("activity")).getHistoricalProcessExitReasons((String) null, 0, 0);
            if (historicalProcessExitReasons.size() != 0) {
                this.f3564l.mo18526t(str, historicalProcessExitReasons, new C0582c(this.f3559g, str), C0597i.m154i(str, this.f3559g, this.f3557e));
                return;
            }
            C3916f f = C3916f.m11190f();
            f.mo26405i("No ApplicationExitInfo available. Session: " + str);
            return;
        }
        C3916f f2 = C3916f.m11190f();
        f2.mo26405i("ANR feature enabled, but device is API " + i);
    }

    /* renamed from: o */
    private static C2323a0.C2324a m5656o(C2254t tVar, C2203a aVar) {
        return C2323a0.C2324a.m6085b(tVar.mo18612f(), aVar.f3518e, aVar.f3519f, tVar.mo18611a(), DeliveryMechanism.determineFrom(aVar.f3516c).getId(), aVar.f3520g);
    }

    /* renamed from: p */
    private static C2323a0.C2325b m5657p(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return C2323a0.C2325b.m6092c(CommonUtils.m5543l(), Build.MODEL, Runtime.getRuntime().availableProcessors(), CommonUtils.m5550s(), ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()), CommonUtils.m5556y(context), CommonUtils.m5544m(context), Build.MANUFACTURER, Build.PRODUCT);
    }

    /* renamed from: q */
    private static C2323a0.C2326c m5658q(Context context) {
        return C2323a0.C2326c.m6102a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, CommonUtils.m5557z(context));
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static void m5659r(List<File> list) {
        for (File delete : list) {
            delete.delete();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5660u(boolean r4, com.google.firebase.crashlytics.internal.settings.C2402h r5) {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            com.google.firebase.crashlytics.internal.common.b0 r1 = r3.f3564l
            java.util.SortedSet r1 = r1.mo18522n()
            r0.<init>(r1)
            int r1 = r0.size()
            if (r1 > r4) goto L_0x001b
            y0.f r4 = p118y0.C3916f.m11190f()
            java.lang.String r5 = "No open sessions to be closed."
            r4.mo26405i(r5)
            return
        L_0x001b:
            java.lang.Object r1 = r0.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            com.google.firebase.crashlytics.internal.settings.d r5 = r5.mo18973b()
            com.google.firebase.crashlytics.internal.settings.d$a r5 = r5.f3998b
            boolean r5 = r5.f4004b
            if (r5 == 0) goto L_0x002f
            r3.m5641S(r1)
            goto L_0x0038
        L_0x002f:
            y0.f r5 = p118y0.C3916f.m11190f()
            java.lang.String r2 = "ANR feature disabled."
            r5.mo26405i(r2)
        L_0x0038:
            y0.a r5 = r3.f3562j
            boolean r5 = r5.mo26390d(r1)
            if (r5 == 0) goto L_0x0043
            r3.m5663y(r1)
        L_0x0043:
            r5 = 0
            if (r4 == 0) goto L_0x004e
            r4 = 0
            java.lang.Object r4 = r0.get(r4)
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
        L_0x004e:
            com.google.firebase.crashlytics.internal.common.b0 r4 = r3.f3564l
            long r0 = m5634D()
            r4.mo18520i(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.C2224i.m5660u(boolean, com.google.firebase.crashlytics.internal.settings.h):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public void m5661v(String str) {
        long D = m5634D();
        C3916f f = C3916f.m11190f();
        f.mo26399b("Opening a new session with ID " + str);
        String format = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[]{C2237k.m5699i()});
        C2323a0.C2324a o = m5656o(this.f3558f, this.f3560h);
        C2323a0.C2326c q = m5658q(m5632B());
        C2323a0.C2325b p = m5657p(m5632B());
        this.f3562j.mo26389c(str, format, D, C2323a0.m6081b(o, q, p));
        this.f3561i.mo10934e(str);
        this.f3564l.mo18523o(str, D);
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m5662w(long j) {
        try {
            C3160f fVar = this.f3559g;
            if (!fVar.mo23659e(".ae" + j).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e) {
            C3916f.m11190f().mo26408l("Could not create app exception marker file.", e);
        }
    }

    /* renamed from: y */
    private void m5663y(String str) {
        C3916f f = C3916f.m11190f();
        f.mo26405i("Finalizing native report for session " + str);
        C3917g a = this.f3562j.mo26387a(str);
        File d = a.mo26394d();
        if (d == null || !d.exists()) {
            C3916f f2 = C3916f.m11190f();
            f2.mo26407k("No minidump data found for session " + str);
            return;
        }
        long lastModified = d.lastModified();
        C0582c cVar = new C0582c(this.f3559g, str);
        File i = this.f3559g.mo23663i(str);
        if (!i.isDirectory()) {
            C3916f.m11190f().mo26407k("Couldn't create directory to store native session files, aborting.");
            return;
        }
        m5662w(lastModified);
        List<C2257w> E = m5635E(a, str, this.f3559g, cVar.mo10932b());
        C2258x.m5788b(i, E);
        C3916f.m11190f().mo26399b("CrashlyticsController#finalizePreviousNativeSession");
        this.f3564l.mo18519h(str, E);
        cVar.mo10931a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo18551G(@NonNull C2402h hVar, @NonNull Thread thread, @NonNull Throwable th) {
        mo18552H(hVar, thread, th, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public synchronized void mo18552H(@NonNull C2402h hVar, @NonNull Thread thread, @NonNull Throwable th, boolean z) {
        C3916f f = C3916f.m11190f();
        f.mo26399b("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        try {
            C2220g0.m5622d(this.f3557e.mo18543i(new C2226b(System.currentTimeMillis(), th, thread, hVar, z)));
        } catch (TimeoutException unused) {
            C3916f.m11190f().mo26401d("Cannot send reports. Timed out while fetching settings.");
        } catch (Exception e) {
            C3916f.m11190f().mo26402e("Error handling uncaught exception", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public boolean mo18553I() {
        C2245o oVar = this.f3565m;
        return oVar != null && oVar.mo18604a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public List<File> mo18554K() {
        return this.f3559g.mo23660f(f3552q);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo18555N(String str) {
        this.f3557e.mo18542h(new C2234g(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo18556O(String str, String str2) {
        try {
            this.f3556d.mo10962l(str, str2);
        } catch (IllegalArgumentException e) {
            Context context = this.f3553a;
            if (context == null || !CommonUtils.m5554w(context)) {
                C3916f.m11190f().mo26401d("Attempting to set custom attribute with null key, ignoring.");
                return;
            }
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo18557P(String str) {
        this.f3556d.mo10963m(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public C3339g<Void> mo18558Q(C3339g<C2395d> gVar) {
        if (!this.f3564l.mo18521l()) {
            C3916f.m11190f().mo26405i("No crash reports are available to be sent.");
            this.f3566n.mo14740e(Boolean.FALSE);
            return C1874c.m4951e(null);
        }
        C3916f.m11190f().mo26405i("Crash reports are available to be sent.");
        return m5640R().mo14773p(new C2229d(gVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo18559T(@NonNull Thread thread, @NonNull Throwable th) {
        this.f3557e.mo18541g(new C2233f(System.currentTimeMillis(), th, thread));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo18560U(long j, String str) {
        this.f3557e.mo18542h(new C2232e(j, str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo18561s() {
        if (!this.f3555c.mo18599c()) {
            String C = m5633C();
            return C != null && this.f3562j.mo26390d(C);
        }
        C3916f.m11190f().mo26405i("Found previous crash marker.");
        this.f3555c.mo18600d();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo18562t(C2402h hVar) {
        m5660u(false, hVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo18563x(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C2402h hVar) {
        mo18555N(str);
        C2245o oVar = new C2245o(new C2225a(), hVar, uncaughtExceptionHandler, this.f3562j);
        this.f3565m = oVar;
        Thread.setDefaultUncaughtExceptionHandler(oVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public boolean mo18564z(C2402h hVar) {
        this.f3557e.mo18539b();
        if (mo18553I()) {
            C3916f.m11190f().mo26407k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        C3916f.m11190f().mo26405i("Finalizing previously open sessions.");
        try {
            m5660u(true, hVar);
            C3916f.m11190f().mo26405i("Closed all previously open sessions.");
            return true;
        } catch (Exception e) {
            C3916f.m11190f().mo26402e("Unable to finalize previously open sessions.", e);
            return false;
        }
    }
}
