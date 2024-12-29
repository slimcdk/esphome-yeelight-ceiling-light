package p164h.p257c.p259b.p260f;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: h.c.b.f.c */
public class C11510c {
    static {
        StringWriter stringWriter = new StringWriter(4);
        new PrintWriter(stringWriter).println();
        stringWriter.toString();
    }

    /* renamed from: a */
    public static int m30226a(InputStream inputStream, OutputStream outputStream) {
        long b = m30227b(inputStream, outputStream);
        if (b > 2147483647L) {
            return -1;
        }
        return (int) b;
    }

    /* renamed from: b */
    public static long m30227b(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    /* renamed from: c */
    public static byte[] m30228c(InputStream inputStream) {
        return m30229d(inputStream);
    }

    /* renamed from: d */
    public static byte[] m30229d(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m30226a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: e */
    public static void m30230e(String str, OutputStream outputStream) {
        if (str != null) {
            outputStream.write(str.getBytes());
        }
    }

    /* renamed from: f */
    public static void m30231f(String str, OutputStream outputStream, String str2) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            m30230e(str, outputStream);
        } else {
            outputStream.write(str.getBytes(str2));
        }
    }

    /* renamed from: g */
    public static void m30232g(byte[] bArr, OutputStream outputStream) {
        if (bArr != null) {
            outputStream.write(bArr);
        }
    }

    /* renamed from: h */
    public static void m30233h(OutputStream outputStream, byte[] bArr) {
        m30232g(bArr, outputStream);
    }

    /* renamed from: i */
    public static void m30234i(OutputStream outputStream, String str) {
        m30231f(str, outputStream, "UTF-8");
    }
}
