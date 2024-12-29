package com.google.android.gms.common.api.internal;

import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1394c;
import com.google.android.gms.common.api.C1396e;
import java.util.Map;
import java.util.Set;
import p011c.p012a.p019b.p028b.p038e.C0619h;
import p011c.p012a.p019b.p028b.p038e.C0620i;

/* renamed from: com.google.android.gms.common.api.internal.a2 */
public final class C1412a2 {

    /* renamed from: a */
    private final ArrayMap<C1503y1<?>, ConnectionResult> f2608a = new ArrayMap<>();

    /* renamed from: b */
    private final ArrayMap<C1503y1<?>, String> f2609b = new ArrayMap<>();

    /* renamed from: c */
    private final C0620i<Map<C1503y1<?>, String>> f2610c = new C0620i<>();

    /* renamed from: d */
    private int f2611d;

    /* renamed from: e */
    private boolean f2612e = false;

    public C1412a2(Iterable<? extends C1396e<?>> iterable) {
        for (C1396e m : iterable) {
            this.f2608a.put(m.mo10823m(), null);
        }
        this.f2611d = this.f2608a.keySet().size();
    }

    /* renamed from: a */
    public final C0619h<Map<C1503y1<?>, String>> mo10866a() {
        return this.f2610c.mo8666a();
    }

    /* renamed from: b */
    public final void mo10867b(C1503y1<?> y1Var, ConnectionResult connectionResult, @Nullable String str) {
        this.f2608a.put(y1Var, connectionResult);
        this.f2609b.put(y1Var, str);
        this.f2611d--;
        if (!connectionResult.mo10749V()) {
            this.f2612e = true;
        }
        if (this.f2611d != 0) {
            return;
        }
        if (this.f2612e) {
            this.f2610c.mo8667b(new C1394c(this.f2608a));
            return;
        }
        this.f2610c.mo8668c(this.f2609b);
    }

    /* renamed from: c */
    public final Set<C1503y1<?>> mo10868c() {
        return this.f2608a.keySet();
    }
}
