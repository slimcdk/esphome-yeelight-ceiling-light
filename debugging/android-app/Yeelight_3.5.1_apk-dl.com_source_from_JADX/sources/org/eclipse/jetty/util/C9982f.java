package org.eclipse.jetty.util;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/* renamed from: org.eclipse.jetty.util.f */
public class C9982f extends Writer {

    /* renamed from: a */
    private byte[] f18390a;

    /* renamed from: b */
    private int f18391b;

    /* renamed from: c */
    private C9983g f18392c = null;

    /* renamed from: d */
    private OutputStreamWriter f18393d = null;

    /* renamed from: e */
    private boolean f18394e = false;

    public C9982f(int i) {
        this.f18390a = new byte[i];
    }

    /* renamed from: h */
    private void m24672h(char[] cArr, int i, int i2) {
        C9983g gVar = this.f18392c;
        if (gVar == null) {
            this.f18392c = new C9983g(i2 * 2);
            this.f18393d = new OutputStreamWriter(this.f18392c, "ISO-8859-1");
        } else {
            gVar.reset();
        }
        this.f18393d.write(cArr, i, i2);
        this.f18393d.flush();
        mo40231c(this.f18392c.getCount());
        System.arraycopy(this.f18392c.mo40241a(), 0, this.f18390a, this.f18391b, this.f18392c.getCount());
        this.f18391b += this.f18392c.getCount();
    }

    /* renamed from: a */
    public void mo40230a() {
        this.f18390a = null;
    }

    /* renamed from: c */
    public void mo40231c(int i) {
        int i2 = this.f18391b;
        int i3 = i2 + i;
        byte[] bArr = this.f18390a;
        if (i3 <= bArr.length) {
            return;
        }
        if (!this.f18394e) {
            byte[] bArr2 = new byte[(((bArr.length + i) * 4) / 3)];
            System.arraycopy(bArr, 0, bArr2, 0, i2);
            this.f18390a = bArr2;
            return;
        }
        throw new IOException("Buffer overflow: " + this.f18390a.length);
    }

    public void close() {
    }

    /* renamed from: d */
    public int mo40233d() {
        return this.f18391b;
    }

    /* renamed from: f */
    public void mo40234f(char c) {
        mo40231c(1);
        if (c < 0 || c > 127) {
            m24672h(new char[]{c}, 0, 1);
            return;
        }
        byte[] bArr = this.f18390a;
        int i = this.f18391b;
        this.f18391b = i + 1;
        bArr[i] = (byte) c;
    }

    public void flush() {
    }

    /* renamed from: i */
    public void mo40236i(OutputStream outputStream) {
        outputStream.write(this.f18390a, 0, this.f18391b);
    }

    public void write(String str) {
        if (str == null) {
            write("null", 0, 4);
            return;
        }
        int length = str.length();
        mo40231c(length);
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt < 0 || charAt > 127) {
                m24672h(str.toCharArray(), i, length - i);
                return;
            }
            byte[] bArr = this.f18390a;
            int i2 = this.f18391b;
            this.f18391b = i2 + 1;
            bArr[i2] = (byte) charAt;
        }
    }

    public void write(String str, int i, int i2) {
        mo40231c(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i + i3;
            char charAt = str.charAt(i4);
            if (charAt < 0 || charAt > 127) {
                m24672h(str.toCharArray(), i4, i2 - i3);
                return;
            }
            byte[] bArr = this.f18390a;
            int i5 = this.f18391b;
            this.f18391b = i5 + 1;
            bArr[i5] = (byte) charAt;
        }
    }

    public void write(char[] cArr) {
        mo40231c(cArr.length);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            if (c < 0 || c > 127) {
                m24672h(cArr, i, cArr.length - i);
                return;
            }
            byte[] bArr = this.f18390a;
            int i2 = this.f18391b;
            this.f18391b = i2 + 1;
            bArr[i2] = (byte) c;
        }
    }

    public void write(char[] cArr, int i, int i2) {
        mo40231c(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i + i3;
            char c = cArr[i4];
            if (c < 0 || c > 127) {
                m24672h(cArr, i4, i2 - i3);
                return;
            }
            byte[] bArr = this.f18390a;
            int i5 = this.f18391b;
            this.f18391b = i5 + 1;
            bArr[i5] = (byte) c;
        }
    }
}
