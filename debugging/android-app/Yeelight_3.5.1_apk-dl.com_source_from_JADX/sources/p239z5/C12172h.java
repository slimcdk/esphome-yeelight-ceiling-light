package p239z5;

import java.util.Map;
import javax.servlet.DispatcherType;
import javax.servlet.http.C9277a;
import javax.servlet.http.C9279c;
import org.eclipse.jetty.server.handler.C9943d;
import org.eclipse.jetty.util.C9978b;
import org.eclipse.jetty.util.LazyList;
import org.eclipse.jetty.util.MultiMap;
import org.eclipse.jetty.util.UrlEncoded;
import p208s4.C10356h;
import p208s4.C10364p;
import p208s4.C10368t;

/* renamed from: z5.h */
public class C12172h implements C10356h {

    /* renamed from: a */
    private final C9943d f22402a;

    /* renamed from: b */
    private final String f22403b;

    /* renamed from: c */
    private final String f22404c;

    /* renamed from: d */
    private final String f22405d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final String f22406e = null;

    /* renamed from: z5.h$a */
    private class C12173a implements C9978b {

        /* renamed from: a */
        final C9978b f22407a;

        /* renamed from: b */
        String f22408b;

        /* renamed from: c */
        String f22409c;

        /* renamed from: d */
        String f22410d;

        /* renamed from: e */
        String f22411e;

        /* renamed from: f */
        String f22412f;

        C12173a(C9978b bVar) {
            this.f22407a = bVar;
        }

