package p011c.p012a.p053e.p060u.p061b;

import p011c.p012a.p053e.C0817d;
import p011c.p012a.p053e.p057t.C0840b;
import p011c.p012a.p053e.p057t.C0843e;
import p011c.p012a.p053e.p057t.p059n.C0853a;
import p011c.p012a.p053e.p057t.p059n.C0855c;
import p011c.p012a.p053e.p057t.p059n.C0857e;

/* renamed from: c.a.e.u.b.d */
public final class C0864d {

    /* renamed from: a */
    private final C0855c f886a = new C0855c(C0853a.f850m);

    /* renamed from: a */
    private void m1318a(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f886a.mo9121a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (C0857e unused) {
            throw C0817d.m1112a();
        }
    }

    /* renamed from: b */
    public C0843e mo9127b(C0840b bVar) {
        C0859a aVar = new C0859a(bVar);
        C0860b[] b = C0860b.m1306b(aVar.mo9124c(), aVar.mo9123b());
        int i = 0;
        for (C0860b c : b) {
            i += c.mo9126c();
        }
        byte[] bArr = new byte[i];
        int length = b.length;
        for (int i2 = 0; i2 < length; i2++) {
            C0860b bVar2 = b[i2];
            byte[] a = bVar2.mo9125a();
            int c2 = bVar2.mo9126c();
            m1318a(a, c2);
            for (int i3 = 0; i3 < c2; i3++) {
                bArr[(i3 * length) + i2] = a[i3];
            }
        }
        return C0861c.m1309a(bArr);
    }
}
