package com.google.firebase.installations.p136r;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.firebase.installations.p136r.C3296a;

@AutoValue
/* renamed from: com.google.firebase.installations.r.d */
public abstract class C3303d {

    @AutoValue.Builder
    /* renamed from: com.google.firebase.installations.r.d$a */
    public static abstract class C3304a {
        @NonNull
        /* renamed from: a */
        public abstract C3303d mo17947a();

        @NonNull
        /* renamed from: b */
        public abstract C3304a mo17948b(@NonNull C3306e eVar);

        @NonNull
        /* renamed from: c */
        public abstract C3304a mo17949c(@NonNull String str);

        @NonNull
        /* renamed from: d */
        public abstract C3304a mo17950d(@NonNull String str);

        @NonNull
        /* renamed from: e */
        public abstract C3304a mo17951e(@NonNull C3305b bVar);

        @NonNull
        /* renamed from: f */
        public abstract C3304a mo17952f(@NonNull String str);
    }

    /* renamed from: com.google.firebase.installations.r.d$b */
    public enum C3305b {
        OK,
        BAD_CONFIG
    }

    @NonNull
    /* renamed from: a */
    public static C3304a m10275a() {
        return new C3296a.C3298b();
    }

    @Nullable
    /* renamed from: b */
    public abstract C3306e mo17939b();

    @Nullable
    /* renamed from: c */
    public abstract String mo17940c();

    @Nullable
    /* renamed from: d */
    public abstract String mo17941d();

    @Nullable
    /* renamed from: e */
    public abstract C3305b mo17942e();

    @Nullable
    /* renamed from: f */
    public abstract String mo17944f();
}
