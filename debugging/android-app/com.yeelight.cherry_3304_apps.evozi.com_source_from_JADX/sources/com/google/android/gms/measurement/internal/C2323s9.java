package com.google.android.gms.measurement.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.C1520d;
import com.google.android.gms.common.C1533g;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.p105j.C1620c;
import com.google.android.gms.common.util.C1652f;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.C1832ia;
import com.google.android.gms.internal.measurement.C1992sc;
import com.google.android.gms.internal.measurement.C2065x8;
import com.miot.service.common.crypto.rc4coder.Coder;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.mistatistic.sdk.MiStatInterface;
import com.yeelight.yeelib.p150c.p183m.C7200r;
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
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* renamed from: com.google.android.gms.measurement.internal.s9 */
public final class C2323s9 extends C2352v5 {

    /* renamed from: g */
    private static final String[] f4592g = {"firebase_", "google_", "ga_"};

    /* renamed from: h */
    private static final String[] f4593h = {"_err"};

    /* renamed from: c */
    private SecureRandom f4594c;

    /* renamed from: d */
    private final AtomicLong f4595d = new AtomicLong(0);

    /* renamed from: e */
    private int f4596e;

    /* renamed from: f */
    private Integer f4597f = null;

    C2323s9(C2111a5 a5Var) {
        super(a5Var);
    }

