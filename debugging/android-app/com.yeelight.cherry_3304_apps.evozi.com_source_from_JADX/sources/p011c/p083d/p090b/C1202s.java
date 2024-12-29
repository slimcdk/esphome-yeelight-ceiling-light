package p011c.p083d.p090b;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import p011c.p083d.p084a.C0988a0;
import p011c.p083d.p084a.C0992c;
import p011c.p083d.p084a.C1000d;
import p011c.p083d.p084a.C1141v;
import p011c.p083d.p084a.C1144x;
import p011c.p083d.p084a.C1150z;
import p011c.p083d.p090b.C1189j;

/* renamed from: c.d.b.s */
public class C1202s implements C1189j {

    /* renamed from: a */
    private final C1141v f2053a;

    public C1202s(Context context) {
        this(C1173e0.m3015f(context));
    }

    public C1202s(C1141v vVar) {
        this.f2053a = vVar;
    }

    public C1202s(File file) {
        this(file, C1173e0.m3010a(file));
    }

    public C1202s(File file, long j) {
        this(m3101b());
        try {
            this.f2053a.mo9805N(new C0992c(file, j));
        } catch (IOException unused) {
        }
    }

    /* renamed from: b */
    private static C1141v m3101b() {
        C1141v vVar = new C1141v();
        vVar.mo9806O(15000, TimeUnit.MILLISECONDS);
        vVar.mo9809Y(20000, TimeUnit.MILLISECONDS);
        vVar.mo9811b0(20000, TimeUnit.MILLISECONDS);
        return vVar;
    }

    /* renamed from: a */
    public C1189j.C1190a mo9946a(Uri uri, int i) {
        C1000d dVar;
        if (i == 0) {
            dVar = null;
        } else if (C1199q.m3093a(i)) {
            dVar = C1000d.f1256m;
        } else {
            C1000d.C1002b bVar = new C1000d.C1002b();
            if (!C1199q.m3094b(i)) {
                bVar.mo9426c();
            }
            if (!C1199q.m3095c(i)) {
                bVar.mo9427d();
            }
            dVar = bVar.mo9424a();
        }
        C1144x.C1146b bVar2 = new C1144x.C1146b();
        bVar2.mo9856o(uri.toString());
        if (dVar != null) {
            bVar2.mo9849h(dVar);
        }
        C1150z g = this.f2053a.mo9803F(bVar2.mo9848g()).mo9672g();
        int o = g.mo9861o();
        if (o < 300) {
            boolean z = g.mo9859m() != null;
            C0988a0 k = g.mo9857k();
            return new C1189j.C1190a(k.mo9384a(), z, k.mo9388i());
        }
        g.mo9857k().close();
        throw new C1189j.C1191b(o + " " + g.mo9868u(), i, o);
    }
}
