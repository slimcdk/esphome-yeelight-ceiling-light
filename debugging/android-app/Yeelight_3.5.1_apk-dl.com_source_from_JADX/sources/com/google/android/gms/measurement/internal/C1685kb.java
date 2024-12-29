package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.C1073e3;
import com.google.android.gms.internal.measurement.C1185l3;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: com.google.android.gms.measurement.internal.kb */
abstract class C1685kb {

    /* renamed from: a */
    final String f2243a;

    /* renamed from: b */
    final int f2244b;

    /* renamed from: c */
    Boolean f2245c;

    /* renamed from: d */
    Boolean f2246d;

    /* renamed from: e */
    Long f2247e;

    /* renamed from: f */
    Long f2248f;

    C1685kb(String str, int i) {
        this.f2243a = str;
        this.f2244b = i;
    }

    /* renamed from: d */
    private static Boolean m4405d(String str, int i, boolean z, String str2, List list, String str3, C1574c4 c4Var) {
        boolean startsWith;
        if (i == 7) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && i != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i - 1) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, true != z ? 66 : 0).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (c4Var != null) {
                        c4Var.mo14040w().mo14694b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                startsWith = str.startsWith(str2);
                break;
            case 3:
                startsWith = str.endsWith(str2);
                break;
            case 4:
                startsWith = str.contains(str2);
                break;
            case 5:
                startsWith = str.equals(str2);
                break;
            case 6:
                if (list != null) {
                    startsWith = list.contains(str);
                    break;
                } else {
                    return null;
                }
            default:
                return null;
        }
        return Boolean.valueOf(startsWith);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x009f, code lost:
        if (r8.compareTo(r5) <= 0) goto L_0x00a3;
     */
    @com.google.android.gms.common.util.VisibleForTesting
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.Boolean m4406e(java.math.BigDecimal r8, com.google.android.gms.internal.measurement.C1073e3 r9, double r10) {
        /*
            com.google.android.gms.common.internal.C0917i.m1419j(r9)
            boolean r0 = r9.mo12733E()
            r1 = 0
            if (r0 == 0) goto L_0x0109
            int r0 = r9.mo12738J()
            r2 = 1
            if (r0 != r2) goto L_0x0013
            goto L_0x0109
        L_0x0013:
            int r0 = r9.mo12738J()
            r3 = 5
            if (r0 != r3) goto L_0x0028
            boolean r0 = r9.mo12737I()
            if (r0 == 0) goto L_0x0027
            boolean r0 = r9.mo12736H()
            if (r0 == 0) goto L_0x0027
            goto L_0x002f
        L_0x0027:
            return r1
        L_0x0028:
            boolean r0 = r9.mo12734F()
            if (r0 != 0) goto L_0x002f
            return r1
        L_0x002f:
            int r0 = r9.mo12738J()
            int r4 = r9.mo12738J()
            if (r4 != r3) goto L_0x0064
            java.lang.String r4 = r9.mo12731C()
            boolean r4 = com.google.android.gms.measurement.internal.C1794ta.m4745N(r4)
            if (r4 == 0) goto L_0x0063
            java.lang.String r4 = r9.mo12730A()
            boolean r4 = com.google.android.gms.measurement.internal.C1794ta.m4745N(r4)
            if (r4 != 0) goto L_0x004e
            goto L_0x0063
        L_0x004e:
            java.math.BigDecimal r4 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0063 }
            java.lang.String r5 = r9.mo12731C()     // Catch:{ NumberFormatException -> 0x0063 }
            r4.<init>(r5)     // Catch:{ NumberFormatException -> 0x0063 }
            java.math.BigDecimal r5 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0063 }
            java.lang.String r9 = r9.mo12730A()     // Catch:{ NumberFormatException -> 0x0063 }
            r5.<init>(r9)     // Catch:{ NumberFormatException -> 0x0063 }
            r9 = r4
            r4 = r1
            goto L_0x007a
        L_0x0063:
            return r1
        L_0x0064:
            java.lang.String r4 = r9.mo12739z()
            boolean r4 = com.google.android.gms.measurement.internal.C1794ta.m4745N(r4)
            if (r4 != 0) goto L_0x006f
            return r1
        L_0x006f:
            java.math.BigDecimal r4 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0109 }
            java.lang.String r9 = r9.mo12739z()     // Catch:{ NumberFormatException -> 0x0109 }
            r4.<init>(r9)     // Catch:{ NumberFormatException -> 0x0109 }
            r9 = r1
            r5 = r9
        L_0x007a:
            if (r0 != r3) goto L_0x007f
            if (r9 == 0) goto L_0x00fb
            goto L_0x0083
        L_0x007f:
            if (r4 != 0) goto L_0x0083
            goto L_0x00fb
        L_0x0083:
            int r0 = r0 + -1
            r3 = 0
            if (r0 == r2) goto L_0x00f9
            r6 = 2
            if (r0 == r6) goto L_0x00e9
            r7 = 3
            if (r0 == r7) goto L_0x00a8
            r10 = 4
            if (r0 == r10) goto L_0x0093
            goto L_0x00fb
        L_0x0093:
            if (r9 == 0) goto L_0x00fb
            int r9 = r8.compareTo(r9)
            if (r9 < 0) goto L_0x00a2
            int r8 = r8.compareTo(r5)
            if (r8 > 0) goto L_0x00a2
            goto L_0x00a3
        L_0x00a2:
            r2 = 0
        L_0x00a3:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            goto L_0x00fb
        L_0x00a8:
            if (r4 != 0) goto L_0x00ab
            goto L_0x00fb
        L_0x00ab:
            r0 = 0
            int r9 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r9 == 0) goto L_0x00e2
            java.math.BigDecimal r9 = new java.math.BigDecimal
            r9.<init>(r10)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r6)
            java.math.BigDecimal r9 = r9.multiply(r0)
            java.math.BigDecimal r9 = r4.subtract(r9)
            int r9 = r8.compareTo(r9)
            if (r9 <= 0) goto L_0x00a2
            java.math.BigDecimal r9 = new java.math.BigDecimal
            r9.<init>(r10)
            java.math.BigDecimal r10 = new java.math.BigDecimal
            r10.<init>(r6)
            java.math.BigDecimal r9 = r9.multiply(r10)
            java.math.BigDecimal r9 = r4.add(r9)
            int r8 = r8.compareTo(r9)
            if (r8 >= 0) goto L_0x00a2
            goto L_0x00a3
        L_0x00e2:
            int r8 = r8.compareTo(r4)
            if (r8 != 0) goto L_0x00a2
            goto L_0x00a3
        L_0x00e9:
            if (r4 != 0) goto L_0x00ec
            goto L_0x00fb
        L_0x00ec:
            int r8 = r8.compareTo(r4)
            if (r8 <= 0) goto L_0x00f3
            goto L_0x00f4
        L_0x00f3:
            r2 = 0
        L_0x00f4:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        L_0x00f9:
            if (r4 != 0) goto L_0x00fc
        L_0x00fb:
            return r1
        L_0x00fc:
            int r8 = r8.compareTo(r4)
            if (r8 >= 0) goto L_0x0103
            goto L_0x0104
        L_0x0103:
            r2 = 0
        L_0x0104:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        L_0x0109:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1685kb.m4406e(java.math.BigDecimal, com.google.android.gms.internal.measurement.e3, double):java.lang.Boolean");
    }

    @VisibleForTesting
    /* renamed from: f */
    static Boolean m4407f(String str, C1185l3 l3Var, C1574c4 c4Var) {
        List list;
        C0917i.m1419j(l3Var);
        if (str == null || !l3Var.mo12949G() || l3Var.mo12950H() == 1) {
            return null;
        }
        if (l3Var.mo12950H() == 7) {
            if (l3Var.mo12951x() == 0) {
                return null;
            }
        } else if (!l3Var.mo12948F()) {
            return null;
        }
        int H = l3Var.mo12950H();
        boolean D = l3Var.mo12946D();
        String A = (D || H == 2 || H == 7) ? l3Var.mo12944A() : l3Var.mo12944A().toUpperCase(Locale.ENGLISH);
        if (l3Var.mo12951x() == 0) {
            list = null;
        } else {
            List<String> C = l3Var.mo12945C();
            if (!D) {
                ArrayList arrayList = new ArrayList(C.size());
                for (String upperCase : C) {
                    arrayList.add(upperCase.toUpperCase(Locale.ENGLISH));
                }
                C = Collections.unmodifiableList(arrayList);
            }
            list = C;
        }
        return m4405d(str, H, D, A, list, H == 2 ? A : null, c4Var);
    }

    /* renamed from: g */
    static Boolean m4408g(double d, C1073e3 e3Var) {
        try {
            return m4406e(new BigDecimal(d), e3Var, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: h */
    static Boolean m4409h(long j, C1073e3 e3Var) {
        try {
            return m4406e(new BigDecimal(j), e3Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: i */
    static Boolean m4410i(String str, C1073e3 e3Var) {
        if (!C1794ta.m4745N(str)) {
            return null;
        }
        try {
            return m4406e(new BigDecimal(str), e3Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @VisibleForTesting
    /* renamed from: j */
    static Boolean m4411j(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract int mo14292a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract boolean mo14293b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract boolean mo14294c();
}
