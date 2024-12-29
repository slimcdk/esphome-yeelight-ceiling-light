package com.google.zxing.qrcode.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.C2549b;

/* renamed from: com.google.zxing.qrcode.decoder.a */
final class C2621a {

    /* renamed from: a */
    private final C2549b f4464a;

    /* renamed from: b */
    private C2627g f4465b;

    /* renamed from: c */
    private C2625e f4466c;

    /* renamed from: d */
    private boolean f4467d;

    C2621a(C2549b bVar) {
        int g = bVar.mo19497g();
        if (g < 21 || (g & 3) != 1) {
            throw FormatException.getFormatInstance();
        }
        this.f4464a = bVar;
    }

    /* renamed from: a */
    private int m7243a(int i, int i2, int i3) {
        return this.f4467d ? this.f4464a.mo19493d(i2, i) : this.f4464a.mo19493d(i, i2) ? (i3 << 1) | 1 : i3 << 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo19649b() {
        int i = 0;
        while (i < this.f4464a.mo19501j()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.f4464a.mo19497g(); i3++) {
                if (this.f4464a.mo19493d(i, i3) != this.f4464a.mo19493d(i3, i)) {
                    this.f4464a.mo19491c(i3, i);
                    this.f4464a.mo19491c(i, i3);
                }
            }
            i = i2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public byte[] mo19650c() {
        C2625e d = mo19651d();
        C2627g e = mo19652e();
        DataMask dataMask = DataMask.values()[d.mo19658c()];
        int g = this.f4464a.mo19497g();
        dataMask.unmaskBitMatrix(this.f4464a, g);
        C2549b a = e.mo19663a();
        byte[] bArr = new byte[e.mo19667h()];
        int i = g - 1;
        boolean z = true;
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 > 0) {
            if (i2 == 6) {
                i2--;
            }
            for (int i6 = 0; i6 < g; i6++) {
                int i7 = z ? i - i6 : i6;
                for (int i8 = 0; i8 < 2; i8++) {
                    int i9 = i2 - i8;
                    if (!a.mo19493d(i9, i7)) {
                        i4++;
                        i5 <<= 1;
                        if (this.f4464a.mo19493d(i9, i7)) {
                            i5 |= 1;
                        }
                        if (i4 == 8) {
                            bArr[i3] = (byte) i5;
                            i3++;
                            i4 = 0;
                            i5 = 0;
                        }
                    }
                }
            }
            z = !z;
            i2 -= 2;
        }
        if (i3 == e.mo19667h()) {
            return bArr;
        }
        throw FormatException.getFormatInstance();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C2625e mo19651d() {
        C2625e eVar = this.f4466c;
        if (eVar != null) {
            return eVar;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            i2 = m7243a(i3, 8, i2);
        }
        int a = m7243a(8, 7, m7243a(8, 8, m7243a(7, 8, i2)));
        for (int i4 = 5; i4 >= 0; i4--) {
            a = m7243a(8, i4, a);
        }
        int g = this.f4464a.mo19497g();
        int i5 = g - 7;
        for (int i6 = g - 1; i6 >= i5; i6--) {
            i = m7243a(8, i6, i);
        }
        for (int i7 = g - 8; i7 < g; i7++) {
            i = m7243a(i7, 8, i);
        }
        C2625e a2 = C2625e.m7264a(a, i);
        this.f4466c = a2;
        if (a2 != null) {
            return a2;
        }
        throw FormatException.getFormatInstance();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C2627g mo19652e() {
        C2627g gVar = this.f4465b;
        if (gVar != null) {
            return gVar;
        }
        int g = this.f4464a.mo19497g();
        int i = (g - 17) / 4;
        if (i <= 6) {
            return C2627g.m7273i(i);
        }
        int i2 = g - 11;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 5; i5 >= 0; i5--) {
            for (int i6 = g - 9; i6 >= i2; i6--) {
                i4 = m7243a(i6, i5, i4);
            }
        }
        C2627g c = C2627g.m7271c(i4);
        if (c == null || c.mo19665e() != g) {
            for (int i7 = 5; i7 >= 0; i7--) {
                for (int i8 = g - 9; i8 >= i2; i8--) {
                    i3 = m7243a(i7, i8, i3);
                }
            }
            C2627g c2 = C2627g.m7271c(i3);
            if (c2 == null || c2.mo19665e() != g) {
                throw FormatException.getFormatInstance();
            }
            this.f4465b = c2;
            return c2;
        }
        this.f4465b = c;
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo19653f() {
        if (this.f4466c != null) {
            DataMask.values()[this.f4466c.mo19658c()].unmaskBitMatrix(this.f4464a, this.f4464a.mo19497g());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo19654g(boolean z) {
        this.f4465b = null;
        this.f4466c = null;
        this.f4467d = z;
    }
}
