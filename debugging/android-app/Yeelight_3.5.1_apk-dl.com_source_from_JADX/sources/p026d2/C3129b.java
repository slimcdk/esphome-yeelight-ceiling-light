package p026d2;

import java.util.List;

/* renamed from: d2.b */
public final class C3129b {

    /* renamed from: a */
    private final byte[] f5010a;

    /* renamed from: b */
    private int f5011b;

    /* renamed from: c */
    private final String f5012c;

    /* renamed from: d */
    private final List<byte[]> f5013d;

    /* renamed from: e */
    private final String f5014e;

    /* renamed from: f */
    private Object f5015f;

    /* renamed from: g */
    private final int f5016g;

    /* renamed from: h */
    private final int f5017h;

    public C3129b(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1);
    }

    public C3129b(byte[] bArr, String str, List<byte[]> list, String str2, int i, int i2) {
        this.f5010a = bArr;
        this.f5011b = bArr == null ? 0 : bArr.length * 8;
        this.f5012c = str;
        this.f5013d = list;
        this.f5014e = str2;
        this.f5016g = i2;
        this.f5017h = i;
    }

    /* renamed from: a */
    public List<byte[]> mo23604a() {
        return this.f5013d;
    }

    /* renamed from: b */
    public String mo23605b() {
        return this.f5014e;
    }

    /* renamed from: c */
    public int mo23606c() {
        return this.f5011b;
    }

    /* renamed from: d */
    public Object mo23607d() {
        return this.f5015f;
    }

    /* renamed from: e */
    public byte[] mo23608e() {
        return this.f5010a;
    }

    /* renamed from: f */
    public int mo23609f() {
        return this.f5016g;
    }

    /* renamed from: g */
    public int mo23610g() {
        return this.f5017h;
    }

    /* renamed from: h */
    public String mo23611h() {
        return this.f5012c;
    }

    /* renamed from: i */
    public boolean mo23612i() {
        return this.f5016g >= 0 && this.f5017h >= 0;
    }

    /* renamed from: j */
    public void mo23613j(Integer num) {
    }

    /* renamed from: k */
    public void mo23614k(Integer num) {
    }

    /* renamed from: l */
    public void mo23615l(int i) {
        this.f5011b = i;
    }

    /* renamed from: m */
    public void mo23616m(Object obj) {
        this.f5015f = obj;
    }
}
