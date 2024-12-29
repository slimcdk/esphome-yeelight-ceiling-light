package p011c.p012a.p019b.p020a.p021i;

import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p011c.p012a.p019b.p020a.p021i.C0466a;

@AutoValue
/* renamed from: c.a.b.a.i.h */
public abstract class C0481h {

    @AutoValue.Builder
    /* renamed from: c.a.b.a.i.h$a */
    public static abstract class C0482a {
        /* renamed from: a */
        public final C0482a mo8463a(String str, int i) {
            mo8415e().put(str, String.valueOf(i));
            return this;
        }

        /* renamed from: b */
        public final C0482a mo8464b(String str, long j) {
            mo8415e().put(str, String.valueOf(j));
            return this;
        }

        /* renamed from: c */
        public final C0482a mo8465c(String str, String str2) {
            mo8415e().put(str, str2);
            return this;
        }

        /* renamed from: d */
        public abstract C0481h mo8414d();

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public abstract Map<String, String> mo8415e();

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public abstract C0482a mo8416f(Map<String, String> map);

        /* renamed from: g */
        public abstract C0482a mo8417g(Integer num);

        /* renamed from: h */
        public abstract C0482a mo8418h(C0480g gVar);

        /* renamed from: i */
        public abstract C0482a mo8419i(long j);

        /* renamed from: j */
        public abstract C0482a mo8420j(String str);

        /* renamed from: k */
        public abstract C0482a mo8421k(long j);
    }

    /* renamed from: a */
    public static C0482a m91a() {
        C0466a.C0468b bVar = new C0466a.C0468b();
        bVar.mo8416f(new HashMap());
        return bVar;
    }

    /* renamed from: b */
    public final String mo8458b(String str) {
        String str2 = mo8405c().get(str);
        return str2 == null ? "" : str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Map<String, String> mo8405c();

    @Nullable
    /* renamed from: d */
    public abstract Integer mo8406d();

    /* renamed from: e */
    public abstract C0480g mo8407e();

    /* renamed from: f */
    public abstract long mo8409f();

    /* renamed from: g */
    public final int mo8459g(String str) {
        String str2 = mo8405c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* renamed from: h */
    public final long mo8460h(String str) {
        String str2 = mo8405c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Long.valueOf(str2).longValue();
    }

    /* renamed from: i */
    public final Map<String, String> mo8461i() {
        return Collections.unmodifiableMap(mo8405c());
    }

    /* renamed from: j */
    public abstract String mo8411j();

    /* renamed from: k */
    public abstract long mo8412k();

    /* renamed from: l */
    public C0482a mo8462l() {
        C0466a.C0468b bVar = new C0466a.C0468b();
        bVar.mo8420j(mo8411j());
        bVar.mo8417g(mo8406d());
        bVar.mo8418h(mo8407e());
        bVar.mo8419i(mo8409f());
        bVar.mo8421k(mo8412k());
        bVar.mo8416f(new HashMap(mo8405c()));
        return bVar;
    }
}
