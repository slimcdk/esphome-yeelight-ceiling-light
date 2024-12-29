package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.C4529bc;

/* renamed from: com.xiaomi.push.service.ay */
public class C4877ay {

    /* renamed from: a */
    private static int f10059a = 8;

    /* renamed from: a */
    private byte[] f10060a = new byte[256];

    /* renamed from: b */
    private int f10061b = 0;

    /* renamed from: c */
    private int f10062c = 0;

    /* renamed from: d */
    private int f10063d = -666;

    /* renamed from: a */
    public static int m15647a(byte b) {
        return b >= 0 ? b : b + 256;
    }

    /* renamed from: a */
    private void mo25939a() {
        this.f10062c = 0;
        this.f10061b = 0;
    }

    /* renamed from: a */
    private void m15649a(int i, byte[] bArr, boolean z) {
        int length = bArr.length;
        for (int i2 = 0; i2 < 256; i2++) {
            this.f10060a[i2] = (byte) i2;
        }
        this.f10062c = 0;
        this.f10061b = 0;
        while (true) {
            int i3 = this.f10061b;
            if (i3 >= i) {
                break;
            }
            int a = ((this.f10062c + m15647a(this.f10060a[i3])) + m15647a(bArr[this.f10061b % length])) % 256;
            this.f10062c = a;
            m15651a(this.f10060a, this.f10061b, a);
            this.f10061b++;
        }
        if (i != 256) {
            this.f10063d = ((this.f10062c + m15647a(this.f10060a[i])) + m15647a(bArr[i % length])) % 256;
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append("S_");
            int i4 = i - 1;
            sb.append(i4);
            sb.append(Constants.COLON_SEPARATOR);
            for (int i5 = 0; i5 <= i; i5++) {
                sb.append(" ");
                sb.append(m15647a(this.f10060a[i5]));
            }
            sb.append("   j_");
            sb.append(i4);
            sb.append("=");
            sb.append(this.f10062c);
            sb.append("   j_");
            sb.append(i);
            sb.append("=");
            sb.append(this.f10063d);
            sb.append("   S_");
            sb.append(i4);
            sb.append("[j_");
            sb.append(i4);
            sb.append("]=");
            sb.append(m15647a(this.f10060a[this.f10062c]));
            sb.append("   S_");
            sb.append(i4);
            sb.append("[j_");
            sb.append(i);
            sb.append("]=");
            sb.append(m15647a(this.f10060a[this.f10063d]));
            if (this.f10060a[1] != 0) {
                sb.append("   S[1]!=0");
            }
            C3989b.m10669a(sb.toString());
        }
    }

    /* renamed from: a */
    private void m15650a(byte[] bArr) {
        m15649a(256, bArr, false);
    }

    /* renamed from: a */
    private static void m15651a(byte[] bArr, int i, int i2) {
        byte b = bArr[i];
        bArr[i] = bArr[i2];
        bArr[i2] = b;
    }

    /* renamed from: a */
    public static byte[] m15652a(String str, String str2) {
        byte[] a = C4529bc.m13418a(str);
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
    public static byte[] m15653a(byte[] bArr, String str) {
        return m15654a(bArr, C4529bc.m13418a(str));
    }

    /* renamed from: a */
    public static byte[] m15654a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr2.length];
        C4877ay ayVar = new C4877ay();
        ayVar.m15650a(bArr);
        ayVar.mo25939a();
        for (int i = 0; i < bArr2.length; i++) {
            bArr3[i] = (byte) (bArr2[i] ^ ayVar.mo25939a());
        }
        return bArr3;
    }

    /* renamed from: a */
    public static byte[] m15655a(byte[] bArr, byte[] bArr2, boolean z, int i, int i2) {
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
        C4877ay ayVar = new C4877ay();
        ayVar.m15650a(bArr);
        ayVar.mo25939a();
        for (int i4 = 0; i4 < i2; i4++) {
            bArr3[i3 + i4] = (byte) (bArr2[i + i4] ^ ayVar.mo25939a());
        }
        return bArr3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public byte m15656a() {
        int i = (this.f10061b + 1) % 256;
        this.f10061b = i;
        int a = (this.f10062c + m15647a(this.f10060a[i])) % 256;
        this.f10062c = a;
        m15651a(this.f10060a, this.f10061b, a);
        byte[] bArr = this.f10060a;
        return bArr[(m15647a(bArr[this.f10061b]) + m15647a(this.f10060a[this.f10062c])) % 256];
    }
}
