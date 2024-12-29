package p011c.p012a.p053e;

import p011c.p012a.p053e.p057t.p058m.C0851a;

/* renamed from: c.a.e.p */
public class C0829p {

    /* renamed from: a */
    private final float f743a;

    /* renamed from: b */
    private final float f744b;

    public C0829p(float f, float f2) {
        this.f743a = f;
        this.f744b = f2;
    }

    /* renamed from: a */
    private static float m1142a(C0829p pVar, C0829p pVar2, C0829p pVar3) {
        float f = pVar2.f743a;
        float f2 = pVar2.f744b;
        return ((pVar3.f743a - f) * (pVar.f744b - f2)) - ((pVar3.f744b - f2) * (pVar.f743a - f));
    }

    /* renamed from: b */
    public static float m1143b(C0829p pVar, C0829p pVar2) {
        return C0851a.m1259a(pVar.f743a, pVar.f744b, pVar2.f743a, pVar2.f744b);
    }

    /* renamed from: e */
    public static void m1144e(C0829p[] pVarArr) {
        C0829p pVar;
        C0829p pVar2;
        C0829p pVar3;
        float b = m1143b(pVarArr[0], pVarArr[1]);
        float b2 = m1143b(pVarArr[1], pVarArr[2]);
        float b3 = m1143b(pVarArr[0], pVarArr[2]);
        if (b2 >= b && b2 >= b3) {
            pVar3 = pVarArr[0];
            pVar2 = pVarArr[1];
            pVar = pVarArr[2];
        } else if (b3 < b2 || b3 < b) {
            pVar3 = pVarArr[2];
            pVar2 = pVarArr[0];
            pVar = pVarArr[1];
        } else {
            pVar3 = pVarArr[1];
            pVar2 = pVarArr[0];
            pVar = pVarArr[2];
        }
        if (m1142a(pVar2, pVar3, pVar) < 0.0f) {
            C0829p pVar4 = pVar;
            pVar = pVar2;
            pVar2 = pVar4;
        }
        pVarArr[0] = pVar2;
        pVarArr[1] = pVar3;
        pVarArr[2] = pVar;
    }

    /* renamed from: c */
    public final float mo9020c() {
        return this.f743a;
    }

    /* renamed from: d */
    public final float mo9021d() {
        return this.f744b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0829p) {
            C0829p pVar = (C0829p) obj;
            return this.f743a == pVar.f743a && this.f744b == pVar.f744b;
        }
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f743a) * 31) + Float.floatToIntBits(this.f744b);
    }

    public final String toString() {
        return "(" + this.f743a + ',' + this.f744b + ')';
    }
}
