package com.google.android.gms.internal.measurement;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.measurement.t2 */
final class C1997t2 {

    /* renamed from: a */
    private final ConcurrentHashMap<C1982s2, List<Throwable>> f3726a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f3727b = new ReferenceQueue<>();

    C1997t2() {
    }

    /* renamed from: a */
    public final List<Throwable> mo12090a(Throwable th, boolean z) {
        while (true) {
            Reference<? extends Throwable> poll = this.f3727b.poll();
            if (poll == null) {
                break;
            }
            this.f3726a.remove(poll);
        }
        List<Throwable> list = this.f3726a.get(new C1982s2(th, (ReferenceQueue<Throwable>) null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f3726a.putIfAbsent(new C1982s2(th, this.f3727b), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
