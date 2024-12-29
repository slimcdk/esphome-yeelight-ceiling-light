package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C1599s;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.internal.C1613w;
import com.google.android.gms.common.util.C1662p;

/* renamed from: com.google.firebase.e */
public final class C3176e {

    /* renamed from: a */
    private final String f6138a;

    /* renamed from: b */
    private final String f6139b;

    /* renamed from: c */
    private final String f6140c;

    /* renamed from: d */
    private final String f6141d;

    /* renamed from: e */
    private final String f6142e;

    /* renamed from: f */
    private final String f6143f;

    /* renamed from: g */
    private final String f6144g;

    private C3176e(@NonNull String str, @NonNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        C1609u.m4479o(!C1662p.m4614a(str), "ApplicationId must be set.");
        this.f6139b = str;
        this.f6138a = str2;
        this.f6140c = str3;
        this.f6141d = str4;
        this.f6142e = str5;
        this.f6143f = str6;
        this.f6144g = str7;
    }

    @Nullable
    /* renamed from: a */
    public static C3176e m9911a(@NonNull Context context) {
        C1613w wVar = new C1613w(context);
        String a = wVar.mo11290a("google_app_id");
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        return new C3176e(a, wVar.mo11290a("google_api_key"), wVar.mo11290a("firebase_database_url"), wVar.mo11290a("ga_trackingId"), wVar.mo11290a("gcm_defaultSenderId"), wVar.mo11290a("google_storage_bucket"), wVar.mo11290a("project_id"));
    }

    @NonNull
    /* renamed from: b */
    public String mo17741b() {
        return this.f6138a;
    }

    @NonNull
    /* renamed from: c */
    public String mo17742c() {
        return this.f6139b;
    }

    @Nullable
    /* renamed from: d */
    public String mo17743d() {
        return this.f6142e;
    }

    @Nullable
    /* renamed from: e */
    public String mo17744e() {
        return this.f6144g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3176e)) {
            return false;
        }
        C3176e eVar = (C3176e) obj;
        return C1599s.m4388a(this.f6139b, eVar.f6139b) && C1599s.m4388a(this.f6138a, eVar.f6138a) && C1599s.m4388a(this.f6140c, eVar.f6140c) && C1599s.m4388a(this.f6141d, eVar.f6141d) && C1599s.m4388a(this.f6142e, eVar.f6142e) && C1599s.m4388a(this.f6143f, eVar.f6143f) && C1599s.m4388a(this.f6144g, eVar.f6144g);
    }

    public int hashCode() {
        return C1599s.m4389b(this.f6139b, this.f6138a, this.f6140c, this.f6141d, this.f6142e, this.f6143f, this.f6144g);
    }

    public String toString() {
        C1599s.C1600a c = C1599s.m4390c(this);
        c.mo11272a("applicationId", this.f6139b);
        c.mo11272a("apiKey", this.f6138a);
        c.mo11272a("databaseUrl", this.f6140c);
        c.mo11272a("gcmSenderId", this.f6142e);
        c.mo11272a("storageBucket", this.f6143f);
        c.mo11272a("projectId", this.f6144g);
        return c.toString();
    }
}
