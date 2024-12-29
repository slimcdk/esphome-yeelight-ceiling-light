package p011c.p012a.p019b.p020a.p021i;

import com.google.auto.value.AutoValue;
import p011c.p012a.p019b.p020a.C0459b;
import p011c.p012a.p019b.p020a.C0460c;
import p011c.p012a.p019b.p020a.C0462e;
import p011c.p012a.p019b.p020a.p021i.C0469b;

@AutoValue
/* renamed from: c.a.b.a.i.k */
abstract class C0485k {

    @AutoValue.Builder
    /* renamed from: c.a.b.a.i.k$a */
    public static abstract class C0486a {
        /* renamed from: a */
        public abstract C0485k mo8430a();

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract C0486a mo8431b(C0459b bVar);

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract C0486a mo8432c(C0460c<?> cVar);

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract C0486a mo8433d(C0462e<?, byte[]> eVar);

        /* renamed from: e */
        public abstract C0486a mo8434e(C0487l lVar);

        /* renamed from: f */
        public abstract C0486a mo8435f(String str);
    }

    C0485k() {
    }

    /* renamed from: a */
    public static C0486a m118a() {
        return new C0469b.C0471b();
    }

    /* renamed from: b */
    public abstract C0459b mo8422b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract C0460c<?> mo8423c();

    /* renamed from: d */
    public byte[] mo8468d() {
        return mo8424e().apply(mo8423c().mo8392b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract C0462e<?, byte[]> mo8424e();

    /* renamed from: f */
    public abstract C0487l mo8426f();

    /* renamed from: g */
    public abstract String mo8427g();
}
