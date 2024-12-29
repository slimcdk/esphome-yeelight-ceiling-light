package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.collection.ArraySet;
import com.google.android.gms.common.C0721a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.C0733c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C0793j;
import com.google.android.gms.common.internal.C0909f;
import com.google.android.gms.common.internal.C0919j;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.tasks.C1872a;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p014c0.C0620i;
import p040h0.C3239j;
import p065m0.C3339g;
import p109w.C3838f;
import p109w.C3842h;
import p109w.C3859s;

@ShowFirstParty
@KeepForSdk
/* renamed from: com.google.android.gms.common.api.internal.g */
public class C0778g implements Handler.Callback {
    @NonNull

    /* renamed from: r */
    public static final Status f613r = new Status(4, "Sign-out occurred while this API call was in progress.");
    /* access modifiers changed from: private */

    /* renamed from: s */
    public static final Status f614s = new Status(4, "The user must be signed in to make this API call.");
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static final Object f615t = new Object();
    @GuardedBy("lock")
    @Nullable

    /* renamed from: u */
    private static C0778g f616u;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public long f617a = 5000;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public long f618b = 120000;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public long f619c = 10000;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f620d = false;
    @Nullable

    /* renamed from: e */
    private TelemetryData f621e;
    @Nullable

    /* renamed from: f */
    private C0919j f622f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Context f623g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C0721a f624h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C3859s f625i;

    /* renamed from: j */
    private final AtomicInteger f626j = new AtomicInteger(1);

    /* renamed from: k */
    private final AtomicInteger f627k = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final Map f628l = new ConcurrentHashMap(5, 0.75f, 1);
    /* access modifiers changed from: private */
    @GuardedBy("lock")
    @Nullable

    /* renamed from: m */
    public C0863y f629m = null;
    /* access modifiers changed from: private */
    @GuardedBy("lock")

    /* renamed from: n */
    public final Set f630n = new ArraySet();

    /* renamed from: o */
    private final Set f631o = new ArraySet();
    /* access modifiers changed from: private */
    @NotOnlyInitialized

    /* renamed from: p */
    public final Handler f632p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public volatile boolean f633q = true;

