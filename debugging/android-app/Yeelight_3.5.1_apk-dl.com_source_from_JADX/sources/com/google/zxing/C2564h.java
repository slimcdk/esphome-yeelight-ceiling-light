package com.google.zxing;

import p030e2.C3148a;

/* renamed from: com.google.zxing.h */
public class C2564h {

    /* renamed from: a */
    private final float f4352a;

    /* renamed from: b */
    private final float f4353b;

    public C2564h(float f, float f2) {
        this.f4352a = f;
        this.f4353b = f2;
    }

    /* renamed from: a */
    private static float m7002a(C2564h hVar, C2564h hVar2, C2564h hVar3) {
        float f = hVar2.f4352a;
        float f2 = hVar2.f4353b;
        return ((hVar3.f4352a - f) * (hVar.f4353b - f2)) - ((hVar3.f4353b - f2) * (hVar.f4352a - f));
    }

    /* renamed from: b */
    public static float m7003b(C2564h hVar, C2564h hVar2) {
        return C3148a.m8413a(hVar.f4352a, hVar.f4353b, hVar2.f4352a, hVar2.f4353b);
    }

    /* renamed from: e */
    public static void m7004e(C2564h[] hVarArr) {
        C2564h hVar;
        C2564h hVar2;
        C2564h hVar3;
        float b = m7003b(hVarArr[0], hVarArr[1]);
        float b2 = m7003b(hVarArr[1], hVarArr[2]);
        float b3 = m7003b(hVarArr[0], hVarArr[2]);
        if (b2 >= b && b2 >= b3) {
            hVar3 = hVarArr[0];
            hVar2 = hVarArr[1];
            hVar = hVarArr[2];
        } else if (b3 < b2 || b3 < b) {
            hVar3 = hVarArr[2];
            hVar2 = hVarArr[0];
            hVar = hVarArr[1];
        } else {
            hVar3 = hVarArr[1];
            hVar2 = hVarArr[0];
            hVar = hVarArr[2];
        }
        if (m7002a(hVar2, hVar3, hVar) < 0.0f) {
            C2564h hVar4 = hVar;
            hVar = hVar2;
            hVar2 = hVar4;
        }
        hVarArr[0] = hVar2;
        hVarArr[1] = hVar3;
        hVarArr[2] = hVar;
    }

    /* renamed from: c */
    public final float mo19546c() {
        return this.f4352a;
    }

    /* renamed from: d */
    public final float mo19547d() {
        return this.f4353b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2564h) {
            C2564h hVar = (C2564h) obj;
            return this.f4352a == hVar.f4352a && this.f4353b == hVar.f4353b;
        }
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f4352a) * 31) + Float.floatToIntBits(this.f4353b);
    }

    public final String toString() {
        return "(" + this.f4352a + ',' + this.f4353b + ')';
    }
}
