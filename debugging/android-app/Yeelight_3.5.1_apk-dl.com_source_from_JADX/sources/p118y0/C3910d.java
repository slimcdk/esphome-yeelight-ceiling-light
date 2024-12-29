package p118y0;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.C2323a0;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import p077o1.C3500a;
import p077o1.C3502b;

/* renamed from: y0.d */
public final class C3910d implements C3909a {

    /* renamed from: c */
    private static final C3917g f6549c = new C3912b();

    /* renamed from: a */
    private final C3500a<C3909a> f6550a;

    /* renamed from: b */
    private final AtomicReference<C3909a> f6551b = new AtomicReference<>((Object) null);

    /* renamed from: y0.d$b */
    private static final class C3912b implements C3917g {
        private C3912b() {
        }

        /* renamed from: a */
        public File mo26391a() {
            return null;
        }

        /* renamed from: b */
        public File mo26392b() {
            return null;
        }

        /* renamed from: c */
        public File mo26393c() {
            return null;
        }

        /* renamed from: d */
        public File mo26394d() {
            return null;
        }

        /* renamed from: e */
        public File mo26395e() {
            return null;
        }

        /* renamed from: f */
        public File mo26396f() {
            return null;
        }
    }

    public C3910d(C3500a<C3909a> aVar) {
        this.f6550a = aVar;
        aVar.mo24334a(new C12011c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m11169g(C3502b bVar) {
        C3916f.m11190f().mo26399b("Crashlytics native component now available.");
        this.f6551b.set((C3909a) bVar.get());
    }

    @NonNull
    /* renamed from: a */
    public C3917g mo26387a(@NonNull String str) {
        C3909a aVar = this.f6551b.get();
        return aVar == null ? f6549c : aVar.mo26387a(str);
    }

    /* renamed from: b */
    public boolean mo26388b() {
        C3909a aVar = this.f6551b.get();
        return aVar != null && aVar.mo26388b();
    }

    /* renamed from: c */
    public void mo26389c(@NonNull String str, @NonNull String str2, long j, @NonNull C2323a0 a0Var) {
        C3916f f = C3916f.m11190f();
        f.mo26405i("Deferring native open session: " + str);
        this.f6550a.mo24334a(new C12010b(str, str2, j, a0Var));
    }

    /* renamed from: d */
    public boolean mo26390d(@NonNull String str) {
        C3909a aVar = this.f6551b.get();
        return aVar != null && aVar.mo26390d(str);
    }
}
