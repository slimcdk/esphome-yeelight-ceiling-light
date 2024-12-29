package p011c.p083d.p090b;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: c.d.b.n */
final class C1195n extends InputStream {

    /* renamed from: a */
    private final InputStream f2029a;

    /* renamed from: b */
    private long f2030b;

    /* renamed from: c */
    private long f2031c;

    /* renamed from: d */
    private long f2032d;

    /* renamed from: e */
    private long f2033e;

    public C1195n(InputStream inputStream) {
        this(inputStream, 4096);
    }

    public C1195n(InputStream inputStream, int i) {
        this.f2033e = -1;
        this.f2029a = !inputStream.markSupported() ? new BufferedInputStream(inputStream, i) : inputStream;
    }

    /* renamed from: g */
    private void m3083g(long j) {
        try {
            if (this.f2031c >= this.f2030b || this.f2030b > this.f2032d) {
                this.f2031c = this.f2030b;
                this.f2029a.mark((int) (j - this.f2030b));
            } else {
                this.f2029a.reset();
                this.f2029a.mark((int) (j - this.f2031c));
                m3084h(this.f2031c, this.f2030b);
            }
            this.f2032d = j;
        } catch (IOException e) {
            throw new IllegalStateException("Unable to mark: " + e);
        }
    }

    /* renamed from: h */
    private void m3084h(long j, long j2) {
        while (j < j2) {
            long skip = this.f2029a.skip(j2 - j);
            if (skip == 0) {
                if (read() != -1) {
                    skip = 1;
                } else {
                    return;
                }
            }
            j += skip;
        }
    }

    /* renamed from: a */
    public void mo9983a(long j) {
        if (this.f2030b > this.f2032d || j < this.f2031c) {
            throw new IOException("Cannot reset");
        }
        this.f2029a.reset();
        m3084h(this.f2031c, j);
        this.f2030b = j;
    }

    public int available() {
        return this.f2029a.available();
    }

    /* renamed from: b */
    public long mo9985b(int i) {
        long j = this.f2030b + ((long) i);
        if (this.f2032d < j) {
            m3083g(j);
        }
        return this.f2030b;
    }

    public void close() {
        this.f2029a.close();
    }

    public void mark(int i) {
        this.f2033e = mo9985b(i);
    }

    public boolean markSupported() {
        return this.f2029a.markSupported();
    }

    public int read() {
        int read = this.f2029a.read();
        if (read != -1) {
            this.f2030b++;
        }
        return read;
    }

    public int read(byte[] bArr) {
        int read = this.f2029a.read(bArr);
        if (read != -1) {
            this.f2030b += (long) read;
        }
        return read;
    }

    public int read(byte[] bArr, int i, int i2) {
        int read = this.f2029a.read(bArr, i, i2);
        if (read != -1) {
            this.f2030b += (long) read;
        }
        return read;
    }

    public void reset() {
        mo9983a(this.f2033e);
    }

    public long skip(long j) {
        long skip = this.f2029a.skip(j);
        this.f2030b += skip;
        return skip;
    }
}
