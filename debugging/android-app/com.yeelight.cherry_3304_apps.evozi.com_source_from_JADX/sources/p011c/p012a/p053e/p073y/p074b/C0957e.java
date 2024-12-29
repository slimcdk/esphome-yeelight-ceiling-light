package p011c.p012a.p053e.p073y.p074b;

import java.util.Map;
import p011c.p012a.p053e.C0817d;
import p011c.p012a.p053e.C0818e;
import p011c.p012a.p053e.C0820g;
import p011c.p012a.p053e.p057t.C0840b;
import p011c.p012a.p053e.p057t.C0843e;
import p011c.p012a.p053e.p057t.p059n.C0853a;
import p011c.p012a.p053e.p057t.p059n.C0855c;
import p011c.p012a.p053e.p057t.p059n.C0857e;

/* renamed from: c.a.e.y.b.e */
public final class C0957e {

    /* renamed from: a */
    private final C0855c f1101a = new C0855c(C0853a.f849l);

    /* renamed from: a */
    private void m1728a(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f1101a.mo9121a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (C0857e unused) {
            throw C0817d.m1112a();
        }
    }

    /* renamed from: c */
    private C0843e m1729c(C0945a aVar, Map<C0818e, ?> map) {
        C0962j e = aVar.mo9303e();
        C0958f d = aVar.mo9302d().mo9313d();
        C0946b[] b = C0946b.m1707b(aVar.mo9301c(), e, d);
        int i = 0;
        for (C0946b c : b) {
            i += c.mo9307c();
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (C0946b bVar : b) {
            byte[] a = bVar.mo9306a();
            int c2 = bVar.mo9307c();
            m1728a(a, c2);
            int i3 = 0;
            while (i3 < c2) {
                bArr[i2] = a[i3];
                i3++;
                i2++;
            }
        }
        return C0956d.m1720a(bArr, e, d, map);
    }

    /* renamed from: b */
    public C0843e mo9310b(C0840b bVar, Map<C0818e, ?> map) {
        C0817d e;
        C0945a aVar = new C0945a(bVar);
        C0820g gVar = null;
        try {
            return m1729c(aVar, map);
        } catch (C0820g e2) {
            C0820g gVar2 = e2;
            e = null;
            gVar = gVar2;
            try {
                aVar.mo9304f();
                aVar.mo9305g(true);
                aVar.mo9303e();
                aVar.mo9302d();
                aVar.mo9300b();
                C0843e c = m1729c(aVar, map);
                c.mo9091m(new C0961i(true));
                return c;
            } catch (C0817d | C0820g e3) {
                if (gVar != null) {
                    throw gVar;
                } else if (e != null) {
                    throw e;
                } else {
                    throw e3;
                }
            }
        } catch (C0817d e4) {
            e = e4;
            aVar.mo9304f();
            aVar.mo9305g(true);
            aVar.mo9303e();
            aVar.mo9302d();
            aVar.mo9300b();
            C0843e c2 = m1729c(aVar, map);
            c2.mo9091m(new C0961i(true));
            return c2;
        }
    }
}
