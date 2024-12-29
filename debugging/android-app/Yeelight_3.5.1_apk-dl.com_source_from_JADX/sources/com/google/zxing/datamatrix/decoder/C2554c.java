package com.google.zxing.datamatrix.decoder;

import com.google.zxing.ChecksumException;
import com.google.zxing.common.C2549b;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import p026d2.C3129b;
import p034f2.C3161a;
import p034f2.C3163c;

/* renamed from: com.google.zxing.datamatrix.decoder.c */
public final class C2554c {

    /* renamed from: a */
    private final C3163c f4324a = new C3163c(C3161a.f5074m);

    /* renamed from: a */
    private void m6961a(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f4324a.mo23691a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.getChecksumInstance();
        }
    }

    /* renamed from: b */
    public C3129b mo19514b(C2549b bVar) {
        C2552a aVar = new C2552a(bVar);
        C2553b[] b = C2553b.m6958b(aVar.mo19511c(), aVar.mo19510b());
        int i = 0;
        for (C2553b c : b) {
            i += c.mo19513c();
        }
        byte[] bArr = new byte[i];
        int length = b.length;
        for (int i2 = 0; i2 < length; i2++) {
            C2553b bVar2 = b[i2];
            byte[] a = bVar2.mo19512a();
            int c2 = bVar2.mo19513c();
            m6961a(a, c2);
            for (int i3 = 0; i3 < c2; i3++) {
                bArr[(i3 * length) + i2] = a[i3];
            }
        }
        return DecodedBitStreamParser.m6939a(bArr);
    }
}
