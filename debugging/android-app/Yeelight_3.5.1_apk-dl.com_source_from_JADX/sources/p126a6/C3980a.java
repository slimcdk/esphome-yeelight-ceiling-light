package p126a6;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.jetty.p195io.bio.C9921a;
import p147d6.C8942b;
import p152e6.C9001b;
import p152e6.C9003c;
import p225w5.C11940d;
import p225w5.C11948i;
import p225w5.C11949j;
import p225w5.C11950k;
import p239z5.C12149a;
import p239z5.C12151b;
import p239z5.C12169e;
import p239z5.C12181o;

/* renamed from: a6.a */
public class C3980a extends C12149a {
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public static final C9003c f6726d0 = C9001b.m21450a(C3980a.class);

    /* renamed from: a0 */
    protected ServerSocket f6727a0;

    /* renamed from: b0 */
    protected final Set<C11950k> f6728b0 = new HashSet();

    /* renamed from: c0 */
    protected volatile int f6729c0 = -1;

    /* renamed from: a6.a$a */
    protected class C3981a extends C9921a implements Runnable, C11948i {

        /* renamed from: j */
        volatile C11949j f6730j;

        /* renamed from: k */
        protected final Socket f6731k;

        public C3981a(Socket socket) {
            super(socket, C3980a.this.f22314Q);
            this.f6730j = C3980a.this.mo26545p1(this);
            this.f6731k = socket;
        }

        /* renamed from: c */
        public void mo26549c() {
            if (C3980a.this.mo42951i1() == null || !C3980a.this.mo42951i1().mo37186h0(this)) {
                C3980a.f6726d0.mo36847b("dispatch failed for {}", this.f6730j);
                close();
            }
        }

        public void close() {
            if (this.f6730j instanceof C12151b) {
                ((C12151b) this.f6730j).mo42994v().mo43129z().mo43007f();
            }
            super.close();
        }

