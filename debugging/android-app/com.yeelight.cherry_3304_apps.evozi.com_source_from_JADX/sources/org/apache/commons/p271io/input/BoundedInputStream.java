package org.apache.commons.p271io.input;

import java.io.InputStream;

/* renamed from: org.apache.commons.io.input.BoundedInputStream */
public class BoundedInputStream extends InputStream {

    /* renamed from: in */
    private final InputStream f23115in;
    private long mark;
    private final long max;
    private long pos;
    private boolean propagateClose;

    public BoundedInputStream(InputStream inputStream) {
        this(inputStream, -1);
    }

    public BoundedInputStream(InputStream inputStream, long j) {
        this.pos = 0;
        this.mark = -1;
        this.propagateClose = true;
        this.max = j;
        this.f23115in = inputStream;
    }

    public int available() {
        long j = this.max;
        if (j < 0 || this.pos < j) {
            return this.f23115in.available();
        }
        return 0;
    }

    public void close() {
        if (this.propagateClose) {
            this.f23115in.close();
        }
    }

    public boolean isPropagateClose() {
        return this.propagateClose;
    }

    public synchronized void mark(int i) {
        this.f23115in.mark(i);
        this.mark = this.pos;
    }

    public boolean markSupported() {
        return this.f23115in.markSupported();
    }

    public int read() {
        long j = this.max;
        if (j >= 0 && this.pos >= j) {
            return -1;
        }
        int read = this.f23115in.read();
        this.pos++;
        return read;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) {
        long j = this.max;
        if (j >= 0 && this.pos >= j) {
            return -1;
        }
        long j2 = this.max;
        int read = this.f23115in.read(bArr, i, (int) (j2 >= 0 ? Math.min((long) i2, j2 - this.pos) : (long) i2));
        if (read == -1) {
            return -1;
        }
        this.pos += (long) read;
        return read;
    }

    public synchronized void reset() {
        this.f23115in.reset();
        this.pos = this.mark;
    }

    public void setPropagateClose(boolean z) {
        this.propagateClose = z;
    }

    public long skip(long j) {
        long j2 = this.max;
        if (j2 >= 0) {
            j = Math.min(j, j2 - this.pos);
        }
        long skip = this.f23115in.skip(j);
        this.pos += skip;
        return skip;
    }

    public String toString() {
        return this.f23115in.toString();
    }
}
