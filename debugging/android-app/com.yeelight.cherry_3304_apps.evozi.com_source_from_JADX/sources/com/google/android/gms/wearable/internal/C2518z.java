package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.data.C1525d;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.C2423f;
import com.google.android.gms.wearable.C2424g;
import com.miot.bluetooth.channel.packet.Packet;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.wearable.internal.z */
public final class C2518z extends C1525d implements C2423f {

    /* renamed from: d */
    private final int f4928d;

    public C2518z(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.f4928d = i2;
    }

    /* renamed from: L */
    public final /* synthetic */ Object mo11089L() {
        return new C2512x(this);
    }

    /* renamed from: M */
    public final Uri mo13226M() {
        return Uri.parse(mo11082c("path"));
    }

    /* renamed from: h */
    public final byte[] mo13227h() {
        return mo11080a(Packet.DATA);
    }

    public final String toString() {
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        byte[] h = mo13227h();
        Map<String, C2424g> u = mo13228u();
        StringBuilder sb = new StringBuilder("DataItemRef{ ");
        String valueOf = String.valueOf(mo13226M());
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 4);
        sb2.append("uri=");
        sb2.append(valueOf);
        sb.append(sb2.toString());
        String valueOf2 = String.valueOf(h == null ? "null" : Integer.valueOf(h.length));
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 9);
        sb3.append(", dataSz=");
        sb3.append(valueOf2);
        sb.append(sb3.toString());
        int size = u.size();
        StringBuilder sb4 = new StringBuilder(23);
        sb4.append(", numAssets=");
        sb4.append(size);
        sb.append(sb4.toString());
        if (isLoggable && !u.isEmpty()) {
            sb.append(", assets=[");
            String str = "";
            for (Map.Entry next : u.entrySet()) {
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
        HashMap hashMap = new HashMap(this.f4928d);
        for (int i = 0; i < this.f4928d; i++) {
            C2509w wVar = new C2509w(this.f2895a, this.f2896b + i);
            if (wVar.mo13230o() != null) {
                hashMap.put(wVar.mo13230o(), wVar);
            }
        }
        return hashMap;
    }
}
