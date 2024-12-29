package com.google.android.gms.wearable;

import com.google.android.gms.common.api.C1507j;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.C1526e;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.C2500t;

/* renamed from: com.google.android.gms.wearable.e */
public class C2422e extends C1526e<C2421d> implements C1507j {

    /* renamed from: d */
    private final Status f4854d;

    public C2422e(DataHolder dataHolder) {
        super(dataHolder);
        this.f4854d = new Status(dataHolder.mo11065T());
    }

    /* renamed from: K */
    public Status mo10772K() {
        return this.f4854d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public /* synthetic */ Object mo11087d(int i, int i2) {
        return new C2500t(this.f2892a, i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo11088e() {
        return "path";
    }
}
