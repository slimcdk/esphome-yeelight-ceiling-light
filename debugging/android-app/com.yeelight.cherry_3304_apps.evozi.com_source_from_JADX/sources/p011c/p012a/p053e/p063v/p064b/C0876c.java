package p011c.p012a.p053e.p063v.p064b;

import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import java.util.Map;
import p011c.p012a.p053e.C0817d;
import p011c.p012a.p053e.C0818e;
import p011c.p012a.p053e.C0820g;
import p011c.p012a.p053e.p057t.C0840b;
import p011c.p012a.p053e.p057t.C0843e;
import p011c.p012a.p053e.p057t.p059n.C0853a;
import p011c.p012a.p053e.p057t.p059n.C0855c;
import p011c.p012a.p053e.p057t.p059n.C0857e;

/* renamed from: c.a.e.v.b.c */
public final class C0876c {

    /* renamed from: a */
    private final C0855c f909a = new C0855c(C0853a.f852o);

    /* renamed from: a */
    private void m1357a(byte[] bArr, int i, int i2, int i3, int i4) {
        int i5 = i2 + i3;
        int i6 = i4 == 0 ? 1 : 2;
        int[] iArr = new int[(i5 / i6)];
        for (int i7 = 0; i7 < i5; i7++) {
            if (i4 == 0 || i7 % 2 == i4 - 1) {
                iArr[i7 / i6] = bArr[i7 + i] & 255;
            }
        }
        try {
            this.f909a.mo9121a(iArr, i3 / i6);
            for (int i8 = 0; i8 < i2; i8++) {
                if (i4 == 0 || i8 % 2 == i4 - 1) {
                    bArr[i8 + i] = (byte) iArr[i8 / i6];
                }
            }
        } catch (C0857e unused) {
            throw C0817d.m1112a();
        }
    }

    /* renamed from: b */
    public C0843e mo9148b(C0840b bVar, Map<C0818e, ?> map) {
        int i;
        byte[] a = new C0874a(bVar).mo9147a();
        m1357a(a, 0, 10, 10, 0);
        byte b = a[0] & ParameterInitDefType.CubemapSamplerInit;
        if (b == 2 || b == 3 || b == 4) {
            byte[] bArr = a;
            m1357a(bArr, 20, 84, 40, 1);
            m1357a(bArr, 20, 84, 40, 2);
            i = 94;
        } else if (b == 5) {
            byte[] bArr2 = a;
            m1357a(bArr2, 20, 68, 56, 1);
            m1357a(bArr2, 20, 68, 56, 2);
            i = 78;
        } else {
            throw C0820g.m1114a();
        }
        byte[] bArr3 = new byte[i];
        System.arraycopy(a, 0, bArr3, 0, 10);
        System.arraycopy(a, 20, bArr3, 10, bArr3.length - 10);
        return C0875b.m1348a(bArr3, b);
    }
}
