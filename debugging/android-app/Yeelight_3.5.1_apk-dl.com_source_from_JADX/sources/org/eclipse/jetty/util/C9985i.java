package org.eclipse.jetty.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import p152e6.C9001b;
import p152e6.C9003c;

/* renamed from: org.eclipse.jetty.util.i */
public class C9985i {

    /* renamed from: a */
    private static final C9003c f18410a = C9001b.m21450a(C9985i.class);

    /* renamed from: b */
    public static int f18411b = 65536;

    /* renamed from: c */
    private static C9987b f18412c = new C9987b();

    /* renamed from: d */
    private static C9989d f18413d = new C9989d();

    /* renamed from: e */
    private static PrintWriter f18414e = new PrintWriter(f18413d);

    /* renamed from: org.eclipse.jetty.util.i$b */
    private static class C9987b extends InputStream {
        private C9987b() {
        }

        public int read() {
            return -1;
        }
    }

    /* renamed from: org.eclipse.jetty.util.i$c */
    private static class C9988c extends OutputStream {
        private C9988c() {
        }

        public void close() {
        }

        public void flush() {
        }

        public void write(int i) {
        }

        public void write(byte[] bArr) {
        }

        public void write(byte[] bArr, int i, int i2) {
        }
    }

    /* renamed from: org.eclipse.jetty.util.i$d */
    private static class C9989d extends Writer {
        private C9989d() {
        }

        public void close() {
        }

        public void flush() {
        }

        public void write(int i) {
        }

        public void write(String str) {
        }

        public void write(String str, int i, int i2) {
        }

        public void write(char[] cArr) {
        }

        public void write(char[] cArr, int i, int i2) {
        }
    }

    static {
        new C9988c();
    }

    /* renamed from: a */
    public static void m24686a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                f18410a.mo36849d(e);
            }
        }
    }

    /* renamed from: b */
    public static void m24687b(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e) {
                f18410a.mo36849d(e);
            }
        }
    }

    /* renamed from: c */
    public static void m24688c(InputStream inputStream, OutputStream outputStream) {
        m24689d(inputStream, outputStream, -1);
    }

    /* renamed from: d */
    public static void m24689d(InputStream inputStream, OutputStream outputStream, long j) {
        byte[] bArr = new byte[f18411b];
        if (j >= 0) {
            while (j > 0) {
                int i = f18411b;
                if (j < ((long) i)) {
                    i = (int) j;
                }
                int read = inputStream.read(bArr, 0, i);
                if (read != -1) {
                    j -= (long) read;
                    outputStream.write(bArr, 0, read);
                } else {
                    return;
                }
            }
            return;
        }
        while (true) {
            int read2 = inputStream.read(bArr, 0, f18411b);
            if (read2 >= 0) {
                outputStream.write(bArr, 0, read2);
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    public static void m24690e(Reader reader, Writer writer, long j) {
        int read;
        char[] cArr = new char[f18411b];
        if (j >= 0) {
            while (j > 0) {
                int i = f18411b;
                if (j < ((long) i)) {
                    i = (int) j;
                }
                int read2 = reader.read(cArr, 0, i);
                if (read2 != -1) {
                    j -= (long) read2;
                    writer.write(cArr, 0, read2);
                } else {
                    return;
                }
            }
        } else if (writer instanceof PrintWriter) {
            PrintWriter printWriter = (PrintWriter) writer;
            while (!printWriter.checkError() && (read = reader.read(cArr, 0, f18411b)) != -1) {
                writer.write(cArr, 0, read);
            }
        } else {
            while (true) {
                int read3 = reader.read(cArr, 0, f18411b);
                if (read3 != -1) {
                    writer.write(cArr, 0, read3);
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: f */
    public static InputStream m24691f() {
        return f18412c;
    }

    /* renamed from: g */
    public static PrintWriter m24692g() {
        return f18414e;
    }
}
