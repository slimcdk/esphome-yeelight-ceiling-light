package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.internal.C0793j;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataApi;
import p069n0.C3359e;

/* renamed from: com.google.android.gms.wearable.internal.g */
final class C1916g implements C0793j.C0795b<DataApi.C1899a> {

    /* renamed from: a */
    final /* synthetic */ DataHolder f2992a;

    C1916g(DataHolder dataHolder) {
        this.f2992a = dataHolder;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12012a(Object obj) {
        try {
            ((DataApi.C1899a) obj).mo14796b(new C3359e(this.f2992a));
        } finally {
            this.f2992a.close();
        }
    }

    /* renamed from: b */
    public final void mo12013b() {
        this.f2992a.close();
    }
}
