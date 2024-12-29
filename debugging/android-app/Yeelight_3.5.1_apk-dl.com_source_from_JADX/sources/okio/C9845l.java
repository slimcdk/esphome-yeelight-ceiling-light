package okio;

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

/* renamed from: okio.l */
public final class C9845l {

    /* renamed from: a */
    static final Logger f17841a = Logger.getLogger(C9845l.class.getName());

    /* renamed from: okio.l$d */
    class C3567d extends C3560a {

        /* renamed from: k */
        final /* synthetic */ Socket f5936k;

        C3567d(Socket socket) {
            this.f5936k = socket;
        }

        /* access modifiers changed from: protected */
        /* renamed from: o */
        public IOException mo24480o(@Nullable IOException iOException) {
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
        public void mo24481t() {
            /*
                r5 = this;
                java.lang.String r0 = "Failed to close timed out socket "
                java.net.Socket r1 = r5.f5936k     // Catch:{ Exception -> 0x001a, AssertionError -> 0x0008 }
                r1.close()     // Catch:{ Exception -> 0x001a, AssertionError -> 0x0008 }
                goto L_0x0033
            L_0x0008:
                r1 = move-exception
                boolean r2 = okio.C9845l.m23739e(r1)
                if (r2 == 0) goto L_0x0019
                java.util.logging.Logger r2 = okio.C9845l.f17841a
                java.util.logging.Level r3 = java.util.logging.Level.WARNING
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                goto L_0x0024
            L_0x0019:
                throw r1
            L_0x001a:
                r1 = move-exception
                java.util.logging.Logger r2 = okio.C9845l.f17841a
                java.util.logging.Level r3 = java.util.logging.Level.WARNING
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
            L_0x0024:
                r4.append(r0)
                java.net.Socket r0 = r5.f5936k
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                r2.log(r3, r0, r1)
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.C9845l.C3567d.mo24481t():void");
        }
    }

    /* renamed from: okio.l$a */
    class C9846a implements C9852q {

        /* renamed from: a */
        final /* synthetic */ C9854s f17842a;

        /* renamed from: b */
        final /* synthetic */ OutputStream f17843b;

        C9846a(C9854s sVar, OutputStream outputStream) {
            this.f17842a = sVar;
            this.f17843b = outputStream;
        }

        public void close() {
            this.f17843b.close();
        }

        public void flush() {
            this.f17843b.flush();
        }

        /* renamed from: j */
        public C9854s mo24475j() {
            return this.f17842a;
        }

        /* renamed from: q0 */
        public void mo24476q0(C3564c cVar, long j) {
            C9856t.m23805b(cVar.f5933b, 0, j);
            while (j > 0) {
                this.f17842a.mo39090f();
                C3568o oVar = cVar.f5932a;
                int min = (int) Math.min(j, (long) (oVar.f5939c - oVar.f5938b));
                this.f17843b.write(oVar.f5937a, oVar.f5938b, min);
                int i = oVar.f5938b + min;
                oVar.f5938b = i;
                long j2 = (long) min;
                j -= j2;
                cVar.f5933b -= j2;
                if (i == oVar.f5939c) {
                    cVar.f5932a = oVar.mo24805b();
                    C3569p.m10054a(oVar);
                }
            }
        }

        public String toString() {
            return "sink(" + this.f17843b + ")";
        }
    }

    /* renamed from: okio.l$b */
    class C9847b implements C9853r {

        /* renamed from: a */
        final /* synthetic */ C9854s f17844a;

        /* renamed from: b */
        final /* synthetic */ InputStream f17845b;

        C9847b(C9854s sVar, InputStream inputStream) {
            this.f17844a = sVar;
            this.f17845b = inputStream;
        }

        /* renamed from: R0 */
        public long mo24477R0(C3564c cVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (j == 0) {
                return 0;
            } else {
                try {
                    this.f17844a.mo39090f();
                    C3568o l1 = cVar.mo24764l1(1);
                    int read = this.f17845b.read(l1.f5937a, l1.f5939c, (int) Math.min(j, (long) (8192 - l1.f5939c)));
                    if (read == -1) {
                        return -1;
                    }
                    l1.f5939c += read;
                    long j2 = (long) read;
                    cVar.f5933b += j2;
                    return j2;
                } catch (AssertionError e) {
                    if (C9845l.m23739e(e)) {
                        throw new IOException(e);
                    }
                    throw e;
                }
            }
        }

        public void close() {
            this.f17845b.close();
        }

        /* renamed from: j */
        public C9854s mo24479j() {
            return this.f17844a;
        }

        public String toString() {
            return "source(" + this.f17845b + ")";
        }
    }

    /* renamed from: okio.l$c */
    class C9848c implements C9852q {
        C9848c() {
        }

        public void close() {
        }

        public void flush() {
        }

        /* renamed from: j */
        public C9854s mo24475j() {
            return C9854s.f17853d;
        }

        /* renamed from: q0 */
        public void mo24476q0(C3564c cVar, long j) {
            cVar.skip(j);
        }
    }

    private C9845l() {
    }

    /* renamed from: a */
    public static C9852q m23735a(File file) {
        if (file != null) {
            return m23741g(new FileOutputStream(file, true));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: b */
    public static C9852q m23736b() {
        return new C9848c();
    }

    /* renamed from: c */
    public static C9837d m23737c(C9852q qVar) {
        return new C9849m(qVar);
    }

    /* renamed from: d */
    public static C9838e m23738d(C9853r rVar) {
        return new C9850n(rVar);
    }

    /* renamed from: e */
    static boolean m23739e(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* renamed from: f */
    public static C9852q m23740f(File file) {
        if (file != null) {
            return m23741g(new FileOutputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: g */
    public static C9852q m23741g(OutputStream outputStream) {
        return m23742h(outputStream, new C9854s());
    }

    /* renamed from: h */
    private static C9852q m23742h(OutputStream outputStream, C9854s sVar) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        } else if (sVar != null) {
            return new C9846a(sVar, outputStream);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    /* renamed from: i */
    public static C9852q m23743i(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getOutputStream() != null) {
            C3560a n = m23748n(socket);
            return n.mo24716r(m23742h(socket.getOutputStream(), n));
        } else {
            throw new IOException("socket's output stream == null");
        }
    }

    /* renamed from: j */
    public static C9853r m23744j(File file) {
        if (file != null) {
            return m23745k(new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: k */
    public static C9853r m23745k(InputStream inputStream) {
        return m23746l(inputStream, new C9854s());
    }

    /* renamed from: l */
    private static C9853r m23746l(InputStream inputStream, C9854s sVar) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (sVar != null) {
            return new C9847b(sVar, inputStream);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    /* renamed from: m */
    public static C9853r m23747m(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getInputStream() != null) {
            C3560a n = m23748n(socket);
            return n.mo24717s(m23746l(socket.getInputStream(), n));
        } else {
            throw new IOException("socket's input stream == null");
        }
    }

    /* renamed from: n */
    private static C3560a m23748n(Socket socket) {
        return new C3567d(socket);
    }
}
