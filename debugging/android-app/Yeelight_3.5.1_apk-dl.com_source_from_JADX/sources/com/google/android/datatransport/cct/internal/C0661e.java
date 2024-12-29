package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.ClientInfo;

/* renamed from: com.google.android.datatransport.cct.internal.e */
final class C0661e extends ClientInfo {

    /* renamed from: a */
    private final ClientInfo.ClientType f385a;

    /* renamed from: b */
    private final C0648a f386b;

    /* renamed from: com.google.android.datatransport.cct.internal.e$b */
    static final class C0663b extends ClientInfo.C0646a {

        /* renamed from: a */
        private ClientInfo.ClientType f387a;

        /* renamed from: b */
        private C0648a f388b;

        C0663b() {
        }

        /* renamed from: a */
        public ClientInfo mo11110a() {
            return new C0661e(this.f387a, this.f388b);
        }

        /* renamed from: b */
        public ClientInfo.C0646a mo11111b(@Nullable C0648a aVar) {
            this.f388b = aVar;
            return this;
        }

        /* renamed from: c */
        public ClientInfo.C0646a mo11112c(@Nullable ClientInfo.ClientType clientType) {
            this.f387a = clientType;
            return this;
        }
    }

    private C0661e(@Nullable ClientInfo.ClientType clientType, @Nullable C0648a aVar) {
        this.f385a = clientType;
        this.f386b = aVar;
    }

    @Nullable
    /* renamed from: b */
    public C0648a mo11108b() {
        return this.f386b;
    }

    @Nullable
    /* renamed from: c */
    public ClientInfo.ClientType mo11109c() {
        return this.f385a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientInfo)) {
            return false;
        }
        ClientInfo clientInfo = (ClientInfo) obj;
        ClientInfo.ClientType clientType = this.f385a;
        if (clientType != null ? clientType.equals(clientInfo.mo11109c()) : clientInfo.mo11109c() == null) {
            C0648a aVar = this.f386b;
            C0648a b = clientInfo.mo11108b();
            if (aVar == null) {
                if (b == null) {
                    return true;
                }
            } else if (aVar.equals(b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        ClientInfo.ClientType clientType = this.f385a;
        int i = 0;
        int hashCode = ((clientType == null ? 0 : clientType.hashCode()) ^ 1000003) * 1000003;
        C0648a aVar = this.f386b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f385a + ", androidClientInfo=" + this.f386b + "}";
    }
}
