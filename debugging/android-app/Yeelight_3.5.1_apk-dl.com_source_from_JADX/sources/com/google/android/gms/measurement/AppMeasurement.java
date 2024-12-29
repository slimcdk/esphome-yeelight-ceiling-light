package com.google.android.gms.measurement;

import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.internal.C1680k6;
import com.google.android.gms.measurement.internal.C1717n5;
import com.google.android.gms.measurement.internal.C1803u7;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@ShowFirstParty
@KeepForSdk
@Deprecated
public class AppMeasurement {

    /* renamed from: b */
    private static volatile AppMeasurement f1900b;

    /* renamed from: a */
    private final C1542d f1901a;

    @ShowFirstParty
    @KeepForSdk
    public static class ConditionalUserProperty {
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public boolean mActive;
        @ShowFirstParty
        @Keep
        @NonNull
        @KeepForSdk
        public String mAppId;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public long mCreationTimestamp;
        @NonNull
        @Keep
        public String mExpiredEventName;
        @NonNull
        @Keep
        public Bundle mExpiredEventParams;
        @ShowFirstParty
        @Keep
        @NonNull
        @KeepForSdk
        public String mName;
        @ShowFirstParty
        @Keep
        @NonNull
        @KeepForSdk
        public String mOrigin;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public long mTimeToLive;
        @NonNull
        @Keep
        public String mTimedOutEventName;
        @NonNull
        @Keep
        public Bundle mTimedOutEventParams;
        @ShowFirstParty
        @Keep
        @NonNull
        @KeepForSdk
        public String mTriggerEventName;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public long mTriggerTimeout;
        @NonNull
        @Keep
        public String mTriggeredEventName;
        @NonNull
        @Keep
        public Bundle mTriggeredEventParams;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public long mTriggeredTimestamp;
        @ShowFirstParty
        @Keep
        @NonNull
        @KeepForSdk
        public Object mValue;

        @KeepForSdk
        public ConditionalUserProperty() {
        }

