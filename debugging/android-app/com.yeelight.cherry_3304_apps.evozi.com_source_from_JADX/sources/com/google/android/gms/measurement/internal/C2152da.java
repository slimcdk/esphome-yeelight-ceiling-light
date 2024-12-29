package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.C1805h0;
import com.google.android.gms.internal.measurement.C1836j0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: com.google.android.gms.measurement.internal.da */
abstract class C2152da {

    /* renamed from: a */
    String f4071a;

    /* renamed from: b */
    int f4072b;

    /* renamed from: c */
    Boolean f4073c;

    /* renamed from: d */
    Boolean f4074d;

    /* renamed from: e */
    Long f4075e;

    /* renamed from: f */
    Long f4076f;

    C2152da(String str, int i) {
        this.f4071a = str;
        this.f4072b = i;
    }

    /* renamed from: b */
    static Boolean m6986b(double d, C1805h0 h0Var) {
        try {
            return m6992h(new BigDecimal(d), h0Var, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: c */
    static Boolean m6987c(long j, C1805h0 h0Var) {
        try {
            return m6992h(new BigDecimal(j), h0Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @VisibleForTesting
    /* renamed from: d */
    static Boolean m6988d(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* renamed from: e */
    static Boolean m6989e(String str, C1805h0 h0Var) {
        if (!C2290p9.m7348S(str)) {
            return null;
        }
        try {
            return m6992h(new BigDecimal(str), h0Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: f */
    private static Boolean m6990f(String str, C1836j0.C1838b bVar, boolean z, String str2, List<String> list, String str3, C2361w3 w3Var) {
        boolean startsWith;
        if (str == null) {
            return null;
        }
        if (bVar == C1836j0.C1838b.IN_LIST) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && bVar != C1836j0.C1838b.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (C2400z9.f4763a[bVar.ordinal()]) {
            case 1:
                try {
                    return Boolean.valueOf(Pattern.compile(str3, z ? 0 : 66).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (w3Var != null) {
                        w3Var.mo13099J().mo13131b("Invalid regular expression in REGEXP audience filter. expression", str3);
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
                startsWith = list.contains(str);
                break;
            default:
                return null;
        }
        return Boolean.valueOf(startsWith);
    }

    @VisibleForTesting
    /* renamed from: g */
    static Boolean m6991g(String str, C1836j0 j0Var, C2361w3 w3Var) {
        List<String> list;
        C1609u.m4475k(j0Var);
        if (str == null || !j0Var.mo11756y() || j0Var.mo11757z() == C1836j0.C1838b.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        if (j0Var.mo11757z() == C1836j0.C1838b.IN_LIST) {
            if (j0Var.mo11755G() == 0) {
                return null;
            }
        } else if (!j0Var.mo11750A()) {
            return null;
        }
        C1836j0.C1838b z = j0Var.mo11757z();
        boolean E = j0Var.mo11753E();
        String B = (E || z == C1836j0.C1838b.REGEXP || z == C1836j0.C1838b.IN_LIST) ? j0Var.mo11751B() : j0Var.mo11751B().toUpperCase(Locale.ENGLISH);
        if (j0Var.mo11755G() == 0) {
            list = null;
        } else {
            List<String> F = j0Var.mo11754F();
            if (!E) {
                ArrayList arrayList = new ArrayList(F.size());
                for (String upperCase : F) {
                    arrayList.add(upperCase.toUpperCase(Locale.ENGLISH));
                }
                F = Collections.unmodifiableList(arrayList);
            }
            list = F;
        }
        return m6990f(str, z, E, B, list, z == C1836j0.C1838b.REGEXP ? B : null, w3Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0085, code lost:
        if (r2 != null) goto L_0x0087;
     */
    @com.google.android.gms.common.util.VisibleForTesting
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Boolean m6992h(java.math.BigDecimal r9, com.google.android.gms.internal.measurement.C1805h0 r10, double r11) {
        /*
            com.google.android.gms.common.internal.C1609u.m4475k(r10)
            boolean r0 = r10.mo11692y()
            r1 = 0
            if (r0 == 0) goto L_0x0110
            com.google.android.gms.internal.measurement.h0$a r0 = r10.mo11693z()
            com.google.android.gms.internal.measurement.h0$a r2 = com.google.android.gms.internal.measurement.C1805h0.C1806a.UNKNOWN_COMPARISON_TYPE
            if (r0 != r2) goto L_0x0014
            goto L_0x0110
        L_0x0014:
            com.google.android.gms.internal.measurement.h0$a r0 = r10.mo11693z()
            com.google.android.gms.internal.measurement.h0$a r2 = com.google.android.gms.internal.measurement.C1805h0.C1806a.BETWEEN
            if (r0 != r2) goto L_0x0029
            boolean r0 = r10.mo11688F()
            if (r0 == 0) goto L_0x0028
            boolean r0 = r10.mo11690H()
            if (r0 != 0) goto L_0x0030
        L_0x0028:
            return r1
        L_0x0029:
            boolean r0 = r10.mo11686D()
            if (r0 != 0) goto L_0x0030
            return r1
        L_0x0030:
            com.google.android.gms.internal.measurement.h0$a r0 = r10.mo11693z()
            com.google.android.gms.internal.measurement.h0$a r2 = r10.mo11693z()
            com.google.android.gms.internal.measurement.h0$a r3 = com.google.android.gms.internal.measurement.C1805h0.C1806a.BETWEEN
            if (r2 != r3) goto L_0x0067
            java.lang.String r2 = r10.mo11689G()
            boolean r2 = com.google.android.gms.measurement.internal.C2290p9.m7348S(r2)
            if (r2 == 0) goto L_0x0066
            java.lang.String r2 = r10.mo11691J()
            boolean r2 = com.google.android.gms.measurement.internal.C2290p9.m7348S(r2)
            if (r2 != 0) goto L_0x0051
            goto L_0x0066
        L_0x0051:
            java.math.BigDecimal r2 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0066 }
            java.lang.String r3 = r10.mo11689G()     // Catch:{ NumberFormatException -> 0x0066 }
            r2.<init>(r3)     // Catch:{ NumberFormatException -> 0x0066 }
            java.math.BigDecimal r3 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0066 }
            java.lang.String r10 = r10.mo11691J()     // Catch:{ NumberFormatException -> 0x0066 }
            r3.<init>(r10)     // Catch:{ NumberFormatException -> 0x0066 }
            r10 = r2
            r2 = r1
            goto L_0x007d
        L_0x0066:
            return r1
        L_0x0067:
            java.lang.String r2 = r10.mo11687E()
            boolean r2 = com.google.android.gms.measurement.internal.C2290p9.m7348S(r2)
            if (r2 != 0) goto L_0x0072
            return r1
        L_0x0072:
            java.math.BigDecimal r2 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0110 }
            java.lang.String r10 = r10.mo11687E()     // Catch:{ NumberFormatException -> 0x0110 }
            r2.<init>(r10)     // Catch:{ NumberFormatException -> 0x0110 }
            r10 = r1
            r3 = r10
        L_0x007d:
            com.google.android.gms.internal.measurement.h0$a r4 = com.google.android.gms.internal.measurement.C1805h0.C1806a.BETWEEN
            if (r0 != r4) goto L_0x0085
            if (r10 == 0) goto L_0x0084
            goto L_0x0087
        L_0x0084:
            return r1
        L_0x0085:
            if (r2 == 0) goto L_0x0110
        L_0x0087:
            int[] r4 = com.google.android.gms.measurement.internal.C2400z9.f4764b
            int r0 = r0.ordinal()
            r0 = r4[r0]
            r4 = -1
            r5 = 0
            r6 = 1
            if (r0 == r6) goto L_0x0104
            r7 = 2
            if (r0 == r7) goto L_0x00f8
            r8 = 3
            if (r0 == r8) goto L_0x00b0
            r11 = 4
            if (r0 == r11) goto L_0x009e
            goto L_0x0110
        L_0x009e:
            int r10 = r9.compareTo(r10)
            if (r10 == r4) goto L_0x00ab
            int r9 = r9.compareTo(r3)
            if (r9 == r6) goto L_0x00ab
            r5 = 1
        L_0x00ab:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x00b0:
            r0 = 0
            int r10 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r10 == 0) goto L_0x00ec
            java.math.BigDecimal r10 = new java.math.BigDecimal
            r10.<init>(r11)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r7)
            java.math.BigDecimal r10 = r10.multiply(r0)
            java.math.BigDecimal r10 = r2.subtract(r10)
            int r10 = r9.compareTo(r10)
            if (r10 != r6) goto L_0x00e7
            java.math.BigDecimal r10 = new java.math.BigDecimal
            r10.<init>(r11)
            java.math.BigDecimal r11 = new java.math.BigDecimal
            r11.<init>(r7)
            java.math.BigDecimal r10 = r10.multiply(r11)
            java.math.BigDecimal r10 = r2.add(r10)
            int r9 = r9.compareTo(r10)
            if (r9 != r4) goto L_0x00e7
            r5 = 1
        L_0x00e7:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x00ec:
            int r9 = r9.compareTo(r2)
            if (r9 != 0) goto L_0x00f3
            r5 = 1
        L_0x00f3:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x00f8:
            int r9 = r9.compareTo(r2)
            if (r9 != r6) goto L_0x00ff
            r5 = 1
        L_0x00ff:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x0104:
            int r9 = r9.compareTo(r2)
            if (r9 != r4) goto L_0x010b
            r5 = 1
        L_0x010b:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x0110:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2152da.m6992h(java.math.BigDecimal, com.google.android.gms.internal.measurement.h0, double):java.lang.Boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract int mo12646a();

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract boolean mo12647i();

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public abstract boolean mo12648j();
}