    @KeepForSdk
    private C0778g(Context context, Looper looper, C0721a aVar) {
        this.f623g = context;
        C3239j jVar = new C3239j(looper, this);
        this.f632p = jVar;
        this.f624h = aVar;
        this.f625i = new C3859s(aVar);
        if (C0620i.m212a(context)) {
            this.f633q = false;
        }
        jVar.sendMessage(jVar.obtainMessage(6));
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static Status m803h(C0752b bVar, ConnectionResult connectionResult) {
        String b = bVar.mo11903b();
        String valueOf = String.valueOf(connectionResult);
        return new Status(connectionResult, "API: " + b + " is not available on this device. Connection failed with: " + valueOf);
    }

    @WorkerThread
    /* renamed from: i */
    private final C0785h1 m804i(C0733c cVar) {
        C0752b b = cVar.mo11846b();
        C0785h1 h1Var = (C0785h1) this.f628l.get(b);
        if (h1Var == null) {
            h1Var = new C0785h1(this, cVar);
            this.f628l.put(b, h1Var);
        }
        if (h1Var.mo11988P()) {
            this.f631o.add(b);
        }
        h1Var.mo11978E();
        return h1Var;
    }

    @WorkerThread
    /* renamed from: j */
    private final C0919j m805j() {
        if (this.f622f == null) {
            this.f622f = C3842h.m10944a(this.f623g);
        }
        return this.f622f;
    }

    @WorkerThread
    /* renamed from: k */
    private final void m806k() {
        TelemetryData telemetryData = this.f621e;
        if (telemetryData != null) {
            if (telemetryData.mo12184V() > 0 || mo11963f()) {
                m805j().mo12285a(telemetryData);
            }
            this.f621e = null;
        }
    }

    /* renamed from: l */
    private final void m807l(C1872a aVar, int i, C0733c cVar) {
        C0845t1 b;
        if (i != 0 && (b = C0845t1.m1075b(this, i, cVar.mo11846b())) != null) {
            C3339g a = aVar.mo14736a();
            Handler handler = this.f632p;
            handler.getClass();
            a.mo14759b(new C0754b1(handler), b);
        }
    }

    @NonNull
    /* renamed from: x */
    public static C0778g m817x(@NonNull Context context) {
        C0778g gVar;
        synchronized (f615t) {
            if (f616u == null) {
                f616u = new C0778g(context.getApplicationContext(), C0909f.m1389c().getLooper(), C0721a.m617p());
            }
            gVar = f616u;
        }
        return gVar;
    }

    @NonNull
    /* renamed from: A */
    public final C3339g mo11954A(@NonNull C0733c cVar, @NonNull C0793j.C0794a aVar, int i) {
        C1872a aVar2 = new C1872a();
        m807l(aVar2, i, cVar);
        C0850u2 u2Var = new C0850u2(aVar, aVar2);
        Handler handler = this.f632p;
        handler.sendMessage(handler.obtainMessage(13, new C0861x1(u2Var, this.f627k.get(), cVar)));
        return aVar2.mo14736a();
    }

    /* renamed from: F */
    public final void mo11955F(@NonNull C0733c cVar, int i, @NonNull C0763d dVar) {
        C0837r2 r2Var = new C0837r2(i, dVar);
        Handler handler = this.f632p;
        handler.sendMessage(handler.obtainMessage(4, new C0861x1(r2Var, this.f627k.get(), cVar)));
    }

    /* renamed from: G */
    public final void mo11956G(@NonNull C0733c cVar, int i, @NonNull C0838s sVar, @NonNull C1872a aVar, @NonNull C0834r rVar) {
        m807l(aVar, sVar.mo12073d(), cVar);
        C0846t2 t2Var = new C0846t2(i, sVar, aVar, rVar);
        Handler handler = this.f632p;
        handler.sendMessage(handler.obtainMessage(4, new C0861x1(t2Var, this.f627k.get(), cVar)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final void mo11957H(MethodInvocation methodInvocation, int i, long j, int i2) {
        Handler handler = this.f632p;
        handler.sendMessage(handler.obtainMessage(18, new C0849u1(methodInvocation, i, j, i2)));
    }

    /* renamed from: I */
    public final void mo11958I(@NonNull ConnectionResult connectionResult, int i) {
        if (!mo11964g(connectionResult, i)) {
            Handler handler = this.f632p;
            handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
        }
    }

    /* renamed from: a */
    public final void mo11959a() {
        Handler handler = this.f632p;
        handler.sendMessage(handler.obtainMessage(3));
    }

    /* renamed from: b */
    public final void mo11960b(@NonNull C0733c cVar) {
        Handler handler = this.f632p;
        handler.sendMessage(handler.obtainMessage(7, cVar));
    }

    /* renamed from: c */
    public final void mo11961c(@NonNull C0863y yVar) {
        synchronized (f615t) {
            if (this.f629m != yVar) {
                this.f629m = yVar;
                this.f630n.clear();
            }
            this.f630n.addAll(yVar.mo12096t());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo11962d(@NonNull C0863y yVar) {
        synchronized (f615t) {
            if (this.f629m == yVar) {
                this.f629m = null;
                this.f630n.clear();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: f */
    public final boolean mo11963f() {
        if (this.f620d) {
            return false;
        }
        RootTelemetryConfiguration a = C3838f.m10936b().mo26308a();
        if (a != null && !a.mo12180c0()) {
            return false;
        }
        int a2 = this.f625i.mo26328a(this.f623g, 203400000);
        return a2 == -1 || a2 == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo11964g(ConnectionResult connectionResult, int i) {
        return this.f624h.mo11787z(this.f623g, connectionResult, i);
    }

    @WorkerThread
    public final boolean handleMessage(@NonNull Message message) {
        C1872a aVar;
        Boolean bool;
        int i = message.what;
        long j = Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL;
        C0785h1 h1Var = null;
        switch (i) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.f619c = j;
                this.f632p.removeMessages(12);
                for (C0752b obtainMessage : this.f628l.keySet()) {
                    Handler handler = this.f632p;
                    handler.sendMessageDelayed(handler.obtainMessage(12, obtainMessage), this.f619c);
                }
                break;
            case 2:
                C0866y2 y2Var = (C0866y2) message.obj;
                Iterator it = y2Var.mo12098a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        C0752b bVar = (C0752b) it.next();
                        C0785h1 h1Var2 = (C0785h1) this.f628l.get(bVar);
                        if (h1Var2 == null) {
                            y2Var.mo12099b(bVar, new ConnectionResult(13), (String) null);
                            break;
                        } else if (h1Var2.mo11987O()) {
                            y2Var.mo12099b(bVar, ConnectionResult.RESULT_SUCCESS, h1Var2.mo11994v().mo11835e());
                        } else {
                            ConnectionResult t = h1Var2.mo11993t();
                            if (t != null) {
                                y2Var.mo12099b(bVar, t, (String) null);
                            } else {
                                h1Var2.mo11983J(y2Var);
                                h1Var2.mo11978E();
                            }
                        }
                    }
                }
            case 3:
                for (C0785h1 h1Var3 : this.f628l.values()) {
                    h1Var3.mo11977D();
                    h1Var3.mo11978E();
                }
                break;
            case 4:
            case 8:
            case 13:
                C0861x1 x1Var = (C0861x1) message.obj;
                C0785h1 h1Var4 = (C0785h1) this.f628l.get(x1Var.f848c.mo11846b());
                if (h1Var4 == null) {
                    h1Var4 = m804i(x1Var.f848c);
                }
                if (h1Var4.mo11988P() && this.f627k.get() != x1Var.f847b) {
                    x1Var.f846a.mo12035a(f613r);
                    h1Var4.mo11985L();
                    break;
                } else {
                    h1Var4.mo11979F(x1Var.f846a);
                    break;
                }
                break;
            case 5:
                int i2 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator it2 = this.f628l.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C0785h1 h1Var5 = (C0785h1) it2.next();
                        if (h1Var5.mo11991r() == i2) {
                            h1Var = h1Var5;
                        }
                    }
                }
                if (h1Var != null) {
                    if (connectionResult.mo11751V() != 13) {
                        h1Var.m851g(m803h(h1Var.f646c, connectionResult));
                        break;
                    } else {
                        String g = this.f624h.mo11772g(connectionResult.mo11751V());
                        String W = connectionResult.mo11752W();
                        h1Var.m851g(new Status(17, "Error resolution was canceled by the user, original error message: " + g + ": " + W));
                        break;
                    }
                } else {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i2 + " while trying to fail enqueued calls.", new Exception());
                    break;
                }
            case 6:
                if (this.f623g.getApplicationContext() instanceof Application) {
                    C0757c.m753c((Application) this.f623g.getApplicationContext());
                    C0757c.m752b().mo11910a(new C0760c1(this));
                    if (!C0757c.m752b().mo11912e(true)) {
                        this.f619c = Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL;
                        break;
                    }
                }
                break;
            case 7:
                m804i((C0733c) message.obj);
                break;
            case 9:
                if (this.f628l.containsKey(message.obj)) {
                    ((C0785h1) this.f628l.get(message.obj)).mo11984K();
                    break;
                }
                break;
            case 10:
                for (C0752b remove : this.f631o) {
                    C0785h1 h1Var6 = (C0785h1) this.f628l.remove(remove);
                    if (h1Var6 != null) {
                        h1Var6.mo11985L();
                    }
                }
                this.f631o.clear();
                break;
            case 11:
                if (this.f628l.containsKey(message.obj)) {
                    ((C0785h1) this.f628l.get(message.obj)).mo11986M();
                    break;
                }
                break;
            case 12:
                if (this.f628l.containsKey(message.obj)) {
                    ((C0785h1) this.f628l.get(message.obj)).mo11990a();
                    break;
                }
                break;
            case 14:
                C0867z zVar = (C0867z) message.obj;
                C0752b a = zVar.mo12100a();
                if (!this.f628l.containsKey(a)) {
                    aVar = zVar.mo12101b();
                    bool = Boolean.FALSE;
                } else {
                    boolean N = ((C0785h1) this.f628l.get(a)).m861q(false);
                    aVar = zVar.mo12101b();
                    bool = Boolean.valueOf(N);
                }
                aVar.mo14738c(bool);
                break;
            case 15:
                C0797j1 j1Var = (C0797j1) message.obj;
                if (this.f628l.containsKey(j1Var.f674a)) {
                    C0785h1.m846B((C0785h1) this.f628l.get(j1Var.f674a), j1Var);
                    break;
                }
                break;
            case 16:
                C0797j1 j1Var2 = (C0797j1) message.obj;
                if (this.f628l.containsKey(j1Var2.f674a)) {
                    C0785h1.m847C((C0785h1) this.f628l.get(j1Var2.f674a), j1Var2);
                    break;
                }
                break;
            case 17:
                m806k();
                break;
            case 18:
                C0849u1 u1Var = (C0849u1) message.obj;
                if (u1Var.f804c != 0) {
                    TelemetryData telemetryData = this.f621e;
                    if (telemetryData != null) {
                        List W2 = telemetryData.mo12185W();
                        if (telemetryData.mo12184V() != u1Var.f803b || (W2 != null && W2.size() >= u1Var.f805d)) {
                            this.f632p.removeMessages(17);
                            m806k();
                        } else {
                            this.f621e.mo12186c0(u1Var.f802a);
                        }
                    }
                    if (this.f621e == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(u1Var.f802a);
                        this.f621e = new TelemetryData(u1Var.f803b, arrayList);
                        Handler handler2 = this.f632p;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), u1Var.f804c);
                        break;
                    }
                } else {
                    m805j().mo12285a(new TelemetryData(u1Var.f803b, Arrays.asList(new MethodInvocation[]{u1Var.f802a})));
                    break;
                }
                break;
            case 19:
                this.f620d = false;
                break;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown message id: ");
                sb.append(i);
                return false;
        }
        return true;
    }

    /* renamed from: m */
    public final int mo11966m() {
        return this.f626j.getAndIncrement();
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: w */
    public final C0785h1 mo11967w(C0752b bVar) {
        return (C0785h1) this.f628l.get(bVar);
    }

    @NonNull
    /* renamed from: z */
    public final C3339g mo11968z(@NonNull C0733c cVar, @NonNull C0815n nVar, @NonNull C0843t tVar, @NonNull Runnable runnable) {
        C1872a aVar = new C1872a();
        m807l(aVar, nVar.mo12033e(), cVar);
        C0842s2 s2Var = new C0842s2(new C0865y1(nVar, tVar, runnable), aVar);
        Handler handler = this.f632p;
        handler.sendMessage(handler.obtainMessage(8, new C0861x1(s2Var, this.f627k.get(), cVar)));
        return aVar.mo14736a();
    }
}
