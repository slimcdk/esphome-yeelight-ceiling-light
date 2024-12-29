package com.google.android.datatransport.cct.p103b;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.p103b.C1283g;
import com.google.auto.value.AutoValue;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;

@AutoValue
/* renamed from: com.google.android.datatransport.cct.b.m */
public abstract class C1296m {

    @AutoValue.Builder
    /* renamed from: com.google.android.datatransport.cct.b.m$a */
    public static abstract class C1297a {
        @NonNull
        /* renamed from: a */
        public C1297a mo10198a(int i) {
            mo10181e(Integer.valueOf(i));
            return this;
        }

        @NonNull
        /* renamed from: b */
        public abstract C1297a mo10178b(long j);

        @NonNull
        /* renamed from: c */
        public abstract C1297a mo10179c(@Nullable C1291k kVar);

        @NonNull
        /* renamed from: d */
        public abstract C1297a mo10180d(@Nullable C1303p pVar);

        /* access modifiers changed from: package-private */
        @NonNull
        /* renamed from: e */
        public abstract C1297a mo10181e(@Nullable Integer num);

        /* access modifiers changed from: package-private */
        @NonNull
        /* renamed from: f */
        public abstract C1297a mo10182f(@Nullable String str);

        @NonNull
        /* renamed from: g */
        public abstract C1297a mo10183g(@Nullable List<C1294l> list);

        @NonNull
        /* renamed from: h */
        public abstract C1296m mo10184h();

        @NonNull
        /* renamed from: i */
        public abstract C1297a mo10185i(long j);

        @NonNull
        /* renamed from: j */
        public C1297a mo10199j(@NonNull String str) {
            mo10182f(str);
            return this;
        }
    }

    @NonNull
    /* renamed from: a */
    public static C1297a m3410a() {
        return new C1283g.C1285b();
    }

    @Nullable
    /* renamed from: b */
    public abstract C1291k mo10168b();

    @Nullable
    @Encodable.Field(name = "logEvent")
    /* renamed from: c */
    public abstract List<C1294l> mo10169c();

    @Nullable
    /* renamed from: d */
    public abstract Integer mo10170d();

    @Nullable
    /* renamed from: e */
    public abstract String mo10171e();

    @Nullable
    /* renamed from: f */
    public abstract C1303p mo10173f();

    /* renamed from: g */
    public abstract long mo10174g();

    /* renamed from: h */
    public abstract long mo10175h();
}
