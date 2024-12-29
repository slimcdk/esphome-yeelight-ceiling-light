package com.google.firebase.crashlytics.p110c.p112g;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.firebase.crashlytics.c.g.g */
class C2882g {

    /* renamed from: a */
    private static final AtomicLong f5553a = new AtomicLong(0);

    /* renamed from: b */
    private static String f5554b;

    C2882g(C2955v vVar) {
        byte[] bArr = new byte[10];
        m8788e(bArr);
        m8787d(bArr);
        m8786c(bArr);
        String I = C2884h.m8802I(vVar.mo17294a());
        String z = C2884h.m8829z(bArr);
        f5554b = String.format(Locale.US, "%s-%s-%s-%s", new Object[]{z.substring(0, 12), z.substring(12, 16), z.subSequence(16, 20), I.substring(0, 12)}).toUpperCase(Locale.US);
    }

    /* renamed from: a */
    private static byte[] m8784a(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) j);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: b */
    private static byte[] m8785b(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) ((int) j));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: c */
    private void m8786c(byte[] bArr) {
        byte[] b = m8785b((long) Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = b[0];
        bArr[9] = b[1];
    }

    /* renamed from: d */
    private void m8787d(byte[] bArr) {
        byte[] b = m8785b(f5553a.incrementAndGet());
        bArr[6] = b[0];
        bArr[7] = b[1];
    }

    /* renamed from: e */
    private void m8788e(byte[] bArr) {
        long time = new Date().getTime();
        byte[] a = m8784a(time / 1000);
        bArr[0] = a[0];
        bArr[1] = a[1];
        bArr[2] = a[2];
        bArr[3] = a[3];
        byte[] b = m8785b(time % 1000);
        bArr[4] = b[0];
        bArr[5] = b[1];
    }

    public String toString() {
        return f5554b;
    }
}
