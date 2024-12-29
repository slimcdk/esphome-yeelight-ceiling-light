package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.C1055d1;
import com.google.android.gms.internal.measurement.C1119h1;
import com.google.android.gms.internal.measurement.C1167k1;
import com.google.android.gms.internal.measurement.C1199m1;
import com.google.android.gms.internal.measurement.zzcl;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p032f0.C3155a;
import p032f0.C3157b;
import p223w3.C11627r;

@DynamiteApi
public class AppMeasurementDynamiteService extends C1055d1 {
    @VisibleForTesting

    /* renamed from: a */
    C1717n5 f1908a = null;
    @GuardedBy("listenerMap")

    /* renamed from: b */
    private final Map f1909b = new ArrayMap();

    @EnsuresNonNull({"scion"})
    /* renamed from: e */
    private final void m4055e() {
        if (this.f1908a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    /* renamed from: f */
    private final void m4056f(C1119h1 h1Var, String str) {
        m4055e();
        this.f1908a.mo14382N().mo14653J(h1Var, str);
    }

    public void beginAdUnitExposure(@NonNull String str, long j) {
        m4055e();
        this.f1908a.mo14401y().mo14690l(str, j);
    }

    public void clearConditionalUserProperty(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        m4055e();
        this.f1908a.mo14377I().mo14563o(str, str2, bundle);
    }

    public void clearMeasurementEnabled(long j) {
        m4055e();
        this.f1908a.mo14377I().mo14545K((Boolean) null);
    }

    public void endAdUnitExposure(@NonNull String str, long j) {
        m4055e();
        this.f1908a.mo14401y().mo14691m(str, j);
    }

    public void generateEventId(C1119h1 h1Var) {
        m4055e();
        long r0 = this.f1908a.mo14382N().mo14679r0();
        m4055e();
        this.f1908a.mo14382N().mo14652I(h1Var, r0);
    }

    public void getAppInstanceId(C1119h1 h1Var) {
        m4055e();
        this.f1908a.mo14227a().mo14310z(new C1590d7(this, h1Var));
    }

    public void getCachedAppInstanceId(C1119h1 h1Var) {
        m4055e();
        m4056f(h1Var, this.f1908a.mo14377I().mo14556Y());
    }

    public void getConditionalUserProperties(String str, String str2, C1119h1 h1Var) {
        m4055e();
        this.f1908a.mo14227a().mo14310z(new C1866za(this, h1Var, str, str2));
    }

    public void getCurrentScreenClass(C1119h1 h1Var) {
        m4055e();
        m4056f(h1Var, this.f1908a.mo14377I().mo14557Z());
    }

    public void getCurrentScreenName(C1119h1 h1Var) {
        m4055e();
        m4056f(h1Var, this.f1908a.mo14377I().mo14558a0());
    }

    public void getGmpAppId(C1119h1 h1Var) {
        String str;
        m4055e();
        C1791t7 I = this.f1908a.mo14377I();
        if (I.f2143a.mo14383O() != null) {
            str = I.f2143a.mo14383O();
        } else {
            try {
                str = C1863z7.m4908b(I.f2143a.mo14231f(), "google_app_id", I.f2143a.mo14386R());
            } catch (IllegalStateException e) {
                I.f2143a.mo14228b().mo14035r().mo14694b("getGoogleAppId failed with exception", e);
                str = null;
            }
        }
        m4056f(h1Var, str);
    }

    public void getMaxUserProperties(String str, C1119h1 h1Var) {
        m4055e();
        this.f1908a.mo14377I().mo14551T(str);
        m4055e();
        this.f1908a.mo14382N().mo14651H(h1Var, 25);
    }

    public void getTestFlag(C1119h1 h1Var, int i) {
        m4055e();
        if (i == 0) {
            this.f1908a.mo14382N().mo14653J(h1Var, this.f1908a.mo14377I().mo14559b0());
        } else if (i == 1) {
            this.f1908a.mo14382N().mo14652I(h1Var, this.f1908a.mo14377I().mo14555X().longValue());
        } else if (i == 2) {
            C1854ya N = this.f1908a.mo14382N();
            double doubleValue = this.f1908a.mo14377I().mo14553V().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble(C11627r.f21359c0, doubleValue);
            try {
                h1Var.mo12512a(bundle);
            } catch (RemoteException e) {
                N.f2143a.mo14228b().mo14040w().mo14694b("Error returning double value to wrapper", e);
            }
        } else if (i == 3) {
            this.f1908a.mo14382N().mo14651H(h1Var, this.f1908a.mo14377I().mo14554W().intValue());
        } else if (i == 4) {
            this.f1908a.mo14382N().mo14647D(h1Var, this.f1908a.mo14377I().mo14552U().booleanValue());
        }
    }

    public void getUserProperties(String str, String str2, boolean z, C1119h1 h1Var) {
        m4055e();
        this.f1908a.mo14227a().mo14310z(new C1605e9(this, h1Var, str, str2, z));
    }

    public void initForTests(@NonNull Map map) {
        m4055e();
    }

    public void initialize(C3155a aVar, zzcl zzcl, long j) {
        C1717n5 n5Var = this.f1908a;
        if (n5Var == null) {
            this.f1908a = C1717n5.m4485H((Context) C0917i.m1419j((Context) C3157b.m8428f(aVar)), zzcl, Long.valueOf(j));
        } else {
            n5Var.mo14228b().mo14040w().mo14693a("Attempting to initialize multiple times");
        }
    }

    public void isDataCollectionEnabled(C1119h1 h1Var) {
        m4055e();
        this.f1908a.mo14227a().mo14310z(new C1555ab(this, h1Var));
    }

    public void logEvent(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, boolean z, boolean z2, long j) {
        m4055e();
        this.f1908a.mo14377I().mo14568t(str, str2, bundle, z, z2, j);
    }

    public void logEventAndBundle(String str, String str2, Bundle bundle, C1119h1 h1Var, long j) {
        Bundle bundle2;
        m4055e();
        C0917i.m1415f(str2);
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        this.f1908a.mo14227a().mo14310z(new C1604e8(this, h1Var, new zzaw(str2, new zzau(bundle), "app", j), str));
    }

    public void logHealthData(int i, @NonNull String str, @NonNull C3155a aVar, @NonNull C3155a aVar2, @NonNull C3155a aVar3) {
        m4055e();
        Object obj = null;
        Object f = aVar == null ? null : C3157b.m8428f(aVar);
        Object f2 = aVar2 == null ? null : C3157b.m8428f(aVar2);
        if (aVar3 != null) {
            obj = C3157b.m8428f(aVar3);
        }
        this.f1908a.mo14228b().mo14032F(i, true, false, str, f, f2, obj);
    }

    public void onActivityCreated(@NonNull C3155a aVar, @NonNull Bundle bundle, long j) {
        m4055e();
        C1779s7 s7Var = this.f1908a.mo14377I().f2679c;
        if (s7Var != null) {
            this.f1908a.mo14377I().mo14564p();
            s7Var.onActivityCreated((Activity) C3157b.m8428f(aVar), bundle);
        }
    }

    public void onActivityDestroyed(@NonNull C3155a aVar, long j) {
        m4055e();
        C1779s7 s7Var = this.f1908a.mo14377I().f2679c;
        if (s7Var != null) {
            this.f1908a.mo14377I().mo14564p();
            s7Var.onActivityDestroyed((Activity) C3157b.m8428f(aVar));
        }
    }

    public void onActivityPaused(@NonNull C3155a aVar, long j) {
        m4055e();
        C1779s7 s7Var = this.f1908a.mo14377I().f2679c;
        if (s7Var != null) {
            this.f1908a.mo14377I().mo14564p();
            s7Var.onActivityPaused((Activity) C3157b.m8428f(aVar));
        }
    }

    public void onActivityResumed(@NonNull C3155a aVar, long j) {
        m4055e();
        C1779s7 s7Var = this.f1908a.mo14377I().f2679c;
        if (s7Var != null) {
            this.f1908a.mo14377I().mo14564p();
            s7Var.onActivityResumed((Activity) C3157b.m8428f(aVar));
        }
    }

    public void onActivitySaveInstanceState(C3155a aVar, C1119h1 h1Var, long j) {
        m4055e();
        C1779s7 s7Var = this.f1908a.mo14377I().f2679c;
        Bundle bundle = new Bundle();
        if (s7Var != null) {
            this.f1908a.mo14377I().mo14564p();
            s7Var.onActivitySaveInstanceState((Activity) C3157b.m8428f(aVar), bundle);
        }
        try {
            h1Var.mo12512a(bundle);
        } catch (RemoteException e) {
            this.f1908a.mo14228b().mo14040w().mo14694b("Error returning bundle value to wrapper", e);
        }
    }

    public void onActivityStarted(@NonNull C3155a aVar, long j) {
        m4055e();
        if (this.f1908a.mo14377I().f2679c != null) {
            this.f1908a.mo14377I().mo14564p();
            Activity activity = (Activity) C3157b.m8428f(aVar);
        }
    }

    public void onActivityStopped(@NonNull C3155a aVar, long j) {
        m4055e();
        if (this.f1908a.mo14377I().f2679c != null) {
            this.f1908a.mo14377I().mo14564p();
            Activity activity = (Activity) C3157b.m8428f(aVar);
        }
    }

    public void performAction(Bundle bundle, C1119h1 h1Var, long j) {
        m4055e();
        h1Var.mo12512a((Bundle) null);
    }

    public void registerOnMeasurementEventListener(C1167k1 k1Var) {
        C1742p6 p6Var;
        m4055e();
        synchronized (this.f1909b) {
            p6Var = (C1742p6) this.f1909b.get(Integer.valueOf(k1Var.mo12871b()));
            if (p6Var == null) {
                p6Var = new C1581cb(this, k1Var);
                this.f1909b.put(Integer.valueOf(k1Var.mo12871b()), p6Var);
            }
        }
        this.f1908a.mo14377I().mo14573y(p6Var);
    }

    public void resetAnalyticsData(long j) {
        m4055e();
        this.f1908a.mo14377I().mo14574z(j);
    }

    public void setConditionalUserProperty(@NonNull Bundle bundle, long j) {
        m4055e();
        if (bundle == null) {
            this.f1908a.mo14228b().mo14035r().mo14693a("Conditional user property must not be null");
        } else {
            this.f1908a.mo14377I().mo14540F(bundle, j);
        }
    }

    public void setConsent(@NonNull Bundle bundle, long j) {
        m4055e();
        this.f1908a.mo14377I().mo14543I(bundle, j);
    }

    public void setConsentThirdParty(@NonNull Bundle bundle, long j) {
        m4055e();
        this.f1908a.mo14377I().mo14541G(bundle, -20, j);
    }

    public void setCurrentScreen(@NonNull C3155a aVar, @NonNull String str, @NonNull String str2, long j) {
        m4055e();
        this.f1908a.mo14379K().mo14261E((Activity) C3157b.m8428f(aVar), str, str2);
    }

    public void setDataCollectionEnabled(boolean z) {
        m4055e();
        C1791t7 I = this.f1908a.mo14377I();
        I.mo14020i();
        I.f2143a.mo14227a().mo14310z(new C1743p7(I, z));
    }

    public void setDefaultEventParameters(@NonNull Bundle bundle) {
        m4055e();
        C1791t7 I = this.f1908a.mo14377I();
        I.f2143a.mo14227a().mo14310z(new C1790t6(I, bundle == null ? null : new Bundle(bundle)));
    }

    public void setEventInterceptor(C1167k1 k1Var) {
        m4055e();
        C1568bb bbVar = new C1568bb(this, k1Var);
        if (this.f1908a.mo14227a().mo14305C()) {
            this.f1908a.mo14377I().mo14544J(bbVar);
        } else {
            this.f1908a.mo14227a().mo14310z(new C1619fa(this, bbVar));
        }
    }

    public void setInstanceIdProvider(C1199m1 m1Var) {
        m4055e();
    }

    public void setMeasurementEnabled(boolean z, long j) {
        m4055e();
        this.f1908a.mo14377I().mo14545K(Boolean.valueOf(z));
    }

    public void setMinimumSessionDuration(long j) {
        m4055e();
    }

    public void setSessionTimeoutDuration(long j) {
        m4055e();
        C1791t7 I = this.f1908a.mo14377I();
        I.f2143a.mo14227a().mo14310z(new C1838x6(I, j));
    }

    public void setUserId(@NonNull String str, long j) {
        m4055e();
        C1791t7 I = this.f1908a.mo14377I();
        if (str == null || !TextUtils.isEmpty(str)) {
            I.f2143a.mo14227a().mo14310z(new C1802u6(I, str));
            I.mo14548N((String) null, "_id", str, true, j);
            return;
        }
        I.f2143a.mo14228b().mo14040w().mo14693a("User ID must be non-empty or null");
    }

    public void setUserProperty(@NonNull String str, @NonNull String str2, @NonNull C3155a aVar, boolean z, long j) {
        m4055e();
        this.f1908a.mo14377I().mo14548N(str, str2, C3157b.m8428f(aVar), z, j);
    }

    public void unregisterOnMeasurementEventListener(C1167k1 k1Var) {
        C1742p6 p6Var;
        m4055e();
        synchronized (this.f1909b) {
            p6Var = (C1742p6) this.f1909b.remove(Integer.valueOf(k1Var.mo12871b()));
        }
        if (p6Var == null) {
            p6Var = new C1581cb(this, k1Var);
        }
        this.f1908a.mo14377I().mo14550P(p6Var);
    }
}
