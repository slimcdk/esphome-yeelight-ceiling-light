package com.google.android.gms.common.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C0722a;
import com.google.android.gms.common.api.internal.C0752b;
import com.google.android.gms.common.internal.C0917i;
import java.util.ArrayList;

public class AvailabilityException extends Exception {
    private final ArrayMap zaa;

    public AvailabilityException(@NonNull ArrayMap arrayMap) {
        this.zaa = arrayMap;
    }

    @NonNull
    public ConnectionResult getConnectionResult(@NonNull C0733c<? extends C0722a.C0726d> cVar) {
        C0752b<? extends C0722a.C0726d> b = cVar.mo11846b();
        boolean z = this.zaa.get(b) != null;
        String b2 = b.mo11903b();
        C0917i.m1411b(z, "The given API (" + b2 + ") was not part of the availability request.");
        return (ConnectionResult) C0917i.m1419j((ConnectionResult) this.zaa.get(b));
    }

    @NonNull
    public ConnectionResult getConnectionResult(@NonNull C0740e<? extends C0722a.C0726d> eVar) {
        C0752b<? extends C0722a.C0726d> b = eVar.mo11846b();
        boolean z = this.zaa.get(b) != null;
        String b2 = b.mo11903b();
        C0917i.m1411b(z, "The given API (" + b2 + ") was not part of the availability request.");
        return (ConnectionResult) C0917i.m1419j((ConnectionResult) this.zaa.get(b));
    }

    @NonNull
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (C0752b bVar : this.zaa.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) C0917i.m1419j((ConnectionResult) this.zaa.get(bVar));
            z &= !connectionResult.mo11756f0();
            String b = bVar.mo11903b();
            String valueOf = String.valueOf(connectionResult);
            arrayList.add(b + ": " + valueOf);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "None of the queried APIs are available. " : "Some of the queried APIs are unavailable. ");
        sb.append(TextUtils.join("; ", arrayList));
        return sb.toString();
    }
}
