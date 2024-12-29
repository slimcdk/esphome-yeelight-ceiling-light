package com.google.firebase.installations.remote;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.firebase.installations.remote.C2447b;

@AutoValue
public abstract class TokenResult {

    public enum ResponseCode {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    @AutoValue.Builder
    /* renamed from: com.google.firebase.installations.remote.TokenResult$a */
    public static abstract class C2443a {
        @NonNull
        /* renamed from: a */
        public abstract TokenResult mo19110a();

        @NonNull
        /* renamed from: b */
        public abstract C2443a mo19111b(@NonNull ResponseCode responseCode);

        @NonNull
        /* renamed from: c */
        public abstract C2443a mo19112c(@NonNull String str);

        @NonNull
        /* renamed from: d */
        public abstract C2443a mo19113d(long j);
    }

    @NonNull
    /* renamed from: a */
    public static C2443a m6594a() {
        return new C2447b.C2449b().mo19113d(0);
    }

    @Nullable
    /* renamed from: b */
    public abstract ResponseCode mo19107b();

    @Nullable
    /* renamed from: c */
    public abstract String mo19108c();

    @NonNull
    /* renamed from: d */
    public abstract long mo19109d();
}
