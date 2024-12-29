package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.C2424g;
import com.xiaomi.mipush.sdk.Constants;

/* renamed from: com.google.android.gms.wearable.internal.u */
public final class C2503u implements C2424g {

    /* renamed from: a */
    private final String f4916a;

    /* renamed from: b */
    private final String f4917b;

    public C2503u(C2424g gVar) {
        this.f4916a = gVar.getId();
        this.f4917b = gVar.mo13230o();
    }

    /* renamed from: L */
    public final /* bridge */ /* synthetic */ Object mo11089L() {
        return this;
    }

    public final String getId() {
        return this.f4916a;
    }

    /* renamed from: o */
    public final String mo13230o() {
        return this.f4917b;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("DataItemAssetEntity[");
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        if (this.f4916a == null) {
            str = ",noid";
        } else {
            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            str = this.f4916a;
        }
        sb.append(str);
        sb.append(", key=");
        sb.append(this.f4917b);
        sb.append("]");
        return sb.toString();
    }
}
