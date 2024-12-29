package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Arrays;

/* renamed from: com.google.firebase.crashlytics.internal.model.e */
final class C3116e extends CrashlyticsReport.C3050c.C3052b {

    /* renamed from: a */
    private final String f5984a;

    /* renamed from: b */
    private final byte[] f5985b;

    /* renamed from: com.google.firebase.crashlytics.internal.model.e$b */
    static final class C3118b extends CrashlyticsReport.C3050c.C3052b.C3053a {

        /* renamed from: a */
        private String f5986a;

        /* renamed from: b */
        private byte[] f5987b;

        C3118b() {
        }

        /* renamed from: a */
        public CrashlyticsReport.C3050c.C3052b mo17464a() {
            String str = "";
            if (this.f5986a == null) {
                str = str + " filename";
            }
            if (this.f5987b == null) {
                str = str + " contents";
            }
            if (str.isEmpty()) {
                return new C3116e(this.f5986a, this.f5987b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C3050c.C3052b.C3053a mo17465b(byte[] bArr) {
            if (bArr != null) {
                this.f5987b = bArr;
                return this;
            }
            throw new NullPointerException("Null contents");
        }

        /* renamed from: c */
        public CrashlyticsReport.C3050c.C3052b.C3053a mo17466c(String str) {
            if (str != null) {
                this.f5986a = str;
                return this;
            }
            throw new NullPointerException("Null filename");
        }
    }

    private C3116e(String str, byte[] bArr) {
        this.f5984a = str;
        this.f5985b = bArr;
    }

    @NonNull
    /* renamed from: b */
    public byte[] mo17462b() {
        return this.f5985b;
    }

    @NonNull
    /* renamed from: c */
    public String mo17463c() {
        return this.f5984a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C3050c.C3052b)) {
            return false;
        }
        CrashlyticsReport.C3050c.C3052b bVar = (CrashlyticsReport.C3050c.C3052b) obj;
        if (this.f5984a.equals(bVar.mo17463c())) {
            if (Arrays.equals(this.f5985b, bVar instanceof C3116e ? ((C3116e) bVar).f5985b : bVar.mo17462b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f5984a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f5985b);
    }

    public String toString() {
        return "File{filename=" + this.f5984a + ", contents=" + Arrays.toString(this.f5985b) + "}";
    }
}
