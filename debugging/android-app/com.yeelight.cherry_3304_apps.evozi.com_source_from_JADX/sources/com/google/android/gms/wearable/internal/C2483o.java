package com.google.android.gms.wearable.internal;

import android.content.Context;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.C1396e;
import com.google.android.gms.common.api.internal.C1445i;
import com.google.android.gms.common.api.internal.C1452j;
import com.google.android.gms.wearable.DataClient;
import p011c.p012a.p019b.p028b.p038e.C0619h;

/* renamed from: com.google.android.gms.wearable.internal.o */
public final class C2483o extends DataClient {
    public C2483o(@NonNull Context context, @NonNull C1396e.C1397a aVar) {
        super(context, aVar);
    }

    /* renamed from: p */
    private final C0619h<Void> m8015p(DataClient.C2414a aVar, IntentFilter[] intentFilterArr) {
        C1445i a = C1452j.m3880a(aVar, mo10820i(), "DataListener");
        return mo10815d(new C2491q(aVar, intentFilterArr, a), new C2494r(aVar, a.mo10949b()));
    }

    /* renamed from: n */
    public final C0619h<Void> mo13200n(@NonNull DataClient.C2414a aVar) {
        return m8015p(aVar, new IntentFilter[]{C2520z1.m8104b("com.google.android.gms.wearable.DATA_CHANGED")});
    }

    /* renamed from: o */
    public final C0619h<Boolean> mo13201o(@NonNull DataClient.C2414a aVar) {
        return mo10816e(C1452j.m3880a(aVar, mo10820i(), "DataListener").mo10949b());
    }
}
