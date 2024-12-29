package com.google.zxing;

import org.apache.commons.p194io.FilenameUtils;

/* renamed from: com.google.zxing.c */
public abstract class C2547c {

    /* renamed from: a */
    private final int f4303a;

    /* renamed from: b */
    private final int f4304b;

    protected C2547c(int i, int i2) {
        this.f4303a = i;
        this.f4304b = i2;
    }

    /* renamed from: a */
    public final int mo19461a() {
        return this.f4304b;
    }

    /* renamed from: b */
    public abstract byte[] mo19462b();

    /* renamed from: c */
    public abstract byte[] mo19463c(int i, byte[] bArr);

    /* renamed from: d */
    public final int mo19464d() {
        return this.f4303a;
    }

    /* renamed from: e */
    public boolean mo19465e() {
        return false;
    }

    /* renamed from: f */
    public C2547c mo19466f() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public final String toString() {
        int i = this.f4303a;
        byte[] bArr = new byte[i];
        StringBuilder sb = new StringBuilder(this.f4304b * (i + 1));
        for (int i2 = 0; i2 < this.f4304b; i2++) {
            bArr = mo19463c(i2, bArr);
            for (int i3 = 0; i3 < this.f4303a; i3++) {
                byte b = bArr[i3] & 255;
                sb.append(b < 64 ? '#' : b < 128 ? '+' : b < 192 ? FilenameUtils.EXTENSION_SEPARATOR : ' ');
            }
            sb.append(10);
        }
        return sb.toString();
    }
}
