package com.google.android.gms.common.api;

import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1382a;
import com.google.android.gms.common.api.internal.C1503y1;
import com.google.android.gms.common.internal.C1609u;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.api.c */
public class C1394c extends Exception {

    /* renamed from: a */
    private final ArrayMap<C1503y1<?>, ConnectionResult> f2556a;

    public C1394c(ArrayMap<C1503y1<?>, ConnectionResult> arrayMap) {
        this.f2556a = arrayMap;
    }

    /* renamed from: a */
    public ConnectionResult mo10809a(C1396e<? extends C1382a.C1386d> eVar) {
        C1503y1<? extends C1382a.C1386d> m = eVar.mo10823m();
        C1609u.m4466b(this.f2556a.get(m) != null, "The given API was not part of the availability request.");
        return this.f2556a.get(m);
    }

    /* renamed from: b */
    public final ArrayMap<C1503y1<?>, ConnectionResult> mo10810b() {
        return this.f2556a;
    }

    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (C1503y1 next : this.f2556a.keySet()) {
            ConnectionResult connectionResult = this.f2556a.get(next);
            if (connectionResult.mo10749V()) {
                z = false;
            }
            String c = next.mo11024c();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 2 + String.valueOf(valueOf).length());
            sb.append(c);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z ? "None of the queried APIs are available. " : "Some of the queried APIs are unavailable. ");
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
