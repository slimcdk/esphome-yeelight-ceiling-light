package com.xiaomi.push;

import com.miot.service.connection.wifi.step.SmartConfigStep;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: com.xiaomi.push.c */
public final class C4572c {

    /* renamed from: a */
    private final int f7686a;

    /* renamed from: a */
    private final OutputStream f7687a;

    /* renamed from: a */
    private final byte[] f7688a;

    /* renamed from: b */
    private int f7689b;

    /* renamed from: com.xiaomi.push.c$a */
    public static class C4573a extends IOException {
        C4573a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private C4572c(OutputStream outputStream, byte[] bArr) {
        this.f7687a = outputStream;
        this.f7688a = bArr;
        this.f7689b = 0;
        this.f7686a = bArr.length;
    }

    private C4572c(byte[] bArr, int i, int i2) {
        this.f7687a = null;
        this.f7688a = bArr;
        this.f7689b = i;
        this.f7686a = i + i2;
    }

    /* renamed from: a */
    public static int mo28801a(int i) {
        if (i >= 0) {
            return mo28823d(i);
        }
        return 10;
    }

    /* renamed from: a */
    public static int mo28802a(int i, int i2) {
        return mo28820c(i) + mo28801a(i2);
    }

    /* renamed from: a */
    public static int mo28803a(int i, long j) {
        return mo28820c(i) + mo28808a(j);
    }

    /* renamed from: a */
    public static int mo28804a(int i, C4504a aVar) {
        return mo28820c(i) + mo28809a(aVar);
    }

    /* renamed from: a */
    public static int mo28805a(int i, C4651e eVar) {
        return mo28820c(i) + mo28810a(eVar);
    }

    /* renamed from: a */
    public static int mo28806a(int i, String str) {
        return mo28820c(i) + mo28811a(str);
    }

    /* renamed from: a */
    public static int mo28807a(int i, boolean z) {
        return mo28820c(i) + mo28812a(z);
    }

    /* renamed from: a */
    public static int mo28808a(long j) {
        return mo28822c(j);
    }

    /* renamed from: a */
    public static int mo28809a(C4504a aVar) {
        return mo28823d(aVar.mo28729a()) + aVar.mo28729a();
    }

    /* renamed from: a */
    public static int mo28810a(C4651e eVar) {
        int b = eVar.mo28930b();
        return mo28823d(b) + b;
    }

    /* renamed from: a */
    public static int mo28811a(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return mo28823d(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 not supported.");
        }
    }

    /* renamed from: a */
    public static int mo28812a(boolean z) {
        return 1;
    }

    /* renamed from: a */
    public static C4572c m13103a(OutputStream outputStream) {
        return m13104a(outputStream, 4096);
    }

    /* renamed from: a */
    public static C4572c m13104a(OutputStream outputStream, int i) {
        return new C4572c(outputStream, new byte[i]);
    }

    /* renamed from: a */
    public static C4572c mo28814a(byte[] bArr, int i, int i2) {
        return new C4572c(bArr, i, i2);
    }

    /* renamed from: b */
    public static int mo28816b(int i) {
        return mo28823d(i);
    }

    /* renamed from: b */
    public static int mo28817b(int i, int i2) {
        return mo28820c(i) + mo28816b(i2);
    }

    /* renamed from: b */
    public static int mo28818b(int i, long j) {
        return mo28820c(i) + mo28819b(j);
    }

    /* renamed from: b */
    public static int mo28819b(long j) {
        return mo28822c(j);
    }

    /* renamed from: c */
    public static int mo28820c(int i) {
        return mo28823d(C4680f.m13774a(i, 0));
    }

