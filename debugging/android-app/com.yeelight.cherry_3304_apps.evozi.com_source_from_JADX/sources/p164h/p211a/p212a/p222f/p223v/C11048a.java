package p164h.p211a.p212a.p222f.p223v;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Set;
import p164h.p211a.p212a.p217d.C10929e;
import p164h.p211a.p212a.p217d.C10940l;
import p164h.p211a.p212a.p217d.C10941m;
import p164h.p211a.p212a.p217d.C10942n;
import p164h.p211a.p212a.p217d.p218u.C10952a;
import p164h.p211a.p212a.p222f.C11008a;
import p164h.p211a.p212a.p222f.C11010b;
import p164h.p211a.p212a.p222f.C11027e;
import p164h.p211a.p212a.p222f.C11037n;
import p164h.p211a.p212a.p228h.p233x.C11146b;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.f.v.a */
public class C11048a extends C11008a {
    /* access modifiers changed from: private */

    /* renamed from: U */
    public static final C11158c f21701U = C11156b.m29015a(C11048a.class);

    /* renamed from: R */
    protected ServerSocket f21702R;

    /* renamed from: S */
    protected final Set<C10942n> f21703S = new HashSet();

    /* renamed from: T */
    protected volatile int f21704T = -1;

    /* renamed from: h.a.a.f.v.a$a */
    protected class C11049a extends C10952a implements Runnable, C10940l {

        /* renamed from: j */
        volatile C10941m f21705j;

        /* renamed from: k */
        protected final Socket f21706k;

        public C11049a(Socket socket) {
            super(socket, C11048a.this.f21521H);
            this.f21705j = C11048a.this.mo35044m1(this);
            this.f21706k = socket;
        }

        /* renamed from: c */
        public void mo35046c() {
            if (C11048a.this.mo34809e1() == null || !C11048a.this.mo34809e1().mo35291e0(this)) {
                C11048a.f21701U.mo35486b("dispatch failed for {}", this.f21705j);
                close();
            }
        }

        public void close() {
            if (this.f21705j instanceof C11010b) {
                ((C11010b) this.f21705j).mo34849v().mo34982y().mo34859d();
            }
            super.close();
        }

        /* renamed from: h */
        public C10941m mo34357h() {
            return this.f21705j;
        }

