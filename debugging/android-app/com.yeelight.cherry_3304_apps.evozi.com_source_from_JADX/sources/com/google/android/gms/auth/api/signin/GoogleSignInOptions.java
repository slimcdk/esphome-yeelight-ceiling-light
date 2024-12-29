package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.auth.api.signin.internal.C1378a;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.C1382a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SafeParcelable.Class(creator = "GoogleSignInOptionsCreator")
public class GoogleSignInOptions extends AbstractSafeParcelable implements C1382a.C1386d, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR = new C1377c();
    public static final GoogleSignInOptions DEFAULT_GAMES_SIGN_IN;
    public static final GoogleSignInOptions DEFAULT_SIGN_IN;
    @VisibleForTesting
    public static final Scope zar = new Scope("profile");
    @VisibleForTesting
    public static final Scope zas = new Scope(NotificationCompat.CATEGORY_EMAIL);
    @VisibleForTesting
    public static final Scope zat = new Scope("openid");
    @VisibleForTesting
    public static final Scope zau = new Scope("https://www.googleapis.com/auth/games_lite");
    @VisibleForTesting
    public static final Scope zav = new Scope("https://www.googleapis.com/auth/games");
    @SafeParcelable.VersionField(mo11286id = 1)

    /* renamed from: a */
    private final int f2508a;
    @SafeParcelable.Field(getter = "getScopes", mo11280id = 2)

    /* renamed from: b */
    private final ArrayList<Scope> f2509b;
    @SafeParcelable.Field(getter = "getAccount", mo11280id = 3)

    /* renamed from: c */
    private Account f2510c;
    @SafeParcelable.Field(getter = "isIdTokenRequested", mo11280id = 4)

    /* renamed from: d */
    private boolean f2511d;
    @SafeParcelable.Field(getter = "isServerAuthCodeRequested", mo11280id = 5)

    /* renamed from: e */
    private final boolean f2512e;
    @SafeParcelable.Field(getter = "isForceCodeForRefreshToken", mo11280id = 6)

    /* renamed from: f */
    private final boolean f2513f;
    @SafeParcelable.Field(getter = "getServerClientId", mo11280id = 7)

    /* renamed from: g */
    private String f2514g;
    @SafeParcelable.Field(getter = "getHostedDomain", mo11280id = 8)

    /* renamed from: h */
    private String f2515h;
    @SafeParcelable.Field(getter = "getExtensions", mo11280id = 9)

    /* renamed from: i */
    private ArrayList<GoogleSignInOptionsExtensionParcelable> f2516i;

    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInOptions$a */
    public static final class C1374a {

        /* renamed from: a */
        private Set<Scope> f2517a = new HashSet();

        /* renamed from: b */
        private boolean f2518b;

        /* renamed from: c */
        private boolean f2519c;

        /* renamed from: d */
        private boolean f2520d;

        /* renamed from: e */
        private String f2521e;

        /* renamed from: f */
        private Account f2522f;

        /* renamed from: g */
        private String f2523g;

        /* renamed from: h */
        private Map<Integer, GoogleSignInOptionsExtensionParcelable> f2524h = new HashMap();

        /* renamed from: a */
        public final GoogleSignInOptions mo10729a() {
            if (this.f2517a.contains(GoogleSignInOptions.zav) && this.f2517a.contains(GoogleSignInOptions.zau)) {
                this.f2517a.remove(GoogleSignInOptions.zau);
            }
            if (this.f2520d && (this.f2522f == null || !this.f2517a.isEmpty())) {
                mo10730b();
            }
            return new GoogleSignInOptions(3, new ArrayList(this.f2517a), this.f2522f, this.f2520d, this.f2518b, this.f2519c, this.f2521e, this.f2523g, this.f2524h, (C1376b) null);
        }

        /* renamed from: b */
        public final C1374a mo10730b() {
            this.f2517a.add(GoogleSignInOptions.zat);
            return this;
        }

        /* renamed from: c */
        public final C1374a mo10731c() {
            this.f2517a.add(GoogleSignInOptions.zar);
            return this;
        }

        /* renamed from: d */
        public final C1374a mo10732d(Scope scope, Scope... scopeArr) {
            this.f2517a.add(scope);
            this.f2517a.addAll(Arrays.asList(scopeArr));
            return this;
        }
    }

    static {
        C1374a b = new C1374a().mo10730b();
        b.mo10731c();
        DEFAULT_SIGN_IN = b.mo10729a();
        C1374a aVar = new C1374a();
        aVar.mo10732d(zau, new Scope[0]);
        DEFAULT_GAMES_SIGN_IN = aVar.mo10729a();
    }

    @SafeParcelable.Constructor
    GoogleSignInOptions(@SafeParcelable.Param(mo11283id = 1) int i, @SafeParcelable.Param(mo11283id = 2) ArrayList<Scope> arrayList, @SafeParcelable.Param(mo11283id = 3) Account account, @SafeParcelable.Param(mo11283id = 4) boolean z, @SafeParcelable.Param(mo11283id = 5) boolean z2, @SafeParcelable.Param(mo11283id = 6) boolean z3, @SafeParcelable.Param(mo11283id = 7) String str, @SafeParcelable.Param(mo11283id = 8) String str2, @SafeParcelable.Param(mo11283id = 9) ArrayList<GoogleSignInOptionsExtensionParcelable> arrayList2) {
        this(i, arrayList, account, z, z2, z3, str, str2, m3579X(arrayList2));
    }

    private GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map<Integer, GoogleSignInOptionsExtensionParcelable> map) {
        this.f2508a = i;
        this.f2509b = arrayList;
        this.f2510c = account;
        this.f2511d = z;
        this.f2512e = z2;
        this.f2513f = z3;
        this.f2514g = str;
        this.f2515h = str2;
        this.f2516i = new ArrayList<>(map.values());
    }

    /* synthetic */ GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, C1376b bVar) {
        this(3, (ArrayList<Scope>) arrayList, account, z, z2, z3, str, str2, (Map<Integer, GoogleSignInOptionsExtensionParcelable>) map);
    }

    /* renamed from: X */
    private static Map<Integer, GoogleSignInOptionsExtensionParcelable> m3579X(@Nullable List<GoogleSignInOptionsExtensionParcelable> list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        for (GoogleSignInOptionsExtensionParcelable next : list) {
            hashMap.put(Integer.valueOf(next.getType()), next);
        }
        return hashMap;
    }

    @KeepForSdk
    /* renamed from: Q */
    public ArrayList<GoogleSignInOptionsExtensionParcelable> mo10719Q() {
        return this.f2516i;
    }

    @KeepForSdk
    /* renamed from: R */
    public ArrayList<Scope> mo10720R() {
        return new ArrayList<>(this.f2509b);
    }

    @KeepForSdk
    /* renamed from: S */
    public String mo10721S() {
        return this.f2514g;
    }

    @KeepForSdk
    /* renamed from: T */
    public boolean mo10722T() {
        return this.f2513f;
    }

    @KeepForSdk
    /* renamed from: V */
    public boolean mo10723V() {
        return this.f2511d;
    }

    @KeepForSdk
    /* renamed from: W */
    public boolean mo10724W() {
        return this.f2512e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
        if (r3.f2510c.equals(r4.mo10727j()) != false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0069, code lost:
        if (r3.f2514g.equals(r4.mo10721S()) != false) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch:{ ClassCastException -> 0x0085 }
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r3.f2516i     // Catch:{ ClassCastException -> 0x0085 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 > 0) goto L_0x0085
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r4.f2516i     // Catch:{ ClassCastException -> 0x0085 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 <= 0) goto L_0x0018
            goto L_0x0085
        L_0x0018:
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f2509b     // Catch:{ ClassCastException -> 0x0085 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0085 }
            java.util.ArrayList r2 = r4.mo10720R()     // Catch:{ ClassCastException -> 0x0085 }
            int r2 = r2.size()     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 != r2) goto L_0x0085
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f2509b     // Catch:{ ClassCastException -> 0x0085 }
            java.util.ArrayList r2 = r4.mo10720R()     // Catch:{ ClassCastException -> 0x0085 }
            boolean r1 = r1.containsAll(r2)     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 != 0) goto L_0x0035
            goto L_0x0085
        L_0x0035:
            android.accounts.Account r1 = r3.f2510c     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 != 0) goto L_0x0040
            android.accounts.Account r1 = r4.mo10727j()     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 != 0) goto L_0x0085
            goto L_0x004c
        L_0x0040:
            android.accounts.Account r1 = r3.f2510c     // Catch:{ ClassCastException -> 0x0085 }
            android.accounts.Account r2 = r4.mo10727j()     // Catch:{ ClassCastException -> 0x0085 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 == 0) goto L_0x0085
        L_0x004c:
            java.lang.String r1 = r3.f2514g     // Catch:{ ClassCastException -> 0x0085 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 == 0) goto L_0x005f
            java.lang.String r1 = r4.mo10721S()     // Catch:{ ClassCastException -> 0x0085 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 == 0) goto L_0x0085
            goto L_0x006b
        L_0x005f:
            java.lang.String r1 = r3.f2514g     // Catch:{ ClassCastException -> 0x0085 }
            java.lang.String r2 = r4.mo10721S()     // Catch:{ ClassCastException -> 0x0085 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 == 0) goto L_0x0085
        L_0x006b:
            boolean r1 = r3.f2513f     // Catch:{ ClassCastException -> 0x0085 }
            boolean r2 = r4.mo10722T()     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 != r2) goto L_0x0085
            boolean r1 = r3.f2511d     // Catch:{ ClassCastException -> 0x0085 }
            boolean r2 = r4.mo10723V()     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 != r2) goto L_0x0085
            boolean r1 = r3.f2512e     // Catch:{ ClassCastException -> 0x0085 }
            boolean r4 = r4.mo10724W()     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 != r4) goto L_0x0085
            r4 = 1
            return r4
        L_0x0085:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList<Scope> arrayList2 = this.f2509b;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Scope scope = arrayList2.get(i);
            i++;
            arrayList.add(scope.mo10767Q());
        }
        Collections.sort(arrayList);
        C1378a aVar = new C1378a();
        aVar.mo10739a(arrayList);
        aVar.mo10739a(this.f2510c);
        aVar.mo10739a(this.f2514g);
        aVar.mo10741c(this.f2513f);
        aVar.mo10741c(this.f2511d);
        aVar.mo10741c(this.f2512e);
        return aVar.mo10740b();
    }

    @KeepForSdk
    /* renamed from: j */
    public Account mo10727j() {
        return this.f2510c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 1, this.f2508a);
        C1604b.m4456v(parcel, 2, mo10720R(), false);
        C1604b.m4451q(parcel, 3, mo10727j(), i, false);
        C1604b.m4437c(parcel, 4, mo10723V());
        C1604b.m4437c(parcel, 5, mo10724W());
        C1604b.m4437c(parcel, 6, mo10722T());
        C1604b.m4452r(parcel, 7, mo10721S(), false);
        C1604b.m4452r(parcel, 8, this.f2515h, false);
        C1604b.m4456v(parcel, 9, mo10719Q(), false);
        C1604b.m4436b(parcel, a);
    }
}
