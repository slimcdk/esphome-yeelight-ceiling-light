package p011b1;

import androidx.annotation.Nullable;
import java.io.File;
import p033f1.C3160f;

/* renamed from: b1.c */
public class C0582c {

    /* renamed from: c */
    private static final C0584b f183c = new C0584b();

    /* renamed from: a */
    private final C3160f f184a;

    /* renamed from: b */
    private C0580a f185b;

    /* renamed from: b1.c$b */
    private static final class C0584b implements C0580a {
        private C0584b() {
        }

        /* renamed from: a */
        public void mo10923a() {
        }

        /* renamed from: b */
        public String mo10924b() {
            return null;
        }

        /* renamed from: c */
        public byte[] mo10925c() {
            return null;
        }

        /* renamed from: d */
        public void mo10926d() {
        }

        /* renamed from: e */
        public void mo10927e(long j, String str) {
        }
    }

    public C0582c(C3160f fVar) {
        this.f184a = fVar;
        this.f185b = f183c;
    }

    public C0582c(C3160f fVar, String str) {
        this(fVar);
        mo10934e(str);
    }

    /* renamed from: d */
    private File m87d(String str) {
        return this.f184a.mo23668o(str, "userlog");
    }

    /* renamed from: a */
    public void mo10931a() {
        this.f185b.mo10926d();
    }

    /* renamed from: b */
    public byte[] mo10932b() {
        return this.f185b.mo10925c();
    }

    @Nullable
    /* renamed from: c */
    public String mo10933c() {
        return this.f185b.mo10924b();
    }

    /* renamed from: e */
    public final void mo10934e(String str) {
        this.f185b.mo10923a();
        this.f185b = f183c;
        if (str != null) {
            mo10935f(m87d(str), 65536);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo10935f(File file, int i) {
        this.f185b = new C0592f(file, i);
    }

    /* renamed from: g */
    public void mo10936g(long j, String str) {
        this.f185b.mo10927e(j, str);
    }
}
