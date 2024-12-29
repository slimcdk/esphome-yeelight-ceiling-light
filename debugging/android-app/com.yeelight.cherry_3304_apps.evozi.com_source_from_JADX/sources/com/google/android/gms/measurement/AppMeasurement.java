package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.internal.C2111a5;
import com.google.android.gms.measurement.internal.C2137c7;
import com.google.android.gms.measurement.internal.C2172f6;
import com.google.android.gms.measurement.internal.C2374x5;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@ShowFirstParty
@KeepForSdk
@Deprecated
public class AppMeasurement {

    /* renamed from: d */
    private static volatile AppMeasurement f3885d;

    /* renamed from: a */
    private final C2111a5 f3886a;

    /* renamed from: b */
    private final C2137c7 f3887b;

    /* renamed from: c */
    private final boolean f3888c;

    @ShowFirstParty
    @KeepForSdk
    public static class ConditionalUserProperty {
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public boolean mActive;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public String mAppId;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public long mCreationTimestamp;
        @Keep
        public String mExpiredEventName;
        @Keep
        public Bundle mExpiredEventParams;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public String mName;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public String mOrigin;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public long mTimeToLive;
        @Keep
        public String mTimedOutEventName;
        @Keep
        public Bundle mTimedOutEventParams;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public String mTriggerEventName;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public long mTriggerTimeout;
        @Keep
        public String mTriggeredEventName;
        @Keep
        public Bundle mTriggeredEventParams;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public long mTriggeredTimestamp;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public Object mValue;

        @KeepForSdk
        public ConditionalUserProperty() {
        }

