package okhttp3.internal.http2;

import android.support.p004v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import okhttp3.C3544s;
import okhttp3.internal.http2.C9802a;
import okio.C3560a;
import okio.C3564c;
import okio.C9838e;
import okio.C9852q;
import okio.C9853r;
import okio.C9854s;
import p056k5.C3300c;

/* renamed from: okhttp3.internal.http2.f */
public final class C3527f {

    /* renamed from: a */
    long f5728a = 0;

    /* renamed from: b */
    long f5729b;

    /* renamed from: c */
    final int f5730c;

    /* renamed from: d */
    final C9808d f5731d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Deque<C3544s> f5732e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C9802a.C9803a f5733f;

    /* renamed from: g */
    private boolean f5734g;

    /* renamed from: h */
    private final C3529b f5735h;

    /* renamed from: i */
    final C3528a f5736i;

    /* renamed from: j */
    final C3530c f5737j;

    /* renamed from: k */
    final C3530c f5738k;

    /* renamed from: l */
    ErrorCode f5739l;

    /* renamed from: okhttp3.internal.http2.f$a */
    final class C3528a implements C9852q {

        /* renamed from: a */
        private final C3564c f5740a = new C3564c();

        /* renamed from: b */
        boolean f5741b;

        /* renamed from: c */
        boolean f5742c;

