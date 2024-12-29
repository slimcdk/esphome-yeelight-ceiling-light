package kotlin;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.C9422o;
import kotlin.jvm.internal.C9424q;
import org.apache.commons.p194io.FilenameUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p125a5.C3975c;

@SinceKotlin(version = "1.1")
/* renamed from: kotlin.b */
public final class C9304b implements Comparable<C9304b> {
    @NotNull
    @JvmField

    /* renamed from: e */
    public static final C9304b f17232e = C9306c.m22802a();

    /* renamed from: a */
    private final int f17233a;

    /* renamed from: b */
    private final int f17234b;

    /* renamed from: c */
    private final int f17235c;

    /* renamed from: d */
    private final int f17236d;

    /* renamed from: kotlin.b$a */
    public static final class C9305a {
        private C9305a() {
        }

        public /* synthetic */ C9305a(C9422o oVar) {
            this();
        }
    }

    static {
        new C9305a((C9422o) null);
    }

    public C9304b(int i, int i2, int i3) {
        this.f17233a = i;
        this.f17234b = i2;
        this.f17235c = i3;
        this.f17236d = m22800b(i, i2, i3);
    }

    /* renamed from: b */
    private final int m22800b(int i, int i2, int i3) {
        boolean z = false;
        if (new C3975c(0, 255).mo26534m(i) && new C3975c(0, 255).mo26534m(i2) && new C3975c(0, 255).mo26534m(i3)) {
            z = true;
        }
        if (z) {
            return (i << 16) + (i2 << 8) + i3;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + FilenameUtils.EXTENSION_SEPARATOR + i2 + FilenameUtils.EXTENSION_SEPARATOR + i3).toString());
    }

    /* renamed from: a */
    public int compareTo(@NotNull C9304b bVar) {
        C9424q.m22996e(bVar, "other");
        return this.f17236d - bVar.f17236d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        C9304b bVar = obj instanceof C9304b ? (C9304b) obj : null;
        return bVar != null && this.f17236d == bVar.f17236d;
    }

    public int hashCode() {
        return this.f17236d;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f17233a);
        sb.append(FilenameUtils.EXTENSION_SEPARATOR);
        sb.append(this.f17234b);
        sb.append(FilenameUtils.EXTENSION_SEPARATOR);
        sb.append(this.f17235c);
        return sb.toString();
    }
}
