package p164h.p211a.p212a.p213a;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.net.ssl.SSLEngine;
import p164h.p211a.p212a.p213a.C10862g;
import p164h.p211a.p212a.p217d.C10928d;
import p164h.p211a.p212a.p217d.C10929e;
import p164h.p211a.p212a.p217d.C10940l;
import p164h.p211a.p212a.p217d.C10941m;
import p164h.p211a.p212a.p217d.p219v.C10954a;
import p164h.p211a.p212a.p217d.p219v.C10960g;
import p164h.p211a.p212a.p217d.p219v.C10963h;
import p164h.p211a.p212a.p217d.p219v.C10971i;
import p164h.p211a.p212a.p228h.p230b0.C11102b;
import p164h.p211a.p212a.p228h.p232d0.C11115e;
import p164h.p211a.p212a.p228h.p233x.C11146b;
import p164h.p211a.p212a.p228h.p233x.C11152d;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.a.l */
class C10874l extends C11146b implements C10862g.C10864b, C11152d {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C11158c f21038k = C11156b.m29015a(C10874l.class);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C10862g f21039h;

    /* renamed from: i */
    private final C10876b f21040i = new C10876b();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final Map<SocketChannel, C11115e.C11116a> f21041j = new ConcurrentHashMap();

    /* renamed from: h.a.a.a.l$a */
    private class C10875a extends C11115e.C11116a {

        /* renamed from: g */
        private final SocketChannel f21042g;

        /* renamed from: h */
        private final C10866h f21043h;

        public C10875a(C10874l lVar, SocketChannel socketChannel, C10866h hVar) {
            this.f21042g = socketChannel;
            this.f21043h = hVar;
        }

        /* renamed from: f */
        public void mo34200f() {
            if (this.f21042g.isConnectionPending()) {
                C10874l.f21038k.mo35489e("Channel {} timed out while connecting, closing it", this.f21042g);
                try {
                    this.f21042g.close();
                } catch (IOException e) {
                    C10874l.f21038k.mo35488d(e);
                }
                this.f21043h.mo34278n(new SocketTimeoutException());
            }
        }
    }

    /* renamed from: h.a.a.a.l$b */
    class C10876b extends C10963h {

        /* renamed from: r */
        C11158c f21044r = C10874l.f21038k;

        C10876b() {
        }

        /* renamed from: Q0 */
        private synchronized SSLEngine m27302Q0(SocketChannel socketChannel) {
            SSLEngine K0;
            C11102b T0 = C10874l.this.f21039h.mo34242T0();
            K0 = socketChannel != null ? T0.mo35274K0(socketChannel.socket().getInetAddress().getHostAddress(), socketChannel.socket().getPort()) : T0.mo35273J0();
            K0.setUseClientMode(true);
            K0.beginHandshake();
            return K0;
        }

