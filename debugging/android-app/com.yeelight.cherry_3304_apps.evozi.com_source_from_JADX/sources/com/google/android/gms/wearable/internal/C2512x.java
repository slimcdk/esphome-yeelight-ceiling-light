package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.wearable.C2423f;
import com.google.android.gms.wearable.C2424g;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.wearable.internal.x */
public final class C2512x implements C2423f {

    /* renamed from: a */
    private Uri f4919a;

    /* renamed from: b */
    private byte[] f4920b;

    /* renamed from: c */
    private Map<String, C2424g> f4921c;

    public C2512x(C2423f fVar) {
        this.f4919a = fVar.mo13226M();
        this.f4920b = fVar.mo13227h();
        HashMap hashMap = new HashMap();
        for (Map.Entry next : fVar.mo13228u().entrySet()) {
            if (next.getKey() != null) {
                hashMap.put((String) next.getKey(), (C2424g) ((C2424g) next.getValue()).mo11089L());
            }
        }
        this.f4921c = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: L */
    public final /* bridge */ /* synthetic */ Object mo11089L() {
        return this;
    }

    /* renamed from: M */
    public final Uri mo13226M() {
        return this.f4919a;
    }

    /* renamed from: h */
    public final byte[] mo13227h() {
        return this.f4920b;
    }

    public final String toString() {
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        StringBuilder sb = new StringBuilder("DataItemEntity{ ");
        String valueOf = String.valueOf(this.f4919a);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 4);
        sb2.append("uri=");
        sb2.append(valueOf);
        sb.append(sb2.toString());
        byte[] bArr = this.f4920b;
        String valueOf2 = String.valueOf(bArr == null ? "null" : Integer.valueOf(bArr.length));
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 9);
        sb3.append(", dataSz=");
        sb3.append(valueOf2);
        sb.append(sb3.toString());
        int size = this.f4921c.size();
        StringBuilder sb4 = new StringBuilder(23);
        sb4.append(", numAssets=");
        sb4.append(size);
        sb.append(sb4.toString());
        if (isLoggable && !this.f4921c.isEmpty()) {
            sb.append(", assets=[");
            String str = "";
            for (Map.Entry next : this.f4921c.entrySet()) {
                String str2 = (String) next.getKey();
                String id = ((C2424g) next.getValue()).getId();
                StringBuilder sb5 = new StringBuilder(str.length() + 2 + String.valueOf(str2).length() + String.valueOf(id).length());
                sb5.append(str);
                sb5.append(str2);
                sb5.append(": ");
                sb5.append(id);
                sb.append(sb5.toString());
                str = ", ";
            }
            sb.append("]");
        }
        sb.append(" }");
        return sb.toString();
    }

    /* renamed from: u */
    public final Map<String, C2424g> mo13228u() {
        return this.f4921c;
    }
}
