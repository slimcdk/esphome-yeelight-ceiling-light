package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import p014c0.C0619h;
import p113x.C3897a;

@SafeParcelable.Class(creator = "GoogleSignInAccountCreator")
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C0715a();
    @SafeParcelable.VersionField(mo12321id = 1)

    /* renamed from: a */
    final int f455a;
    @SafeParcelable.Field(getter = "getId", mo12312id = 2)
    @Nullable

    /* renamed from: b */
    private String f456b;
    @SafeParcelable.Field(getter = "getIdToken", mo12312id = 3)
    @Nullable

    /* renamed from: c */
    private String f457c;
    @SafeParcelable.Field(getter = "getEmail", mo12312id = 4)
    @Nullable

    /* renamed from: d */
    private String f458d;
    @SafeParcelable.Field(getter = "getDisplayName", mo12312id = 5)
    @Nullable

    /* renamed from: e */
    private String f459e;
    @SafeParcelable.Field(getter = "getPhotoUrl", mo12312id = 6)
    @Nullable

    /* renamed from: f */
    private Uri f460f;
    @SafeParcelable.Field(getter = "getServerAuthCode", mo12312id = 7)
    @Nullable

    /* renamed from: g */
    private String f461g;
    @SafeParcelable.Field(getter = "getExpirationTimeSecs", mo12312id = 8)

    /* renamed from: h */
    private long f462h;
    @SafeParcelable.Field(getter = "getObfuscatedIdentifier", mo12312id = 9)

    /* renamed from: i */
    private String f463i;
    @SafeParcelable.Field(mo12312id = 10)

    /* renamed from: j */
    List f464j;
    @SafeParcelable.Field(getter = "getGivenName", mo12312id = 11)
    @Nullable

    /* renamed from: k */
    private String f465k;
    @SafeParcelable.Field(getter = "getFamilyName", mo12312id = 12)
    @Nullable

    /* renamed from: l */
    private String f466l;

    /* renamed from: m */
    private Set f467m = new HashSet();

    static {
        C0619h.m208d();
    }

    @SafeParcelable.Constructor
    GoogleSignInAccount(@SafeParcelable.Param(mo12315id = 1) int i, @SafeParcelable.Param(mo12315id = 2) @Nullable String str, @SafeParcelable.Param(mo12315id = 3) @Nullable String str2, @SafeParcelable.Param(mo12315id = 4) @Nullable String str3, @SafeParcelable.Param(mo12315id = 5) @Nullable String str4, @SafeParcelable.Param(mo12315id = 6) @Nullable Uri uri, @SafeParcelable.Param(mo12315id = 7) @Nullable String str5, @SafeParcelable.Param(mo12315id = 8) long j, @SafeParcelable.Param(mo12315id = 9) String str6, @SafeParcelable.Param(mo12315id = 10) List list, @SafeParcelable.Param(mo12315id = 11) @Nullable String str7, @SafeParcelable.Param(mo12315id = 12) @Nullable String str8) {
        this.f455a = i;
        this.f456b = str;
        this.f457c = str2;
        this.f458d = str3;
        this.f459e = str4;
        this.f460f = uri;
        this.f461g = str5;
        this.f462h = j;
        this.f463i = str6;
        this.f464j = list;
        this.f465k = str7;
        this.f466l = str8;
    }

    @NonNull
    /* renamed from: o0 */
    public static GoogleSignInAccount m578o0(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Uri uri, @Nullable Long l, @NonNull String str7, @NonNull Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, (String) null, l.longValue(), C0917i.m1415f(str7), new ArrayList((Collection) C0917i.m1419j(set)), str5, str6);
    }

    @Nullable
    /* renamed from: p0 */
    public static GoogleSignInAccount m579p0(@Nullable String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount o0 = m578o0(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has(NotificationCompat.CATEGORY_EMAIL) ? jSONObject.optString(NotificationCompat.CATEGORY_EMAIL) : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        if (jSONObject.has("serverAuthCode")) {
            str2 = jSONObject.optString("serverAuthCode");
        }
        o0.f461g = str2;
        return o0;
    }

    @Nullable
    /* renamed from: I */
    public Account mo11709I() {
        String str = this.f458d;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    @Nullable
    /* renamed from: V */
    public String mo11710V() {
        return this.f459e;
    }

    @Nullable
    /* renamed from: W */
    public String mo11711W() {
        return this.f458d;
    }

    @Nullable
    /* renamed from: c0 */
    public String mo11712c0() {
        return this.f466l;
    }

    @Nullable
    /* renamed from: d0 */
    public String mo11713d0() {
        return this.f465k;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f463i.equals(this.f463i) && googleSignInAccount.mo11718h0().equals(mo11718h0());
    }

    @Nullable
    /* renamed from: f0 */
    public String mo11715f0() {
        return this.f457c;
    }

    @Nullable
    /* renamed from: g0 */
    public Uri mo11716g0() {
        return this.f460f;
    }

    @Nullable
    public String getId() {
        return this.f456b;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: h0 */
    public Set<Scope> mo11718h0() {
        HashSet hashSet = new HashSet(this.f464j);
        hashSet.addAll(this.f467m);
        return hashSet;
    }

    public int hashCode() {
        return ((this.f463i.hashCode() + 527) * 31) + mo11718h0().hashCode();
    }

    @Nullable
    /* renamed from: k0 */
    public String mo11720k0() {
        return this.f461g;
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 1, this.f455a);
        C3897a.m11122r(parcel, 2, getId(), false);
        C3897a.m11122r(parcel, 3, mo11715f0(), false);
        C3897a.m11122r(parcel, 4, mo11711W(), false);
        C3897a.m11122r(parcel, 5, mo11710V(), false);
        C3897a.m11121q(parcel, 6, mo11716g0(), i, false);
        C3897a.m11122r(parcel, 7, mo11720k0(), false);
        C3897a.m11118n(parcel, 8, this.f462h);
        C3897a.m11122r(parcel, 9, this.f463i, false);
        C3897a.m11126v(parcel, 10, this.f464j, false);
        C3897a.m11122r(parcel, 11, mo11713d0(), false);
        C3897a.m11122r(parcel, 12, mo11712c0(), false);
        C3897a.m11106b(parcel, a);
    }
}
