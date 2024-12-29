package com.google.android.gms.wearable.internal;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.C1396e;
import com.google.android.gms.common.api.internal.C1445i;
import com.google.android.gms.common.api.internal.C1452j;
import com.google.android.gms.common.internal.C1548c;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.wearable.CapabilityClient;
import p011c.p012a.p019b.p028b.p038e.C0619h;

/* renamed from: com.google.android.gms.wearable.internal.b */
public final class C2431b extends CapabilityClient {
    public C2431b(@NonNull Context context, @NonNull C1396e.C1397a aVar) {
        super(context, aVar);
    }

    /* renamed from: o */
    private final C0619h<Void> m7941o(C1445i<CapabilityClient.C2412a> iVar, CapabilityClient.C2412a aVar, IntentFilter[] intentFilterArr) {
        return mo10815d(new C2439d(aVar, intentFilterArr, iVar), new C2443e(aVar, iVar.mo10949b()));
    }

    /* renamed from: n */
    public final C0619h<Void> mo13193n(@NonNull CapabilityClient.C2412a aVar, @NonNull Uri uri, int i) {
        C1548c.m4205d(aVar, "listener must not be null");
        C1548c.m4205d(uri, "uri must not be null");
        C1609u.m4466b(i == 0 || i == 1, "invalid filter type");
        return m7941o(C1452j.m3880a(aVar, mo10820i(), "CapabilityListener"), aVar, new IntentFilter[]{C2520z1.m8103a("com.google.android.gms.wearable.CAPABILITY_CHANGED", uri, i)});
    }
}
