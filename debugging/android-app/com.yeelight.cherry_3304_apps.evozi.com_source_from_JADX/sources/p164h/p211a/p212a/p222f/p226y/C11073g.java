package p164h.p211a.p212a.p222f.p226y;

import java.util.EnumSet;
import p154d.p155b.C10702c0;
import p154d.p155b.C4316d;
import p154d.p155b.p204f0.C10707a;
import p154d.p155b.p204f0.C10709c;
import p154d.p155b.p204f0.C10711e;
import p154d.p155b.p204f0.C10713g;
import p164h.p211a.p212a.p222f.C11032i;
import p164h.p211a.p212a.p222f.C11037n;
import p164h.p211a.p212a.p222f.C11040p;
import p164h.p211a.p212a.p222f.C11045t;
import p164h.p211a.p212a.p222f.p224w.C11060h;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.f.y.g */
public class C11073g extends C11060h {

    /* renamed from: o */
    static final C11158c f21823o = C11156b.m29016b("org.eclipse.jetty.server.session");

    /* renamed from: n */
    private C11045t f21824n;

    static {
        EnumSet.of(C10702c0.COOKIE, C10702c0.URL);
    }

    public C11073g() {
        this(new C11068e());
    }

    public C11073g(C11045t tVar) {
        mo35168V0(tVar);
    }

