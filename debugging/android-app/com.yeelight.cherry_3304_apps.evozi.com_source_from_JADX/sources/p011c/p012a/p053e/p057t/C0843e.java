package p011c.p012a.p053e.p057t;

import java.util.List;

/* renamed from: c.a.e.t.e */
public final class C0843e {

    /* renamed from: a */
    private final byte[] f812a;

    /* renamed from: b */
    private int f813b;

    /* renamed from: c */
    private final String f814c;

    /* renamed from: d */
    private final List<byte[]> f815d;

    /* renamed from: e */
    private final String f816e;

    /* renamed from: f */
    private Object f817f;

    /* renamed from: g */
    private final int f818g;

    /* renamed from: h */
    private final int f819h;

    public C0843e(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1);
    }

    public C0843e(byte[] bArr, String str, List<byte[]> list, String str2, int i, int i2) {
        this.f812a = bArr;
        this.f813b = bArr == null ? 0 : bArr.length * 8;
        this.f814c = str;
        this.f815d = list;
        this.f816e = str2;
        this.f818g = i2;
        this.f819h = i;
    }

    /* renamed from: a */
    public List<byte[]> mo9079a() {
        return this.f815d;
    }

    /* renamed from: b */
    public String mo9080b() {
        return this.f816e;
    }

    /* renamed from: c */
    public int mo9081c() {
        return this.f813b;
    }

    /* renamed from: d */
    public Object mo9082d() {
        return this.f817f;
    }

    /* renamed from: e */
    public byte[] mo9083e() {
        return this.f812a;
    }

    /* renamed from: f */
    public int mo9084f() {
        return this.f818g;
    }

    /* renamed from: g */
    public int mo9085g() {
        return this.f819h;
    }

    /* renamed from: h */
    public String mo9086h() {
        return this.f814c;
    }

    /* renamed from: i */
    public boolean mo9087i() {
        return this.f818g >= 0 && this.f819h >= 0;
    }

    /* renamed from: j */
    public void mo9088j(Integer num) {
    }

    /* renamed from: k */
    public void mo9089k(Integer num) {
    }

    /* renamed from: l */
    public void mo9090l(int i) {
        this.f813b = i;
    }

    /* renamed from: m */
    public void mo9091m(Object obj) {
        this.f817f = obj;
    }
}
