package org.eclipse.jetty.http;

import p225w5.C11940d;
import p225w5.C11942e;

/* renamed from: org.eclipse.jetty.http.j */
public class C9907j extends C11942e {

    /* renamed from: d */
    public static final C9907j f18080d;

    /* renamed from: e */
    public static final C11940d f18081e;

    /* renamed from: f */
    public static final C11940d f18082f;

    /* renamed from: g */
    public static final C11940d f18083g;

    static {
        C9907j jVar = new C9907j();
        f18080d = jVar;
        f18081e = jVar.mo42454a("close", 1);
        jVar.mo42454a("chunked", 2);
        jVar.mo42454a("gzip", 3);
        jVar.mo42454a("identity", 4);
        f18082f = jVar.mo42454a("keep-alive", 5);
        jVar.mo42454a("100-continue", 6);
        jVar.mo42454a("102-processing", 7);
        jVar.mo42454a("TE", 8);
        f18083g = jVar.mo42454a("bytes", 9);
        jVar.mo42454a("no-cache", 10);
        jVar.mo42454a("Upgrade", 11);
    }

    /* renamed from: i */
    public static boolean m24236i(int i) {
        return i == 1 || i == 5 || i == 10;
    }
}
