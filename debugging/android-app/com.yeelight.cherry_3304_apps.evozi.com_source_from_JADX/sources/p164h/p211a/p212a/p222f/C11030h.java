package p164h.p211a.p212a.p222f;

import p154d.p155b.C10724j;
import p154d.p155b.C10734t;
import p154d.p155b.C10740z;
import p154d.p155b.C4316d;
import p154d.p155b.p204f0.C10709c;
import p154d.p155b.p204f0.C10711e;
import p164h.p211a.p212a.p222f.p224w.C11052c;
import p164h.p211a.p212a.p228h.C11100b;
import p164h.p211a.p212a.p228h.C11129m;

/* renamed from: h.a.a.f.h */
public class C11030h implements C10724j {

    /* renamed from: a */
    private final C11052c f21609a;

    /* renamed from: b */
    private final String f21610b;

    /* renamed from: c */
    private final String f21611c;

    /* renamed from: d */
    private final String f21612d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final String f21613e = null;

    /* renamed from: h.a.a.f.h$a */
    private class C11031a implements C11100b {

        /* renamed from: a */
        final C11100b f21614a;

        /* renamed from: b */
        String f21615b;

        /* renamed from: c */
        String f21616c;

        /* renamed from: d */
        String f21617d;

        /* renamed from: e */
        String f21618e;

        /* renamed from: f */
        String f21619f;

        C11031a(C11100b bVar) {
            this.f21614a = bVar;
        }

        /* renamed from: Z */
        public void mo34249Z() {
            throw new IllegalStateException();
        }

