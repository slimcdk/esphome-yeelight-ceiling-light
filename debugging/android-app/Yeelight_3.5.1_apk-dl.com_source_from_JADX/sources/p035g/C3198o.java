package p035g;

import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.Priority;
import com.google.auto.value.AutoValue;
import p035g.C3179d;

@AutoValue
/* renamed from: g.o */
public abstract class C3198o {

    @AutoValue.Builder
    /* renamed from: g.o$a */
    public static abstract class C3199a {
        /* renamed from: a */
        public abstract C3198o mo23736a();

        /* renamed from: b */
        public abstract C3199a mo23737b(String str);

        /* renamed from: c */
        public abstract C3199a mo23738c(@Nullable byte[] bArr);

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: d */
        public abstract C3199a mo23739d(Priority priority);
    }

    /* renamed from: a */
    public static C3199a m8609a() {
        return new C3179d.C3181b().mo23739d(Priority.DEFAULT);
    }

    /* renamed from: b */
    public abstract String mo23731b();

    @Nullable
    /* renamed from: c */
    public abstract byte[] mo23732c();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: d */
    public abstract Priority mo23733d();

    /* renamed from: e */
    public boolean mo23763e() {
        return mo23732c() != null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: f */
    public C3198o mo23764f(Priority priority) {
        return m8609a().mo23737b(mo23731b()).mo23739d(priority).mo23738c(mo23732c()).mo23736a();
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = mo23731b();
        objArr[1] = mo23733d();
        objArr[2] = mo23732c() == null ? "" : Base64.encodeToString(mo23732c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
