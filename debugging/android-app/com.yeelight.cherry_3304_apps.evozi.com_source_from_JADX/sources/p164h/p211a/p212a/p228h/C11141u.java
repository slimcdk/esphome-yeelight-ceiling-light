package p164h.p211a.p212a.p228h;

import java.io.IOException;

/* renamed from: h.a.a.h.u */
public abstract class C11141u {

    /* renamed from: d */
    private static final byte[] f22073d = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 10, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 3, 3, 11, 6, 6, 6, 5, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};

    /* renamed from: e */
    private static final byte[] f22074e = {0, 12, 24, 36, 60, 96, 84, 12, 12, 12, 48, 72, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 0, 12, 12, 12, 12, 12, 0, 12, 0, 12, 12, 12, 24, 12, 12, 12, 12, 12, 24, 12, 24, 12, 12, 12, 12, 12, 12, 12, 12, 12, 24, 12, 12, 12, 12, 12, 24, 12, 12, 12, 12, 12, 12, 12, 24, 12, 12, 12, 12, 12, 12, 12, 12, 12, 36, 12, 36, 12, 12, 12, 36, 12, 12, 12, 12, 12, 36, 12, 36, 12, 12, 12, 36, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    /* renamed from: a */
    protected final Appendable f22075a;

    /* renamed from: b */
    protected int f22076b = 0;

    /* renamed from: c */
    private int f22077c;

    /* renamed from: h.a.a.h.u$a */
    public static class C11142a extends IllegalArgumentException {
        public C11142a(String str) {
            super("Not valid UTF8! " + str);
        }
    }

    public C11141u(Appendable appendable) {
        this.f22075a = appendable;
    }

    /* renamed from: a */
    public void mo35440a(byte b) {
        try {
            mo35442c(b);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public void mo35441b(byte[] bArr, int i, int i2) {
        int i3 = i2 + i;
        while (i < i3) {
            try {
                mo35442c(bArr[i]);
                i++;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo35442c(byte b) {
        if (b <= 0 || this.f22076b != 0) {
            byte b2 = b & 255;
            byte b3 = f22073d[b2];
            byte b4 = this.f22076b == 0 ? (255 >> b3) & b2 : (b2 & 63) | (this.f22077c << 6);
            this.f22077c = b4;
            byte b5 = f22074e[this.f22076b + b3];
            if (b5 == 0) {
                this.f22076b = b5;
                if (b4 < 55296) {
                    this.f22075a.append((char) b4);
                    return;
                }
                for (char append : Character.toChars(b4)) {
                    this.f22075a.append(append);
                }
            } else if (b5 != 12) {
                this.f22076b = b5;
            } else {
                String str = "byte " + C11138r.m28932f(b) + " in state " + (this.f22076b / 12);
                this.f22077c = 0;
                this.f22076b = 0;
                this.f22075a.append(65533);
                throw new C11142a(str);
            }
        } else {
            this.f22075a.append((char) (b & 255));
        }
    }

    /* renamed from: d */
    public boolean mo35443d() {
        return this.f22076b == 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo35444e() {
        this.f22076b = 0;
    }
}
