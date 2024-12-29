package com.xiaomi.push;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.xiaomi.push.fp */
public class C4699fp {

    /* renamed from: a */
    public static final byte[] f8192a = {80, 85, 83, 72};

    /* renamed from: a */
    private byte f8193a;

    /* renamed from: a */
    private int f8194a;

    /* renamed from: a */
    private short f8195a;

    /* renamed from: b */
    private byte[] f8196b;

    /* renamed from: com.xiaomi.push.fp$a */
    public static class C4700a {

        /* renamed from: a */
        public static final C4702c f8197a = new C4702c();

        /* renamed from: a */
        public static final C4703d f8198a = new C4703d();

        /* renamed from: a */
        public static byte[] m13905a(byte[] bArr) {
            return m13906a(bArr, f8198a);
        }

        /* renamed from: a */
        public static byte[] m13906a(byte[] bArr, C4701b bVar) {
            if (!C4699fp.m13901a(bArr)) {
                return bArr;
            }
            C4699fp a = C4699fp.m13901a(bArr);
            return (C4699fp.m13897a(a) == 0 || C4699fp.m13897a(a) != bVar.mo29167a()) ? C4699fp.m13897a(a) : bVar.mo29168a(C4699fp.m13897a(a), C4699fp.m13897a(a));
        }
    }

    /* renamed from: com.xiaomi.push.fp$b */
    public interface C4701b {
        /* renamed from: a */
        byte mo29167a();

        /* renamed from: a */
        byte[] mo29168a(byte[] bArr, int i);
    }

    /* renamed from: com.xiaomi.push.fp$c */
    public static final class C4702c {
    }

    /* renamed from: com.xiaomi.push.fp$d */
    public static final class C4703d implements C4701b {
        /* renamed from: a */
        public byte mo29167a() {
            return 2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x001c A[SYNTHETIC, Splitter:B:15:0x001c] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0023 A[SYNTHETIC, Splitter:B:21:0x0023] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public byte[] mo29168a(byte[] r4, int r5) {
            /*
                r3 = this;
                r0 = 0
                java.util.zip.GZIPInputStream r1 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x0020, all -> 0x0019 }
                java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x0020, all -> 0x0019 }
                r2.<init>(r4)     // Catch:{ IOException -> 0x0020, all -> 0x0019 }
                r1.<init>(r2, r5)     // Catch:{ IOException -> 0x0020, all -> 0x0019 }
                byte[] r5 = new byte[r5]     // Catch:{ IOException -> 0x0017, all -> 0x0014 }
                r1.read(r5)     // Catch:{ IOException -> 0x0017, all -> 0x0014 }
                r1.close()     // Catch:{ IOException -> 0x0013 }
            L_0x0013:
                return r5
            L_0x0014:
                r4 = move-exception
                r0 = r1
                goto L_0x001a
            L_0x0017:
                r0 = r1
                goto L_0x0021
            L_0x0019:
                r4 = move-exception
            L_0x001a:
                if (r0 == 0) goto L_0x001f
                r0.close()     // Catch:{ IOException -> 0x001f }
            L_0x001f:
                throw r4
            L_0x0020:
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r0.close()     // Catch:{ IOException -> 0x0026 }
            L_0x0026:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4699fp.C4703d.mo29168a(byte[], int):byte[]");
        }
    }

    protected C4699fp(byte b, int i, byte[] bArr) {
        this(1, b, i, bArr);
    }

    protected C4699fp(short s, byte b, int i, byte[] bArr) {
        this.f8195a = 1;
        this.f8195a = s;
        this.f8193a = b;
        this.f8194a = i;
        this.f8196b = bArr;
    }

    /* renamed from: a */
    public static C4699fp m13899a(byte b, int i, byte[] bArr) {
        return new C4699fp(b, i, bArr);
    }

    /* renamed from: a */
    public static C4699fp m13900a(short s, byte b, int i, byte[] bArr) {
        return new C4699fp(s, b, i, bArr);
    }

    /* renamed from: a */
    public static C4699fp m13901a(byte[] bArr) {
        if (!m13901a(bArr)) {
            return m13899a((byte) 0, bArr.length, bArr);
        }
        ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
        order.getInt();
        short s = order.getShort();
        byte b = order.get();
        int i = order.getInt();
        byte[] bArr2 = new byte[order.getInt()];
        order.get(bArr2);
        return m13900a(s, b, i, bArr2);
    }

    /* renamed from: a */
    public static boolean m13902a(byte[] bArr) {
        byte[] bArr2 = f8192a;
        return m13903a(bArr2, bArr, bArr2.length);
    }

    /* renamed from: a */
    public static boolean m13903a(byte[] bArr, byte[] bArr2, int i) {
        if (bArr.length < i || bArr2.length < i) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }
}
