package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.C0877b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.C0732b;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;
import p109w.C3833d;
import p109w.C3838f;
import p109w.C3839f0;

@KeepForSdk
/* renamed from: com.google.android.gms.common.internal.c */
public abstract class C0897c<T extends IInterface> {

    /* renamed from: C */
    private static final Feature[] f973C = new Feature[0];
    @Nullable

    /* renamed from: A */
    private volatile zzj f974A;
    @NonNull
    @VisibleForTesting

    /* renamed from: B */
    protected AtomicInteger f975B;

    /* renamed from: a */
    private int f976a;

    /* renamed from: b */
    private long f977b;

    /* renamed from: c */
    private long f978c;

    /* renamed from: d */
    private int f979d;

    /* renamed from: e */
    private long f980e;
    @Nullable

    /* renamed from: f */
    private volatile String f981f;
    @VisibleForTesting

    /* renamed from: g */
    C0916h0 f982g;

    /* renamed from: h */
    private final Context f983h;

    /* renamed from: i */
    private final C0909f f984i;

    /* renamed from: j */
    private final C0877b f985j;

    /* renamed from: k */
    final Handler f986k;

    /* renamed from: l */
    private final Object f987l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final Object f988m;
    /* access modifiers changed from: private */
    @GuardedBy("mServiceBrokerLock")
    @Nullable

    /* renamed from: n */
    public C3833d f989n;
    @NonNull
    @VisibleForTesting

    /* renamed from: o */
    protected C0900c f990o;
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: p */
    private IInterface f991p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final ArrayList f992q;
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: r */
    private C0934y f993r;
    @GuardedBy("mLock")

    /* renamed from: s */
    private int f994s;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: t */
    public final C0898a f995t;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: u */
    public final C0899b f996u;

    /* renamed from: v */
    private final int f997v;
    @Nullable

    /* renamed from: w */
    private final String f998w;
    @Nullable

    /* renamed from: x */
    private volatile String f999x;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: y */
    public ConnectionResult f1000y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public boolean f1001z;

    @KeepForSdk
    /* renamed from: com.google.android.gms.common.internal.c$a */
    public interface C0898a {
        @KeepForSdk
        /* renamed from: c */
        void mo12239c(int i);

        @KeepForSdk
        /* renamed from: f */
        void mo12240f(@Nullable Bundle bundle);
    }

    @KeepForSdk
    /* renamed from: com.google.android.gms.common.internal.c$b */
    public interface C0899b {
        @KeepForSdk
        /* renamed from: e */
        void mo12241e(@NonNull ConnectionResult connectionResult);
    }

    @KeepForSdk
    /* renamed from: com.google.android.gms.common.internal.c$c */
    public interface C0900c {
        @KeepForSdk
        /* renamed from: a */
        void mo11950a(@NonNull ConnectionResult connectionResult);
    }

    /* renamed from: com.google.android.gms.common.internal.c$d */
    protected class C0901d implements C0900c {
        @KeepForSdk
        public C0901d() {
        }

        /* renamed from: a */
        public final void mo11950a(@NonNull ConnectionResult connectionResult) {
            if (connectionResult.mo11756f0()) {
                C0897c cVar = C0897c.this;
                cVar.mo12215c((C0911g) null, cVar.mo12196E());
            } else if (C0897c.this.f996u != null) {
                C0897c.this.f996u.mo12241e(connectionResult);
            }
        }
    }

    @KeepForSdk
    /* renamed from: com.google.android.gms.common.internal.c$e */
    public interface C0902e {
        @KeepForSdk
        /* renamed from: a */
        void mo11969a();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected C0897c(@androidx.annotation.NonNull android.content.Context r10, @androidx.annotation.NonNull android.os.Looper r11, int r12, @androidx.annotation.Nullable com.google.android.gms.common.internal.C0897c.C0898a r13, @androidx.annotation.Nullable com.google.android.gms.common.internal.C0897c.C0899b r14, @androidx.annotation.Nullable java.lang.String r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.f r3 = com.google.android.gms.common.internal.C0909f.m1388b(r10)
            com.google.android.gms.common.b r4 = com.google.android.gms.common.C0877b.m1212h()
            com.google.android.gms.common.internal.C0917i.m1419j(r13)
            com.google.android.gms.common.internal.C0917i.m1419j(r14)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C0897c.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.c$a, com.google.android.gms.common.internal.c$b, java.lang.String):void");
    }