        /* renamed from: a */
        public Object mo39576a(String str) {
            if (C12172h.this.f22406e == null) {
                if (str.equals("javax.servlet.forward.path_info")) {
                    return this.f22411e;
                }
                if (str.equals("javax.servlet.forward.request_uri")) {
                    return this.f22408b;
                }
                if (str.equals("javax.servlet.forward.servlet_path")) {
                    return this.f22410d;
                }
                if (str.equals("javax.servlet.forward.context_path")) {
                    return this.f22409c;
                }
                if (str.equals("javax.servlet.forward.query_string")) {
                    return this.f22412f;
                }
            }
            if (str.startsWith("javax.servlet.include.")) {
                return null;
            }
            return this.f22407a.mo39576a(str);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0051, code lost:
            if (r3 == null) goto L_0x0056;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
            if (r3 == null) goto L_0x0056;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
            r1.f22407a.mo39578b(r2, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            return;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo39578b(java.lang.String r2, java.lang.Object r3) {
            /*
                r1 = this;
                z5.h r0 = p239z5.C12172h.this
                java.lang.String r0 = r0.f22406e
                if (r0 != 0) goto L_0x0054
                java.lang.String r0 = "javax.servlet."
                boolean r0 = r2.startsWith(r0)
                if (r0 == 0) goto L_0x0054
                java.lang.String r0 = "javax.servlet.forward.path_info"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto L_0x001d
                java.lang.String r3 = (java.lang.String) r3
                r1.f22411e = r3
                goto L_0x0061
            L_0x001d:
                java.lang.String r0 = "javax.servlet.forward.request_uri"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto L_0x002a
                java.lang.String r3 = (java.lang.String) r3
                r1.f22408b = r3
                goto L_0x0061
            L_0x002a:
                java.lang.String r0 = "javax.servlet.forward.servlet_path"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto L_0x0037
                java.lang.String r3 = (java.lang.String) r3
                r1.f22410d = r3
                goto L_0x0061
            L_0x0037:
                java.lang.String r0 = "javax.servlet.forward.context_path"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto L_0x0044
                java.lang.String r3 = (java.lang.String) r3
                r1.f22409c = r3
                goto L_0x0061
            L_0x0044:
                java.lang.String r0 = "javax.servlet.forward.query_string"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto L_0x0051
                java.lang.String r3 = (java.lang.String) r3
                r1.f22412f = r3
                goto L_0x0061
            L_0x0051:
                if (r3 != 0) goto L_0x005c
                goto L_0x0056
            L_0x0054:
                if (r3 != 0) goto L_0x005c
            L_0x0056:
                org.eclipse.jetty.util.b r3 = r1.f22407a
                r3.mo39582d(r2)
                goto L_0x0061
            L_0x005c:
                org.eclipse.jetty.util.b r0 = r1.f22407a
                r0.mo39578b(r2, r3)
            L_0x0061:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p239z5.C12172h.C12173a.mo39578b(java.lang.String, java.lang.Object):void");
        }

        /* renamed from: b0 */
        public void mo39579b0() {
            throw new IllegalStateException();
        }

        /* renamed from: d */
        public void mo39582d(String str) {
            mo39578b(str, (Object) null);
        }

        public String toString() {
            return "FORWARD+" + this.f22407a.toString();
        }
    }

    /* renamed from: z5.h$b */
    private class C12174b implements C9978b {

        /* renamed from: a */
        final C9978b f22414a;

        /* renamed from: b */
        String f22415b;

        /* renamed from: c */
        String f22416c;

        /* renamed from: d */
        String f22417d;

        /* renamed from: e */
        String f22418e;

        /* renamed from: f */
        String f22419f;

        C12174b(C9978b bVar) {
            this.f22414a = bVar;
        }

        /* renamed from: a */
        public Object mo39576a(String str) {
            if (C12172h.this.f22406e == null) {
                if (str.equals("javax.servlet.include.path_info")) {
                    return this.f22418e;
                }
                if (str.equals("javax.servlet.include.servlet_path")) {
                    return this.f22417d;
                }
                if (str.equals("javax.servlet.include.context_path")) {
                    return this.f22416c;
                }
                if (str.equals("javax.servlet.include.query_string")) {
                    return this.f22419f;
                }
                if (str.equals("javax.servlet.include.request_uri")) {
                    return this.f22415b;
                }
            } else if (str.startsWith("javax.servlet.include.")) {
                return null;
            }
            return this.f22414a.mo39576a(str);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0051, code lost:
            if (r3 == null) goto L_0x0056;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
            if (r3 == null) goto L_0x0056;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
            r1.f22414a.mo39578b(r2, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            return;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo39578b(java.lang.String r2, java.lang.Object r3) {
            /*
                r1 = this;
                z5.h r0 = p239z5.C12172h.this
                java.lang.String r0 = r0.f22406e
                if (r0 != 0) goto L_0x0054
                java.lang.String r0 = "javax.servlet."
                boolean r0 = r2.startsWith(r0)
                if (r0 == 0) goto L_0x0054
                java.lang.String r0 = "javax.servlet.include.path_info"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto L_0x001d
                java.lang.String r3 = (java.lang.String) r3
                r1.f22418e = r3
                goto L_0x0061
            L_0x001d:
                java.lang.String r0 = "javax.servlet.include.request_uri"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto L_0x002a
                java.lang.String r3 = (java.lang.String) r3
                r1.f22415b = r3
                goto L_0x0061
            L_0x002a:
                java.lang.String r0 = "javax.servlet.include.servlet_path"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto L_0x0037
                java.lang.String r3 = (java.lang.String) r3
                r1.f22417d = r3
                goto L_0x0061
            L_0x0037:
                java.lang.String r0 = "javax.servlet.include.context_path"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto L_0x0044
                java.lang.String r3 = (java.lang.String) r3
                r1.f22416c = r3
                goto L_0x0061
            L_0x0044:
                java.lang.String r0 = "javax.servlet.include.query_string"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto L_0x0051
                java.lang.String r3 = (java.lang.String) r3
                r1.f22419f = r3
                goto L_0x0061
            L_0x0051:
                if (r3 != 0) goto L_0x005c
                goto L_0x0056
            L_0x0054:
                if (r3 != 0) goto L_0x005c
            L_0x0056:
                org.eclipse.jetty.util.b r3 = r1.f22414a
                r3.mo39582d(r2)
                goto L_0x0061
            L_0x005c:
                org.eclipse.jetty.util.b r0 = r1.f22414a
                r0.mo39578b(r2, r3)
            L_0x0061:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p239z5.C12172h.C12174b.mo39578b(java.lang.String, java.lang.Object):void");
        }

        /* renamed from: b0 */
        public void mo39579b0() {
            throw new IllegalStateException();
        }

        /* renamed from: d */
        public void mo39582d(String str) {
            mo39578b(str, (Object) null);
        }

        public String toString() {
            return "INCLUDE+" + this.f22414a.toString();
        }
    }

    public C12172h(C9943d dVar, String str, String str2, String str3) {
        this.f22402a = dVar;
        this.f22403b = str;
        this.f22404c = str2;
        this.f22405d = str3;
    }

    /* renamed from: d */
    private void m31713d(C10368t tVar, C12181o oVar) {
        if (oVar.mo43088N().mo43150C()) {
            try {
                tVar.mo37796f().close();
            } catch (IllegalStateException unused) {
                tVar.mo37797h().close();
            }
        } else {
            try {
                tVar.mo37797h().close();
            } catch (IllegalStateException unused2) {
                tVar.mo37796f().close();
            }
        }
    }

    /* renamed from: a */
    public void mo41940a(C10364p pVar, C10368t tVar) {
        mo43042e(pVar, tVar, DispatcherType.FORWARD);
    }

    /* renamed from: b */
    public void mo41941b(C10364p pVar, C10368t tVar) {
        C12181o v = pVar instanceof C12181o ? (C12181o) pVar : C12151b.m31593o().mo42994v();
        if (!(pVar instanceof C9277a)) {
            pVar = new C12189s(pVar);
        }
        if (!(tVar instanceof C9279c)) {
            tVar = new C12190t(tVar);
        }
        DispatcherType H = v.mo43079H();
        C9978b A = v.mo43065A();
        MultiMap<String> K = v.mo43085K();
        try {
            v.mo43114n0(DispatcherType.INCLUDE);
            v.mo43073E().mo42969E();
            String str = this.f22406e;
            if (str != null) {
                this.f22402a.mo39972q(str, v, (C9277a) pVar, (C9279c) tVar);
            } else {
                String str2 = this.f22405d;
                if (str2 != null) {
                    if (K == null) {
                        v.mo43127y();
                        K = v.mo43085K();
                    }
                    MultiMap multiMap = new MultiMap();
                    UrlEncoded.decodeTo(str2, multiMap, v.mo43071D());
                    if (K != null && K.size() > 0) {
                        for (Map.Entry next : K.entrySet()) {
                            String str3 = (String) next.getKey();
                            Object value = next.getValue();
                            for (int i = 0; i < LazyList.size(value); i++) {
                                multiMap.add(str3, LazyList.get(value, i));
                            }
                        }
                    }
                    v.mo43117q0(multiMap);
                }
                C12174b bVar = new C12174b(A);
                bVar.f22415b = this.f22403b;
                bVar.f22416c = this.f22402a.mo39942l1();
                bVar.f22417d = null;
                bVar.f22418e = this.f22404c;
                bVar.f22419f = str2;
                v.mo43108h0(bVar);
                this.f22402a.mo39972q(this.f22404c, v, (C9277a) pVar, (C9279c) tVar);
            }
        } finally {
            v.mo43108h0(A);
            v.mo43073E().mo42970F();
            v.mo43117q0(K);
            v.mo43114n0(H);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo43042e(C10364p pVar, C10368t tVar, DispatcherType dispatcherType) {
        C12181o v = pVar instanceof C12181o ? (C12181o) pVar : C12151b.m31593o().mo42994v();
        C12186q N = v.mo43088N();
        tVar.mo39905b();
        N.mo43163v();
        if (!(pVar instanceof C9277a)) {
            pVar = new C12189s(pVar);
        }
        if (!(tVar instanceof C9279c)) {
            tVar = new C12190t(tVar);
        }
        boolean Z = v.mo43100Z();
        String w = v.mo37774w();
        String e = v.mo37761e();
        String s = v.mo37771s();
        String g = v.mo37763g();
        String u = v.mo37773u();
        C9978b A = v.mo43065A();
        DispatcherType H = v.mo43079H();
        MultiMap<String> K = v.mo43085K();
        try {
            v.mo43115o0(false);
            v.mo43114n0(dispatcherType);
            String str = this.f22406e;
            if (str != null) {
                this.f22402a.mo39972q(str, v, (C9277a) pVar, (C9279c) tVar);
            } else {
                String str2 = this.f22405d;
                if (str2 != null) {
                    if (K == null) {
                        v.mo43127y();
                        K = v.mo43085K();
                    }
                    v.mo43102b0(str2);
                }
                C12173a aVar = new C12173a(A);
                if (A.mo39576a("javax.servlet.forward.request_uri") != null) {
                    aVar.f22411e = (String) A.mo39576a("javax.servlet.forward.path_info");
                    aVar.f22412f = (String) A.mo39576a("javax.servlet.forward.query_string");
                    aVar.f22408b = (String) A.mo39576a("javax.servlet.forward.request_uri");
                    aVar.f22409c = (String) A.mo39576a("javax.servlet.forward.context_path");
                    aVar.f22410d = (String) A.mo39576a("javax.servlet.forward.servlet_path");
                } else {
                    aVar.f22411e = g;
                    aVar.f22412f = u;
                    aVar.f22408b = w;
                    aVar.f22409c = e;
                    aVar.f22410d = s;
                }
                v.mo43126x0(this.f22403b);
                v.mo43113m0(this.f22402a.mo39942l1());
                v.mo43072D0((String) null);
                v.mo43118r0(this.f22403b);
                v.mo43108h0(aVar);
                this.f22402a.mo39972q(this.f22404c, v, (C9277a) pVar, (C9279c) tVar);
                if (!v.mo43129z().mo43019s()) {
                    m31713d(tVar, v);
                }
            }
        } finally {
            v.mo43115o0(Z);
            v.mo43126x0(w);
            v.mo43113m0(e);
            v.mo43072D0(s);
            v.mo43118r0(g);
            v.mo43108h0(A);
            v.mo43117q0(K);
            v.mo43122u0(u);
            v.mo43114n0(H);
        }
    }
}
