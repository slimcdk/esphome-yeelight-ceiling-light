package p164h.p211a.p212a.p217d;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.PrintWriter;
import java.io.Writer;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.d.s */
public class C10949s extends PrintWriter {

    /* renamed from: e */
    private static final C11158c f21335e = C11156b.m29015a(C10949s.class);

    /* renamed from: a */
    private boolean f21336a;

    /* renamed from: b */
    private IOException f21337b;

    /* renamed from: c */
    private boolean f21338c;

    /* renamed from: d */
    private String f21339d;

    public C10949s(Writer writer) {
        this(writer, false);
    }

    public C10949s(Writer writer, boolean z) {
        super(writer, z);
        this.f21336a = false;
        this.f21338c = false;
        this.f21336a = z;
        this.f21339d = System.getProperty("line.separator");
    }

    /* renamed from: a */
    private void m27722a() {
        if (this.f21337b != null) {
            throw new C10945q(this.f21337b);
        } else if (this.f21338c) {
            throw new IOException("Stream closed");
        }
    }

    /* renamed from: b */
    private void m27723b() {
        try {
            synchronized (this.lock) {
                m27722a();
                this.out.write(this.f21339d);
                if (this.f21336a) {
                    this.out.flush();
                }
            }
        } catch (InterruptedIOException unused) {
            Thread.currentThread().interrupt();
        } catch (IOException e) {
            m27724g(e);
        }
    }

    /* renamed from: g */
    private void m27724g(Throwable th) {
        super.setError();
        if (th instanceof IOException) {
            this.f21337b = (IOException) th;
        } else {
            IOException iOException = new IOException(String.valueOf(th));
            this.f21337b = iOException;
            iOException.initCause(th);
        }
        f21335e.mo35487c(th);
    }

    public boolean checkError() {
        return this.f21337b != null || super.checkError();
    }

    public void close() {
        try {
            synchronized (this.lock) {
                this.out.close();
                this.f21338c = true;
            }
        } catch (IOException e) {
            m27724g(e);
        }
    }

    public void flush() {
        try {
            synchronized (this.lock) {
                m27722a();
                this.out.flush();
            }
        } catch (IOException e) {
            m27724g(e);
        }
    }

    public void print(char c) {
        write((int) c);
    }

    public void print(double d) {
        write(String.valueOf(d));
    }

    public void print(float f) {
        write(String.valueOf(f));
    }

    public void print(int i) {
        write(String.valueOf(i));
    }

    public void print(long j) {
        write(String.valueOf(j));
    }

    public void print(Object obj) {
        write(String.valueOf(obj));
    }

    public void print(String str) {
        if (str == null) {
            str = "null";
        }
        write(str);
    }

    public void print(boolean z) {
        write(z ? "true" : "false");
    }

    public void print(char[] cArr) {
        write(cArr);
    }

    public void println() {
        m27723b();
    }

    public void println(char c) {
        synchronized (this.lock) {
            print(c);
            println();
        }
    }

    public void println(double d) {
        synchronized (this.lock) {
            print(d);
            println();
        }
    }

    public void println(float f) {
        synchronized (this.lock) {
            print(f);
            println();
        }
    }

    public void println(int i) {
        synchronized (this.lock) {
            print(i);
            println();
        }
    }

    public void println(long j) {
        synchronized (this.lock) {
            print(j);
            println();
        }
    }

    public void println(Object obj) {
        synchronized (this.lock) {
            print(obj);
            println();
        }
    }

    public void println(String str) {
        synchronized (this.lock) {
            print(str);
            println();
        }
    }

    public void println(boolean z) {
        synchronized (this.lock) {
            print(z);
            println();
        }
    }

    public void println(char[] cArr) {
        synchronized (this.lock) {
            print(cArr);
            println();
        }
    }

    /* access modifiers changed from: protected */
    public void setError() {
        m27724g(new IOException());
    }

    public void write(int i) {
        try {
            synchronized (this.lock) {
                m27722a();
                this.out.write(i);
            }
        } catch (InterruptedIOException unused) {
            Thread.currentThread().interrupt();
        } catch (IOException e) {
            m27724g(e);
        }
    }

    public void write(String str) {
        write(str, 0, str.length());
    }

    public void write(String str, int i, int i2) {
        try {
            synchronized (this.lock) {
                m27722a();
                this.out.write(str, i, i2);
            }
        } catch (InterruptedIOException unused) {
            Thread.currentThread().interrupt();
        } catch (IOException e) {
            m27724g(e);
        }
    }

    public void write(char[] cArr) {
        write(cArr, 0, cArr.length);
    }

    public void write(char[] cArr, int i, int i2) {
        try {
            synchronized (this.lock) {
                m27722a();
                this.out.write(cArr, i, i2);
            }
        } catch (InterruptedIOException unused) {
            Thread.currentThread().interrupt();
        } catch (IOException e) {
            m27724g(e);
        }
    }
}
