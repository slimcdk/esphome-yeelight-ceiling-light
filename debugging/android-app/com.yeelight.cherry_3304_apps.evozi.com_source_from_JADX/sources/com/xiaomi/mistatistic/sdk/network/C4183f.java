package com.xiaomi.mistatistic.sdk.network;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.xiaomi.mistatistic.sdk.network.f */
final class C4183f extends OutputStream {

    /* renamed from: a */
    private OutputStream f7198a;

    /* renamed from: b */
    private C4178c f7199b;

    /* renamed from: c */
    private C4180d f7200c;

    /* renamed from: d */
    private int f7201d = 0;

    public C4183f(C4178c cVar, OutputStream outputStream) {
        this.f7198a = outputStream;
        this.f7199b = cVar;
    }

    public C4183f(C4180d dVar, OutputStream outputStream) {
        this.f7198a = outputStream;
        this.f7200c = dVar;
    }

    /* renamed from: a */
    private void m11349a(Exception exc) {
        C4178c cVar = this.f7199b;
        if (cVar != null) {
            cVar.mo23144a(exc);
        }
        C4180d dVar = this.f7200c;
        if (dVar != null) {
            dVar.mo23201a(exc);
        }
    }

    /* renamed from: a */
    public int mo23275a() {
        return this.f7201d;
    }

    public void close() {
        try {
            this.f7198a.close();
        } catch (IOException e) {
            m11349a(e);
            throw e;
        }
    }

    public void flush() {
        try {
            this.f7198a.flush();
        } catch (IOException e) {
            m11349a(e);
            throw e;
        }
    }

    public void write(int i) {
        try {
            this.f7198a.write(i);
            this.f7201d++;
        } catch (IOException e) {
            m11349a(e);
            throw e;
        }
    }

    public void write(byte[] bArr) {
        try {
            this.f7198a.write(bArr);
            this.f7201d += bArr.length;
        } catch (IOException e) {
            m11349a(e);
            throw e;
        }
    }

    public void write(byte[] bArr, int i, int i2) {
        try {
            this.f7198a.write(bArr, i, i2);
            this.f7201d += i2;
        } catch (IOException e) {
            m11349a(e);
            throw e;
        }
    }
}
