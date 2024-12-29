package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.auth.api.signin.internal.C0718a;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.C0722a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p097t.C3692a;
import p113x.C3897a;

@SafeParcelable.Class(creator = "GoogleSignInOptionsCreator")
public class GoogleSignInOptions extends AbstractSafeParcelable implements C0722a.C0726d, ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR = new C0717c();
    @NonNull
    public static final GoogleSignInOptions DEFAULT_GAMES_SIGN_IN;
    @NonNull
    public static final GoogleSignInOptions DEFAULT_SIGN_IN;
    @NonNull
    @VisibleForTesting
    public static final Scope zaa = new Scope("profile");
    @NonNull
    @VisibleForTesting
    public static final Scope zab = new Scope(NotificationCompat.CATEGORY_EMAIL);
    @NonNull
    @VisibleForTesting
    public static final Scope zac = new Scope("openid");
    @NonNull
    @VisibleForTesting
    public static final Scope zad;
    @NonNull
    @VisibleForTesting
    public static final Scope zae = new Scope("https://www.googleapis.com/auth/games");
    @SafeParcelable.VersionField(mo12321id = 1)

    /* renamed from: a */
    final int f468a;
    @SafeParcelable.Field(getter = "getScopes", mo12312id = 2)

    /* renamed from: b */
    private final ArrayList f469b;
    @SafeParcelable.Field(getter = "getAccount", mo12312id = 3)
    @Nullable

    /* renamed from: c */
    private Account f470c;
    @SafeParcelable.Field(getter = "isIdTokenRequested", mo12312id = 4)

    /* renamed from: d */
    private boolean f471d;
    @SafeParcelable.Field(getter = "isServerAuthCodeRequested", mo12312id = 5)

    /* renamed from: e */
    private final boolean f472e;
    @SafeParcelable.Field(getter = "isForceCodeForRefreshToken", mo12312id = 6)

    /* renamed from: f */
    private final boolean f473f;
    @SafeParcelable.Field(getter = "getServerClientId", mo12312id = 7)
    @Nullable

    /* renamed from: g */
    private String f474g;
    @SafeParcelable.Field(getter = "getHostedDomain", mo12312id = 8)
    @Nullable

    /* renamed from: h */
    private String f475h;
    @SafeParcelable.Field(getter = "getExtensions", mo12312id = 9)

    /* renamed from: i */
    private ArrayList f476i;
    @SafeParcelable.Field(getter = "getLogSessionId", mo12312id = 10)
    @Nullable

    /* renamed from: j */
    private String f477j;

    /* renamed from: k */
    private Map f478k;

    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInOptions$a */
    public static final class C0714a {

        /* renamed from: a */
        private Set f479a = new HashSet();

        /* renamed from: b */
        private boolean f480b;

        /* renamed from: c */
        private boolean f481c;

        /* renamed from: d */
        private boolean f482d;
        @Nullable

        /* renamed from: e */
        private String f483e;
        @Nullable

        /* renamed from: f */
        private Account f484f;
        @Nullable

        /* renamed from: g */
        private String f485g;

        /* renamed from: h */
        private Map f486h = new HashMap();
        @Nullable

        /* renamed from: i */
        private String f487i;

        @NonNull
        /* renamed from: a */
        public GoogleSignInOptions mo11733a() {
            if (this.f479a.contains(GoogleSignInOptions.zae)) {
                Set set = this.f479a;
                Scope scope = GoogleSignInOptions.zad;
                if (set.contains(scope)) {
                    this.f479a.remove(scope);
                }
            }
            if (this.f482d && (this.f484f == null || !this.f479a.isEmpty())) {
                mo11734b();
            }
            return new GoogleSignInOptions(3, new ArrayList(this.f479a), this.f484f, this.f482d, this.f480b, this.f481c, this.f483e, this.f485g, this.f486h, this.f487i, (C3692a) null);
        }

        @NonNull
        @CanIgnoreReturnValue
        /* renamed from: b */
        public C0714a mo11734b() {
            this.f479a.add(GoogleSignInOptions.zac);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        /* renamed from: c */
        public C0714a mo11735c() {
            this.f479a.add(GoogleSignInOptions.zaa);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        /* renamed from: d */
        public C0714a mo11736d(@NonNull Scope scope, @NonNull Scope... scopeArr) {
            this.f479a.add(scope);
            this.f479a.addAll(Arrays.asList(scopeArr));
            return this;
        }
    }

    static {
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        zad = scope;
        C0714a aVar = new C0714a();
        aVar.mo11734b();
        aVar.mo11735c();
        DEFAULT_SIGN_IN = aVar.mo11733a();
        C0714a aVar2 = new C0714a();
        aVar2.mo11736d(scope, new Scope[0]);
        DEFAULT_GAMES_SIGN_IN = aVar2.mo11733a();
        new C0716b();
    }

    @SafeParcelable.Constructor
    GoogleSignInOptions(@SafeParcelable.Param(mo12315id = 1) int i, @SafeParcelable.Param(mo12315id = 2) ArrayList arrayList, @SafeParcelable.Param(mo12315id = 3) @Nullable Account account, @SafeParcelable.Param(mo12315id = 4) boolean z, @SafeParcelable.Param(mo12315id = 5) boolean z2, @SafeParcelable.Param(mo12315id = 6) boolean z3, @SafeParcelable.Param(mo12315id = 7) @Nullable String str, @SafeParcelable.Param(mo12315id = 8) @Nullable String str2, @SafeParcelable.Param(mo12315id = 9) ArrayList arrayList2, @SafeParcelable.Param(mo12315id = 10) @Nullable String str3) {
        this(i, arrayList, account, z, z2, z3, str, str2, m589k0(arrayList2), str3);
    }

    private GoogleSignInOptions(int i, ArrayList arrayList, @Nullable Account account, boolean z, boolean z2, boolean z3, @Nullable String str, @Nullable String str2, Map map, @Nullable String str3) {
        this.f468a = i;
        this.f469b = arrayList;
        this.f470c = account;
        this.f471d = z;
        this.f472e = z2;
        this.f473f = z3;
        this.f474g = str;
        this.f475h = str2;
        this.f476i = new ArrayList(map.values());
        this.f478k = map;
        this.f477j = str3;
    }

    /* synthetic */ GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, String str3, C3692a aVar) {
        this(3, arrayList, account, z, z2, z3, str, str2, map, str3);
    }

    /* renamed from: k0 */
    private static Map m589k0(@Nullable List list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable = (GoogleSignInOptionsExtensionParcelable) it.next();
            hashMap.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.getType()), googleSignInOptionsExtensionParcelable);
        }
        return hashMap;
    }

    @KeepForSdk
    @Nullable
    /* renamed from: I */
    public Account mo11722I() {
        return this.f470c;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: V */
    public ArrayList<GoogleSignInOptionsExtensionParcelable> mo11723V() {
        return this.f476i;
    }

    @KeepForSdk
    @Nullable
    /* renamed from: W */
    public String mo11724W() {
        return this.f477j;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: c0 */
    public ArrayList<Scope> mo11725c0() {
        return new ArrayList<>(this.f469b);
    }

    @KeepForSdk
    @Nullable
    /* renamed from: d0 */
    public String mo11726d0() {
        return this.f474g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        if (r1.equals(r4.mo11722I()) != false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@androidx.annotation.Nullable java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch:{ ClassCastException -> 0x0090 }
            java.util.ArrayList r1 = r3.f476i     // Catch:{ ClassCastException -> 0x0090 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 > 0) goto L_0x0090
            java.util.ArrayList r1 = r4.f476i     // Catch:{ ClassCastException -> 0x0090 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 <= 0) goto L_0x0018
            goto L_0x0090
        L_0x0018:
            java.util.ArrayList r1 = r3.f469b     // Catch:{ ClassCastException -> 0x0090 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0090 }
            java.util.ArrayList r2 = r4.mo11725c0()     // Catch:{ ClassCastException -> 0x0090 }
            int r2 = r2.size()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            java.util.ArrayList r1 = r3.f469b     // Catch:{ ClassCastException -> 0x0090 }
            java.util.ArrayList r2 = r4.mo11725c0()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.containsAll(r2)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0035
            goto L_0x0090
        L_0x0035:
            android.accounts.Account r1 = r3.f470c     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0040
            android.accounts.Account r1 = r4.mo11722I()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0090
            goto L_0x004a
        L_0x0040:
            android.accounts.Account r2 = r4.mo11722I()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x0090
        L_0x004a:
            java.lang.String r1 = r3.f474g     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x005d
            java.lang.String r1 = r4.mo11726d0()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x0090
            goto L_0x006a
        L_0x005d:
            java.lang.String r1 = r3.f474g     // Catch:{ ClassCastException -> 0x0090 }
            java.lang.String r2 = r4.mo11726d0()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x006a
            goto L_0x0090
        L_0x006a:
            boolean r1 = r3.f473f     // Catch:{ ClassCastException -> 0x0090 }
            boolean r2 = r4.mo11728f0()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            boolean r1 = r3.f471d     // Catch:{ ClassCastException -> 0x0090 }
            boolean r2 = r4.mo11729g0()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            boolean r1 = r3.f472e     // Catch:{ ClassCastException -> 0x0090 }
            boolean r2 = r4.mo11730h0()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            java.lang.String r1 = r3.f477j     // Catch:{ ClassCastException -> 0x0090 }
            java.lang.String r4 = r4.mo11724W()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch:{ ClassCastException -> 0x0090 }
            if (r4 == 0) goto L_0x0090
            r4 = 1
            return r4
        L_0x0090:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    @KeepForSdk
    /* renamed from: f0 */
    public boolean mo11728f0() {
        return this.f473f;
    }

    @KeepForSdk
    /* renamed from: g0 */
    public boolean mo11729g0() {
        return this.f471d;
    }

    @KeepForSdk
    /* renamed from: h0 */
    public boolean mo11730h0() {
        return this.f472e;
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f469b;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((Scope) arrayList2.get(i)).mo11800V());
        }
        Collections.sort(arrayList);
        C0718a aVar = new C0718a();
        aVar.mo11744a(arrayList);
        aVar.mo11744a(this.f470c);
        aVar.mo11744a(this.f474g);
        aVar.mo11746c(this.f473f);
        aVar.mo11746c(this.f471d);
        aVar.mo11746c(this.f472e);
        aVar.mo11744a(this.f477j);
        return aVar.mo11745b();
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 1, this.f468a);
        C3897a.m11126v(parcel, 2, mo11725c0(), false);
        C3897a.m11121q(parcel, 3, mo11722I(), i, false);
        C3897a.m11107c(parcel, 4, mo11729g0());
        C3897a.m11107c(parcel, 5, mo11730h0());
        C3897a.m11107c(parcel, 6, mo11728f0());
        C3897a.m11122r(parcel, 7, mo11726d0(), false);
        C3897a.m11122r(parcel, 8, this.f475h, false);
        C3897a.m11126v(parcel, 9, mo11723V(), false);
        C3897a.m11122r(parcel, 10, mo11724W(), false);
        C3897a.m11106b(parcel, a);
    }
}