    /* renamed from: A0 */
    static boolean m7550A0(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* renamed from: C */
    public static Bundle m7551C(List<zzkn> list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        for (zzkn next : list) {
            String str = next.f4774e;
            if (str != null) {
                bundle.putString(next.f4771b, str);
            } else {
                Long l = next.f4773d;
                if (l != null) {
                    bundle.putLong(next.f4771b, l.longValue());
                } else {
                    Double d = next.f4776g;
                    if (d != null) {
                        bundle.putDouble(next.f4771b, d.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    /* renamed from: D0 */
    public static boolean m7552D0(String str) {
        for (String equals : f4593h) {
            if (equals.equals(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: E */
    private final Object m7553E(int i, Object obj, boolean z, boolean z2) {
        Bundle A;
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
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return m7555G(String.valueOf(obj), i, z);
            }
            if (!C2065x8.m6570a() || !mo13112m().mo12474s(C2302r.f4474I0) || !mo13112m().mo12474s(C2302r.f4472H0) || !z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if ((parcelable instanceof Bundle) && (A = mo12944A((Bundle) parcelable)) != null && !A.isEmpty()) {
                    arrayList.add(A);
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    /* renamed from: E0 */
    private final int m7554E0(String str) {
        if (!mo12968e0("event param", str)) {
            return 3;
        }
        if (!mo12971j0("event param", (String[]) null, str)) {
            return 14;
        }
        return !mo12967d0("event param", 40, str) ? 3 : 0;
    }

    /* renamed from: G */
    public static String m7555G(String str, int i, boolean z) {
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

    /* renamed from: G0 */
    private final int m7556G0(String str) {
        if (!mo12974s0("event param", str)) {
            return 3;
        }
        if (!mo12971j0("event param", (String[]) null, str)) {
            return 14;
        }
        return !mo12967d0("event param", 40, str) ? 3 : 0;
    }

    /* renamed from: H0 */
    static MessageDigest m7557H0() {
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

    @VisibleForTesting
    /* renamed from: J0 */
    private static boolean m7558J0(String str) {
        C1609u.m4475k(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    /* renamed from: K */
    private static void m7559K(Bundle bundle, int i, String str, String str2, Object obj) {
        if (m7575r0(bundle, i)) {
            bundle.putString("_ev", m7555G(str, 40, true));
            if (obj != null) {
                C1609u.m4475k(bundle);
                if (obj == null) {
                    return;
                }
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", (long) String.valueOf(obj).length());
                }
            }
        }
    }

    /* renamed from: K0 */
    private final int m7560K0(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        if ("_id".equals(str)) {
            return 256;
        }
        return (!mo13112m().mo12474s(C2302r.f4526m0) || !"_lgclid".equals(str)) ? 36 : 100;
    }

    /* renamed from: V */
    private final void m7561V(String str, String str2, String str3, Bundle bundle, @Nullable List<String> list, boolean z) {
        int i;
        String str4;
        int i2;
        String str5;
        String str6 = str2;
        Bundle bundle2 = bundle;
        List<String> list2 = list;
        if (bundle2 != null) {
            boolean s = mo13112m().mo12474s(C2302r.f4476J0);
            int z2 = s ? 0 : mo13112m().mo12481z();
            int i3 = 0;
            for (String str7 : new TreeSet(bundle.keySet())) {
                if (list2 == null || !list2.contains(str7)) {
                    i = z ? m7554E0(str7) : 0;
                    if (i == 0) {
                        i = m7556G0(str7);
                    }
                } else {
                    i = 0;
                }
                if (i != 0) {
                    m7559K(bundle2, i, str7, str7, i == 3 ? str7 : null);
                    bundle2.remove(str7);
                } else {
                    if (m7566a0(bundle2.get(str7))) {
                        mo12427b().mo13101L().mo13133d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str6, str3, str7);
                        i2 = 22;
                        str4 = str7;
                    } else {
                        String str8 = str3;
                        str4 = str7;
                        i2 = m7577u(str, str2, str7, bundle2.get(str7), bundle, list, z, false);
                    }
                    if (i2 != 0 && !"_ev".equals(str4)) {
                        m7559K(bundle2, i2, str4, str4, bundle2.get(str4));
                        bundle2.remove(str4);
                    } else if (m7567b0(str4) && (!s || !m7569i0(str4, C2396z5.f4757d))) {
                        int i4 = i3 + 1;
                        if (i4 > z2) {
                            if (s) {
                                str5 = "Item cannot contain custom parameters";
                            } else {
                                StringBuilder sb = new StringBuilder(63);
                                sb.append("Child bundles can't contain more than ");
                                sb.append(z2);
                                sb.append(" custom params");
                                str5 = sb.toString();
                            }
                            mo12427b().mo13098H().mo13132c(str5, mo13109j().mo12995v(str6), mo13109j().mo12993t(bundle2));
                            m7575r0(bundle2, s ? 23 : 5);
                            bundle2.remove(str4);
                        }
                        i3 = i4;
                    }
                }
            }
        }
    }

    /* renamed from: W */
    static boolean m7562W(Context context, boolean z) {
        C1609u.m4475k(context);
        return m7574q0(context, Build.VERSION.SDK_INT >= 24 ? "com.google.android.gms.measurement.AppMeasurementJobService" : "com.google.android.gms.measurement.AppMeasurementService");
    }

    /* renamed from: X */
    static boolean m7563X(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    /* renamed from: Y */
    static boolean m7564Y(Bundle bundle, int i) {
        int i2 = 0;
        if (bundle.size() <= i) {
            return false;
        }
        for (String str : new TreeSet(bundle.keySet())) {
            i2++;
            if (i2 > i) {
                bundle.remove(str);
            }
        }
        return true;
    }

    /* renamed from: Z */
    static boolean m7565Z(Boolean bool, Boolean bool2) {
        if (bool == null && bool2 == null) {
            return true;
        }
        if (bool == null) {
            return false;
        }
        return bool.equals(bool2);
    }

    /* renamed from: a0 */
    static boolean m7566a0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    /* renamed from: b0 */
    static boolean m7567b0(String str) {
        C1609u.m4471g(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    /* renamed from: h0 */
    static boolean m7568h0(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            return !str.equals(str2);
        }
        if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (isEmpty || !isEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    /* renamed from: i0 */
    private static boolean m7569i0(String str, String[] strArr) {
        C1609u.m4475k(strArr);
        for (String y0 : strArr) {
            if (m7583y0(str, y0)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k0 */
    static boolean m7570k0(@Nullable List<String> list, @Nullable List<String> list2) {
        if (list == null && list2 == null) {
            return true;
        }
        if (list == null) {
            return false;
        }
        return list.equals(list2);
    }

    /* renamed from: l0 */
    static byte[] m7571l0(Parcelable parcelable) {
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

    /* renamed from: o0 */
    public static Bundle m7572o0(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        if (parcelableArr[i] instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelableArr[i]);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        return bundle2;
    }

    /* renamed from: p0 */
    public static ArrayList<Bundle> m7573p0(List<zzy> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (zzy next : list) {
            Bundle bundle = new Bundle();
            bundle.putString(Constants.APP_ID, next.f4799a);
            bundle.putString("origin", next.f4800b);
            bundle.putLong("creation_timestamp", next.f4802d);
            bundle.putString("name", next.f4801c.f4771b);
            C2374x5.m7763b(bundle, next.f4801c.mo13160Q());
            bundle.putBoolean("active", next.f4803e);
            String str = next.f4804f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            zzaq zzaq = next.f4805g;
            if (zzaq != null) {
                bundle.putString("timed_out_event_name", zzaq.f4766a);
                zzal zzal = next.f4805g.f4767b;
                if (zzal != null) {
                    bundle.putBundle("timed_out_event_params", zzal.mo13151T());
                }
            }
            bundle.putLong("trigger_timeout", next.f4806h);
            zzaq zzaq2 = next.f4807i;
            if (zzaq2 != null) {
                bundle.putString("triggered_event_name", zzaq2.f4766a);
                zzal zzal2 = next.f4807i.f4767b;
                if (zzal2 != null) {
                    bundle.putBundle("triggered_event_params", zzal2.mo13151T());
                }
            }
            bundle.putLong("triggered_timestamp", next.f4801c.f4772c);
            bundle.putLong("time_to_live", next.f4808j);
            zzaq zzaq3 = next.f4809k;
            if (zzaq3 != null) {
                bundle.putString("expired_event_name", zzaq3.f4766a);
                zzal zzal3 = next.f4809k.f4767b;
                if (zzal3 != null) {
                    bundle.putBundle("expired_event_params", zzal3.mo13151T());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0008, code lost:
        r3 = r1.getServiceInfo(new android.content.ComponentName(r3, r4), 0);
     */
    /* renamed from: q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m7574q0(android.content.Context r3, java.lang.String r4) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2323s9.m7574q0(android.content.Context, java.lang.String):boolean");
    }

    /* renamed from: r0 */
    static boolean m7575r0(Bundle bundle, int i) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i);
        return true;
    }

    /* renamed from: t0 */
    private final boolean m7576t0(String str, String str2, int i, Object obj) {
        int i2;
        if (obj instanceof Parcelable[]) {
            i2 = ((Parcelable[]) obj).length;
        } else {
            if (obj instanceof ArrayList) {
                i2 = ((ArrayList) obj).size();
            }
            return true;
        }
        if (i2 > i) {
            mo12427b().mo13101L().mo13133d("Parameter array is too long; discarded. Value kind, name, array length", str, str2, Integer.valueOf(i2));
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0166 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    @androidx.annotation.WorkerThread
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m7577u(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.Object r21, android.os.Bundle r22, @androidx.annotation.Nullable java.util.List<java.lang.String> r23, boolean r24, boolean r25) {
        /*
            r17 = this;
            r7 = r17
            r8 = r20
            r0 = r21
            r1 = r22
            r17.mo12567h()
            boolean r2 = com.google.android.gms.internal.measurement.C2065x8.m6570a()
            r3 = 17
            java.lang.String r4 = "param"
            r9 = 0
            if (r2 == 0) goto L_0x007f
            com.google.android.gms.measurement.internal.b r2 = r17.mo13112m()
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.C2302r.f4476J0
            boolean r2 = r2.mo12474s(r5)
            if (r2 == 0) goto L_0x007f
            boolean r2 = m7566a0(r21)
            if (r2 == 0) goto L_0x008a
            if (r25 == 0) goto L_0x007c
            java.lang.String[] r2 = com.google.android.gms.measurement.internal.C2396z5.f4756c
            boolean r2 = m7569i0(r8, r2)
            if (r2 != 0) goto L_0x0035
            r0 = 20
            return r0
        L_0x0035:
            com.google.android.gms.measurement.internal.a5 r2 = r7.f4689a
            com.google.android.gms.measurement.internal.r7 r2 = r2.mo12422Q()
            boolean r2 = r2.mo12927c0()
            if (r2 != 0) goto L_0x0044
            r0 = 25
            return r0
        L_0x0044:
            r2 = 200(0xc8, float:2.8E-43)
            boolean r5 = r7.m7576t0(r4, r8, r2, r0)
            if (r5 != 0) goto L_0x008a
            boolean r5 = r0 instanceof android.os.Parcelable[]
            if (r5 == 0) goto L_0x0060
            r5 = r0
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            int r6 = r5.length
            if (r6 <= r2) goto L_0x0079
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r5, r2)
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            r1.putParcelableArray(r8, r2)
            goto L_0x0079
        L_0x0060:
            boolean r5 = r0 instanceof java.util.ArrayList
            if (r5 == 0) goto L_0x0079
            r5 = r0
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r6 = r5.size()
            if (r6 <= r2) goto L_0x0079
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.List r2 = r5.subList(r9, r2)
            r6.<init>(r2)
            r1.putParcelableArrayList(r8, r6)
        L_0x0079:
            r10 = 17
            goto L_0x008b
        L_0x007c:
            r0 = 21
            return r0
        L_0x007f:
            if (r25 == 0) goto L_0x008a
            r1 = 1000(0x3e8, float:1.401E-42)
            boolean r1 = r7.m7576t0(r4, r8, r1, r0)
            if (r1 != 0) goto L_0x008a
            return r3
        L_0x008a:
            r10 = 0
        L_0x008b:
            com.google.android.gms.measurement.internal.b r1 = r17.mo13112m()
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C2302r.f4491R
            r11 = r18
            boolean r1 = r1.mo12456B(r11, r2)
            if (r1 == 0) goto L_0x009f
            boolean r1 = m7550A0(r19)
            if (r1 != 0) goto L_0x00a5
        L_0x009f:
            boolean r1 = m7550A0(r20)
            if (r1 == 0) goto L_0x00a8
        L_0x00a5:
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x00aa
        L_0x00a8:
            r1 = 100
        L_0x00aa:
            boolean r1 = r7.mo12969f0(r4, r8, r1, r0)
            if (r1 == 0) goto L_0x00b1
            return r10
        L_0x00b1:
            if (r25 == 0) goto L_0x0167
            boolean r1 = com.google.android.gms.internal.measurement.C2065x8.m6570a()
            r12 = 1
            if (r1 == 0) goto L_0x00c8
            com.google.android.gms.measurement.internal.b r1 = r17.mo13112m()
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C2302r.f4474I0
            boolean r1 = r1.mo12474s(r2)
            if (r1 == 0) goto L_0x00c8
            r13 = 1
            goto L_0x00c9
        L_0x00c8:
            r13 = 0
        L_0x00c9:
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 == 0) goto L_0x00e4
            if (r13 == 0) goto L_0x00e1
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r23
            r6 = r24
            r0.m7561V(r1, r2, r3, r4, r5, r6)
        L_0x00e1:
            r9 = 1
            goto L_0x0164
        L_0x00e4:
            boolean r1 = r0 instanceof android.os.Parcelable[]
            if (r1 == 0) goto L_0x0123
            r14 = r0
            android.os.Parcelable[] r14 = (android.os.Parcelable[]) r14
            int r15 = r14.length
            r6 = 0
        L_0x00ed:
            if (r6 >= r15) goto L_0x00e1
            r0 = r14[r6]
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x0107
            com.google.android.gms.measurement.internal.w3 r1 = r17.mo12427b()
            com.google.android.gms.measurement.internal.y3 r1 = r1.mo13101L()
            java.lang.Class r0 = r0.getClass()
            java.lang.String r2 = "All Parcelable[] elements must be of type Bundle. Value type, name"
            r1.mo13132c(r2, r0, r8)
            goto L_0x0164
        L_0x0107:
            if (r13 == 0) goto L_0x011e
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r23
            r16 = r6
            r6 = r24
            r0.m7561V(r1, r2, r3, r4, r5, r6)
            goto L_0x0120
        L_0x011e:
            r16 = r6
        L_0x0120:
            int r6 = r16 + 1
            goto L_0x00ed
        L_0x0123:
            boolean r1 = r0 instanceof java.util.ArrayList
            if (r1 == 0) goto L_0x0164
            r14 = r0
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            int r15 = r14.size()
            r0 = 0
        L_0x012f:
            if (r0 >= r15) goto L_0x00e1
            java.lang.Object r1 = r14.get(r0)
            int r16 = r0 + 1
            boolean r0 = r1 instanceof android.os.Bundle
            if (r0 != 0) goto L_0x014d
            com.google.android.gms.measurement.internal.w3 r0 = r17.mo12427b()
            com.google.android.gms.measurement.internal.y3 r0 = r0.mo13101L()
            java.lang.Class r1 = r1.getClass()
            java.lang.String r2 = "All ArrayList elements must be of type Bundle. Value type, name"
            r0.mo13132c(r2, r1, r8)
            goto L_0x0164
        L_0x014d:
            if (r13 == 0) goto L_0x0161
            r4 = r1
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r23
            r6 = r24
            r0.m7561V(r1, r2, r3, r4, r5, r6)
        L_0x0161:
            r0 = r16
            goto L_0x012f
        L_0x0164:
            if (r9 == 0) goto L_0x0167
            return r10
        L_0x0167:
            r0 = 4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2323s9.m7577u(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    /* renamed from: u0 */
    static Bundle[] m7578u0(Object obj) {
        Object[] array;
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        }
        if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            array = Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else if (!(obj instanceof ArrayList)) {
            return null;
        } else {
            ArrayList arrayList = (ArrayList) obj;
            array = arrayList.toArray(new Bundle[arrayList.size()]);
        }
        return (Bundle[]) array;
    }

    /* renamed from: v */
    public static long m7579v(long j, long j2) {
        return (j + (j2 * MiStatInterface.MIN_UPLOAD_INTERVAL)) / MiStatInterface.MAX_UPLOAD_INTERVAL;
    }

    /* renamed from: x */
    public static long m7580x(zzal zzal) {
        long j = 0;
        if (zzal == null) {
            return 0;
        }
        Iterator<String> it = zzal.iterator();
        while (it.hasNext()) {
            Object S = zzal.mo13150S(it.next());
            if (S instanceof Parcelable[]) {
                j += (long) ((Parcelable[]) S).length;
            }
        }
        return j;
    }

    @VisibleForTesting
    /* renamed from: x0 */
    private final boolean m7581x0(Context context, String str) {
        C2383y3 y3Var;
        String str2;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo e = C1620c.m4502a(context).mo11303e(str, 64);
            if (e == null || e.signatures == null || e.signatures.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(e.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (CertificateException e2) {
            e = e2;
            y3Var = mo12427b().mo13096F();
            str2 = "Error obtaining certificate";
            y3Var.mo13131b(str2, e);
            return true;
        } catch (PackageManager.NameNotFoundException e3) {
            e = e3;
            y3Var = mo12427b().mo13096F();
            str2 = "Package name not found";
            y3Var.mo13131b(str2, e);
            return true;
        }
    }

    @VisibleForTesting
    /* renamed from: y */
    static long m7582y(byte[] bArr) {
        C1609u.m4475k(bArr);
        int i = 0;
        C1609u.m4478n(bArr.length > 0);
        long j = 0;
        int length = bArr.length - 1;
        while (length >= 0 && length >= bArr.length - 8) {
            j += (((long) bArr[length]) & 255) << i;
            i += 8;
            length--;
        }
        return j;
    }

    /* renamed from: y0 */
    static boolean m7583y0(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final Bundle mo12944A(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object F = mo12949F(str, bundle.get(str));
                if (F == null) {
                    mo12427b().mo13101L().mo13131b("Param value can't be null", mo13109j().mo12996y(str));
                } else {
                    mo12956M(bundle2, str, F);
                }
            }
        }
        return bundle2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.String} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo12945B(java.lang.String r20, java.lang.String r21, android.os.Bundle r22, @androidx.annotation.Nullable java.util.List<java.lang.String> r23, boolean r24, boolean r25) {
        /*
            r19 = this;
            r9 = r19
            r10 = r21
            r11 = r22
            r12 = r23
            boolean r0 = com.google.android.gms.internal.measurement.C2065x8.m6570a()
            if (r0 == 0) goto L_0x001d
            com.google.android.gms.measurement.internal.b r0 = r19.mo13112m()
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.C2302r.f4476J0
            boolean r0 = r0.mo12474s(r1)
            if (r0 == 0) goto L_0x001d
            r0 = 1
            r14 = 1
            goto L_0x001e
        L_0x001d:
            r14 = 0
        L_0x001e:
            if (r14 == 0) goto L_0x0028
            java.lang.String[] r0 = com.google.android.gms.measurement.internal.C2112a6.f3945c
            boolean r0 = m7569i0(r10, r0)
            r15 = r0
            goto L_0x002a
        L_0x0028:
            r15 = r25
        L_0x002a:
            r16 = 0
            if (r11 == 0) goto L_0x012c
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>(r11)
            com.google.android.gms.measurement.internal.b r0 = r19.mo13112m()
            int r7 = r0.mo12481z()
            com.google.android.gms.measurement.internal.b r0 = r19.mo13112m()
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.C2302r.f4506c0
            r6 = r20
            boolean r0 = r0.mo12456B(r6, r1)
            if (r0 == 0) goto L_0x0053
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.Set r1 = r22.keySet()
            r0.<init>(r1)
            goto L_0x0057
        L_0x0053:
            java.util.Set r0 = r22.keySet()
        L_0x0057:
            java.util.Iterator r17 = r0.iterator()
            r18 = 0
        L_0x005d:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0129
            java.lang.Object r0 = r17.next()
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            if (r12 == 0) goto L_0x0075
            boolean r0 = r12.contains(r5)
            if (r0 != 0) goto L_0x0073
            goto L_0x0075
        L_0x0073:
            r0 = 0
            goto L_0x0083
        L_0x0075:
            if (r24 == 0) goto L_0x007c
            int r0 = r9.m7554E0(r5)
            goto L_0x007d
        L_0x007c:
            r0 = 0
        L_0x007d:
            if (r0 != 0) goto L_0x0083
            int r0 = r9.m7556G0(r5)
        L_0x0083:
            if (r0 == 0) goto L_0x0095
            r1 = 3
            if (r0 != r1) goto L_0x008a
            r1 = r5
            goto L_0x008c
        L_0x008a:
            r1 = r16
        L_0x008c:
            m7559K(r8, r0, r5, r5, r1)
            r8.remove(r5)
            r9 = r7
            r12 = r8
            goto L_0x00d4
        L_0x0095:
            java.lang.Object r4 = r11.get(r5)
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r5
            r13 = r5
            r5 = r8
            r6 = r23
            r9 = r7
            r7 = r24
            r12 = r8
            r8 = r15
            int r0 = r0.m7577u(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r14 == 0) goto L_0x00b9
            r1 = 17
            if (r0 != r1) goto L_0x00b9
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            m7559K(r12, r0, r13, r13, r1)
            goto L_0x00dd
        L_0x00b9:
            if (r0 == 0) goto L_0x00dd
            java.lang.String r1 = "_ev"
            boolean r1 = r1.equals(r13)
            if (r1 != 0) goto L_0x00dd
            r1 = 21
            if (r0 != r1) goto L_0x00c9
            r5 = r10
            goto L_0x00ca
        L_0x00c9:
            r5 = r13
        L_0x00ca:
            java.lang.Object r1 = r11.get(r13)
            m7559K(r12, r0, r5, r13, r1)
            r12.remove(r13)
        L_0x00d4:
            r6 = r20
        L_0x00d6:
            r7 = r9
            r8 = r12
            r9 = r19
            r12 = r23
            goto L_0x005d
        L_0x00dd:
            boolean r0 = m7567b0(r13)
            if (r0 == 0) goto L_0x00d4
            int r0 = r18 + 1
            if (r0 <= r9) goto L_0x0126
            r1 = 48
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Event can't contain more than "
            r2.append(r1)
            r2.append(r9)
            java.lang.String r1 = " params"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.measurement.internal.w3 r2 = r19.mo12427b()
            com.google.android.gms.measurement.internal.y3 r2 = r2.mo13098H()
            com.google.android.gms.measurement.internal.u3 r3 = r19.mo13109j()
            java.lang.String r3 = r3.mo12995v(r10)
            com.google.android.gms.measurement.internal.u3 r4 = r19.mo13109j()
            java.lang.String r4 = r4.mo12993t(r11)
            r2.mo13132c(r1, r3, r4)
            r1 = 5
            m7575r0(r12, r1)
            r12.remove(r13)
            r6 = r20
            r18 = r0
            goto L_0x00d6
        L_0x0126:
            r18 = r0
            goto L_0x00d4
        L_0x0129:
            r12 = r8
            r16 = r12
        L_0x012c:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2323s9.mo12945B(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean, boolean):android.os.Bundle");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B0 */
    public final boolean mo12946B0(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String O = mo13112m().mo12466O();
        mo12414I();
        return O.equals(str);
    }

    /* renamed from: C0 */
    public final long mo12947C0() {
        int i = (this.f4595d.get() > 0 ? 1 : (this.f4595d.get() == 0 ? 0 : -1));
        synchronized (this.f4595d) {
            if (i == 0) {
                long nextLong = new Random(System.nanoTime() ^ mo12429f().mo11378a()).nextLong();
                int i2 = this.f4596e + 1;
                this.f4596e = i2;
                long j = nextLong + ((long) i2);
                return j;
            }
            this.f4595d.compareAndSet(-1, 1);
            long andIncrement = this.f4595d.getAndIncrement();
            return andIncrement;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final zzaq mo12948D(String str, String str2, Bundle bundle, String str3, long j, boolean z, boolean z2) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (mo12972m0(str2) == 0) {
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            bundle3.putString("_o", str3);
            return new zzaq(str2, new zzal(mo12944A(mo12945B(str, str2, bundle3, C1652f.m4583b("_o"), false, false))), str3, j);
        }
        mo12427b().mo13096F().mo13131b("Invalid conditional property event name", mo13109j().mo12997z(str2));
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final Object mo12949F(String str, Object obj) {
        int i = 256;
        if ("_ev".equals(str)) {
            return m7553E(256, obj, true, true);
        }
        if (!m7550A0(str)) {
            i = 100;
        }
        return m7553E(i, obj, false, true);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: F0 */
    public final SecureRandom mo12950F0() {
        mo12567h();
        if (this.f4594c == null) {
            this.f4594c = new SecureRandom();
        }
        return this.f4594c;
    }

    /* renamed from: H */
    public final URL mo12951H(long j, @NonNull String str, @NonNull String str2, long j2) {
        try {
            C1609u.m4471g(str2);
            C1609u.m4471g(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", new Object[]{String.format("v%s.%s", new Object[]{Long.valueOf(j), Integer.valueOf(mo12952I0())}), str2, str, Long.valueOf(j2)});
            if (str.equals(mo13112m().mo12467P())) {
                format = format.concat("&ddl_test=1");
            }
            return new URL(format);
        } catch (IllegalArgumentException | MalformedURLException e) {
            mo12427b().mo13096F().mo13131b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    /* renamed from: I0 */
    public final int mo12952I0() {
        if (this.f4597f == null) {
            this.f4597f = Integer.valueOf(C1520d.m4113h().mo11056b(mo12428c()) / 1000);
        }
        return this.f4597f.intValue();
    }

    /* renamed from: J */
    public final void mo12953J(int i, String str, String str2, int i2) {
        mo12965U((String) null, i, str, str2, i2);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: L */
    public final void mo12954L(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            mo12427b().mo13099J().mo13131b("Params already contained engagement", Long.valueOf(j2));
        }
        bundle.putLong("_et", j + j2);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: L0 */
    public final String mo12955L0() {
        byte[] bArr = new byte[16];
        mo12950F0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final void mo12956M(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (C2065x8.m6570a() && mo13112m().mo12474s(C2302r.f4474I0) && mo13112m().mo12474s(C2302r.f4472H0) && (obj instanceof Bundle[])) {
                bundle.putParcelableArray(str, (Bundle[]) obj);
            } else if (str != null) {
                mo12427b().mo13101L().mo13132c("Not putting event parameter. Invalid value type. name, type", mo13109j().mo12996y(str), obj != null ? obj.getClass().getSimpleName() : null);
            }
        }
    }

    /* renamed from: M0 */
    public final boolean mo12957M0() {
        try {
            mo12428c().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: N */
    public final void mo12958N(C1992sc scVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt(C7200r.f14712G, i);
        try {
            scVar.mo11948b(bundle);
        } catch (RemoteException e) {
            this.f4689a.mo12427b().mo13099J().mo13131b("Error returning int value to wrapper", e);
        }
    }

    /* renamed from: O */
    public final void mo12959O(C1992sc scVar, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong(C7200r.f14712G, j);
        try {
            scVar.mo11948b(bundle);
        } catch (RemoteException e) {
            this.f4689a.mo12427b().mo13099J().mo13131b("Error returning long value to wrapper", e);
        }
    }

    /* renamed from: P */
    public final void mo12960P(C1992sc scVar, Bundle bundle) {
        try {
            scVar.mo11948b(bundle);
        } catch (RemoteException e) {
            this.f4689a.mo12427b().mo13099J().mo13131b("Error returning bundle value to wrapper", e);
        }
    }

    /* renamed from: Q */
    public final void mo12961Q(C1992sc scVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString(C7200r.f14712G, str);
        try {
            scVar.mo11948b(bundle);
        } catch (RemoteException e) {
            this.f4689a.mo12427b().mo13099J().mo13131b("Error returning string value to wrapper", e);
        }
    }

    /* renamed from: R */
    public final void mo12962R(C1992sc scVar, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(C7200r.f14712G, arrayList);
        try {
            scVar.mo11948b(bundle);
        } catch (RemoteException e) {
            this.f4689a.mo12427b().mo13099J().mo13131b("Error returning bundle list to wrapper", e);
        }
    }

    /* renamed from: S */
    public final void mo12963S(C1992sc scVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(C7200r.f14712G, z);
        try {
            scVar.mo11948b(bundle);
        } catch (RemoteException e) {
            this.f4689a.mo12427b().mo13099J().mo13131b("Error returning boolean value to wrapper", e);
        }
    }

    /* renamed from: T */
    public final void mo12964T(C1992sc scVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray(C7200r.f14712G, bArr);
        try {
            scVar.mo11948b(bundle);
        } catch (RemoteException e) {
            this.f4689a.mo12427b().mo13099J().mo13131b("Error returning byte array to wrapper", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public final void mo12965U(String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        m7575r0(bundle, i);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", (long) i2);
        }
        this.f4689a.mo12414I();
        this.f4689a.mo12411F().mo12709S("auto", "_err", bundle);
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"ApplySharedPref"})
    /* renamed from: c0 */
    public final boolean mo12966c0(String str, double d) {
        try {
            SharedPreferences.Editor edit = mo12428c().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            edit.putString("deeplink", str);
            edit.putLong("timestamp", Double.doubleToRawLongBits(d));
            return edit.commit();
        } catch (Exception e) {
            mo12427b().mo13096F().mo13131b("Failed to persist Deferred Deep Link. exception", e);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public final boolean mo12967d0(String str, int i, String str2) {
        if (str2 == null) {
            mo12427b().mo13098H().mo13131b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        } else {
            mo12427b().mo13098H().mo13133d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public final boolean mo12968e0(String str, String str2) {
        if (str2 == null) {
            mo12427b().mo13098H().mo13131b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            mo12427b().mo13098H().mo13131b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                mo12427b().mo13098H().mo13132c("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    mo12427b().mo13098H().mo13132c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public final boolean mo12969f0(String str, String str2, int i, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i) {
                mo12427b().mo13101L().mo13133d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public final boolean mo12970g0(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            if (m7558J0(str)) {
                return true;
            }
            if (this.f4689a.mo12416K()) {
                mo12427b().mo13098H().mo13131b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C2361w3.m7696w(str));
            }
            return false;
        } else if (C1832ia.m5256a() && mo13112m().mo12474s(C2302r.f4532p0) && !TextUtils.isEmpty(str3)) {
            return true;
        } else {
            if (TextUtils.isEmpty(str2)) {
                if (this.f4689a.mo12416K()) {
                    mo12427b().mo13098H().mo13130a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
                }
                return false;
            } else if (m7558J0(str2)) {
                return true;
            } else {
                mo12427b().mo13098H().mo13131b("Invalid admob_app_id. Analytics disabled.", C2361w3.m7696w(str2));
                return false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public final boolean mo12971j0(String str, String[] strArr, String str2) {
        boolean z;
        if (str2 == null) {
            mo12427b().mo13098H().mo13131b("Name is required and can't be null. Type", str);
            return false;
        }
        C1609u.m4475k(str2);
        String[] strArr2 = f4592g;
        int length = strArr2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            } else if (str2.startsWith(strArr2[i])) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            mo12427b().mo13098H().mo13132c("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        } else if (strArr == null || !m7569i0(str2, strArr)) {
            return true;
        } else {
            mo12427b().mo13098H().mo13132c("Name is reserved. Type, name", str, str2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m0 */
    public final int mo12972m0(String str) {
        if (!mo12974s0("event", str)) {
            return 2;
        }
        if (!mo12971j0("event", C2112a6.f3943a, str)) {
            return 13;
        }
        return !mo12967d0("event", 40, str) ? 2 : 0;
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: n */
    public final void mo12763n() {
        mo12567h();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                mo12427b().mo13099J().mo13130a("Utils falling back to Random for random id");
            }
        }
        this.f4595d.set(nextLong);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n0 */
    public final int mo12973n0(String str, Object obj) {
        String str2;
        int i;
        if ("_ldl".equals(str)) {
            i = m7560K0(str);
            str2 = "user property referrer";
        } else {
            i = m7560K0(str);
            str2 = "user property";
        }
        return mo12969f0(str2, str, i, obj) ? 0 : 7;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final boolean mo12683r() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s0 */
    public final boolean mo12974s0(String str, String str2) {
        if (str2 == null) {
            mo12427b().mo13098H().mo13131b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            mo12427b().mo13098H().mo13131b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (Character.isLetter(codePointAt) || codePointAt == 95) {
                int length = str2.length();
                int charCount = Character.charCount(codePointAt);
                while (charCount < length) {
                    int codePointAt2 = str2.codePointAt(charCount);
                    if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                        charCount += Character.charCount(codePointAt2);
                    } else {
                        mo12427b().mo13098H().mo13132c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                        return false;
                    }
                }
                return true;
            }
            mo12427b().mo13098H().mo13132c("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
    }

    /* renamed from: t */
    public final int mo12975t(int i) {
        return C1520d.m4113h().mo11045j(mo12428c(), C1533g.f2900a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v0 */
    public final int mo12976v0(String str) {
        if (!mo12974s0("user property", str)) {
            return 6;
        }
        if (!mo12971j0("user property", C2136c6.f3997a, str)) {
            return 15;
        }
        return !mo12967d0("user property", 24, str) ? 6 : 0;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: w */
    public final long mo12977w(Context context, String str) {
        mo12567h();
        C1609u.m4475k(context);
        C1609u.m4471g(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest H0 = m7557H0();
        if (H0 == null) {
            mo12427b().mo13096F().mo13130a("Could not get MD5 instance");
            return -1;
        }
        if (packageManager != null) {
            try {
                if (!m7581x0(context, str)) {
                    PackageInfo e = C1620c.m4502a(context).mo11303e(mo12428c().getPackageName(), 64);
                    if (e.signatures != null && e.signatures.length > 0) {
                        return m7582y(H0.digest(e.signatures[0].toByteArray()));
                    }
                    mo12427b().mo13099J().mo13130a("Could not get signatures");
                    return -1;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                mo12427b().mo13096F().mo13131b("Package name not found", e2);
            }
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w0 */
    public final Object mo12978w0(String str, Object obj) {
        boolean equals = "_ldl".equals(str);
        int K0 = m7560K0(str);
        return equals ? m7553E(K0, obj, true, false) : m7553E(K0, obj, false, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final Bundle mo12979z(@NonNull Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str4 = uri.getQueryParameter("utm_campaign");
                str3 = uri.getQueryParameter("utm_source");
                str2 = uri.getQueryParameter("utm_medium");
                str = uri.getQueryParameter("gclid");
            } else {
                str4 = null;
                str3 = null;
                str2 = null;
                str = null;
            }
            if (TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("campaign", str4);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("source", str3);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("medium", str2);
            }
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("gclid", str);
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
            return bundle;
        } catch (UnsupportedOperationException e) {
            mo12427b().mo13099J().mo13131b("Install referrer url isn't a hierarchical URI", e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: z0 */
    public final boolean mo12980z0(String str) {
        mo12567h();
        if (C1620c.m4502a(mo12428c()).mo11299a(str) == 0) {
            return true;
        }
        mo12427b().mo13103N().mo13131b("Permission not granted", str);
        return false;
    }
}
