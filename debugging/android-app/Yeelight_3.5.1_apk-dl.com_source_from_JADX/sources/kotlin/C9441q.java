package kotlin;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.C9422o;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;

@JvmInline
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
/* renamed from: kotlin.q */
public final class C9441q implements Comparable<C9441q> {

    /* renamed from: a */
    private final short f17322a;

    /* renamed from: kotlin.q$a */
    public static final class C9442a {
        private C9442a() {
        }

        public /* synthetic */ C9442a(C9422o oVar) {
            this();
        }
    }

    static {
        new C9442a((C9422o) null);
    }

    @PublishedApi
    private /* synthetic */ C9441q(short s) {
        this.f17322a = s;
    }

    /* renamed from: a */
    public static final /* synthetic */ C9441q m23059a(short s) {
        return new C9441q(s);
    }

    @PublishedApi
    /* renamed from: b */
    public static short m23060b(short s) {
        return s;
    }

    /* renamed from: c */
    public static boolean m23061c(short s, Object obj) {
        return (obj instanceof C9441q) && s == ((C9441q) obj).mo38367f();
    }

    /* renamed from: d */
    public static int m23062d(short s) {
        return s;
    }

    @NotNull
    /* renamed from: e */
    public static String m23063e(short s) {
        return String.valueOf(s & 65535);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return C9424q.m22997f(mo38367f() & 65535, ((C9441q) obj).mo38367f() & 65535);
    }

    public boolean equals(Object obj) {
        return m23061c(this.f17322a, obj);
    }

    /* renamed from: f */
    public final /* synthetic */ short mo38367f() {
        return this.f17322a;
    }

    public int hashCode() {
        return m23062d(this.f17322a);
    }

    @NotNull
    public String toString() {
        return m23063e(this.f17322a);
    }
}
