package p225w5;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.PrintWriter;
import java.io.Writer;
import org.eclipse.jetty.p195io.RuntimeIOException;
import p152e6.C9001b;
import p152e6.C9003c;

/* renamed from: w5.l */
public class C11951l extends PrintWriter {

    /* renamed from: e */
    private static final C9003c f21833e = C9001b.m21450a(C11951l.class);

    /* renamed from: a */
    private boolean f21834a;

    /* renamed from: b */
    private IOException f21835b;

    /* renamed from: c */
    private boolean f21836c;

    /* renamed from: d */
    private String f21837d;

    public C11951l(Writer writer) {
        this(writer, false);
    }

    public C11951l(Writer writer, boolean z) {
        super(writer, z);
        this.f21834a = false;
        this.f21836c = false;
        this.f21834a = z;
        this.f21837d = System.getProperty("line.separator");
    }

    /* renamed from: a */
    private void m30607a() {
        if (this.f21835b != null) {
            throw new RuntimeIOException((Throwable) this.f21835b);
        } else if (this.f21836c) {
            throw new IOException("Stream closed");
        }
    }

    /* renamed from: c */
    private void m30608c() {
        try {
            synchronized (this.lock) {
                m30607a();
                this.out.write(this.f21837d);
                if (this.f21834a) {
                    this.out.flush();
                }
            }
        } catch (InterruptedIOException unused) {
            Thread.currentThread().interrupt();
        } catch (IOException e) {
            m30609d(e);
        }
    }

    /* renamed from: d */
    private void m30609d(Throwable th) {
        super.setError();
        if (th instanceof IOException) {
            this.f21835b = (IOException) th;
        } else {
            IOException iOException = new IOException(String.valueOf(th));
            this.f21835b = iOException;
            iOException.initCause(th);
        }
        f21833e.mo36848c(th);
    }

    public boolean checkError() {
        return this.f21835b != null || super.checkError();
    }

    public void close() {
        try {
            synchronized (this.lock) {
                this.out.close();
                this.f21836c = true;
            }
        } catch (IOException e) {
            m30609d(e);
        }
    }

    public void flush() {
        try {
            synchronized (this.lock) {
                m30607a();
                this.out.flush();
            }
        } catch (IOException e) {
            m30609d(e);
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
        m30608c();
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
        m30609d(new IOException());
    }

    public void write(int i) {
        try {
            synchronized (this.lock) {
                m30607a();
                this.out.write(i);
            }
        } catch (InterruptedIOException unused) {
            Thread.currentThread().interrupt();
        } catch (IOException e) {
            m30609d(e);
        }
    }

    public void write(String str) {
        write(str, 0, str.length());
    }

    public void write(String str, int i, int i2) {
        try {
            synchronized (this.lock) {
                m30607a();
                this.out.write(str, i, i2);
            }
        } catch (InterruptedIOException unused) {
            Thread.currentThread().interrupt();
        } catch (IOException e) {
            m30609d(e);
        }
    }

    public void write(char[] cArr) {
        write(cArr, 0, cArr.length);
    }

    public void write(char[] cArr, int i, int i2) {
        try {
            synchronized (this.lock) {
                m30607a();
                this.out.write(cArr, i, i2);
            }
        } catch (InterruptedIOException unused) {
            Thread.currentThread().interrupt();
        } catch (IOException e) {
            m30609d(e);
        }
    }
}
