package com.google.firebase.installations.p136r;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.firebase.installations.p136r.C3299b;

@AutoValue
/* renamed from: com.google.firebase.installations.r.e */
public abstract class C3306e {

    @AutoValue.Builder
    /* renamed from: com.google.firebase.installations.r.e$a */
    public static abstract class C3307a {
        @NonNull
        /* renamed from: a */
        public abstract C3306e mo17959a();

        @NonNull
        /* renamed from: b */
        public abstract C3307a mo17960b(@NonNull C3308b bVar);

        @NonNull
        /* renamed from: c */
        public abstract C3307a mo17961c(@NonNull String str);

        @NonNull
        /* renamed from: d */
        public abstract C3307a mo17962d(long j);
    }

    /* renamed from: com.google.firebase.installations.r.e$b */
    public enum C3308b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    @NonNull
    /* renamed from: a */
    public static C3307a m10287a() {
        C3299b.C3301b bVar = new C3299b.C3301b();
        bVar.mo17962d(0);
        return bVar;
    }

    @Nullable
    /* renamed from: b */
    public abstract C3308b mo17953b();

    @Nullable
    /* renamed from: c */
    public abstract String mo17954c();

    @NonNull
    /* renamed from: d */
    public abstract long mo17955d();
}
