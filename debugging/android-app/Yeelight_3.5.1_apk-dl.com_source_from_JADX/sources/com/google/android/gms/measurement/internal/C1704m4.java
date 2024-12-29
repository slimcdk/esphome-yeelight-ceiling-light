package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.C0917i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p223w3.C10744d;
import p223w3.C11363l;
import p223w3.C11480n;
import p223w3.C11641s;
import p223w3.C11671t;
import p223w3.C11733v;

/* renamed from: com.google.android.gms.measurement.internal.m4 */
public final class C1704m4 {

    /* renamed from: a */
    private final String f2297a = "default_event_parameters";

    /* renamed from: b */
    private final Bundle f2298b = new Bundle();

    /* renamed from: c */
    private Bundle f2299c;

    /* renamed from: d */
    final /* synthetic */ C1764r4 f2300d;

    public C1704m4(C1764r4 r4Var, String str, Bundle bundle) {
        this.f2300d = r4Var;
        C0917i.m1415f("default_event_parameters");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:35|36|47) */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r11.f2300d.f2143a.mo14228b().mo14035r().mo14693a("Error reading value from SharedPreferences. Value dropped");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00a3 */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009b A[Catch:{ NumberFormatException | JSONException -> 0x00a3 }] */
    @androidx.annotation.WorkerThread
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo14359a() {
        /*
            r11 = this;
            android.os.Bundle r0 = r11.f2299c
            if (r0 == 0) goto L_0x0006
            goto L_0x00d4
        L_0x0006:
            com.google.android.gms.measurement.internal.r4 r0 = r11.f2300d
            android.content.SharedPreferences r0 = r0.mo14445o()
            java.lang.String r1 = r11.f2297a
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 == 0) goto L_0x00cc
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ JSONException -> 0x00bb }
            r1.<init>()     // Catch:{ JSONException -> 0x00bb }
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00bb }
            r2.<init>(r0)     // Catch:{ JSONException -> 0x00bb }
            r0 = 0
            r3 = 0
        L_0x0021:
            int r4 = r2.length()     // Catch:{ JSONException -> 0x00bb }
            if (r3 >= r4) goto L_0x00b8
            org.json.JSONObject r4 = r2.getJSONObject(r3)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            java.lang.String r5 = "n"
            java.lang.String r5 = r4.getString(r5)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            java.lang.String r6 = "t"
            java.lang.String r6 = r4.getString(r6)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            int r7 = r6.hashCode()     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            r8 = 100
            r9 = 2
            r10 = 1
            if (r7 == r8) goto L_0x005e
            r8 = 108(0x6c, float:1.51E-43)
            if (r7 == r8) goto L_0x0054
            r8 = 115(0x73, float:1.61E-43)
            if (r7 == r8) goto L_0x004a
            goto L_0x0068
        L_0x004a:
            java.lang.String r7 = "s"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0068
            r7 = 0
            goto L_0x0069
        L_0x0054:
            java.lang.String r7 = "l"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0068
            r7 = 2
            goto L_0x0069
        L_0x005e:
            java.lang.String r7 = "d"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0068
            r7 = 1
            goto L_0x0069
        L_0x0068:
            r7 = -1
        L_0x0069:
            java.lang.String r8 = "v"
            if (r7 == 0) goto L_0x009b
            if (r7 == r10) goto L_0x008f
            if (r7 == r9) goto L_0x0083
            com.google.android.gms.measurement.internal.r4 r4 = r11.f2300d     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            com.google.android.gms.measurement.internal.n5 r4 = r4.f2143a     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            com.google.android.gms.measurement.internal.c4 r4 = r4.mo14228b()     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            com.google.android.gms.measurement.internal.z3 r4 = r4.mo14035r()     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            java.lang.String r5 = "Unrecognized persisted bundle type. Type"
            r4.mo14694b(r5, r6)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            goto L_0x00b4
        L_0x0083:
            java.lang.String r4 = r4.getString(r8)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            long r6 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            r1.putLong(r5, r6)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            goto L_0x00b4
        L_0x008f:
            java.lang.String r4 = r4.getString(r8)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            double r6 = java.lang.Double.parseDouble(r4)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            r1.putDouble(r5, r6)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            goto L_0x00b4
        L_0x009b:
            java.lang.String r4 = r4.getString(r8)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            r1.putString(r5, r4)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            goto L_0x00b4
        L_0x00a3:
            com.google.android.gms.measurement.internal.r4 r4 = r11.f2300d     // Catch:{ JSONException -> 0x00bb }
            com.google.android.gms.measurement.internal.n5 r4 = r4.f2143a     // Catch:{ JSONException -> 0x00bb }
            com.google.android.gms.measurement.internal.c4 r4 = r4.mo14228b()     // Catch:{ JSONException -> 0x00bb }
            com.google.android.gms.measurement.internal.z3 r4 = r4.mo14035r()     // Catch:{ JSONException -> 0x00bb }
            java.lang.String r5 = "Error reading value from SharedPreferences. Value dropped"
            r4.mo14693a(r5)     // Catch:{ JSONException -> 0x00bb }
        L_0x00b4:
            int r3 = r3 + 1
            goto L_0x0021
        L_0x00b8:
            r11.f2299c = r1     // Catch:{ JSONException -> 0x00bb }
            goto L_0x00cc
        L_0x00bb:
            com.google.android.gms.measurement.internal.r4 r0 = r11.f2300d
            com.google.android.gms.measurement.internal.n5 r0 = r0.f2143a
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo14228b()
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo14035r()
            java.lang.String r1 = "Error loading bundle from SharedPreferences. Values will be lost"
            r0.mo14693a(r1)
        L_0x00cc:
            android.os.Bundle r0 = r11.f2299c
            if (r0 != 0) goto L_0x00d4
            android.os.Bundle r0 = r11.f2298b
            r11.f2299c = r0
        L_0x00d4:
            android.os.Bundle r0 = r11.f2299c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1704m4.mo14359a():android.os.Bundle");
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo14360b(Bundle bundle) {
        String str;
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor edit = this.f2300d.mo14445o().edit();
        if (bundle.size() == 0) {
            edit.remove(this.f2297a);
        } else {
            String str2 = this.f2297a;
            JSONArray jSONArray = new JSONArray();
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(C11480n.f21133C, str3);
                        jSONObject.put(C11733v.f21527C, obj.toString());
                        if (obj instanceof String) {
                            str = C11641s.f21397C;
                        } else if (obj instanceof Long) {
                            str = C11363l.f20954Q;
                        } else if (obj instanceof Double) {
                            str = C10744d.f19988C;
                        } else {
                            this.f2300d.f2143a.mo14228b().mo14035r().mo14694b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                        jSONObject.put(C11671t.f21438C, str);
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        this.f2300d.f2143a.mo14228b().mo14035r().mo14694b("Cannot serialize bundle value to SharedPreferences", e);
                    }
                }
            }
            edit.putString(str2, jSONArray.toString());
        }
        edit.apply();
        this.f2299c = bundle;
    }
}
