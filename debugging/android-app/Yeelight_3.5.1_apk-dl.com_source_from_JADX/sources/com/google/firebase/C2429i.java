package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0914h;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.util.C0962c;
import p109w.C3840g;

/* renamed from: com.google.firebase.i */
public final class C2429i {

    /* renamed from: a */
    private final String f4082a;

    /* renamed from: b */
    private final String f4083b;

    /* renamed from: c */
    private final String f4084c;

    /* renamed from: d */
    private final String f4085d;

    /* renamed from: e */
    private final String f4086e;

    /* renamed from: f */
    private final String f4087f;

    /* renamed from: g */
    private final String f4088g;

    private C2429i(@NonNull String str, @NonNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        C0917i.m1424o(!C0962c.m1590a(str), "ApplicationId must be set.");
        this.f4083b = str;
        this.f4082a = str2;
        this.f4084c = str3;
        this.f4085d = str4;
        this.f4086e = str5;
        this.f4087f = str6;
        this.f4088g = str7;
    }

    @Nullable
    /* renamed from: a */
    public static C2429i m6489a(@NonNull Context context) {
        C3840g gVar = new C3840g(context);
        String a = gVar.mo26317a("google_app_id");
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        return new C2429i(a, gVar.mo26317a("google_api_key"), gVar.mo26317a("firebase_database_url"), gVar.mo26317a("ga_trackingId"), gVar.mo26317a("gcm_defaultSenderId"), gVar.mo26317a("google_storage_bucket"), gVar.mo26317a("project_id"));
    }

    @NonNull
    /* renamed from: b */
    public String mo19044b() {
        return this.f4082a;
    }

    @NonNull
    /* renamed from: c */
    public String mo19045c() {
        return this.f4083b;
    }

    @Nullable
    /* renamed from: d */
    public String mo19046d() {
        return this.f4086e;
    }

    @Nullable
    /* renamed from: e */
    public String mo19047e() {
        return this.f4088g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2429i)) {
            return false;
        }
        C2429i iVar = (C2429i) obj;
        return C0914h.m1402a(this.f4083b, iVar.f4083b) && C0914h.m1402a(this.f4082a, iVar.f4082a) && C0914h.m1402a(this.f4084c, iVar.f4084c) && C0914h.m1402a(this.f4085d, iVar.f4085d) && C0914h.m1402a(this.f4086e, iVar.f4086e) && C0914h.m1402a(this.f4087f, iVar.f4087f) && C0914h.m1402a(this.f4088g, iVar.f4088g);
    }

    public int hashCode() {
        return C0914h.m1403b(this.f4083b, this.f4082a, this.f4084c, this.f4085d, this.f4086e, this.f4087f, this.f4088g);
    }

    public String toString() {
        return C0914h.m1404c(this).mo12279a("applicationId", this.f4083b).mo12279a("apiKey", this.f4082a).mo12279a("databaseUrl", this.f4084c).mo12279a("gcmSenderId", this.f4086e).mo12279a("storageBucket", this.f4087f).mo12279a("projectId", this.f4088g).toString();
    }
}
