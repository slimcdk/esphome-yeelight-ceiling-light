package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.C1609u;
import com.yeelight.yeelib.p150c.p183m.C6363d;
import com.yeelight.yeelib.p150c.p183m.C7008l;
import com.yeelight.yeelib.p150c.p183m.C7070n;
import com.yeelight.yeelib.p150c.p183m.C7230s;
import com.yeelight.yeelib.p150c.p183m.C7260t;
import com.yeelight.yeelib.p150c.p183m.C7327v;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.measurement.internal.o4 */
public final class C2274o4 {

    /* renamed from: a */
    private final String f4397a;

    /* renamed from: b */
    private final Bundle f4398b = new Bundle();

    /* renamed from: c */
    private boolean f4399c;

    /* renamed from: d */
    private Bundle f4400d;

    /* renamed from: e */
    private final /* synthetic */ C2218j4 f4401e;

    public C2274o4(C2218j4 j4Var, String str, Bundle bundle) {
        this.f4401e = j4Var;
        C1609u.m4471g(str);
        this.f4397a = str;
    }

    /* renamed from: c */
    private final String m7317c(Bundle bundle) {
        String str;
        JSONArray jSONArray = new JSONArray();
        for (String str2 : bundle.keySet()) {
            Object obj = bundle.get(str2);
            if (obj != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(C7070n.f14495G, str2);
                    jSONObject.put(C7327v.f14888G, String.valueOf(obj));
                    if (obj instanceof String) {
                        str = C7230s.f14753G;
                    } else if (obj instanceof Long) {
                        str = C7008l.f14401G;
                    } else if (obj instanceof Double) {
                        str = C6363d.f13402G;
                    } else {
                        this.f4401e.mo12427b().mo13096F().mo13131b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                    }
                    jSONObject.put(C7260t.f14794G, str);
                    jSONArray.put(jSONObject);
                } catch (JSONException e) {
                    this.f4401e.mo12427b().mo13096F().mo13131b("Cannot serialize bundle value to SharedPreferences", e);
                }
            }
        }
        return jSONArray.toString();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:34|35|46) */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r12.f4401e.mo12427b().mo13096F().mo13130a("Error reading value from SharedPreferences. Value dropped");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00a0 */
    @androidx.annotation.WorkerThread
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo12858a() {
        /*
            r12 = this;
            boolean r0 = r12.f4399c
            if (r0 != 0) goto L_0x00cd
            r0 = 1
            r12.f4399c = r0
            com.google.android.gms.measurement.internal.j4 r1 = r12.f4401e
            android.content.SharedPreferences r1 = r1.mo12755B()
            java.lang.String r2 = r12.f4397a
            r3 = 0
            java.lang.String r1 = r1.getString(r2, r3)
            if (r1 == 0) goto L_0x00c5
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ JSONException -> 0x00b6 }
            r2.<init>()     // Catch:{ JSONException -> 0x00b6 }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00b6 }
            r3.<init>(r1)     // Catch:{ JSONException -> 0x00b6 }
            r1 = 0
            r4 = 0
        L_0x0022:
            int r5 = r3.length()     // Catch:{ JSONException -> 0x00b6 }
            if (r4 >= r5) goto L_0x00b3
            org.json.JSONObject r5 = r3.getJSONObject(r4)     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            java.lang.String r6 = "n"
            java.lang.String r6 = r5.getString(r6)     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            java.lang.String r7 = "t"
            java.lang.String r7 = r5.getString(r7)     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            r8 = -1
            int r9 = r7.hashCode()     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            r10 = 100
            r11 = 2
            if (r9 == r10) goto L_0x005f
            r10 = 108(0x6c, float:1.51E-43)
            if (r9 == r10) goto L_0x0055
            r10 = 115(0x73, float:1.61E-43)
            if (r9 == r10) goto L_0x004b
            goto L_0x0068
        L_0x004b:
            java.lang.String r9 = "s"
            boolean r9 = r7.equals(r9)     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            if (r9 == 0) goto L_0x0068
            r8 = 0
            goto L_0x0068
        L_0x0055:
            java.lang.String r9 = "l"
            boolean r9 = r7.equals(r9)     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            if (r9 == 0) goto L_0x0068
            r8 = 2
            goto L_0x0068
        L_0x005f:
            java.lang.String r9 = "d"
            boolean r9 = r7.equals(r9)     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            if (r9 == 0) goto L_0x0068
            r8 = 1
        L_0x0068:
            java.lang.String r9 = "v"
            if (r8 == 0) goto L_0x0098
            if (r8 == r0) goto L_0x008c
            if (r8 == r11) goto L_0x0080
            com.google.android.gms.measurement.internal.j4 r5 = r12.f4401e     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            com.google.android.gms.measurement.internal.w3 r5 = r5.mo12427b()     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            com.google.android.gms.measurement.internal.y3 r5 = r5.mo13096F()     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            java.lang.String r6 = "Unrecognized persisted bundle type. Type"
            r5.mo13131b(r6, r7)     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            goto L_0x00af
        L_0x0080:
            java.lang.String r5 = r5.getString(r9)     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            long r7 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            r2.putLong(r6, r7)     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            goto L_0x00af
        L_0x008c:
            java.lang.String r5 = r5.getString(r9)     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            double r7 = java.lang.Double.parseDouble(r5)     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            r2.putDouble(r6, r7)     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            goto L_0x00af
        L_0x0098:
            java.lang.String r5 = r5.getString(r9)     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            r2.putString(r6, r5)     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            goto L_0x00af
        L_0x00a0:
            com.google.android.gms.measurement.internal.j4 r5 = r12.f4401e     // Catch:{ JSONException -> 0x00b6 }
            com.google.android.gms.measurement.internal.w3 r5 = r5.mo12427b()     // Catch:{ JSONException -> 0x00b6 }
            com.google.android.gms.measurement.internal.y3 r5 = r5.mo13096F()     // Catch:{ JSONException -> 0x00b6 }
            java.lang.String r6 = "Error reading value from SharedPreferences. Value dropped"
            r5.mo13130a(r6)     // Catch:{ JSONException -> 0x00b6 }
        L_0x00af:
            int r4 = r4 + 1
            goto L_0x0022
        L_0x00b3:
            r12.f4400d = r2     // Catch:{ JSONException -> 0x00b6 }
            goto L_0x00c5
        L_0x00b6:
            com.google.android.gms.measurement.internal.j4 r0 = r12.f4401e
            com.google.android.gms.measurement.internal.w3 r0 = r0.mo12427b()
            com.google.android.gms.measurement.internal.y3 r0 = r0.mo13096F()
            java.lang.String r1 = "Error loading bundle from SharedPreferences. Values will be lost"
            r0.mo13130a(r1)
        L_0x00c5:
            android.os.Bundle r0 = r12.f4400d
            if (r0 != 0) goto L_0x00cd
            android.os.Bundle r0 = r12.f4398b
            r12.f4400d = r0
        L_0x00cd:
            android.os.Bundle r0 = r12.f4400d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2274o4.mo12858a():android.os.Bundle");
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo12859b(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor edit = this.f4401e.mo12755B().edit();
        if (bundle.size() == 0) {
            edit.remove(this.f4397a);
        } else {
            edit.putString(this.f4397a, m7317c(bundle));
        }
        edit.apply();
        this.f4400d = bundle;
    }
}
