package p236z2;

import android.support.p004v4.media.session.PlaybackStateCompat;
import com.squareup.okhttp.internal.framed.ErrorCode;
import com.squareup.okhttp.internal.framed.HeadersMode;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import okio.C3560a;
import okio.C3564c;
import okio.C9838e;
import okio.C9852q;
import okio.C9853r;
import okio.C9854s;

/* renamed from: z2.d */
public final class C12112d {

    /* renamed from: a */
    long f22217a = 0;

    /* renamed from: b */
    long f22218b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final int f22219c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C12100c f22220d;

    /* renamed from: e */
    private final List<C12117e> f22221e;

    /* renamed from: f */
    private List<C12117e> f22222f;

    /* renamed from: g */
    private final C12115c f22223g;

    /* renamed from: h */
    final C12114b f22224h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C12116d f22225i = new C12116d();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C12116d f22226j = new C12116d();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public ErrorCode f22227k = null;

    /* renamed from: z2.d$b */
    final class C12114b implements C9852q {

        /* renamed from: a */
        private final C3564c f22228a = new C3564c();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f22229b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f22230c;

        C12114b() {
        }

        /* JADX INFO: finally extract failed */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            p236z2.C12112d.m31341b(r11.f22231d).mo42869u();
            p236z2.C12112d.m31342c(r11.f22231d);
            r9 = java.lang.Math.min(r11.f22231d.f22218b, r11.f22228a.mo24758i1());
            r1 = r11.f22231d;
            r1.f22218b -= r9;
         */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m31369f(boolean r12) {
            /*
                r11 = this;
                z2.d r0 = p236z2.C12112d.this
                monitor-enter(r0)
                z2.d r1 = p236z2.C12112d.this     // Catch:{ all -> 0x0097 }
                z2.d$d r1 = r1.f22226j     // Catch:{ all -> 0x0097 }
                r1.mo24712k()     // Catch:{ all -> 0x0097 }
            L_0x000c:
                z2.d r1 = p236z2.C12112d.this     // Catch:{ all -> 0x008c }
                long r2 = r1.f22218b     // Catch:{ all -> 0x008c }
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 > 0) goto L_0x002a
                boolean r2 = r11.f22230c     // Catch:{ all -> 0x008c }
                if (r2 != 0) goto L_0x002a
                boolean r2 = r11.f22229b     // Catch:{ all -> 0x008c }
                if (r2 != 0) goto L_0x002a
                com.squareup.okhttp.internal.framed.ErrorCode r1 = r1.f22227k     // Catch:{ all -> 0x008c }
                if (r1 != 0) goto L_0x002a
                z2.d r1 = p236z2.C12112d.this     // Catch:{ all -> 0x008c }
                r1.m31351z()     // Catch:{ all -> 0x008c }
                goto L_0x000c
            L_0x002a:
                z2.d r1 = p236z2.C12112d.this     // Catch:{ all -> 0x0097 }
                z2.d$d r1 = r1.f22226j     // Catch:{ all -> 0x0097 }
                r1.mo42869u()     // Catch:{ all -> 0x0097 }
                z2.d r1 = p236z2.C12112d.this     // Catch:{ all -> 0x0097 }
                r1.m31349k()     // Catch:{ all -> 0x0097 }
                z2.d r1 = p236z2.C12112d.this     // Catch:{ all -> 0x0097 }
                long r1 = r1.f22218b     // Catch:{ all -> 0x0097 }
                okio.c r3 = r11.f22228a     // Catch:{ all -> 0x0097 }
                long r3 = r3.mo24758i1()     // Catch:{ all -> 0x0097 }
                long r9 = java.lang.Math.min(r1, r3)     // Catch:{ all -> 0x0097 }
                z2.d r1 = p236z2.C12112d.this     // Catch:{ all -> 0x0097 }
                long r2 = r1.f22218b     // Catch:{ all -> 0x0097 }
                long r2 = r2 - r9
                r1.f22218b = r2     // Catch:{ all -> 0x0097 }
                monitor-exit(r0)     // Catch:{ all -> 0x0097 }
                z2.d$d r0 = r1.f22226j
                r0.mo24712k()
                z2.d r0 = p236z2.C12112d.this     // Catch:{ all -> 0x0081 }
                z2.c r5 = r0.f22220d     // Catch:{ all -> 0x0081 }
                z2.d r0 = p236z2.C12112d.this     // Catch:{ all -> 0x0081 }
                int r6 = r0.f22219c     // Catch:{ all -> 0x0081 }
                if (r12 == 0) goto L_0x0070
                okio.c r12 = r11.f22228a     // Catch:{ all -> 0x0081 }
                long r0 = r12.mo24758i1()     // Catch:{ all -> 0x0081 }
                int r12 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r12 != 0) goto L_0x0070
                r12 = 1
                r7 = 1
                goto L_0x0072
            L_0x0070:
                r12 = 0
                r7 = 0
            L_0x0072:
                okio.c r8 = r11.f22228a     // Catch:{ all -> 0x0081 }
                r5.mo42850w0(r6, r7, r8, r9)     // Catch:{ all -> 0x0081 }
                z2.d r12 = p236z2.C12112d.this
                z2.d$d r12 = r12.f22226j
                r12.mo42869u()
                return
            L_0x0081:
                r12 = move-exception
                z2.d r0 = p236z2.C12112d.this
                z2.d$d r0 = r0.f22226j
                r0.mo42869u()
                throw r12
            L_0x008c:
                r12 = move-exception
                z2.d r1 = p236z2.C12112d.this     // Catch:{ all -> 0x0097 }
                z2.d$d r1 = r1.f22226j     // Catch:{ all -> 0x0097 }
                r1.mo42869u()     // Catch:{ all -> 0x0097 }
                throw r12     // Catch:{ all -> 0x0097 }
            L_0x0097:
                r12 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0097 }
                goto L_0x009b
            L_0x009a:
                throw r12
            L_0x009b:
                goto L_0x009a
            */
            throw new UnsupportedOperationException("Method not decompiled: p236z2.C12112d.C12114b.m31369f(boolean):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
            if (r8.f22228a.mo24758i1() <= 0) goto L_0x002d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
            if (r8.f22228a.mo24758i1() <= 0) goto L_0x0040;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
            m31369f(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
            p236z2.C12112d.m31343d(r8.f22231d).mo42850w0(p236z2.C12112d.m31344e(r8.f22231d), true, (okio.C3564c) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
            r2 = r8.f22231d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r8.f22229b = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
            p236z2.C12112d.m31343d(r8.f22231d).flush();
            p236z2.C12112d.m31340a(r8.f22231d);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
            if (r8.f22231d.f22224h.f22230c != false) goto L_0x0040;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() {
            /*
                r8 = this;
                z2.d r0 = p236z2.C12112d.this
                monitor-enter(r0)
                boolean r1 = r8.f22229b     // Catch:{ all -> 0x0058 }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x0058 }
                return
            L_0x0009:
                monitor-exit(r0)     // Catch:{ all -> 0x0058 }
                z2.d r0 = p236z2.C12112d.this
                z2.d$b r0 = r0.f22224h
                boolean r0 = r0.f22230c
                r1 = 1
                if (r0 != 0) goto L_0x0040
                okio.c r0 = r8.f22228a
                long r2 = r0.mo24758i1()
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x002d
            L_0x001f:
                okio.c r0 = r8.f22228a
                long r2 = r0.mo24758i1()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x0040
                r8.m31369f(r1)
                goto L_0x001f
            L_0x002d:
                z2.d r0 = p236z2.C12112d.this
                z2.c r2 = r0.f22220d
                z2.d r0 = p236z2.C12112d.this
                int r3 = r0.f22219c
                r4 = 1
                r5 = 0
                r6 = 0
                r2.mo42850w0(r3, r4, r5, r6)
            L_0x0040:
                z2.d r2 = p236z2.C12112d.this
                monitor-enter(r2)
                r8.f22229b = r1     // Catch:{ all -> 0x0055 }
                monitor-exit(r2)     // Catch:{ all -> 0x0055 }
                z2.d r0 = p236z2.C12112d.this
                z2.c r0 = r0.f22220d
                r0.flush()
                z2.d r0 = p236z2.C12112d.this
                r0.m31348j()
                return
            L_0x0055:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0055 }
                throw r0
            L_0x0058:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0058 }
                goto L_0x005c
            L_0x005b:
                throw r1
            L_0x005c:
                goto L_0x005b
            */
            throw new UnsupportedOperationException("Method not decompiled: p236z2.C12112d.C12114b.close():void");
        }

        public void flush() {
            synchronized (C12112d.this) {
                C12112d.this.m31349k();
            }
            while (this.f22228a.mo24758i1() > 0) {
                m31369f(false);
                C12112d.this.f22220d.flush();
            }
        }

        /* renamed from: j */
        public C9854s mo24475j() {
            return C12112d.this.f22226j;
        }

        /* renamed from: q0 */
        public void mo24476q0(C3564c cVar, long j) {
            this.f22228a.mo24476q0(cVar, j);
            while (this.f22228a.mo24758i1() >= PlaybackStateCompat.ACTION_PREPARE) {
                m31369f(false);
            }
        }
    }

    /* renamed from: z2.d$c */
    private final class C12115c implements C9853r {

        /* renamed from: a */
        private final C3564c f22232a;

        /* renamed from: b */
        private final C3564c f22233b;

        /* renamed from: c */
        private final long f22234c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public boolean f22235d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public boolean f22236e;

        private C12115c(long j) {
            this.f22232a = new C3564c();
            this.f22233b = new C3564c();
            this.f22234c = j;
        }

        /* renamed from: f */
        private void m31375f() {
            if (this.f22235d) {
                throw new IOException("stream closed");
            } else if (C12112d.this.f22227k != null) {
                throw new IOException("stream was reset: " + C12112d.this.f22227k);
            }
        }

        /* renamed from: i */
        private void m31376i() {
            C12112d.this.f22225i.mo24712k();
            while (this.f22233b.mo24758i1() == 0 && !this.f22236e && !this.f22235d && C12112d.this.f22227k == null) {
                try {
                    C12112d.this.m31351z();
                } finally {
                    C12112d.this.f22225i.mo42869u();
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x005d, code lost:
            r11 = p236z2.C12112d.m31343d(r8.f22237f);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0063, code lost:
            monitor-enter(r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            p236z2.C12112d.m31343d(r8.f22237f).f22169m += r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0088, code lost:
            if (p236z2.C12112d.m31343d(r8.f22237f).f22169m < ((long) (p236z2.C12112d.m31343d(r8.f22237f).f22171o.mo42904e(65536) / 2))) goto L_0x00a4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x008a, code lost:
            p236z2.C12112d.m31343d(r8.f22237f).mo42838D0(0, p236z2.C12112d.m31343d(r8.f22237f).f22169m);
            p236z2.C12112d.m31343d(r8.f22237f).f22169m = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a4, code lost:
            monitor-exit(r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a5, code lost:
            return r9;
         */
        /* renamed from: R0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo24477R0(okio.C3564c r9, long r10) {
            /*
                r8 = this;
                r0 = 0
                int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r2 < 0) goto L_0x00ac
                z2.d r2 = p236z2.C12112d.this
                monitor-enter(r2)
                r8.m31376i()     // Catch:{ all -> 0x00a9 }
                r8.m31375f()     // Catch:{ all -> 0x00a9 }
                okio.c r3 = r8.f22233b     // Catch:{ all -> 0x00a9 }
                long r3 = r3.mo24758i1()     // Catch:{ all -> 0x00a9 }
                int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r5 != 0) goto L_0x001d
                r9 = -1
                monitor-exit(r2)     // Catch:{ all -> 0x00a9 }
                return r9
            L_0x001d:
                okio.c r3 = r8.f22233b     // Catch:{ all -> 0x00a9 }
                long r4 = r3.mo24758i1()     // Catch:{ all -> 0x00a9 }
                long r10 = java.lang.Math.min(r10, r4)     // Catch:{ all -> 0x00a9 }
                long r9 = r3.mo24477R0(r9, r10)     // Catch:{ all -> 0x00a9 }
                z2.d r11 = p236z2.C12112d.this     // Catch:{ all -> 0x00a9 }
                long r3 = r11.f22217a     // Catch:{ all -> 0x00a9 }
                long r3 = r3 + r9
                r11.f22217a = r3     // Catch:{ all -> 0x00a9 }
                z2.c r11 = r11.f22220d     // Catch:{ all -> 0x00a9 }
                z2.m r11 = r11.f22171o     // Catch:{ all -> 0x00a9 }
                r5 = 65536(0x10000, float:9.18355E-41)
                int r11 = r11.mo42904e(r5)     // Catch:{ all -> 0x00a9 }
                int r11 = r11 / 2
                long r6 = (long) r11     // Catch:{ all -> 0x00a9 }
                int r11 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                if (r11 < 0) goto L_0x005c
                z2.d r11 = p236z2.C12112d.this     // Catch:{ all -> 0x00a9 }
                z2.c r11 = r11.f22220d     // Catch:{ all -> 0x00a9 }
                z2.d r3 = p236z2.C12112d.this     // Catch:{ all -> 0x00a9 }
                int r3 = r3.f22219c     // Catch:{ all -> 0x00a9 }
                z2.d r4 = p236z2.C12112d.this     // Catch:{ all -> 0x00a9 }
                long r6 = r4.f22217a     // Catch:{ all -> 0x00a9 }
                r11.mo42838D0(r3, r6)     // Catch:{ all -> 0x00a9 }
                z2.d r11 = p236z2.C12112d.this     // Catch:{ all -> 0x00a9 }
                r11.f22217a = r0     // Catch:{ all -> 0x00a9 }
            L_0x005c:
                monitor-exit(r2)     // Catch:{ all -> 0x00a9 }
                z2.d r11 = p236z2.C12112d.this
                z2.c r11 = r11.f22220d
                monitor-enter(r11)
                z2.d r2 = p236z2.C12112d.this     // Catch:{ all -> 0x00a6 }
                z2.c r2 = r2.f22220d     // Catch:{ all -> 0x00a6 }
                long r3 = r2.f22169m     // Catch:{ all -> 0x00a6 }
                long r3 = r3 + r9
                r2.f22169m = r3     // Catch:{ all -> 0x00a6 }
                z2.d r2 = p236z2.C12112d.this     // Catch:{ all -> 0x00a6 }
                z2.c r2 = r2.f22220d     // Catch:{ all -> 0x00a6 }
                long r2 = r2.f22169m     // Catch:{ all -> 0x00a6 }
                z2.d r4 = p236z2.C12112d.this     // Catch:{ all -> 0x00a6 }
                z2.c r4 = r4.f22220d     // Catch:{ all -> 0x00a6 }
                z2.m r4 = r4.f22171o     // Catch:{ all -> 0x00a6 }
                int r4 = r4.mo42904e(r5)     // Catch:{ all -> 0x00a6 }
                int r4 = r4 / 2
                long r4 = (long) r4     // Catch:{ all -> 0x00a6 }
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 < 0) goto L_0x00a4
                z2.d r2 = p236z2.C12112d.this     // Catch:{ all -> 0x00a6 }
                z2.c r2 = r2.f22220d     // Catch:{ all -> 0x00a6 }
                r3 = 0
                z2.d r4 = p236z2.C12112d.this     // Catch:{ all -> 0x00a6 }
                z2.c r4 = r4.f22220d     // Catch:{ all -> 0x00a6 }
                long r4 = r4.f22169m     // Catch:{ all -> 0x00a6 }
                r2.mo42838D0(r3, r4)     // Catch:{ all -> 0x00a6 }
                z2.d r2 = p236z2.C12112d.this     // Catch:{ all -> 0x00a6 }
                z2.c r2 = r2.f22220d     // Catch:{ all -> 0x00a6 }
                r2.f22169m = r0     // Catch:{ all -> 0x00a6 }
            L_0x00a4:
                monitor-exit(r11)     // Catch:{ all -> 0x00a6 }
                return r9
            L_0x00a6:
                r9 = move-exception
                monitor-exit(r11)     // Catch:{ all -> 0x00a6 }
                throw r9
            L_0x00a9:
                r9 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x00a9 }
                throw r9
            L_0x00ac:
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "byteCount < 0: "
                r0.append(r1)
                r0.append(r10)
                java.lang.String r10 = r0.toString()
                r9.<init>(r10)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p236z2.C12112d.C12115c.mo24477R0(okio.c, long):long");
        }

        public void close() {
            synchronized (C12112d.this) {
                this.f22235d = true;
                this.f22233b.clear();
                C12112d.this.notifyAll();
            }
            C12112d.this.m31348j();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo42868h(C9838e eVar, long j) {
            boolean z;
            boolean z2;
            boolean z3;
            while (j > 0) {
                synchronized (C12112d.this) {
                    z = this.f22236e;
                    z2 = true;
                    z3 = this.f22233b.mo24758i1() + j > this.f22234c;
                }
                if (z3) {
                    eVar.skip(j);
                    C12112d.this.mo42856n(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                } else if (z) {
                    eVar.skip(j);
                    return;
                } else {
                    long R0 = eVar.mo24477R0(this.f22232a, j);
                    if (R0 != -1) {
                        j -= R0;
                        synchronized (C12112d.this) {
                            if (this.f22233b.mo24758i1() != 0) {
                                z2 = false;
                            }
                            this.f22233b.mo24781s0(this.f22232a);
                            if (z2) {
                                C12112d.this.notifyAll();
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
        }

        /* renamed from: j */
        public C9854s mo24479j() {
            return C12112d.this.f22225i;
        }
    }

    /* renamed from: z2.d$d */
    class C12116d extends C3560a {
        C12116d() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: o */
        public IOException mo24480o(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* access modifiers changed from: protected */
        /* renamed from: t */
        public void mo24481t() {
            C12112d.this.mo42856n(ErrorCode.CANCEL);
        }

        /* renamed from: u */
        public void mo42869u() {
            if (mo24715n()) {
                throw mo24480o((IOException) null);
            }
        }
    }

    C12112d(int i, C12100c cVar, boolean z, boolean z2, List<C12117e> list) {
        Objects.requireNonNull(cVar, "connection == null");
        Objects.requireNonNull(list, "requestHeaders == null");
        this.f22219c = i;
        this.f22220d = cVar;
        this.f22218b = (long) cVar.f22172p.mo42904e(65536);
        C12115c cVar2 = new C12115c((long) cVar.f22171o.mo42904e(65536));
        this.f22223g = cVar2;
        C12114b bVar = new C12114b();
        this.f22224h = bVar;
        boolean unused = cVar2.f22236e = z2;
        boolean unused2 = bVar.f22230c = z;
        this.f22221e = list;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m31348j() {
        boolean z;
        boolean t;
        synchronized (this) {
            z = !this.f22223g.f22236e && this.f22223g.f22235d && (this.f22224h.f22230c || this.f22224h.f22229b);
            t = mo42862t();
        }
        if (z) {
            mo42855l(ErrorCode.CANCEL);
        } else if (!t) {
            this.f22220d.mo42847p0(this.f22219c);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m31349k() {
        if (this.f22224h.f22229b) {
            throw new IOException("stream closed");
        } else if (this.f22224h.f22230c) {
            throw new IOException("stream finished");
        } else if (this.f22227k != null) {
            throw new IOException("stream was reset: " + this.f22227k);
        }
    }

    /* renamed from: m */
    private boolean m31350m(ErrorCode errorCode) {
        synchronized (this) {
            if (this.f22227k != null) {
                return false;
            }
            if (this.f22223g.f22236e && this.f22224h.f22230c) {
                return false;
            }
            this.f22227k = errorCode;
            notifyAll();
            this.f22220d.mo42847p0(this.f22219c);
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void m31351z() {
        try {
            wait();
        } catch (InterruptedException unused) {
            throw new InterruptedIOException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo42854i(long j) {
        this.f22218b += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* renamed from: l */
    public void mo42855l(ErrorCode errorCode) {
        if (m31350m(errorCode)) {
            this.f22220d.mo42851z0(this.f22219c, errorCode);
        }
    }

    /* renamed from: n */
    public void mo42856n(ErrorCode errorCode) {
        if (m31350m(errorCode)) {
            this.f22220d.mo42837A0(this.f22219c, errorCode);
        }
    }

    /* renamed from: o */
    public int mo42857o() {
        return this.f22219c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        r3.f22225i.mo42869u();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.List<p236z2.C12117e> mo42858p() {
        /*
            r3 = this;
            monitor-enter(r3)
            z2.d$d r0 = r3.f22225i     // Catch:{ all -> 0x003d }
            r0.mo24712k()     // Catch:{ all -> 0x003d }
        L_0x0006:
            java.util.List<z2.e> r0 = r3.f22222f     // Catch:{ all -> 0x0036 }
            if (r0 != 0) goto L_0x0012
            com.squareup.okhttp.internal.framed.ErrorCode r0 = r3.f22227k     // Catch:{ all -> 0x0036 }
            if (r0 != 0) goto L_0x0012
            r3.m31351z()     // Catch:{ all -> 0x0036 }
            goto L_0x0006
        L_0x0012:
            z2.d$d r0 = r3.f22225i     // Catch:{ all -> 0x003d }
            r0.mo42869u()     // Catch:{ all -> 0x003d }
            java.util.List<z2.e> r0 = r3.f22222f     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x001d
            monitor-exit(r3)
            return r0
        L_0x001d:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x003d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x003d }
            r1.<init>()     // Catch:{ all -> 0x003d }
            java.lang.String r2 = "stream was reset: "
            r1.append(r2)     // Catch:{ all -> 0x003d }
            com.squareup.okhttp.internal.framed.ErrorCode r2 = r3.f22227k     // Catch:{ all -> 0x003d }
            r1.append(r2)     // Catch:{ all -> 0x003d }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x003d }
            r0.<init>(r1)     // Catch:{ all -> 0x003d }
            throw r0     // Catch:{ all -> 0x003d }
        L_0x0036:
            r0 = move-exception
            z2.d$d r1 = r3.f22225i     // Catch:{ all -> 0x003d }
            r1.mo42869u()     // Catch:{ all -> 0x003d }
            throw r0     // Catch:{ all -> 0x003d }
        L_0x003d:
            r0 = move-exception
            monitor-exit(r3)
            goto L_0x0041
        L_0x0040:
            throw r0
        L_0x0041:
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: p236z2.C12112d.mo42858p():java.util.List");
    }

    /* renamed from: q */
    public C9852q mo42859q() {
        synchronized (this) {
            if (this.f22222f == null) {
                if (!mo42861s()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.f22224h;
    }

    /* renamed from: r */
    public C9853r mo42860r() {
        return this.f22223g;
    }

    /* renamed from: s */
    public boolean mo42861s() {
        return this.f22220d.f22158b == ((this.f22219c & 1) == 1);
    }

    /* renamed from: t */
    public synchronized boolean mo42862t() {
        if (this.f22227k != null) {
            return false;
        }
        return (!this.f22223g.f22236e && !this.f22223g.f22235d) || (!this.f22224h.f22230c && !this.f22224h.f22229b) || this.f22222f == null;
    }

    /* renamed from: u */
    public C9854s mo42863u() {
        return this.f22225i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo42864v(C9838e eVar, int i) {
        this.f22223g.mo42868h(eVar, (long) i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo42865w() {
        boolean t;
        synchronized (this) {
            boolean unused = this.f22223g.f22236e = true;
            t = mo42862t();
            notifyAll();
        }
        if (!t) {
            this.f22220d.mo42847p0(this.f22219c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo42866x(List<C12117e> list, HeadersMode headersMode) {
        ErrorCode errorCode = null;
        boolean z = true;
        synchronized (this) {
            if (this.f22222f == null) {
                if (headersMode.failIfHeadersAbsent()) {
                    errorCode = ErrorCode.PROTOCOL_ERROR;
                } else {
                    this.f22222f = list;
                    z = mo42862t();
                    notifyAll();
                }
            } else if (headersMode.failIfHeadersPresent()) {
                errorCode = ErrorCode.STREAM_IN_USE;
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f22222f);
                arrayList.addAll(list);
                this.f22222f = arrayList;
            }
        }
        if (errorCode != null) {
            mo42856n(errorCode);
        } else if (!z) {
            this.f22220d.mo42847p0(this.f22219c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public synchronized void mo42867y(ErrorCode errorCode) {
        if (this.f22227k == null) {
            this.f22227k = errorCode;
            notifyAll();
        }
    }
}
