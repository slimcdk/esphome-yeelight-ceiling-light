package p229x5;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SocketChannel;
import p152e6.C9001b;
import p152e6.C9003c;
import p225w5.C11940d;
import p225w5.C11950k;

/* renamed from: x5.b */
public class C11984b implements C11950k {

    /* renamed from: i */
    private static final C9003c f21882i = C9001b.m21450a(C11984b.class);

    /* renamed from: a */
    protected final ByteChannel f21883a;

    /* renamed from: b */
    protected final ByteBuffer[] f21884b = new ByteBuffer[2];

    /* renamed from: c */
    protected final Socket f21885c;

    /* renamed from: d */
    protected final InetSocketAddress f21886d;

    /* renamed from: e */
    protected final InetSocketAddress f21887e;

    /* renamed from: f */
    protected volatile int f21888f;

    /* renamed from: g */
    private volatile boolean f21889g;

    /* renamed from: h */
    private volatile boolean f21890h;

    protected C11984b(ByteChannel byteChannel, int i) {
        this.f21883a = byteChannel;
        this.f21888f = i;
        Socket socket = byteChannel instanceof SocketChannel ? ((SocketChannel) byteChannel).socket() : null;
        this.f21885c = socket;
        if (socket != null) {
            this.f21886d = (InetSocketAddress) socket.getLocalSocketAddress();
            this.f21887e = (InetSocketAddress) socket.getRemoteSocketAddress();
            socket.setSoTimeout(this.f21888f);
            return;
        }
        this.f21887e = null;
        this.f21886d = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final void mo42554B() {
        Socket socket;
        f21882i.mo36850e("oshut {}", this);
        this.f21890h = true;
        if (this.f21883a.isOpen() && (socket = this.f21885c) != null) {
            try {
                if (!socket.isOutputShutdown()) {
                    this.f21885c.shutdownOutput();
                }
                if (!this.f21889g) {
                    return;
                }
            } catch (SocketException e) {
                C9003c cVar = f21882i;
                cVar.mo36850e(e.toString(), new Object[0]);
                cVar.mo36849d(e);
                if (!this.f21889g) {
                    return;
                }
            } catch (Throwable th) {
                if (this.f21889g) {
                    close();
                }
                throw th;
            }
            close();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo42555a(C11940d dVar, ByteBuffer byteBuffer, C11940d dVar2, ByteBuffer byteBuffer2) {
        int write;
        synchronized (this) {
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            asReadOnlyBuffer.position(dVar.mo42409L0());
            asReadOnlyBuffer.limit(dVar.mo42416U0());
            ByteBuffer asReadOnlyBuffer2 = byteBuffer2.asReadOnlyBuffer();
            asReadOnlyBuffer2.position(dVar2.mo42409L0());
            asReadOnlyBuffer2.limit(dVar2.mo42416U0());
            ByteBuffer[] byteBufferArr = this.f21884b;
            byteBufferArr[0] = asReadOnlyBuffer;
            byteBufferArr[1] = asReadOnlyBuffer2;
            write = (int) ((GatheringByteChannel) this.f21883a).write(byteBufferArr);
            int length = dVar.length();
            if (write > length) {
                dVar.clear();
                dVar2.mo42441u0(write - length);
            } else if (write > 0) {
                dVar.mo42441u0(write);
            }
        }
        return write;
    }

    public void close() {
        f21882i.mo36850e("close {}", this);
        this.f21883a.close();
    }

    /* renamed from: e */
    public int mo39654e() {
        if (this.f21885c == null) {
            return 0;
        }
        InetSocketAddress inetSocketAddress = this.f21886d;
        if (inetSocketAddress == null) {
            return -1;
        }
        return inetSocketAddress.getPort();
    }

    /* renamed from: f */
    public int mo39655f() {
        return this.f21888f;
    }

    public void flush() {
    }

    /* renamed from: h */
    public String mo39658h() {
        InetSocketAddress inetSocketAddress;
        if (this.f21885c == null || (inetSocketAddress = this.f21887e) == null) {
            return null;
        }
        return inetSocketAddress.getAddress().getHostAddress();
    }

    /* renamed from: i */
    public void mo39659i(int i) {
        if (!(this.f21885c == null || i == this.f21888f)) {
            this.f21885c.setSoTimeout(i > 0 ? i : 0);
        }
        this.f21888f = i;
    }

    public boolean isOpen() {
        return this.f21883a.isOpen();
    }

    /* renamed from: k */
    public int mo39662k(C11940d dVar, C11940d dVar2, C11940d dVar3) {
        C11940d dVar4 = null;
        C11940d F = dVar == null ? null : dVar.mo42406F();
        if (dVar2 != null) {
            dVar4 = dVar2.mo42406F();
        }
        if ((this.f21883a instanceof GatheringByteChannel) && dVar != null && dVar.length() != 0 && (F instanceof C11987e) && dVar2 != null && dVar2.length() != 0 && (dVar4 instanceof C11987e)) {
            return mo42555a(dVar, ((C11987e) F).mo42558A0(), dVar2, ((C11987e) dVar4).mo42558A0());
        }
        int x = (dVar == null || dVar.length() <= 0) ? 0 : mo39674x(dVar);
        if ((dVar == null || dVar.length() == 0) && dVar2 != null && dVar2.length() > 0) {
            x += mo39674x(dVar2);
        }
        return ((dVar == null || dVar.length() == 0) && (dVar2 == null || dVar2.length() == 0) && dVar3 != null && dVar3.length() > 0) ? mo39674x(dVar3) + x : x;
    }

    /* renamed from: l */
    public void mo39663l() {
        mo42557w();
    }

    /* renamed from: m */
    public String mo39664m() {
        if (this.f21885c == null) {
            return null;
        }
        InetSocketAddress inetSocketAddress = this.f21886d;
        return (inetSocketAddress == null || inetSocketAddress.getAddress() == null || this.f21886d.getAddress().isAnyLocalAddress()) ? "0.0.0.0" : this.f21886d.getAddress().getCanonicalHostName();
    }

    /* renamed from: n */
    public boolean mo39665n(long j) {
        return true;
    }

    /* renamed from: o */
    public boolean mo39666o() {
        ByteChannel byteChannel = this.f21883a;
        return !(byteChannel instanceof SelectableChannel) || ((SelectableChannel) byteChannel).isBlocking();
    }

    /* renamed from: p */
    public ByteChannel mo42556p() {
        return this.f21883a;
    }

    /* renamed from: q */
    public String mo39667q() {
        if (this.f21885c == null) {
            return null;
        }
        InetSocketAddress inetSocketAddress = this.f21886d;
        return (inetSocketAddress == null || inetSocketAddress.getAddress() == null || this.f21886d.getAddress().isAnyLocalAddress()) ? "0.0.0.0" : this.f21886d.getAddress().getHostAddress();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r1.f21885c;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo39668r() {
        /*
            r1 = this;
            boolean r0 = r1.f21890h
            if (r0 != 0) goto L_0x0019
            java.nio.channels.ByteChannel r0 = r1.f21883a
            boolean r0 = r0.isOpen()
            if (r0 == 0) goto L_0x0019
            java.net.Socket r0 = r1.f21885c
            if (r0 == 0) goto L_0x0017
            boolean r0 = r0.isOutputShutdown()
            if (r0 == 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r0 = 0
            goto L_0x001a
        L_0x0019:
            r0 = 1
        L_0x001a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p229x5.C11984b.mo39668r():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r1.f21885c;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo39669s() {
        /*
            r1 = this;
            boolean r0 = r1.f21889g
            if (r0 != 0) goto L_0x0019
            java.nio.channels.ByteChannel r0 = r1.f21883a
            boolean r0 = r0.isOpen()
            if (r0 == 0) goto L_0x0019
            java.net.Socket r0 = r1.f21885c
            if (r0 == 0) goto L_0x0017
            boolean r0 = r0.isInputShutdown()
            if (r0 == 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r0 = 0
            goto L_0x001a
        L_0x0019:
            r0 = 1
        L_0x001a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p229x5.C11984b.mo39669s():boolean");
    }

    /* renamed from: t */
    public void mo39670t() {
        mo42554B();
    }

    /* renamed from: u */
    public boolean mo39672u(long j) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo42557w() {
        Socket socket;
        f21882i.mo36850e("ishut {}", this);
        this.f21889g = true;
        if (this.f21883a.isOpen() && (socket = this.f21885c) != null) {
            try {
                if (!socket.isInputShutdown()) {
                    this.f21885c.shutdownInput();
                }
                if (!this.f21890h) {
                    return;
                }
            } catch (SocketException e) {
                C9003c cVar = f21882i;
                cVar.mo36850e(e.toString(), new Object[0]);
                cVar.mo36849d(e);
                if (!this.f21890h) {
                    return;
                }
            } catch (Throwable th) {
                if (this.f21890h) {
                    close();
                }
                throw th;
            }
            close();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        if (r0 > 0) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0061, code lost:
        if (r0 > 0) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0026, code lost:
        if (r0 > 0) goto L_0x0028;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo39674x(p225w5.C11940d r5) {
        /*
            r4 = this;
            w5.d r0 = r5.mo42406F()
            boolean r1 = r0 instanceof p229x5.C11987e
            if (r1 == 0) goto L_0x002e
            x5.e r0 = (p229x5.C11987e) r0
            java.nio.ByteBuffer r0 = r0.mo42558A0()
            java.nio.ByteBuffer r0 = r0.asReadOnlyBuffer()
            int r1 = r5.mo42409L0()     // Catch:{ all -> 0x002c }
            r0.position(r1)     // Catch:{ all -> 0x002c }
            int r1 = r5.mo42416U0()     // Catch:{ all -> 0x002c }
            r0.limit(r1)     // Catch:{ all -> 0x002c }
            java.nio.channels.ByteChannel r1 = r4.f21883a     // Catch:{ all -> 0x002c }
            int r0 = r1.write(r0)     // Catch:{ all -> 0x002c }
            if (r0 <= 0) goto L_0x0064
        L_0x0028:
            r5.mo42441u0(r0)
            goto L_0x0064
        L_0x002c:
            r5 = move-exception
            throw r5
        L_0x002e:
            boolean r1 = r0 instanceof p229x5.C11988f
            if (r1 == 0) goto L_0x0045
            x5.f r0 = (p229x5.C11988f) r0
            java.nio.channels.ByteChannel r1 = r4.f21883a
            int r2 = r5.mo42409L0()
            int r3 = r5.length()
            int r0 = r0.mo42559d(r1, r2, r3)
            if (r0 <= 0) goto L_0x0064
            goto L_0x0028
        L_0x0045:
            byte[] r0 = r5.mo42451g0()
            if (r0 == 0) goto L_0x0065
            byte[] r0 = r5.mo42451g0()
            int r1 = r5.mo42409L0()
            int r2 = r5.length()
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0, r1, r2)
            java.nio.channels.ByteChannel r1 = r4.f21883a
            int r0 = r1.write(r0)
            if (r0 <= 0) goto L_0x0064
            goto L_0x0028
        L_0x0064:
            return r0
        L_0x0065:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r0 = "Not Implemented"
            r5.<init>(r0)
            goto L_0x006e
        L_0x006d:
            throw r5
        L_0x006e:
            goto L_0x006d
        */
        throw new UnsupportedOperationException("Method not decompiled: p229x5.C11984b.mo39674x(w5.d):int");
    }

    /* renamed from: y */
    public int mo39675y() {
        if (this.f21885c == null) {
            return 0;
        }
        InetSocketAddress inetSocketAddress = this.f21887e;
        if (inetSocketAddress == null) {
            return -1;
        }
        return inetSocketAddress.getPort();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        if (r3 >= 0) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
        if (isOpen() == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        if (mo39669s() != false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        mo39663l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
        if (mo39668r() == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0045, code lost:
        r5.f21883a.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004c, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0063, code lost:
        f21882i.mo36854h("Exception while filling", r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0070, code lost:
        if (r5.f21883a.isOpen() != false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0072, code lost:
        r5.f21883a.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0078, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0079, code lost:
        f21882i.mo36849d(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x007e, code lost:
        if (r2 <= 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0081, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        return -1;
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo26552z(p225w5.C11940d r6) {
        /*
            r5 = this;
            boolean r0 = r5.f21889g
            r1 = -1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            w5.d r0 = r6.mo42406F()
            boolean r2 = r0 instanceof p229x5.C11987e
            if (r2 == 0) goto L_0x0082
            x5.e r0 = (p229x5.C11987e) r0
            java.nio.ByteBuffer r0 = r0.mo42558A0()
            r2 = 0
            monitor-enter(r0)     // Catch:{ IOException -> 0x0062 }
            int r3 = r6.mo42416U0()     // Catch:{ all -> 0x0053 }
            r0.position(r3)     // Catch:{ all -> 0x0053 }
            java.nio.channels.ByteChannel r3 = r5.f21883a     // Catch:{ all -> 0x0053 }
            int r3 = r3.read(r0)     // Catch:{ all -> 0x0053 }
            int r4 = r0.position()     // Catch:{ all -> 0x0050 }
            r6.mo42430h0(r4)     // Catch:{ all -> 0x0050 }
            r0.position(r2)     // Catch:{ all -> 0x0050 }
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            if (r3 >= 0) goto L_0x004e
            boolean r6 = r5.isOpen()     // Catch:{ IOException -> 0x004b }
            if (r6 == 0) goto L_0x004e
            boolean r6 = r5.mo39669s()     // Catch:{ IOException -> 0x004b }
            if (r6 != 0) goto L_0x003f
            r5.mo39663l()     // Catch:{ IOException -> 0x004b }
        L_0x003f:
            boolean r6 = r5.mo39668r()     // Catch:{ IOException -> 0x004b }
            if (r6 == 0) goto L_0x004e
            java.nio.channels.ByteChannel r6 = r5.f21883a     // Catch:{ IOException -> 0x004b }
            r6.close()     // Catch:{ IOException -> 0x004b }
            goto L_0x004e
        L_0x004b:
            r6 = move-exception
            r2 = r3
            goto L_0x0063
        L_0x004e:
            r1 = r3
            goto L_0x0080
        L_0x0050:
            r6 = move-exception
            r2 = r3
            goto L_0x0060
        L_0x0053:
            r3 = move-exception
            int r4 = r0.position()     // Catch:{ all -> 0x005f }
            r6.mo42430h0(r4)     // Catch:{ all -> 0x005f }
            r0.position(r2)     // Catch:{ all -> 0x005f }
            throw r3     // Catch:{ all -> 0x005f }
        L_0x005f:
            r6 = move-exception
        L_0x0060:
            monitor-exit(r0)     // Catch:{ all -> 0x005f }
            throw r6     // Catch:{ IOException -> 0x0062 }
        L_0x0062:
            r6 = move-exception
        L_0x0063:
            e6.c r0 = f21882i
            java.lang.String r3 = "Exception while filling"
            r0.mo36854h(r3, r6)
            java.nio.channels.ByteChannel r0 = r5.f21883a     // Catch:{ Exception -> 0x0078 }
            boolean r0 = r0.isOpen()     // Catch:{ Exception -> 0x0078 }
            if (r0 == 0) goto L_0x007e
            java.nio.channels.ByteChannel r0 = r5.f21883a     // Catch:{ Exception -> 0x0078 }
            r0.close()     // Catch:{ Exception -> 0x0078 }
            goto L_0x007e
        L_0x0078:
            r0 = move-exception
            e6.c r3 = f21882i
            r3.mo36849d(r0)
        L_0x007e:
            if (r2 > 0) goto L_0x0081
        L_0x0080:
            return r1
        L_0x0081:
            throw r6
        L_0x0082:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "Not Implemented"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p229x5.C11984b.mo26552z(w5.d):int");
    }
}
