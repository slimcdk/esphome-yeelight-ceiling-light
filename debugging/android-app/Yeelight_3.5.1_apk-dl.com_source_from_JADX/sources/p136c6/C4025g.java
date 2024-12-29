package p136c6;

import java.util.EnumSet;
import javax.servlet.DispatcherType;
import javax.servlet.SessionTrackingMode;
import javax.servlet.http.C9277a;
import javax.servlet.http.C9279c;
import javax.servlet.http.C9281e;
import javax.servlet.http.Cookie;
import org.eclipse.jetty.server.handler.C9951i;
import p152e6.C9001b;
import p152e6.C9003c;
import p239z5.C12175i;
import p239z5.C12181o;
import p239z5.C12187r;
import p239z5.C12192v;

/* renamed from: c6.g */
public class C4025g extends C9951i {

    /* renamed from: o */
    static final C9003c f6851o = C9001b.m21451b("org.eclipse.jetty.server.session");

    /* renamed from: n */
    private C12192v f6852n;

    static {
        EnumSet.of(SessionTrackingMode.COOKIE, SessionTrackingMode.URL);
    }

    public C4025g() {
        this(new C4020e());
    }

    public C4025g(C12192v vVar) {
        mo26715a1(vVar);
    }

    /* renamed from: T0 */
    public void mo26711T0(String str, C12181o oVar, C9277a aVar, C9279c cVar) {
        if (mo39985V0()) {
            mo39986W0(str, oVar, aVar, cVar);
            return;
        }
        C9951i iVar = this.f18270l;
        if (iVar == null || iVar != this.f18267j) {
            C12175i iVar2 = this.f18267j;
            if (iVar2 != null) {
                iVar2.mo39972q(str, oVar, aVar, cVar);
                return;
            }
            return;
        }
        iVar.mo26711T0(str, oVar, aVar, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c2  */
    /* renamed from: U0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo26712U0(java.lang.String r10, p239z5.C12181o r11, javax.servlet.http.C9277a r12, javax.servlet.http.C9279c r13) {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            z5.v r2 = r11.mo43095U()     // Catch:{ all -> 0x00bd }
            javax.servlet.http.e r3 = r11.mo37769p(r1)     // Catch:{ all -> 0x00ba }
            z5.v r4 = r9.f6852n     // Catch:{ all -> 0x00b8 }
            if (r2 == r4) goto L_0x0017
            r11.mo43076F0(r4)     // Catch:{ all -> 0x00b8 }
            r11.mo43074E0(r0)     // Catch:{ all -> 0x00b8 }
            r9.mo26713Y0(r11, r12)     // Catch:{ all -> 0x00b8 }
        L_0x0017:
            z5.v r4 = r9.f6852n     // Catch:{ all -> 0x00b8 }
            if (r4 == 0) goto L_0x0048
            javax.servlet.http.e r4 = r11.mo37769p(r1)     // Catch:{ all -> 0x00b8 }
            if (r4 == 0) goto L_0x003c
            if (r4 == r3) goto L_0x0038
            z5.v r0 = r9.f6852n     // Catch:{ all -> 0x00b5 }
            boolean r5 = r12.mo41945c()     // Catch:{ all -> 0x00b5 }
            org.eclipse.jetty.http.g r0 = r0.mo26674g0(r4, r5)     // Catch:{ all -> 0x00b5 }
            if (r0 == 0) goto L_0x0036
            z5.q r5 = r11.mo43088N()     // Catch:{ all -> 0x00b5 }
            r5.mo43158r(r0)     // Catch:{ all -> 0x00b5 }
        L_0x0036:
            r0 = r4
            goto L_0x0049
        L_0x0038:
            r8 = r4
            r4 = r0
            r0 = r8
            goto L_0x0049
        L_0x003c:
            z5.v r4 = r9.f6852n     // Catch:{ all -> 0x00b8 }
            javax.servlet.http.e r4 = r11.mo43103c0(r4)     // Catch:{ all -> 0x00b8 }
            if (r4 == 0) goto L_0x0038
            r11.mo43074E0(r4)     // Catch:{ all -> 0x00b8 }
            goto L_0x0038
        L_0x0048:
            r4 = r0
        L_0x0049:
            e6.c r5 = f6851o     // Catch:{ all -> 0x00b5 }
            boolean r6 = r5.mo36846a()     // Catch:{ all -> 0x00b5 }
            if (r6 == 0) goto L_0x007f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b5 }
            r6.<init>()     // Catch:{ all -> 0x00b5 }
            java.lang.String r7 = "sessionManager="
            r6.append(r7)     // Catch:{ all -> 0x00b5 }
            z5.v r7 = r9.f6852n     // Catch:{ all -> 0x00b5 }
            r6.append(r7)     // Catch:{ all -> 0x00b5 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00b5 }
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch:{ all -> 0x00b5 }
            r5.mo36850e(r6, r7)     // Catch:{ all -> 0x00b5 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b5 }
            r6.<init>()     // Catch:{ all -> 0x00b5 }
            java.lang.String r7 = "session="
            r6.append(r7)     // Catch:{ all -> 0x00b5 }
            r6.append(r0)     // Catch:{ all -> 0x00b5 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x00b5 }
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x00b5 }
            r5.mo36850e(r0, r6)     // Catch:{ all -> 0x00b5 }
        L_0x007f:
            org.eclipse.jetty.server.handler.i r0 = r9.f18270l     // Catch:{ all -> 0x00b5 }
            if (r0 == 0) goto L_0x0087
            r0.mo26712U0(r10, r11, r12, r13)     // Catch:{ all -> 0x00b5 }
            goto L_0x0092
        L_0x0087:
            org.eclipse.jetty.server.handler.i r0 = r9.f18269k     // Catch:{ all -> 0x00b5 }
            if (r0 == 0) goto L_0x008f
            r0.mo26711T0(r10, r11, r12, r13)     // Catch:{ all -> 0x00b5 }
            goto L_0x0092
        L_0x008f:
            r9.mo26711T0(r10, r11, r12, r13)     // Catch:{ all -> 0x00b5 }
        L_0x0092:
            if (r4 == 0) goto L_0x0099
            z5.v r10 = r9.f6852n
            r10.mo26676l0(r4)
        L_0x0099:
            javax.servlet.http.e r10 = r11.mo37769p(r1)
            if (r10 == 0) goto L_0x00a8
            if (r3 != 0) goto L_0x00a8
            if (r10 == r4) goto L_0x00a8
            z5.v r12 = r9.f6852n
            r12.mo26676l0(r10)
        L_0x00a8:
            if (r2 == 0) goto L_0x00b4
            z5.v r10 = r9.f6852n
            if (r2 == r10) goto L_0x00b4
            r11.mo43076F0(r2)
            r11.mo43074E0(r3)
        L_0x00b4:
            return
        L_0x00b5:
            r10 = move-exception
            r0 = r4
            goto L_0x00c0
        L_0x00b8:
            r10 = move-exception
            goto L_0x00c0
        L_0x00ba:
            r10 = move-exception
            r3 = r0
            goto L_0x00c0
        L_0x00bd:
            r10 = move-exception
            r2 = r0
            r3 = r2
        L_0x00c0:
            if (r0 == 0) goto L_0x00c7
            z5.v r12 = r9.f6852n
            r12.mo26676l0(r0)
        L_0x00c7:
            javax.servlet.http.e r12 = r11.mo37769p(r1)
            if (r12 == 0) goto L_0x00d6
            if (r3 != 0) goto L_0x00d6
            if (r12 == r0) goto L_0x00d6
            z5.v r13 = r9.f6852n
            r13.mo26676l0(r12)
        L_0x00d6:
            if (r2 == 0) goto L_0x00e2
            z5.v r12 = r9.f6852n
            if (r2 == r12) goto L_0x00e2
            r11.mo43076F0(r2)
            r11.mo43074E0(r3)
        L_0x00e2:
            goto L_0x00e4
        L_0x00e3:
            throw r10
        L_0x00e4:
            goto L_0x00e3
        */
        throw new UnsupportedOperationException("Method not decompiled: p136c6.C4025g.mo26712U0(java.lang.String, z5.o, javax.servlet.http.a, javax.servlet.http.c):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y0 */
    public void mo26713Y0(C12181o oVar, C9277a aVar) {
        boolean z;
        int indexOf;
        Cookie[] cookies;
        String j = aVar.mo37765j();
        C12192v Z0 = mo26714Z0();
        if (j != null && Z0 != null) {
            C9281e f0 = Z0.mo26673f0(j);
            if (f0 != null && Z0.mo26655A(f0)) {
                oVar.mo43074E0(f0);
            }
        } else if (DispatcherType.REQUEST.equals(oVar.mo43079H())) {
            C9281e eVar = null;
            boolean z2 = true;
            if (!this.f6852n.mo26678p() || (cookies = aVar.getCookies()) == null || cookies.length <= 0) {
                z = false;
            } else {
                String name = Z0.mo26679t0().getName();
                int i = 0;
                z = false;
                while (true) {
                    if (i >= cookies.length) {
                        break;
                    }
                    if (name.equalsIgnoreCase(cookies[i].getName())) {
                        j = cookies[i].getValue();
                        C9003c cVar = f6851o;
                        cVar.mo36850e("Got Session ID {} from cookie", j);
                        if (j != null) {
                            eVar = Z0.mo26673f0(j);
                            if (eVar != null && Z0.mo26655A(eVar)) {
                                z = true;
                                break;
                            }
                        } else {
                            cVar.mo36847b("null session id from cookie", new Object[0]);
                        }
                        z = true;
                    }
                    i++;
                }
            }
            if (j == null || eVar == null) {
                String w = aVar.mo37774w();
                String c0 = Z0.mo26672c0();
                if (c0 != null && (indexOf = w.indexOf(c0)) >= 0) {
                    int length = indexOf + c0.length();
                    int i2 = length;
                    while (i2 < w.length() && (r2 = w.charAt(i2)) != ';' && r2 != '#' && r2 != '?' && r2 != '/') {
                        i2++;
                    }
                    j = w.substring(length, i2);
                    eVar = Z0.mo26673f0(j);
                    C9003c cVar2 = f6851o;
                    if (cVar2.mo36846a()) {
                        cVar2.mo36850e("Got Session ID {} from URL", j);
                    }
                    z = false;
                }
            }
            oVar.mo43128y0(j);
            if (j == null || !z) {
                z2 = false;
            }
            oVar.mo43130z0(z2);
            if (eVar != null && Z0.mo26655A(eVar)) {
                oVar.mo43074E0(eVar);
            }
        }
    }

    /* renamed from: Z0 */
    public C12192v mo26714Z0() {
        return this.f6852n;
    }

    /* renamed from: a1 */
    public void mo26715a1(C12192v vVar) {
        if (!mo36748n0()) {
            C12192v vVar2 = this.f6852n;
            if (mo39919c() != null) {
                mo39919c().mo43169V0().mo36766f(this, vVar2, vVar, "sessionManager", true);
            }
            if (vVar != null) {
                vVar.mo26670Z(this);
            }
            this.f6852n = vVar;
            if (vVar2 != null) {
                vVar2.mo26670Z((C4025g) null);
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: i */
    public void mo26716i(C12187r rVar) {
        C12187r c = mo39919c();
        if (!(c == null || c == rVar)) {
            c.mo43169V0().mo36766f(this, this.f6852n, (Object) null, "sessionManager", true);
        }
        super.mo26716i(rVar);
        if (rVar != null && rVar != c) {
            rVar.mo43169V0().mo36766f(this, (Object) null, this.f6852n, "sessionManager", true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public void mo26547u0() {
        this.f6852n.start();
        super.mo26547u0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v0 */
    public void mo26548v0() {
        this.f6852n.stop();
        super.mo26548v0();
    }
}
