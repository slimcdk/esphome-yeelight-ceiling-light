package com.google.firebase.installations.local;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.firebase.installations.local.C2437a;
import com.google.firebase.installations.local.PersistedInstallation;

@AutoValue
/* renamed from: com.google.firebase.installations.local.b */
public abstract class C2440b {

    @AutoValue.Builder
    /* renamed from: com.google.firebase.installations.local.b$a */
    public static abstract class C2441a {
        @NonNull
        /* renamed from: a */
        public abstract C2440b mo19077a();

        @NonNull
        /* renamed from: b */
        public abstract C2441a mo19078b(@Nullable String str);

        @NonNull
        /* renamed from: c */
        public abstract C2441a mo19079c(long j);

        @NonNull
        /* renamed from: d */
        public abstract C2441a mo19080d(@NonNull String str);

        @NonNull
        /* renamed from: e */
        public abstract C2441a mo19081e(@Nullable String str);

        @NonNull
        /* renamed from: f */
        public abstract C2441a mo19082f(@Nullable String str);

        @NonNull
        /* renamed from: g */
        public abstract C2441a mo19083g(@NonNull PersistedInstallation.RegistrationStatus registrationStatus);

        @NonNull
        /* renamed from: h */
        public abstract C2441a mo19084h(long j);
    }

    static {
        m6554a().mo19077a();
    }

    @NonNull
    /* renamed from: a */
    public static C2441a m6554a() {
        return new C2437a.C2439b().mo19084h(0).mo19083g(PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION).mo19079c(0);
    }

    @Nullable
    /* renamed from: b */
    public abstract String mo19066b();

    /* renamed from: c */
    public abstract long mo19067c();

    @Nullable
    /* renamed from: d */
    public abstract String mo19068d();

    @Nullable
    /* renamed from: e */
    public abstract String mo19069e();

    @Nullable
    /* renamed from: f */
    public abstract String mo19071f();

    @NonNull
    /* renamed from: g */
    public abstract PersistedInstallation.RegistrationStatus mo19072g();

    /* renamed from: h */
    public abstract long mo19073h();

    /* renamed from: i */
    public boolean mo19085i() {
        return mo19072g() == PersistedInstallation.RegistrationStatus.REGISTER_ERROR;
    }

    /* renamed from: j */
    public boolean mo19086j() {
        return mo19072g() == PersistedInstallation.RegistrationStatus.NOT_GENERATED || mo19072g() == PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION;
    }

    /* renamed from: k */
    public boolean mo19087k() {
        return mo19072g() == PersistedInstallation.RegistrationStatus.REGISTERED;
    }

    /* renamed from: l */
    public boolean mo19088l() {
        return mo19072g() == PersistedInstallation.RegistrationStatus.UNREGISTERED;
    }

    /* renamed from: m */
    public boolean mo19089m() {
        return mo19072g() == PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION;
    }

    @NonNull
    /* renamed from: n */
    public abstract C2441a mo19075n();

    @NonNull
    /* renamed from: o */
    public C2440b mo19090o(@NonNull String str, long j, long j2) {
        return mo19075n().mo19078b(str).mo19079c(j).mo19084h(j2).mo19077a();
    }

    @NonNull
    /* renamed from: p */
    public C2440b mo19091p() {
        return mo19075n().mo19078b((String) null).mo19077a();
    }

    @NonNull
    /* renamed from: q */
    public C2440b mo19092q(@NonNull String str) {
        return mo19075n().mo19081e(str).mo19083g(PersistedInstallation.RegistrationStatus.REGISTER_ERROR).mo19077a();
    }

    @NonNull
    /* renamed from: r */
    public C2440b mo19093r() {
        return mo19075n().mo19083g(PersistedInstallation.RegistrationStatus.NOT_GENERATED).mo19077a();
    }

    @NonNull
    /* renamed from: s */
    public C2440b mo19094s(@NonNull String str, @NonNull String str2, long j, @Nullable String str3, long j2) {
        return mo19075n().mo19080d(str).mo19083g(PersistedInstallation.RegistrationStatus.REGISTERED).mo19078b(str3).mo19082f(str2).mo19079c(j2).mo19084h(j).mo19077a();
    }

    @NonNull
    /* renamed from: t */
    public C2440b mo19095t(@NonNull String str) {
        return mo19075n().mo19080d(str).mo19083g(PersistedInstallation.RegistrationStatus.UNREGISTERED).mo19077a();
    }
}