    /* renamed from: O0 */
    public void mo35053O0(String str, C11037n nVar, C10709c cVar, C10711e eVar) {
        if (mo35099Q0()) {
            mo35100R0(str, nVar, cVar, eVar);
            return;
        }
        C11060h hVar = this.f21756l;
        if (hVar == null || hVar != this.f21753j) {
            C11032i iVar = this.f21753j;
            if (iVar != null) {
                iVar.mo34757L(str, nVar, cVar, eVar);
                return;
            }
            return;
        }
        hVar.mo35053O0(str, nVar, cVar, eVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x00cc  */
    /* renamed from: P0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo35054P0(java.lang.String r10, p164h.p211a.p212a.p222f.C11037n r11, p154d.p155b.p204f0.C10709c r12, p154d.p155b.p204f0.C10711e r13) {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            h.a.a.f.t r2 = r11.mo34949U()     // Catch:{ all -> 0x00c7 }
            d.b.f0.g r3 = r11.mo33925p(r1)     // Catch:{ all -> 0x00c4 }
            h.a.a.f.t r4 = r9.f21824n     // Catch:{ all -> 0x00c2 }
            if (r2 == r4) goto L_0x0019
            h.a.a.f.t r4 = r9.f21824n     // Catch:{ all -> 0x00c2 }
            r11.mo34930F0(r4)     // Catch:{ all -> 0x00c2 }
            r11.mo34928E0(r0)     // Catch:{ all -> 0x00c2 }
            r9.mo35166T0(r11, r12)     // Catch:{ all -> 0x00c2 }
        L_0x0019:
            h.a.a.f.t r4 = r9.f21824n     // Catch:{ all -> 0x00c2 }
            if (r4 == 0) goto L_0x004a
            d.b.f0.g r4 = r11.mo33925p(r1)     // Catch:{ all -> 0x00c2 }
            if (r4 == 0) goto L_0x003e
            if (r4 == r3) goto L_0x003a
            h.a.a.f.t r0 = r9.f21824n     // Catch:{ all -> 0x00bf }
            boolean r5 = r12.mo33966c()     // Catch:{ all -> 0x00bf }
            h.a.a.c.g r0 = r0.mo35033d0(r4, r5)     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x0038
            h.a.a.f.o r5 = r11.mo34942N()     // Catch:{ all -> 0x00bf }
            r5.mo34987o(r0)     // Catch:{ all -> 0x00bf }
        L_0x0038:
            r0 = r4
            goto L_0x004b
        L_0x003a:
            r8 = r4
            r4 = r0
            r0 = r8
            goto L_0x004b
        L_0x003e:
            h.a.a.f.t r4 = r9.f21824n     // Catch:{ all -> 0x00c2 }
            d.b.f0.g r4 = r11.mo34957c0(r4)     // Catch:{ all -> 0x00c2 }
            if (r4 == 0) goto L_0x003a
            r11.mo34928E0(r4)     // Catch:{ all -> 0x00c2 }
            goto L_0x003a
        L_0x004a:
            r4 = r0
        L_0x004b:
            h.a.a.h.y.c r5 = f21823o     // Catch:{ all -> 0x00bf }
            boolean r5 = r5.mo35485a()     // Catch:{ all -> 0x00bf }
            if (r5 == 0) goto L_0x0085
            h.a.a.h.y.c r5 = f21823o     // Catch:{ all -> 0x00bf }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bf }
            r6.<init>()     // Catch:{ all -> 0x00bf }
            java.lang.String r7 = "sessionManager="
            r6.append(r7)     // Catch:{ all -> 0x00bf }
            h.a.a.f.t r7 = r9.f21824n     // Catch:{ all -> 0x00bf }
            r6.append(r7)     // Catch:{ all -> 0x00bf }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00bf }
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch:{ all -> 0x00bf }
            r5.mo35489e(r6, r7)     // Catch:{ all -> 0x00bf }
            h.a.a.h.y.c r5 = f21823o     // Catch:{ all -> 0x00bf }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bf }
            r6.<init>()     // Catch:{ all -> 0x00bf }
            java.lang.String r7 = "session="
            r6.append(r7)     // Catch:{ all -> 0x00bf }
            r6.append(r0)     // Catch:{ all -> 0x00bf }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x00bf }
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x00bf }
            r5.mo35489e(r0, r6)     // Catch:{ all -> 0x00bf }
        L_0x0085:
            h.a.a.f.w.h r0 = r9.f21756l     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x008f
            h.a.a.f.w.h r0 = r9.f21756l     // Catch:{ all -> 0x00bf }
            r0.mo35054P0(r10, r11, r12, r13)     // Catch:{ all -> 0x00bf }
            goto L_0x009c
        L_0x008f:
            h.a.a.f.w.h r0 = r9.f21755k     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x0099
            h.a.a.f.w.h r0 = r9.f21755k     // Catch:{ all -> 0x00bf }
            r0.mo35053O0(r10, r11, r12, r13)     // Catch:{ all -> 0x00bf }
            goto L_0x009c
        L_0x0099:
            r9.mo35053O0(r10, r11, r12, r13)     // Catch:{ all -> 0x00bf }
        L_0x009c:
            if (r4 == 0) goto L_0x00a3
            h.a.a.f.t r10 = r9.f21824n
            r10.mo35035i0(r4)
        L_0x00a3:
            d.b.f0.g r10 = r11.mo33925p(r1)
            if (r10 == 0) goto L_0x00b2
            if (r3 != 0) goto L_0x00b2
            if (r10 == r4) goto L_0x00b2
            h.a.a.f.t r12 = r9.f21824n
            r12.mo35035i0(r10)
        L_0x00b2:
            if (r2 == 0) goto L_0x00be
            h.a.a.f.t r10 = r9.f21824n
            if (r2 == r10) goto L_0x00be
            r11.mo34930F0(r2)
            r11.mo34928E0(r3)
        L_0x00be:
            return
        L_0x00bf:
            r10 = move-exception
            r0 = r4
            goto L_0x00ca
        L_0x00c2:
            r10 = move-exception
            goto L_0x00ca
        L_0x00c4:
            r10 = move-exception
            r3 = r0
            goto L_0x00ca
        L_0x00c7:
            r10 = move-exception
            r2 = r0
            r3 = r2
        L_0x00ca:
            if (r0 == 0) goto L_0x00d1
            h.a.a.f.t r12 = r9.f21824n
            r12.mo35035i0(r0)
        L_0x00d1:
            d.b.f0.g r12 = r11.mo33925p(r1)
            if (r12 == 0) goto L_0x00e0
            if (r3 != 0) goto L_0x00e0
            if (r12 == r0) goto L_0x00e0
            h.a.a.f.t r13 = r9.f21824n
            r13.mo35035i0(r12)
        L_0x00e0:
            if (r2 == 0) goto L_0x00ec
            h.a.a.f.t r12 = r9.f21824n
            if (r2 == r12) goto L_0x00ec
            r11.mo34930F0(r2)
            r11.mo34928E0(r3)
        L_0x00ec:
            goto L_0x00ee
        L_0x00ed:
            throw r10
        L_0x00ee:
            goto L_0x00ed
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p222f.p226y.C11073g.mo35054P0(java.lang.String, h.a.a.f.n, d.b.f0.c, d.b.f0.e):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: T0 */
    public void mo35166T0(C11037n nVar, C10709c cVar) {
        boolean z;
        int indexOf;
        C10707a[] f;
        String k = cVar.mo33921k();
        C11045t U0 = mo35167U0();
        if (k != null && U0 != null) {
            C10713g c0 = U0.mo35032c0(k);
            if (c0 != null && U0.mo35040x(c0)) {
                nVar.mo34928E0(c0);
            }
        } else if (C4316d.REQUEST.equals(nVar.mo34931G())) {
            C10713g gVar = null;
            boolean z2 = true;
            if (!this.f21824n.mo35037o() || (f = cVar.mo33918f()) == null || f.length <= 0) {
                z = false;
            } else {
                String name = U0.mo35038o0().getName();
                int i = 0;
                z = false;
                while (true) {
                    if (i >= f.length) {
                        break;
                    }
                    if (name.equalsIgnoreCase(f[i].mo33908a())) {
                        k = f[i].mo33909b();
                        f21823o.mo35489e("Got Session ID {} from cookie", k);
                        if (k != null) {
                            gVar = U0.mo35032c0(k);
                            if (gVar != null && U0.mo35040x(gVar)) {
                                z = true;
                                break;
                            }
                        } else {
                            f21823o.mo35486b("null session id from cookie", new Object[0]);
                        }
                        z = true;
                    }
                    i++;
                }
            }
            if (k == null || gVar == null) {
                String v = cVar.mo33929v();
                String a0 = U0.mo35031a0();
                if (a0 != null && (indexOf = v.indexOf(a0)) >= 0) {
                    int length = indexOf + a0.length();
                    int i2 = length;
                    while (i2 < v.length() && (r2 = v.charAt(i2)) != ';' && r2 != '#' && r2 != '?' && r2 != '/') {
                        i2++;
                    }
                    k = v.substring(length, i2);
                    gVar = U0.mo35032c0(k);
                    if (f21823o.mo35485a()) {
                        f21823o.mo35489e("Got Session ID {} from URL", k);
                    }
                    z = false;
                }
            }
            nVar.mo34983y0(k);
            if (k == null || !z) {
                z2 = false;
            }
            nVar.mo34985z0(z2);
            if (gVar != null && U0.mo35040x(gVar)) {
                nVar.mo34928E0(gVar);
            }
        }
    }

    /* renamed from: U0 */
    public C11045t mo35167U0() {
        return this.f21824n;
    }

    /* renamed from: V0 */
    public void mo35168V0(C11045t tVar) {
        if (!mo35452j0()) {
            C11045t tVar2 = this.f21824n;
            if (mo34900d() != null) {
                mo34900d().mo35003Q0().mo35467f(this, tVar2, tVar, "sessionManager", true);
            }
            if (tVar != null) {
                tVar.mo35029P(this);
            }
            this.f21824n = tVar;
            if (tVar2 != null) {
                tVar2.mo35029P((C11073g) null);
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: i */
    public void mo34901i(C11040p pVar) {
        C11040p d = mo34900d();
        if (!(d == null || d == pVar)) {
            d.mo35003Q0().mo35467f(this, this.f21824n, (Object) null, "sessionManager", true);
        }
        super.mo34901i(pVar);
        if (pVar != null && pVar != d) {
            pVar.mo35003Q0().mo35467f(this, (Object) null, this.f21824n, "sessionManager", true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public void mo34262p0() {
        this.f21824n.start();
        super.mo34262p0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q0 */
    public void mo34263q0() {
        this.f21824n.stop();
        super.mo34263q0();
    }
}
