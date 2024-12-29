package p069n0;

import android.util.Base64;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.C0895b;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.wearable.C1448g3;
import com.google.android.gms.internal.wearable.C1453h3;
import com.google.android.gms.internal.wearable.C1508s3;
import com.google.android.gms.internal.wearable.zzcc;
import com.google.android.gms.wearable.Asset;
import java.util.ArrayList;

@VisibleForTesting
/* renamed from: n0.i */
public class C3363i {

    /* renamed from: a */
    private final C3362h f5479a;

    private C3363i(C3360f fVar) {
        C3362h hVar;
        fVar.mo14869T();
        C3360f fVar2 = (C3360f) fVar.mo14826P();
        if (fVar2.mo14870m() != null || fVar2.mo14868A().size() <= 0) {
            if (fVar2.mo14870m() == null) {
                hVar = new C3362h();
            } else {
                try {
                    ArrayList arrayList = new ArrayList();
                    int size = fVar2.mo14868A().size();
                    int i = 0;
                    while (i < size) {
                        C3361g gVar = fVar2.mo14868A().get(Integer.toString(i));
                        if (gVar != null) {
                            arrayList.add(Asset.m5020W(gVar.getId()));
                            i++;
                        } else {
                            String valueOf = String.valueOf(fVar2);
                            StringBuilder sb = new StringBuilder(valueOf.length() + 64);
                            sb.append("Cannot find DataItemAsset referenced in data at ");
                            sb.append(i);
                            sb.append(" for ");
                            sb.append(valueOf);
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                    hVar = C1453h3.m3549b(new C1448g3(C1508s3.m3796x(fVar2.mo14870m()), arrayList));
                } catch (zzcc | NullPointerException e) {
                    String valueOf2 = String.valueOf(fVar2.mo14869T());
                    String encodeToString = Base64.encodeToString(fVar2.mo14870m(), 0);
                    StringBuilder sb2 = new StringBuilder(valueOf2.length() + 50 + String.valueOf(encodeToString).length());
                    sb2.append("Unable to parse datamap from dataItem. uri=");
                    sb2.append(valueOf2);
                    sb2.append(", data=");
                    sb2.append(encodeToString);
                    String valueOf3 = String.valueOf(fVar2.mo14869T());
                    StringBuilder sb3 = new StringBuilder(valueOf3.length() + 44);
                    sb3.append("Unable to parse datamap from dataItem.  uri=");
                    sb3.append(valueOf3);
                    throw new IllegalStateException(sb3.toString(), e);
                }
            }
            this.f5479a = hVar;
            return;
        }
        throw new IllegalArgumentException("Cannot create DataMapItem from a DataItem  that wasn't made with DataMapItem.");
    }

    @RecentlyNonNull
    /* renamed from: a */
    public static C3363i m9200a(@RecentlyNonNull C3360f fVar) {
        C0895b.m1290d(fVar, "dataItem must not be null");
        return new C3363i(fVar);
    }

    @RecentlyNonNull
    /* renamed from: b */
    public C3362h mo24137b() {
        return this.f5479a;
    }
}
