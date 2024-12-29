package p035g;

import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p035g.C3173b;

@AutoValue
/* renamed from: g.i */
public abstract class C3188i {

    @AutoValue.Builder
    /* renamed from: g.i$a */
    public static abstract class C3189a {
        /* renamed from: a */
        public final C3189a mo23755a(String str, int i) {
            mo23710e().put(str, String.valueOf(i));
            return this;
        }

        /* renamed from: b */
        public final C3189a mo23756b(String str, long j) {
            mo23710e().put(str, String.valueOf(j));
            return this;
        }

        /* renamed from: c */
        public final C3189a mo23757c(String str, String str2) {
            mo23710e().put(str, str2);
            return this;
        }

        /* renamed from: d */
        public abstract C3188i mo23709d();

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public abstract Map<String, String> mo23710e();

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public abstract C3189a mo23711f(Map<String, String> map);

        /* renamed from: g */
        public abstract C3189a mo23712g(Integer num);

        /* renamed from: h */
        public abstract C3189a mo23713h(C3187h hVar);

        /* renamed from: i */
        public abstract C3189a mo23714i(long j);

        /* renamed from: j */
        public abstract C3189a mo23715j(String str);

        /* renamed from: k */
        public abstract C3189a mo23716k(long j);
    }

    /* renamed from: a */
    public static C3189a m8566a() {
        return new C3173b.C3175b().mo23711f(new HashMap());
    }

    /* renamed from: b */
    public final String mo23750b(String str) {
        String str2 = mo23700c().get(str);
        return str2 == null ? "" : str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Map<String, String> mo23700c();

    @Nullable
    /* renamed from: d */
    public abstract Integer mo23701d();

    /* renamed from: e */
    public abstract C3187h mo23702e();

    /* renamed from: f */
    public abstract long mo23704f();

    /* renamed from: g */
    public final int mo23751g(String str) {
        String str2 = mo23700c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* renamed from: h */
    public final long mo23752h(String str) {
        String str2 = mo23700c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Long.valueOf(str2).longValue();
    }

    /* renamed from: i */
    public final Map<String, String> mo23753i() {
        return Collections.unmodifiableMap(mo23700c());
    }

    /* renamed from: j */
    public abstract String mo23706j();

    /* renamed from: k */
    public abstract long mo23707k();

    /* renamed from: l */
    public C3189a mo23754l() {
        return new C3173b.C3175b().mo23715j(mo23706j()).mo23712g(mo23701d()).mo23713h(mo23702e()).mo23714i(mo23704f()).mo23716k(mo23707k()).mo23711f(new HashMap(mo23700c()));
    }
}