        /* renamed from: k */
        public void mo34361k(C10941m mVar) {
            if (!(this.f21705j == mVar || this.f21705j == null)) {
                C11048a.this.mo34792R0(this.f21705j, mVar);
            }
            this.f21705j = mVar;
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
                h.a.a.f.v.a r0 = p164h.p211a.p212a.p222f.p223v.C11048a.this     // Catch:{ o -> 0x01df, SocketException -> 0x0175, h -> 0x010a, Exception -> 0x009f }
                h.a.a.d.m r1 = r9.f21705j     // Catch:{ o -> 0x01df, SocketException -> 0x0175, h -> 0x010a, Exception -> 0x009f }
                r0.mo34790Q0(r1)     // Catch:{ o -> 0x01df, SocketException -> 0x0175, h -> 0x010a, Exception -> 0x009f }
                h.a.a.f.v.a r0 = p164h.p211a.p212a.p222f.p223v.C11048a.this     // Catch:{ o -> 0x01df, SocketException -> 0x0175, h -> 0x010a, Exception -> 0x009f }
                java.util.Set<h.a.a.d.n> r0 = r0.f21703S     // Catch:{ o -> 0x01df, SocketException -> 0x0175, h -> 0x010a, Exception -> 0x009f }
                monitor-enter(r0)     // Catch:{ o -> 0x01df, SocketException -> 0x0175, h -> 0x010a, Exception -> 0x009f }
                h.a.a.f.v.a r1 = p164h.p211a.p212a.p222f.p223v.C11048a.this     // Catch:{ all -> 0x0099 }
                java.util.Set<h.a.a.d.n> r1 = r1.f21703S     // Catch:{ all -> 0x0099 }
                r1.add(r9)     // Catch:{ all -> 0x0099 }
                monitor-exit(r0)     // Catch:{ all -> 0x0099 }
            L_0x0014:
                h.a.a.f.v.a r0 = p164h.p211a.p212a.p222f.p223v.C11048a.this     // Catch:{ o -> 0x01df, SocketException -> 0x0175, h -> 0x010a, Exception -> 0x009f }
                boolean r0 = r0.mo35452j0()     // Catch:{ o -> 0x01df, SocketException -> 0x0175, h -> 0x010a, Exception -> 0x009f }
                if (r0 == 0) goto L_0x0044
                boolean r0 = r9.mo34666B()     // Catch:{ o -> 0x01df, SocketException -> 0x0175, h -> 0x010a, Exception -> 0x009f }
                if (r0 != 0) goto L_0x0044
                h.a.a.d.m r0 = r9.f21705j     // Catch:{ o -> 0x01df, SocketException -> 0x0175, h -> 0x010a, Exception -> 0x009f }
                boolean r0 = r0.mo34185a()     // Catch:{ o -> 0x01df, SocketException -> 0x0175, h -> 0x010a, Exception -> 0x009f }
                if (r0 == 0) goto L_0x003b
                h.a.a.f.v.a r0 = p164h.p211a.p212a.p222f.p223v.C11048a.this     // Catch:{ o -> 0x01df, SocketException -> 0x0175, h -> 0x010a, Exception -> 0x009f }
                boolean r0 = r0.mo34786M()     // Catch:{ o -> 0x01df, SocketException -> 0x0175, h -> 0x010a, Exception -> 0x009f }
                if (r0 == 0) goto L_0x003b
                h.a.a.f.v.a r0 = p164h.p211a.p212a.p222f.p223v.C11048a.this     // Catch:{ o -> 0x01df, SocketException -> 0x0175, h -> 0x010a, Exception -> 0x009f }
                int r0 = r0.mo34805b1()     // Catch:{ o -> 0x01df, SocketException -> 0x0175, h -> 0x010a, Exception -> 0x009f }
                r9.mo34360j(r0)     // Catch:{ o -> 0x01df, SocketException -> 0x0175, h -> 0x010a, Exception -> 0x009f }
            L_0x003b:
                h.a.a.d.m r0 = r9.f21705j     // Catch:{ o -> 0x01df, SocketException -> 0x0175, h -> 0x010a, Exception -> 0x009f }
                h.a.a.d.m r0 = r0.mo34225c()     // Catch:{ o -> 0x01df, SocketException -> 0x0175, h -> 0x010a, Exception -> 0x009f }
                r9.f21705j = r0     // Catch:{ o -> 0x01df, SocketException -> 0x0175, h -> 0x010a, Exception -> 0x009f }
                goto L_0x0014
            L_0x0044:
                h.a.a.f.v.a r0 = p164h.p211a.p212a.p222f.p223v.C11048a.this
                h.a.a.d.m r1 = r9.f21705j
                r0.mo34789P0(r1)
                h.a.a.f.v.a r0 = p164h.p211a.p212a.p222f.p223v.C11048a.this
                java.util.Set<h.a.a.d.n> r0 = r0.f21703S
                monitor-enter(r0)
                h.a.a.f.v.a r1 = p164h.p211a.p212a.p222f.p223v.C11048a.this     // Catch:{ all -> 0x0096 }
                java.util.Set<h.a.a.d.n> r1 = r1.f21703S     // Catch:{ all -> 0x0096 }
                r1.remove(r9)     // Catch:{ all -> 0x0096 }
                monitor-exit(r0)     // Catch:{ all -> 0x0096 }
                java.net.Socket r0 = r9.f21706k     // Catch:{ IOException -> 0x0246 }
                boolean r0 = r0.isClosed()     // Catch:{ IOException -> 0x0246 }
                if (r0 != 0) goto L_0x024e
                long r0 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x0246 }
                int r2 = r9.mo34356g()     // Catch:{ IOException -> 0x0246 }
                java.net.Socket r3 = r9.f21706k     // Catch:{ IOException -> 0x0246 }
                int r4 = r9.mo34356g()     // Catch:{ IOException -> 0x0246 }
                r3.setSoTimeout(r4)     // Catch:{ IOException -> 0x0246 }
            L_0x0071:
                java.net.Socket r3 = r9.f21706k     // Catch:{ IOException -> 0x0246 }
                java.io.InputStream r3 = r3.getInputStream()     // Catch:{ IOException -> 0x0246 }
                int r3 = r3.read()     // Catch:{ IOException -> 0x0246 }
                if (r3 < 0) goto L_0x0087
                long r3 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x0246 }
                long r3 = r3 - r0
                long r5 = (long) r2     // Catch:{ IOException -> 0x0246 }
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 < 0) goto L_0x0071
            L_0x0087:
                java.net.Socket r0 = r9.f21706k     // Catch:{ IOException -> 0x0246 }
                boolean r0 = r0.isClosed()     // Catch:{ IOException -> 0x0246 }
                if (r0 != 0) goto L_0x024e
                java.net.Socket r0 = r9.f21706k     // Catch:{ IOException -> 0x0246 }
                r0.close()     // Catch:{ IOException -> 0x0246 }
                goto L_0x024e
            L_0x0096:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0096 }
                throw r1
            L_0x0099:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0099 }
                throw r1     // Catch:{ o -> 0x01df, SocketException -> 0x0175, h -> 0x010a, Exception -> 0x009f }
            L_0x009c:
                r0 = move-exception
                goto L_0x0252
            L_0x009f:
                r0 = move-exception
                h.a.a.h.y.c r1 = p164h.p211a.p212a.p222f.p223v.C11048a.f21701U     // Catch:{ all -> 0x009c }
                java.lang.String r2 = "handle failed?"
                r1.mo35492h(r2, r0)     // Catch:{ all -> 0x009c }
                r9.close()     // Catch:{ IOException -> 0x00ad }
                goto L_0x00b5
            L_0x00ad:
                r0 = move-exception
                h.a.a.h.y.c r1 = p164h.p211a.p212a.p222f.p223v.C11048a.f21701U     // Catch:{ all -> 0x009c }
                r1.mo35488d(r0)     // Catch:{ all -> 0x009c }
            L_0x00b5:
                h.a.a.f.v.a r0 = p164h.p211a.p212a.p222f.p223v.C11048a.this
                h.a.a.d.m r1 = r9.f21705j
                r0.mo34789P0(r1)
                h.a.a.f.v.a r0 = p164h.p211a.p212a.p222f.p223v.C11048a.this
                java.util.Set<h.a.a.d.n> r0 = r0.f21703S
                monitor-enter(r0)
                h.a.a.f.v.a r1 = p164h.p211a.p212a.p222f.p223v.C11048a.this     // Catch:{ all -> 0x0107 }
                java.util.Set<h.a.a.d.n> r1 = r1.f21703S     // Catch:{ all -> 0x0107 }
                r1.remove(r9)     // Catch:{ all -> 0x0107 }
                monitor-exit(r0)     // Catch:{ all -> 0x0107 }
                java.net.Socket r0 = r9.f21706k     // Catch:{ IOException -> 0x0246 }
                boolean r0 = r0.isClosed()     // Catch:{ IOException -> 0x0246 }
                if (r0 != 0) goto L_0x024e
                long r0 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x0246 }
                int r2 = r9.mo34356g()     // Catch:{ IOException -> 0x0246 }
                java.net.Socket r3 = r9.f21706k     // Catch:{ IOException -> 0x0246 }
                int r4 = r9.mo34356g()     // Catch:{ IOException -> 0x0246 }
                r3.setSoTimeout(r4)     // Catch:{ IOException -> 0x0246 }
            L_0x00e2:
                java.net.Socket r3 = r9.f21706k     // Catch:{ IOException -> 0x0246 }
                java.io.InputStream r3 = r3.getInputStream()     // Catch:{ IOException -> 0x0246 }
                int r3 = r3.read()     // Catch:{ IOException -> 0x0246 }
                if (r3 < 0) goto L_0x00f8
                long r3 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x0246 }
                long r3 = r3 - r0
                long r5 = (long) r2     // Catch:{ IOException -> 0x0246 }
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 < 0) goto L_0x00e2
            L_0x00f8:
                java.net.Socket r0 = r9.f21706k     // Catch:{ IOException -> 0x0246 }
                boolean r0 = r0.isClosed()     // Catch:{ IOException -> 0x0246 }
                if (r0 != 0) goto L_0x024e
                java.net.Socket r0 = r9.f21706k     // Catch:{ IOException -> 0x0246 }
                r0.close()     // Catch:{ IOException -> 0x0246 }
                goto L_0x024e
            L_0x0107:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0107 }
                throw r1
            L_0x010a:
                r0 = move-exception
                h.a.a.h.y.c r1 = p164h.p211a.p212a.p222f.p223v.C11048a.f21701U     // Catch:{ all -> 0x009c }
                java.lang.String r2 = "BAD"
                r1.mo35493i(r2, r0)     // Catch:{ all -> 0x009c }
                r9.close()     // Catch:{ IOException -> 0x0118 }
                goto L_0x0120
            L_0x0118:
                r0 = move-exception
                h.a.a.h.y.c r1 = p164h.p211a.p212a.p222f.p223v.C11048a.f21701U     // Catch:{ all -> 0x009c }
                r1.mo35488d(r0)     // Catch:{ all -> 0x009c }
            L_0x0120:
                h.a.a.f.v.a r0 = p164h.p211a.p212a.p222f.p223v.C11048a.this
                h.a.a.d.m r1 = r9.f21705j
                r0.mo34789P0(r1)
                h.a.a.f.v.a r0 = p164h.p211a.p212a.p222f.p223v.C11048a.this
                java.util.Set<h.a.a.d.n> r0 = r0.f21703S
                monitor-enter(r0)
                h.a.a.f.v.a r1 = p164h.p211a.p212a.p222f.p223v.C11048a.this     // Catch:{ all -> 0x0172 }
                java.util.Set<h.a.a.d.n> r1 = r1.f21703S     // Catch:{ all -> 0x0172 }
                r1.remove(r9)     // Catch:{ all -> 0x0172 }
                monitor-exit(r0)     // Catch:{ all -> 0x0172 }
                java.net.Socket r0 = r9.f21706k     // Catch:{ IOException -> 0x0246 }
                boolean r0 = r0.isClosed()     // Catch:{ IOException -> 0x0246 }
                if (r0 != 0) goto L_0x024e
                long r0 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x0246 }
                int r2 = r9.mo34356g()     // Catch:{ IOException -> 0x0246 }
                java.net.Socket r3 = r9.f21706k     // Catch:{ IOException -> 0x0246 }
                int r4 = r9.mo34356g()     // Catch:{ IOException -> 0x0246 }
                r3.setSoTimeout(r4)     // Catch:{ IOException -> 0x0246 }
            L_0x014d:
                java.net.Socket r3 = r9.f21706k     // Catch:{ IOException -> 0x0246 }
                java.io.InputStream r3 = r3.getInputStream()     // Catch:{ IOException -> 0x0246 }
                int r3 = r3.read()     // Catch:{ IOException -> 0x0246 }
                if (r3 < 0) goto L_0x0163
                long r3 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x0246 }
                long r3 = r3 - r0
                long r5 = (long) r2     // Catch:{ IOException -> 0x0246 }
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 < 0) goto L_0x014d
            L_0x0163:
                java.net.Socket r0 = r9.f21706k     // Catch:{ IOException -> 0x0246 }
                boolean r0 = r0.isClosed()     // Catch:{ IOException -> 0x0246 }
                if (r0 != 0) goto L_0x024e
                java.net.Socket r0 = r9.f21706k     // Catch:{ IOException -> 0x0246 }
                r0.close()     // Catch:{ IOException -> 0x0246 }
                goto L_0x024e
            L_0x0172:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0172 }
                throw r1
            L_0x0175:
                r0 = move-exception
                h.a.a.h.y.c r1 = p164h.p211a.p212a.p222f.p223v.C11048a.f21701U     // Catch:{ all -> 0x009c }
                java.lang.String r2 = "EOF"
                r1.mo35493i(r2, r0)     // Catch:{ all -> 0x009c }
                r9.close()     // Catch:{ IOException -> 0x0183 }
                goto L_0x018b
            L_0x0183:
                r0 = move-exception
                h.a.a.h.y.c r1 = p164h.p211a.p212a.p222f.p223v.C11048a.f21701U     // Catch:{ all -> 0x009c }
                r1.mo35488d(r0)     // Catch:{ all -> 0x009c }
            L_0x018b:
                h.a.a.f.v.a r0 = p164h.p211a.p212a.p222f.p223v.C11048a.this
                h.a.a.d.m r1 = r9.f21705j
                r0.mo34789P0(r1)
                h.a.a.f.v.a r0 = p164h.p211a.p212a.p222f.p223v.C11048a.this
                java.util.Set<h.a.a.d.n> r0 = r0.f21703S
                monitor-enter(r0)
                h.a.a.f.v.a r1 = p164h.p211a.p212a.p222f.p223v.C11048a.this     // Catch:{ all -> 0x01dc }
                java.util.Set<h.a.a.d.n> r1 = r1.f21703S     // Catch:{ all -> 0x01dc }
                r1.remove(r9)     // Catch:{ all -> 0x01dc }
                monitor-exit(r0)     // Catch:{ all -> 0x01dc }
                java.net.Socket r0 = r9.f21706k     // Catch:{ IOException -> 0x0246 }
                boolean r0 = r0.isClosed()     // Catch:{ IOException -> 0x0246 }
                if (r0 != 0) goto L_0x024e
                long r0 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x0246 }
                int r2 = r9.mo34356g()     // Catch:{ IOException -> 0x0246 }
                java.net.Socket r3 = r9.f21706k     // Catch:{ IOException -> 0x0246 }
                int r4 = r9.mo34356g()     // Catch:{ IOException -> 0x0246 }
                r3.setSoTimeout(r4)     // Catch:{ IOException -> 0x0246 }
            L_0x01b8:
                java.net.Socket r3 = r9.f21706k     // Catch:{ IOException -> 0x0246 }
                java.io.InputStream r3 = r3.getInputStream()     // Catch:{ IOException -> 0x0246 }
                int r3 = r3.read()     // Catch:{ IOException -> 0x0246 }
                if (r3 < 0) goto L_0x01ce
                long r3 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x0246 }
                long r3 = r3 - r0
                long r5 = (long) r2     // Catch:{ IOException -> 0x0246 }
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 < 0) goto L_0x01b8
            L_0x01ce:
                java.net.Socket r0 = r9.f21706k     // Catch:{ IOException -> 0x0246 }
                boolean r0 = r0.isClosed()     // Catch:{ IOException -> 0x0246 }
                if (r0 != 0) goto L_0x024e
                java.net.Socket r0 = r9.f21706k     // Catch:{ IOException -> 0x0246 }
                r0.close()     // Catch:{ IOException -> 0x0246 }
                goto L_0x024e
            L_0x01dc:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x01dc }
                throw r1
            L_0x01df:
                r0 = move-exception
                h.a.a.h.y.c r1 = p164h.p211a.p212a.p222f.p223v.C11048a.f21701U     // Catch:{ all -> 0x009c }
                java.lang.String r2 = "EOF"
                r1.mo35493i(r2, r0)     // Catch:{ all -> 0x009c }
                r9.close()     // Catch:{ IOException -> 0x01ed }
                goto L_0x01f5
            L_0x01ed:
                r0 = move-exception
                h.a.a.h.y.c r1 = p164h.p211a.p212a.p222f.p223v.C11048a.f21701U     // Catch:{ all -> 0x009c }
                r1.mo35488d(r0)     // Catch:{ all -> 0x009c }
            L_0x01f5:
                h.a.a.f.v.a r0 = p164h.p211a.p212a.p222f.p223v.C11048a.this
                h.a.a.d.m r1 = r9.f21705j
                r0.mo34789P0(r1)
                h.a.a.f.v.a r0 = p164h.p211a.p212a.p222f.p223v.C11048a.this
                java.util.Set<h.a.a.d.n> r0 = r0.f21703S
                monitor-enter(r0)
                h.a.a.f.v.a r1 = p164h.p211a.p212a.p222f.p223v.C11048a.this     // Catch:{ all -> 0x024f }
                java.util.Set<h.a.a.d.n> r1 = r1.f21703S     // Catch:{ all -> 0x024f }
                r1.remove(r9)     // Catch:{ all -> 0x024f }
                monitor-exit(r0)     // Catch:{ all -> 0x024f }
                java.net.Socket r0 = r9.f21706k     // Catch:{ IOException -> 0x0246 }
                boolean r0 = r0.isClosed()     // Catch:{ IOException -> 0x0246 }
                if (r0 != 0) goto L_0x024e
                long r0 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x0246 }
                int r2 = r9.mo34356g()     // Catch:{ IOException -> 0x0246 }
                java.net.Socket r3 = r9.f21706k     // Catch:{ IOException -> 0x0246 }
                int r4 = r9.mo34356g()     // Catch:{ IOException -> 0x0246 }
                r3.setSoTimeout(r4)     // Catch:{ IOException -> 0x0246 }
            L_0x0222:
                java.net.Socket r3 = r9.f21706k     // Catch:{ IOException -> 0x0246 }
                java.io.InputStream r3 = r3.getInputStream()     // Catch:{ IOException -> 0x0246 }
                int r3 = r3.read()     // Catch:{ IOException -> 0x0246 }
                if (r3 < 0) goto L_0x0238
                long r3 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x0246 }
                long r3 = r3 - r0
                long r5 = (long) r2     // Catch:{ IOException -> 0x0246 }
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 < 0) goto L_0x0222
            L_0x0238:
                java.net.Socket r0 = r9.f21706k     // Catch:{ IOException -> 0x0246 }
                boolean r0 = r0.isClosed()     // Catch:{ IOException -> 0x0246 }
                if (r0 != 0) goto L_0x024e
                java.net.Socket r0 = r9.f21706k     // Catch:{ IOException -> 0x0246 }
                r0.close()     // Catch:{ IOException -> 0x0246 }
                goto L_0x024e
            L_0x0246:
                r0 = move-exception
                h.a.a.h.y.c r1 = p164h.p211a.p212a.p222f.p223v.C11048a.f21701U
                r1.mo35488d(r0)
            L_0x024e:
                return
            L_0x024f:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x024f }
                throw r1
            L_0x0252:
                h.a.a.f.v.a r1 = p164h.p211a.p212a.p222f.p223v.C11048a.this
                h.a.a.d.m r2 = r9.f21705j
                r1.mo34789P0(r2)
                h.a.a.f.v.a r1 = p164h.p211a.p212a.p222f.p223v.C11048a.this
                java.util.Set<h.a.a.d.n> r1 = r1.f21703S
                monitor-enter(r1)
                h.a.a.f.v.a r2 = p164h.p211a.p212a.p222f.p223v.C11048a.this     // Catch:{ all -> 0x02ac }
                java.util.Set<h.a.a.d.n> r2 = r2.f21703S     // Catch:{ all -> 0x02ac }
                r2.remove(r9)     // Catch:{ all -> 0x02ac }
                monitor-exit(r1)     // Catch:{ all -> 0x02ac }
                java.net.Socket r1 = r9.f21706k     // Catch:{ IOException -> 0x02a3 }
                boolean r1 = r1.isClosed()     // Catch:{ IOException -> 0x02a3 }
                if (r1 != 0) goto L_0x02ab
                long r1 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x02a3 }
                int r3 = r9.mo34356g()     // Catch:{ IOException -> 0x02a3 }
                java.net.Socket r4 = r9.f21706k     // Catch:{ IOException -> 0x02a3 }
                int r5 = r9.mo34356g()     // Catch:{ IOException -> 0x02a3 }
                r4.setSoTimeout(r5)     // Catch:{ IOException -> 0x02a3 }
            L_0x027f:
                java.net.Socket r4 = r9.f21706k     // Catch:{ IOException -> 0x02a3 }
                java.io.InputStream r4 = r4.getInputStream()     // Catch:{ IOException -> 0x02a3 }
                int r4 = r4.read()     // Catch:{ IOException -> 0x02a3 }
                if (r4 < 0) goto L_0x0295
                long r4 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x02a3 }
                long r4 = r4 - r1
                long r6 = (long) r3     // Catch:{ IOException -> 0x02a3 }
                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r8 < 0) goto L_0x027f
            L_0x0295:
                java.net.Socket r1 = r9.f21706k     // Catch:{ IOException -> 0x02a3 }
                boolean r1 = r1.isClosed()     // Catch:{ IOException -> 0x02a3 }
                if (r1 != 0) goto L_0x02ab
                java.net.Socket r1 = r9.f21706k     // Catch:{ IOException -> 0x02a3 }
                r1.close()     // Catch:{ IOException -> 0x02a3 }
                goto L_0x02ab
            L_0x02a3:
                r1 = move-exception
                h.a.a.h.y.c r2 = p164h.p211a.p212a.p222f.p223v.C11048a.f21701U
                r2.mo35488d(r1)
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
            throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p222f.p223v.C11048a.C11049a.run():void");
        }

        /* renamed from: w */
        public int mo34374w(C10929e eVar) {
            int w = super.mo34374w(eVar);
            if (w < 0) {
                if (!mo34369s()) {
                    mo34362l();
                }
                if (mo34368r()) {
                    close();
                }
            }
            return w;
        }
    }

    /* renamed from: H */
    public void mo34783H(C10942n nVar, C11037n nVar2) {
        ((C11049a) nVar).mo34360j(mo34786M() ? this.f21522I : this.f21521H);
        super.mo34783H(nVar, nVar2);
    }

    /* renamed from: J0 */
    public void mo34785J0(int i) {
        Socket accept = this.f21702R.accept();
        mo34788O0(accept);
        new C11049a(accept).mo35046c();
    }

    public void close() {
        ServerSocket serverSocket = this.f21702R;
        if (serverSocket != null) {
            serverSocket.close();
        }
        this.f21702R = null;
        this.f21704T = -2;
    }

    /* renamed from: f */
    public int mo34891f() {
        return this.f21704T;
    }

    /* renamed from: h */
    public Object mo34892h() {
        return this.f21702R;
    }

    /* renamed from: k0 */
    public void mo34187k0(Appendable appendable, String str) {
        super.mo34187k0(appendable, str);
        HashSet hashSet = new HashSet();
        synchronized (this.f21703S) {
            hashSet.addAll(this.f21703S);
        }
        C11146b.m28976B0(appendable, str, hashSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m1 */
    public C10941m mo35044m1(C10942n nVar) {
        return new C11027e(this, nVar, mo34807d());
    }

    /* access modifiers changed from: protected */
    /* renamed from: n1 */
    public ServerSocket mo35045n1(String str, int i, int i2) {
        return str == null ? new ServerSocket(i, i2) : new ServerSocket(i, i2, InetAddress.getByName(str));
    }

    public void open() {
        ServerSocket serverSocket = this.f21702R;
        if (serverSocket == null || serverSocket.isClosed()) {
            this.f21702R = mo35045n1(mo34797V(), mo34806c1(), mo34794S0());
        }
        this.f21702R.setReuseAddress(mo34808d1());
        this.f21704T = this.f21702R.getLocalPort();
        if (this.f21704T <= 0) {
            throw new IllegalStateException("port not allocated for " + this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public void mo34262p0() {
        this.f21703S.clear();
        super.mo34262p0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q0 */
    public void mo34263q0() {
        super.mo34263q0();
        HashSet<C10942n> hashSet = new HashSet<>();
        synchronized (this.f21703S) {
            hashSet.addAll(this.f21703S);
        }
        for (C10942n nVar : hashSet) {
            ((C11049a) nVar).close();
        }
    }
}
