package p163g7;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: g7.c */
public class C9090c {
    static {
        StringWriter stringWriter = new StringWriter(4);
        new PrintWriter(stringWriter).println();
        stringWriter.toString();
    }

    /* renamed from: a */
    public static int m21800a(InputStream inputStream, OutputStream outputStream) {
        long b = m21801b(inputStream, outputStream);
        if (b > 2147483647L) {
            return -1;
        }
        return (int) b;
    }

    /* renamed from: b */
    public static long m21801b(InputStream inputStream, OutputStream outputStream) {
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
    public static byte[] m21802c(InputStream inputStream) {
        return m21803d(inputStream);
    }

    /* renamed from: d */
    public static byte[] m21803d(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m21800a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: e */
    public static void m21804e(String str, OutputStream outputStream) {
        if (str != null) {
            outputStream.write(str.getBytes());
        }
    }

    /* renamed from: f */
    public static void m21805f(String str, OutputStream outputStream, String str2) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            m21804e(str, outputStream);
        } else {
            outputStream.write(str.getBytes(str2));
        }
    }

    /* renamed from: g */
    public static void m21806g(byte[] bArr, OutputStream outputStream) {
        if (bArr != null) {
            outputStream.write(bArr);
        }
    }

    /* renamed from: h */
    public static void m21807h(OutputStream outputStream, byte[] bArr) {
        m21806g(bArr, outputStream);
    }

    /* renamed from: i */
    public static void m21808i(OutputStream outputStream, String str) {
        m21805f(str, outputStream, "UTF-8");
    }
}
