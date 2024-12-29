package org.eclipse.jetty.client;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.net.ssl.SSLEngine;
import org.eclipse.jetty.client.C9871g;
import p147d6.C8942b;
import p152e6.C9001b;
import p152e6.C9003c;
import p162g6.C9085b;
import p172i6.C9128e;
import p225w5.C11939c;
import p225w5.C11940d;
import p225w5.C11948i;
import p225w5.C11949j;
import p229x5.C11983a;
import p229x5.C11989g;
import p229x5.C11992h;
import p229x5.C12000i;

/* renamed from: org.eclipse.jetty.client.k */
class C9880k extends C8942b implements C9871g.C9873b {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C9003c f17969k = C9001b.m21450a(C9880k.class);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C9871g f17970h;

    /* renamed from: i */
    private final C9882b f17971i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final Map<SocketChannel, C9128e.C9129a> f17972j = new ConcurrentHashMap();

    /* renamed from: org.eclipse.jetty.client.k$a */
    private class C9881a extends C9128e.C9129a {

        /* renamed from: e */
        private final SocketChannel f17973e;

        /* renamed from: f */
        private final HttpDestination f17974f;

        public C9881a(C9880k kVar, SocketChannel socketChannel, HttpDestination httpDestination) {
            this.f17973e = socketChannel;
            this.f17974f = httpDestination;
        }

        /* renamed from: f */
        public void mo37217f() {
            if (this.f17973e.isConnectionPending()) {
                C9880k.f17969k.mo36850e("Channel {} timed out while connecting, closing it", this.f17973e);
                try {
                    this.f17973e.close();
                } catch (IOException e) {
                    C9880k.f17969k.mo36849d(e);
                }
                this.f17974f.mo39504n(new SocketTimeoutException());
            }
        }
    }

    /* renamed from: org.eclipse.jetty.client.k$b */
    class C9882b extends C11992h {

        /* renamed from: r */
        C9003c f17975r = C9880k.f17969k;

        C9882b() {
        }

        /* renamed from: V0 */
        private synchronized SSLEngine m24028V0(SocketChannel socketChannel) {
            SSLEngine P0;
            C9085b Y0 = C9880k.this.f17970h.mo39574Y0();
            P0 = socketChannel != null ? Y0.mo37069P0(socketChannel.socket().getInetAddress().getHostAddress(), socketChannel.socket().getPort()) : Y0.mo37068O0();
            P0.setUseClientMode(true);
            P0.beginHandshake();
            return P0;
        }

