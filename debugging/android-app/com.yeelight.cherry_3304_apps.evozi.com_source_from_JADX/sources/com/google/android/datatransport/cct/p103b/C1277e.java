package com.google.android.datatransport.cct.p103b;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.p103b.C1291k;

/* renamed from: com.google.android.datatransport.cct.b.e */
final class C1277e extends C1291k {

    /* renamed from: a */
    private final C1291k.C1293b f2294a;

    /* renamed from: b */
    private final C1264a f2295b;

    /* renamed from: com.google.android.datatransport.cct.b.e$b */
    static final class C1279b extends C1291k.C1292a {

        /* renamed from: a */
        private C1291k.C1293b f2296a;

        /* renamed from: b */
        private C1264a f2297b;

        C1279b() {
        }

        /* renamed from: a */
        public C1291k.C1292a mo10147a(@Nullable C1264a aVar) {
            this.f2297b = aVar;
            return this;
        }

        /* renamed from: b */
        public C1291k.C1292a mo10148b(@Nullable C1291k.C1293b bVar) {
            this.f2296a = bVar;
            return this;
        }

        /* renamed from: c */
        public C1291k mo10149c() {
            return new C1277e(this.f2296a, this.f2297b, (C1278a) null);
        }
    }

    /* synthetic */ C1277e(C1291k.C1293b bVar, C1264a aVar, C1278a aVar2) {
        this.f2294a = bVar;
        this.f2295b = aVar;
    }

    @Nullable
    /* renamed from: b */
    public C1264a mo10142b() {
        return this.f2295b;
    }

    @Nullable
    /* renamed from: c */
    public C1291k.C1293b mo10143c() {
        return this.f2294a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1291k)) {
            return false;
        }
        C1291k.C1293b bVar = this.f2294a;
        if (bVar != null ? bVar.equals(((C1277e) obj).f2294a) : ((C1277e) obj).f2294a == null) {
            C1264a aVar = this.f2295b;
            C1264a aVar2 = ((C1277e) obj).f2295b;
            if (aVar == null) {
                if (aVar2 == null) {
                    return true;
                }
            } else if (aVar.equals(aVar2)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        C1291k.C1293b bVar = this.f2294a;
        int i = 0;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        C1264a aVar = this.f2295b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f2294a + ", androidClientInfo=" + this.f2295b + "}";
    }
}
