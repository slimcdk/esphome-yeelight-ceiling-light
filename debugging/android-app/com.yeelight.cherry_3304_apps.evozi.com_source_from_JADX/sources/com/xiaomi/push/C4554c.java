package com.xiaomi.push;

import com.miot.service.connection.wifi.step.SmartConfigStep;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: com.xiaomi.push.c */
public final class C4554c {

    /* renamed from: a */
    private final int f8265a;

    /* renamed from: a */
    private final OutputStream f8266a;

    /* renamed from: a */
    private final byte[] f8267a;

    /* renamed from: b */
    private int f8268b;

    /* renamed from: com.xiaomi.push.c$a */
    public static class C4555a extends IOException {
        C4555a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private C4554c(OutputStream outputStream, byte[] bArr) {
        this.f8266a = outputStream;
        this.f8267a = bArr;
        this.f8268b = 0;
        this.f8265a = bArr.length;
    }

    private C4554c(byte[] bArr, int i, int i2) {
        this.f8266a = null;
        this.f8267a = bArr;
        this.f8268b = i;
        this.f8265a = i + i2;
    }

    /* renamed from: a */
    public static int mo24800a(int i) {
        if (i >= 0) {
            return mo24822d(i);
        }
        return 10;
    }

    /* renamed from: a */
    public static int mo24801a(int i, int i2) {
        return mo24819c(i) + mo24800a(i2);
    }

    /* renamed from: a */
    public static int mo24802a(int i, long j) {
        return mo24819c(i) + mo24807a(j);
    }

    /* renamed from: a */
    public static int mo24803a(int i, C4489a aVar) {
        return mo24819c(i) + mo24808a(aVar);
    }

    /* renamed from: a */
    public static int mo24804a(int i, C4620e eVar) {
        return mo24819c(i) + mo24809a(eVar);
    }

    /* renamed from: a */
    public static int mo24805a(int i, String str) {
        return mo24819c(i) + mo24810a(str);
    }

    /* renamed from: a */
    public static int mo24806a(int i, boolean z) {
        return mo24819c(i) + mo24811a(z);
    }

    /* renamed from: a */
    public static int mo24807a(long j) {
        return mo24821c(j);
    }

    /* renamed from: a */
    public static int mo24808a(C4489a aVar) {
        return mo24822d(aVar.mo24722a()) + aVar.mo24722a();
    }

    /* renamed from: a */
    public static int mo24809a(C4620e eVar) {
        int b = eVar.mo24936b();
        return mo24822d(b) + b;
    }

    /* renamed from: a */
    public static int mo24810a(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return mo24822d(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 not supported.");
        }
    }

    /* renamed from: a */
    public static int mo24811a(boolean z) {
        return 1;
    }

    /* renamed from: a */
    public static C4554c m13513a(OutputStream outputStream) {
        return m13514a(outputStream, 4096);
    }

    /* renamed from: a */
    public static C4554c m13514a(OutputStream outputStream, int i) {
        return new C4554c(outputStream, new byte[i]);
    }

    /* renamed from: a */
    public static C4554c mo24813a(byte[] bArr, int i, int i2) {
        return new C4554c(bArr, i, i2);
    }

    /* renamed from: b */
    public static int mo24815b(int i) {
        return mo24822d(i);
    }

    /* renamed from: b */
    public static int mo24816b(int i, int i2) {
        return mo24819c(i) + mo24815b(i2);
    }

    /* renamed from: b */
    public static int mo24817b(int i, long j) {
        return mo24819c(i) + mo24818b(j);
    }

    /* renamed from: b */
    public static int mo24818b(long j) {
        return mo24821c(j);
    }

    /* renamed from: c */
    public static int mo24819c(int i) {
        return mo24822d(C4659f.m14133a(i, 0));
    }