        /* access modifiers changed from: protected */
        /* renamed from: L0 */
        public void mo39642L0(SocketChannel socketChannel, Throwable th, Object obj) {
            C9128e.C9129a aVar = (C9128e.C9129a) C9880k.this.f17972j.remove(socketChannel);
            if (aVar != null) {
                aVar.mo37215d();
            }
            if (obj instanceof HttpDestination) {
                ((HttpDestination) obj).mo39504n(th);
            } else {
                super.mo39642L0(socketChannel, th, obj);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: M0 */
        public void mo39643M0(C11989g gVar) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: N0 */
        public void mo39644N0(C11989g gVar) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: O0 */
        public void mo39645O0(C11948i iVar, C11949j jVar) {
        }

        /* renamed from: S0 */
        public C11983a mo39646S0(SocketChannel socketChannel, C11939c cVar, Object obj) {
            return new C9867c(C9880k.this.f17970h.mo39592r0(), C9880k.this.f17970h.mo39572X(), cVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: T0 */
        public C11989g mo39647T0(SocketChannel socketChannel, C11992h.C11996d dVar, SelectionKey selectionKey) {
            C11939c cVar;
            C9128e.C9129a aVar = (C9128e.C9129a) C9880k.this.f17972j.remove(socketChannel);
            if (aVar != null) {
                aVar.mo37215d();
            }
            if (this.f17975r.mo36846a()) {
                this.f17975r.mo36850e("Channels with connection pending: {}", Integer.valueOf(C9880k.this.f17972j.size()));
            }
            HttpDestination httpDestination = (HttpDestination) selectionKey.attachment();
            C11989g gVar = new C11989g(socketChannel, dVar, selectionKey, (int) C9880k.this.f17970h.mo39568T0());
            if (httpDestination.mo39503m()) {
                this.f17975r.mo36850e("secure to {}, proxied={}", socketChannel, Boolean.valueOf(httpDestination.mo39502l()));
                cVar = new C9883c(gVar, m24028V0(socketChannel));
            } else {
                cVar = gVar;
            }
            C11983a S0 = dVar.mo42584j().mo39646S0(socketChannel, cVar, selectionKey.attachment());
            cVar.mo39661j(S0);
            C9861a aVar2 = (C9861a) S0;
            aVar2.mo39528s(httpDestination);
            if (httpDestination.mo39503m() && !httpDestination.mo39502l()) {
                ((C9883c) cVar).mo39650a();
            }
            httpDestination.mo39506p(aVar2);
            return gVar;
        }

        /* renamed from: h0 */
        public boolean mo39648h0(Runnable runnable) {
            return C9880k.this.f17970h.f17924n.mo37186h0(runnable);
        }
    }

    /* renamed from: org.eclipse.jetty.client.k$c */
    public static class C9883c implements C11939c {

        /* renamed from: a */
        C11939c f17977a;

        /* renamed from: b */
        SSLEngine f17978b;

        public C9883c(C11939c cVar, SSLEngine sSLEngine) {
            this.f17978b = sSLEngine;
            this.f17977a = cVar;
        }

        /* renamed from: A */
        public void mo39649A() {
            this.f17977a.mo39649A();
        }

        /* renamed from: a */
        public void mo39650a() {
            C9867c cVar = (C9867c) this.f17977a.mo39657g();
            C12000i iVar = new C12000i(this.f17978b, this.f17977a);
            this.f17977a.mo39661j(iVar);
            this.f17977a = iVar.mo42595C();
            iVar.mo42595C().mo39661j(cVar);
            C9880k.f17969k.mo36850e("upgrade {} to {} for {}", this, iVar, cVar);
        }

        /* renamed from: b */
        public void mo39651b(C9128e.C9129a aVar, long j) {
            this.f17977a.mo39651b(aVar, j);
        }

        /* renamed from: c */
        public void mo39652c() {
            this.f17977a.mo39649A();
        }

        public void close() {
            this.f17977a.close();
        }

        /* renamed from: d */
        public boolean mo39653d() {
            return this.f17977a.mo39653d();
        }

        /* renamed from: e */
        public int mo39654e() {
            return this.f17977a.mo39654e();
        }

        /* renamed from: f */
        public int mo39655f() {
            return this.f17977a.mo39655f();
        }

        public void flush() {
            this.f17977a.flush();
        }

        /* renamed from: g */
        public C11949j mo39657g() {
            return this.f17977a.mo39657g();
        }

        /* renamed from: h */
        public String mo39658h() {
            return this.f17977a.mo39658h();
        }

        /* renamed from: i */
        public void mo39659i(int i) {
            this.f17977a.mo39659i(i);
        }

        public boolean isOpen() {
            return this.f17977a.isOpen();
        }

        /* renamed from: j */
        public void mo39661j(C11949j jVar) {
            this.f17977a.mo39661j(jVar);
        }

        /* renamed from: k */
        public int mo39662k(C11940d dVar, C11940d dVar2, C11940d dVar3) {
            return this.f17977a.mo39662k(dVar, dVar2, dVar3);
        }

        /* renamed from: l */
        public void mo39663l() {
            this.f17977a.mo39663l();
        }

        /* renamed from: m */
        public String mo39664m() {
            return this.f17977a.mo39664m();
        }

        /* renamed from: n */
        public boolean mo39665n(long j) {
            return this.f17977a.mo39665n(j);
        }

        /* renamed from: o */
        public boolean mo39666o() {
            return this.f17977a.mo39666o();
        }

        /* renamed from: q */
        public String mo39667q() {
            return this.f17977a.mo39667q();
        }

        /* renamed from: r */
        public boolean mo39668r() {
            return this.f17977a.mo39668r();
        }

        /* renamed from: s */
        public boolean mo39669s() {
            return this.f17977a.mo39669s();
        }

        /* renamed from: t */
        public void mo39670t() {
            this.f17977a.mo39670t();
        }

        public String toString() {
            return "Upgradable:" + this.f17977a.toString();
        }

        /* renamed from: u */
        public boolean mo39672u(long j) {
            return this.f17977a.mo39672u(j);
        }

        /* renamed from: v */
        public void mo39673v(C9128e.C9129a aVar) {
            this.f17977a.mo39673v(aVar);
        }

        /* renamed from: x */
        public int mo39674x(C11940d dVar) {
            return this.f17977a.mo39674x(dVar);
        }

        /* renamed from: y */
        public int mo39675y() {
            return this.f17977a.mo39675y();
        }

        /* renamed from: z */
        public int mo26552z(C11940d dVar) {
            return this.f17977a.mo26552z(dVar);
        }
    }

    C9880k(C9871g gVar) {
        C9882b bVar = new C9882b();
        this.f17971i = bVar;
        this.f17970h = gVar;
        mo36754E0(gVar, false);
        mo36754E0(bVar, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0064, code lost:
        if (r0 == null) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0068, code lost:
        if (r0 == null) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006d, code lost:
        r6.mo39504n(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        return;
     */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo39594U(org.eclipse.jetty.client.HttpDestination r6) {
        /*
            r5 = this;
            r0 = 0
            java.nio.channels.SocketChannel r0 = java.nio.channels.SocketChannel.open()     // Catch:{ UnresolvedAddressException -> 0x0067, IOException -> 0x0063 }
            boolean r1 = r6.mo39502l()     // Catch:{ UnresolvedAddressException -> 0x0067, IOException -> 0x0063 }
            if (r1 == 0) goto L_0x0010
            org.eclipse.jetty.client.b r1 = r6.mo39500j()     // Catch:{ UnresolvedAddressException -> 0x0067, IOException -> 0x0063 }
            goto L_0x0014
        L_0x0010:
            org.eclipse.jetty.client.b r1 = r6.mo39496f()     // Catch:{ UnresolvedAddressException -> 0x0067, IOException -> 0x0063 }
        L_0x0014:
            java.net.Socket r2 = r0.socket()     // Catch:{ UnresolvedAddressException -> 0x0067, IOException -> 0x0063 }
            r3 = 1
            r2.setTcpNoDelay(r3)     // Catch:{ UnresolvedAddressException -> 0x0067, IOException -> 0x0063 }
            org.eclipse.jetty.client.g r2 = r5.f17970h     // Catch:{ UnresolvedAddressException -> 0x0067, IOException -> 0x0063 }
            boolean r2 = r2.mo39581c1()     // Catch:{ UnresolvedAddressException -> 0x0067, IOException -> 0x0063 }
            r3 = 0
            if (r2 == 0) goto L_0x003f
            java.net.Socket r2 = r0.socket()     // Catch:{ UnresolvedAddressException -> 0x0067, IOException -> 0x0063 }
            java.net.InetSocketAddress r1 = r1.mo39552c()     // Catch:{ UnresolvedAddressException -> 0x0067, IOException -> 0x0063 }
            org.eclipse.jetty.client.g r4 = r5.f17970h     // Catch:{ UnresolvedAddressException -> 0x0067, IOException -> 0x0063 }
            int r4 = r4.mo39566R0()     // Catch:{ UnresolvedAddressException -> 0x0067, IOException -> 0x0063 }
            r2.connect(r1, r4)     // Catch:{ UnresolvedAddressException -> 0x0067, IOException -> 0x0063 }
            r0.configureBlocking(r3)     // Catch:{ UnresolvedAddressException -> 0x0067, IOException -> 0x0063 }
            org.eclipse.jetty.client.k$b r1 = r5.f17971i     // Catch:{ UnresolvedAddressException -> 0x0067, IOException -> 0x0063 }
            r1.mo42576U0(r0, r6)     // Catch:{ UnresolvedAddressException -> 0x0067, IOException -> 0x0063 }
            goto L_0x0070
        L_0x003f:
            r0.configureBlocking(r3)     // Catch:{ UnresolvedAddressException -> 0x0067, IOException -> 0x0063 }
            java.net.InetSocketAddress r1 = r1.mo39552c()     // Catch:{ UnresolvedAddressException -> 0x0067, IOException -> 0x0063 }
            r0.connect(r1)     // Catch:{ UnresolvedAddressException -> 0x0067, IOException -> 0x0063 }
            org.eclipse.jetty.client.k$b r1 = r5.f17971i     // Catch:{ UnresolvedAddressException -> 0x0067, IOException -> 0x0063 }
            r1.mo42576U0(r0, r6)     // Catch:{ UnresolvedAddressException -> 0x0067, IOException -> 0x0063 }
            org.eclipse.jetty.client.k$a r1 = new org.eclipse.jetty.client.k$a     // Catch:{ UnresolvedAddressException -> 0x0067, IOException -> 0x0063 }
            r1.<init>(r5, r0, r6)     // Catch:{ UnresolvedAddressException -> 0x0067, IOException -> 0x0063 }
            org.eclipse.jetty.client.g r2 = r5.f17970h     // Catch:{ UnresolvedAddressException -> 0x0067, IOException -> 0x0063 }
            int r3 = r2.mo39566R0()     // Catch:{ UnresolvedAddressException -> 0x0067, IOException -> 0x0063 }
            long r3 = (long) r3     // Catch:{ UnresolvedAddressException -> 0x0067, IOException -> 0x0063 }
            r2.mo39585f1(r1, r3)     // Catch:{ UnresolvedAddressException -> 0x0067, IOException -> 0x0063 }
            java.util.Map<java.nio.channels.SocketChannel, i6.e$a> r2 = r5.f17972j     // Catch:{ UnresolvedAddressException -> 0x0067, IOException -> 0x0063 }
            r2.put(r0, r1)     // Catch:{ UnresolvedAddressException -> 0x0067, IOException -> 0x0063 }
            goto L_0x0070
        L_0x0063:
            r1 = move-exception
            if (r0 == 0) goto L_0x006d
            goto L_0x006a
        L_0x0067:
            r1 = move-exception
            if (r0 == 0) goto L_0x006d
        L_0x006a:
            r0.close()
        L_0x006d:
            r6.mo39504n(r1)
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.client.C9880k.mo39594U(org.eclipse.jetty.client.HttpDestination):void");
    }
}
