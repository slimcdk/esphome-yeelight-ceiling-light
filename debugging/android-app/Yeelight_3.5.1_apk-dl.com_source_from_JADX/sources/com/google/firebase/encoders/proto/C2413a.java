package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import java.io.OutputStream;

/* renamed from: com.google.firebase.encoders.proto.a */
final class C2413a extends OutputStream {

    /* renamed from: a */
    private long f4046a = 0;

    C2413a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo19005a() {
        return this.f4046a;
    }

    public void write(int i) {
        this.f4046a++;
    }

    public void write(byte[] bArr) {
        this.f4046a += (long) bArr.length;
    }

    public void write(@NonNull byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f4046a += (long) i2;
    }
}
