package p076o0;

import android.net.Uri;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p069n0.C3360f;
import p069n0.C3361g;

/* renamed from: o0.v */
public final class C3485v implements C3360f {

    /* renamed from: a */
    private Uri f5591a;

    /* renamed from: b */
    private byte[] f5592b;

    /* renamed from: c */
    private Map<String, C3361g> f5593c;

    public C3485v(C3360f fVar) {
        this.f5591a = fVar.mo14869T();
        this.f5592b = fVar.mo14870m();
        HashMap hashMap = new HashMap();
        for (Map.Entry next : fVar.mo14868A().entrySet()) {
            if (next.getKey() != null) {
                hashMap.put((String) next.getKey(), (C3361g) ((C3361g) next.getValue()).mo14826P());
            }
        }
        this.f5593c = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: A */
    public final Map<String, C3361g> mo14868A() {
        return this.f5593c;
    }

    /* renamed from: P */
    public final /* bridge */ /* synthetic */ Object mo14826P() {
        return this;
    }

    /* renamed from: T */
    public final Uri mo14869T() {
        return this.f5591a;
    }

    /* renamed from: m */
    public final byte[] mo14870m() {
        return this.f5592b;
    }

    public final String toString() {
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        StringBuilder sb = new StringBuilder("DataItemEntity{ ");
        String valueOf = String.valueOf(this.f5591a);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 4);
        sb2.append("uri=");
        sb2.append(valueOf);
        sb.append(sb2.toString());
        byte[] bArr = this.f5592b;
        String valueOf2 = String.valueOf(bArr == null ? "null" : Integer.valueOf(bArr.length));
        StringBuilder sb3 = new StringBuilder(valueOf2.length() + 9);
        sb3.append(", dataSz=");
        sb3.append(valueOf2);
        sb.append(sb3.toString());
        int size = this.f5593c.size();
        StringBuilder sb4 = new StringBuilder(23);
        sb4.append(", numAssets=");
        sb4.append(size);
        sb.append(sb4.toString());
        if (isLoggable && !this.f5593c.isEmpty()) {
            sb.append(", assets=[");
            String str = "";
            for (Map.Entry next : this.f5593c.entrySet()) {
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
