package p035g;

import com.google.android.datatransport.C0638b;
import com.google.auto.value.AutoValue;
import p031f.C3150a;
import p031f.C3151b;
import p035g.C3176c;

@AutoValue
/* renamed from: g.n */
abstract class C3196n {

    @AutoValue.Builder
    /* renamed from: g.n$a */
    public static abstract class C3197a {
        /* renamed from: a */
        public abstract C3196n mo23725a();

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract C3197a mo23726b(C3150a aVar);

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract C3197a mo23727c(C0638b<?> bVar);

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract C3197a mo23728d(C3151b<?, byte[]> bVar);

        /* renamed from: e */
        public abstract C3197a mo23729e(C3198o oVar);

        /* renamed from: f */
        public abstract C3197a mo23730f(String str);
    }

    C3196n() {
    }

    /* renamed from: a */
    public static C3197a m8596a() {
        return new C3176c.C3178b();
    }

    /* renamed from: b */
    public abstract C3150a mo23717b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract C0638b<?> mo23718c();

    /* renamed from: d */
    public byte[] mo23762d() {
        return mo23719e().apply(mo23718c().mo11091b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract C3151b<?, byte[]> mo23719e();

    /* renamed from: f */
    public abstract C3198o mo23721f();

    /* renamed from: g */
    public abstract String mo23722g();
}
