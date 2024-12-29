package p076o0;

import com.google.android.gms.common.api.internal.C0768e;
import com.google.android.gms.wearable.internal.zzge;
import java.util.List;
import java.util.concurrent.FutureTask;

/* renamed from: o0.c2 */
final class C3420c2 extends C3496y1<Object> {

    /* renamed from: b */
    private final List<FutureTask<Boolean>> f5554b;

    C3420c2(C0768e<Object> eVar, List<FutureTask<Boolean>> list) {
        super(eVar);
        this.f5554b = list;
    }

    /* renamed from: g0 */
    public final void mo24224g0(zzge zzge) {
        mo24331e(new C3461n(C3478s1.m9523a(zzge.f3071a), zzge.f3072b));
        if (zzge.f3071a != 0) {
            for (FutureTask<Boolean> cancel : this.f5554b) {
                cancel.cancel(true);
            }
        }
    }
}
