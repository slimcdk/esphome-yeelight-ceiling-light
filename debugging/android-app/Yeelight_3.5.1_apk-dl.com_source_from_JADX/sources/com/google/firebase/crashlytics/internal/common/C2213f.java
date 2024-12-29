package com.google.firebase.crashlytics.internal.common;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.firebase.crashlytics.internal.common.f */
class C2213f {

    /* renamed from: a */
    private static final AtomicLong f3537a = new AtomicLong(0);

    /* renamed from: b */
    private static String f3538b;

    C2213f(C2254t tVar) {
        byte[] bArr = new byte[10];
        m5604e(bArr);
        m5603d(bArr);
        m5602c(bArr);
        String B = CommonUtils.m5530B(tVar.mo18611a());
        String v = CommonUtils.m5553v(bArr);
        Locale locale = Locale.US;
        f3538b = String.format(locale, "%s%s%s%s", new Object[]{v.substring(0, 12), v.substring(12, 16), v.subSequence(16, 20), B.substring(0, 12)}).toUpperCase(locale);
    }

    /* renamed from: a */
    private static byte[] m5600a(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) j);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: b */
    private static byte[] m5601b(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) ((int) j));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: c */
    private void m5602c(byte[] bArr) {
        byte[] b = m5601b((long) Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = b[0];
        bArr[9] = b[1];
    }

    /* renamed from: d */
    private void m5603d(byte[] bArr) {
        byte[] b = m5601b(f3537a.incrementAndGet());
        bArr[6] = b[0];
        bArr[7] = b[1];
    }

    /* renamed from: e */
    private void m5604e(byte[] bArr) {
        long time = new Date().getTime();
        byte[] a = m5600a(time / 1000);
        bArr[0] = a[0];
        bArr[1] = a[1];
        bArr[2] = a[2];
        bArr[3] = a[3];
        byte[] b = m5601b(time % 1000);
        bArr[4] = b[0];
        bArr[5] = b[1];
    }

    public String toString() {
        return f3538b;
    }
}
