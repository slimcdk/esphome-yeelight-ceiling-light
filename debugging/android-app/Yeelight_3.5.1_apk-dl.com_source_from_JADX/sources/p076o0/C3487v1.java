package p076o0;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C0768e;
import com.google.android.gms.tasks.C1872a;

/* renamed from: o0.v1 */
final class C3487v1 implements C0768e<Status> {

    /* renamed from: a */
    final C1872a<Void> f5595a;

    C3487v1(C1872a<Void> aVar) {
        this.f5595a = aVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11928a(Object obj) {
        Status status = (Status) obj;
        int c0 = status.mo11808c0();
        if (c0 == 0 || c0 == 4001) {
            this.f5595a.mo14738c(null);
        } else {
            mo24325b(status);
        }
    }

    /* renamed from: b */
    public final void mo24325b(Status status) {
        this.f5595a.mo14737b(new ApiException(status));
    }
}
