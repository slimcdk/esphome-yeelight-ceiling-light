package p207s3;

/* renamed from: s3.e */
public class C10343e {

    /* renamed from: a */
    private int f19435a = 21;

    /* renamed from: b */
    private int f19436b = 8193;

    /* renamed from: c */
    private String f19437c;

    public C10343e(String str) {
        this.f19437c = str;
    }

    /* renamed from: a */
    public String mo41919a() {
        return this.f19437c;
    }

    /* renamed from: b */
    public int mo41920b() {
        return this.f19436b;
    }

    /* renamed from: c */
    public int mo41921c() {
        return this.f19435a;
    }

    /* renamed from: d */
    public void mo41922d(int i) {
        this.f19435a = i;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10343e)) {
            return false;
        }
        C10343e eVar = (C10343e) obj;
        return eVar.mo41919a().equals(this.f19437c) && eVar.mo41921c() == this.f19435a;
    }

    public String toString() {
        return "MiBandDevice{mPId=" + this.f19435a + ", mDeviceId='" + this.f19437c + '\'' + '}';
    }
}
