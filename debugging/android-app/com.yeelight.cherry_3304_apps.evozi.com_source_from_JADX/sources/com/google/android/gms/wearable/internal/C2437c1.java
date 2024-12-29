package com.google.android.gms.wearable.internal;

import android.content.Context;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.C1396e;
import com.google.android.gms.common.api.internal.C1445i;
import com.google.android.gms.common.api.internal.C1452j;
import com.google.android.gms.common.internal.C1605t;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.wearable.MessageApi;
import com.google.android.gms.wearable.MessageClient;
import p011c.p012a.p019b.p028b.p038e.C0619h;

/* renamed from: com.google.android.gms.wearable.internal.c1 */
public final class C2437c1 extends MessageClient {
    @VisibleForTesting

    /* renamed from: i */
    private final MessageApi f4866i = new C2519z0();

    public C2437c1(@NonNull Context context, @NonNull C1396e.C1397a aVar) {
        super(context, aVar);
    }

    /* renamed from: q */
    private final C0619h<Void> m7946q(MessageClient.C2417a aVar, IntentFilter[] intentFilterArr) {
        C1445i a = C1452j.m3880a(aVar, mo10820i(), "MessageListener");
        return mo10815d(new C2449f1(aVar, intentFilterArr, a), new C2453g1(aVar, a.mo10949b()));
    }

    /* renamed from: n */
    public final C0619h<Void> mo13205n(MessageClient.C2417a aVar) {
        return m7946q(aVar, new IntentFilter[]{C2520z1.m8104b("com.google.android.gms.wearable.MESSAGE_RECEIVED")});
    }

    /* renamed from: o */
    public final C0619h<Boolean> mo13206o(@NonNull MessageClient.C2417a aVar) {
        return mo10816e(C1452j.m3880a(aVar, mo10820i(), "MessageListener").mo10949b());
    }

    /* renamed from: p */
    public final C0619h<Integer> mo13207p(String str, String str2, byte[] bArr) {
        return C1605t.m4461a(this.f4866i.mo13202a(mo10812a(), str, str2, bArr), C2441d1.f4870a);
    }
}
