package com.google.firebase.crashlytics.internal.model;

import com.google.auto.value.AutoValue;
import p118y0.C3913e;

@AutoValue
/* renamed from: com.google.firebase.crashlytics.internal.model.a0 */
public abstract class C2323a0 {

    @AutoValue
    /* renamed from: com.google.firebase.crashlytics.internal.model.a0$a */
    public static abstract class C2324a {
        /* renamed from: b */
        public static C2324a m6085b(String str, String str2, String str3, String str4, int i, C3913e eVar) {
            return new C2389x(str, str2, str3, str4, i, eVar);
        }

        /* renamed from: a */
        public abstract String mo18871a();

        /* renamed from: c */
        public abstract int mo18872c();

        /* renamed from: d */
        public abstract C3913e mo18873d();

        /* renamed from: e */
        public abstract String mo18874e();

        /* renamed from: f */
        public abstract String mo18875f();

        /* renamed from: g */
        public abstract String mo18876g();
    }

    @AutoValue
    /* renamed from: com.google.firebase.crashlytics.internal.model.a0$b */
    public static abstract class C2325b {
        /* renamed from: c */
        public static C2325b m6092c(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
            return new C2390y(i, str, i2, j, j2, z, i3, str2, str3);
        }

        /* renamed from: a */
        public abstract int mo18877a();

        /* renamed from: b */
        public abstract int mo18878b();

        /* renamed from: d */
        public abstract long mo18879d();

        /* renamed from: e */
        public abstract boolean mo18880e();

        /* renamed from: f */
        public abstract String mo18881f();

        /* renamed from: g */
        public abstract String mo18882g();

        /* renamed from: h */
        public abstract String mo18883h();

        /* renamed from: i */
        public abstract int mo18884i();

        /* renamed from: j */
        public abstract long mo18885j();
    }

    @AutoValue
    /* renamed from: com.google.firebase.crashlytics.internal.model.a0$c */
    public static abstract class C2326c {
        /* renamed from: a */
        public static C2326c m6102a(String str, String str2, boolean z) {
            return new C2391z(str, str2, z);
        }

        /* renamed from: b */
        public abstract boolean mo18886b();

        /* renamed from: c */
        public abstract String mo18887c();

        /* renamed from: d */
        public abstract String mo18888d();
    }

    /* renamed from: b */
    public static C2323a0 m6081b(C2324a aVar, C2326c cVar, C2325b bVar) {
        return new C2388w(aVar, cVar, bVar);
    }

    /* renamed from: a */
    public abstract C2324a mo18868a();

    /* renamed from: c */
    public abstract C2325b mo18869c();

    /* renamed from: d */
    public abstract C2326c mo18870d();
}
