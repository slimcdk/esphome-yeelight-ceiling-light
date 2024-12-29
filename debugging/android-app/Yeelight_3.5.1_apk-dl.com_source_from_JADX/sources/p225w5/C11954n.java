package p225w5;

import java.io.OutputStream;
import java.io.Writer;

/* renamed from: w5.n */
public class C11954n extends OutputStream {

    /* renamed from: a */
    protected final Writer f21839a;

    /* renamed from: b */
    protected final String f21840b;

    /* renamed from: c */
    private final byte[] f21841c = new byte[1];

    public C11954n(Writer writer) {
        this.f21839a = writer;
        this.f21840b = null;
    }

    public void close() {
        this.f21839a.close();
    }

    public void flush() {
        this.f21839a.flush();
    }

    public synchronized void write(int i) {
        byte[] bArr = this.f21841c;
        bArr[0] = (byte) i;
        write(bArr);
    }

    public void write(byte[] bArr) {
        String str = this.f21840b;
        if (str == null) {
            this.f21839a.write(new String(bArr));
        } else {
            this.f21839a.write(new String(bArr, str));
        }
    }

    public void write(byte[] bArr, int i, int i2) {
        String str = this.f21840b;
        if (str == null) {
            this.f21839a.write(new String(bArr, i, i2));
        } else {
            this.f21839a.write(new String(bArr, i, i2, str));
        }
    }
}