    /* renamed from: c */
    public static int mo24821c(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if ((-16384 & j) == 0) {
            return 2;
        }
        if ((-2097152 & j) == 0) {
            return 3;
        }
        if ((-268435456 & j) == 0) {
            return 4;
        }
        if ((-34359738368L & j) == 0) {
            return 5;
        }
        if ((-4398046511104L & j) == 0) {
            return 6;
        }
        if ((-562949953421312L & j) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* renamed from: c */
    private void m13522c() {
        OutputStream outputStream = this.f8266a;
        if (outputStream != null) {
            outputStream.write(this.f8267a, 0, this.f8268b);
            this.f8268b = 0;
            return;
        }
        throw new C4555a();
    }

    /* renamed from: d */
    public static int mo24822d(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: a */
    public int mo24798a() {
        if (this.f8266a == null) {
            return this.f8265a - this.f8268b;
        }
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array.");
    }

    /* renamed from: a */
    public void m13525a() {
        if (this.f8266a != null) {
            m13522c();
        }
    }

    /* renamed from: a */
    public void mo24799a(byte b) {
        if (this.f8268b == this.f8265a) {
            m13522c();
        }
        byte[] bArr = this.f8267a;
        int i = this.f8268b;
        this.f8268b = i + 1;
        bArr[i] = b;
    }

    /* renamed from: a */
    public void m13527a(int i) {
        if (i >= 0) {
            mo24822d(i);
        } else {
            mo24821c((long) i);
        }
    }

    /* renamed from: a */
    public void m13528a(int i, int i2) {
        mo24820c(i, 0);
        mo24800a(i2);
    }

    /* renamed from: a */
    public void m13529a(int i, long j) {
        mo24820c(i, 0);
        mo24807a(j);
    }

    /* renamed from: a */
    public void m13530a(int i, C4489a aVar) {
        mo24820c(i, 2);
        mo24808a(aVar);
    }

    /* renamed from: a */
    public void m13531a(int i, C4620e eVar) {
        mo24820c(i, 2);
        mo24809a(eVar);
    }

    /* renamed from: a */
    public void m13532a(int i, String str) {
        mo24820c(i, 2);
        mo24810a(str);
    }

    /* renamed from: a */
    public void m13533a(int i, boolean z) {
        mo24820c(i, 0);
        mo24811a(z);
    }

    /* renamed from: a */
    public void m13534a(long j) {
        mo24821c(j);
    }

    /* renamed from: a */
    public void m13535a(C4489a aVar) {
        byte[] a = aVar.mo24722a();
        mo24822d(a.length);
        mo24812a(a);
    }

    /* renamed from: a */
    public void m13536a(C4620e eVar) {
        mo24822d(eVar.mo24930a());
        eVar.mo24934a(this);
    }

    /* renamed from: a */
    public void m13537a(String str) {
        byte[] bytes = str.getBytes("UTF-8");
        mo24822d(bytes.length);
        mo24812a(bytes);
    }

    /* renamed from: a */
    public void m13538a(boolean z) {
        mo24819c(z ? 1 : 0);
    }

    /* renamed from: a */
    public void mo24812a(byte[] bArr) {
        mo24813a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public void m13540a(byte[] bArr, int i, int i2) {
        int i3 = this.f8265a;
        int i4 = this.f8268b;
        if (i3 - i4 >= i2) {
            System.arraycopy(bArr, i, this.f8267a, i4, i2);
            this.f8268b += i2;
            return;
        }
        int i5 = i3 - i4;
        System.arraycopy(bArr, i, this.f8267a, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f8268b = this.f8265a;
        m13522c();
        if (i7 <= this.f8265a) {
            System.arraycopy(bArr, i6, this.f8267a, 0, i7);
            this.f8268b = i7;
            return;
        }
        this.f8266a.write(bArr, i6, i7);
    }

    /* renamed from: b */
    public void mo24814b() {
        if (mo24798a() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: b */
    public void m13542b(int i) {
        mo24822d(i);
    }

    /* renamed from: b */
    public void m13543b(int i, int i2) {
        mo24820c(i, 0);
        mo24815b(i2);
    }

    /* renamed from: b */
    public void m13544b(int i, long j) {
        mo24820c(i, 0);
        mo24818b(j);
    }

    /* renamed from: b */
    public void m13545b(long j) {
        mo24821c(j);
    }

    /* renamed from: c */
    public void m13546c(int i) {
        mo24799a((byte) i);
    }

    /* renamed from: c */
    public void mo24820c(int i, int i2) {
        mo24822d(C4659f.m14133a(i, i2));
    }

    /* renamed from: c */
    public void m13548c(long j) {
        while ((-128 & j) != 0) {
            mo24819c((((int) j) & SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT) | 128);
            j >>>= 7;
        }
        mo24819c((int) j);
    }

    /* renamed from: d */
    public void m13549d(int i) {
        while ((i & -128) != 0) {
            mo24819c((i & SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT) | 128);
            i >>>= 7;
        }
        mo24819c(i);
    }
}