        @VisibleForTesting
        ConditionalUserProperty(@NonNull Bundle bundle) {
            Class cls = Long.class;
            Class cls2 = String.class;
            C1609u.m4475k(bundle);
            this.mAppId = (String) C2374x5.m7762a(bundle, Constants.APP_ID, cls2, null);
            this.mOrigin = (String) C2374x5.m7762a(bundle, "origin", cls2, null);
            this.mName = (String) C2374x5.m7762a(bundle, "name", cls2, null);
            this.mValue = C2374x5.m7762a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) C2374x5.m7762a(bundle, "trigger_event_name", cls2, null);
            this.mTriggerTimeout = ((Long) C2374x5.m7762a(bundle, "trigger_timeout", cls, 0L)).longValue();
            this.mTimedOutEventName = (String) C2374x5.m7762a(bundle, "timed_out_event_name", cls2, null);
            this.mTimedOutEventParams = (Bundle) C2374x5.m7762a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) C2374x5.m7762a(bundle, "triggered_event_name", cls2, null);
            this.mTriggeredEventParams = (Bundle) C2374x5.m7762a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) C2374x5.m7762a(bundle, "time_to_live", cls, 0L)).longValue();
            this.mExpiredEventName = (String) C2374x5.m7762a(bundle, "expired_event_name", cls2, null);
            this.mExpiredEventParams = (Bundle) C2374x5.m7762a(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) C2374x5.m7762a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) C2374x5.m7762a(bundle, "creation_timestamp", cls, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) C2374x5.m7762a(bundle, "triggered_timestamp", cls, 0L)).longValue();
        }

        /* access modifiers changed from: package-private */
        @VisibleForTesting
        /* renamed from: a */
        public final Bundle mo12382a() {
            Bundle bundle = new Bundle();
            String str = this.mAppId;
            if (str != null) {
                bundle.putString(Constants.APP_ID, str);
            }
            String str2 = this.mOrigin;
            if (str2 != null) {
                bundle.putString("origin", str2);
            }
            String str3 = this.mName;
            if (str3 != null) {
                bundle.putString("name", str3);
            }
            Object obj = this.mValue;
            if (obj != null) {
                C2374x5.m7763b(bundle, obj);
            }
            String str4 = this.mTriggerEventName;
            if (str4 != null) {
                bundle.putString("trigger_event_name", str4);
            }
            bundle.putLong("trigger_timeout", this.mTriggerTimeout);
            String str5 = this.mTimedOutEventName;
            if (str5 != null) {
                bundle.putString("timed_out_event_name", str5);
            }
            Bundle bundle2 = this.mTimedOutEventParams;
            if (bundle2 != null) {
                bundle.putBundle("timed_out_event_params", bundle2);
            }
            String str6 = this.mTriggeredEventName;
            if (str6 != null) {
                bundle.putString("triggered_event_name", str6);
            }
            Bundle bundle3 = this.mTriggeredEventParams;
            if (bundle3 != null) {
                bundle.putBundle("triggered_event_params", bundle3);
            }
            bundle.putLong("time_to_live", this.mTimeToLive);
            String str7 = this.mExpiredEventName;
            if (str7 != null) {
                bundle.putString("expired_event_name", str7);
            }
            Bundle bundle4 = this.mExpiredEventParams;
            if (bundle4 != null) {
                bundle.putBundle("expired_event_params", bundle4);
            }
            bundle.putLong("creation_timestamp", this.mCreationTimestamp);
            bundle.putBoolean("active", this.mActive);
            bundle.putLong("triggered_timestamp", this.mTriggeredTimestamp);
            return bundle;
        }
    }

    @ShowFirstParty
    @KeepForSdk
    /* renamed from: com.google.android.gms.measurement.AppMeasurement$a */
    public interface C2102a extends C2172f6 {
    }

    private AppMeasurement(C2111a5 a5Var) {
        C1609u.m4475k(a5Var);
        this.f3886a = a5Var;
        this.f3887b = null;
        this.f3888c = false;
    }

    private AppMeasurement(C2137c7 c7Var) {
        C1609u.m4475k(c7Var);
        this.f3887b = c7Var;
        this.f3886a = null;
        this.f3888c = true;
    }

    /* renamed from: b */
    public static AppMeasurement m6685b(Context context, Bundle bundle) {
        if (f3885d == null) {
            synchronized (AppMeasurement.class) {
                if (f3885d == null) {
                    C2137c7 e = m6687e(context, bundle);
                    if (e != null) {
                        f3885d = new AppMeasurement(e);
                    } else {
                        f3885d = new AppMeasurement(C2111a5.m6708e(context, (String) null, (String) null, bundle));
                    }
                }
            }
        }
        return f3885d;
    }

    @VisibleForTesting
    /* renamed from: c */
    private static AppMeasurement m6686c(Context context, String str, String str2) {
        if (f3885d == null) {
            synchronized (AppMeasurement.class) {
                if (f3885d == null) {
                    C2137c7 e = m6687e(context, (Bundle) null);
                    if (e != null) {
                        f3885d = new AppMeasurement(e);
                    } else {
                        f3885d = new AppMeasurement(C2111a5.m6708e(context, (String) null, (String) null, (Bundle) null));
                    }
                }
            }
        }
        return f3885d;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.measurement.internal.C2137c7 m6687e(android.content.Context r8, android.os.Bundle r9) {
        /*
            r0 = 0
            java.lang.String r1 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x0027 }
            java.lang.String r2 = "getScionFrontendApiImplementation"
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{  }
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r6 = 0
            r4[r6] = r5     // Catch:{  }
            java.lang.Class<android.os.Bundle> r5 = android.os.Bundle.class
            r7 = 1
            r4[r7] = r5     // Catch:{  }
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r4)     // Catch:{  }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{  }
            r2[r6] = r8     // Catch:{  }
            r2[r7] = r9     // Catch:{  }
            java.lang.Object r8 = r1.invoke(r0, r2)     // Catch:{  }
            com.google.android.gms.measurement.internal.c7 r8 = (com.google.android.gms.measurement.internal.C2137c7) r8     // Catch:{  }
            return r8
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurement.m6687e(android.content.Context, android.os.Bundle):com.google.android.gms.measurement.internal.c7");
    }

    @ShowFirstParty
    @Keep
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @KeepForSdk
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        return m6686c(context, (String) null, (String) null);
    }

    @ShowFirstParty
    @KeepForSdk
    /* renamed from: a */
    public void mo12363a(C2102a aVar) {
        if (this.f3888c) {
            this.f3887b.mo12555j(aVar);
        } else {
            this.f3886a.mo12411F().mo12705K(aVar);
        }
    }

    @Keep
    public void beginAdUnitExposure(@Size(min = 1) @NonNull String str) {
        if (this.f3888c) {
            this.f3887b.mo12546a(str);
        } else {
            this.f3886a.mo12425T().mo13143z(str, this.f3886a.mo12429f().mo11379b());
        }
    }

    @ShowFirstParty
    @KeepForSdk
    @Keep
    public void clearConditionalUserProperty(@Size(max = 24, min = 1) @NonNull String str, @Nullable String str2, @Nullable Bundle bundle) {
        if (this.f3888c) {
            this.f3887b.mo12553h(str, str2, bundle);
        } else {
            this.f3886a.mo12411F().mo12733y0(str, str2, bundle);
        }
    }

    /* access modifiers changed from: protected */
    @Keep
    @VisibleForTesting
    public void clearConditionalUserPropertyAs(@Size(min = 1) @NonNull String str, @Size(max = 24, min = 1) @NonNull String str2, @Nullable String str3, @Nullable Bundle bundle) {
        if (this.f3888c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.f3886a.mo12411F().mo12715Y(str, str2, str3, bundle);
        throw null;
    }

    /* renamed from: d */
    public final void mo12367d(boolean z) {
        if (this.f3888c) {
            this.f3887b.mo12549d(z);
        } else {
            this.f3886a.mo12411F().mo12732w0(z);
        }
    }

    @Keep
    public void endAdUnitExposure(@Size(min = 1) @NonNull String str) {
        if (this.f3888c) {
            this.f3887b.mo12551f(str);
        } else {
            this.f3886a.mo12425T().mo13141D(str, this.f3886a.mo12429f().mo11379b());
        }
    }

    @Keep
    public long generateEventId() {
        return this.f3888c ? this.f3887b.mo12545G() : this.f3886a.mo12412G().mo12947C0();
    }

    @Keep
    @Nullable
    public String getAppInstanceId() {
        return this.f3888c ? this.f3887b.mo12543E() : this.f3886a.mo12411F().mo12723g0();
    }

    @WorkerThread
    @ShowFirstParty
    @Keep
    @KeepForSdk
    public List<ConditionalUserProperty> getConditionalUserProperties(@Nullable String str, @Size(max = 23, min = 1) @Nullable String str2) {
        List<Bundle> e = this.f3888c ? this.f3887b.mo12550e(str, str2) : this.f3886a.mo12411F().mo12697B(str, str2);
        ArrayList arrayList = new ArrayList(e == null ? 0 : e.size());
        for (Bundle conditionalUserProperty : e) {
            arrayList.add(new ConditionalUserProperty(conditionalUserProperty));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    @Keep
    @VisibleForTesting
    public List<ConditionalUserProperty> getConditionalUserPropertiesAs(@Size(min = 1) @NonNull String str, @Nullable String str2, @Size(max = 23, min = 1) @Nullable String str3) {
        if (this.f3888c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.f3886a.mo12411F().mo12698C(str, str2, str3);
        throw null;
    }

    @Keep
    @Nullable
    public String getCurrentScreenClass() {
        return this.f3888c ? this.f3887b.mo12542D() : this.f3886a.mo12411F().mo12726j0();
    }

    @Keep
    @Nullable
    public String getCurrentScreenName() {
        return this.f3888c ? this.f3887b.mo12541C() : this.f3886a.mo12411F().mo12725i0();
    }

    @Keep
    @Nullable
    public String getGmpAppId() {
        return this.f3888c ? this.f3887b.mo12544F() : this.f3886a.mo12411F().mo12727k0();
    }

    @WorkerThread
    @ShowFirstParty
    @Keep
    @KeepForSdk
    public int getMaxUserProperties(@Size(min = 1) @NonNull String str) {
        if (this.f3888c) {
            return this.f3887b.mo12548c(str);
        }
        this.f3886a.mo12411F();
        C1609u.m4471g(str);
        return 25;
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    @Keep
    @VisibleForTesting
    public Map<String, Object> getUserProperties(@Nullable String str, @Size(max = 24, min = 1) @Nullable String str2, boolean z) {
        return this.f3888c ? this.f3887b.mo12552g(str, str2, z) : this.f3886a.mo12411F().mo12700E(str, str2, z);
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    @Keep
    @VisibleForTesting
    public Map<String, Object> getUserPropertiesAs(@Size(min = 1) @NonNull String str, @Nullable String str2, @Size(max = 23, min = 1) @Nullable String str3, boolean z) {
        if (this.f3888c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.f3886a.mo12411F().mo12699D(str, str2, str3, z);
        throw null;
    }

    @ShowFirstParty
    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        if (this.f3888c) {
            this.f3887b.mo12554i(str, str2, bundle);
        } else {
            this.f3886a.mo12411F().mo12709S(str, str2, bundle);
        }
    }

    @ShowFirstParty
    @KeepForSdk
    @Keep
    public void setConditionalUserProperty(@NonNull ConditionalUserProperty conditionalUserProperty) {
        C1609u.m4475k(conditionalUserProperty);
        if (this.f3888c) {
            this.f3887b.mo12547b(conditionalUserProperty.mo12382a());
        } else {
            this.f3886a.mo12411F().mo12702G(conditionalUserProperty.mo12382a());
        }
    }

    /* access modifiers changed from: protected */
    @Keep
    @VisibleForTesting
    public void setConditionalUserPropertyAs(@NonNull ConditionalUserProperty conditionalUserProperty) {
        C1609u.m4475k(conditionalUserProperty);
        if (this.f3888c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.f3886a.mo12411F().mo12729p0(conditionalUserProperty.mo12382a());
        throw null;
    }
}
