package com.google.firebase.installations.remote;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.firebase.installations.remote.C2444a;

@AutoValue
public abstract class InstallationResponse {

    public enum ResponseCode {
        OK,
        BAD_CONFIG
    }

    @AutoValue.Builder
    /* renamed from: com.google.firebase.installations.remote.InstallationResponse$a */
    public static abstract class C2442a {
        @NonNull
        /* renamed from: a */
        public abstract InstallationResponse mo19101a();

        @NonNull
        /* renamed from: b */
        public abstract C2442a mo19102b(@NonNull TokenResult tokenResult);

        @NonNull
        /* renamed from: c */
        public abstract C2442a mo19103c(@NonNull String str);

        @NonNull
        /* renamed from: d */
        public abstract C2442a mo19104d(@NonNull String str);

        @NonNull
        /* renamed from: e */
        public abstract C2442a mo19105e(@NonNull ResponseCode responseCode);

        @NonNull
        /* renamed from: f */
        public abstract C2442a mo19106f(@NonNull String str);
    }

    @NonNull
    /* renamed from: a */
    public static C2442a m6582a() {
        return new C2444a.C2446b();
    }

    @Nullable
    /* renamed from: b */
    public abstract TokenResult mo19096b();

    @Nullable
    /* renamed from: c */
    public abstract String mo19097c();

    @Nullable
    /* renamed from: d */
    public abstract String mo19098d();

    @Nullable
    /* renamed from: e */
    public abstract ResponseCode mo19099e();

    @Nullable
    /* renamed from: f */
    public abstract String mo19100f();
}
