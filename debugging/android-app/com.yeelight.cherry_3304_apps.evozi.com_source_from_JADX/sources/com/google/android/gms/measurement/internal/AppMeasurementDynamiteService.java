package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.C1961qc;
import com.google.android.gms.internal.measurement.C1992sc;
import com.google.android.gms.internal.measurement.C2069xc;
import com.google.android.gms.internal.measurement.C2086yc;
import com.google.android.gms.internal.measurement.zzaa;
import com.yeelight.yeelib.p150c.p183m.C7200r;
import java.util.Map;
import p011c.p012a.p019b.p028b.p031b.C0561a;
import p011c.p012a.p019b.p028b.p031b.C0564b;

@DynamiteApi
public class AppMeasurementDynamiteService extends C1961qc {
    @VisibleForTesting

    /* renamed from: a */
    C2111a5 f3892a = null;

    /* renamed from: b */
    private Map<Integer, C2172f6> f3893b = new ArrayMap();

    /* renamed from: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService$a */
    class C2103a implements C2124b6 {

        /* renamed from: a */
        private C2069xc f3894a;

        C2103a(C2069xc xcVar) {
            this.f3894a = xcVar;
        }

        /* renamed from: a */
        public final void mo12400a(String str, String str2, Bundle bundle, long j) {
            try {
                this.f3894a.mo11541p0(str, str2, bundle, j);
            } catch (RemoteException e) {
                AppMeasurementDynamiteService.this.f3892a.mo12427b().mo13099J().mo13131b("Event interceptor threw exception", e);
            }
        }
    }

    /* renamed from: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService$b */
    class C2104b implements C2172f6 {

        /* renamed from: a */
        private C2069xc f3896a;

        C2104b(C2069xc xcVar) {
            this.f3896a = xcVar;
        }

        /* renamed from: a */
        public final void mo12401a(String str, String str2, Bundle bundle, long j) {
            try {
                this.f3896a.mo11541p0(str, str2, bundle, j);
            } catch (RemoteException e) {
                AppMeasurementDynamiteService.this.f3892a.mo12427b().mo13099J().mo13131b("Event listener threw exception", e);
            }
        }
    }

