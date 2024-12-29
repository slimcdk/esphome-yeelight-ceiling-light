package org.eclipse.jetty.util;

import java.io.IOException;

public abstract class Utf8Appendable {

    /* renamed from: d */
    private static final byte[] f18372d = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 10, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 3, 3, 11, 6, 6, 6, 5, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};

    /* renamed from: e */
    private static final byte[] f18373e = {0, 12, 24, 36, 60, 96, 84, 12, 12, 12, 48, 72, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 0, 12, 12, 12, 12, 12, 0, 12, 0, 12, 12, 12, 24, 12, 12, 12, 12, 12, 24, 12, 24, 12, 12, 12, 12, 12, 12, 12, 12, 12, 24, 12, 12, 12, 12, 12, 24, 12, 12, 12, 12, 12, 12, 12, 24, 12, 12, 12, 12, 12, 12, 12, 12, 12, 36, 12, 36, 12, 12, 12, 36, 12, 12, 12, 12, 12, 36, 12, 36, 12, 12, 12, 36, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    /* renamed from: a */
    protected final Appendable f18374a;

    /* renamed from: b */
    protected int f18375b = 0;

    /* renamed from: c */
    private int f18376c;

    public static class NotUtf8Exception extends IllegalArgumentException {
        public NotUtf8Exception(String str) {
            super("Not valid UTF8! " + str);
        }
    }

    public Utf8Appendable(Appendable appendable) {
        this.f18374a = appendable;
    }

    /* renamed from: a */
    public void mo40201a(byte b) {
        try {
            mo40203c(b);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public void mo40202b(byte[] bArr, int i, int i2) {
        int i3 = i2 + i;
        while (i < i3) {
            try {
                mo40203c(bArr[i]);
                i++;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo40203c(byte b) {
        if (b <= 0 || this.f18375b != 0) {
            byte b2 = b & 255;
            byte b3 = f18372d[b2];
            int i = this.f18375b;
            byte b4 = i == 0 ? (255 >> b3) & b2 : (b2 & 63) | (this.f18376c << 6);
            this.f18376c = b4;
            byte b5 = f18373e[i + b3];
            if (b5 == 0) {
                this.f18375b = b5;
                if (b4 < 55296) {
                    this.f18374a.append((char) b4);
                    return;
                }
                for (char append : Character.toChars(b4)) {
                    this.f18374a.append(append);
                }
            } else if (b5 != 12) {
                this.f18375b = b5;
            } else {
                String str = "byte " + C9996o.m24720g(b) + " in state " + (this.f18375b / 12);
                this.f18376c = 0;
                this.f18375b = 0;
                this.f18374a.append(65533);
                throw new NotUtf8Exception(str);
            }
        } else {
            this.f18374a.append((char) (b & 255));
        }
    }

    /* renamed from: d */
    public boolean mo40204d() {
        return this.f18375b == 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo40205e() {
        this.f18375b = 0;
    }
}
