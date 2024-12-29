package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.C4558bm;

/* renamed from: com.xiaomi.push.service.bp */
public class C4923bp {

    /* renamed from: a */
    private static int f9612a = 8;

    /* renamed from: a */
    private byte[] f9613a = new byte[256];

    /* renamed from: b */
    private int f9614b = 0;

    /* renamed from: c */
    private int f9615c = 0;

    /* renamed from: d */
    private int f9616d = -666;

    /* renamed from: a */
    public static int m15445a(byte b) {
        return b >= 0 ? b : b + 256;
    }

    /* renamed from: a */
    private void mo30024a() {
        this.f9615c = 0;
        this.f9614b = 0;
    }

    /* renamed from: a */
    private void m15447a(int i, byte[] bArr, boolean z) {
        int length = bArr.length;
        for (int i2 = 0; i2 < 256; i2++) {
            this.f9613a[i2] = (byte) i2;
        }
        this.f9615c = 0;
        this.f9614b = 0;
        while (true) {
            int i3 = this.f9614b;
            if (i3 >= i) {
                break;
            }
            int a = ((this.f9615c + m15445a(this.f9613a[i3])) + m15445a(bArr[this.f9614b % length])) % 256;
            this.f9615c = a;
            m15449a(this.f9613a, this.f9614b, a);
            this.f9614b++;
        }
        if (i != 256) {
            this.f9616d = ((this.f9615c + m15445a(this.f9613a[i])) + m15445a(bArr[i % length])) % 256;
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append("S_");
            int i4 = i - 1;
            sb.append(i4);
            sb.append(Constants.COLON_SEPARATOR);
            for (int i5 = 0; i5 <= i; i5++) {
                sb.append(" ");
                sb.append(m15445a(this.f9613a[i5]));
            }
            sb.append("   j_");
            sb.append(i4);
            sb.append("=");
            sb.append(this.f9615c);
            sb.append("   j_");
            sb.append(i);
            sb.append("=");
            sb.append(this.f9616d);
            sb.append("   S_");
            sb.append(i4);
            sb.append("[j_");
            sb.append(i4);
            sb.append("]=");
            sb.append(m15445a(this.f9613a[this.f9615c]));
            sb.append("   S_");
            sb.append(i4);
            sb.append("[j_");
            sb.append(i);
            sb.append("]=");
            sb.append(m15445a(this.f9613a[this.f9616d]));
            if (this.f9613a[1] != 0) {
                sb.append("   S[1]!=0");
            }
            C4408b.m12464a(sb.toString());
        }
    }

    /* renamed from: a */
    private void m15448a(byte[] bArr) {
        m15447a(256, bArr, false);
    }

    /* renamed from: a */
    private static void m15449a(byte[] bArr, int i, int i2) {
        byte b = bArr[i];
        bArr[i] = bArr[i2];
        bArr[i2] = b;
    }

    /* renamed from: a */
    public static byte[] m15450a(String str, String str2) {
        byte[] a = C4558bm.m13029a(str);
        byte[] bytes = str2.getBytes();
        byte[] bArr = new byte[(a.length + 1 + bytes.length)];
        for (int i = 0; i < a.length; i++) {
            bArr[i] = a[i];
        }
        bArr[a.length] = 95;
        for (int i2 = 0; i2 < bytes.length; i2++) {
            bArr[a.length + 1 + i2] = bytes[i2];
        }
        return bArr;
    }

    /* renamed from: a */
    public static byte[] m15451a(byte[] bArr, String str) {
        return m15452a(bArr, C4558bm.m13029a(str));
    }

    /* renamed from: a */
    public static byte[] m15452a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr2.length];
        C4923bp bpVar = new C4923bp();
        bpVar.m15448a(bArr);
        bpVar.mo30024a();
        for (int i = 0; i < bArr2.length; i++) {
            bArr3[i] = (byte) (bArr2[i] ^ bpVar.mo30024a());
        }
        return bArr3;
    }

    /* renamed from: a */
    public static byte[] m15453a(byte[] bArr, byte[] bArr2, boolean z, int i, int i2) {
        byte[] bArr3;
        int i3;
        if (i < 0 || i > bArr2.length || i + i2 > bArr2.length) {
            throw new IllegalArgumentException("start = " + i + " len = " + i2);
        }
        if (!z) {
            bArr3 = new byte[i2];
            i3 = 0;
        } else {
            bArr3 = bArr2;
            i3 = i;
        }
        C4923bp bpVar = new C4923bp();
        bpVar.m15448a(bArr);
        bpVar.mo30024a();
        for (int i4 = 0; i4 < i2; i4++) {
            bArr3[i3 + i4] = (byte) (bArr2[i + i4] ^ bpVar.mo30024a());
        }
        return bArr3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public byte m15454a() {
        int i = (this.f9614b + 1) % 256;
        this.f9614b = i;
        int a = (this.f9615c + m15445a(this.f9613a[i])) % 256;
        this.f9615c = a;
        m15449a(this.f9613a, this.f9614b, a);
        byte[] bArr = this.f9613a;
        return bArr[(m15445a(bArr[this.f9614b]) + m15445a(this.f9613a[this.f9615c])) % 256];
    }
}
