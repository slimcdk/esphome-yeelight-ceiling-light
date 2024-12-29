package p163g;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* renamed from: g.m */
public final class C10843m {

    /* renamed from: a */
    static final Logger f20916a = Logger.getLogger(C10843m.class.getName());

    /* renamed from: g.m$d */
    class C4412d extends C4402a {

        /* renamed from: k */
        final /* synthetic */ Socket f7957k;

        C4412d(Socket socket) {
            this.f7957k = socket;
        }

        /* access modifiers changed from: protected */
        /* renamed from: o */
        public IOException mo9544o(@Nullable IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Exception} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.AssertionError} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Exception} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Exception} */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: t */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo9545t() {
            /*
                r5 = this;
                java.lang.String r0 = "Failed to close timed out socket "
                java.net.Socket r1 = r5.f7957k     // Catch:{ Exception -> 0x001a, AssertionError -> 0x0008 }
                r1.close()     // Catch:{ Exception -> 0x001a, AssertionError -> 0x0008 }
                goto L_0x0033
            L_0x0008:
                r1 = move-exception
                boolean r2 = p163g.C10843m.m27010e(r1)
                if (r2 == 0) goto L_0x0019
                java.util.logging.Logger r2 = p163g.C10843m.f20916a
                java.util.logging.Level r3 = java.util.logging.Level.WARNING
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                goto L_0x0024
            L_0x0019:
                throw r1
            L_0x001a:
                r1 = move-exception
                java.util.logging.Logger r2 = p163g.C10843m.f20916a
                java.util.logging.Level r3 = java.util.logging.Level.WARNING
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
            L_0x0024:
                r4.append(r0)
                java.net.Socket r0 = r5.f7957k
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                r2.log(r3, r0, r1)
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p163g.C10843m.C4412d.mo9545t():void");
        }
    }

    /* renamed from: g.m$a */
    class C10844a implements C4415s {

        /* renamed from: a */
        final /* synthetic */ C4417u f20917a;

        /* renamed from: b */
        final /* synthetic */ OutputStream f20918b;

        C10844a(C4417u uVar, OutputStream outputStream) {
            this.f20917a = uVar;
            this.f20918b = outputStream;
        }

        public void close() {
            this.f20918b.close();
        }

        /* renamed from: f */
        public C4417u mo9440f() {
            return this.f20917a;
        }

        public void flush() {
            this.f20918b.flush();
        }

        /* renamed from: p0 */
        public void mo9442p0(C4406c cVar, long j) {
            C10851v.m27080b(cVar.f7949b, 0, j);
            while (j > 0) {
                this.f20917a.mo24316f();
                C4413p pVar = cVar.f7948a;
                int min = (int) Math.min(j, (long) (pVar.f7960c - pVar.f7959b));
                this.f20918b.write(pVar.f7958a, pVar.f7959b, min);
                int i = pVar.f7959b + min;
                pVar.f7959b = i;
                long j2 = (long) min;
                j -= j2;
                cVar.f7949b -= j2;
                if (i == pVar.f7960c) {
                    cVar.f7948a = pVar.mo24306b();
                    C4414q.m12894a(pVar);
                }
            }
        }

        public String toString() {
            return "sink(" + this.f20918b + ")";
        }
    }

    /* renamed from: g.m$b */
    class C10845b implements C4416t {

        /* renamed from: a */
        final /* synthetic */ C4417u f20919a;

        /* renamed from: b */
        final /* synthetic */ InputStream f20920b;

        C10845b(C4417u uVar, InputStream inputStream) {
            this.f20919a = uVar;
            this.f20920b = inputStream;
        }

        /* renamed from: P0 */
        public long mo9541P0(C4406c cVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (j == 0) {
                return 0;
            } else {
                try {
                    this.f20919a.mo24316f();
                    C4413p j1 = cVar.mo24241j1(1);
                    int read = this.f20920b.read(j1.f7958a, j1.f7960c, (int) Math.min(j, (long) (8192 - j1.f7960c)));
                    if (read == -1) {
                        return -1;
                    }
                    j1.f7960c += read;
                    long j2 = (long) read;
                    cVar.f7949b += j2;
                    return j2;
                } catch (AssertionError e) {
                    if (C10843m.m27010e(e)) {
                        throw new IOException(e);
                    }
                    throw e;
                }
            }
        }

        public void close() {
            this.f20920b.close();
        }

        /* renamed from: f */
        public C4417u mo9542f() {
            return this.f20919a;
        }

        public String toString() {
            return "source(" + this.f20920b + ")";
        }
    }

    /* renamed from: g.m$c */
    class C10846c implements C4415s {
        C10846c() {
        }

        public void close() {
        }

        /* renamed from: f */
        public C4417u mo9440f() {
            return C4417u.f7967d;
        }

        public void flush() {
        }

        /* renamed from: p0 */
        public void mo9442p0(C4406c cVar, long j) {
            cVar.skip(j);
        }
    }

    private C10843m() {
    }

    /* renamed from: a */
    public static C4415s m27006a(File file) {
        if (file != null) {
            return m27012g(new FileOutputStream(file, true));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: b */
    public static C4415s m27007b() {
        return new C10846c();
    }

    /* renamed from: c */
    public static C4409d m27008c(C4415s sVar) {
        return new C10847n(sVar);
    }

    /* renamed from: d */
    public static C4410e m27009d(C4416t tVar) {
        return new C10848o(tVar);
    }

    /* renamed from: e */
    static boolean m27010e(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* renamed from: f */
    public static C4415s m27011f(File file) {
        if (file != null) {
            return m27012g(new FileOutputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: g */
    public static C4415s m27012g(OutputStream outputStream) {
        return m27013h(outputStream, new C4417u());
    }

    /* renamed from: h */
    private static C4415s m27013h(OutputStream outputStream, C4417u uVar) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        } else if (uVar != null) {
            return new C10844a(uVar, outputStream);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    /* renamed from: i */
    public static C4415s m27014i(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getOutputStream() != null) {
            C4402a n = m27019n(socket);
            return n.mo24197r(m27013h(socket.getOutputStream(), n));
        } else {
            throw new IOException("socket's output stream == null");
        }
    }

    /* renamed from: j */
    public static C4416t m27015j(File file) {
        if (file != null) {
            return m27016k(new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: k */
    public static C4416t m27016k(InputStream inputStream) {
        return m27017l(inputStream, new C4417u());
    }

    /* renamed from: l */
    private static C4416t m27017l(InputStream inputStream, C4417u uVar) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (uVar != null) {
            return new C10845b(uVar, inputStream);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    /* renamed from: m */
    public static C4416t m27018m(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getInputStream() != null) {
            C4402a n = m27019n(socket);
            return n.mo24198s(m27017l(socket.getInputStream(), n));
        } else {
            throw new IOException("socket's input stream == null");
        }
    }

    /* renamed from: n */
    private static C4402a m27019n(Socket socket) {
        return new C4412d(socket);
    }
}
