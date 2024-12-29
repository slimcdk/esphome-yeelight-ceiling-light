package p011c.p012a.p019b.p020a.p021i;

import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.auto.value.AutoValue;
import p011c.p012a.p019b.p020a.C0461d;
import p011c.p012a.p019b.p020a.p021i.C0472c;

@AutoValue
/* renamed from: c.a.b.a.i.l */
public abstract class C0487l {

    @AutoValue.Builder
    /* renamed from: c.a.b.a.i.l$a */
    public static abstract class C0488a {
        /* renamed from: a */
        public abstract C0487l mo8441a();

        /* renamed from: b */
        public abstract C0488a mo8442b(String str);

        /* renamed from: c */
        public abstract C0488a mo8443c(@Nullable byte[] bArr);

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        /* renamed from: d */
        public abstract C0488a mo8444d(C0461d dVar);
    }

    /* renamed from: a */
    public static C0488a m131a() {
        C0472c.C0474b bVar = new C0472c.C0474b();
        bVar.mo8444d(C0461d.DEFAULT);
        return bVar;
    }

    /* renamed from: b */
    public abstract String mo8436b();

    @Nullable
    /* renamed from: c */
    public abstract byte[] mo8437c();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: d */
    public abstract C0461d mo8438d();

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: e */
    public C0487l mo8469e(C0461d dVar) {
        C0488a a = m131a();
        a.mo8442b(mo8436b());
        a.mo8444d(dVar);
        a.mo8443c(mo8437c());
        return a.mo8441a();
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = mo8436b();
        objArr[1] = mo8438d();
        objArr[2] = mo8437c() == null ? "" : Base64.encodeToString(mo8437c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
