package p125a5;

import kotlin.jvm.internal.C9422o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: a5.c */
public final class C3975c extends C3972a {
    @NotNull

    /* renamed from: e */
    public static final C3976a f6724e = new C3976a((C9422o) null);
    /* access modifiers changed from: private */
    @NotNull

    /* renamed from: f */
    public static final C3975c f6725f = new C3975c(1, 0);

    /* renamed from: a5.c$a */
    public static final class C3976a {
        private C3976a() {
        }

        public /* synthetic */ C3976a(C9422o oVar) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final C3975c mo26537a() {
            return C3975c.f6725f;
        }
    }

    public C3975c(int i, int i2) {
        super(i, i2, 1);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof C3975c) {
            if (!isEmpty() || !((C3975c) obj).isEmpty()) {
                C3975c cVar = (C3975c) obj;
                if (!(mo26522b() == cVar.mo26522b() && mo26523e() == cVar.mo26523e())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (mo26522b() * 31) + mo26523e();
    }

    public boolean isEmpty() {
        return mo26522b() > mo26523e();
    }

    /* renamed from: m */
    public boolean mo26534m(int i) {
        return mo26522b() <= i && i <= mo26523e();
    }

    @NotNull
    /* renamed from: n */
    public Integer mo26535n() {
        return Integer.valueOf(mo26523e());
    }

    @NotNull
    /* renamed from: o */
    public Integer mo26536o() {
        return Integer.valueOf(mo26522b());
    }

    @NotNull
    public String toString() {
        return mo26522b() + ".." + mo26523e();
    }
}
