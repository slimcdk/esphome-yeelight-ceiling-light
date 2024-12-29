package p164h.p211a.p212a.p217d.p219v;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SocketChannel;
import p164h.p211a.p212a.p217d.C10929e;
import p164h.p211a.p212a.p217d.C10942n;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.d.v.b */
public class C10955b implements C10942n {

    /* renamed from: i */
    private static final C11158c f21350i = C11156b.m29015a(C10955b.class);

    /* renamed from: a */
    protected final ByteChannel f21351a;

    /* renamed from: b */
    protected final ByteBuffer[] f21352b = new ByteBuffer[2];

    /* renamed from: c */
    protected final Socket f21353c;

    /* renamed from: d */
    protected final InetSocketAddress f21354d;

    /* renamed from: e */
    protected final InetSocketAddress f21355e;

    /* renamed from: f */
    protected volatile int f21356f;

    /* renamed from: g */
    private volatile boolean f21357g;

    /* renamed from: h */
    private volatile boolean f21358h;

    protected C10955b(ByteChannel byteChannel, int i) {
        this.f21351a = byteChannel;
        this.f21356f = i;
        Socket socket = byteChannel instanceof SocketChannel ? ((SocketChannel) byteChannel).socket() : null;
        this.f21353c = socket;
        if (socket != null) {
            this.f21354d = (InetSocketAddress) socket.getLocalSocketAddress();
            this.f21355e = (InetSocketAddress) this.f21353c.getRemoteSocketAddress();
            this.f21353c.setSoTimeout(this.f21356f);
            return;
        }
        this.f21355e = null;
        this.f21354d = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final void mo34668A() {
        Socket socket;
        f21350i.mo35489e("ishut {}", this);
        this.f21357g = true;
        if (this.f21351a.isOpen() && (socket = this.f21353c) != null) {
            try {
                if (!socket.isInputShutdown()) {
                    this.f21353c.shutdownInput();
                }
                if (!this.f21358h) {
                    return;
                }
            } catch (SocketException e) {
                f21350i.mo35489e(e.toString(), new Object[0]);
                f21350i.mo35488d(e);
                if (!this.f21358h) {
                    return;
                }
            } catch (Throwable th) {
                if (this.f21358h) {
                    close();
                }
                throw th;
            }
            close();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final void mo34669B() {
        Socket socket;
        f21350i.mo35489e("oshut {}", this);
        this.f21358h = true;
        if (this.f21351a.isOpen() && (socket = this.f21353c) != null) {
            try {
                if (!socket.isOutputShutdown()) {
                    this.f21353c.shutdownOutput();
                }
                if (!this.f21357g) {
                    return;
                }
            } catch (SocketException e) {
                f21350i.mo35489e(e.toString(), new Object[0]);
                f21350i.mo35488d(e);
                if (!this.f21357g) {
                    return;
                }
            } catch (Throwable th) {
                if (this.f21357g) {
                    close();
                }
                throw th;
            }
            close();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo34670a(C10929e eVar, ByteBuffer byteBuffer, C10929e eVar2, ByteBuffer byteBuffer2) {
        int write;
        synchronized (this) {
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            asReadOnlyBuffer.position(eVar.getIndex());
            asReadOnlyBuffer.limit(eVar.mo34562S0());
            ByteBuffer asReadOnlyBuffer2 = byteBuffer2.asReadOnlyBuffer();
            asReadOnlyBuffer2.position(eVar2.getIndex());
            asReadOnlyBuffer2.limit(eVar2.mo34562S0());
            this.f21352b[0] = asReadOnlyBuffer;
            this.f21352b[1] = asReadOnlyBuffer2;
            write = (int) ((GatheringByteChannel) this.f21351a).write(this.f21352b);
            int length = eVar.length();
            if (write > length) {
                eVar.clear();
                eVar2.mo34591u0(write - length);
            } else if (write > 0) {
                eVar.mo34591u0(write);
            }
        }
        return write;
    }

    public void close() {
        f21350i.mo35489e("close {}", this);
        this.f21351a.close();
    }

    /* renamed from: f */
    public int mo34354f() {
        if (this.f21353c == null) {
            return 0;
        }
        InetSocketAddress inetSocketAddress = this.f21354d;
        if (inetSocketAddress == null) {
            return -1;
        }
        return inetSocketAddress.getPort();
    }

    public void flush() {
    }

    /* renamed from: g */
    public int mo34356g() {
        return this.f21356f;
    }

    /* renamed from: i */
    public String mo34358i() {
        InetSocketAddress inetSocketAddress;
        if (this.f21353c == null || (inetSocketAddress = this.f21355e) == null) {
            return null;
        }
        return inetSocketAddress.getAddress().getHostAddress();
    }

    public boolean isOpen() {
        return this.f21351a.isOpen();
    }

    /* renamed from: j */
    public void mo34360j(int i) {
        if (!(this.f21353c == null || i == this.f21356f)) {
            this.f21353c.setSoTimeout(i > 0 ? i : 0);
        }
        this.f21356f = i;
    }

    /* renamed from: l */
    public void mo34362l() {
        mo34668A();
    }

    /* renamed from: m */
    public String mo34363m() {
        if (this.f21353c == null) {
            return null;
        }
        InetSocketAddress inetSocketAddress = this.f21354d;
        return (inetSocketAddress == null || inetSocketAddress.getAddress() == null || this.f21354d.getAddress().isAnyLocalAddress()) ? "0.0.0.0" : this.f21354d.getAddress().getCanonicalHostName();
    }

    /* renamed from: n */
    public boolean mo34364n(long j) {
        return true;
    }

    /* renamed from: o */
    public boolean mo34365o() {
        ByteChannel byteChannel = this.f21351a;
        return !(byteChannel instanceof SelectableChannel) || ((SelectableChannel) byteChannel).isBlocking();
    }

    /* renamed from: p */
    public int mo34366p(C10929e eVar, C10929e eVar2, C10929e eVar3) {
        C10929e eVar4 = null;
        C10929e H = eVar == null ? null : eVar.mo34557H();
        if (eVar2 != null) {
            eVar4 = eVar2.mo34557H();
        }
        if ((this.f21351a instanceof GatheringByteChannel) && eVar != null && eVar.length() != 0 && (H instanceof C10958e) && eVar2 != null && eVar2.length() != 0 && (eVar4 instanceof C10958e)) {
            return mo34670a(eVar, ((C10958e) H).mo34672z0(), eVar2, ((C10958e) eVar4).mo34672z0());
        }
        int u = (eVar == null || eVar.length() <= 0) ? 0 : mo34372u(eVar);
        if ((eVar == null || eVar.length() == 0) && eVar2 != null && eVar2.length() > 0) {
            u += mo34372u(eVar2);
        }
        return ((eVar == null || eVar.length() == 0) && (eVar2 == null || eVar2.length() == 0) && eVar3 != null && eVar3.length() > 0) ? mo34372u(eVar3) + u : u;
    }

    /* renamed from: q */
    public String mo34367q() {
        if (this.f21353c == null) {
            return null;
        }
        InetSocketAddress inetSocketAddress = this.f21354d;
        return (inetSocketAddress == null || inetSocketAddress.getAddress() == null || this.f21354d.getAddress().isAnyLocalAddress()) ? "0.0.0.0" : this.f21354d.getAddress().getHostAddress();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r1.f21353c;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo34368r() {
        /*
            r1 = this;
            boolean r0 = r1.f21358h
            if (r0 != 0) goto L_0x0019
            java.nio.channels.ByteChannel r0 = r1.f21351a
            boolean r0 = r0.isOpen()
            if (r0 == 0) goto L_0x0019
            java.net.Socket r0 = r1.f21353c
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
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p217d.p219v.C10955b.mo34368r():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r1.f21353c;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo34369s() {
        /*
            r1 = this;
            boolean r0 = r1.f21357g
            if (r0 != 0) goto L_0x0019
            java.nio.channels.ByteChannel r0 = r1.f21351a
            boolean r0 = r0.isOpen()
            if (r0 == 0) goto L_0x0019
            java.net.Socket r0 = r1.f21353c
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
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p217d.p219v.C10955b.mo34369s():boolean");
    }

    /* renamed from: t */
    public void mo34370t() {
        mo34669B();
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
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo34372u(p164h.p211a.p212a.p217d.C10929e r5) {
        /*
            r4 = this;
            h.a.a.d.e r0 = r5.mo34557H()
            boolean r1 = r0 instanceof p164h.p211a.p212a.p217d.p219v.C10958e
            if (r1 == 0) goto L_0x002e
            h.a.a.d.v.e r0 = (p164h.p211a.p212a.p217d.p219v.C10958e) r0
            java.nio.ByteBuffer r0 = r0.mo34672z0()
            java.nio.ByteBuffer r0 = r0.asReadOnlyBuffer()
            int r1 = r5.getIndex()     // Catch:{ all -> 0x002c }
            r0.position(r1)     // Catch:{ all -> 0x002c }
            int r1 = r5.mo34562S0()     // Catch:{ all -> 0x002c }
            r0.limit(r1)     // Catch:{ all -> 0x002c }
            java.nio.channels.ByteChannel r1 = r4.f21351a     // Catch:{ all -> 0x002c }
            int r0 = r1.write(r0)     // Catch:{ all -> 0x002c }
            if (r0 <= 0) goto L_0x0064
        L_0x0028:
            r5.mo34591u0(r0)
            goto L_0x0064
        L_0x002c:
            r5 = move-exception
            throw r5
        L_0x002e:
            boolean r1 = r0 instanceof p164h.p211a.p212a.p217d.p219v.C10959f
            if (r1 == 0) goto L_0x0045
            h.a.a.d.v.f r0 = (p164h.p211a.p212a.p217d.p219v.C10959f) r0
            java.nio.channels.ByteChannel r1 = r4.f21351a
            int r2 = r5.getIndex()
            int r3 = r5.length()
            int r0 = r0.mo34673d(r1, r2, r3)
            if (r0 <= 0) goto L_0x0064
            goto L_0x0028
        L_0x0045:
            byte[] r0 = r5.mo34608e0()
            if (r0 == 0) goto L_0x0065
            byte[] r0 = r5.mo34608e0()
            int r1 = r5.getIndex()
            int r2 = r5.length()
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0, r1, r2)
            java.nio.channels.ByteChannel r1 = r4.f21351a
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
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p217d.p219v.C10955b.mo34372u(h.a.a.d.e):int");
    }

    /* renamed from: v */
    public boolean mo34373v(long j) {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        if (r3 >= 0) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
        if (isOpen() == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        if (mo34369s() != false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        mo34362l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
        if (mo34368r() == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0045, code lost:
        r5.f21351a.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004c, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0063, code lost:
        f21350i.mo35493i("Exception while filling", r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0070, code lost:
        if (r5.f21351a.isOpen() != false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0072, code lost:
        r5.f21351a.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0078, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0079, code lost:
        f21350i.mo35488d(r0);
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
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo34374w(p164h.p211a.p212a.p217d.C10929e r6) {
        /*
            r5 = this;
            boolean r0 = r5.f21357g
            r1 = -1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            h.a.a.d.e r0 = r6.mo34557H()
            boolean r2 = r0 instanceof p164h.p211a.p212a.p217d.p219v.C10958e
            if (r2 == 0) goto L_0x0082
            h.a.a.d.v.e r0 = (p164h.p211a.p212a.p217d.p219v.C10958e) r0
            java.nio.ByteBuffer r0 = r0.mo34672z0()
            r2 = 0
            monitor-enter(r0)     // Catch:{ IOException -> 0x0062 }
            int r3 = r6.mo34562S0()     // Catch:{ all -> 0x0053 }
            r0.position(r3)     // Catch:{ all -> 0x0053 }
            java.nio.channels.ByteChannel r3 = r5.f21351a     // Catch:{ all -> 0x0053 }
            int r3 = r3.read(r0)     // Catch:{ all -> 0x0053 }
            int r4 = r0.position()     // Catch:{ all -> 0x0050 }
            r6.mo34575f0(r4)     // Catch:{ all -> 0x0050 }
            r0.position(r2)     // Catch:{ all -> 0x0050 }
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            if (r3 >= 0) goto L_0x004e
            boolean r6 = r5.isOpen()     // Catch:{ IOException -> 0x004b }
            if (r6 == 0) goto L_0x004e
            boolean r6 = r5.mo34369s()     // Catch:{ IOException -> 0x004b }
            if (r6 != 0) goto L_0x003f
            r5.mo34362l()     // Catch:{ IOException -> 0x004b }
        L_0x003f:
            boolean r6 = r5.mo34368r()     // Catch:{ IOException -> 0x004b }
            if (r6 == 0) goto L_0x004e
            java.nio.channels.ByteChannel r6 = r5.f21351a     // Catch:{ IOException -> 0x004b }
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
            r6.mo34575f0(r4)     // Catch:{ all -> 0x005f }
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
            h.a.a.h.y.c r0 = f21350i
            java.lang.String r3 = "Exception while filling"
            r0.mo35493i(r3, r6)
            java.nio.channels.ByteChannel r0 = r5.f21351a     // Catch:{ Exception -> 0x0078 }
            boolean r0 = r0.isOpen()     // Catch:{ Exception -> 0x0078 }
            if (r0 == 0) goto L_0x007e
            java.nio.channels.ByteChannel r0 = r5.f21351a     // Catch:{ Exception -> 0x0078 }
            r0.close()     // Catch:{ Exception -> 0x0078 }
            goto L_0x007e
        L_0x0078:
            r0 = move-exception
            h.a.a.h.y.c r3 = f21350i
            r3.mo35488d(r0)
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
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p217d.p219v.C10955b.mo34374w(h.a.a.d.e):int");
    }

    /* renamed from: x */
    public int mo34375x() {
        if (this.f21353c == null) {
            return 0;
        }
        InetSocketAddress inetSocketAddress = this.f21355e;
        if (inetSocketAddress == null) {
            return -1;
        }
        return inetSocketAddress.getPort();
    }

    /* renamed from: z */
    public ByteChannel mo34671z() {
        return this.f21351a;
    }
}