        C3528a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            r1.f5738k.mo24482u();
            r11.f5743d.mo24458e();
            r9 = java.lang.Math.min(r11.f5743d.f5729b, r11.f5740a.mo24758i1());
            r1 = r11.f5743d;
            r1.f5729b -= r9;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m9717a(boolean r12) {
            /*
                r11 = this;
                okhttp3.internal.http2.f r0 = okhttp3.internal.http2.C3527f.this
                monitor-enter(r0)
                okhttp3.internal.http2.f r1 = okhttp3.internal.http2.C3527f.this     // Catch:{ all -> 0x007f }
                okhttp3.internal.http2.f$c r1 = r1.f5738k     // Catch:{ all -> 0x007f }
                r1.mo24712k()     // Catch:{ all -> 0x007f }
            L_0x000a:
                okhttp3.internal.http2.f r1 = okhttp3.internal.http2.C3527f.this     // Catch:{ all -> 0x0076 }
                long r2 = r1.f5729b     // Catch:{ all -> 0x0076 }
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 > 0) goto L_0x0024
                boolean r2 = r11.f5742c     // Catch:{ all -> 0x0076 }
                if (r2 != 0) goto L_0x0024
                boolean r2 = r11.f5741b     // Catch:{ all -> 0x0076 }
                if (r2 != 0) goto L_0x0024
                okhttp3.internal.http2.ErrorCode r2 = r1.f5739l     // Catch:{ all -> 0x0076 }
                if (r2 != 0) goto L_0x0024
                r1.mo24472t()     // Catch:{ all -> 0x0076 }
                goto L_0x000a
            L_0x0024:
                okhttp3.internal.http2.f$c r1 = r1.f5738k     // Catch:{ all -> 0x007f }
                r1.mo24482u()     // Catch:{ all -> 0x007f }
                okhttp3.internal.http2.f r1 = okhttp3.internal.http2.C3527f.this     // Catch:{ all -> 0x007f }
                r1.mo24458e()     // Catch:{ all -> 0x007f }
                okhttp3.internal.http2.f r1 = okhttp3.internal.http2.C3527f.this     // Catch:{ all -> 0x007f }
                long r1 = r1.f5729b     // Catch:{ all -> 0x007f }
                okio.c r3 = r11.f5740a     // Catch:{ all -> 0x007f }
                long r3 = r3.mo24758i1()     // Catch:{ all -> 0x007f }
                long r9 = java.lang.Math.min(r1, r3)     // Catch:{ all -> 0x007f }
                okhttp3.internal.http2.f r1 = okhttp3.internal.http2.C3527f.this     // Catch:{ all -> 0x007f }
                long r2 = r1.f5729b     // Catch:{ all -> 0x007f }
                long r2 = r2 - r9
                r1.f5729b = r2     // Catch:{ all -> 0x007f }
                monitor-exit(r0)     // Catch:{ all -> 0x007f }
                okhttp3.internal.http2.f$c r0 = r1.f5738k
                r0.mo24712k()
                okhttp3.internal.http2.f r0 = okhttp3.internal.http2.C3527f.this     // Catch:{ all -> 0x006d }
                okhttp3.internal.http2.d r5 = r0.f5731d     // Catch:{ all -> 0x006d }
                int r6 = r0.f5730c     // Catch:{ all -> 0x006d }
                if (r12 == 0) goto L_0x005e
                okio.c r12 = r11.f5740a     // Catch:{ all -> 0x006d }
                long r0 = r12.mo24758i1()     // Catch:{ all -> 0x006d }
                int r12 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r12 != 0) goto L_0x005e
                r12 = 1
                r7 = 1
                goto L_0x0060
            L_0x005e:
                r12 = 0
                r7 = 0
            L_0x0060:
                okio.c r8 = r11.f5740a     // Catch:{ all -> 0x006d }
                r5.mo39015J(r6, r7, r8, r9)     // Catch:{ all -> 0x006d }
                okhttp3.internal.http2.f r12 = okhttp3.internal.http2.C3527f.this
                okhttp3.internal.http2.f$c r12 = r12.f5738k
                r12.mo24482u()
                return
            L_0x006d:
                r12 = move-exception
                okhttp3.internal.http2.f r0 = okhttp3.internal.http2.C3527f.this
                okhttp3.internal.http2.f$c r0 = r0.f5738k
                r0.mo24482u()
                throw r12
            L_0x0076:
                r12 = move-exception
                okhttp3.internal.http2.f r1 = okhttp3.internal.http2.C3527f.this     // Catch:{ all -> 0x007f }
                okhttp3.internal.http2.f$c r1 = r1.f5738k     // Catch:{ all -> 0x007f }
                r1.mo24482u()     // Catch:{ all -> 0x007f }
                throw r12     // Catch:{ all -> 0x007f }
            L_0x007f:
                r12 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x007f }
                goto L_0x0083
            L_0x0082:
                throw r12
            L_0x0083:
                goto L_0x0082
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.C3527f.C3528a.m9717a(boolean):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
            if (r8.f5740a.mo24758i1() <= 0) goto L_0x002d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
            if (r8.f5740a.mo24758i1() <= 0) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
            m9717a(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
            r0 = r8.f5743d;
            r0.f5731d.mo39015J(r0.f5730c, true, (okio.C3564c) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
            r2 = r8.f5743d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r8.f5741b = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
            r8.f5743d.f5731d.flush();
            r8.f5743d.mo24457d();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
            if (r8.f5743d.f5736i.f5742c != false) goto L_0x003a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() {
            /*
                r8 = this;
                okhttp3.internal.http2.f r0 = okhttp3.internal.http2.C3527f.this
                monitor-enter(r0)
                boolean r1 = r8.f5741b     // Catch:{ all -> 0x0050 }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x0050 }
                return
            L_0x0009:
                monitor-exit(r0)     // Catch:{ all -> 0x0050 }
                okhttp3.internal.http2.f r0 = okhttp3.internal.http2.C3527f.this
                okhttp3.internal.http2.f$a r0 = r0.f5736i
                boolean r0 = r0.f5742c
                r1 = 1
                if (r0 != 0) goto L_0x003a
                okio.c r0 = r8.f5740a
                long r2 = r0.mo24758i1()
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x002d
            L_0x001f:
                okio.c r0 = r8.f5740a
                long r2 = r0.mo24758i1()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x003a
                r8.m9717a(r1)
                goto L_0x001f
            L_0x002d:
                okhttp3.internal.http2.f r0 = okhttp3.internal.http2.C3527f.this
                okhttp3.internal.http2.d r2 = r0.f5731d
                int r3 = r0.f5730c
                r4 = 1
                r5 = 0
                r6 = 0
                r2.mo39015J(r3, r4, r5, r6)
            L_0x003a:
                okhttp3.internal.http2.f r2 = okhttp3.internal.http2.C3527f.this
                monitor-enter(r2)
                r8.f5741b = r1     // Catch:{ all -> 0x004d }
                monitor-exit(r2)     // Catch:{ all -> 0x004d }
                okhttp3.internal.http2.f r0 = okhttp3.internal.http2.C3527f.this
                okhttp3.internal.http2.d r0 = r0.f5731d
                r0.flush()
                okhttp3.internal.http2.f r0 = okhttp3.internal.http2.C3527f.this
                r0.mo24457d()
                return
            L_0x004d:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x004d }
                throw r0
            L_0x0050:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0050 }
                goto L_0x0054
            L_0x0053:
                throw r1
            L_0x0054:
                goto L_0x0053
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.C3527f.C3528a.close():void");
        }

        public void flush() {
            synchronized (C3527f.this) {
                C3527f.this.mo24458e();
            }
            while (this.f5740a.mo24758i1() > 0) {
                m9717a(false);
                C3527f.this.f5731d.flush();
            }
        }

        /* renamed from: j */
        public C9854s mo24475j() {
            return C3527f.this.f5738k;
        }

        /* renamed from: q0 */
        public void mo24476q0(C3564c cVar, long j) {
            this.f5740a.mo24476q0(cVar, j);
            while (this.f5740a.mo24758i1() >= PlaybackStateCompat.ACTION_PREPARE) {
                m9717a(false);
            }
        }
    }

