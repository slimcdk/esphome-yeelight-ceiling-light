package p034f2;

import java.util.ArrayList;
import java.util.List;

/* renamed from: f2.d */
public final class C3164d {

    /* renamed from: a */
    private final C3161a f5087a;

    /* renamed from: b */
    private final List<C3162b> f5088b;

    public C3164d(C3161a aVar) {
        this.f5087a = aVar;
        ArrayList arrayList = new ArrayList();
        this.f5088b = arrayList;
        arrayList.add(new C3162b(aVar, new int[]{1}));
    }

    /* renamed from: a */
    private C3162b m8508a(int i) {
        if (i >= this.f5088b.size()) {
            List<C3162b> list = this.f5088b;
            C3162b bVar = list.get(list.size() - 1);
            for (int size = this.f5088b.size(); size <= i; size++) {
                C3161a aVar = this.f5087a;
                bVar = bVar.mo23688i(new C3162b(aVar, new int[]{1, aVar.mo23671c((size - 1) + aVar.mo23672d())}));
                this.f5088b.add(bVar);
            }
        }
        return this.f5088b.get(i);
    }

    /* renamed from: b */
    public void mo23692b(int[] iArr, int i) {
        if (i != 0) {
            int length = iArr.length - i;
            if (length > 0) {
                C3162b a = m8508a(i);
                int[] iArr2 = new int[length];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                int[] e = new C3162b(this.f5087a, iArr2).mo23689j(i, 1).mo23681b(a)[1].mo23684e();
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
