package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import androidx.annotation.RequiresApi;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C0697b;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p083q.C3604a;

@AutoValue
public abstract class SchedulerConfig {

    public enum Flag {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$a */
    public static class C0693a {

        /* renamed from: a */
        private C3604a f441a;

        /* renamed from: b */
        private Map<Priority, C0694b> f442b = new HashMap();

        /* renamed from: a */
        public C0693a mo11257a(Priority priority, C0694b bVar) {
            this.f442b.put(priority, bVar);
            return this;
        }

        /* renamed from: b */
        public SchedulerConfig mo11258b() {
            Objects.requireNonNull(this.f441a, "missing required property: clock");
            if (this.f442b.keySet().size() >= Priority.values().length) {
                Map<Priority, C0694b> map = this.f442b;
                this.f442b = new HashMap();
                return SchedulerConfig.m550d(this.f441a, map);
            }
            throw new IllegalStateException("Not all priorities have been configured");
        }

        /* renamed from: c */
        public C0693a mo11259c(C3604a aVar) {
            this.f441a = aVar;
            return this;
        }
    }

    @AutoValue
    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$b */
    public static abstract class C0694b {

        @AutoValue.Builder
        /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$b$a */
        public static abstract class C0695a {
            /* renamed from: a */
            public abstract C0694b mo11263a();

            /* renamed from: b */
            public abstract C0695a mo11264b(long j);

            /* renamed from: c */
            public abstract C0695a mo11265c(Set<Flag> set);

            /* renamed from: d */
            public abstract C0695a mo11266d(long j);
        }

        /* renamed from: a */
        public static C0695a m561a() {
            return new C0697b.C0699b().mo11265c(Collections.emptySet());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract long mo11260b();

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract Set<Flag> mo11261c();

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract long mo11262d();
    }

    /* renamed from: a */
    private long m548a(int i, long j) {
        int i2 = i - 1;
        double max = Math.max(1.0d, Math.log(10000.0d) / Math.log((double) ((j > 1 ? j : 2) * ((long) i2))));
        double pow = Math.pow(3.0d, (double) i2);
        double d = (double) j;
        Double.isNaN(d);
        return (long) (pow * d * max);
    }

    /* renamed from: b */
    public static C0693a m549b() {
        return new C0693a();
    }

    /* renamed from: d */
    static SchedulerConfig m550d(C3604a aVar, Map<Priority, C0694b> map) {
        return new C0696a(aVar, map);
    }

    /* renamed from: f */
    public static SchedulerConfig m551f(C3604a aVar) {
        return m549b().mo11257a(Priority.DEFAULT, C0694b.m561a().mo11264b(30000).mo11266d(86400000).mo11263a()).mo11257a(Priority.HIGHEST, C0694b.m561a().mo11264b(1000).mo11266d(86400000).mo11263a()).mo11257a(Priority.VERY_LOW, C0694b.m561a().mo11264b(86400000).mo11266d(86400000).mo11265c(m552i(Flag.NETWORK_UNMETERED, Flag.DEVICE_IDLE)).mo11263a()).mo11259c(aVar).mo11258b();
    }

    /* renamed from: i */
    private static <T> Set<T> m552i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    @RequiresApi(api = 21)
    /* renamed from: j */
    private void m553j(JobInfo.Builder builder, Set<Flag> set) {
        if (set.contains(Flag.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(Flag.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(Flag.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    @RequiresApi(api = 21)
    /* renamed from: c */
    public JobInfo.Builder mo11253c(JobInfo.Builder builder, Priority priority, long j, int i) {
        builder.setMinimumLatency(mo11255g(priority, j, i));
        m553j(builder, mo11256h().get(priority).mo11261c());
        return builder;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract C3604a mo11254e();

    /* renamed from: g */
    public long mo11255g(Priority priority, long j, int i) {
        long a = j - mo11254e().mo25913a();
        C0694b bVar = mo11256h().get(priority);
        return Math.min(Math.max(m548a(i, bVar.mo11260b()), a), bVar.mo11262d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract Map<Priority, C0694b> mo11256h();
}
