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
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.C1651e;
import com.google.android.gms.common.util.C1654h;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "GoogleSignInAccountCreator")
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C1375a();
    @VisibleForTesting

    /* renamed from: n */
    private static C1651e f2494n = C1654h.m4587d();
    @SafeParcelable.VersionField(mo11286id = 1)

    /* renamed from: a */
    private final int f2495a;
    @SafeParcelable.Field(getter = "getId", mo11280id = 2)

    /* renamed from: b */
    private String f2496b;
    @SafeParcelable.Field(getter = "getIdToken", mo11280id = 3)

    /* renamed from: c */
    private String f2497c;
    @SafeParcelable.Field(getter = "getEmail", mo11280id = 4)

    /* renamed from: d */
    private String f2498d;
    @SafeParcelable.Field(getter = "getDisplayName", mo11280id = 5)

    /* renamed from: e */
    private String f2499e;
    @SafeParcelable.Field(getter = "getPhotoUrl", mo11280id = 6)

    /* renamed from: f */
    private Uri f2500f;
    @SafeParcelable.Field(getter = "getServerAuthCode", mo11280id = 7)

    /* renamed from: g */
    private String f2501g;
    @SafeParcelable.Field(getter = "getExpirationTimeSecs", mo11280id = 8)

    /* renamed from: h */
    private long f2502h;
    @SafeParcelable.Field(getter = "getObfuscatedIdentifier", mo11280id = 9)

    /* renamed from: i */
    private String f2503i;
    @SafeParcelable.Field(mo11280id = 10)

    /* renamed from: j */
    private List<Scope> f2504j;
    @SafeParcelable.Field(getter = "getGivenName", mo11280id = 11)

    /* renamed from: k */
    private String f2505k;
    @SafeParcelable.Field(getter = "getFamilyName", mo11280id = 12)

    /* renamed from: l */
    private String f2506l;

    /* renamed from: m */
    private Set<Scope> f2507m = new HashSet();

    @SafeParcelable.Constructor
    GoogleSignInAccount(@SafeParcelable.Param(mo11283id = 1) int i, @SafeParcelable.Param(mo11283id = 2) String str, @SafeParcelable.Param(mo11283id = 3) String str2, @SafeParcelable.Param(mo11283id = 4) String str3, @SafeParcelable.Param(mo11283id = 5) String str4, @SafeParcelable.Param(mo11283id = 6) Uri uri, @SafeParcelable.Param(mo11283id = 7) String str5, @SafeParcelable.Param(mo11283id = 8) long j, @SafeParcelable.Param(mo11283id = 9) String str6, @SafeParcelable.Param(mo11283id = 10) List<Scope> list, @SafeParcelable.Param(mo11283id = 11) String str7, @SafeParcelable.Param(mo11283id = 12) String str8) {
        this.f2495a = i;
        this.f2496b = str;
        this.f2497c = str2;
        this.f2498d = str3;
        this.f2499e = str4;
        this.f2500f = uri;
        this.f2501g = str5;
        this.f2502h = j;
        this.f2503i = str6;
        this.f2504j = list;
        this.f2505k = str7;
        this.f2506l = str8;
    }

    @Nullable
    /* renamed from: a0 */
    public static GoogleSignInAccount m3568a0(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl", (String) null);
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount c0 = m3569c0(jSONObject.optString("id"), jSONObject.optString("tokenId", (String) null), jSONObject.optString(NotificationCompat.CATEGORY_EMAIL, (String) null), jSONObject.optString("displayName", (String) null), jSONObject.optString("givenName", (String) null), jSONObject.optString("familyName", (String) null), parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        c0.f2501g = jSONObject.optString("serverAuthCode", (String) null);
        return c0;
    }

    /* renamed from: c0 */
    private static GoogleSignInAccount m3569c0(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Uri uri, @Nullable Long l, @NonNull String str7, @NonNull Set<Scope> set) {
        long longValue = (l == null ? Long.valueOf(f2494n.mo11378a() / 1000) : l).longValue();
        C1609u.m4471g(str7);
        C1609u.m4475k(set);
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, (String) null, longValue, str7, new ArrayList(set), str5, str6);
    }

    @Nullable
    /* renamed from: Q */
    public String mo10706Q() {
        return this.f2499e;
    }

    @Nullable
    /* renamed from: R */
    public String mo10707R() {
        return this.f2498d;
    }

    @Nullable
    /* renamed from: S */
    public String mo10708S() {
        return this.f2506l;
    }

    @Nullable
    /* renamed from: T */
    public String mo10709T() {
        return this.f2505k;
    }

    @Nullable
    /* renamed from: V */
    public String mo10710V() {
        return this.f2497c;
    }

    @Nullable
    /* renamed from: W */
    public Uri mo10711W() {
        return this.f2500f;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: X */
    public Set<Scope> mo10712X() {
        HashSet hashSet = new HashSet(this.f2504j);
        hashSet.addAll(this.f2507m);
        return hashSet;
    }

    @Nullable
    /* renamed from: Z */
    public String mo10713Z() {
        return this.f2501g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f2503i.equals(this.f2503i) && googleSignInAccount.mo10712X().equals(mo10712X());
    }

    @Nullable
    public String getId() {
        return this.f2496b;
    }

    public int hashCode() {
        return ((this.f2503i.hashCode() + 527) * 31) + mo10712X().hashCode();
    }

    @Nullable
    /* renamed from: j */
    public Account mo10717j() {
        if (this.f2498d == null) {
            return null;
        }
        return new Account(this.f2498d, "com.google");
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 1, this.f2495a);
        C1604b.m4452r(parcel, 2, getId(), false);
        C1604b.m4452r(parcel, 3, mo10710V(), false);
        C1604b.m4452r(parcel, 4, mo10707R(), false);
        C1604b.m4452r(parcel, 5, mo10706Q(), false);
        C1604b.m4451q(parcel, 6, mo10711W(), i, false);
        C1604b.m4452r(parcel, 7, mo10713Z(), false);
        C1604b.m4448n(parcel, 8, this.f2502h);
        C1604b.m4452r(parcel, 9, this.f2503i, false);
        C1604b.m4456v(parcel, 10, this.f2504j, false);
        C1604b.m4452r(parcel, 11, mo10709T(), false);
        C1604b.m4452r(parcel, 12, mo10708S(), false);
        C1604b.m4436b(parcel, a);
    }
}
