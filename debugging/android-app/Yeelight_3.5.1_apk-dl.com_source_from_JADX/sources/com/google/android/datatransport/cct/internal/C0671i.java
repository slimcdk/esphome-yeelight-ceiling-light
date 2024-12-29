package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;

/* renamed from: com.google.android.datatransport.cct.internal.i */
final class C0671i extends NetworkConnectionInfo {

    /* renamed from: a */
    private final NetworkConnectionInfo.NetworkType f418a;

    /* renamed from: b */
    private final NetworkConnectionInfo.MobileSubtype f419b;

    /* renamed from: com.google.android.datatransport.cct.internal.i$b */
    static final class C0673b extends NetworkConnectionInfo.C0647a {

        /* renamed from: a */
        private NetworkConnectionInfo.NetworkType f420a;

        /* renamed from: b */
        private NetworkConnectionInfo.MobileSubtype f421b;

        C0673b() {
        }

        /* renamed from: a */
        public NetworkConnectionInfo mo11117a() {
            return new C0671i(this.f420a, this.f421b);
        }

        /* renamed from: b */
        public NetworkConnectionInfo.C0647a mo11118b(@Nullable NetworkConnectionInfo.MobileSubtype mobileSubtype) {
            this.f421b = mobileSubtype;
            return this;
        }

        /* renamed from: c */
        public NetworkConnectionInfo.C0647a mo11119c(@Nullable NetworkConnectionInfo.NetworkType networkType) {
            this.f420a = networkType;
            return this;
        }
    }

    private C0671i(@Nullable NetworkConnectionInfo.NetworkType networkType, @Nullable NetworkConnectionInfo.MobileSubtype mobileSubtype) {
        this.f418a = networkType;
        this.f419b = mobileSubtype;
    }

    @Nullable
    /* renamed from: b */
    public NetworkConnectionInfo.MobileSubtype mo11113b() {
        return this.f419b;
    }

    @Nullable
    /* renamed from: c */
    public NetworkConnectionInfo.NetworkType mo11114c() {
        return this.f418a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NetworkConnectionInfo)) {
            return false;
        }
        NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
        NetworkConnectionInfo.NetworkType networkType = this.f418a;
        if (networkType != null ? networkType.equals(networkConnectionInfo.mo11114c()) : networkConnectionInfo.mo11114c() == null) {
            NetworkConnectionInfo.MobileSubtype mobileSubtype = this.f419b;
            NetworkConnectionInfo.MobileSubtype b = networkConnectionInfo.mo11113b();
            if (mobileSubtype == null) {
                if (b == null) {
                    return true;
                }
            } else if (mobileSubtype.equals(b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        NetworkConnectionInfo.NetworkType networkType = this.f418a;
        int i = 0;
        int hashCode = ((networkType == null ? 0 : networkType.hashCode()) ^ 1000003) * 1000003;
        NetworkConnectionInfo.MobileSubtype mobileSubtype = this.f419b;
        if (mobileSubtype != null) {
            i = mobileSubtype.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f418a + ", mobileSubtype=" + this.f419b + "}";
    }
}