        /* JADX WARNING: Removed duplicated region for block: B:116:0x01b8 A[Catch:{ IOException -> 0x0246 }, LOOP:8: B:116:0x01b8->B:119:0x01cc, LOOP_START] */
        /* JADX WARNING: Removed duplicated region for block: B:144:0x0222 A[Catch:{ IOException -> 0x0246 }, LOOP:10: B:144:0x0222->B:147:0x0236, LOOP_START] */
        /* JADX WARNING: Removed duplicated region for block: B:166:0x027f A[Catch:{ IOException -> 0x02a3 }, LOOP:12: B:166:0x027f->B:169:0x0293, LOOP_START] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0071 A[Catch:{ IOException -> 0x0246 }, LOOP:1: B:26:0x0071->B:29:0x0085, LOOP_START] */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x00e2 A[Catch:{ IOException -> 0x0246 }, LOOP:4: B:60:0x00e2->B:63:0x00f6, LOOP_START] */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x014d A[Catch:{ IOException -> 0x0246 }, LOOP:6: B:88:0x014d->B:91:0x0161, LOOP_START] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r9 = this;
                a6.a r0 = p126a6.C3980a.this     // Catch:{ EofException -> 0x01df, SocketException -> 0x0175, HttpException -> 0x010a, Exception -> 0x009f }
                w5.j r1 = r9.f6730j     // Catch:{ EofException -> 0x01df, SocketException -> 0x0175, HttpException -> 0x010a, Exception -> 0x009f }
                r0.mo42931V0(r1)     // Catch:{ EofException -> 0x01df, SocketException -> 0x0175, HttpException -> 0x010a, Exception -> 0x009f }
                a6.a r0 = p126a6.C3980a.this     // Catch:{ EofException -> 0x01df, SocketException -> 0x0175, HttpException -> 0x010a, Exception -> 0x009f }
                java.util.Set<w5.k> r0 = r0.f6728b0     // Catch:{ EofException -> 0x01df, SocketException -> 0x0175, HttpException -> 0x010a, Exception -> 0x009f }
                monitor-enter(r0)     // Catch:{ EofException -> 0x01df, SocketException -> 0x0175, HttpException -> 0x010a, Exception -> 0x009f }
                a6.a r1 = p126a6.C3980a.this     // Catch:{ all -> 0x0099 }
                java.util.Set<w5.k> r1 = r1.f6728b0     // Catch:{ all -> 0x0099 }
                r1.add(r9)     // Catch:{ all -> 0x0099 }
                monitor-exit(r0)     // Catch:{ all -> 0x0099 }
            L_0x0014:
                a6.a r0 = p126a6.C3980a.this     // Catch:{ EofException -> 0x01df, SocketException -> 0x0175, HttpException -> 0x010a, Exception -> 0x009f }
                boolean r0 = r0.mo36748n0()     // Catch:{ EofException -> 0x01df, SocketException -> 0x0175, HttpException -> 0x010a, Exception -> 0x009f }
                if (r0 == 0) goto L_0x0044
                boolean r0 = r9.mo39877E()     // Catch:{ EofException -> 0x01df, SocketException -> 0x0175, HttpException -> 0x010a, Exception -> 0x009f }
                if (r0 != 0) goto L_0x0044
                w5.j r0 = r9.f6730j     // Catch:{ EofException -> 0x01df, SocketException -> 0x0175, HttpException -> 0x010a, Exception -> 0x009f }
                boolean r0 = r0.mo39518a()     // Catch:{ EofException -> 0x01df, SocketException -> 0x0175, HttpException -> 0x010a, Exception -> 0x009f }
                if (r0 == 0) goto L_0x003b
                a6.a r0 = p126a6.C3980a.this     // Catch:{ EofException -> 0x01df, SocketException -> 0x0175, HttpException -> 0x010a, Exception -> 0x009f }
                boolean r0 = r0.mo42922N()     // Catch:{ EofException -> 0x01df, SocketException -> 0x0175, HttpException -> 0x010a, Exception -> 0x009f }
                if (r0 == 0) goto L_0x003b
                a6.a r0 = p126a6.C3980a.this     // Catch:{ EofException -> 0x01df, SocketException -> 0x0175, HttpException -> 0x010a, Exception -> 0x009f }
                int r0 = r0.mo42946f1()     // Catch:{ EofException -> 0x01df, SocketException -> 0x0175, HttpException -> 0x010a, Exception -> 0x009f }
                r9.mo39659i(r0)     // Catch:{ EofException -> 0x01df, SocketException -> 0x0175, HttpException -> 0x010a, Exception -> 0x009f }
            L_0x003b:
                w5.j r0 = r9.f6730j     // Catch:{ EofException -> 0x01df, SocketException -> 0x0175, HttpException -> 0x010a, Exception -> 0x009f }
                w5.j r0 = r0.mo39556c()     // Catch:{ EofException -> 0x01df, SocketException -> 0x0175, HttpException -> 0x010a, Exception -> 0x009f }
                r9.f6730j = r0     // Catch:{ EofException -> 0x01df, SocketException -> 0x0175, HttpException -> 0x010a, Exception -> 0x009f }
                goto L_0x0014
            L_0x0044:
                a6.a r0 = p126a6.C3980a.this
                w5.j r1 = r9.f6730j
                r0.mo42930U0(r1)
                a6.a r0 = p126a6.C3980a.this
                java.util.Set<w5.k> r0 = r0.f6728b0
                monitor-enter(r0)
                a6.a r1 = p126a6.C3980a.this     // Catch:{ all -> 0x0096 }
                java.util.Set<w5.k> r1 = r1.f6728b0     // Catch:{ all -> 0x0096 }
                r1.remove(r9)     // Catch:{ all -> 0x0096 }
                monitor-exit(r0)     // Catch:{ all -> 0x0096 }
                java.net.Socket r0 = r9.f6731k     // Catch:{ IOException -> 0x0246 }
                boolean r0 = r0.isClosed()     // Catch:{ IOException -> 0x0246 }
                if (r0 != 0) goto L_0x024e
                long r0 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x0246 }
                int r2 = r9.mo39655f()     // Catch:{ IOException -> 0x0246 }
                java.net.Socket r3 = r9.f6731k     // Catch:{ IOException -> 0x0246 }
                int r4 = r9.mo39655f()     // Catch:{ IOException -> 0x0246 }
                r3.setSoTimeout(r4)     // Catch:{ IOException -> 0x0246 }
            L_0x0071:
                java.net.Socket r3 = r9.f6731k     // Catch:{ IOException -> 0x0246 }
                java.io.InputStream r3 = r3.getInputStream()     // Catch:{ IOException -> 0x0246 }
                int r3 = r3.read()     // Catch:{ IOException -> 0x0246 }
                if (r3 < 0) goto L_0x0087
                long r3 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x0246 }
                long r3 = r3 - r0
                long r5 = (long) r2     // Catch:{ IOException -> 0x0246 }
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 < 0) goto L_0x0071
            L_0x0087:
                java.net.Socket r0 = r9.f6731k     // Catch:{ IOException -> 0x0246 }
                boolean r0 = r0.isClosed()     // Catch:{ IOException -> 0x0246 }
                if (r0 != 0) goto L_0x024e
                java.net.Socket r0 = r9.f6731k     // Catch:{ IOException -> 0x0246 }
                r0.close()     // Catch:{ IOException -> 0x0246 }
                goto L_0x024e
            L_0x0096:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0096 }
                throw r1
            L_0x0099:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0099 }
                throw r1     // Catch:{ EofException -> 0x01df, SocketException -> 0x0175, HttpException -> 0x010a, Exception -> 0x009f }
            L_0x009c:
                r0 = move-exception
                goto L_0x0252
            L_0x009f:
                r0 = move-exception
                e6.c r1 = p126a6.C3980a.f6726d0     // Catch:{ all -> 0x009c }
                java.lang.String r2 = "handle failed?"
                r1.mo36852g(r2, r0)     // Catch:{ all -> 0x009c }
                r9.close()     // Catch:{ IOException -> 0x00ad }
                goto L_0x00b5
            L_0x00ad:
                r0 = move-exception
                e6.c r1 = p126a6.C3980a.f6726d0     // Catch:{ all -> 0x009c }
                r1.mo36849d(r0)     // Catch:{ all -> 0x009c }
            L_0x00b5:
                a6.a r0 = p126a6.C3980a.this
                w5.j r1 = r9.f6730j
                r0.mo42930U0(r1)
                a6.a r0 = p126a6.C3980a.this
                java.util.Set<w5.k> r0 = r0.f6728b0
                monitor-enter(r0)
                a6.a r1 = p126a6.C3980a.this     // Catch:{ all -> 0x0107 }
                java.util.Set<w5.k> r1 = r1.f6728b0     // Catch:{ all -> 0x0107 }
                r1.remove(r9)     // Catch:{ all -> 0x0107 }
                monitor-exit(r0)     // Catch:{ all -> 0x0107 }
                java.net.Socket r0 = r9.f6731k     // Catch:{ IOException -> 0x0246 }
                boolean r0 = r0.isClosed()     // Catch:{ IOException -> 0x0246 }
                if (r0 != 0) goto L_0x024e
                long r0 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x0246 }
                int r2 = r9.mo39655f()     // Catch:{ IOException -> 0x0246 }
                java.net.Socket r3 = r9.f6731k     // Catch:{ IOException -> 0x0246 }
                int r4 = r9.mo39655f()     // Catch:{ IOException -> 0x0246 }
                r3.setSoTimeout(r4)     // Catch:{ IOException -> 0x0246 }
            L_0x00e2:
                java.net.Socket r3 = r9.f6731k     // Catch:{ IOException -> 0x0246 }
                java.io.InputStream r3 = r3.getInputStream()     // Catch:{ IOException -> 0x0246 }
                int r3 = r3.read()     // Catch:{ IOException -> 0x0246 }
                if (r3 < 0) goto L_0x00f8
                long r3 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x0246 }
                long r3 = r3 - r0
                long r5 = (long) r2     // Catch:{ IOException -> 0x0246 }
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 < 0) goto L_0x00e2
            L_0x00f8:
                java.net.Socket r0 = r9.f6731k     // Catch:{ IOException -> 0x0246 }
                boolean r0 = r0.isClosed()     // Catch:{ IOException -> 0x0246 }
                if (r0 != 0) goto L_0x024e
                java.net.Socket r0 = r9.f6731k     // Catch:{ IOException -> 0x0246 }
                r0.close()     // Catch:{ IOException -> 0x0246 }
                goto L_0x024e
            L_0x0107:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0107 }
                throw r1
            L_0x010a:
                r0 = move-exception
                e6.c r1 = p126a6.C3980a.f6726d0     // Catch:{ all -> 0x009c }
                java.lang.String r2 = "BAD"
                r1.mo36854h(r2, r0)     // Catch:{ all -> 0x009c }
                r9.close()     // Catch:{ IOException -> 0x0118 }
                goto L_0x0120
            L_0x0118:
                r0 = move-exception
                e6.c r1 = p126a6.C3980a.f6726d0     // Catch:{ all -> 0x009c }
                r1.mo36849d(r0)     // Catch:{ all -> 0x009c }
            L_0x0120:
                a6.a r0 = p126a6.C3980a.this
                w5.j r1 = r9.f6730j
                r0.mo42930U0(r1)
                a6.a r0 = p126a6.C3980a.this
                java.util.Set<w5.k> r0 = r0.f6728b0
                monitor-enter(r0)
                a6.a r1 = p126a6.C3980a.this     // Catch:{ all -> 0x0172 }
                java.util.Set<w5.k> r1 = r1.f6728b0     // Catch:{ all -> 0x0172 }
                r1.remove(r9)     // Catch:{ all -> 0x0172 }
                monitor-exit(r0)     // Catch:{ all -> 0x0172 }
                java.net.Socket r0 = r9.f6731k     // Catch:{ IOException -> 0x0246 }
                boolean r0 = r0.isClosed()     // Catch:{ IOException -> 0x0246 }
                if (r0 != 0) goto L_0x024e
                long r0 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x0246 }
                int r2 = r9.mo39655f()     // Catch:{ IOException -> 0x0246 }
                java.net.Socket r3 = r9.f6731k     // Catch:{ IOException -> 0x0246 }
                int r4 = r9.mo39655f()     // Catch:{ IOException -> 0x0246 }
                r3.setSoTimeout(r4)     // Catch:{ IOException -> 0x0246 }
            L_0x014d:
                java.net.Socket r3 = r9.f6731k     // Catch:{ IOException -> 0x0246 }
                java.io.InputStream r3 = r3.getInputStream()     // Catch:{ IOException -> 0x0246 }
                int r3 = r3.read()     // Catch:{ IOException -> 0x0246 }
                if (r3 < 0) goto L_0x0163
                long r3 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x0246 }
                long r3 = r3 - r0
                long r5 = (long) r2     // Catch:{ IOException -> 0x0246 }
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 < 0) goto L_0x014d
            L_0x0163:
                java.net.Socket r0 = r9.f6731k     // Catch:{ IOException -> 0x0246 }
                boolean r0 = r0.isClosed()     // Catch:{ IOException -> 0x0246 }
                if (r0 != 0) goto L_0x024e
                java.net.Socket r0 = r9.f6731k     // Catch:{ IOException -> 0x0246 }
                r0.close()     // Catch:{ IOException -> 0x0246 }
                goto L_0x024e
            L_0x0172:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0172 }
                throw r1
            L_0x0175:
                r0 = move-exception
                e6.c r1 = p126a6.C3980a.f6726d0     // Catch:{ all -> 0x009c }
                java.lang.String r2 = "EOF"
                r1.mo36854h(r2, r0)     // Catch:{ all -> 0x009c }
                r9.close()     // Catch:{ IOException -> 0x0183 }
                goto L_0x018b
            L_0x0183:
                r0 = move-exception
                e6.c r1 = p126a6.C3980a.f6726d0     // Catch:{ all -> 0x009c }
                r1.mo36849d(r0)     // Catch:{ all -> 0x009c }
            L_0x018b:
                a6.a r0 = p126a6.C3980a.this
                w5.j r1 = r9.f6730j
                r0.mo42930U0(r1)
                a6.a r0 = p126a6.C3980a.this
                java.util.Set<w5.k> r0 = r0.f6728b0
                monitor-enter(r0)
                a6.a r1 = p126a6.C3980a.this     // Catch:{ all -> 0x01dc }
                java.util.Set<w5.k> r1 = r1.f6728b0     // Catch:{ all -> 0x01dc }
                r1.remove(r9)     // Catch:{ all -> 0x01dc }
                monitor-exit(r0)     // Catch:{ all -> 0x01dc }
                java.net.Socket r0 = r9.f6731k     // Catch:{ IOException -> 0x0246 }
                boolean r0 = r0.isClosed()     // Catch:{ IOException -> 0x0246 }
                if (r0 != 0) goto L_0x024e
                long r0 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x0246 }
                int r2 = r9.mo39655f()     // Catch:{ IOException -> 0x0246 }
                java.net.Socket r3 = r9.f6731k     // Catch:{ IOException -> 0x0246 }
                int r4 = r9.mo39655f()     // Catch:{ IOException -> 0x0246 }
                r3.setSoTimeout(r4)     // Catch:{ IOException -> 0x0246 }
            L_0x01b8:
                java.net.Socket r3 = r9.f6731k     // Catch:{ IOException -> 0x0246 }
                java.io.InputStream r3 = r3.getInputStream()     // Catch:{ IOException -> 0x0246 }
                int r3 = r3.read()     // Catch:{ IOException -> 0x0246 }
                if (r3 < 0) goto L_0x01ce
                long r3 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x0246 }
                long r3 = r3 - r0
                long r5 = (long) r2     // Catch:{ IOException -> 0x0246 }
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 < 0) goto L_0x01b8
            L_0x01ce:
                java.net.Socket r0 = r9.f6731k     // Catch:{ IOException -> 0x0246 }
                boolean r0 = r0.isClosed()     // Catch:{ IOException -> 0x0246 }
                if (r0 != 0) goto L_0x024e
                java.net.Socket r0 = r9.f6731k     // Catch:{ IOException -> 0x0246 }
                r0.close()     // Catch:{ IOException -> 0x0246 }
                goto L_0x024e
            L_0x01dc:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x01dc }
                throw r1
            L_0x01df:
                r0 = move-exception
                e6.c r1 = p126a6.C3980a.f6726d0     // Catch:{ all -> 0x009c }
                java.lang.String r2 = "EOF"
                r1.mo36854h(r2, r0)     // Catch:{ all -> 0x009c }
                r9.close()     // Catch:{ IOException -> 0x01ed }
                goto L_0x01f5
            L_0x01ed:
                r0 = move-exception
                e6.c r1 = p126a6.C3980a.f6726d0     // Catch:{ all -> 0x009c }
                r1.mo36849d(r0)     // Catch:{ all -> 0x009c }
            L_0x01f5:
                a6.a r0 = p126a6.C3980a.this
                w5.j r1 = r9.f6730j
                r0.mo42930U0(r1)
                a6.a r0 = p126a6.C3980a.this
                java.util.Set<w5.k> r0 = r0.f6728b0
                monitor-enter(r0)
                a6.a r1 = p126a6.C3980a.this     // Catch:{ all -> 0x024f }
                java.util.Set<w5.k> r1 = r1.f6728b0     // Catch:{ all -> 0x024f }
                r1.remove(r9)     // Catch:{ all -> 0x024f }
                monitor-exit(r0)     // Catch:{ all -> 0x024f }
                java.net.Socket r0 = r9.f6731k     // Catch:{ IOException -> 0x0246 }
                boolean r0 = r0.isClosed()     // Catch:{ IOException -> 0x0246 }
                if (r0 != 0) goto L_0x024e
                long r0 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x0246 }
                int r2 = r9.mo39655f()     // Catch:{ IOException -> 0x0246 }
                java.net.Socket r3 = r9.f6731k     // Catch:{ IOException -> 0x0246 }
                int r4 = r9.mo39655f()     // Catch:{ IOException -> 0x0246 }
                r3.setSoTimeout(r4)     // Catch:{ IOException -> 0x0246 }
            L_0x0222:
                java.net.Socket r3 = r9.f6731k     // Catch:{ IOException -> 0x0246 }
                java.io.InputStream r3 = r3.getInputStream()     // Catch:{ IOException -> 0x0246 }
                int r3 = r3.read()     // Catch:{ IOException -> 0x0246 }
                if (r3 < 0) goto L_0x0238
                long r3 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x0246 }
                long r3 = r3 - r0
                long r5 = (long) r2     // Catch:{ IOException -> 0x0246 }
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 < 0) goto L_0x0222
            L_0x0238:
                java.net.Socket r0 = r9.f6731k     // Catch:{ IOException -> 0x0246 }
                boolean r0 = r0.isClosed()     // Catch:{ IOException -> 0x0246 }
                if (r0 != 0) goto L_0x024e
                java.net.Socket r0 = r9.f6731k     // Catch:{ IOException -> 0x0246 }
                r0.close()     // Catch:{ IOException -> 0x0246 }
                goto L_0x024e
            L_0x0246:
                r0 = move-exception
                e6.c r1 = p126a6.C3980a.f6726d0
                r1.mo36849d(r0)
            L_0x024e:
                return
            L_0x024f:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x024f }
                throw r1
            L_0x0252:
                a6.a r1 = p126a6.C3980a.this
                w5.j r2 = r9.f6730j
                r1.mo42930U0(r2)
                a6.a r1 = p126a6.C3980a.this
                java.util.Set<w5.k> r1 = r1.f6728b0
                monitor-enter(r1)
                a6.a r2 = p126a6.C3980a.this     // Catch:{ all -> 0x02ac }
                java.util.Set<w5.k> r2 = r2.f6728b0     // Catch:{ all -> 0x02ac }
                r2.remove(r9)     // Catch:{ all -> 0x02ac }
                monitor-exit(r1)     // Catch:{ all -> 0x02ac }
                java.net.Socket r1 = r9.f6731k     // Catch:{ IOException -> 0x02a3 }
                boolean r1 = r1.isClosed()     // Catch:{ IOException -> 0x02a3 }
                if (r1 != 0) goto L_0x02ab
                long r1 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x02a3 }
                int r3 = r9.mo39655f()     // Catch:{ IOException -> 0x02a3 }
                java.net.Socket r4 = r9.f6731k     // Catch:{ IOException -> 0x02a3 }
                int r5 = r9.mo39655f()     // Catch:{ IOException -> 0x02a3 }
                r4.setSoTimeout(r5)     // Catch:{ IOException -> 0x02a3 }
            L_0x027f:
                java.net.Socket r4 = r9.f6731k     // Catch:{ IOException -> 0x02a3 }
                java.io.InputStream r4 = r4.getInputStream()     // Catch:{ IOException -> 0x02a3 }
                int r4 = r4.read()     // Catch:{ IOException -> 0x02a3 }
                if (r4 < 0) goto L_0x0295
                long r4 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x02a3 }
                long r4 = r4 - r1
                long r6 = (long) r3     // Catch:{ IOException -> 0x02a3 }
                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r8 < 0) goto L_0x027f
            L_0x0295:
                java.net.Socket r1 = r9.f6731k     // Catch:{ IOException -> 0x02a3 }
                boolean r1 = r1.isClosed()     // Catch:{ IOException -> 0x02a3 }
                if (r1 != 0) goto L_0x02ab
                java.net.Socket r1 = r9.f6731k     // Catch:{ IOException -> 0x02a3 }
                r1.close()     // Catch:{ IOException -> 0x02a3 }
                goto L_0x02ab
            L_0x02a3:
                r1 = move-exception
                e6.c r2 = p126a6.C3980a.f6726d0
                r2.mo36849d(r1)
            L_0x02ab:
                throw r0
            L_0x02ac:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x02ac }
                goto L_0x02b0
            L_0x02af:
                throw r0
            L_0x02b0:
                goto L_0x02af
            */
            throw new UnsupportedOperationException("Method not decompiled: p126a6.C3980a.C3981a.run():void");
        }

        /* renamed from: z */
        public int mo26552z(C11940d dVar) {
            int z = super.mo26552z(dVar);
            if (z < 0) {
                if (!mo39669s()) {
                    mo39663l();
                }
                if (mo39668r()) {
                    close();
                }
            }
            return z;
        }
    }

    /* renamed from: O0 */
    public void mo26538O0(int i) {
        Socket accept = this.f6727a0.accept();
        mo42929T0(accept);
        new C3981a(accept).mo26549c();
    }

    public void close() {
        ServerSocket serverSocket = this.f6727a0;
        if (serverSocket != null) {
            serverSocket.close();
        }
        this.f6727a0 = null;
        this.f6729c0 = -2;
    }

    /* renamed from: e */
    public int mo26540e() {
        return this.f6729c0;
    }

    /* renamed from: g */
    public Object mo26541g() {
        return this.f6727a0;
    }

    /* renamed from: j */
    public void mo26542j(C11950k kVar, C12181o oVar) {
        ((C3981a) kVar).mo39659i(mo42922N() ? this.f22315R : this.f22314Q);
        super.mo26542j(kVar, oVar);
    }

    public void open() {
        ServerSocket serverSocket = this.f6727a0;
        if (serverSocket == null || serverSocket.isClosed()) {
            this.f6727a0 = mo26546q1(mo42932W(), mo42947g1(), mo42933W0());
        }
        this.f6727a0.setReuseAddress(mo42949h1());
        this.f6729c0 = this.f6727a0.getLocalPort();
        if (this.f6729c0 <= 0) {
            throw new IllegalStateException("port not allocated for " + this);
        }
    }

    /* renamed from: p0 */
    public void mo26544p0(Appendable appendable, String str) {
        super.mo26544p0(appendable, str);
        HashSet hashSet = new HashSet();
        synchronized (this.f6728b0) {
            hashSet.addAll(this.f6728b0);
        }
        C8942b.m21357G0(appendable, str, hashSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p1 */
    public C11949j mo26545p1(C11950k kVar) {
        return new C12169e(this, kVar, mo42940c());
    }

    /* access modifiers changed from: protected */
    /* renamed from: q1 */
    public ServerSocket mo26546q1(String str, int i, int i2) {
        return str == null ? new ServerSocket(i, i2) : new ServerSocket(i, i2, InetAddress.getByName(str));
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public void mo26547u0() {
        this.f6728b0.clear();
        super.mo26547u0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v0 */
    public void mo26548v0() {
        super.mo26548v0();
        HashSet<C11950k> hashSet = new HashSet<>();
        synchronized (this.f6728b0) {
            hashSet.addAll(this.f6728b0);
        }
        for (C11950k kVar : hashSet) {
            ((C3981a) kVar).close();
        }
    }
}
