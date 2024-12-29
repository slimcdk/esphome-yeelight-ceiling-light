package org.eclipse.jetty.p195io.bio;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import p152e6.C9001b;
import p152e6.C9003c;

/* renamed from: org.eclipse.jetty.io.bio.a */
public class C9921a extends C9922b {

    /* renamed from: i */
    private static final C9003c f18167i = C9001b.m21450a(C9921a.class);

    /* renamed from: f */
    final Socket f18168f;

    /* renamed from: g */
    final InetSocketAddress f18169g;

    /* renamed from: h */
    final InetSocketAddress f18170h;

    public C9921a(Socket socket) {
        super(socket.getInputStream(), socket.getOutputStream());
        this.f18168f = socket;
        this.f18169g = (InetSocketAddress) socket.getLocalSocketAddress();
        this.f18170h = (InetSocketAddress) socket.getRemoteSocketAddress();
        super.mo39659i(socket.getSoTimeout());
    }

    protected C9921a(Socket socket, int i) {
        super(socket.getInputStream(), socket.getOutputStream());
        this.f18168f = socket;
        this.f18169g = (InetSocketAddress) socket.getLocalSocketAddress();
        this.f18170h = (InetSocketAddress) socket.getRemoteSocketAddress();
        socket.setSoTimeout(i > 0 ? i : 0);
        super.mo39659i(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo39872D() {
        try {
            if (!mo39669s()) {
                mo39663l();
            }
        } catch (IOException e) {
            f18167i.mo36849d(e);
            this.f18168f.close();
        }
    }

    /* renamed from: F */
    public void mo39873F() {
        if (!this.f18168f.isClosed()) {
            if (!this.f18168f.isInputShutdown()) {
                this.f18168f.shutdownInput();
            }
            if (this.f18168f.isOutputShutdown()) {
                this.f18168f.close();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo39874G() {
        if (!this.f18168f.isClosed()) {
            if (!this.f18168f.isOutputShutdown()) {
                this.f18168f.shutdownOutput();
            }
            if (this.f18168f.isInputShutdown()) {
                this.f18168f.close();
            }
        }
    }

    public void close() {
        this.f18168f.close();
        this.f18171a = null;
        this.f18172b = null;
    }

    /* renamed from: e */
    public int mo39654e() {
        InetSocketAddress inetSocketAddress = this.f18169g;
        if (inetSocketAddress == null) {
            return -1;
        }
        return inetSocketAddress.getPort();
    }

    /* renamed from: h */
    public String mo39658h() {
        InetAddress address;
        InetSocketAddress inetSocketAddress = this.f18170h;
        if (inetSocketAddress == null || (address = inetSocketAddress.getAddress()) == null) {
            return null;
        }
        return address.getHostAddress();
    }

    /* renamed from: i */
    public void mo39659i(int i) {
        if (i != mo39655f()) {
            this.f18168f.setSoTimeout(i > 0 ? i : 0);
        }
        super.mo39659i(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f18168f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isOpen() {
        /*
            r1 = this;
            boolean r0 = super.isOpen()
            if (r0 == 0) goto L_0x0012
            java.net.Socket r0 = r1.f18168f
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.isClosed()
            if (r0 != 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.p195io.bio.C9921a.isOpen():boolean");
    }

    /* renamed from: l */
    public void mo39663l() {
        if (this.f18168f instanceof SSLSocket) {
            super.mo39663l();
        } else {
            mo39873F();
        }
    }

    /* renamed from: m */
    public String mo39664m() {
        InetSocketAddress inetSocketAddress = this.f18169g;
        return (inetSocketAddress == null || inetSocketAddress.getAddress() == null || this.f18169g.getAddress().isAnyLocalAddress()) ? "0.0.0.0" : this.f18169g.getAddress().getCanonicalHostName();
    }

    /* renamed from: q */
    public String mo39667q() {
        InetSocketAddress inetSocketAddress = this.f18169g;
        return (inetSocketAddress == null || inetSocketAddress.getAddress() == null || this.f18169g.getAddress().isAnyLocalAddress()) ? "0.0.0.0" : this.f18169g.getAddress().getHostAddress();
    }

    /* renamed from: r */
    public boolean mo39668r() {
        Socket socket = this.f18168f;
        return socket instanceof SSLSocket ? super.mo39668r() : socket.isClosed() || this.f18168f.isOutputShutdown();
    }

    /* renamed from: s */
    public boolean mo39669s() {
        Socket socket = this.f18168f;
        return socket instanceof SSLSocket ? super.mo39669s() : socket.isClosed() || this.f18168f.isInputShutdown();
    }

    /* renamed from: t */
    public void mo39670t() {
        if (this.f18168f instanceof SSLSocket) {
            super.mo39670t();
        } else {
            mo39874G();
        }
    }

    public String toString() {
        return this.f18169g + " <--> " + this.f18170h;
    }
}
