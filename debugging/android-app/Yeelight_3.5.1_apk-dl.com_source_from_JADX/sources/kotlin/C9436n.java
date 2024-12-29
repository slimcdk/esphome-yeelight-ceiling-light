package kotlin;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.C9422o;
import org.jetbrains.annotations.NotNull;

@JvmInline
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
/* renamed from: kotlin.n */
public final class C9436n implements Comparable<C9436n> {

    /* renamed from: a */
    private final long f17318a;

    /* renamed from: kotlin.n$a */
    public static final class C9437a {
        private C9437a() {
        }

        public /* synthetic */ C9437a(C9422o oVar) {
            this();
        }
    }

    static {
        new C9437a((C9422o) null);
    }

    @PublishedApi
    private /* synthetic */ C9436n(long j) {
        this.f17318a = j;
    }

    /* renamed from: a */
    public static final /* synthetic */ C9436n m23051a(long j) {
        return new C9436n(j);
    }

    @PublishedApi
    /* renamed from: b */
    public static long m23052b(long j) {
        return j;
    }

    /* renamed from: c */
    public static boolean m23053c(long j, Object obj) {
        return (obj instanceof C9436n) && j == ((C9436n) obj).mo38358f();
    }

    /* renamed from: d */
    public static int m23054d(long j) {
        return (int) (j ^ (j >>> 32));
    }

    @NotNull
    /* renamed from: e */
    public static String m23055e(long j) {
        return C9493t.m23109c(j);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return C9493t.m23108b(mo38358f(), ((C9436n) obj).mo38358f());
    }

    public boolean equals(Object obj) {
        return m23053c(this.f17318a, obj);
    }

    /* renamed from: f */
    public final /* synthetic */ long mo38358f() {
        return this.f17318a;
    }

    public int hashCode() {
        return m23054d(this.f17318a);
    }

    @NotNull
    public String toString() {
        return m23055e(this.f17318a);
    }
}
