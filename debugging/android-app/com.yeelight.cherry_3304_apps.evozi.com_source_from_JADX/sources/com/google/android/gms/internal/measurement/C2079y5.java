package com.google.android.gms.internal.measurement;

import com.xiaomi.mistatistic.sdk.BaseService;
import java.util.List;
import java.util.Map;
import org.apache.commons.p271io.IOUtils;

/* renamed from: com.google.android.gms.internal.measurement.y5 */
final class C2079y5 {
    /* renamed from: a */
    static String m6604a(C2062x5 x5Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m6606c(x5Var, sb, 0);
        return sb.toString();
    }

    /* renamed from: b */
    private static final String m6605b(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01f1, code lost:
        if (((java.lang.Boolean) r6).booleanValue() == false) goto L_0x01f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0203, code lost:
        if (((java.lang.Integer) r6).intValue() == 0) goto L_0x01f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0214, code lost:
        if (((java.lang.Float) r6).floatValue() == 0.0f) goto L_0x01f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0226, code lost:
        if (((java.lang.Double) r6).doubleValue() == 0.0d) goto L_0x01f3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x025a  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m6606c(com.google.android.gms.internal.measurement.C2062x5 r13, java.lang.StringBuilder r14, int r15) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.TreeSet r2 = new java.util.TreeSet
            r2.<init>()
            java.lang.Class r3 = r13.getClass()
            java.lang.reflect.Method[] r3 = r3.getDeclaredMethods()
            int r4 = r3.length
            r5 = 0
            r6 = 0
        L_0x001a:
            java.lang.String r7 = "get"
            if (r6 >= r4) goto L_0x0049
            r8 = r3[r6]
            java.lang.String r9 = r8.getName()
            r1.put(r9, r8)
            java.lang.Class[] r9 = r8.getParameterTypes()
            int r9 = r9.length
            if (r9 != 0) goto L_0x0046
            java.lang.String r9 = r8.getName()
            r0.put(r9, r8)
            java.lang.String r9 = r8.getName()
            boolean r7 = r9.startsWith(r7)
            if (r7 == 0) goto L_0x0046
            java.lang.String r7 = r8.getName()
            r2.add(r7)
        L_0x0046:
            int r6 = r6 + 1
            goto L_0x001a
        L_0x0049:
            java.util.Iterator r2 = r2.iterator()
        L_0x004d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0273
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = r3.startsWith(r7)
            r6 = 3
            if (r4 == 0) goto L_0x0065
            java.lang.String r4 = r3.substring(r6)
            goto L_0x0066
        L_0x0065:
            r4 = r3
        L_0x0066:
            java.lang.String r8 = "List"
            boolean r9 = r4.endsWith(r8)
            r10 = 1
            if (r9 == 0) goto L_0x00ca
            java.lang.String r9 = "OrBuilderList"
            boolean r9 = r4.endsWith(r9)
            if (r9 != 0) goto L_0x00ca
            boolean r8 = r4.equals(r8)
            if (r8 != 0) goto L_0x00ca
            java.lang.String r8 = r4.substring(r5, r10)
            java.lang.String r8 = r8.toLowerCase()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r9 = r4.length()
            int r9 = r9 + -4
            java.lang.String r9 = r4.substring(r10, r9)
            java.lang.String r9 = java.lang.String.valueOf(r9)
            int r11 = r9.length()
            if (r11 == 0) goto L_0x00a2
            java.lang.String r8 = r8.concat(r9)
            goto L_0x00a8
        L_0x00a2:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r8)
            r8 = r9
        L_0x00a8:
            java.lang.Object r9 = r0.get(r3)
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            if (r9 == 0) goto L_0x00ca
            java.lang.Class r11 = r9.getReturnType()
            java.lang.Class<java.util.List> r12 = java.util.List.class
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x00ca
            java.lang.String r3 = m6605b(r8)
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C1889m4.m5466q(r9, r13, r4)
            m6607d(r14, r15, r3, r4)
            goto L_0x004d
        L_0x00ca:
            java.lang.String r8 = "Map"
            boolean r9 = r4.endsWith(r8)
            if (r9 == 0) goto L_0x0136
            boolean r8 = r4.equals(r8)
            if (r8 != 0) goto L_0x0136
            java.lang.String r8 = r4.substring(r5, r10)
            java.lang.String r8 = r8.toLowerCase()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r9 = r4.length()
            int r9 = r9 - r6
            java.lang.String r6 = r4.substring(r10, r9)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r9 = r6.length()
            if (r9 == 0) goto L_0x00fc
            java.lang.String r6 = r8.concat(r6)
            goto L_0x0101
        L_0x00fc:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r8)
        L_0x0101:
            java.lang.Object r3 = r0.get(r3)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 == 0) goto L_0x0136
            java.lang.Class r8 = r3.getReturnType()
            java.lang.Class<java.util.Map> r9 = java.util.Map.class
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0136
            java.lang.Class<java.lang.Deprecated> r8 = java.lang.Deprecated.class
            boolean r8 = r3.isAnnotationPresent(r8)
            if (r8 != 0) goto L_0x0136
            int r8 = r3.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isPublic(r8)
            if (r8 == 0) goto L_0x0136
            java.lang.String r4 = m6605b(r6)
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C1889m4.m5466q(r3, r13, r6)
            m6607d(r14, r15, r4, r3)
            goto L_0x004d
        L_0x0136:
            java.lang.String r3 = "set"
            java.lang.String r6 = java.lang.String.valueOf(r4)
            int r8 = r6.length()
            if (r8 == 0) goto L_0x0147
            java.lang.String r3 = r3.concat(r6)
            goto L_0x014d
        L_0x0147:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r3)
            r3 = r6
        L_0x014d:
            java.lang.Object r3 = r1.get(r3)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 == 0) goto L_0x004d
            java.lang.String r3 = "Bytes"
            boolean r3 = r4.endsWith(r3)
            if (r3 == 0) goto L_0x0181
            int r3 = r4.length()
            int r3 = r3 + -5
            java.lang.String r3 = r4.substring(r5, r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r6 = r3.length()
            if (r6 == 0) goto L_0x0176
            java.lang.String r3 = r7.concat(r3)
            goto L_0x017b
        L_0x0176:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r7)
        L_0x017b:
            boolean r3 = r0.containsKey(r3)
            if (r3 != 0) goto L_0x004d
        L_0x0181:
            java.lang.String r3 = r4.substring(r5, r10)
            java.lang.String r3 = r3.toLowerCase()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r6 = r4.substring(r10)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r8 = r6.length()
            if (r8 == 0) goto L_0x01a0
            java.lang.String r3 = r3.concat(r6)
            goto L_0x01a6
        L_0x01a0:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r3)
            r3 = r6
        L_0x01a6:
            java.lang.String r6 = java.lang.String.valueOf(r4)
            int r8 = r6.length()
            if (r8 == 0) goto L_0x01b5
            java.lang.String r6 = r7.concat(r6)
            goto L_0x01ba
        L_0x01b5:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r7)
        L_0x01ba:
            java.lang.Object r6 = r0.get(r6)
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            java.lang.String r8 = "has"
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r9 = r4.length()
            if (r9 == 0) goto L_0x01d1
            java.lang.String r4 = r8.concat(r4)
            goto L_0x01d6
        L_0x01d1:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r8)
        L_0x01d6:
            java.lang.Object r4 = r0.get(r4)
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            if (r6 == 0) goto L_0x004d
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Object r6 = com.google.android.gms.internal.measurement.C1889m4.m5466q(r6, r13, r8)
            if (r4 != 0) goto L_0x025c
            boolean r4 = r6 instanceof java.lang.Boolean
            if (r4 == 0) goto L_0x01f8
            r4 = r6
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x01f6
        L_0x01f3:
            r4 = 1
            goto L_0x0257
        L_0x01f6:
            r4 = 0
            goto L_0x0257
        L_0x01f8:
            boolean r4 = r6 instanceof java.lang.Integer
            if (r4 == 0) goto L_0x0206
            r4 = r6
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 != 0) goto L_0x01f6
            goto L_0x01f3
        L_0x0206:
            boolean r4 = r6 instanceof java.lang.Float
            if (r4 == 0) goto L_0x0217
            r4 = r6
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            r8 = 0
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x01f6
            goto L_0x01f3
        L_0x0217:
            boolean r4 = r6 instanceof java.lang.Double
            if (r4 == 0) goto L_0x0229
            r4 = r6
            java.lang.Double r4 = (java.lang.Double) r4
            double r8 = r4.doubleValue()
            r11 = 0
            int r4 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r4 != 0) goto L_0x01f6
            goto L_0x01f3
        L_0x0229:
            boolean r4 = r6 instanceof java.lang.String
            if (r4 == 0) goto L_0x0234
            java.lang.String r4 = ""
        L_0x022f:
            boolean r4 = r6.equals(r4)
            goto L_0x0257
        L_0x0234:
            boolean r4 = r6 instanceof com.google.android.gms.internal.measurement.C1779f3
            if (r4 == 0) goto L_0x023b
            com.google.android.gms.internal.measurement.f3 r4 = com.google.android.gms.internal.measurement.C1779f3.f3341b
            goto L_0x022f
        L_0x023b:
            boolean r4 = r6 instanceof com.google.android.gms.internal.measurement.C2062x5
            if (r4 == 0) goto L_0x0249
            r4 = r6
            com.google.android.gms.internal.measurement.x5 r4 = (com.google.android.gms.internal.measurement.C2062x5) r4
            com.google.android.gms.internal.measurement.x5 r4 = r4.mo11841d()
            if (r6 != r4) goto L_0x01f6
            goto L_0x01f3
        L_0x0249:
            boolean r4 = r6 instanceof java.lang.Enum
            if (r4 == 0) goto L_0x01f6
            r4 = r6
            java.lang.Enum r4 = (java.lang.Enum) r4
            int r4 = r4.ordinal()
            if (r4 != 0) goto L_0x01f6
            goto L_0x01f3
        L_0x0257:
            if (r4 != 0) goto L_0x025a
            goto L_0x0268
        L_0x025a:
            r10 = 0
            goto L_0x0268
        L_0x025c:
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C1889m4.m5466q(r4, r13, r8)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r10 = r4.booleanValue()
        L_0x0268:
            if (r10 == 0) goto L_0x004d
            java.lang.String r3 = m6605b(r3)
            m6607d(r14, r15, r3, r6)
            goto L_0x004d
        L_0x0273:
            boolean r0 = r13 instanceof com.google.android.gms.internal.measurement.C1889m4.C1893d
            if (r0 == 0) goto L_0x0299
            r0 = r13
            com.google.android.gms.internal.measurement.m4$d r0 = (com.google.android.gms.internal.measurement.C1889m4.C1893d) r0
            com.google.android.gms.internal.measurement.f4<com.google.android.gms.internal.measurement.m4$c> r0 = r0.zzc
            java.util.Iterator r0 = r0.mo11657p()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L_0x0287
            goto L_0x0299
        L_0x0287:
            java.lang.Object r13 = r0.next()
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            java.lang.Object r13 = r13.getKey()
            com.google.android.gms.internal.measurement.m4$c r13 = (com.google.android.gms.internal.measurement.C1889m4.C1892c) r13
            java.lang.NoSuchMethodError r13 = new java.lang.NoSuchMethodError
            r13.<init>()
            throw r13
        L_0x0299:
            com.google.android.gms.internal.measurement.m4 r13 = (com.google.android.gms.internal.measurement.C1889m4) r13
            com.google.android.gms.internal.measurement.h7 r13 = r13.zzb
            if (r13 == 0) goto L_0x02a2
            r13.mo11718f(r14, r15)
        L_0x02a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C2079y5.m6606c(com.google.android.gms.internal.measurement.x5, java.lang.StringBuilder, int):void");
    }

    /* renamed from: d */
    static final void m6607d(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object d : (List) obj) {
                m6607d(sb, i, str, d);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry d2 : ((Map) obj).entrySet()) {
                m6607d(sb, i, str, d2);
            }
        } else {
            sb.append(10);
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(C1707a7.m4717a(C1779f3.m5073g((String) obj)));
                sb.append('\"');
            } else if (obj instanceof C1779f3) {
                sb.append(": \"");
                sb.append(C1707a7.m4717a((C1779f3) obj));
                sb.append('\"');
            } else if (obj instanceof C1889m4) {
                sb.append(" {");
                m6606c((C1889m4) obj, sb, i + 2);
                sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i4 = i + 2;
                m6607d(sb, i4, BaseService.KEY, entry.getKey());
                m6607d(sb, i4, "value", entry.getValue());
                sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }
}
