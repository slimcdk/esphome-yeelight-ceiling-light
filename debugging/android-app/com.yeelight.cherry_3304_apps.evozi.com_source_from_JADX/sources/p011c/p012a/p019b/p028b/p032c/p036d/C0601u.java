package p011c.p012a.p019b.p028b.p032c.p036d;

import java.util.Arrays;

/* renamed from: c.a.b.b.c.d.u */
final class C0601u {

    /* renamed from: a */
    final int f280a;

    /* renamed from: b */
    final byte[] f281b;

    C0601u(int i, byte[] bArr) {
        this.f280a = i;
        this.f281b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0601u)) {
            return false;
        }
        C0601u uVar = (C0601u) obj;
        return this.f280a == uVar.f280a && Arrays.equals(this.f281b, uVar.f281b);
    }

    public final int hashCode() {
        return ((this.f280a + 527) * 31) + Arrays.hashCode(this.f281b);
    }
}
