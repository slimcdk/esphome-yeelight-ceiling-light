package kotlin.reflect;

import kotlin.NoWhenBranchMatchedException;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.C9422o;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.1")
/* renamed from: kotlin.reflect.p */
public final class C9475p {
    @Nullable

    /* renamed from: a */
    private final KVariance f17332a;
    @Nullable

    /* renamed from: b */
    private final C9474o f17333b;

    /* renamed from: kotlin.reflect.p$a */
    public static final class C9476a {
        private C9476a() {
        }

        public /* synthetic */ C9476a(C9422o oVar) {
            this();
        }
    }

    /* renamed from: kotlin.reflect.p$b */
    public /* synthetic */ class C9477b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17334a;

        static {
            int[] iArr = new int[KVariance.values().length];
            iArr[KVariance.INVARIANT.ordinal()] = 1;
            iArr[KVariance.IN.ordinal()] = 2;
            iArr[KVariance.OUT.ordinal()] = 3;
            f17334a = iArr;
        }
    }

    static {
        new C9476a((C9422o) null);
        new C9475p((KVariance) null, (C9474o) null);
    }

    public C9475p(@Nullable KVariance kVariance, @Nullable C9474o oVar) {
        String str;
        this.f17332a = kVariance;
        this.f17333b = oVar;
        if (!((kVariance == null) != (oVar == null) ? false : true)) {
            if (kVariance == null) {
                str = "Star projection must have no type specified.";
            } else {
                str = "The projection variance " + kVariance + " requires type to be specified.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    @Nullable
    /* renamed from: a */
    public final C9474o mo38404a() {
        return this.f17333b;
    }

    @Nullable
    /* renamed from: b */
    public final KVariance mo38405b() {
        return this.f17332a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9475p)) {
            return false;
        }
        C9475p pVar = (C9475p) obj;
        return this.f17332a == pVar.f17332a && C9424q.m22992a(this.f17333b, pVar.f17333b);
    }

    public int hashCode() {
        KVariance kVariance = this.f17332a;
        int i = 0;
        int hashCode = (kVariance == null ? 0 : kVariance.hashCode()) * 31;
        C9474o oVar = this.f17333b;
        if (oVar != null) {
            i = oVar.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public String toString() {
        String str;
        StringBuilder sb;
        KVariance kVariance = this.f17332a;
        int i = kVariance == null ? -1 : C9477b.f17334a[kVariance.ordinal()];
        if (i == -1) {
            return "*";
        }
        if (i == 1) {
            return String.valueOf(this.f17333b);
        }
        if (i == 2) {
            sb = new StringBuilder();
            str = "in ";
        } else if (i == 3) {
            sb = new StringBuilder();
            str = "out ";
        } else {
            throw new NoWhenBranchMatchedException();
        }
        sb.append(str);
        sb.append(this.f17333b);
        return sb.toString();
    }
}
