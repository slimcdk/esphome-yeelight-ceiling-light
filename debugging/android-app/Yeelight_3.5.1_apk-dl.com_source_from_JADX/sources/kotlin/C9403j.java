package kotlin;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.C9422o;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;

@JvmInline
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
/* renamed from: kotlin.j */
public final class C9403j implements Comparable<C9403j> {

    /* renamed from: a */
    private final byte f17280a;

    /* renamed from: kotlin.j$a */
    public static final class C9404a {
        private C9404a() {
        }

        public /* synthetic */ C9404a(C9422o oVar) {
            this();
        }
    }

    static {
        new C9404a((C9422o) null);
    }

    @PublishedApi
    private /* synthetic */ C9403j(byte b) {
        this.f17280a = b;
    }

    /* renamed from: a */
    public static final /* synthetic */ C9403j m22958a(byte b) {
        return new C9403j(b);
    }

    @PublishedApi
    /* renamed from: b */
    public static byte m22959b(byte b) {
        return b;
    }

    /* renamed from: c */
    public static boolean m22960c(byte b, Object obj) {
        return (obj instanceof C9403j) && b == ((C9403j) obj).mo38246f();
    }

    /* renamed from: d */
    public static int m22961d(byte b) {
        return b;
    }

    @NotNull
    /* renamed from: e */
    public static String m22962e(byte b) {
        return String.valueOf(b & 255);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return C9424q.m22997f(mo38246f() & 255, ((C9403j) obj).mo38246f() & 255);
    }

    public boolean equals(Object obj) {
        return m22960c(this.f17280a, obj);
    }

    /* renamed from: f */
    public final /* synthetic */ byte mo38246f() {
        return this.f17280a;
    }

    public int hashCode() {
        return m22961d(this.f17280a);
    }

    @NotNull
    public String toString() {
        return m22962e(this.f17280a);
    }
}
