package p076o0;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C0768e;
import com.google.android.gms.tasks.C1872a;

/* renamed from: o0.u1 */
final class C3484u1 implements C0768e<Status> {

    /* renamed from: a */
    final C1872a<Boolean> f5590a;

    C3484u1(C1872a<Boolean> aVar) {
        this.f5590a = aVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11928a(Object obj) {
        C1872a<Boolean> aVar;
        Boolean bool;
        Status status = (Status) obj;
        int c0 = status.mo11808c0();
        if (c0 == 0) {
            aVar = this.f5590a;
            bool = Boolean.TRUE;
        } else if (c0 == 4002) {
            aVar = this.f5590a;
            bool = Boolean.FALSE;
        } else {
            mo24320b(status);
            return;
        }
        aVar.mo14738c(bool);
    }

    /* renamed from: b */
    public final void mo24320b(Status status) {
        this.f5590a.mo14737b(new ApiException(status));
    }
}
