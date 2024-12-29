package com.google.android.gms.wearable;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.C1548c;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import p011c.p012a.p019b.p028b.p032c.p036d.C0584d;
import p011c.p012a.p019b.p028b.p032c.p036d.C0585e;
import p011c.p012a.p019b.p028b.p032c.p036d.C0586f;
import p011c.p012a.p019b.p028b.p032c.p036d.C0598r;

@VisibleForTesting
/* renamed from: com.google.android.gms.wearable.i */
public class C2426i {

    /* renamed from: a */
    private final Uri f4856a;

    /* renamed from: b */
    private final C2425h f4857b;

    private C2426i(C2423f fVar) {
        this.f4856a = fVar.mo13226M();
        this.f4857b = m7908c((C2423f) fVar.mo11089L());
    }

    /* renamed from: a */
    public static C2426i m7907a(@NonNull C2423f fVar) {
        C1548c.m4205d(fVar, "dataItem must not be null");
        return new C2426i(fVar);
    }

    /* renamed from: c */
    private static C2425h m7908c(C2423f fVar) {
        if (fVar.mo13227h() == null && fVar.mo13228u().size() > 0) {
            throw new IllegalArgumentException("Cannot create DataMapItem from a DataItem  that wasn't made with DataMapItem.");
        } else if (fVar.mo13227h() == null) {
            return new C2425h();
        } else {
            try {
                ArrayList arrayList = new ArrayList();
                int size = fVar.mo13228u().size();
                int i = 0;
                while (i < size) {
                    C2424g gVar = fVar.mo13228u().get(Integer.toString(i));
                    if (gVar != null) {
                        arrayList.add(Asset.m7843R(gVar.getId()));
                        i++;
                    } else {
                        String valueOf = String.valueOf(fVar);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 64);
                        sb.append("Cannot find DataItemAsset referenced in data at ");
                        sb.append(i);
                        sb.append(" for ");
                        sb.append(valueOf);
                        throw new IllegalStateException(sb.toString());
                    }
                }
                return C0584d.m363c(new C0585e(C0586f.m365i(fVar.mo13227h()), arrayList));
            } catch (C0598r | NullPointerException e) {
                String valueOf2 = String.valueOf(fVar.mo13226M());
                String encodeToString = Base64.encodeToString(fVar.mo13227h(), 0);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 50 + String.valueOf(encodeToString).length());
                sb2.append("Unable to parse datamap from dataItem. uri=");
                sb2.append(valueOf2);
                sb2.append(", data=");
                sb2.append(encodeToString);
                sb2.toString();
                String valueOf3 = String.valueOf(fVar.mo13226M());
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 44);
                sb3.append("Unable to parse datamap from dataItem.  uri=");
                sb3.append(valueOf3);
                throw new IllegalStateException(sb3.toString(), e);
            }
        }
    }

    /* renamed from: b */
    public C2425h mo13255b() {
        return this.f4857b;
    }
}
