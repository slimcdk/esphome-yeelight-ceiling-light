package p109w;

import com.google.android.gms.common.api.C0741f;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C1872a;
import java.util.concurrent.TimeUnit;
import p109w.C3835e;

/* renamed from: w.v */
final class C3862v implements C0741f.C0742a {

    /* renamed from: a */
    final /* synthetic */ C0741f f6477a;

    /* renamed from: b */
    final /* synthetic */ C1872a f6478b;

    /* renamed from: c */
    final /* synthetic */ C3835e.C3836a f6479c;

    C3862v(C0741f fVar, C1872a aVar, C3835e.C3836a aVar2, C3863w wVar) {
        this.f6477a = fVar;
        this.f6478b = aVar;
        this.f6479c = aVar2;
    }

    /* renamed from: a */
    public final void mo11877a(Status status) {
        if (status.mo11812g0()) {
            this.f6478b.mo14738c(this.f6479c.mo24272a(this.f6477a.mo11876c(0, TimeUnit.MILLISECONDS)));
            return;
        }
        this.f6478b.mo14737b(C3827a.m10925a(status));
    }
}
