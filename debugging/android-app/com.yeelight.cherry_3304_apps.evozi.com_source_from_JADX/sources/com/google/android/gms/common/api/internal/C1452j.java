package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C1609u;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

@KeepForSdk
/* renamed from: com.google.android.gms.common.api.internal.j */
public class C1452j {

    /* renamed from: a */
    private final Set<C1445i<?>> f2706a = Collections.newSetFromMap(new WeakHashMap());

    @KeepForSdk
    /* renamed from: a */
    public static <L> C1445i<L> m3880a(@NonNull L l, @NonNull Looper looper, @NonNull String str) {
        C1609u.m4476l(l, "Listener must not be null");
        C1609u.m4476l(looper, "Looper must not be null");
        C1609u.m4476l(str, "Listener type must not be null");
        return new C1445i<>(looper, l, str);
    }

    /* renamed from: b */
    public final void mo10965b() {
        for (C1445i<?> a : this.f2706a) {
            a.mo10948a();
        }
        this.f2706a.clear();
    }
}
