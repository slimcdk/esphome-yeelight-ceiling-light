package com.google.android.datatransport.cct.p103b;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.p103b.C1280f;
import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: com.google.android.datatransport.cct.b.l */
public abstract class C1294l {

    @AutoValue.Builder
    /* renamed from: com.google.android.datatransport.cct.b.l$a */
    public static abstract class C1295a {
        @NonNull
        /* renamed from: a */
        public abstract C1295a mo10160a(long j);

        @NonNull
        /* renamed from: b */
        public abstract C1295a mo10161b(@Nullable C1299o oVar);

        @NonNull
        /* renamed from: c */
        public abstract C1295a mo10162c(@Nullable Integer num);

        @NonNull
        /* renamed from: d */
        public abstract C1294l mo10163d();

        @NonNull
        /* renamed from: e */
        public abstract C1295a mo10164e(long j);

        @NonNull
        /* renamed from: f */
        public abstract C1295a mo10165f(long j);
    }

    @NonNull
    /* renamed from: a */
    public static C1295a m3395a(@NonNull String str) {
        C1280f.C1282b bVar = new C1280f.C1282b();
        bVar.mo10166g(str);
        return bVar;
    }

    @NonNull
    /* renamed from: b */
    public static C1295a m3396b(@NonNull byte[] bArr) {
        C1280f.C1282b bVar = new C1280f.C1282b();
        bVar.mo10167h(bArr);
        return bVar;
    }

    @Nullable
    /* renamed from: c */
    public abstract Integer mo10150c();

    /* renamed from: d */
    public abstract long mo10151d();

    /* renamed from: e */
    public abstract long mo10152e();

    @Nullable
    /* renamed from: f */
    public abstract C1299o mo10154f();

    @Nullable
    /* renamed from: g */
    public abstract byte[] mo10155g();

    @Nullable
    /* renamed from: h */
    public abstract String mo10156h();

    /* renamed from: i */
    public abstract long mo10158i();
}