    /* renamed from: okhttp3.internal.http2.f$b */
    private final class C3529b implements C9853r {

        /* renamed from: a */
        private final C3564c f5744a = new C3564c();

        /* renamed from: b */
        private final C3564c f5745b = new C3564c();

        /* renamed from: c */
        private final long f5746c;

        /* renamed from: d */
        boolean f5747d;

        /* renamed from: e */
        boolean f5748e;

        C3529b(long j) {
            this.f5746c = j;
        }

        /* renamed from: c */
        private void m9720c(long j) {
            C3527f.this.f5731d.mo39014I(j);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v33, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: okhttp3.s} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: R0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo24477R0(okio.C3564c r17, long r18) {
            /*
                r16 = this;
                r1 = r16
                r2 = r18
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 < 0) goto L_0x00e0
            L_0x000a:
                okhttp3.internal.http2.f r6 = okhttp3.internal.http2.C3527f.this
                monitor-enter(r6)
                okhttp3.internal.http2.f r0 = okhttp3.internal.http2.C3527f.this     // Catch:{ all -> 0x00dd }
                okhttp3.internal.http2.f$c r0 = r0.f5737j     // Catch:{ all -> 0x00dd }
                r0.mo24712k()     // Catch:{ all -> 0x00dd }
                okhttp3.internal.http2.f r0 = okhttp3.internal.http2.C3527f.this     // Catch:{ all -> 0x00d4 }
                okhttp3.internal.http2.ErrorCode r7 = r0.f5739l     // Catch:{ all -> 0x00d4 }
                if (r7 == 0) goto L_0x001b
                goto L_0x001c
            L_0x001b:
                r7 = 0
            L_0x001c:
                boolean r9 = r1.f5747d     // Catch:{ all -> 0x00d4 }
                if (r9 != 0) goto L_0x00cc
                java.util.Deque r0 = r0.f5732e     // Catch:{ all -> 0x00d4 }
                boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00d4 }
                if (r0 != 0) goto L_0x0049
                okhttp3.internal.http2.f r0 = okhttp3.internal.http2.C3527f.this     // Catch:{ all -> 0x00d4 }
                okhttp3.internal.http2.a$a r0 = r0.f5733f     // Catch:{ all -> 0x00d4 }
                if (r0 == 0) goto L_0x0049
                okhttp3.internal.http2.f r0 = okhttp3.internal.http2.C3527f.this     // Catch:{ all -> 0x00d4 }
                java.util.Deque r0 = r0.f5732e     // Catch:{ all -> 0x00d4 }
                java.lang.Object r0 = r0.removeFirst()     // Catch:{ all -> 0x00d4 }
                r8 = r0
                okhttp3.s r8 = (okhttp3.C3544s) r8     // Catch:{ all -> 0x00d4 }
                okhttp3.internal.http2.f r0 = okhttp3.internal.http2.C3527f.this     // Catch:{ all -> 0x00d4 }
                okhttp3.internal.http2.a$a r0 = r0.f5733f     // Catch:{ all -> 0x00d4 }
                r13 = r17
                r10 = r0
                goto L_0x00a6
            L_0x0049:
                okio.c r0 = r1.f5745b     // Catch:{ all -> 0x00d4 }
                long r11 = r0.mo24758i1()     // Catch:{ all -> 0x00d4 }
                int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x008d
                okio.c r0 = r1.f5745b     // Catch:{ all -> 0x00d4 }
                long r11 = r0.mo24758i1()     // Catch:{ all -> 0x00d4 }
                long r11 = java.lang.Math.min(r2, r11)     // Catch:{ all -> 0x00d4 }
                r13 = r17
                long r11 = r0.mo24477R0(r13, r11)     // Catch:{ all -> 0x00d4 }
                okhttp3.internal.http2.f r0 = okhttp3.internal.http2.C3527f.this     // Catch:{ all -> 0x00d4 }
                long r14 = r0.f5728a     // Catch:{ all -> 0x00d4 }
                long r14 = r14 + r11
                r0.f5728a = r14     // Catch:{ all -> 0x00d4 }
                if (r7 != 0) goto L_0x008a
                okhttp3.internal.http2.d r0 = r0.f5731d     // Catch:{ all -> 0x00d4 }
                okhttp3.internal.http2.i r0 = r0.f17739n     // Catch:{ all -> 0x00d4 }
                int r0 = r0.mo39069d()     // Catch:{ all -> 0x00d4 }
                int r0 = r0 / 2
                long r8 = (long) r0     // Catch:{ all -> 0x00d4 }
                int r0 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
                if (r0 < 0) goto L_0x008a
                okhttp3.internal.http2.f r0 = okhttp3.internal.http2.C3527f.this     // Catch:{ all -> 0x00d4 }
                okhttp3.internal.http2.d r8 = r0.f5731d     // Catch:{ all -> 0x00d4 }
                int r9 = r0.f5730c     // Catch:{ all -> 0x00d4 }
                long r14 = r0.f5728a     // Catch:{ all -> 0x00d4 }
                r8.mo39019V(r9, r14)     // Catch:{ all -> 0x00d4 }
                okhttp3.internal.http2.f r0 = okhttp3.internal.http2.C3527f.this     // Catch:{ all -> 0x00d4 }
                r0.f5728a = r4     // Catch:{ all -> 0x00d4 }
            L_0x008a:
                r8 = 0
                r10 = 0
                goto L_0x00a8
            L_0x008d:
                r13 = r17
                boolean r0 = r1.f5748e     // Catch:{ all -> 0x00d4 }
                if (r0 != 0) goto L_0x00a4
                if (r7 != 0) goto L_0x00a4
                okhttp3.internal.http2.f r0 = okhttp3.internal.http2.C3527f.this     // Catch:{ all -> 0x00d4 }
                r0.mo24472t()     // Catch:{ all -> 0x00d4 }
                okhttp3.internal.http2.f r0 = okhttp3.internal.http2.C3527f.this     // Catch:{ all -> 0x00dd }
                okhttp3.internal.http2.f$c r0 = r0.f5737j     // Catch:{ all -> 0x00dd }
                r0.mo24482u()     // Catch:{ all -> 0x00dd }
                monitor-exit(r6)     // Catch:{ all -> 0x00dd }
                goto L_0x000a
            L_0x00a4:
                r8 = 0
                r10 = 0
            L_0x00a6:
                r11 = -1
            L_0x00a8:
                okhttp3.internal.http2.f r0 = okhttp3.internal.http2.C3527f.this     // Catch:{ all -> 0x00dd }
                okhttp3.internal.http2.f$c r0 = r0.f5737j     // Catch:{ all -> 0x00dd }
                r0.mo24482u()     // Catch:{ all -> 0x00dd }
                monitor-exit(r6)     // Catch:{ all -> 0x00dd }
                if (r8 == 0) goto L_0x00b9
                if (r10 == 0) goto L_0x00b9
                r10.mo38999a(r8)
                goto L_0x000a
            L_0x00b9:
                r2 = -1
                int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
                if (r0 == 0) goto L_0x00c3
                r1.m9720c(r11)
                return r11
            L_0x00c3:
                if (r7 != 0) goto L_0x00c6
                return r2
            L_0x00c6:
                okhttp3.internal.http2.StreamResetException r0 = new okhttp3.internal.http2.StreamResetException
                r0.<init>(r7)
                throw r0
            L_0x00cc:
                java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00d4 }
                java.lang.String r2 = "stream closed"
                r0.<init>(r2)     // Catch:{ all -> 0x00d4 }
                throw r0     // Catch:{ all -> 0x00d4 }
            L_0x00d4:
                r0 = move-exception
                okhttp3.internal.http2.f r2 = okhttp3.internal.http2.C3527f.this     // Catch:{ all -> 0x00dd }
                okhttp3.internal.http2.f$c r2 = r2.f5737j     // Catch:{ all -> 0x00dd }
                r2.mo24482u()     // Catch:{ all -> 0x00dd }
                throw r0     // Catch:{ all -> 0x00dd }
            L_0x00dd:
                r0 = move-exception
                monitor-exit(r6)     // Catch:{ all -> 0x00dd }
                throw r0
            L_0x00e0:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "byteCount < 0: "
                r4.append(r5)
                r4.append(r2)
                java.lang.String r2 = r4.toString()
                r0.<init>(r2)
                goto L_0x00f8
            L_0x00f7:
                throw r0
            L_0x00f8:
                goto L_0x00f7
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.C3527f.C3529b.mo24477R0(okio.c, long):long");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo24478a(C9838e eVar, long j) {
            boolean z;
            boolean z2;
            boolean z3;
            while (j > 0) {
                synchronized (C3527f.this) {
                    z = this.f5748e;
                    z2 = true;
                    z3 = this.f5745b.mo24758i1() + j > this.f5746c;
                }
                if (z3) {
                    eVar.skip(j);
                    C3527f.this.mo24460h(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                } else if (z) {
                    eVar.skip(j);
                    return;
                } else {
                    long R0 = eVar.mo24477R0(this.f5744a, j);
                    if (R0 != -1) {
                        j -= R0;
                        synchronized (C3527f.this) {
                            if (this.f5745b.mo24758i1() != 0) {
                                z2 = false;
                            }
                            this.f5745b.mo24781s0(this.f5744a);
                            if (z2) {
                                C3527f.this.notifyAll();
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
        }

        public void close() {
            long i1;
            C9802a.C9803a aVar;
            ArrayList<C3544s> arrayList;
            synchronized (C3527f.this) {
                this.f5747d = true;
                i1 = this.f5745b.mo24758i1();
                this.f5745b.clear();
                aVar = null;
                if (C3527f.this.f5732e.isEmpty() || C3527f.this.f5733f == null) {
                    arrayList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList(C3527f.this.f5732e);
                    C3527f.this.f5732e.clear();
                    ArrayList arrayList3 = arrayList2;
                    aVar = C3527f.this.f5733f;
                    arrayList = arrayList3;
                }
                C3527f.this.notifyAll();
            }
            if (i1 > 0) {
                m9720c(i1);
            }
            C3527f.this.mo24457d();
            if (aVar != null) {
                for (C3544s a : arrayList) {
                    aVar.mo38999a(a);
                }
            }
        }

        /* renamed from: j */
        public C9854s mo24479j() {
            return C3527f.this.f5737j;
        }
    }

