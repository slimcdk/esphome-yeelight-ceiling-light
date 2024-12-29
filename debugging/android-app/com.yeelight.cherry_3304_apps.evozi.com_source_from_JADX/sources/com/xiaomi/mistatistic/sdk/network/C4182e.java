package com.xiaomi.mistatistic.sdk.network;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.xiaomi.mistatistic.sdk.network.e */
final class C4182e extends InputStream {

    /* renamed from: a */
    private InputStream f7194a;

    /* renamed from: b */
    private C4178c f7195b;

    /* renamed from: c */
    private C4180d f7196c;

    /* renamed from: d */
    private int f7197d = 0;

    public C4182e(C4178c cVar, InputStream inputStream) {
        this.f7195b = cVar;
        this.f7194a = inputStream;
    }

    public C4182e(C4180d dVar, InputStream inputStream) {
        this.f7196c = dVar;
        this.f7194a = inputStream;
    }

    /* renamed from: a */
    private void m11347a(Exception exc) {
        C4178c cVar = this.f7195b;
        if (cVar != null) {
            cVar.mo23144a(exc);
        }
        C4180d dVar = this.f7196c;
        if (dVar != null) {
            dVar.mo23201a(exc);
        }
    }

    /* renamed from: a */
    public int mo23265a() {
        return this.f7197d;
    }

    public int available() {
        try {
            return this.f7194a.available();
        } catch (IOException e) {
            m11347a(e);
            throw e;
        }
    }

    public void close() {
        C4178c cVar = this.f7195b;
        if (cVar != null) {
            cVar.mo23142a();
        }
        C4180d dVar = this.f7196c;
        if (dVar != null) {
            dVar.mo23199a();
        }
        try {
            this.f7194a.close();
        } catch (IOException e) {
            m11347a(e);
            throw e;
        }
    }

    public void mark(int i) {
        this.f7194a.mark(i);
    }

    public boolean markSupported() {
        return this.f7194a.markSupported();
    }

    public int read() {
        try {
            int read = this.f7194a.read();
            if (read != -1) {
                this.f7197d++;
            }
            return read;
        } catch (IOException e) {
            m11347a(e);
            throw e;
        }
    }

    public int read(byte[] bArr) {
        try {
            int read = this.f7194a.read(bArr);
            if (read != -1) {
                this.f7197d += read;
            }
            return read;
        } catch (IOException e) {
            m11347a(e);
            throw e;
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        try {
            int read = this.f7194a.read(bArr, i, i2);
            if (read != -1) {
                this.f7197d += read;
            }
            return read;
        } catch (IOException e) {
            m11347a(e);
            throw e;
        }
    }

    public synchronized void reset() {
        try {
            this.f7194a.reset();
        } catch (IOException e) {
            m11347a(e);
            throw e;
        }
    }

    public long skip(long j) {
        try {
            return this.f7194a.skip(j);
        } catch (IOException e) {
            m11347a(e);
            throw e;
        }
    }
}
