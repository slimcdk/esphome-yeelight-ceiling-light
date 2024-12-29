package p076o0;

import com.google.android.gms.common.api.C0722a;
import com.google.android.gms.common.api.C0736d;
import com.google.android.gms.common.api.C0744h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.PutDataRequest;
import p069n0.C3360f;

/* renamed from: o0.m */
final class C3457m extends C3456l2<Object> {

    /* renamed from: t */
    final /* synthetic */ PutDataRequest f5576t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3457m(C3464o oVar, C0736d dVar, PutDataRequest putDataRequest) {
        super(dVar);
        this.f5576t = putDataRequest;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C0744h mo11881e(Status status) {
        return new C3461n(status, (C3360f) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final /* bridge */ /* synthetic */ void mo11929q(C0722a.C0724b bVar) {
        ((C3432f2) bVar).mo24256n0(this, this.f5576t);
    }
}