    /* renamed from: c */
    public static int mo28822c(long j) {
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
    private void m13112c() {
        OutputStream outputStream = this.f7687a;
        if (outputStream != null) {
            outputStream.write(this.f7688a, 0, this.f7689b);
            this.f7689b = 0;
            return;
        }
        throw new C4573a();
    }

    /* renamed from: d */
    public static int mo28823d(int i) {
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
    public int mo28799a() {
        if (this.f7687a == null) {
            return this.f7686a - this.f7689b;
        }
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array.");
    }

    /* renamed from: a */
    public void m13115a() {
        if (this.f7687a != null) {
            m13112c();
        }
    }

    /* renamed from: a */
    public void mo28800a(byte b) {
        if (this.f7689b == this.f7686a) {
            m13112c();
        }
        byte[] bArr = this.f7688a;
        int i = this.f7689b;
        this.f7689b = i + 1;
        bArr[i] = b;
    }

    /* renamed from: a */
    public void m13117a(int i) {
        if (i >= 0) {
            mo28823d(i);
        } else {
            mo28822c((long) i);
        }
    }

    /* renamed from: a */
    public void m13118a(int i, int i2) {
        mo28821c(i, 0);
        mo28801a(i2);
    }

    /* renamed from: a */
    public void m13119a(int i, long j) {
        mo28821c(i, 0);
        mo28808a(j);
    }

    /* renamed from: a */
    public void m13120a(int i, C4504a aVar) {
        mo28821c(i, 2);
        mo28809a(aVar);
    }

    /* renamed from: a */
    public void m13121a(int i, C4651e eVar) {
        mo28821c(i, 2);
        mo28810a(eVar);
    }

    /* renamed from: a */
    public void m13122a(int i, String str) {
        mo28821c(i, 2);
        mo28811a(str);
    }

    /* renamed from: a */
    public void m13123a(int i, boolean z) {
        mo28821c(i, 0);
        mo28812a(z);
    }

    /* renamed from: a */
    public void m13124a(long j) {
        mo28822c(j);
    }

    /* renamed from: a */
    public void m13125a(C4504a aVar) {
        byte[] a = aVar.mo28729a();
        mo28823d(a.length);
        mo28813a(a);
    }

    /* renamed from: a */
    public void m13126a(C4651e eVar) {
        mo28823d(eVar.mo28924a());
        eVar.mo28929a(this);
    }

    /* renamed from: a */
    public void m13127a(String str) {
        byte[] bytes = str.getBytes("UTF-8");
        mo28823d(bytes.length);
        mo28813a(bytes);
    }

    /* renamed from: a */
    public void m13128a(boolean z) {
        mo28820c(z ? 1 : 0);
    }

    /* renamed from: a */
    public void mo28813a(byte[] bArr) {
        mo28814a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public void m13130a(byte[] bArr, int i, int i2) {
        int i3 = this.f7686a;
        int i4 = this.f7689b;
        if (i3 - i4 >= i2) {
            System.arraycopy(bArr, i, this.f7688a, i4, i2);
            this.f7689b += i2;
            return;
        }
        int i5 = i3 - i4;
        System.arraycopy(bArr, i, this.f7688a, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f7689b = this.f7686a;
        m13112c();
        if (i7 <= this.f7686a) {
            System.arraycopy(bArr, i6, this.f7688a, 0, i7);
            this.f7689b = i7;
            return;
        }
        this.f7687a.write(bArr, i6, i7);
    }

    /* renamed from: b */
    public void mo28815b() {
        if (mo28799a() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: b */
    public void m13132b(int i) {
        mo28823d(i);
    }

    /* renamed from: b */
    public void m13133b(int i, int i2) {
        mo28821c(i, 0);
        mo28816b(i2);
    }

    /* renamed from: b */
    public void m13134b(int i, long j) {
        mo28821c(i, 0);
        mo28819b(j);
    }

    /* renamed from: b */
    public void m13135b(long j) {
        mo28822c(j);
    }

    /* renamed from: c */
    public void m13136c(int i) {
        mo28800a((byte) i);
    }

    /* renamed from: c */
    public void mo28821c(int i, int i2) {
        mo28823d(C4680f.m13774a(i, i2));
    }

    /* renamed from: c */
    public void m13138c(long j) {
        while ((-128 & j) != 0) {
            mo28820c((((int) j) & SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT) | 128);
            j >>>= 7;
        }
        mo28820c((int) j);
    }

    /* renamed from: d */
    public void m13139d(int i) {
        while ((i & -128) != 0) {
            mo28820c((i & SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT) | 128);
            i >>>= 7;
        }
        mo28820c(i);
    }
}