        /* access modifiers changed from: protected */
        /* renamed from: G0 */
        public void mo34341G0(SocketChannel socketChannel, Throwable th, Object obj) {
            C11115e.C11116a aVar = (C11115e.C11116a) C10874l.this.f21041j.remove(socketChannel);
            if (aVar != null) {
                aVar.mo35320d();
            }
            if (obj instanceof C10866h) {
                ((C10866h) obj).mo34278n(th);
            } else {
                super.mo34341G0(socketChannel, th, obj);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: H0 */
        public void mo34342H0(C10960g gVar) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: I0 */
        public void mo34343I0(C10960g gVar) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: J0 */
        public void mo34344J0(C10940l lVar, C10941m mVar) {
        }

        /* renamed from: N0 */
        public C10954a mo34345N0(SocketChannel socketChannel, C10928d dVar, Object obj) {
            return new C10858c(C10874l.this.f21039h.mo34261m0(), C10874l.this.f21039h.mo34245W(), dVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: O0 */
        public C10960g mo34346O0(SocketChannel socketChannel, C10963h.C10967d dVar, SelectionKey selectionKey) {
            C10928d dVar2;
            C11115e.C11116a aVar = (C11115e.C11116a) C10874l.this.f21041j.remove(socketChannel);
            if (aVar != null) {
                aVar.mo35320d();
            }
            if (this.f21044r.mo35485a()) {
                this.f21044r.mo35489e("Channels with connection pending: {}", Integer.valueOf(C10874l.this.f21041j.size()));
            }
            C10866h hVar = (C10866h) selectionKey.attachment();
            C10960g gVar = new C10960g(socketChannel, dVar, selectionKey, (int) C10874l.this.f21039h.mo34237O0());
            if (hVar.mo34277m()) {
                this.f21044r.mo35489e("secure to {}, proxied={}", socketChannel, Boolean.valueOf(hVar.mo34276l()));
                dVar2 = new C10877c(gVar, m27302Q0(socketChannel));
            } else {
                dVar2 = gVar;
            }
            C10954a N0 = dVar.mo34698j().mo34345N0(socketChannel, dVar2, selectionKey.attachment());
            dVar2.mo34361k(N0);
            C10852a aVar2 = (C10852a) N0;
            aVar2.mo34196s(hVar);
            if (hVar.mo34277m() && !hVar.mo34276l()) {
                ((C10877c) dVar2).mo34348a();
            }
            hVar.mo34280p(aVar2);
            return gVar;
        }

        /* renamed from: e0 */
        public boolean mo34347e0(Runnable runnable) {
            return C10874l.this.f21039h.f20972n.mo35291e0(runnable);
        }
    }

    /* renamed from: h.a.a.a.l$c */
    public static class C10877c implements C10928d {

        /* renamed from: a */
        C10928d f21046a;

        /* renamed from: b */
        SSLEngine f21047b;

        public C10877c(C10928d dVar, SSLEngine sSLEngine) {
            this.f21047b = sSLEngine;
            this.f21046a = dVar;
        }

        /* renamed from: a */
        public void mo34348a() {
            C10858c cVar = (C10858c) this.f21046a.mo34357h();
            C10971i iVar = new C10971i(this.f21047b, this.f21046a);
            this.f21046a.mo34361k(iVar);
            this.f21046a = iVar.mo34709C();
            iVar.mo34709C().mo34361k(cVar);
            C10874l.f21038k.mo35489e("upgrade {} to {} for {}", this, iVar, cVar);
        }

        /* renamed from: b */
        public void mo34349b(C11115e.C11116a aVar, long j) {
            this.f21046a.mo34349b(aVar, j);
        }

        /* renamed from: c */
        public void mo34350c() {
            this.f21046a.mo34376y();
        }

        public void close() {
            this.f21046a.close();
        }

        /* renamed from: d */
        public boolean mo34352d() {
            return this.f21046a.mo34352d();
        }

        /* renamed from: e */
        public void mo34353e(C11115e.C11116a aVar) {
            this.f21046a.mo34353e(aVar);
        }

        /* renamed from: f */
        public int mo34354f() {
            return this.f21046a.mo34354f();
        }

        public void flush() {
            this.f21046a.flush();
        }

        /* renamed from: g */
        public int mo34356g() {
            return this.f21046a.mo34356g();
        }

        /* renamed from: h */
        public C10941m mo34357h() {
            return this.f21046a.mo34357h();
        }

        /* renamed from: i */
        public String mo34358i() {
            return this.f21046a.mo34358i();
        }

        public boolean isOpen() {
            return this.f21046a.isOpen();
        }

        /* renamed from: j */
        public void mo34360j(int i) {
            this.f21046a.mo34360j(i);
        }

        /* renamed from: k */
        public void mo34361k(C10941m mVar) {
            this.f21046a.mo34361k(mVar);
        }

        /* renamed from: l */
        public void mo34362l() {
            this.f21046a.mo34362l();
        }

        /* renamed from: m */
        public String mo34363m() {
            return this.f21046a.mo34363m();
        }

        /* renamed from: n */
        public boolean mo34364n(long j) {
            return this.f21046a.mo34364n(j);
        }

        /* renamed from: o */
        public boolean mo34365o() {
            return this.f21046a.mo34365o();
        }

        /* renamed from: p */
        public int mo34366p(C10929e eVar, C10929e eVar2, C10929e eVar3) {
            return this.f21046a.mo34366p(eVar, eVar2, eVar3);
        }

        /* renamed from: q */
        public String mo34367q() {
            return this.f21046a.mo34367q();
        }

        /* renamed from: r */
        public boolean mo34368r() {
            return this.f21046a.mo34368r();
        }

        /* renamed from: s */
        public boolean mo34369s() {
            return this.f21046a.mo34369s();
        }

        /* renamed from: t */
        public void mo34370t() {
            this.f21046a.mo34370t();
        }

        public String toString() {
            return "Upgradable:" + this.f21046a.toString();
        }

        /* renamed from: u */
        public int mo34372u(C10929e eVar) {
            return this.f21046a.mo34372u(eVar);
        }

        /* renamed from: v */
        public boolean mo34373v(long j) {
            return this.f21046a.mo34373v(j);
        }

        /* renamed from: w */
        public int mo34374w(C10929e eVar) {
            return this.f21046a.mo34374w(eVar);
        }

        /* renamed from: x */
        public int mo34375x() {
            return this.f21046a.mo34375x();
        }

        /* renamed from: y */
        public void mo34376y() {
            this.f21046a.mo34376y();
        }
    }

    C10874l(C10862g gVar) {
        this.f21039h = gVar;
        mo35462z0(gVar, false);
        mo35462z0(this.f21040i, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0066, code lost:
        if (r0 == null) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006a, code lost:
        if (r0 == null) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006c, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006f, code lost:
        r6.mo34278n(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        return;
     */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo34265T(p164h.p211a.p212a.p213a.C10866h r6) {
        /*
            r5 = this;
            r0 = 0
            java.nio.channels.SocketChannel r0 = java.nio.channels.SocketChannel.open()     // Catch:{ UnresolvedAddressException -> 0x0069, IOException -> 0x0065 }
            boolean r1 = r6.mo34276l()     // Catch:{ UnresolvedAddressException -> 0x0069, IOException -> 0x0065 }
            if (r1 == 0) goto L_0x0010
            h.a.a.a.b r1 = r6.mo34274j()     // Catch:{ UnresolvedAddressException -> 0x0069, IOException -> 0x0065 }
            goto L_0x0014
        L_0x0010:
            h.a.a.a.b r1 = r6.mo34270f()     // Catch:{ UnresolvedAddressException -> 0x0069, IOException -> 0x0065 }
        L_0x0014:
            java.net.Socket r2 = r0.socket()     // Catch:{ UnresolvedAddressException -> 0x0069, IOException -> 0x0065 }
            r3 = 1
            r2.setTcpNoDelay(r3)     // Catch:{ UnresolvedAddressException -> 0x0069, IOException -> 0x0065 }
            h.a.a.a.g r2 = r5.f21039h     // Catch:{ UnresolvedAddressException -> 0x0069, IOException -> 0x0065 }
            boolean r2 = r2.mo34247X0()     // Catch:{ UnresolvedAddressException -> 0x0069, IOException -> 0x0065 }
            r3 = 0
            if (r2 == 0) goto L_0x003f
            java.net.Socket r2 = r0.socket()     // Catch:{ UnresolvedAddressException -> 0x0069, IOException -> 0x0065 }
            java.net.InetSocketAddress r1 = r1.mo34221c()     // Catch:{ UnresolvedAddressException -> 0x0069, IOException -> 0x0065 }
            h.a.a.a.g r4 = r5.f21039h     // Catch:{ UnresolvedAddressException -> 0x0069, IOException -> 0x0065 }
            int r4 = r4.mo34235M0()     // Catch:{ UnresolvedAddressException -> 0x0069, IOException -> 0x0065 }
            r2.connect(r1, r4)     // Catch:{ UnresolvedAddressException -> 0x0069, IOException -> 0x0065 }
            r0.configureBlocking(r3)     // Catch:{ UnresolvedAddressException -> 0x0069, IOException -> 0x0065 }
            h.a.a.a.l$b r1 = r5.f21040i     // Catch:{ UnresolvedAddressException -> 0x0069, IOException -> 0x0065 }
            r1.mo34690P0(r0, r6)     // Catch:{ UnresolvedAddressException -> 0x0069, IOException -> 0x0065 }
            goto L_0x0072
        L_0x003f:
            r0.configureBlocking(r3)     // Catch:{ UnresolvedAddressException -> 0x0069, IOException -> 0x0065 }
            java.net.InetSocketAddress r1 = r1.mo34221c()     // Catch:{ UnresolvedAddressException -> 0x0069, IOException -> 0x0065 }
            r0.connect(r1)     // Catch:{ UnresolvedAddressException -> 0x0069, IOException -> 0x0065 }
            h.a.a.a.l$b r1 = r5.f21040i     // Catch:{ UnresolvedAddressException -> 0x0069, IOException -> 0x0065 }
            r1.mo34690P0(r0, r6)     // Catch:{ UnresolvedAddressException -> 0x0069, IOException -> 0x0065 }
            h.a.a.a.l$a r1 = new h.a.a.a.l$a     // Catch:{ UnresolvedAddressException -> 0x0069, IOException -> 0x0065 }
            r1.<init>(r5, r0, r6)     // Catch:{ UnresolvedAddressException -> 0x0069, IOException -> 0x0065 }
            h.a.a.a.g r2 = r5.f21039h     // Catch:{ UnresolvedAddressException -> 0x0069, IOException -> 0x0065 }
            h.a.a.a.g r3 = r5.f21039h     // Catch:{ UnresolvedAddressException -> 0x0069, IOException -> 0x0065 }
            int r3 = r3.mo34235M0()     // Catch:{ UnresolvedAddressException -> 0x0069, IOException -> 0x0065 }
            long r3 = (long) r3     // Catch:{ UnresolvedAddressException -> 0x0069, IOException -> 0x0065 }
            r2.mo34252a1(r1, r3)     // Catch:{ UnresolvedAddressException -> 0x0069, IOException -> 0x0065 }
            java.util.Map<java.nio.channels.SocketChannel, h.a.a.h.d0.e$a> r2 = r5.f21041j     // Catch:{ UnresolvedAddressException -> 0x0069, IOException -> 0x0065 }
            r2.put(r0, r1)     // Catch:{ UnresolvedAddressException -> 0x0069, IOException -> 0x0065 }
            goto L_0x0072
        L_0x0065:
            r1 = move-exception
            if (r0 == 0) goto L_0x006f
            goto L_0x006c
        L_0x0069:
            r1 = move-exception
            if (r0 == 0) goto L_0x006f
        L_0x006c:
            r0.close()
        L_0x006f:
            r6.mo34278n(r1)
        L_0x0072:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p213a.C10874l.mo34265T(h.a.a.a.h):void");
    }
}
