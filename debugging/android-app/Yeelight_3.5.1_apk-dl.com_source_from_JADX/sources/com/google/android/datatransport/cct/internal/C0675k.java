package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.C0664f;
import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: com.google.android.datatransport.cct.internal.k */
public abstract class C0675k {

    @AutoValue.Builder
    /* renamed from: com.google.android.datatransport.cct.internal.k$a */
    public static abstract class C0676a {
        @NonNull
        /* renamed from: a */
        public abstract C0675k mo11174a();

        @NonNull
        /* renamed from: b */
        public abstract C0676a mo11175b(@Nullable Integer num);

        @NonNull
        /* renamed from: c */
        public abstract C0676a mo11176c(long j);

        @NonNull
        /* renamed from: d */
        public abstract C0676a mo11177d(long j);

        @NonNull
        /* renamed from: e */
        public abstract C0676a mo11178e(@Nullable NetworkConnectionInfo networkConnectionInfo);

        /* access modifiers changed from: package-private */
        @NonNull
        /* renamed from: f */
        public abstract C0676a mo11179f(@Nullable byte[] bArr);

        /* access modifiers changed from: package-private */
        @NonNull
        /* renamed from: g */
        public abstract C0676a mo11180g(@Nullable String str);

        @NonNull
        /* renamed from: h */
        public abstract C0676a mo11181h(long j);
    }

    /* renamed from: a */
    private static C0676a m464a() {
        return new C0664f.C0666b();
    }

    @NonNull
    /* renamed from: i */
    public static C0676a m465i(@NonNull String str) {
        return m464a().mo11180g(str);
    }

    @NonNull
    /* renamed from: j */
    public static C0676a m466j(@NonNull byte[] bArr) {
        return m464a().mo11179f(bArr);
    }

    @Nullable
    /* renamed from: b */
    public abstract Integer mo11164b();

    /* renamed from: c */
    public abstract long mo11165c();

    /* renamed from: d */
    public abstract long mo11166d();

    @Nullable
    /* renamed from: e */
    public abstract NetworkConnectionInfo mo11167e();

    @Nullable
    /* renamed from: f */
    public abstract byte[] mo11169f();

    @Nullable
    /* renamed from: g */
    public abstract String mo11170g();

    /* renamed from: h */
    public abstract long mo11171h();
}
