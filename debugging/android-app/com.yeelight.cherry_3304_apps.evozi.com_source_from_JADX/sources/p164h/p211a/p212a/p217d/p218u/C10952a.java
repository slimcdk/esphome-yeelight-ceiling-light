package p164h.p211a.p212a.p217d.p218u;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.d.u.a */
public class C10952a extends C10953b {

    /* renamed from: i */
    private static final C11158c f21341i = C11156b.m29015a(C10952a.class);

    /* renamed from: f */
    final Socket f21342f;

    /* renamed from: g */
    final InetSocketAddress f21343g;

    /* renamed from: h */
    final InetSocketAddress f21344h = ((InetSocketAddress) this.f21342f.getRemoteSocketAddress());

    public C10952a(Socket socket) {
        super(socket.getInputStream(), socket.getOutputStream());
        this.f21342f = socket;
        this.f21343g = (InetSocketAddress) socket.getLocalSocketAddress();
        super.mo34360j(this.f21342f.getSoTimeout());
    }

    protected C10952a(Socket socket, int i) {
        super(socket.getInputStream(), socket.getOutputStream());
        this.f21342f = socket;
        this.f21343g = (InetSocketAddress) socket.getLocalSocketAddress();
        this.f21342f.setSoTimeout(i > 0 ? i : 0);
        super.mo34360j(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo34662A() {
        try {
            if (!mo34369s()) {
                mo34362l();
            }
        } catch (IOException e) {
            f21341i.mo35488d(e);
            this.f21342f.close();
        }
    }

    /* renamed from: C */
    public void mo34663C() {
        if (!this.f21342f.isClosed()) {
            if (!this.f21342f.isInputShutdown()) {
                this.f21342f.shutdownInput();
            }
            if (this.f21342f.isOutputShutdown()) {
                this.f21342f.close();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final void mo34664D() {
        if (!this.f21342f.isClosed()) {
            if (!this.f21342f.isOutputShutdown()) {
                this.f21342f.shutdownOutput();
            }
            if (this.f21342f.isInputShutdown()) {
                this.f21342f.close();
            }
        }
    }

    public void close() {
        this.f21342f.close();
        this.f21345a = null;
        this.f21346b = null;
    }

    /* renamed from: f */
    public int mo34354f() {
        InetSocketAddress inetSocketAddress = this.f21343g;
        if (inetSocketAddress == null) {
            return -1;
        }
        return inetSocketAddress.getPort();
    }

    /* renamed from: i */
    public String mo34358i() {
        InetAddress address;
        InetSocketAddress inetSocketAddress = this.f21344h;
        if (inetSocketAddress == null || (address = inetSocketAddress.getAddress()) == null) {
            return null;
        }
        return address.getHostAddress();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f21342f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isOpen() {
        /*
            r1 = this;
            boolean r0 = super.isOpen()
            if (r0 == 0) goto L_0x0012
            java.net.Socket r0 = r1.f21342f
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
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p217d.p218u.C10952a.isOpen():boolean");
    }

    /* renamed from: j */
    public void mo34360j(int i) {
        if (i != mo34356g()) {
            this.f21342f.setSoTimeout(i > 0 ? i : 0);
        }
        super.mo34360j(i);
    }

    /* renamed from: l */
    public void mo34362l() {
        if (this.f21342f instanceof SSLSocket) {
            super.mo34362l();
        } else {
            mo34663C();
        }
    }

    /* renamed from: m */
    public String mo34363m() {
        InetSocketAddress inetSocketAddress = this.f21343g;
        return (inetSocketAddress == null || inetSocketAddress.getAddress() == null || this.f21343g.getAddress().isAnyLocalAddress()) ? "0.0.0.0" : this.f21343g.getAddress().getCanonicalHostName();
    }

    /* renamed from: q */
    public String mo34367q() {
        InetSocketAddress inetSocketAddress = this.f21343g;
        return (inetSocketAddress == null || inetSocketAddress.getAddress() == null || this.f21343g.getAddress().isAnyLocalAddress()) ? "0.0.0.0" : this.f21343g.getAddress().getHostAddress();
    }

    /* renamed from: r */
    public boolean mo34368r() {
        Socket socket = this.f21342f;
        return socket instanceof SSLSocket ? super.mo34368r() : socket.isClosed() || this.f21342f.isOutputShutdown();
    }

    /* renamed from: s */
    public boolean mo34369s() {
        Socket socket = this.f21342f;
        return socket instanceof SSLSocket ? super.mo34369s() : socket.isClosed() || this.f21342f.isInputShutdown();
    }

    /* renamed from: t */
    public void mo34370t() {
        if (this.f21342f instanceof SSLSocket) {
            super.mo34370t();
        } else {
            mo34664D();
        }
    }

    public String toString() {
        return this.f21343g + " <--> " + this.f21344h;
    }

    /* renamed from: x */
    public int mo34375x() {
        InetSocketAddress inetSocketAddress = this.f21344h;
        if (inetSocketAddress == null) {
            return -1;
        }
        return inetSocketAddress.getPort();
    }
}