    /* renamed from: c */
    private final void m6700c() {
        if (this.f3892a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    /* renamed from: e */
    private final void m6701e(C1992sc scVar, String str) {
        this.f3892a.mo12412G().mo12961Q(scVar, str);
    }

    public void beginAdUnitExposure(String str, long j) {
        m6700c();
        this.f3892a.mo12425T().mo13143z(str, j);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        m6700c();
        this.f3892a.mo12411F().mo12733y0(str, str2, bundle);
    }

    public void endAdUnitExposure(String str, long j) {
        m6700c();
        this.f3892a.mo12425T().mo13141D(str, j);
    }

    public void generateEventId(C1992sc scVar) {
        m6700c();
        this.f3892a.mo12412G().mo12959O(scVar, this.f3892a.mo12412G().mo12947C0());
    }

    public void getAppInstanceId(C1992sc scVar) {
        m6700c();
        this.f3892a.mo12426a().mo13122y(new C2149d7(this, scVar));
    }

    public void getCachedAppInstanceId(C1992sc scVar) {
        m6700c();
        m6701e(scVar, this.f3892a.mo12411F().mo12723g0());
    }

    public void getConditionalUserProperties(String str, String str2, C1992sc scVar) {
        m6700c();
        this.f3892a.mo12426a().mo13122y(new C2150d8(this, scVar, str, str2));
    }

    public void getCurrentScreenClass(C1992sc scVar) {
        m6700c();
        m6701e(scVar, this.f3892a.mo12411F().mo12726j0());
    }

    public void getCurrentScreenName(C1992sc scVar) {
        m6700c();
        m6701e(scVar, this.f3892a.mo12411F().mo12725i0());
    }

    public void getGmpAppId(C1992sc scVar) {
        m6700c();
        m6701e(scVar, this.f3892a.mo12411F().mo12727k0());
    }

    public void getMaxUserProperties(String str, C1992sc scVar) {
        m6700c();
        this.f3892a.mo12411F();
        C1609u.m4471g(str);
        this.f3892a.mo12412G().mo12958N(scVar, 25);
    }

    public void getTestFlag(C1992sc scVar, int i) {
        m6700c();
        if (i == 0) {
            this.f3892a.mo12412G().mo12961Q(scVar, this.f3892a.mo12411F().mo12719c0());
        } else if (i == 1) {
            this.f3892a.mo12412G().mo12959O(scVar, this.f3892a.mo12411F().mo12720d0().longValue());
        } else if (i == 2) {
            C2323s9 G = this.f3892a.mo12412G();
            double doubleValue = this.f3892a.mo12411F().mo12722f0().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble(C7200r.f14712G, doubleValue);
            try {
                scVar.mo11948b(bundle);
            } catch (RemoteException e) {
                G.f4689a.mo12427b().mo13099J().mo13131b("Error returning double value to wrapper", e);
            }
        } else if (i == 3) {
            this.f3892a.mo12412G().mo12958N(scVar, this.f3892a.mo12411F().mo12721e0().intValue());
        } else if (i == 4) {
            this.f3892a.mo12412G().mo12963S(scVar, this.f3892a.mo12411F().mo12718b0().booleanValue());
        }
    }

    public void getUserProperties(String str, String str2, boolean z, C1992sc scVar) {
        m6700c();
        this.f3892a.mo12426a().mo13122y(new C2163e9(this, scVar, str, str2, z));
    }

    public void initForTests(Map map) {
        m6700c();
    }

    public void initialize(C0561a aVar, zzaa zzaa, long j) {
        Context context = (Context) C0564b.m334e(aVar);
        C2111a5 a5Var = this.f3892a;
        if (a5Var == null) {
            this.f3892a = C2111a5.m6707d(context, zzaa, Long.valueOf(j));
        } else {
            a5Var.mo12427b().mo13099J().mo13130a("Attempting to initialize multiple times");
        }
    }

    public void isDataCollectionEnabled(C1992sc scVar) {
        m6700c();
        this.f3892a.mo12426a().mo13122y(new C2367w9(this, scVar));
    }

    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        m6700c();
        this.f3892a.mo12411F().mo12711U(str, str2, bundle, z, z2, j);
    }

    public void logEventAndBundle(String str, String str2, Bundle bundle, C1992sc scVar, long j) {
        Bundle bundle2;
        m6700c();
        C1609u.m4471g(str2);
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        this.f3892a.mo12426a().mo13122y(new C2160e6(this, scVar, new zzaq(str2, new zzal(bundle), "app", j), str));
    }

    public void logHealthData(int i, String str, C0561a aVar, C0561a aVar2, C0561a aVar3) {
        m6700c();
        Object obj = null;
        Object e = aVar == null ? null : C0564b.m334e(aVar);
        Object e2 = aVar2 == null ? null : C0564b.m334e(aVar2);
        if (aVar3 != null) {
            obj = C0564b.m334e(aVar3);
        }
        this.f3892a.mo12427b().mo13094A(i, true, false, str, e, e2, obj);
    }

    public void onActivityCreated(C0561a aVar, Bundle bundle, long j) {
        m6700c();
        C2113a7 a7Var = this.f3892a.mo12411F().f4157c;
        if (a7Var != null) {
            this.f3892a.mo12411F().mo12717a0();
            a7Var.onActivityCreated((Activity) C0564b.m334e(aVar), bundle);
        }
    }

    public void onActivityDestroyed(C0561a aVar, long j) {
        m6700c();
        C2113a7 a7Var = this.f3892a.mo12411F().f4157c;
        if (a7Var != null) {
            this.f3892a.mo12411F().mo12717a0();
            a7Var.onActivityDestroyed((Activity) C0564b.m334e(aVar));
        }
    }

    public void onActivityPaused(C0561a aVar, long j) {
        m6700c();
        C2113a7 a7Var = this.f3892a.mo12411F().f4157c;
        if (a7Var != null) {
            this.f3892a.mo12411F().mo12717a0();
            a7Var.onActivityPaused((Activity) C0564b.m334e(aVar));
        }
    }

    public void onActivityResumed(C0561a aVar, long j) {
        m6700c();
        C2113a7 a7Var = this.f3892a.mo12411F().f4157c;
        if (a7Var != null) {
            this.f3892a.mo12411F().mo12717a0();
            a7Var.onActivityResumed((Activity) C0564b.m334e(aVar));
        }
    }

    public void onActivitySaveInstanceState(C0561a aVar, C1992sc scVar, long j) {
        m6700c();
        C2113a7 a7Var = this.f3892a.mo12411F().f4157c;
        Bundle bundle = new Bundle();
        if (a7Var != null) {
            this.f3892a.mo12411F().mo12717a0();
            a7Var.onActivitySaveInstanceState((Activity) C0564b.m334e(aVar), bundle);
        }
        try {
            scVar.mo11948b(bundle);
        } catch (RemoteException e) {
            this.f3892a.mo12427b().mo13099J().mo13131b("Error returning bundle value to wrapper", e);
        }
    }

    public void onActivityStarted(C0561a aVar, long j) {
        m6700c();
        C2113a7 a7Var = this.f3892a.mo12411F().f4157c;
        if (a7Var != null) {
            this.f3892a.mo12411F().mo12717a0();
            a7Var.onActivityStarted((Activity) C0564b.m334e(aVar));
        }
    }

    public void onActivityStopped(C0561a aVar, long j) {
        m6700c();
        C2113a7 a7Var = this.f3892a.mo12411F().f4157c;
        if (a7Var != null) {
            this.f3892a.mo12411F().mo12717a0();
            a7Var.onActivityStopped((Activity) C0564b.m334e(aVar));
        }
    }

    public void performAction(Bundle bundle, C1992sc scVar, long j) {
        m6700c();
        scVar.mo11948b((Bundle) null);
    }

    public void registerOnMeasurementEventListener(C2069xc xcVar) {
        m6700c();
        C2172f6 f6Var = this.f3893b.get(Integer.valueOf(xcVar.mo11540C()));
        if (f6Var == null) {
            f6Var = new C2104b(xcVar);
            this.f3893b.put(Integer.valueOf(xcVar.mo11540C()), f6Var);
        }
        this.f3892a.mo12411F().mo12705K(f6Var);
    }

    public void resetAnalyticsData(long j) {
        m6700c();
        this.f3892a.mo12411F().mo12734z0(j);
    }

    public void setConditionalUserProperty(Bundle bundle, long j) {
        m6700c();
        if (bundle == null) {
            this.f3892a.mo12427b().mo13096F().mo13130a("Conditional user property must not be null");
        } else {
            this.f3892a.mo12411F().mo12703H(bundle, j);
        }
    }

    public void setCurrentScreen(C0561a aVar, String str, String str2, long j) {
        m6700c();
        this.f3892a.mo12421P().mo12802J((Activity) C0564b.m334e(aVar), str, str2);
    }

    public void setDataCollectionEnabled(boolean z) {
        m6700c();
        this.f3892a.mo12411F().mo12732w0(z);
    }

    public void setDefaultEventParameters(Bundle bundle) {
        m6700c();
        C2196h6 F = this.f3892a.mo12411F();
        F.mo12426a().mo13122y(new C2184g6(F, bundle == null ? null : new Bundle(bundle)));
    }

    public void setEventInterceptor(C2069xc xcVar) {
        m6700c();
        C2196h6 F = this.f3892a.mo12411F();
        C2103a aVar = new C2103a(xcVar);
        F.mo12566d();
        F.mo12537x();
        F.mo12426a().mo13122y(new C2287p6(F, aVar));
    }

    public void setInstanceIdProvider(C2086yc ycVar) {
        m6700c();
    }

    public void setMeasurementEnabled(boolean z, long j) {
        m6700c();
        this.f3892a.mo12411F().mo12716Z(z);
    }

    public void setMinimumSessionDuration(long j) {
        m6700c();
        this.f3892a.mo12411F().mo12701F(j);
    }

    public void setSessionTimeoutDuration(long j) {
        m6700c();
        this.f3892a.mo12411F().mo12728o0(j);
    }

    public void setUserId(String str, long j) {
        m6700c();
        this.f3892a.mo12411F().mo12714X((String) null, "_id", str, true, j);
    }

    public void setUserProperty(String str, String str2, C0561a aVar, boolean z, long j) {
        m6700c();
        this.f3892a.mo12411F().mo12714X(str, str2, C0564b.m334e(aVar), z, j);
    }

    public void unregisterOnMeasurementEventListener(C2069xc xcVar) {
        m6700c();
        C2172f6 remove = this.f3893b.remove(Integer.valueOf(xcVar.mo11540C()));
        if (remove == null) {
            remove = new C2104b(xcVar);
        }
        this.f3892a.mo12411F().mo12730r0(remove);
    }
}
