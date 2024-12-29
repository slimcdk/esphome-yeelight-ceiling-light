package p046i2;

import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.common.C2549b;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import java.util.Map;
import p026d2.C3129b;
import p034f2.C3161a;
import p034f2.C3163c;

/* renamed from: i2.c */
public final class C3251c {

    /* renamed from: a */
    private final C3163c f5234a = new C3163c(C3161a.f5076o);

    /* renamed from: a */
    private void m8713a(byte[] bArr, int i, int i2, int i3, int i4) {
        int i5 = i2 + i3;
        int i6 = i4 == 0 ? 1 : 2;
        int[] iArr = new int[(i5 / i6)];
        for (int i7 = 0; i7 < i5; i7++) {
            if (i4 == 0 || i7 % 2 == i4 - 1) {
                iArr[i7 / i6] = bArr[i7 + i] & 255;
            }
        }
        try {
            this.f5234a.mo23691a(iArr, i3 / i6);
            for (int i8 = 0; i8 < i2; i8++) {
                if (i4 == 0 || i8 % 2 == i4 - 1) {
                    bArr[i8 + i] = (byte) iArr[i8 / i6];
                }
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.getChecksumInstance();
        }
    }

    /* renamed from: b */
    public C3129b mo23795b(C2549b bVar, Map<DecodeHintType, ?> map) {
        int i;
        byte[] a = new C3249a(bVar).mo23794a();
        m8713a(a, 0, 10, 10, 0);
        byte b = a[0] & ParameterInitDefType.CubemapSamplerInit;
        if (b == 2 || b == 3 || b == 4) {
            byte[] bArr = a;
            m8713a(bArr, 20, 84, 40, 1);
            m8713a(bArr, 20, 84, 40, 2);
            i = 94;
        } else if (b == 5) {
            byte[] bArr2 = a;
            m8713a(bArr2, 20, 68, 56, 1);
            m8713a(bArr2, 20, 68, 56, 2);
            i = 78;
        } else {
            throw FormatException.getFormatInstance();
        }
        byte[] bArr3 = new byte[i];
        System.arraycopy(a, 0, bArr3, 0, 10);
        System.arraycopy(a, 20, bArr3, 10, bArr3.length - 10);
        return C3250b.m8704a(bArr3, b);
    }
}
