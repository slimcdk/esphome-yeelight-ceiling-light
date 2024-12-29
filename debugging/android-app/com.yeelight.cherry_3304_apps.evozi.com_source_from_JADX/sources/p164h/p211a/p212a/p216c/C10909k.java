package p164h.p211a.p212a.p216c;

import p164h.p211a.p212a.p217d.C10929e;
import p164h.p211a.p212a.p217d.C10931f;

/* renamed from: h.a.a.c.k */
public class C10909k extends C10931f {

    /* renamed from: d */
    public static final C10909k f21149d;

    /* renamed from: e */
    public static final C10929e f21150e;

    /* renamed from: f */
    public static final C10929e f21151f = f21149d.mo34611a("keep-alive", 5);

    static {
        C10909k kVar = new C10909k();
        f21149d = kVar;
        f21150e = kVar.mo34611a("close", 1);
        f21149d.mo34611a("chunked", 2);
        f21149d.mo34611a("gzip", 3);
        f21149d.mo34611a("identity", 4);
        f21149d.mo34611a("100-continue", 6);
        f21149d.mo34611a("102-processing", 7);
        f21149d.mo34611a("TE", 8);
        f21149d.mo34611a("bytes", 9);
        f21149d.mo34611a("no-cache", 10);
        f21149d.mo34611a("Upgrade", 11);
    }

    /* renamed from: i */
    public static boolean m27509i(int i) {
        return i == 1 || i == 5 || i == 10;
    }
}
