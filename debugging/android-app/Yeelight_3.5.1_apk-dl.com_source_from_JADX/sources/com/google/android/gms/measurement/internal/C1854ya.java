package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.C0877b;
import com.google.android.gms.common.C0879d;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.C1119h1;
import com.miot.service.common.crypto.rc4coder.Coder;
import com.xiaomi.mipush.sdk.Constants;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p014c0.C0617f;
import p028e0.C3144c;
import p223w3.C11627r;

/* renamed from: com.google.android.gms.measurement.internal.ya */
public final class C1854ya extends C1654i6 {

    /* renamed from: g */
    private static final String[] f2804g = {"firebase_", "google_", "ga_"};

    /* renamed from: h */
    private static final String[] f2805h = {"_err"};

    /* renamed from: c */
    private SecureRandom f2806c;

    /* renamed from: d */
    private final AtomicLong f2807d = new AtomicLong(0);

    /* renamed from: e */
    private int f2808e;

    /* renamed from: f */
    private Integer f2809f = null;

    C1854ya(C1717n5 n5Var) {
        super(n5Var);
    }

    /* renamed from: W */
    static boolean m4831W(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* renamed from: X */
    static boolean m4832X(String str) {
        C0917i.m1415f(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        r4 = r1.getReceiverInfo(new android.content.ComponentName(r4, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0);
     */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m4833Y(android.content.Context r4) {
        /*
            com.google.android.gms.common.internal.C0917i.m1419j(r4)
            r0 = 0
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x001e }
            if (r1 != 0) goto L_0x000b
            return r0
        L_0x000b:
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x001e }
            java.lang.String r3 = "com.google.android.gms.measurement.AppMeasurementReceiver"
            r2.<init>(r4, r3)     // Catch:{ NameNotFoundException -> 0x001e }
            android.content.pm.ActivityInfo r4 = r1.getReceiverInfo(r2, r0)     // Catch:{ NameNotFoundException -> 0x001e }
            if (r4 == 0) goto L_0x001e
            boolean r4 = r4.enabled     // Catch:{ NameNotFoundException -> 0x001e }
            if (r4 == 0) goto L_0x001e
            r4 = 1
            return r4
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1854ya.m4833Y(android.content.Context):boolean");
    }

    /* renamed from: Z */
    static boolean m4834Z(Context context, boolean z) {
        C0917i.m1419j(context);
        return m4841i0(context, Build.VERSION.SDK_INT >= 24 ? "com.google.android.gms.measurement.AppMeasurementJobService" : "com.google.android.gms.measurement.AppMeasurementService");
    }

    /* renamed from: a0 */
    public static boolean m4835a0(String str) {
        return !f2805h[0].equals(str);
    }

    /* renamed from: d0 */
    static final boolean m4836d0(Bundle bundle, int i) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i);
        return true;
    }

    @VisibleForTesting
    /* renamed from: e0 */
    static final boolean m4837e0(String str) {
        C0917i.m1419j(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    /* renamed from: f0 */
    private final int m4838f0(String str) {
        if ("_ldl".equals(str)) {
            this.f2143a.mo14402z();
            return 2048;
        } else if ("_id".equals(str)) {
            this.f2143a.mo14402z();
            return 256;
        } else if ("_lgclid".equals(str)) {
            this.f2143a.mo14402z();
            return 100;
        } else {
            this.f2143a.mo14402z();
            return 36;
        }
    }

    /* renamed from: g0 */
    private final Object m4839g0(int i, Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0 : 1);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return mo14678r(obj.toString(), i, z);
            }
            if (!z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if (parcelable instanceof Bundle) {
                    Bundle u0 = mo14684u0((Bundle) parcelable);
                    if (!u0.isEmpty()) {
                        arrayList.add(u0);
                    }
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    /* renamed from: h0 */
    private static boolean m4840h0(String str, String[] strArr) {
        C0917i.m1419j(strArr);
        for (String a : strArr) {
            if (C1830wa.m4815a(str, a)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0008, code lost:
        r3 = r1.getServiceInfo(new android.content.ComponentName(r3, r4), 0);
     */
    /* renamed from: i0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m4841i0(android.content.Context r3, java.lang.String r4) {
        /*
            r0 = 0
            android.content.pm.PackageManager r1 = r3.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0019 }
            if (r1 != 0) goto L_0x0008
            return r0
        L_0x0008:
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0019 }
            r2.<init>(r3, r4)     // Catch:{ NameNotFoundException -> 0x0019 }
            android.content.pm.ServiceInfo r3 = r1.getServiceInfo(r2, r0)     // Catch:{ NameNotFoundException -> 0x0019 }
            if (r3 == 0) goto L_0x0019
            boolean r3 = r3.enabled     // Catch:{ NameNotFoundException -> 0x0019 }
            if (r3 == 0) goto L_0x0019
            r3 = 1
            return r3
        L_0x0019:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1854ya.m4841i0(android.content.Context, java.lang.String):boolean");
    }

    @VisibleForTesting
    /* renamed from: q0 */
    static long m4842q0(byte[] bArr) {
        C0917i.m1419j(bArr);
        int length = bArr.length;
        int i = 0;
        C0917i.m1423n(length > 0);
        int i2 = length - 1;
        long j = 0;
        while (i2 >= 0 && i2 >= bArr.length - 8) {
            j += (((long) bArr[i2]) & 255) << i;
            i += 8;
            i2--;
        }
        return j;
    }

    /* renamed from: t */
    static MessageDigest m4843t() {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(Coder.KEY_MD5);
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    /* renamed from: v */
    public static ArrayList m4844v(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzac zzac = (zzac) it.next();
            Bundle bundle = new Bundle();
            bundle.putString(Constants.APP_ID, zzac.f2843a);
            bundle.putString("origin", zzac.f2844b);
            bundle.putLong("creation_timestamp", zzac.f2846d);
            bundle.putString("name", zzac.f2845c.f2860b);
            C1680k6.m4404b(bundle, C0917i.m1419j(zzac.f2845c.mo14714V()));
            bundle.putBoolean("active", zzac.f2847e);
            String str = zzac.f2848f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            zzaw zzaw = zzac.f2849g;
            if (zzaw != null) {
                bundle.putString("timed_out_event_name", zzaw.f2855a);
                zzau zzau = zzaw.f2856b;
                if (zzau != null) {
                    bundle.putBundle("timed_out_event_params", zzau.mo14704c0());
                }
            }
            bundle.putLong("trigger_timeout", zzac.f2850h);
            zzaw zzaw2 = zzac.f2851i;
            if (zzaw2 != null) {
                bundle.putString("triggered_event_name", zzaw2.f2855a);
                zzau zzau2 = zzaw2.f2856b;
                if (zzau2 != null) {
                    bundle.putBundle("triggered_event_params", zzau2.mo14704c0());
                }
            }
            bundle.putLong("triggered_timestamp", zzac.f2845c.f2861c);
            bundle.putLong("time_to_live", zzac.f2852j);
            zzaw zzaw3 = zzac.f2853k;
            if (zzaw3 != null) {
                bundle.putString("expired_event_name", zzaw3.f2855a);
                zzau zzau3 = zzaw3.f2856b;
                if (zzau3 != null) {
                    bundle.putBundle("expired_event_params", zzau3.mo14704c0());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    @WorkerThread
    /* renamed from: y */
    public static void m4845y(C1552a8 a8Var, Bundle bundle, boolean z) {
        if (!(bundle == null || a8Var == null)) {
            if (!bundle.containsKey("_sc") || z) {
                String str = a8Var.f1923a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = a8Var.f1924b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", a8Var.f1925c);
                return;
            }
            z = false;
        }
        if (bundle != null && a8Var == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final void mo14644A(C1587d4 d4Var, int i) {
        int i2 = 0;
        for (String str : new TreeSet(d4Var.f2003d.keySet())) {
            if (m4832X(str) && (i2 = i2 + 1) > i) {
                this.f2143a.mo14228b().mo14036s().mo14695c("Event can't contain more than " + i + " params", this.f2143a.mo14373D().mo14617d(d4Var.f2000a), this.f2143a.mo14373D().mo14615b(d4Var.f2003d));
                m4836d0(d4Var.f2003d, 5);
                d4Var.f2003d.remove(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final void mo14645B(C1842xa xaVar, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        m4836d0(bundle, i);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", (long) i2);
        }
        xaVar.mo14233a(str, "_err", bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final void mo14646C(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Bundle[]) {
                bundle.putParcelableArray(str, (Bundle[]) obj);
            } else if (str != null) {
                this.f2143a.mo14228b().mo14041x().mo14695c("Not putting event parameter. Invalid value type. name, type", this.f2143a.mo14373D().mo14618e(str), obj != null ? obj.getClass().getSimpleName() : null);
            }
        }
    }

    /* renamed from: D */
    public final void mo14647D(C1119h1 h1Var, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(C11627r.f21359c0, z);
        try {
            h1Var.mo12512a(bundle);
        } catch (RemoteException e) {
            this.f2143a.mo14228b().mo14040w().mo14694b("Error returning boolean value to wrapper", e);
        }
    }

    /* renamed from: E */
    public final void mo14648E(C1119h1 h1Var, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(C11627r.f21359c0, arrayList);
        try {
            h1Var.mo12512a(bundle);
        } catch (RemoteException e) {
            this.f2143a.mo14228b().mo14040w().mo14694b("Error returning bundle list to wrapper", e);
        }
    }

    /* renamed from: F */
    public final void mo14649F(C1119h1 h1Var, Bundle bundle) {
        try {
            h1Var.mo12512a(bundle);
        } catch (RemoteException e) {
            this.f2143a.mo14228b().mo14040w().mo14694b("Error returning bundle value to wrapper", e);
        }
    }

    /* renamed from: G */
    public final void mo14650G(C1119h1 h1Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray(C11627r.f21359c0, bArr);
        try {
            h1Var.mo12512a(bundle);
        } catch (RemoteException e) {
            this.f2143a.mo14228b().mo14040w().mo14694b("Error returning byte array to wrapper", e);
        }
    }

    /* renamed from: H */
    public final void mo14651H(C1119h1 h1Var, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt(C11627r.f21359c0, i);
        try {
            h1Var.mo12512a(bundle);
        } catch (RemoteException e) {
            this.f2143a.mo14228b().mo14040w().mo14694b("Error returning int value to wrapper", e);
        }
    }

    /* renamed from: I */
    public final void mo14652I(C1119h1 h1Var, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong(C11627r.f21359c0, j);
        try {
            h1Var.mo12512a(bundle);
        } catch (RemoteException e) {
            this.f2143a.mo14228b().mo14040w().mo14694b("Error returning long value to wrapper", e);
        }
    }

    /* renamed from: J */
    public final void mo14653J(C1119h1 h1Var, String str) {
        Bundle bundle = new Bundle();
        bundle.putString(C11627r.f21359c0, str);
        try {
            h1Var.mo12512a(bundle);
        } catch (RemoteException e) {
            this.f2143a.mo14228b().mo14040w().mo14694b("Error returning string value to wrapper", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final void mo14654K(String str, String str2, String str3, Bundle bundle, List list, boolean z) {
        int i;
        String str4;
        int i2;
        String str5 = str2;
        Bundle bundle2 = bundle;
        List list2 = list;
        if (bundle2 != null) {
            this.f2143a.mo14402z();
            int i3 = 0;
            for (String str6 : new TreeSet(bundle.keySet())) {
                if (list2 == null || !list2.contains(str6)) {
                    int m0 = !z ? mo14671m0(str6) : 0;
                    if (m0 == 0) {
                        m0 = mo14670l0(str6);
                    }
                    i = m0;
                } else {
                    i = 0;
                }
                if (i != 0) {
                    mo14688x(bundle, i, str6, str6, i == 3 ? str6 : null);
                    bundle2.remove(str6);
                } else {
                    if (mo14664U(bundle2.get(str6))) {
                        this.f2143a.mo14228b().mo14041x().mo14696d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str5, str3, str6);
                        str4 = str6;
                        i2 = 22;
                    } else {
                        String str7 = str3;
                        str4 = str6;
                        i2 = mo14658O(str, str2, str6, bundle2.get(str6), bundle, list, z, false);
                    }
                    if (i2 != 0 && !"_ev".equals(str4)) {
                        mo14688x(bundle, i2, str4, str4, bundle2.get(str4));
                    } else if (m4832X(str4) && !m4840h0(str4, C1706m6.f2306d) && (i3 = i3 + 1) > 0) {
                        this.f2143a.mo14228b().mo14036s().mo14695c("Item cannot contain custom parameters", this.f2143a.mo14373D().mo14617d(str5), this.f2143a.mo14373D().mo14615b(bundle2));
                        m4836d0(bundle2, 23);
                    }
                    bundle2.remove(str4);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final boolean mo14655L(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (m4837e0(str)) {
                return true;
            }
            if (this.f2143a.mo14397q()) {
                this.f2143a.mo14228b().mo14036s().mo14694b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C1574c4.m4083z(str));
            }
            return false;
        } else if (TextUtils.isEmpty(str2)) {
            if (this.f2143a.mo14397q()) {
                this.f2143a.mo14228b().mo14036s().mo14693a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        } else if (m4837e0(str2)) {
            return true;
        } else {
            this.f2143a.mo14228b().mo14036s().mo14694b("Invalid admob_app_id. Analytics disabled.", C1574c4.m4083z(str2));
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final boolean mo14656M(String str, int i, String str2) {
        if (str2 == null) {
            this.f2143a.mo14228b().mo14036s().mo14694b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        } else {
            this.f2143a.mo14228b().mo14036s().mo14696d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final boolean mo14657N(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.f2143a.mo14228b().mo14036s().mo14694b("Name is required and can't be null. Type", str);
            return false;
        }
        C0917i.m1419j(str2);
        String[] strArr3 = f2804g;
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(strArr3[i])) {
                this.f2143a.mo14228b().mo14036s().mo14695c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !m4840h0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && m4840h0(str2, strArr2)) {
            return true;
        }
        this.f2143a.mo14228b().mo14036s().mo14695c("Name is reserved. Type, name", str, str2);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00de A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00df  */
    @androidx.annotation.WorkerThread
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo14658O(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.Object r18, android.os.Bundle r19, java.util.List r20, boolean r21, boolean r22) {
        /*
            r14 = this;
            r7 = r14
            r8 = r17
            r0 = r18
            r1 = r19
            r14.mo14009h()
            boolean r2 = r14.mo14664U(r0)
            java.lang.String r3 = "param"
            r4 = 17
            r5 = 0
            if (r2 == 0) goto L_0x00ad
            if (r22 == 0) goto L_0x00aa
            java.lang.String[] r2 = com.google.android.gms.measurement.internal.C1706m6.f2305c
            boolean r2 = m4840h0(r8, r2)
            if (r2 != 0) goto L_0x0022
            r0 = 20
            return r0
        L_0x0022:
            com.google.android.gms.measurement.internal.n5 r2 = r7.f2143a
            com.google.android.gms.measurement.internal.j9 r2 = r2.mo14380L()
            r2.mo14009h()
            r2.mo14020i()
            boolean r6 = r2.mo14269B()
            if (r6 != 0) goto L_0x0035
            goto L_0x0047
        L_0x0035:
            com.google.android.gms.measurement.internal.n5 r2 = r2.f2143a
            com.google.android.gms.measurement.internal.ya r2 = r2.mo14382N()
            int r2 = r2.mo14674o0()
            r6 = 200900(0x310c4, float:2.81521E-40)
            if (r2 >= r6) goto L_0x0047
            r0 = 25
            return r0
        L_0x0047:
            com.google.android.gms.measurement.internal.n5 r2 = r7.f2143a
            r2.mo14402z()
            boolean r2 = r0 instanceof android.os.Parcelable[]
            if (r2 == 0) goto L_0x0055
            r6 = r0
            android.os.Parcelable[] r6 = (android.os.Parcelable[]) r6
            int r6 = r6.length
            goto L_0x0060
        L_0x0055:
            boolean r6 = r0 instanceof java.util.ArrayList
            if (r6 == 0) goto L_0x00ad
            r6 = r0
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            int r6 = r6.size()
        L_0x0060:
            r9 = 200(0xc8, float:2.8E-43)
            if (r6 <= r9) goto L_0x00ad
            com.google.android.gms.measurement.internal.n5 r10 = r7.f2143a
            com.google.android.gms.measurement.internal.c4 r10 = r10.mo14228b()
            com.google.android.gms.measurement.internal.z3 r10 = r10.mo14041x()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r11 = "Parameter array is too long; discarded. Value kind, name, array length"
            r10.mo14696d(r11, r3, r8, r6)
            com.google.android.gms.measurement.internal.n5 r6 = r7.f2143a
            r6.mo14402z()
            if (r2 == 0) goto L_0x008e
            r2 = r0
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            int r6 = r2.length
            if (r6 <= r9) goto L_0x00a7
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r9)
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            r1.putParcelableArray(r8, r2)
            goto L_0x00a7
        L_0x008e:
            boolean r2 = r0 instanceof java.util.ArrayList
            if (r2 == 0) goto L_0x00a7
            r2 = r0
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r6 = r2.size()
            if (r6 <= r9) goto L_0x00a7
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.List r2 = r2.subList(r5, r9)
            r6.<init>(r2)
            r1.putParcelableArrayList(r8, r6)
        L_0x00a7:
            r9 = 17
            goto L_0x00ae
        L_0x00aa:
            r0 = 21
            return r0
        L_0x00ad:
            r9 = 0
        L_0x00ae:
            com.google.android.gms.measurement.internal.n5 r1 = r7.f2143a
            com.google.android.gms.measurement.internal.g r1 = r1.mo14402z()
            com.google.android.gms.measurement.internal.n3 r2 = com.google.android.gms.measurement.internal.C1727o3.f2422T
            r10 = r15
            boolean r1 = r1.mo14163B(r15, r2)
            if (r1 == 0) goto L_0x00c3
            boolean r1 = m4831W(r16)
            if (r1 != 0) goto L_0x00c9
        L_0x00c3:
            boolean r1 = m4831W(r17)
            if (r1 == 0) goto L_0x00d1
        L_0x00c9:
            com.google.android.gms.measurement.internal.n5 r1 = r7.f2143a
            r1.mo14402z()
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x00d8
        L_0x00d1:
            com.google.android.gms.measurement.internal.n5 r1 = r7.f2143a
            r1.mo14402z()
            r1 = 100
        L_0x00d8:
            boolean r1 = r14.mo14659P(r3, r8, r1, r0)
            if (r1 == 0) goto L_0x00df
            return r9
        L_0x00df:
            if (r22 == 0) goto L_0x016f
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 == 0) goto L_0x00f7
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r5 = r20
            r6 = r21
            r0.mo14654K(r1, r2, r3, r4, r5, r6)
            goto L_0x016e
        L_0x00f7:
            boolean r1 = r0 instanceof android.os.Parcelable[]
            if (r1 == 0) goto L_0x012f
            r11 = r0
            android.os.Parcelable[] r11 = (android.os.Parcelable[]) r11
            int r12 = r11.length
            r13 = 0
        L_0x0100:
            if (r13 >= r12) goto L_0x016e
            r0 = r11[r13]
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x011c
            com.google.android.gms.measurement.internal.n5 r1 = r7.f2143a
            com.google.android.gms.measurement.internal.c4 r1 = r1.mo14228b()
            com.google.android.gms.measurement.internal.z3 r1 = r1.mo14041x()
            java.lang.Class r0 = r0.getClass()
            java.lang.String r2 = "All Parcelable[] elements must be of type Bundle. Value type, name"
        L_0x0118:
            r1.mo14695c(r2, r0, r8)
            goto L_0x016f
        L_0x011c:
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r5 = r20
            r6 = r21
            r0.mo14654K(r1, r2, r3, r4, r5, r6)
            int r13 = r13 + 1
            goto L_0x0100
        L_0x012f:
            boolean r1 = r0 instanceof java.util.ArrayList
            if (r1 == 0) goto L_0x016f
            r11 = r0
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            int r12 = r11.size()
            r13 = 0
        L_0x013b:
            if (r13 >= r12) goto L_0x016e
            java.lang.Object r0 = r11.get(r13)
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x015b
            com.google.android.gms.measurement.internal.n5 r1 = r7.f2143a
            com.google.android.gms.measurement.internal.c4 r1 = r1.mo14228b()
            com.google.android.gms.measurement.internal.z3 r1 = r1.mo14041x()
            if (r0 == 0) goto L_0x0156
            java.lang.Class r0 = r0.getClass()
            goto L_0x0158
        L_0x0156:
            java.lang.String r0 = "null"
        L_0x0158:
            java.lang.String r2 = "All ArrayList elements must be of type Bundle. Value type, name"
            goto L_0x0118
        L_0x015b:
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r5 = r20
            r6 = r21
            r0.mo14654K(r1, r2, r3, r4, r5, r6)
            int r13 = r13 + 1
            goto L_0x013b
        L_0x016e:
            return r9
        L_0x016f:
            r0 = 4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1854ya.mo14658O(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public final boolean mo14659P(String str, String str2, int i, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String obj2 = obj.toString();
            if (obj2.codePointCount(0, obj2.length()) > i) {
                this.f2143a.mo14228b().mo14041x().mo14696d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public final boolean mo14660Q(String str, String str2) {
        if (str2 == null) {
            this.f2143a.mo14228b().mo14036s().mo14694b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.f2143a.mo14228b().mo14036s().mo14694b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                if (codePointAt == 95) {
                    codePointAt = 95;
                } else {
                    this.f2143a.mo14228b().mo14036s().mo14695c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                    return false;
                }
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    this.f2143a.mo14228b().mo14036s().mo14695c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public final boolean mo14661R(String str, String str2) {
        if (str2 == null) {
            this.f2143a.mo14228b().mo14036s().mo14694b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.f2143a.mo14228b().mo14036s().mo14694b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                this.f2143a.mo14228b().mo14036s().mo14695c("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    this.f2143a.mo14228b().mo14036s().mo14695c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: S */
    public final boolean mo14662S(String str) {
        mo14009h();
        if (C3144c.m8403a(this.f2143a.mo14231f()).mo23626a(str) == 0) {
            return true;
        }
        this.f2143a.mo14228b().mo14034q().mo14694b("Permission not granted", str);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public final boolean mo14663T(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String u = this.f2143a.mo14402z().mo14180u();
        this.f2143a.mo14230d();
        return u.equals(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public final boolean mo14664U(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: V */
    public final boolean mo14665V(Context context, String str) {
        C1859z3 z3Var;
        String str2;
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo d = C3144c.m8403a(context).mo23629d(str, 64);
            if (d == null || (signatureArr = d.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (CertificateException e) {
            e = e;
            z3Var = this.f2143a.mo14228b().mo14035r();
            str2 = "Error obtaining certificate";
            z3Var.mo14694b(str2, e);
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            e = e2;
            z3Var = this.f2143a.mo14228b().mo14035r();
            str2 = "Package name not found";
            z3Var.mo14694b(str2, e);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public final boolean mo14666b0(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            C0917i.m1419j(str);
            return !str.equals(str2);
        } else if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        } else {
            if (isEmpty) {
                return TextUtils.isEmpty(str3) || !str3.equals(str4);
            }
            if (TextUtils.isEmpty(str4)) {
                return false;
            }
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public final byte[] mo14667c0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: i */
    public final void mo14240i() {
        mo14009h();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                this.f2143a.mo14228b().mo14040w().mo14693a("Utils falling back to Random for random id");
            }
        }
        this.f2807d.set(nextLong);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo14033j() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public final int mo14668j0(String str, Object obj) {
        String str2;
        int i;
        if ("_ldl".equals(str)) {
            i = m4838f0(str);
            str2 = "user property referrer";
        } else {
            i = m4838f0(str);
            str2 = "user property";
        }
        return mo14659P(str2, str, i, obj) ? 0 : 7;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public final int mo14669k0(String str) {
        if (!mo14660Q("event", str)) {
            return 2;
        }
        if (!mo14657N("event", C1693l6.f2269a, C1693l6.f2270b, str)) {
            return 13;
        }
        this.f2143a.mo14402z();
        return !mo14656M("event", 40, str) ? 2 : 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public final int mo14670l0(String str) {
        if (!mo14660Q("event param", str)) {
            return 3;
        }
        if (!mo14657N("event param", (String[]) null, (String[]) null, str)) {
            return 14;
        }
        this.f2143a.mo14402z();
        return !mo14656M("event param", 40, str) ? 3 : 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m0 */
    public final int mo14671m0(String str) {
        if (!mo14661R("event param", str)) {
            return 3;
        }
        if (!mo14657N("event param", (String[]) null, (String[]) null, str)) {
            return 14;
        }
        this.f2143a.mo14402z();
        return !mo14656M("event param", 40, str) ? 3 : 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n0 */
    public final int mo14672n0(String str) {
        if (!mo14660Q("user property", str)) {
            return 6;
        }
        if (!mo14657N("user property", C1718n6.f2367a, (String[]) null, str)) {
            return 15;
        }
        this.f2143a.mo14402z();
        return !mo14656M("user property", 24, str) ? 6 : 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final Object mo14673o(String str, Object obj) {
        int i = 256;
        if ("_ev".equals(str)) {
            this.f2143a.mo14402z();
            return m4839g0(256, obj, true, true);
        }
        if (m4831W(str)) {
            this.f2143a.mo14402z();
        } else {
            this.f2143a.mo14402z();
            i = 100;
        }
        return m4839g0(i, obj, false, true);
    }

    @EnsuresNonNull({"this.apkVersion"})
    /* renamed from: o0 */
    public final int mo14674o0() {
        if (this.f2809f == null) {
            this.f2809f = Integer.valueOf(C0877b.m1212h().mo12119b(this.f2143a.mo14231f()) / 1000);
        }
        return this.f2809f.intValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final Object mo14675p(String str, Object obj) {
        boolean equals = "_ldl".equals(str);
        int f0 = m4838f0(str);
        return equals ? m4839g0(f0, obj, true, false) : m4839g0(f0, obj, false, false);
    }

    /* renamed from: p0 */
    public final int mo14676p0(int i) {
        return C0877b.m1212h().mo11774j(this.f2143a.mo14231f(), C0879d.f886a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final String mo14677q() {
        byte[] bArr = new byte[16];
        mo14683u().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    /* renamed from: r */
    public final String mo14678r(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    /* renamed from: r0 */
    public final long mo14679r0() {
        int i = (this.f2807d.get() > 0 ? 1 : (this.f2807d.get() == 0 ? 0 : -1));
        synchronized (this.f2807d) {
            if (i == 0) {
                long nextLong = new Random(System.nanoTime() ^ this.f2143a.mo14229c().mo11029a()).nextLong();
                int i2 = this.f2808e + 1;
                this.f2808e = i2;
                long j = nextLong + ((long) i2);
                return j;
            }
            this.f2807d.compareAndSet(-1, 1);
            long andIncrement = this.f2807d.getAndIncrement();
            return andIncrement;
        }
    }

    /* renamed from: s */
    public final URL mo14680s(long j, String str, String str2, long j2) {
        try {
            C0917i.m1415f(str2);
            C0917i.m1415f(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", new Object[]{String.format("v%s.%s", new Object[]{64000L, Integer.valueOf(mo14674o0())}), str2, str, Long.valueOf(j2)});
            if (str.equals(this.f2143a.mo14402z().mo14181v())) {
                format = format.concat("&ddl_test=1");
            }
            return new URL(format);
        } catch (IllegalArgumentException | MalformedURLException e) {
            this.f2143a.mo14228b().mo14035r().mo14694b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    /* renamed from: s0 */
    public final long mo14681s0(long j, long j2) {
        return (j + (j2 * 60000)) / 86400000;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t0 */
    public final Bundle mo14682t0(Uri uri, boolean z, boolean z2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    str7 = uri.getQueryParameter("utm_campaign");
                    str6 = uri.getQueryParameter("utm_source");
                    str5 = uri.getQueryParameter("utm_medium");
                    str4 = uri.getQueryParameter("gclid");
                    if (z) {
                        str3 = uri.getQueryParameter("utm_id");
                        str2 = uri.getQueryParameter("dclid");
                    } else {
                        str3 = null;
                        str2 = null;
                    }
                    str = z2 ? uri.getQueryParameter("srsltid") : null;
                } else {
                    str7 = null;
                    str6 = null;
                    str5 = null;
                    str4 = null;
                    str3 = null;
                    str2 = null;
                    str = null;
                }
                if (TextUtils.isEmpty(str7) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str4) && ((!z || (TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2))) && (!z2 || TextUtils.isEmpty(str)))) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(str7)) {
                    bundle.putString("campaign", str7);
                }
                if (!TextUtils.isEmpty(str6)) {
                    bundle.putString("source", str6);
                }
                if (!TextUtils.isEmpty(str5)) {
                    bundle.putString("medium", str5);
                }
                if (!TextUtils.isEmpty(str4)) {
                    bundle.putString("gclid", str4);
                }
                String queryParameter = uri.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString("term", queryParameter);
                }
                String queryParameter2 = uri.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString("content", queryParameter2);
                }
                String queryParameter3 = uri.getQueryParameter("aclid");
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString("aclid", queryParameter3);
                }
                String queryParameter4 = uri.getQueryParameter("cp1");
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString("cp1", queryParameter4);
                }
                String queryParameter5 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("anid", queryParameter5);
                }
                if (z) {
                    if (!TextUtils.isEmpty(str3)) {
                        bundle.putString("campaign_id", str3);
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        bundle.putString("dclid", str2);
                    }
                    String queryParameter6 = uri.getQueryParameter("utm_source_platform");
                    if (!TextUtils.isEmpty(queryParameter6)) {
                        bundle.putString("source_platform", queryParameter6);
                    }
                    String queryParameter7 = uri.getQueryParameter("utm_creative_format");
                    if (!TextUtils.isEmpty(queryParameter7)) {
                        bundle.putString("creative_format", queryParameter7);
                    }
                    String queryParameter8 = uri.getQueryParameter("utm_marketing_tactic");
                    if (!TextUtils.isEmpty(queryParameter8)) {
                        bundle.putString("marketing_tactic", queryParameter8);
                    }
                }
                if (z2 && !TextUtils.isEmpty(str)) {
                    bundle.putString("srsltid", str);
                }
                return bundle;
            } catch (UnsupportedOperationException e) {
                this.f2143a.mo14228b().mo14040w().mo14694b("Install referrer url isn't a hierarchical URI", e);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    @EnsuresNonNull({"this.secureRandom"})
    /* renamed from: u */
    public final SecureRandom mo14683u() {
        mo14009h();
        if (this.f2806c == null) {
            this.f2806c = new SecureRandom();
        }
        return this.f2806c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u0 */
    public final Bundle mo14684u0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object o = mo14673o(str, bundle.get(str));
                if (o == null) {
                    this.f2143a.mo14228b().mo14041x().mo14694b("Param value can't be null", this.f2143a.mo14373D().mo14618e(str));
                } else {
                    mo14646C(bundle2, str, o);
                }
            }
        }
        return bundle2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.lang.String} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0106 A[SYNTHETIC] */
    /* renamed from: v0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo14685v0(java.lang.String r21, java.lang.String r22, android.os.Bundle r23, java.util.List r24, boolean r25) {
        /*
            r20 = this;
            r9 = r20
            r10 = r22
            r11 = r23
            r12 = r24
            java.lang.String[] r0 = com.google.android.gms.measurement.internal.C1693l6.f2272d
            boolean r13 = m4840h0(r10, r0)
            if (r11 == 0) goto L_0x010b
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>(r11)
            com.google.android.gms.measurement.internal.n5 r0 = r9.f2143a
            com.google.android.gms.measurement.internal.g r0 = r0.mo14402z()
            int r8 = r0.mo14172m()
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.Set r1 = r23.keySet()
            r0.<init>(r1)
            java.util.Iterator r16 = r0.iterator()
            r17 = 0
            r18 = 0
        L_0x0030:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0109
            java.lang.Object r0 = r16.next()
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            if (r12 == 0) goto L_0x0048
            boolean r0 = r12.contains(r7)
            if (r0 != 0) goto L_0x0046
            goto L_0x0048
        L_0x0046:
            r2 = 0
            goto L_0x0057
        L_0x0048:
            if (r25 != 0) goto L_0x004f
            int r0 = r9.mo14671m0(r7)
            goto L_0x0050
        L_0x004f:
            r0 = 0
        L_0x0050:
            if (r0 != 0) goto L_0x0056
            int r0 = r9.mo14670l0(r7)
        L_0x0056:
            r2 = r0
        L_0x0057:
            if (r2 == 0) goto L_0x006d
            r0 = 3
            if (r2 != r0) goto L_0x005e
            r5 = r7
            goto L_0x005f
        L_0x005e:
            r5 = 0
        L_0x005f:
            r0 = r20
            r1 = r15
            r3 = r7
            r4 = r7
            r0.mo14688x(r1, r2, r3, r4, r5)
            r15.remove(r7)
            r14 = r8
            goto L_0x0106
        L_0x006d:
            java.lang.Object r4 = r11.get(r7)
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r7
            r5 = r15
            r6 = r24
            r19 = r7
            r7 = r25
            r14 = r8
            r8 = r13
            int r2 = r0.mo14658O(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 17
            if (r2 != r0) goto L_0x0098
            r2 = 17
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r0 = r20
            r1 = r15
            r3 = r19
            r4 = r19
            r0.mo14688x(r1, r2, r3, r4, r5)
            goto L_0x00ba
        L_0x0098:
            if (r2 == 0) goto L_0x00ba
            java.lang.String r0 = "_ev"
            r6 = r19
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x00bc
            r0 = 21
            if (r2 != r0) goto L_0x00aa
            r3 = r10
            goto L_0x00ab
        L_0x00aa:
            r3 = r6
        L_0x00ab:
            java.lang.Object r5 = r11.get(r6)
            r0 = r20
            r1 = r15
            r4 = r6
            r0.mo14688x(r1, r2, r3, r4, r5)
            r15.remove(r6)
            goto L_0x0106
        L_0x00ba:
            r6 = r19
        L_0x00bc:
            boolean r0 = m4832X(r6)
            if (r0 == 0) goto L_0x0106
            int r0 = r18 + 1
            if (r0 <= r14) goto L_0x0104
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Event can't contain more than "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r2 = " params"
            r1.append(r2)
            com.google.android.gms.measurement.internal.n5 r2 = r9.f2143a
            com.google.android.gms.measurement.internal.c4 r2 = r2.mo14228b()
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo14036s()
            java.lang.String r1 = r1.toString()
            com.google.android.gms.measurement.internal.n5 r3 = r9.f2143a
            com.google.android.gms.measurement.internal.w3 r3 = r3.mo14373D()
            java.lang.String r3 = r3.mo14617d(r10)
            com.google.android.gms.measurement.internal.n5 r4 = r9.f2143a
            com.google.android.gms.measurement.internal.w3 r4 = r4.mo14373D()
            java.lang.String r4 = r4.mo14615b(r11)
            r2.mo14695c(r1, r3, r4)
            r1 = 5
            m4836d0(r15, r1)
            r15.remove(r6)
        L_0x0104:
            r18 = r0
        L_0x0106:
            r8 = r14
            goto L_0x0030
        L_0x0109:
            r14 = r15
            goto L_0x010c
        L_0x010b:
            r14 = 0
        L_0x010c:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1854ya.mo14685v0(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: w */
    public final void mo14686w(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            this.f2143a.mo14228b().mo14040w().mo14694b("Params already contained engagement", Long.valueOf(j2));
        } else {
            j2 = 0;
        }
        bundle.putLong("_et", j + j2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w0 */
    public final zzaw mo14687w0(String str, String str2, Bundle bundle, String str3, long j, boolean z, boolean z2) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (mo14669k0(str2) == 0) {
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            bundle3.putString("_o", str3);
            Bundle v0 = mo14685v0(str, str2, bundle3, C0617f.m205b("_o"), true);
            if (z) {
                v0 = mo14684u0(v0);
            }
            C0917i.m1419j(v0);
            return new zzaw(str2, new zzau(v0), str3, j);
        }
        this.f2143a.mo14228b().mo14035r().mo14694b("Invalid conditional property event name", this.f2143a.mo14373D().mo14619f(str2));
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final void mo14688x(Bundle bundle, int i, String str, String str2, Object obj) {
        if (m4836d0(bundle, i)) {
            this.f2143a.mo14402z();
            bundle.putString("_ev", mo14678r(str, 40, true));
            if (obj != null) {
                C0917i.m1419j(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", (long) obj.toString().length());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final void mo14689z(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                if (!bundle.containsKey(str)) {
                    this.f2143a.mo14382N().mo14646C(bundle, str, bundle2.get(str));
                }
            }
        }
    }
}
