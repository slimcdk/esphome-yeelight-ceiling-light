package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.Objects;
import java.util.Set;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.b */
final class C0697b extends SchedulerConfig.C0694b {

    /* renamed from: a */
    private final long f445a;

    /* renamed from: b */
    private final long f446b;

    /* renamed from: c */
    private final Set<SchedulerConfig.Flag> f447c;

    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.b$b */
    static final class C0699b extends SchedulerConfig.C0694b.C0695a {

        /* renamed from: a */
        private Long f448a;

        /* renamed from: b */
        private Long f449b;

        /* renamed from: c */
        private Set<SchedulerConfig.Flag> f450c;

        C0699b() {
        }

        /* renamed from: a */
        public SchedulerConfig.C0694b mo11263a() {
            String str = "";
            if (this.f448a == null) {
                str = str + " delta";
            }
            if (this.f449b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f450c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new C0697b(this.f448a.longValue(), this.f449b.longValue(), this.f450c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public SchedulerConfig.C0694b.C0695a mo11264b(long j) {
            this.f448a = Long.valueOf(j);
            return this;
        }

        /* renamed from: c */
        public SchedulerConfig.C0694b.C0695a mo11265c(Set<SchedulerConfig.Flag> set) {
            Objects.requireNonNull(set, "Null flags");
            this.f450c = set;
            return this;
        }

        /* renamed from: d */
        public SchedulerConfig.C0694b.C0695a mo11266d(long j) {
            this.f449b = Long.valueOf(j);
            return this;
        }
    }

    private C0697b(long j, long j2, Set<SchedulerConfig.Flag> set) {
        this.f445a = j;
        this.f446b = j2;
        this.f447c = set;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public long mo11260b() {
        return this.f445a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Set<SchedulerConfig.Flag> mo11261c() {
        return this.f447c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public long mo11262d() {
        return this.f446b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig.C0694b)) {
            return false;
        }
        SchedulerConfig.C0694b bVar = (SchedulerConfig.C0694b) obj;
        return this.f445a == bVar.mo11260b() && this.f446b == bVar.mo11262d() && this.f447c.equals(bVar.mo11261c());
    }

    public int hashCode() {
        long j = this.f445a;
        long j2 = this.f446b;
        return this.f447c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f445a + ", maxAllowedDelay=" + this.f446b + ", flags=" + this.f447c + "}";
    }
}