        /* renamed from: a */
        public Object mo34251a(String str) {
            if (C11030h.this.f21613e == null) {
                if (str.equals("javax.servlet.forward.path_info")) {
                    return this.f21618e;
                }
                if (str.equals("javax.servlet.forward.request_uri")) {
                    return this.f21615b;
                }
                if (str.equals("javax.servlet.forward.servlet_path")) {
                    return this.f21617d;
                }
                if (str.equals("javax.servlet.forward.context_path")) {
                    return this.f21616c;
                }
                if (str.equals("javax.servlet.forward.query_string")) {
                    return this.f21619f;
                }
            }
            if (str.startsWith("javax.servlet.include.")) {
                return null;
            }
            return this.f21614a.mo34251a(str);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0051, code lost:
            if (r3 == null) goto L_0x0056;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
            if (r3 == null) goto L_0x0056;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
            r1.f21614a.mo34253b(r2, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            return;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo34253b(java.lang.String r2, java.lang.Object r3) {
            /*
                r1 = this;
                h.a.a.f.h r0 = p164h.p211a.p212a.p222f.C11030h.this
                java.lang.String r0 = r0.f21613e
                if (r0 != 0) goto L_0x0054
                java.lang.String r0 = "javax.servlet."
                boolean r0 = r2.startsWith(r0)
                if (r0 == 0) goto L_0x0054
                java.lang.String r0 = "javax.servlet.forward.path_info"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto L_0x001d
                java.lang.String r3 = (java.lang.String) r3
                r1.f21618e = r3
                goto L_0x0061
            L_0x001d:
                java.lang.String r0 = "javax.servlet.forward.request_uri"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto L_0x002a
                java.lang.String r3 = (java.lang.String) r3
                r1.f21615b = r3
                goto L_0x0061
            L_0x002a:
                java.lang.String r0 = "javax.servlet.forward.servlet_path"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto L_0x0037
                java.lang.String r3 = (java.lang.String) r3
                r1.f21617d = r3
                goto L_0x0061
            L_0x0037:
                java.lang.String r0 = "javax.servlet.forward.context_path"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto L_0x0044
                java.lang.String r3 = (java.lang.String) r3
                r1.f21616c = r3
                goto L_0x0061
            L_0x0044:
                java.lang.String r0 = "javax.servlet.forward.query_string"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto L_0x0051
                java.lang.String r3 = (java.lang.String) r3
                r1.f21619f = r3
                goto L_0x0061
            L_0x0051:
                if (r3 != 0) goto L_0x005c
                goto L_0x0056
            L_0x0054:
                if (r3 != 0) goto L_0x005c
            L_0x0056:
                h.a.a.h.b r3 = r1.f21614a
                r3.mo34256e(r2)
                goto L_0x0061
            L_0x005c:
                h.a.a.h.b r0 = r1.f21614a
                r0.mo34253b(r2, r3)
            L_0x0061:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p222f.C11030h.C11031a.mo34253b(java.lang.String, java.lang.Object):void");
        }

        /* renamed from: e */
        public void mo34256e(String str) {
            mo34253b(str, (Object) null);
        }

        public String toString() {
            return "FORWARD+" + this.f21614a.toString();
        }
    }

    public C11030h(C11052c cVar, String str, String str2, String str3) {
        this.f21609a = cVar;
        this.f21610b = str;
        this.f21611c = str2;
        this.f21612d = str3;
    }

    /* renamed from: c */
    private void m28217c(C10740z zVar, C11037n nVar) {
        if (nVar.mo34942N().mo34995v()) {
            try {
                zVar.mo33887i().close();
            } catch (IllegalStateException unused) {
                zVar.mo33888j().close();
            }
        } else {
            try {
                zVar.mo33888j().close();
            } catch (IllegalStateException unused2) {
                zVar.mo33887i().close();
            }
        }
    }

    /* renamed from: a */
    public void mo33957a(C10734t tVar, C10740z zVar) {
        mo34898d(tVar, zVar, C4316d.FORWARD);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo34898d(C10734t tVar, C10740z zVar, C4316d dVar) {
        C11037n v = tVar instanceof C11037n ? (C11037n) tVar : C11010b.m28113o().mo34849v();
        C11039o N = v.mo34942N();
        zVar.mo33884b();
        N.mo34990r();
        if (!(tVar instanceof C10709c)) {
            tVar = new C11042q(tVar);
        }
        if (!(zVar instanceof C10711e)) {
            zVar = new C11043r(zVar);
        }
        boolean Z = v.mo34954Z();
        String v2 = v.mo33929v();
        String e = v.mo33917e();
        String s = v.mo33927s();
        String h = v.mo33920h();
        String t = v.mo33928t();
        C11100b z = v.mo34984z();
        C4316d G = v.mo34931G();
        C11129m<String> J = v.mo34937J();
        try {
            v.mo34969o0(false);
            v.mo34968n0(dVar);
            if (this.f21613e != null) {
                this.f21609a.mo34757L(this.f21613e, v, (C10709c) tVar, (C10711e) zVar);
            } else {
                String str = this.f21612d;
                if (str != null) {
                    if (J == null) {
                        v.mo34980x();
                        J = v.mo34937J();
                    }
                    v.mo34956b0(str);
                }
                C11031a aVar = new C11031a(z);
                if (z.mo34251a("javax.servlet.forward.request_uri") != null) {
                    aVar.f21618e = (String) z.mo34251a("javax.servlet.forward.path_info");
                    aVar.f21619f = (String) z.mo34251a("javax.servlet.forward.query_string");
                    aVar.f21615b = (String) z.mo34251a("javax.servlet.forward.request_uri");
                    aVar.f21616c = (String) z.mo34251a("javax.servlet.forward.context_path");
                    aVar.f21617d = (String) z.mo34251a("javax.servlet.forward.servlet_path");
                } else {
                    aVar.f21618e = h;
                    aVar.f21619f = t;
                    aVar.f21615b = v2;
                    aVar.f21616c = e;
                    aVar.f21617d = s;
                }
                v.mo34981x0(this.f21610b);
                v.mo34967m0(this.f21609a.mo35062f1());
                v.mo34926D0((String) null);
                v.mo34972r0(this.f21610b);
                v.mo34962h0(aVar);
                this.f21609a.mo34757L(this.f21611c, v, (C10709c) tVar, (C10711e) zVar);
                if (!v.mo34982y().mo34870p()) {
                    m28217c(zVar, v);
                }
            }
        } finally {
            v.mo34969o0(Z);
            v.mo34981x0(v2);
            v.mo34967m0(e);
            v.mo34926D0(s);
            v.mo34972r0(h);
            v.mo34962h0(z);
            v.mo34971q0(J);
            v.mo34976u0(t);
            v.mo34968n0(G);
        }
    }
}
