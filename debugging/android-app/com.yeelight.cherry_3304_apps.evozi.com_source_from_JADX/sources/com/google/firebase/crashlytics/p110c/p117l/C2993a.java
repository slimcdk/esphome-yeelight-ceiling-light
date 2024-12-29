package com.google.firebase.crashlytics.p110c.p117l;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: com.google.firebase.crashlytics.c.l.a */
final class C2993a {

    /* renamed from: a */
    private final byte[] f5822a;

    /* renamed from: b */
    private volatile int f5823b = 0;

    private C2993a(byte[] bArr) {
        this.f5822a = bArr;
    }

    /* renamed from: a */
    public static C2993a m9213a(byte[] bArr) {
        return m9214b(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public static C2993a m9214b(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C2993a(bArr2);
    }

    /* renamed from: c */
    public static C2993a m9215c(String str) {
        try {
            return new C2993a(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported.", e);
        }
    }

    /* renamed from: d */
    public void mo17360d(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f5822a, i, bArr, i2, i3);
    }

    /* renamed from: e */
    public InputStream mo17361e() {
        return new ByteArrayInputStream(this.f5822a);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2993a)) {
            return false;
        }
        byte[] bArr = this.f5822a;
        int length = bArr.length;
        byte[] bArr2 = ((C2993a) obj).f5822a;
        if (length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public int mo17363f() {
        return this.f5822a.length;
    }

    public int hashCode() {
        int i = this.f5823b;
        if (i == 0) {
            int i2 = r1;
            for (byte b : this.f5822a) {
                i2 = (i2 * 31) + b;
            }
            i = i2 == 0 ? 1 : i2;
            this.f5823b = i;
        }
        return i;
    }
}
