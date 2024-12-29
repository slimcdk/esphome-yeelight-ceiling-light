package com.google.android.gms.common.api.internal;

import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.tasks.C1872a;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.internal.y2 */
public final class C0866y2 {

    /* renamed from: a */
    private final ArrayMap f856a;

    /* renamed from: b */
    private final ArrayMap f857b;

    /* renamed from: c */
    private final C1872a f858c;

    /* renamed from: d */
    private int f859d;

    /* renamed from: e */
    private boolean f860e;

    /* renamed from: a */
    public final Set mo12098a() {
        return this.f856a.keySet();
    }

    /* renamed from: b */
    public final void mo12099b(C0752b bVar, ConnectionResult connectionResult, @Nullable String str) {
        this.f856a.put(bVar, connectionResult);
        this.f857b.put(bVar, str);
        this.f859d--;
        if (!connectionResult.mo11756f0()) {
            this.f860e = true;
        }
        if (this.f859d != 0) {
            return;
        }
        if (this.f860e) {
            this.f858c.mo14737b(new AvailabilityException(this.f856a));
            return;
        }
        this.f858c.mo14738c(this.f857b);
    }
}
