package com.squareup.picasso;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.squareup.picasso.m */
final class C4356m extends InputStream {

    /* renamed from: a */
    private final InputStream f7223a;

    /* renamed from: b */
    private long f7224b;

    /* renamed from: c */
    private long f7225c;

    /* renamed from: d */
    private long f7226d;

    /* renamed from: e */
    private long f7227e;

    public C4356m(InputStream inputStream) {
        this(inputStream, 4096);
    }

    public C4356m(InputStream inputStream, int i) {
        this.f7227e = -1;
        this.f7223a = !inputStream.markSupported() ? new BufferedInputStream(inputStream, i) : inputStream;
    }

    /* renamed from: d */
    private void m12357d(long j) {
        try {
            long j2 = this.f7225c;
            long j3 = this.f7224b;
            if (j2 >= j3 || j3 > this.f7226d) {
                this.f7225c = j3;
                this.f7223a.mark((int) (j - j3));
            } else {
                this.f7223a.reset();
                this.f7223a.mark((int) (j - this.f7225c));
                m12358f(this.f7225c, this.f7224b);
            }
            this.f7226d = j;
        } catch (IOException e) {
            throw new IllegalStateException("Unable to mark: " + e);
        }
    }

    /* renamed from: f */
    private void m12358f(long j, long j2) {
        while (j < j2) {
            long skip = this.f7223a.skip(j2 - j);
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
    public void mo28190a(long j) {
        if (this.f7224b > this.f7226d || j < this.f7225c) {
            throw new IOException("Cannot reset");
        }
        this.f7223a.reset();
        m12358f(this.f7225c, j);
        this.f7224b = j;
    }

    public int available() {
        return this.f7223a.available();
    }

    /* renamed from: c */
    public long mo28192c(int i) {
        long j = this.f7224b + ((long) i);
        if (this.f7226d < j) {
            m12357d(j);
        }
        return this.f7224b;
    }

    public void close() {
        this.f7223a.close();
    }

    public void mark(int i) {
        this.f7227e = mo28192c(i);
    }

    public boolean markSupported() {
        return this.f7223a.markSupported();
    }

    public int read() {
        int read = this.f7223a.read();
        if (read != -1) {
            this.f7224b++;
        }
        return read;
    }

    public int read(byte[] bArr) {
        int read = this.f7223a.read(bArr);
        if (read != -1) {
            this.f7224b += (long) read;
        }
        return read;
    }

    public int read(byte[] bArr, int i, int i2) {
        int read = this.f7223a.read(bArr, i, i2);
        if (read != -1) {
            this.f7224b += (long) read;
        }
        return read;
    }

    public void reset() {
        mo28190a(this.f7227e);
    }

    public long skip(long j) {
        long skip = this.f7223a.skip(j);
        this.f7224b += skip;
        return skip;
    }
}
