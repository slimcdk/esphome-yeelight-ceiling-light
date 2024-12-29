package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.Map;
import java.util.Objects;
import p083q.C3604a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.a */
final class C0696a extends SchedulerConfig {

    /* renamed from: a */
    private final C3604a f443a;

    /* renamed from: b */
    private final Map<Priority, SchedulerConfig.C0694b> f444b;

    C0696a(C3604a aVar, Map<Priority, SchedulerConfig.C0694b> map) {
        Objects.requireNonNull(aVar, "Null clock");
        this.f443a = aVar;
        Objects.requireNonNull(map, "Null values");
        this.f444b = map;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C3604a mo11254e() {
        return this.f443a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig)) {
            return false;
        }
        SchedulerConfig schedulerConfig = (SchedulerConfig) obj;
        return this.f443a.equals(schedulerConfig.mo11254e()) && this.f444b.equals(schedulerConfig.mo11256h());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Map<Priority, SchedulerConfig.C0694b> mo11256h() {
        return this.f444b;
    }

    public int hashCode() {
        return ((this.f443a.hashCode() ^ 1000003) * 1000003) ^ this.f444b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f443a + ", values=" + this.f444b + "}";
    }
}
