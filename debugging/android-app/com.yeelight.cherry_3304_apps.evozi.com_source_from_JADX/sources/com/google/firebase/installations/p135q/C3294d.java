package com.google.firebase.installations.p135q;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.firebase.installations.p135q.C3288a;
import com.google.firebase.installations.p135q.C3292c;

@AutoValue
/* renamed from: com.google.firebase.installations.q.d */
public abstract class C3294d {

    @AutoValue.Builder
    /* renamed from: com.google.firebase.installations.q.d$a */
    public static abstract class C3295a {
        @NonNull
        /* renamed from: a */
        public abstract C3294d mo17916a();

        @NonNull
        /* renamed from: b */
        public abstract C3295a mo17917b(@Nullable String str);

        @NonNull
        /* renamed from: c */
        public abstract C3295a mo17918c(long j);

        @NonNull
        /* renamed from: d */
        public abstract C3295a mo17919d(@NonNull String str);

        @NonNull
        /* renamed from: e */
        public abstract C3295a mo17920e(@Nullable String str);

        @NonNull
        /* renamed from: f */
        public abstract C3295a mo17921f(@Nullable String str);

        @NonNull
        /* renamed from: g */
        public abstract C3295a mo17922g(@NonNull C3292c.C3293a aVar);

        @NonNull
        /* renamed from: h */
        public abstract C3295a mo17923h(long j);
    }

    static {
        m10218a().mo17916a();
    }

    @NonNull
    /* renamed from: a */
    public static C3295a m10218a() {
        C3288a.C3290b bVar = new C3288a.C3290b();
        bVar.mo17923h(0);
        bVar.mo17922g(C3292c.C3293a.ATTEMPT_MIGRATION);
        bVar.mo17918c(0);
        return bVar;
    }

    @Nullable
    /* renamed from: b */
    public abstract String mo17905b();

    /* renamed from: c */
    public abstract long mo17906c();

    @Nullable
    /* renamed from: d */
    public abstract String mo17907d();

    @Nullable
    /* renamed from: e */
    public abstract String mo17908e();

    @Nullable
    /* renamed from: f */
    public abstract String mo17910f();

    @NonNull
    /* renamed from: g */
    public abstract C3292c.C3293a mo17911g();

    /* renamed from: h */
    public abstract long mo17912h();

    /* renamed from: i */
    public boolean mo17928i() {
        return mo17911g() == C3292c.C3293a.REGISTER_ERROR;
    }

    /* renamed from: j */
    public boolean mo17929j() {
        return mo17911g() == C3292c.C3293a.NOT_GENERATED || mo17911g() == C3292c.C3293a.ATTEMPT_MIGRATION;
    }

    /* renamed from: k */
    public boolean mo17930k() {
        return mo17911g() == C3292c.C3293a.REGISTERED;
    }

    /* renamed from: l */
    public boolean mo17931l() {
        return mo17911g() == C3292c.C3293a.UNREGISTERED;
    }

    /* renamed from: m */
    public boolean mo17932m() {
        return mo17911g() == C3292c.C3293a.ATTEMPT_MIGRATION;
    }

    @NonNull
    /* renamed from: n */
    public abstract C3295a mo17914n();

    @NonNull
    /* renamed from: o */
    public C3294d mo17933o(@NonNull String str, long j, long j2) {
        C3295a n = mo17914n();
        n.mo17917b(str);
        n.mo17918c(j);
        n.mo17923h(j2);
        return n.mo17916a();
    }

    @NonNull
    /* renamed from: p */
    public C3294d mo17934p() {
        C3295a n = mo17914n();
        n.mo17917b((String) null);
        return n.mo17916a();
    }

    @NonNull
    /* renamed from: q */
    public C3294d mo17935q(@NonNull String str) {
        C3295a n = mo17914n();
        n.mo17920e(str);
        n.mo17922g(C3292c.C3293a.REGISTER_ERROR);
        return n.mo17916a();
    }

    @NonNull
    /* renamed from: r */
    public C3294d mo17936r() {
        C3295a n = mo17914n();
        n.mo17922g(C3292c.C3293a.NOT_GENERATED);
        return n.mo17916a();
    }

    @NonNull
    /* renamed from: s */
    public C3294d mo17937s(@NonNull String str, @NonNull String str2, long j, @Nullable String str3, long j2) {
        C3295a n = mo17914n();
        n.mo17919d(str);
        n.mo17922g(C3292c.C3293a.REGISTERED);
        n.mo17917b(str3);
        n.mo17921f(str2);
        n.mo17918c(j2);
        n.mo17923h(j);
        return n.mo17916a();
    }

    @NonNull
    /* renamed from: t */
    public C3294d mo17938t(@NonNull String str) {
        C3295a n = mo17914n();
        n.mo17919d(str);
        n.mo17922g(C3292c.C3293a.UNREGISTERED);
        return n.mo17916a();
    }
}
