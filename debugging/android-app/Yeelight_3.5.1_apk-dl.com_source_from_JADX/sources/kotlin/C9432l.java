package kotlin;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.C9422o;
import org.jetbrains.annotations.NotNull;

@JvmInline
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
/* renamed from: kotlin.l */
public final class C9432l implements Comparable<C9432l> {

    /* renamed from: a */
    private final int f17315a;

    /* renamed from: kotlin.l$a */
    public static final class C9433a {
        private C9433a() {
        }

        public /* synthetic */ C9433a(C9422o oVar) {
            this();
        }
    }

    static {
        new C9433a((C9422o) null);
    }

    @PublishedApi
    private /* synthetic */ C9432l(int i) {
        this.f17315a = i;
    }

    /* renamed from: a */
    public static final /* synthetic */ C9432l m23043a(int i) {
        return new C9432l(i);
    }

    @PublishedApi
    /* renamed from: b */
    public static int m23044b(int i) {
        return i;
    }

    /* renamed from: c */
    public static boolean m23045c(int i, Object obj) {
        return (obj instanceof C9432l) && i == ((C9432l) obj).mo38349f();
    }

    /* renamed from: d */
    public static int m23046d(int i) {
        return i;
    }

    @NotNull
    /* renamed from: e */
    public static String m23047e(int i) {
        return String.valueOf(((long) i) & 4294967295L);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return C9493t.m23107a(mo38349f(), ((C9432l) obj).mo38349f());
    }

    public boolean equals(Object obj) {
        return m23045c(this.f17315a, obj);
    }

    /* renamed from: f */
    public final /* synthetic */ int mo38349f() {
        return this.f17315a;
    }

    public int hashCode() {
        return m23046d(this.f17315a);
    }

    @NotNull
    public String toString() {
        return m23047e(this.f17315a);
    }
}
