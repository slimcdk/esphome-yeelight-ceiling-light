package kotlin.jvm.internal;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.SinceKotlin;
import kotlin.reflect.C9455c;
import kotlin.reflect.C9456d;
import kotlin.reflect.C9474o;
import kotlin.reflect.C9475p;
import kotlin.reflect.KVariance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p228x4.C11982a;

@SinceKotlin(version = "1.4")
public final class TypeReference implements C9474o {
    @NotNull

    /* renamed from: a */
    private final C9456d f17281a;
    @NotNull

    /* renamed from: b */
    private final List<C9475p> f17282b;
    @Nullable

    /* renamed from: c */
    private final C9474o f17283c;

    /* renamed from: d */
    private final int f17284d;

    /* renamed from: kotlin.jvm.internal.TypeReference$a */
    public static final class C9405a {
        private C9405a() {
        }

        public /* synthetic */ C9405a(C9422o oVar) {
            this();
        }
    }

    /* renamed from: kotlin.jvm.internal.TypeReference$b */
    public /* synthetic */ class C9406b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17285a;

        static {
            int[] iArr = new int[KVariance.values().length];
            iArr[KVariance.INVARIANT.ordinal()] = 1;
            iArr[KVariance.IN.ordinal()] = 2;
            iArr[KVariance.OUT.ordinal()] = 3;
            f17285a = iArr;
        }
    }

    static {
        new C9405a((C9422o) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final String m22965b(C9475p pVar) {
        String str;
        StringBuilder sb;
        String str2;
        if (pVar.mo38405b() == null) {
            return "*";
        }
        C9474o a = pVar.mo38404a();
        TypeReference typeReference = a instanceof TypeReference ? (TypeReference) a : null;
        if (typeReference == null || (str = typeReference.m22966c(true)) == null) {
            str = String.valueOf(pVar.mo38404a());
        }
        int i = C9406b.f17285a[pVar.mo38405b().ordinal()];
        if (i == 1) {
            return str;
        }
        if (i == 2) {
            sb = new StringBuilder();
            str2 = "in ";
        } else if (i == 3) {
            sb = new StringBuilder();
            str2 = "out ";
        } else {
            throw new NoWhenBranchMatchedException();
        }
        sb.append(str2);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: c */
    private final String m22966c(boolean z) {
        String str;
        C9456d f = mo38309f();
        Class cls = null;
        C9455c cVar = f instanceof C9455c ? (C9455c) f : null;
        if (cVar != null) {
            cls = C11982a.m30729a(cVar);
        }
        if (cls == null) {
            str = mo38309f().toString();
        } else if ((this.f17284d & 4) != 0) {
            str = "kotlin.Nothing";
        } else if (cls.isArray()) {
            str = m22967e(cls);
        } else if (!z || !cls.isPrimitive()) {
            str = cls.getName();
        } else {
            C9456d f2 = mo38309f();
            C9424q.m22994c(f2, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            str = C11982a.m30730b((C9455c) f2).getName();
        }
        String str2 = "";
        String q = mo38307d().isEmpty() ? str2 : C9309a0.m22811q(mo38307d(), ", ", "<", ">", 0, (CharSequence) null, new TypeReference$asString$args$1(this), 24, (Object) null);
        if (mo38310g()) {
            str2 = "?";
        }
        String str3 = str + q + str2;
        C9474o oVar = this.f17283c;
        if (!(oVar instanceof TypeReference)) {
            return str3;
        }
        String c = ((TypeReference) oVar).m22966c(true);
        if (C9424q.m22992a(c, str3)) {
            return str3;
        }
        if (C9424q.m22992a(c, str3 + '?')) {
            return str3 + '!';
        }
        return '(' + str3 + ".." + c + ')';
    }

    /* renamed from: e */
    private final String m22967e(Class<?> cls) {
        return C9424q.m22992a(cls, boolean[].class) ? "kotlin.BooleanArray" : C9424q.m22992a(cls, char[].class) ? "kotlin.CharArray" : C9424q.m22992a(cls, byte[].class) ? "kotlin.ByteArray" : C9424q.m22992a(cls, short[].class) ? "kotlin.ShortArray" : C9424q.m22992a(cls, int[].class) ? "kotlin.IntArray" : C9424q.m22992a(cls, float[].class) ? "kotlin.FloatArray" : C9424q.m22992a(cls, long[].class) ? "kotlin.LongArray" : C9424q.m22992a(cls, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
    }

    @NotNull
    /* renamed from: d */
    public List<C9475p> mo38307d() {
        return this.f17282b;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof TypeReference) {
            TypeReference typeReference = (TypeReference) obj;
            return C9424q.m22992a(mo38309f(), typeReference.mo38309f()) && C9424q.m22992a(mo38307d(), typeReference.mo38307d()) && C9424q.m22992a(this.f17283c, typeReference.f17283c) && this.f17284d == typeReference.f17284d;
        }
    }

    @NotNull
    /* renamed from: f */
    public C9456d mo38309f() {
        return this.f17281a;
    }

    /* renamed from: g */
    public boolean mo38310g() {
        return (this.f17284d & 1) != 0;
    }

    public int hashCode() {
        return (((mo38309f().hashCode() * 31) + mo38307d().hashCode()) * 31) + Integer.valueOf(this.f17284d).hashCode();
    }

    @NotNull
    public String toString() {
        return m22966c(false) + " (Kotlin reflection is not available)";
    }
}
