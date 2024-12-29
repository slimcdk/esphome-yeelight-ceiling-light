package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1337g;
import java.util.Set;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.d */
final class C1332d extends C1337g.C1339b {

    /* renamed from: a */
    private final long f2433a;

    /* renamed from: b */
    private final long f2434b;

    /* renamed from: c */
    private final Set<C1337g.C1341c> f2435c;

    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.d$b */
    static final class C1334b extends C1337g.C1339b.C1340a {

        /* renamed from: a */
        private Long f2436a;

        /* renamed from: b */
        private Long f2437b;

        /* renamed from: c */
        private Set<C1337g.C1341c> f2438c;

        C1334b() {
        }

        /* renamed from: a */
        public C1337g.C1339b mo10248a() {
            String str = "";
            if (this.f2436a == null) {
                str = str + " delta";
            }
            if (this.f2437b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f2438c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new C1332d(this.f2436a.longValue(), this.f2437b.longValue(), this.f2438c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C1337g.C1339b.C1340a mo10249b(long j) {
            this.f2436a = Long.valueOf(j);
            return this;
        }

        /* renamed from: c */
        public C1337g.C1339b.C1340a mo10250c(Set<C1337g.C1341c> set) {
            if (set != null) {
                this.f2438c = set;
                return this;
            }
            throw new NullPointerException("Null flags");
        }

        /* renamed from: d */
        public C1337g.C1339b.C1340a mo10251d(long j) {
            this.f2437b = Long.valueOf(j);
            return this;
        }
    }

    private C1332d(long j, long j2, Set<C1337g.C1341c> set) {
        this.f2433a = j;
        this.f2434b = j2;
        this.f2435c = set;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public long mo10242b() {
        return this.f2433a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Set<C1337g.C1341c> mo10243c() {
        return this.f2435c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public long mo10244d() {
        return this.f2434b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1337g.C1339b)) {
            return false;
        }
        C1337g.C1339b bVar = (C1337g.C1339b) obj;
        return this.f2433a == bVar.mo10242b() && this.f2434b == bVar.mo10244d() && this.f2435c.equals(bVar.mo10243c());
    }

    public int hashCode() {
        long j = this.f2433a;
        long j2 = this.f2434b;
        return this.f2435c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f2433a + ", maxAllowedDelay=" + this.f2434b + ", flags=" + this.f2435c + "}";
    }
}
