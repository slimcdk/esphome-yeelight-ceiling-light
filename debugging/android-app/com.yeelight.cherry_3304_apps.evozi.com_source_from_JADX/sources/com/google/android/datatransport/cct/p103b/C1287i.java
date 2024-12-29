package com.google.android.datatransport.cct.p103b;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.p103b.C1299o;

/* renamed from: com.google.android.datatransport.cct.b.i */
final class C1287i extends C1299o {

    /* renamed from: a */
    private final C1299o.C1302c f2327a;

    /* renamed from: b */
    private final C1299o.C1301b f2328b;

    /* renamed from: com.google.android.datatransport.cct.b.i$b */
    static final class C1289b extends C1299o.C1300a {

        /* renamed from: a */
        private C1299o.C1302c f2329a;

        /* renamed from: b */
        private C1299o.C1301b f2330b;

        C1289b() {
        }

        /* renamed from: a */
        public C1299o.C1300a mo10195a(@Nullable C1299o.C1301b bVar) {
            this.f2330b = bVar;
            return this;
        }

        /* renamed from: b */
        public C1299o.C1300a mo10196b(@Nullable C1299o.C1302c cVar) {
            this.f2329a = cVar;
            return this;
        }

        /* renamed from: c */
        public C1299o mo10197c() {
            return new C1287i(this.f2329a, this.f2330b, (C1288a) null);
        }
    }

    /* synthetic */ C1287i(C1299o.C1302c cVar, C1299o.C1301b bVar, C1288a aVar) {
        this.f2327a = cVar;
        this.f2328b = bVar;
    }

    @Nullable
    /* renamed from: b */
    public C1299o.C1301b mo10190b() {
        return this.f2328b;
    }

    @Nullable
    /* renamed from: c */
    public C1299o.C1302c mo10191c() {
        return this.f2327a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1299o)) {
            return false;
        }
        C1299o.C1302c cVar = this.f2327a;
        if (cVar != null ? cVar.equals(((C1287i) obj).f2327a) : ((C1287i) obj).f2327a == null) {
            C1299o.C1301b bVar = this.f2328b;
            C1299o.C1301b bVar2 = ((C1287i) obj).f2328b;
            if (bVar == null) {
                if (bVar2 == null) {
                    return true;
                }
            } else if (bVar.equals(bVar2)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        C1299o.C1302c cVar = this.f2327a;
        int i = 0;
        int hashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        C1299o.C1301b bVar = this.f2328b;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f2327a + ", mobileSubtype=" + this.f2328b + "}";
    }
}
