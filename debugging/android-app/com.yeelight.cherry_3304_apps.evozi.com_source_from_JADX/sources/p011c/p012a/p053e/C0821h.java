package p011c.p012a.p053e;

import org.apache.commons.p271io.FilenameUtils;

/* renamed from: c.a.e.h */
public abstract class C0821h {

    /* renamed from: a */
    private final int f714a;

    /* renamed from: b */
    private final int f715b;

    protected C0821h(int i, int i2) {
        this.f714a = i;
        this.f715b = i2;
    }

    /* renamed from: a */
    public final int mo8996a() {
        return this.f715b;
    }

    /* renamed from: b */
    public abstract byte[] mo8997b();

    /* renamed from: c */
    public abstract byte[] mo8998c(int i, byte[] bArr);

    /* renamed from: d */
    public final int mo8999d() {
        return this.f714a;
    }

    /* renamed from: e */
    public boolean mo9000e() {
        return false;
    }

    /* renamed from: f */
    public C0821h mo9001f() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public final String toString() {
        int i = this.f714a;
        byte[] bArr = new byte[i];
        StringBuilder sb = new StringBuilder(this.f715b * (i + 1));
        for (int i2 = 0; i2 < this.f715b; i2++) {
            bArr = mo8998c(i2, bArr);
            for (int i3 = 0; i3 < this.f714a; i3++) {
                byte b = bArr[i3] & 255;
                sb.append(b < 64 ? '#' : b < 128 ? '+' : b < 192 ? FilenameUtils.EXTENSION_SEPARATOR : ' ');
            }
            sb.append(10);
        }
        return sb.toString();
    }
}
