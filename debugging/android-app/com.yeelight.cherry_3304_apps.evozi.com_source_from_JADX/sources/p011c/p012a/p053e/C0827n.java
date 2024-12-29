package p011c.p012a.p053e;

import java.util.EnumMap;
import java.util.Map;

/* renamed from: c.a.e.n */
public final class C0827n {

    /* renamed from: a */
    private final String f726a;

    /* renamed from: b */
    private final byte[] f727b;

    /* renamed from: c */
    private C0829p[] f728c;

    /* renamed from: d */
    private final C0814a f729d;

    /* renamed from: e */
    private Map<C0828o, Object> f730e;

    public C0827n(String str, byte[] bArr, int i, C0829p[] pVarArr, C0814a aVar, long j) {
        this.f726a = str;
        this.f727b = bArr;
        this.f728c = pVarArr;
        this.f729d = aVar;
        this.f730e = null;
    }

    public C0827n(String str, byte[] bArr, C0829p[] pVarArr, C0814a aVar) {
        this(str, bArr, pVarArr, aVar, System.currentTimeMillis());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0827n(String str, byte[] bArr, C0829p[] pVarArr, C0814a aVar, long j) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, pVarArr, aVar, j);
    }

    /* renamed from: a */
    public void mo9011a(C0829p[] pVarArr) {
        C0829p[] pVarArr2 = this.f728c;
        if (pVarArr2 == null) {
            this.f728c = pVarArr;
        } else if (pVarArr != null && pVarArr.length > 0) {
            C0829p[] pVarArr3 = new C0829p[(pVarArr2.length + pVarArr.length)];
            System.arraycopy(pVarArr2, 0, pVarArr3, 0, pVarArr2.length);
            System.arraycopy(pVarArr, 0, pVarArr3, pVarArr2.length, pVarArr.length);
            this.f728c = pVarArr3;
        }
    }

    /* renamed from: b */
    public C0814a mo9012b() {
        return this.f729d;
    }

    /* renamed from: c */
    public byte[] mo9013c() {
        return this.f727b;
    }

    /* renamed from: d */
    public Map<C0828o, Object> mo9014d() {
        return this.f730e;
    }

    /* renamed from: e */
    public C0829p[] mo9015e() {
        return this.f728c;
    }

    /* renamed from: f */
    public String mo9016f() {
        return this.f726a;
    }

    /* renamed from: g */
    public void mo9017g(Map<C0828o, Object> map) {
        if (map != null) {
            Map<C0828o, Object> map2 = this.f730e;
            if (map2 == null) {
                this.f730e = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    /* renamed from: h */
    public void mo9018h(C0828o oVar, Object obj) {
        if (this.f730e == null) {
            this.f730e = new EnumMap(C0828o.class);
        }
        this.f730e.put(oVar, obj);
    }

    public String toString() {
        return this.f726a;
    }
}
