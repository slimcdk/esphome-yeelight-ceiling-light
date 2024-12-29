package com.google.android.gms.wearable.internal;

import androidx.core.p005os.EnvironmentCompat;
import com.google.android.gms.wearable.C2421d;
import com.google.android.gms.wearable.C2423f;

/* renamed from: com.google.android.gms.wearable.internal.s */
public final class C2497s implements C2421d {

    /* renamed from: a */
    private int f4913a;

    /* renamed from: b */
    private C2423f f4914b;

    public C2497s(C2421d dVar) {
        this.f4913a = dVar.getType();
        this.f4914b = (C2423f) dVar.mo13224F().mo11089L();
    }

    /* renamed from: F */
    public final C2423f mo13224F() {
        return this.f4914b;
    }

    /* renamed from: L */
    public final /* bridge */ /* synthetic */ Object mo11089L() {
        return this;
    }

    public final int getType() {
        return this.f4913a;
    }

    public final String toString() {
        String str = getType() == 1 ? "changed" : getType() == 2 ? "deleted" : EnvironmentCompat.MEDIA_UNKNOWN;
        String valueOf = String.valueOf(mo13224F());
        StringBuilder sb = new StringBuilder(str.length() + 35 + String.valueOf(valueOf).length());
        sb.append("DataEventEntity{ type=");
        sb.append(str);
        sb.append(", dataitem=");
        sb.append(valueOf);
        sb.append(" }");
        return sb.toString();
    }
}
