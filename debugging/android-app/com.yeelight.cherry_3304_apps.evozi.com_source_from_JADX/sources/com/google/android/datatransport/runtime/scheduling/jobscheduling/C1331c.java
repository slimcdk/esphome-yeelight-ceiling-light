package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1337g;
import com.google.android.datatransport.runtime.time.C1354a;
import java.util.Map;
import p011c.p012a.p019b.p020a.C0461d;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.c */
final class C1331c extends C1337g {

    /* renamed from: a */
    private final C1354a f2431a;

    /* renamed from: b */
    private final Map<C0461d, C1337g.C1339b> f2432b;

    C1331c(C1354a aVar, Map<C0461d, C1337g.C1339b> map) {
        if (aVar != null) {
            this.f2431a = aVar;
            if (map != null) {
                this.f2432b = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C1354a mo10237d() {
        return this.f2431a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1337g)) {
            return false;
        }
        C1337g gVar = (C1337g) obj;
        return this.f2431a.equals(gVar.mo10237d()) && this.f2432b.equals(gVar.mo10239g());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Map<C0461d, C1337g.C1339b> mo10239g() {
        return this.f2432b;
    }

    public int hashCode() {
        return ((this.f2431a.hashCode() ^ 1000003) * 1000003) ^ this.f2432b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f2431a + ", values=" + this.f2432b + "}";
    }
}
