package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C1422d;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.google.android.gms.wearable.internal.x0 */
final class C2513x0<T> extends C2430a2<Status> {

    /* renamed from: b */
    private WeakReference<Map<T, C2458h2<T>>> f4922b;

    /* renamed from: c */
    private WeakReference<T> f4923c;

    C2513x0(Map<T, C2458h2<T>> map, T t, C1422d<Status> dVar) {
        super(dVar);
        this.f4922b = new WeakReference<>(map);
        this.f4923c = new WeakReference<>(t);
    }

    /* renamed from: v0 */
    public final void mo13282v0(Status status) {
        Map map = (Map) this.f4922b.get();
        Object obj = this.f4923c.get();
        status.mo10772K();
        if (!(status.mo10776T() || map == null || obj == null)) {
            synchronized (map) {
                C2458h2 h2Var = (C2458h2) map.remove(obj);
                if (h2Var != null) {
                    h2Var.mo13324c();
                }
            }
        }
        mo13286c(status);
    }
}
