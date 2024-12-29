package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C1422d;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.google.android.gms.wearable.internal.y0 */
final class C2516y0<T> extends C2430a2<Status> {

    /* renamed from: b */
    private WeakReference<Map<T, C2458h2<T>>> f4925b;

    /* renamed from: c */
    private WeakReference<T> f4926c;

    C2516y0(Map<T, C2458h2<T>> map, T t, C1422d<Status> dVar) {
        super(dVar);
        this.f4925b = new WeakReference<>(map);
        this.f4926c = new WeakReference<>(t);
    }

    /* renamed from: v0 */
    public final void mo13282v0(Status status) {
        Map map = (Map) this.f4925b.get();
        Object obj = this.f4926c.get();
        status.mo10772K();
        if (!(status.mo10773Q() != 4002 || map == null || obj == null)) {
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
