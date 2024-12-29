package p011c.p012a.p053e.p057t.p059n;

import java.util.ArrayList;
import java.util.List;

/* renamed from: c.a.e.t.n.d */
public final class C0856d {

    /* renamed from: a */
    private final C0853a f863a;

    /* renamed from: b */
    private final List<C0854b> f864b;

    public C0856d(C0853a aVar) {
        this.f863a = aVar;
        ArrayList arrayList = new ArrayList();
        this.f864b = arrayList;
        arrayList.add(new C0854b(aVar, new int[]{1}));
    }

    /* renamed from: a */
    private C0854b m1291a(int i) {
        if (i >= this.f864b.size()) {
            List<C0854b> list = this.f864b;
            C0854b bVar = list.get(list.size() - 1);
            for (int size = this.f864b.size(); size <= i; size++) {
                C0853a aVar = this.f863a;
                bVar = bVar.mo9118i(new C0854b(aVar, new int[]{1, aVar.mo9101c((size - 1) + aVar.mo9102d())}));
                this.f864b.add(bVar);
            }
        }
        return this.f864b.get(i);
    }

    /* renamed from: b */
    public void mo9122b(int[] iArr, int i) {
        if (i != 0) {
            int length = iArr.length - i;
            if (length > 0) {
                C0854b a = m1291a(i);
                int[] iArr2 = new int[length];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                int[] e = new C0854b(this.f863a, iArr2).mo9119j(i, 1).mo9111b(a)[1].mo9114e();
                int length2 = i - e.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    iArr[length + i2] = 0;
                }
                System.arraycopy(e, 0, iArr, length + length2, e.length);
                return;
            }
            throw new IllegalArgumentException("No data bytes provided");
        }
        throw new IllegalArgumentException("No error correction bytes");
    }
}