    @KeepForSdk
    @VisibleForTesting
    protected C0897c(@NonNull Context context, @NonNull Looper looper, @NonNull C0909f fVar, @NonNull C0877b bVar, int i, @Nullable C0898a aVar, @Nullable C0899b bVar2, @Nullable String str) {
        this.f981f = null;
        this.f987l = new Object();
        this.f988m = new Object();
        this.f992q = new ArrayList();
        this.f994s = 1;
        this.f1000y = null;
        this.f1001z = false;
        this.f974A = null;
        this.f975B = new AtomicInteger(0);
        C0917i.m1420k(context, "Context must not be null");
        this.f983h = context;
        C0917i.m1420k(looper, "Looper must not be null");
        C0917i.m1420k(fVar, "Supervisor must not be null");
        this.f984i = fVar;
        C0917i.m1420k(bVar, "API availability must not be null");
        this.f985j = bVar;
        this.f986k = new C0931v(this, looper);
        this.f997v = i;
        this.f995t = aVar;
        this.f996u = bVar2;
        this.f998w = str;
    }

    /* renamed from: e0 */
    static /* bridge */ /* synthetic */ void m1299e0(C0897c cVar, zzj zzj) {
        cVar.f974A = zzj;
        if (cVar.mo12212U()) {
            ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzj.f1091d;
            C3838f.m10936b().mo26309c(connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.mo12173g0());
        }
    }

    /* renamed from: f0 */
    static /* bridge */ /* synthetic */ void m1300f0(C0897c cVar, int i) {
        int i2;
        int i3;
        synchronized (cVar.f987l) {
            i2 = cVar.f994s;
        }
        if (i2 == 3) {
            cVar.f1001z = true;
            i3 = 5;
        } else {
            i3 = 4;
        }
        Handler handler = cVar.f986k;
        handler.sendMessage(handler.obtainMessage(i3, cVar.f975B.get(), 16));
    }

    /* renamed from: i0 */
    static /* bridge */ /* synthetic */ boolean m1302i0(C0897c cVar, int i, int i2, IInterface iInterface) {
        synchronized (cVar.f987l) {
            if (cVar.f994s != i) {
                return false;
            }
            cVar.m1304k0(i2, iInterface);
            return true;
        }
    }

