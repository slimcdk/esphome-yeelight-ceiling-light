package p076o0;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.miot.bluetooth.channel.packet.Packet;
import java.util.HashMap;
import java.util.Map;
import p069n0.C3360f;
import p069n0.C3361g;
import p105v.C3726d;

/* renamed from: o0.w */
public final class C3488w extends C3726d implements C3360f {

    /* renamed from: d */
    private final int f5596d;

    public C3488w(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.f5596d = i2;
    }

    /* renamed from: A */
    public final Map<String, C3361g> mo14868A() {
        HashMap hashMap = new HashMap(this.f5596d);
        for (int i = 0; i < this.f5596d; i++) {
            C3482u uVar = new C3482u(this.f6254a, this.f6255b + i);
            if (uVar.mo26149c("asset_key") != null) {
                hashMap.put(uVar.mo26149c("asset_key"), uVar);
            }
        }
        return hashMap;
    }

    /* renamed from: P */
    public final /* bridge */ /* synthetic */ Object mo14826P() {
        return new C3485v(this);
    }

    /* renamed from: T */
    public final Uri mo14869T() {
        return Uri.parse(mo26149c("path"));
    }

    /* renamed from: m */
    public final byte[] mo14870m() {
        return mo26147a(Packet.DATA);
    }

    public final String toString() {
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        byte[] a = mo26147a(Packet.DATA);
        Map<String, C3361g> A = mo14868A();
        StringBuilder sb = new StringBuilder("DataItemRef{ ");
        String valueOf = String.valueOf(mo14869T());
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 4);
        sb2.append("uri=");
        sb2.append(valueOf);
        sb.append(sb2.toString());
        String valueOf2 = String.valueOf(a == null ? "null" : Integer.valueOf(a.length));
        StringBuilder sb3 = new StringBuilder(valueOf2.length() + 9);
        sb3.append(", dataSz=");
        sb3.append(valueOf2);
        sb.append(sb3.toString());
        int size = A.size();
        StringBuilder sb4 = new StringBuilder(23);
        sb4.append(", numAssets=");
        sb4.append(size);
        sb.append(sb4.toString());
        if (isLoggable && !A.isEmpty()) {
            sb.append(", assets=[");
            String str = "";
            for (Map.Entry next : A.entrySet()) {
                String str2 = (String) next.getKey();
                String id = ((C3361g) next.getValue()).getId();
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
}
