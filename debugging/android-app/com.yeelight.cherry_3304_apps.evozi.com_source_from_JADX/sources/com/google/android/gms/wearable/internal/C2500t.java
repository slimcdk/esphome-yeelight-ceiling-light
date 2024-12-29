package com.google.android.gms.wearable.internal;

import androidx.core.p005os.EnvironmentCompat;
import com.google.android.gms.common.data.C1525d;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.C2421d;
import com.google.android.gms.wearable.C2423f;

/* renamed from: com.google.android.gms.wearable.internal.t */
public final class C2500t extends C1525d implements C2421d {

    /* renamed from: d */
    private final int f4915d;

    public C2500t(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.f4915d = i2;
    }

    /* renamed from: F */
    public final C2423f mo13224F() {
        return new C2518z(this.f2895a, this.f2896b, this.f4915d);
    }

    /* renamed from: L */
    public final /* synthetic */ Object mo11089L() {
        return new C2497s(this);
    }

    public final int getType() {
        return mo11081b("event_type");
    }

    public final String toString() {
        String str = getType() == 1 ? "changed" : getType() == 2 ? "deleted" : EnvironmentCompat.MEDIA_UNKNOWN;
        String valueOf = String.valueOf(mo13224F());
        StringBuilder sb = new StringBuilder(str.length() + 32 + String.valueOf(valueOf).length());
        sb.append("DataEventRef{ type=");
        sb.append(str);
        sb.append(", dataitem=");
        sb.append(valueOf);
        sb.append(" }");
        return sb.toString();
    }
}
