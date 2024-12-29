package p117y;

import android.content.Context;
import com.google.android.gms.common.api.C0722a;
import com.google.android.gms.common.api.C0733c;
import com.google.android.gms.common.api.internal.C0838s;
import com.google.android.gms.common.internal.C0919j;
import com.google.android.gms.common.internal.TelemetryData;
import p040h0.C3233d;
import p065m0.C3339g;
import p109w.C3844i;

/* renamed from: y.d */
public final class C3907d extends C0733c implements C0919j {

    /* renamed from: k */
    private static final C0722a.C0731g f6544k;

    /* renamed from: l */
    private static final C0722a.C0723a f6545l;

    /* renamed from: m */
    private static final C0722a f6546m;

    /* renamed from: n */
    public static final /* synthetic */ int f6547n = 0;

    static {
        C0722a.C0731g gVar = new C0722a.C0731g();
        f6544k = gVar;
        C3906c cVar = new C3906c();
        f6545l = cVar;
        f6546m = new C0722a("ClientTelemetry.API", cVar, gVar);
    }

    public C3907d(Context context, C3844i iVar) {
        super(context, f6546m, iVar, C0733c.C0734a.f531c);
    }

    /* renamed from: a */
    public final C3339g<Void> mo12285a(TelemetryData telemetryData) {
        C0838s.C0839a a = C0838s.m1059a();
        a.mo12078d(C3233d.f5215a);
        a.mo12077c(false);
        a.mo12076b(new C3905b(telemetryData));
        return mo11849e(a.mo12075a());
    }
}
