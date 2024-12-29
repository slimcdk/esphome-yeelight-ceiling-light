package com.google.zxing.qrcode.decoder;

import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.common.C2549b;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import java.util.Map;
import p026d2.C3129b;
import p034f2.C3161a;
import p034f2.C3163c;

/* renamed from: com.google.zxing.qrcode.decoder.d */
public final class C2624d {

    /* renamed from: a */
    private final C3163c f4471a = new C3163c(C3161a.f5073l);

    /* renamed from: a */
    private void m7261a(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f4471a.mo23691a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.getChecksumInstance();
        }
    }

    /* renamed from: c */
    private C3129b m7262c(C2621a aVar, Map<DecodeHintType, ?> map) {
        C2627g e = aVar.mo19652e();
        ErrorCorrectionLevel d = aVar.mo19651d().mo19659d();
        C2622b[] b = C2622b.m7250b(aVar.mo19650c(), e, d);
        int i = 0;
        for (C2622b c : b) {
            i += c.mo19656c();
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (C2622b bVar : b) {
            byte[] a = bVar.mo19655a();
            int c2 = bVar.mo19656c();
            m7261a(a, c2);
            int i3 = 0;
            while (i3 < c2) {
                bArr[i2] = a[i3];
                i3++;
                i2++;
            }
        }
        return C2623c.m7253a(bArr, e, d, map);
    }

    /* renamed from: b */
    public C3129b mo19657b(C2549b bVar, Map<DecodeHintType, ?> map) {
        ChecksumException e;
        C2621a aVar = new C2621a(bVar);
        FormatException formatException = null;
        try {
            return m7262c(aVar, map);
        } catch (FormatException e2) {
            FormatException formatException2 = e2;
            e = null;
            formatException = formatException2;
            try {
                aVar.mo19653f();
                aVar.mo19654g(true);
                aVar.mo19652e();
                aVar.mo19651d();
                aVar.mo19649b();
                C3129b c = m7262c(aVar, map);
                c.mo23616m(new C2626f(true));
                return c;
            } catch (ChecksumException | FormatException e3) {
                if (formatException != null) {
                    throw formatException;
                } else if (e != null) {
                    throw e;
                } else {
                    throw e3;
                }
            }
        } catch (ChecksumException e4) {
            e = e4;
            aVar.mo19653f();
            aVar.mo19654g(true);
            aVar.mo19652e();
            aVar.mo19651d();
            aVar.mo19649b();
            C3129b c2 = m7262c(aVar, map);
            c2.mo23616m(new C2626f(true));
            return c2;
        }
    }
}
