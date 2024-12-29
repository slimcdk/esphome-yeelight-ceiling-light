package p076o0;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C0768e;
import com.google.android.gms.wearable.internal.C1919j;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: o0.u0 */
final class C3483u0<T> extends C3496y1<Status> {

    /* renamed from: b */
    private final WeakReference<Map<T, C1919j<T>>> f5588b;

    /* renamed from: c */
    private final WeakReference<T> f5589c;

    C3483u0(Map<T, C1919j<T>> map, T t, C0768e<Status> eVar) {
        super(eVar);
        this.f5588b = new WeakReference<>(map);
        this.f5589c = new WeakReference<>(t);
    }

    /* renamed from: I */
    public final void mo24214I(Status status) {
        Map map = (Map) this.f5588b.get();
        Object obj = this.f5589c.get();
        if (!(status.mo11805N().mo11808c0() != 4002 || map == null || obj == null)) {
            synchronized (map) {
                C1919j jVar = (C1919j) map.remove(obj);
                if (jVar != null) {
                    jVar.mo14840D0();
                }
            }
        }
        mo24331e(status);
    }
}