    /* renamed from: j0 */
    static /* bridge */ /* synthetic */ boolean m1303j0(C0897c cVar) {
        if (cVar.f1001z || TextUtils.isEmpty(cVar.mo12198G()) || TextUtils.isEmpty(cVar.mo12195D())) {
            return false;
        }
        try {
            Class.forName(cVar.mo12198G());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public final void m1304k0(int i, @Nullable IInterface iInterface) {
        C0916h0 h0Var;
        boolean z = false;
        if ((i == 4) == (iInterface != null)) {
            z = true;
        }
        C0917i.m1410a(z);
        synchronized (this.f987l) {
            this.f994s = i;
            this.f991p = iInterface;
            if (i == 1) {
                C0934y yVar = this.f993r;
                if (yVar != null) {
                    C0909f fVar = this.f984i;
                    String c = this.f982g.mo12283c();
                    C0917i.m1419j(c);
                    fVar.mo12275e(c, this.f982g.mo12282b(), this.f982g.mo12281a(), yVar, mo12213Z(), this.f982g.mo12284d());
                    this.f993r = null;
                }
            } else if (i == 2 || i == 3) {
                C0934y yVar2 = this.f993r;
                if (!(yVar2 == null || (h0Var = this.f982g) == null)) {
                    String c2 = h0Var.mo12283c();
                    String b = h0Var.mo12282b();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Calling connect() while still connected, missing disconnect() for ");
                    sb.append(c2);
                    sb.append(" on ");
                    sb.append(b);
                    C0909f fVar2 = this.f984i;
                    String c3 = this.f982g.mo12283c();
                    C0917i.m1419j(c3);
                    fVar2.mo12275e(c3, this.f982g.mo12282b(), this.f982g.mo12281a(), yVar2, mo12213Z(), this.f982g.mo12284d());
                    this.f975B.incrementAndGet();
                }
                C0934y yVar3 = new C0934y(this, this.f975B.get());
                this.f993r = yVar3;
                C0916h0 h0Var2 = (this.f994s != 3 || mo12195D() == null) ? new C0916h0(mo12200I(), mo12199H(), false, C0909f.m1387a(), mo12202K()) : new C0916h0(mo12192A().getPackageName(), mo12195D(), true, C0909f.m1387a(), false);
                this.f982g = h0Var2;
                if (h0Var2.mo12284d()) {
                    if (mo12226k() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f982g.mo12283c())));
                    }
                }
                C0909f fVar3 = this.f984i;
                String c4 = this.f982g.mo12283c();
                C0917i.m1419j(c4);
                if (!fVar3.mo12276f(new C3839f0(c4, this.f982g.mo12282b(), this.f982g.mo12281a(), this.f982g.mo12284d()), yVar3, mo12213Z(), mo12237y())) {
                    String c5 = this.f982g.mo12283c();
                    String b2 = this.f982g.mo12282b();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("unable to connect to service: ");
                    sb2.append(c5);
                    sb2.append(" on ");
                    sb2.append(b2);
                    mo12222g0(16, (Bundle) null, this.f975B.get());
                }
            } else if (i == 4) {
                C0917i.m1419j(iInterface);
                mo12204M(iInterface);
            }
        }
    }

    @NonNull
    @KeepForSdk
    /* renamed from: A */
    public final Context mo12192A() {
        return this.f983h;
    }

    @KeepForSdk
    /* renamed from: B */
    public int mo12193B() {
        return this.f997v;
    }

    /* access modifiers changed from: protected */
    @NonNull
    @KeepForSdk
    /* renamed from: C */
    public Bundle mo12194C() {
        return new Bundle();
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    @Nullable
    /* renamed from: D */
    public String mo12195D() {
        return null;
    }

    /* access modifiers changed from: protected */
    @NonNull
    @KeepForSdk
    /* renamed from: E */
    public Set<Scope> mo12196E() {
        return Collections.emptySet();
    }

    @NonNull
    @KeepForSdk
    /* renamed from: F */
    public final T mo12197F() {
        T t;
        synchronized (this.f987l) {
            if (this.f994s != 5) {
                mo12232t();
                t = this.f991p;
                C0917i.m1420k(t, "Client is connected but service is null");
            } else {
                throw new DeadObjectException();
            }
        }
        return t;
    }

    /* access modifiers changed from: protected */
    @NonNull
    @KeepForSdk
    /* renamed from: G */
    public abstract String mo12198G();

    /* access modifiers changed from: protected */
    @NonNull
    @KeepForSdk
    /* renamed from: H */
    public abstract String mo12199H();

    /* access modifiers changed from: protected */
    @NonNull
    @KeepForSdk
    /* renamed from: I */
    public String mo12200I() {
        return "com.google.android.gms";
    }

    @KeepForSdk
    @Nullable
    /* renamed from: J */
    public ConnectionTelemetryConfiguration mo12201J() {
        zzj zzj = this.f974A;
        if (zzj == null) {
            return null;
        }
        return zzj.f1091d;
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: K */
    public boolean mo12202K() {
        return mo12226k() >= 211700000;
    }

    @KeepForSdk
    /* renamed from: L */
    public boolean mo12203L() {
        return this.f974A != null;
    }

    /* access modifiers changed from: protected */
    @CallSuper
    @KeepForSdk
    /* renamed from: M */
    public void mo12204M(@NonNull T t) {
        this.f978c = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    @CallSuper
    @KeepForSdk
    /* renamed from: N */
    public void mo12205N(@NonNull ConnectionResult connectionResult) {
        this.f979d = connectionResult.mo11751V();
        this.f980e = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    @CallSuper
    @KeepForSdk
    /* renamed from: O */
    public void mo12206O(int i) {
        this.f976a = i;
        this.f977b = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: P */
    public void mo12207P(int i, @Nullable IBinder iBinder, @Nullable Bundle bundle, int i2) {
        Handler handler = this.f986k;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new C0935z(this, i, iBinder, bundle)));
    }

    @KeepForSdk
    /* renamed from: Q */
    public boolean mo12208Q() {
        return false;
    }

    @KeepForSdk
    /* renamed from: R */
    public void mo12209R(@NonNull String str) {
        this.f999x = str;
    }

    @KeepForSdk
    /* renamed from: S */
    public void mo12210S(int i) {
        Handler handler = this.f986k;
        handler.sendMessage(handler.obtainMessage(6, this.f975B.get(), i));
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    @VisibleForTesting
    /* renamed from: T */
    public void mo12211T(@NonNull C0900c cVar, int i, @Nullable PendingIntent pendingIntent) {
        C0917i.m1420k(cVar, "Connection progress callbacks cannot be null.");
        this.f990o = cVar;
        Handler handler = this.f986k;
        handler.sendMessage(handler.obtainMessage(3, this.f975B.get(), i, pendingIntent));
    }

    @KeepForSdk
    /* renamed from: U */
    public boolean mo12212U() {
        return false;
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: Z */
    public final String mo12213Z() {
        String str = this.f998w;
        return str == null ? this.f983h.getClass().getName() : str;
    }

    @KeepForSdk
    /* renamed from: a */
    public boolean mo12214a() {
        return false;
    }

    @WorkerThread
    @KeepForSdk
    /* renamed from: c */
    public void mo12215c(@Nullable C0911g gVar, @NonNull Set<Scope> set) {
        Set<Scope> set2 = set;
        Bundle C = mo12194C();
        int i = this.f997v;
        String str = this.f999x;
        int i2 = C0877b.f884a;
        Scope[] scopeArr = GetServiceRequest.f940o;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.f941p;
        GetServiceRequest getServiceRequest = r3;
        GetServiceRequest getServiceRequest2 = new GetServiceRequest(6, i, i2, (String) null, (IBinder) null, scopeArr, bundle, (Account) null, featureArr, featureArr, true, 0, false, str);
        GetServiceRequest getServiceRequest3 = getServiceRequest;
        getServiceRequest3.f945d = this.f983h.getPackageName();
        getServiceRequest3.f948g = C;
        if (set2 != null) {
            getServiceRequest3.f947f = (Scope[]) set2.toArray(new Scope[0]);
        }
        if (mo12230q()) {
            Account w = mo12235w();
            if (w == null) {
                w = new Account("<<default account>>", "com.google");
            }
            getServiceRequest3.f949h = w;
            if (gVar != null) {
                getServiceRequest3.f946e = gVar.asBinder();
            }
        } else if (mo12208Q()) {
            getServiceRequest3.f949h = mo12235w();
        }
        getServiceRequest3.f950i = f973C;
        getServiceRequest3.f951j = mo12236x();
        if (mo12212U()) {
            getServiceRequest3.f954m = true;
        }
        try {
            synchronized (this.f988m) {
                C3833d dVar = this.f989n;
                if (dVar != null) {
                    dVar.mo12304h0(new C0933x(this, this.f975B.get()), getServiceRequest3);
                }
            }
        } catch (DeadObjectException unused) {
            mo12210S(3);
        } catch (SecurityException e) {
            throw e;
        } catch (RemoteException | RuntimeException unused2) {
            mo12207P(8, (IBinder) null, (Bundle) null, this.f975B.get());
        }
    }

    @KeepForSdk
    /* renamed from: d */
    public boolean mo12216d() {
        boolean z;
        synchronized (this.f987l) {
            int i = this.f994s;
            z = true;
            if (i != 2) {
                if (i != 3) {
                    z = false;
                }
            }
        }
        return z;
    }

    @KeepForSdk
    public void disconnect() {
        this.f975B.incrementAndGet();
        synchronized (this.f992q) {
            int size = this.f992q.size();
            for (int i = 0; i < size; i++) {
                ((C0932w) this.f992q.get(i)).mo12327d();
            }
            this.f992q.clear();
        }
        synchronized (this.f988m) {
            this.f989n = null;
        }
        m1304k0(1, (IInterface) null);
    }

    @KeepForSdk
    public void disconnect(@NonNull String str) {
        this.f981f = str;
        disconnect();
    }

    @NonNull
    @KeepForSdk
    /* renamed from: e */
    public String mo12219e() {
        C0916h0 h0Var;
        if (isConnected() && (h0Var = this.f982g) != null) {
            return h0Var.mo12282b();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    @KeepForSdk
    /* renamed from: f */
    public void mo12220f(@NonNull C0900c cVar) {
        C0917i.m1420k(cVar, "Connection progress callbacks cannot be null.");
        this.f990o = cVar;
        m1304k0(2, (IInterface) null);
    }

    @KeepForSdk
    /* renamed from: g */
    public void mo12221g(@NonNull C0902e eVar) {
        eVar.mo11969a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g0 */
    public final void mo12222g0(int i, @Nullable Bundle bundle, int i2) {
        Handler handler = this.f986k;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new C0894a0(this, i, (Bundle) null)));
    }

    @KeepForSdk
    /* renamed from: h */
    public void mo12223h(@NonNull String str, @NonNull FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @NonNull String[] strArr) {
        int i;
        IInterface iInterface;
        C3833d dVar;
        synchronized (this.f987l) {
            i = this.f994s;
            iInterface = this.f991p;
        }
        synchronized (this.f988m) {
            dVar = this.f989n;
        }
        printWriter.append(str).append("mConnectState=");
        printWriter.print(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN" : "DISCONNECTING" : "CONNECTED" : "LOCAL_CONNECTING" : "REMOTE_CONNECTING" : "DISCONNECTED");
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append(mo12198G()).append("@").append(Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (dVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(dVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f978c > 0) {
            PrintWriter append = printWriter.append(str).append("lastConnectedTime=");
            long j = this.f978c;
            String format = simpleDateFormat.format(new Date(j));
            append.println(j + " " + format);
        }
        if (this.f977b > 0) {
            printWriter.append(str).append("lastSuspendedCause=");
            int i2 = this.f976a;
            printWriter.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? String.valueOf(i2) : "CAUSE_DEAD_OBJECT_EXCEPTION" : "CAUSE_NETWORK_LOST" : "CAUSE_SERVICE_DISCONNECTED");
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.f977b;
            String format2 = simpleDateFormat.format(new Date(j2));
            append2.println(j2 + " " + format2);
        }
        if (this.f980e > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(C0732b.m672a(this.f979d));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j3 = this.f980e;
            String format3 = simpleDateFormat.format(new Date(j3));
            append3.println(j3 + " " + format3);
        }
    }

    @KeepForSdk
    /* renamed from: i */
    public boolean mo12224i() {
        return true;
    }

    @KeepForSdk
    public boolean isConnected() {
        boolean z;
        synchronized (this.f987l) {
            z = this.f994s == 4;
        }
        return z;
    }

    @KeepForSdk
    /* renamed from: k */
    public int mo12226k() {
        return C0877b.f884a;
    }

    @KeepForSdk
    @Nullable
    /* renamed from: l */
    public final Feature[] mo12227l() {
        zzj zzj = this.f974A;
        if (zzj == null) {
            return null;
        }
        return zzj.f1089b;
    }

    @KeepForSdk
    @Nullable
    /* renamed from: o */
    public String mo12228o() {
        return this.f981f;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: p */
    public Intent mo12229p() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    @KeepForSdk
    /* renamed from: q */
    public boolean mo12230q() {
        return false;
    }

    @KeepForSdk
    /* renamed from: s */
    public void mo12231s() {
        int j = this.f985j.mo11774j(this.f983h, mo12226k());
        if (j != 0) {
            m1304k0(1, (IInterface) null);
            mo12211T(new C0901d(), j, (PendingIntent) null);
            return;
        }
        mo12220f(new C0901d());
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: t */
    public final void mo12232t() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    @Nullable
    /* renamed from: u */
    public abstract T mo12233u(@NonNull IBinder iBinder);

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: v */
    public boolean mo12234v() {
        return false;
    }

    @KeepForSdk
    @Nullable
    /* renamed from: w */
    public Account mo12235w() {
        return null;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: x */
    public Feature[] mo12236x() {
        return f973C;
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    @Nullable
    /* renamed from: y */
    public Executor mo12237y() {
        return null;
    }

    @KeepForSdk
    @Nullable
    /* renamed from: z */
    public Bundle mo12238z() {
        return null;
    }
}
