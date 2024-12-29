package p164h.p211a.p212a.p228h;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.h.i */
public class C11121i {

    /* renamed from: a */
    private static final C11158c f22028a = C11156b.m29015a(C11121i.class);

    /* renamed from: b */
    public static int f22029b = 65536;

    /* renamed from: c */
    private static C11123b f22030c = new C11123b();

    /* renamed from: d */
    private static C11125d f22031d = new C11125d();

    /* renamed from: e */
    private static PrintWriter f22032e = new PrintWriter(f22031d);

    /* renamed from: h.a.a.h.i$b */
    private static class C11123b extends InputStream {
        private C11123b() {
        }

        public int read() {
            return -1;
        }
    }

    /* renamed from: h.a.a.h.i$c */
    private static class C11124c extends OutputStream {
        private C11124c() {
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

    /* renamed from: h.a.a.h.i$d */
    private static class C11125d extends Writer {
        private C11125d() {
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
        new C11124c();
    }

    /* renamed from: a */
    public static void m28871a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                f22028a.mo35488d(e);
            }
        }
    }

    /* renamed from: b */
    public static void m28872b(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e) {
                f22028a.mo35488d(e);
            }
        }
    }

    /* renamed from: c */
    public static void m28873c(InputStream inputStream, OutputStream outputStream) {
        m28874d(inputStream, outputStream, -1);
    }

    /* renamed from: d */
    public static void m28874d(InputStream inputStream, OutputStream outputStream, long j) {
        byte[] bArr = new byte[f22029b];
        if (j >= 0) {
            while (j > 0) {
                int i = f22029b;
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
            int read2 = inputStream.read(bArr, 0, f22029b);
            if (read2 >= 0) {
                outputStream.write(bArr, 0, read2);
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    public static void m28875e(Reader reader, Writer writer, long j) {
        int read;
        char[] cArr = new char[f22029b];
        if (j >= 0) {
            while (j > 0) {
                int i = f22029b;
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
            while (!printWriter.checkError() && (read = reader.read(cArr, 0, f22029b)) != -1) {
                writer.write(cArr, 0, read);
            }
        } else {
            while (true) {
                int read3 = reader.read(cArr, 0, f22029b);
                if (read3 != -1) {
                    writer.write(cArr, 0, read3);
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: f */
    public static InputStream m28876f() {
        return f22030c;
    }

    /* renamed from: g */
    public static PrintWriter m28877g() {
        return f22032e;
    }
}