    /* renamed from: okhttp3.internal.http2.f$c */
    class C3530c extends C3560a {
        C3530c() {
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
            C3527f.this.mo24460h(ErrorCode.CANCEL);
        }

        /* renamed from: u */
        public void mo24482u() {
            if (mo24715n()) {
                throw mo24480o((IOException) null);
            }
        }
    }

    C3527f(int i, C9808d dVar, boolean z, boolean z2, @Nullable C3544s sVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f5732e = arrayDeque;
        this.f5737j = new C3530c();
        this.f5738k = new C3530c();
        this.f5739l = null;
        Objects.requireNonNull(dVar, "connection == null");
        this.f5730c = i;
        this.f5731d = dVar;
        this.f5729b = (long) dVar.f17740o.mo39069d();
        C3529b bVar = new C3529b((long) dVar.f17739n.mo39069d());
        this.f5735h = bVar;
        C3528a aVar = new C3528a();
        this.f5736i = aVar;
        bVar.f5748e = z2;
        aVar.f5742c = z;
        if (sVar != null) {
            arrayDeque.add(sVar);
        }
        if (mo24464l() && sVar != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        } else if (!mo24464l() && sVar == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    /* renamed from: g */
    private boolean m9698g(ErrorCode errorCode) {
        synchronized (this) {
            if (this.f5739l != null) {
                return false;
            }
            if (this.f5735h.f5748e && this.f5736i.f5742c) {
                return false;
            }
            this.f5739l = errorCode;
            notifyAll();
            this.f5731d.mo39010D(this.f5730c);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo24456c(long j) {
        this.f5729b += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo24457d() {
        boolean z;
        boolean m;
        synchronized (this) {
            C3529b bVar = this.f5735h;
            if (!bVar.f5748e && bVar.f5747d) {
                C3528a aVar = this.f5736i;
                if (aVar.f5742c || aVar.f5741b) {
                    z = true;
                    m = mo24465m();
                }
            }
            z = false;
            m = mo24465m();
        }
        if (z) {
            mo24459f(ErrorCode.CANCEL);
        } else if (!m) {
            this.f5731d.mo39010D(this.f5730c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo24458e() {
        C3528a aVar = this.f5736i;
        if (aVar.f5741b) {
            throw new IOException("stream closed");
        } else if (aVar.f5742c) {
            throw new IOException("stream finished");
        } else if (this.f5739l != null) {
            throw new StreamResetException(this.f5739l);
        }
    }

    /* renamed from: f */
    public void mo24459f(ErrorCode errorCode) {
        if (m9698g(errorCode)) {
            this.f5731d.mo39017P(this.f5730c, errorCode);
        }
    }

    /* renamed from: h */
    public void mo24460h(ErrorCode errorCode) {
        if (m9698g(errorCode)) {
            this.f5731d.mo39018T(this.f5730c, errorCode);
        }
    }

    /* renamed from: i */
    public int mo24461i() {
        return this.f5730c;
    }

    /* renamed from: j */
    public C9852q mo24462j() {
        synchronized (this) {
            if (!this.f5734g) {
                if (!mo24464l()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.f5736i;
    }

    /* renamed from: k */
    public C9853r mo24463k() {
        return this.f5735h;
    }

    /* renamed from: l */
    public boolean mo24464l() {
        return this.f5731d.f17726a == ((this.f5730c & 1) == 1);
    }

    /* renamed from: m */
    public synchronized boolean mo24465m() {
        if (this.f5739l != null) {
            return false;
        }
        C3529b bVar = this.f5735h;
        if (bVar.f5748e || bVar.f5747d) {
            C3528a aVar = this.f5736i;
            if ((aVar.f5742c || aVar.f5741b) && this.f5734g) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n */
    public C9854s mo24466n() {
        return this.f5737j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo24467o(C9838e eVar, int i) {
        this.f5735h.mo24478a(eVar, (long) i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo24468p() {
        boolean m;
        synchronized (this) {
            this.f5735h.f5748e = true;
            m = mo24465m();
            notifyAll();
        }
        if (!m) {
            this.f5731d.mo39010D(this.f5730c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo24469q(List<C9802a> list) {
        boolean m;
        synchronized (this) {
            this.f5734g = true;
            this.f5732e.add(C3300c.m8913G(list));
            m = mo24465m();
            notifyAll();
        }
        if (!m) {
            this.f5731d.mo39010D(this.f5730c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public synchronized void mo24470r(ErrorCode errorCode) {
        if (this.f5739l == null) {
            this.f5739l = errorCode;
            notifyAll();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        r2.f5737j.mo24482u();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003b, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized okhttp3.C3544s mo24471s() {
        /*
            r2 = this;
            monitor-enter(r2)
            okhttp3.internal.http2.f$c r0 = r2.f5737j     // Catch:{ all -> 0x003c }
            r0.mo24712k()     // Catch:{ all -> 0x003c }
        L_0x0006:
            java.util.Deque<okhttp3.s> r0 = r2.f5732e     // Catch:{ all -> 0x0035 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0016
            okhttp3.internal.http2.ErrorCode r0 = r2.f5739l     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x0016
            r2.mo24472t()     // Catch:{ all -> 0x0035 }
            goto L_0x0006
        L_0x0016:
            okhttp3.internal.http2.f$c r0 = r2.f5737j     // Catch:{ all -> 0x003c }
            r0.mo24482u()     // Catch:{ all -> 0x003c }
            java.util.Deque<okhttp3.s> r0 = r2.f5732e     // Catch:{ all -> 0x003c }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x003c }
            if (r0 != 0) goto L_0x002d
            java.util.Deque<okhttp3.s> r0 = r2.f5732e     // Catch:{ all -> 0x003c }
            java.lang.Object r0 = r0.removeFirst()     // Catch:{ all -> 0x003c }
            okhttp3.s r0 = (okhttp3.C3544s) r0     // Catch:{ all -> 0x003c }
            monitor-exit(r2)
            return r0
        L_0x002d:
            okhttp3.internal.http2.StreamResetException r0 = new okhttp3.internal.http2.StreamResetException     // Catch:{ all -> 0x003c }
            okhttp3.internal.http2.ErrorCode r1 = r2.f5739l     // Catch:{ all -> 0x003c }
            r0.<init>(r1)     // Catch:{ all -> 0x003c }
            throw r0     // Catch:{ all -> 0x003c }
        L_0x0035:
            r0 = move-exception
            okhttp3.internal.http2.f$c r1 = r2.f5737j     // Catch:{ all -> 0x003c }
            r1.mo24482u()     // Catch:{ all -> 0x003c }
            throw r0     // Catch:{ all -> 0x003c }
        L_0x003c:
            r0 = move-exception
            monitor-exit(r2)
            goto L_0x0040
        L_0x003f:
            throw r0
        L_0x0040:
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.C3527f.mo24471s():okhttp3.s");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo24472t() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* renamed from: u */
    public C9854s mo24473u() {
        return this.f5738k;
    }
}
