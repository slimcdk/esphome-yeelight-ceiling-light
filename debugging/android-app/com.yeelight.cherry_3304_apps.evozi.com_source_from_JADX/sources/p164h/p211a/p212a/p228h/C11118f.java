package p164h.p211a.p212a.p228h;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/* renamed from: h.a.a.h.f */
public class C11118f extends Writer {

    /* renamed from: a */
    private byte[] f22008a;

    /* renamed from: b */
    private int f22009b;

    /* renamed from: c */
    private C11119g f22010c = null;

    /* renamed from: d */
    private OutputStreamWriter f22011d = null;

    /* renamed from: e */
    private boolean f22012e = false;

    public C11118f(int i) {
        this.f22008a = new byte[i];
    }

    /* renamed from: i */
    private void m28857i(char[] cArr, int i, int i2) {
        C11119g gVar = this.f22010c;
        if (gVar == null) {
            this.f22010c = new C11119g(i2 * 2);
            this.f22011d = new OutputStreamWriter(this.f22010c, "ISO-8859-1");
        } else {
            gVar.reset();
        }
        this.f22011d.write(cArr, i, i2);
        this.f22011d.flush();
        mo35344b(this.f22010c.getCount());
        System.arraycopy(this.f22010c.mo35354a(), 0, this.f22008a, this.f22009b, this.f22010c.getCount());
        this.f22009b += this.f22010c.getCount();
    }

    /* renamed from: a */
    public void mo35343a() {
        this.f22008a = null;
    }

    /* renamed from: b */
    public void mo35344b(int i) {
        int i2 = this.f22009b;
        int i3 = i2 + i;
        byte[] bArr = this.f22008a;
        if (i3 <= bArr.length) {
            return;
        }
        if (!this.f22012e) {
            byte[] bArr2 = new byte[(((bArr.length + i) * 4) / 3)];
            System.arraycopy(bArr, 0, bArr2, 0, i2);
            this.f22008a = bArr2;
            return;
        }
        throw new IOException("Buffer overflow: " + this.f22008a.length);
    }

    public void close() {
    }

    public void flush() {
    }

    /* renamed from: g */
    public int mo35347g() {
        return this.f22009b;
    }

    /* renamed from: h */
    public void mo35348h(char c) {
        mo35344b(1);
        if (c < 0 || c > 127) {
            m28857i(new char[]{c}, 0, 1);
            return;
        }
        byte[] bArr = this.f22008a;
        int i = this.f22009b;
        this.f22009b = i + 1;
        bArr[i] = (byte) c;
    }

    /* renamed from: j */
    public void mo35349j(OutputStream outputStream) {
        outputStream.write(this.f22008a, 0, this.f22009b);
    }

    public void write(String str) {
        if (str == null) {
            write("null", 0, 4);
            return;
        }
        int length = str.length();
        mo35344b(length);
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt < 0 || charAt > 127) {
                m28857i(str.toCharArray(), i, length - i);
                return;
            }
            byte[] bArr = this.f22008a;
            int i2 = this.f22009b;
            this.f22009b = i2 + 1;
            bArr[i2] = (byte) charAt;
        }
    }

    public void write(String str, int i, int i2) {
        mo35344b(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i + i3;
            char charAt = str.charAt(i4);
            if (charAt < 0 || charAt > 127) {
                m28857i(str.toCharArray(), i4, i2 - i3);
                return;
            }
            byte[] bArr = this.f22008a;
            int i5 = this.f22009b;
            this.f22009b = i5 + 1;
            bArr[i5] = (byte) charAt;
        }
    }

    public void write(char[] cArr) {
        mo35344b(cArr.length);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            if (c < 0 || c > 127) {
                m28857i(cArr, i, cArr.length - i);
                return;
            }
            byte[] bArr = this.f22008a;
            int i2 = this.f22009b;
            this.f22009b = i2 + 1;
            bArr[i2] = (byte) c;
        }
    }

    public void write(char[] cArr, int i, int i2) {
        mo35344b(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i + i3;
            char c = cArr[i4];
            if (c < 0 || c > 127) {
                m28857i(cArr, i4, i2 - i3);
                return;
            }
            byte[] bArr = this.f22008a;
            int i5 = this.f22009b;
            this.f22009b = i5 + 1;
            bArr[i5] = (byte) c;
        }
    }
}
