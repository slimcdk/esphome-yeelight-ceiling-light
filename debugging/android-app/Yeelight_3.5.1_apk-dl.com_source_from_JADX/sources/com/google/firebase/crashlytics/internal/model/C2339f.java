package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.google.firebase.crashlytics.internal.model.f */
final class C2339f extends CrashlyticsReport.C2266d.C2268b {

    /* renamed from: a */
    private final String f3819a;

    /* renamed from: b */
    private final byte[] f3820b;

    /* renamed from: com.google.firebase.crashlytics.internal.model.f$b */
    static final class C2341b extends CrashlyticsReport.C2266d.C2268b.C2269a {

        /* renamed from: a */
        private String f3821a;

        /* renamed from: b */
        private byte[] f3822b;

        C2341b() {
        }

        /* renamed from: a */
        public CrashlyticsReport.C2266d.C2268b mo18672a() {
            String str = "";
            if (this.f3821a == null) {
                str = str + " filename";
            }
            if (this.f3822b == null) {
                str = str + " contents";
            }
            if (str.isEmpty()) {
                return new C2339f(this.f3821a, this.f3822b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C2266d.C2268b.C2269a mo18673b(byte[] bArr) {
            Objects.requireNonNull(bArr, "Null contents");
            this.f3822b = bArr;
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.C2266d.C2268b.C2269a mo18674c(String str) {
            Objects.requireNonNull(str, "Null filename");
            this.f3821a = str;
            return this;
        }
    }

    private C2339f(String str, byte[] bArr) {
        this.f3819a = str;
        this.f3820b = bArr;
    }

    @NonNull
    /* renamed from: b */
    public byte[] mo18670b() {
        return this.f3820b;
    }

    @NonNull
    /* renamed from: c */
    public String mo18671c() {
        return this.f3819a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C2266d.C2268b)) {
            return false;
        }
        CrashlyticsReport.C2266d.C2268b bVar = (CrashlyticsReport.C2266d.C2268b) obj;
        if (this.f3819a.equals(bVar.mo18671c())) {
            if (Arrays.equals(this.f3820b, bVar instanceof C2339f ? ((C2339f) bVar).f3820b : bVar.mo18670b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f3819a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f3820b);
    }

    public String toString() {
        return "File{filename=" + this.f3819a + ", contents=" + Arrays.toString(this.f3820b) + "}";
    }
}
