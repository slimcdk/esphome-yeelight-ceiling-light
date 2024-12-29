package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.internal.C1445i;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.C2422e;
import com.google.android.gms.wearable.DataApi;

/* renamed from: com.google.android.gms.wearable.internal.i2 */
final class C2462i2 implements C1445i.C1447b<DataApi.C2413a> {

    /* renamed from: a */
    private final /* synthetic */ DataHolder f4895a;

    C2462i2(DataHolder dataHolder) {
        this.f4895a = dataHolder;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo10954a(Object obj) {
        try {
            ((DataApi.C2413a) obj).mo13199b(new C2422e(this.f4895a));
        } finally {
            this.f4895a.close();
        }
    }

    /* renamed from: b */
    public final void mo10955b() {
        this.f4895a.close();
    }
}