        @VisibleForTesting
        ConditionalUserProperty(@NonNull Bundle bundle) {
            Class<Long> cls = Long.class;
            Class<String> cls2 = String.class;
            C0917i.m1419j(bundle);
            this.mAppId = (String) C1680k6.m4403a(bundle, Constants.APP_ID, cls2, (Object) null);
            this.mOrigin = (String) C1680k6.m4403a(bundle, "origin", cls2, (Object) null);
            this.mName = (String) C1680k6.m4403a(bundle, "name", cls2, (Object) null);
            this.mValue = C1680k6.m4403a(bundle, "value", Object.class, (Object) null);
            this.mTriggerEventName = (String) C1680k6.m4403a(bundle, "trigger_event_name", cls2, (Object) null);
            this.mTriggerTimeout = ((Long) C1680k6.m4403a(bundle, "trigger_timeout", cls, 0L)).longValue();
            this.mTimedOutEventName = (String) C1680k6.m4403a(bundle, "timed_out_event_name", cls2, (Object) null);
            this.mTimedOutEventParams = (Bundle) C1680k6.m4403a(bundle, "timed_out_event_params", Bundle.class, (Object) null);
            this.mTriggeredEventName = (String) C1680k6.m4403a(bundle, "triggered_event_name", cls2, (Object) null);
            this.mTriggeredEventParams = (Bundle) C1680k6.m4403a(bundle, "triggered_event_params", Bundle.class, (Object) null);
            this.mTimeToLive = ((Long) C1680k6.m4403a(bundle, "time_to_live", cls, 0L)).longValue();
            this.mExpiredEventName = (String) C1680k6.m4403a(bundle, "expired_event_name", cls2, (Object) null);
            this.mExpiredEventParams = (Bundle) C1680k6.m4403a(bundle, "expired_event_params", Bundle.class, (Object) null);
            this.mActive = ((Boolean) C1680k6.m4403a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) C1680k6.m4403a(bundle, "creation_timestamp", cls, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) C1680k6.m4403a(bundle, "triggered_timestamp", cls, 0L)).longValue();
        }
    }

    public AppMeasurement(C1717n5 n5Var) {
        this.f1901a = new C1539a(n5Var);
    }

    public AppMeasurement(C1803u7 u7Var) {
        this.f1901a = new C1540b(u7Var);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    @com.google.android.gms.common.internal.ShowFirstParty
    @androidx.annotation.Keep
    @androidx.annotation.RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.measurement.AppMeasurement getInstance(@androidx.annotation.NonNull android.content.Context r14) {
        /*
            com.google.android.gms.measurement.AppMeasurement r0 = f1900b
            if (r0 != 0) goto L_0x0059
            java.lang.Class<com.google.android.gms.measurement.AppMeasurement> r0 = com.google.android.gms.measurement.AppMeasurement.class
            monitor-enter(r0)
            com.google.android.gms.measurement.AppMeasurement r1 = f1900b     // Catch:{ all -> 0x0056 }
            if (r1 != 0) goto L_0x0054
            r1 = 0
            java.lang.Class<com.google.firebase.analytics.FirebaseAnalytics> r2 = com.google.firebase.analytics.FirebaseAnalytics.class
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{  }
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r6 = 0
            r4[r6] = r5     // Catch:{  }
            java.lang.Class<android.os.Bundle> r5 = android.os.Bundle.class
            r7 = 1
            r4[r7] = r5     // Catch:{  }
            java.lang.String r5 = "getScionFrontendApiImplementation"
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r5, r4)     // Catch:{  }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{  }
            r3[r6] = r14     // Catch:{  }
            r3[r7] = r1     // Catch:{  }
            java.lang.Object r2 = r2.invoke(r1, r3)     // Catch:{  }
            com.google.android.gms.measurement.internal.u7 r2 = (com.google.android.gms.measurement.internal.C1803u7) r2     // Catch:{  }
            goto L_0x002f
        L_0x002e:
            r2 = r1
        L_0x002f:
            if (r2 == 0) goto L_0x0039
            com.google.android.gms.measurement.AppMeasurement r14 = new com.google.android.gms.measurement.AppMeasurement     // Catch:{ all -> 0x0056 }
            r14.<init>((com.google.android.gms.measurement.internal.C1803u7) r2)     // Catch:{ all -> 0x0056 }
            f1900b = r14     // Catch:{ all -> 0x0056 }
            goto L_0x0054
        L_0x0039:
            com.google.android.gms.internal.measurement.zzcl r13 = new com.google.android.gms.internal.measurement.zzcl     // Catch:{ all -> 0x0056 }
            r3 = 0
            r5 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r2 = r13
            r2.<init>(r3, r5, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0056 }
            com.google.android.gms.measurement.internal.n5 r14 = com.google.android.gms.measurement.internal.C1717n5.m4485H(r14, r13, r1)     // Catch:{ all -> 0x0056 }
            com.google.android.gms.measurement.AppMeasurement r1 = new com.google.android.gms.measurement.AppMeasurement     // Catch:{ all -> 0x0056 }
            r1.<init>((com.google.android.gms.measurement.internal.C1717n5) r14)     // Catch:{ all -> 0x0056 }
            f1900b = r1     // Catch:{ all -> 0x0056 }
        L_0x0054:
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            goto L_0x0059
        L_0x0056:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            throw r14
        L_0x0059:
            com.google.android.gms.measurement.AppMeasurement r14 = f1900b
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurement.getInstance(android.content.Context):com.google.android.gms.measurement.AppMeasurement");
    }

    @Keep
    public void beginAdUnitExposure(@Size(min = 1) @NonNull String str) {
        this.f1901a.mo14004j(str);
    }

    @ShowFirstParty
    @KeepForSdk
    @Keep
    public void clearConditionalUserProperty(@Size(max = 24, min = 1) @NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        this.f1901a.mo14005k(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(@Size(min = 1) @NonNull String str) {
        this.f1901a.mo14006l(str);
    }

    @Keep
    public long generateEventId() {
        return this.f1901a.mo13994D();
    }

    @NonNull
    @Keep
    public String getAppInstanceId() {
        return this.f1901a.mo13997c();
    }

    @WorkerThread
    @ShowFirstParty
    @Keep
    @NonNull
    @KeepForSdk
    public List<ConditionalUserProperty> getConditionalUserProperties(@NonNull String str, @Size(max = 23, min = 1) @NonNull String str2) {
        List<Bundle> b = this.f1901a.mo13996b(str, str2);
        ArrayList arrayList = new ArrayList(b == null ? 0 : b.size());
        for (Bundle conditionalUserProperty : b) {
            arrayList.add(new ConditionalUserProperty(conditionalUserProperty));
        }
        return arrayList;
    }

    @NonNull
    @Keep
    public String getCurrentScreenClass() {
        return this.f1901a.mo13998d();
    }

    @NonNull
    @Keep
    public String getCurrentScreenName() {
        return this.f1901a.mo14002h();
    }

    @NonNull
    @Keep
    public String getGmpAppId() {
        return this.f1901a.mo14003i();
    }

    @WorkerThread
    @ShowFirstParty
    @Keep
    @KeepForSdk
    public int getMaxUserProperties(@Size(min = 1) @NonNull String str) {
        return this.f1901a.mo13995a(str);
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    @Keep
    @NonNull
    @VisibleForTesting
    public Map<String, Object> getUserProperties(@NonNull String str, @Size(max = 24, min = 1) @NonNull String str2, boolean z) {
        return this.f1901a.mo13999e(str, str2, z);
    }

    @ShowFirstParty
    @Keep
    public void logEventInternal(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        this.f1901a.mo14001g(str, str2, bundle);
    }

    @ShowFirstParty
    @KeepForSdk
    @Keep
    public void setConditionalUserProperty(@NonNull ConditionalUserProperty conditionalUserProperty) {
        C0917i.m1419j(conditionalUserProperty);
        C1542d dVar = this.f1901a;
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString(Constants.APP_ID, str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            C1680k6.m4404b(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        dVar.mo14000f(bundle);
    }
}
