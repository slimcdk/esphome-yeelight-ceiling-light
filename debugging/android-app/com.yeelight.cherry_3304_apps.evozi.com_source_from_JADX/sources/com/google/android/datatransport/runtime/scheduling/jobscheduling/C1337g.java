package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import androidx.annotation.RequiresApi;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1332d;
import com.google.android.datatransport.runtime.time.C1354a;
import com.google.auto.value.AutoValue;
import com.xiaomi.mistatistic.sdk.MiStatInterface;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p011c.p012a.p019b.p020a.C0461d;

@AutoValue
/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.g */
public abstract class C1337g {

    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.g$a */
    public static class C1338a {

        /* renamed from: a */
        private C1354a f2444a;

        /* renamed from: b */
        private Map<C0461d, C1339b> f2445b = new HashMap();

        /* renamed from: a */
        public C1338a mo10256a(C0461d dVar, C1339b bVar) {
            this.f2445b.put(dVar, bVar);
            return this;
        }

        /* renamed from: b */
        public C1337g mo10257b() {
            if (this.f2444a == null) {
                throw new NullPointerException("missing required property: clock");
            } else if (this.f2445b.keySet().size() >= C0461d.values().length) {
                Map<C0461d, C1339b> map = this.f2445b;
                this.f2445b = new HashMap();
                return C1337g.m3511c(this.f2444a, map);
            } else {
                throw new IllegalStateException("Not all priorities have been configured");
            }
        }

        /* renamed from: c */
        public C1338a mo10258c(C1354a aVar) {
            this.f2444a = aVar;
            return this;
        }
    }

    @AutoValue
    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.g$b */
    public static abstract class C1339b {

        @AutoValue.Builder
        /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.g$b$a */
        public static abstract class C1340a {
            /* renamed from: a */
            public abstract C1339b mo10248a();

            /* renamed from: b */
            public abstract C1340a mo10249b(long j);

            /* renamed from: c */
            public abstract C1340a mo10250c(Set<C1341c> set);

            /* renamed from: d */
            public abstract C1340a mo10251d(long j);
        }

        /* renamed from: a */
        public static C1340a m3522a() {
            C1332d.C1334b bVar = new C1332d.C1334b();
            bVar.mo10250c(Collections.emptySet());
            return bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract long mo10242b();

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract Set<C1341c> mo10243c();

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract long mo10244d();
    }

    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.g$c */
    public enum C1341c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* renamed from: a */
    public static C1338a m3510a() {
        return new C1338a();
    }

    /* renamed from: c */
    static C1337g m3511c(C1354a aVar, Map<C0461d, C1339b> map) {
        return new C1331c(aVar, map);
    }

    /* renamed from: e */
    public static C1337g m3512e(C1354a aVar) {
        C1338a a = m3510a();
        C0461d dVar = C0461d.DEFAULT;
        C1339b.C1340a a2 = C1339b.m3522a();
        a2.mo10249b(30000);
        a2.mo10251d(MiStatInterface.MAX_UPLOAD_INTERVAL);
        a.mo10256a(dVar, a2.mo10248a());
        C0461d dVar2 = C0461d.HIGHEST;
        C1339b.C1340a a3 = C1339b.m3522a();
        a3.mo10249b(1000);
        a3.mo10251d(MiStatInterface.MAX_UPLOAD_INTERVAL);
        a.mo10256a(dVar2, a3.mo10248a());
        C0461d dVar3 = C0461d.VERY_LOW;
        C1339b.C1340a a4 = C1339b.m3522a();
        a4.mo10249b(MiStatInterface.MAX_UPLOAD_INTERVAL);
        a4.mo10251d(MiStatInterface.MAX_UPLOAD_INTERVAL);
        a4.mo10250c(m3513h(C1341c.NETWORK_UNMETERED, C1341c.DEVICE_IDLE));
        a.mo10256a(dVar3, a4.mo10248a());
        a.mo10258c(aVar);
        return a.mo10257b();
    }

    /* renamed from: h */
    private static <T> Set<T> m3513h(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    @RequiresApi(api = 21)
    /* renamed from: i */
    private void m3514i(JobInfo.Builder builder, Set<C1341c> set) {
        if (set.contains(C1341c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(C1341c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(C1341c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    @RequiresApi(api = 21)
    /* renamed from: b */
    public JobInfo.Builder mo10254b(JobInfo.Builder builder, C0461d dVar, long j, int i) {
        builder.setMinimumLatency(mo10255f(dVar, j, i));
        m3514i(builder, mo10239g().get(dVar).mo10243c());
        return builder;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract C1354a mo10237d();

    /* renamed from: f */
    public long mo10255f(C0461d dVar, long j, int i) {
        long a = j - mo10237d().mo10267a();
        C1339b bVar = mo10239g().get(dVar);
        return Math.min(Math.max(((long) Math.pow(2.0d, (double) (i - 1))) * bVar.mo10242b(), a), bVar.mo10244d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract Map<C0461d, C1339b> mo10239g();
}
