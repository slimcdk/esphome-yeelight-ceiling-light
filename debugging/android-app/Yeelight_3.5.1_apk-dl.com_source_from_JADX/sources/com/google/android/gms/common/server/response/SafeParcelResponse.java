package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.VisibleForTesting;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p014c0.C0614c;
import p014c0.C0622k;
import p014c0.C0623l;
import p113x.C3897a;

@KeepForSdk
@SafeParcelable.Class(creator = "SafeParcelResponseCreator")
@VisibleForTesting
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new C0955e();
    @SafeParcelable.VersionField(getter = "getVersionCode", mo12321id = 1)

    /* renamed from: a */
    private final int f1138a;
    @SafeParcelable.Field(getter = "getParcel", mo12312id = 2)

    /* renamed from: b */
    private final Parcel f1139b;

    /* renamed from: c */
    private final int f1140c = 2;
    @SafeParcelable.Field(getter = "getFieldMappingDictionary", mo12312id = 3)

    /* renamed from: d */
    private final zan f1141d;
    @Nullable

    /* renamed from: e */
    private final String f1142e;

    /* renamed from: f */
    private int f1143f;

    /* renamed from: g */
    private int f1144g;

    @SafeParcelable.Constructor
    SafeParcelResponse(@SafeParcelable.Param(mo12315id = 1) int i, @SafeParcelable.Param(mo12315id = 2) Parcel parcel, @SafeParcelable.Param(mo12315id = 3) zan zan) {
        this.f1138a = i;
        this.f1139b = (Parcel) C0917i.m1419j(parcel);
        this.f1141d = zan;
        this.f1142e = zan == null ? null : zan.mo12412V();
        this.f1143f = 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0107, code lost:
        r3 = com.google.android.gms.common.server.response.FastJsonResponse.m1544f(r5, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x010b, code lost:
        m1564k(r11, r5, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0214, code lost:
        r11.append(r3);
        r11.append("\"");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0249, code lost:
        r11.append(r3);
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m1562i(java.lang.StringBuilder r11, java.util.Map r12, android.os.Parcel r13) {
        /*
            r10 = this;
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            java.util.Set r12 = r12.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L_0x000d:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x0027
            java.lang.Object r1 = r12.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            com.google.android.gms.common.server.response.FastJsonResponse$Field r2 = (com.google.android.gms.common.server.response.FastJsonResponse.Field) r2
            int r2 = r2.mo12386V()
            r0.put(r2, r1)
            goto L_0x000d
        L_0x0027:
            r12 = 123(0x7b, float:1.72E-43)
            r11.append(r12)
            int r12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m1462J(r13)
            r1 = 0
            r2 = 1
            r3 = 0
        L_0x0033:
            int r4 = r13.dataPosition()
            if (r4 >= r12) goto L_0x0257
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m1455C(r13)
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m1485u(r4)
            java.lang.Object r5 = r0.get(r5)
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            if (r5 == 0) goto L_0x0033
            java.lang.String r6 = ","
            if (r3 == 0) goto L_0x0050
            r11.append(r6)
        L_0x0050:
            java.lang.Object r3 = r5.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r5 = r5.getValue()
            com.google.android.gms.common.server.response.FastJsonResponse$Field r5 = (com.google.android.gms.common.server.response.FastJsonResponse.Field) r5
            java.lang.String r7 = "\""
            r11.append(r7)
            r11.append(r3)
            java.lang.String r3 = "\":"
            r11.append(r3)
            boolean r3 = r5.mo12392k0()
            if (r3 == 0) goto L_0x0111
            int r3 = r5.f1130d
            switch(r3) {
                case 0: goto L_0x00ff;
                case 1: goto L_0x00fa;
                case 2: goto L_0x00f1;
                case 3: goto L_0x00e8;
                case 4: goto L_0x00df;
                case 5: goto L_0x00da;
                case 6: goto L_0x00d1;
                case 7: goto L_0x00cc;
                case 8: goto L_0x00c3;
                case 9: goto L_0x00c3;
                case 10: goto L_0x0093;
                case 11: goto L_0x008b;
                default: goto L_0x0074;
            }
        L_0x0074:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Unknown field out type = "
            r12.append(r13)
            r12.append(r3)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x008b:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Method does not accept concrete type."
            r11.<init>(r12)
            throw r11
        L_0x0093:
            android.os.Bundle r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m1470f(r13, r4)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Set r6 = r3.keySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x00a4:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00be
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = r3.getString(r7)
            java.lang.Object r8 = com.google.android.gms.common.internal.C0917i.m1419j(r8)
            java.lang.String r8 = (java.lang.String) r8
            r4.put(r7, r8)
            goto L_0x00a4
        L_0x00be:
            java.lang.Object r3 = com.google.android.gms.common.server.response.FastJsonResponse.m1544f(r5, r4)
            goto L_0x010b
        L_0x00c3:
            byte[] r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m1471g(r13, r4)
            java.lang.Object r3 = com.google.android.gms.common.server.response.FastJsonResponse.m1544f(r5, r3)
            goto L_0x010b
        L_0x00cc:
            java.lang.String r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m1479o(r13, r4)
            goto L_0x0107
        L_0x00d1:
            boolean r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m1486v(r13, r4)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            goto L_0x0107
        L_0x00da:
            java.math.BigDecimal r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m1465a(r13, r4)
            goto L_0x0107
        L_0x00df:
            double r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m1489y(r13, r4)
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            goto L_0x0107
        L_0x00e8:
            float r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m1453A(r13, r4)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            goto L_0x0107
        L_0x00f1:
            long r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m1458F(r13, r4)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L_0x0107
        L_0x00fa:
            java.math.BigInteger r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m1467c(r13, r4)
            goto L_0x0107
        L_0x00ff:
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m1457E(r13, r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x0107:
            java.lang.Object r3 = com.google.android.gms.common.server.response.FastJsonResponse.m1544f(r5, r3)
        L_0x010b:
            m1564k(r11, r5, r3)
        L_0x010e:
            r3 = 1
            goto L_0x0033
        L_0x0111:
            boolean r3 = r5.f1131e
            if (r3 == 0) goto L_0x0193
            java.lang.String r3 = "["
            r11.append(r3)
            int r3 = r5.f1130d
            switch(r3) {
                case 0: goto L_0x0185;
                case 1: goto L_0x017d;
                case 2: goto L_0x0175;
                case 3: goto L_0x016d;
                case 4: goto L_0x0165;
                case 5: goto L_0x015d;
                case 6: goto L_0x0155;
                case 7: goto L_0x014d;
                case 8: goto L_0x0145;
                case 9: goto L_0x0145;
                case 10: goto L_0x0145;
                case 11: goto L_0x0127;
                default: goto L_0x011f;
            }
        L_0x011f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Unknown field type out."
            r11.<init>(r12)
            throw r11
        L_0x0127:
            android.os.Parcel[] r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m1477m(r13, r4)
            int r4 = r3.length
            r7 = 0
        L_0x012d:
            if (r7 >= r4) goto L_0x018c
            if (r7 <= 0) goto L_0x0134
            r11.append(r6)
        L_0x0134:
            r8 = r3[r7]
            r8.setDataPosition(r1)
            java.util.Map r8 = r5.mo12390g0()
            r9 = r3[r7]
            r10.m1562i(r11, r8, r9)
            int r7 = r7 + 1
            goto L_0x012d
        L_0x0145:
            java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException
            java.lang.String r12 = "List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported"
            r11.<init>(r12)
            throw r11
        L_0x014d:
            java.lang.String[] r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m1480p(r13, r4)
            p014c0.C0613b.m196j(r11, r3)
            goto L_0x018c
        L_0x0155:
            boolean[] r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m1469e(r13, r4)
            p014c0.C0613b.m195i(r11, r3)
            goto L_0x018c
        L_0x015d:
            java.math.BigDecimal[] r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m1466b(r13, r4)
            p014c0.C0613b.m194h(r11, r3)
            goto L_0x018c
        L_0x0165:
            double[] r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m1472h(r13, r4)
            p014c0.C0613b.m190d(r11, r3)
            goto L_0x018c
        L_0x016d:
            float[] r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m1473i(r13, r4)
            p014c0.C0613b.m191e(r11, r3)
            goto L_0x018c
        L_0x0175:
            long[] r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m1475k(r13, r4)
            p014c0.C0613b.m193g(r11, r3)
            goto L_0x018c
        L_0x017d:
            java.math.BigInteger[] r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m1468d(r13, r4)
            p014c0.C0613b.m194h(r11, r3)
            goto L_0x018c
        L_0x0185:
            int[] r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m1474j(r13, r4)
            p014c0.C0613b.m192f(r11, r3)
        L_0x018c:
            java.lang.String r3 = "]"
        L_0x018e:
            r11.append(r3)
            goto L_0x010e
        L_0x0193:
            int r3 = r5.f1130d
            switch(r3) {
                case 0: goto L_0x024e;
                case 1: goto L_0x0245;
                case 2: goto L_0x023c;
                case 3: goto L_0x0233;
                case 4: goto L_0x022a;
                case 5: goto L_0x0225;
                case 6: goto L_0x021c;
                case 7: goto L_0x0209;
                case 8: goto L_0x01fd;
                case 9: goto L_0x01f1;
                case 10: goto L_0x01b0;
                case 11: goto L_0x01a0;
                default: goto L_0x0198;
            }
        L_0x0198:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Unknown field type out"
            r11.<init>(r12)
            throw r11
        L_0x01a0:
            android.os.Parcel r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m1476l(r13, r4)
            r3.setDataPosition(r1)
            java.util.Map r4 = r5.mo12390g0()
            r10.m1562i(r11, r4, r3)
            goto L_0x010e
        L_0x01b0:
            android.os.Bundle r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m1470f(r13, r4)
            java.util.Set r4 = r3.keySet()
            java.lang.String r5 = "{"
            r11.append(r5)
            java.util.Iterator r4 = r4.iterator()
            r5 = 1
        L_0x01c2:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x01ee
            java.lang.Object r8 = r4.next()
            java.lang.String r8 = (java.lang.String) r8
            if (r5 != 0) goto L_0x01d3
            r11.append(r6)
        L_0x01d3:
            r11.append(r7)
            r11.append(r8)
            java.lang.String r5 = "\":\""
            r11.append(r5)
            java.lang.String r5 = r3.getString(r8)
            java.lang.String r5 = p014c0.C0622k.m220a(r5)
            r11.append(r5)
            r11.append(r7)
            r5 = 0
            goto L_0x01c2
        L_0x01ee:
            java.lang.String r3 = "}"
            goto L_0x018e
        L_0x01f1:
            byte[] r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m1471g(r13, r4)
            r11.append(r7)
            java.lang.String r3 = p014c0.C0614c.m198b(r3)
            goto L_0x0214
        L_0x01fd:
            byte[] r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m1471g(r13, r4)
            r11.append(r7)
            java.lang.String r3 = p014c0.C0614c.m197a(r3)
            goto L_0x0214
        L_0x0209:
            java.lang.String r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m1479o(r13, r4)
            r11.append(r7)
            java.lang.String r3 = p014c0.C0622k.m220a(r3)
        L_0x0214:
            r11.append(r3)
            r11.append(r7)
            goto L_0x010e
        L_0x021c:
            boolean r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m1486v(r13, r4)
            r11.append(r3)
            goto L_0x010e
        L_0x0225:
            java.math.BigDecimal r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m1465a(r13, r4)
            goto L_0x0249
        L_0x022a:
            double r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m1489y(r13, r4)
            r11.append(r3)
            goto L_0x010e
        L_0x0233:
            float r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m1453A(r13, r4)
            r11.append(r3)
            goto L_0x010e
        L_0x023c:
            long r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m1458F(r13, r4)
            r11.append(r3)
            goto L_0x010e
        L_0x0245:
            java.math.BigInteger r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m1467c(r13, r4)
        L_0x0249:
            r11.append(r3)
            goto L_0x010e
        L_0x024e:
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m1457E(r13, r4)
            r11.append(r3)
            goto L_0x010e
        L_0x0257:
            int r0 = r13.dataPosition()
            if (r0 != r12) goto L_0x0263
            r12 = 125(0x7d, float:1.75E-43)
            r11.append(r12)
            return
        L_0x0263:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException r11 = new com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Overread allowed size end="
            r0.append(r1)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r11.<init>(r12, r13)
            goto L_0x027b
        L_0x027a:
            throw r11
        L_0x027b:
            goto L_0x027a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.SafeParcelResponse.m1562i(java.lang.StringBuilder, java.util.Map, android.os.Parcel):void");
    }

    /* renamed from: j */
    private static final void m1563j(StringBuilder sb, int i, @Nullable Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                sb.append(C0622k.m220a(C0917i.m1419j(obj).toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                sb.append(C0614c.m197a((byte[]) obj));
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                sb.append(C0614c.m198b((byte[]) obj));
                sb.append("\"");
                return;
            case 10:
                C0623l.m221a(sb, (HashMap) C0917i.m1419j(obj));
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException("Unknown type = " + i);
        }
    }

    /* renamed from: k */
    private static final void m1564k(StringBuilder sb, FastJsonResponse.Field field, Object obj) {
        if (field.f1129c) {
            ArrayList arrayList = (ArrayList) obj;
            sb.append("[");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (i != 0) {
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                m1563j(sb, field.f1128b, arrayList.get(i));
            }
            sb.append("]");
            return;
        }
        m1563j(sb, field.f1128b, obj);
    }

    @Nullable
    /* renamed from: a */
    public final Map<String, FastJsonResponse.Field<?, ?>> mo12380a() {
        zan zan = this.f1141d;
        if (zan == null) {
            return null;
        }
        return zan.mo12413W((String) C0917i.m1419j(this.f1142e));
    }

    @NonNull
    /* renamed from: c */
    public final Object mo12382c(@NonNull String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    /* renamed from: e */
    public final boolean mo12384e(@NonNull String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @NonNull
    /* renamed from: h */
    public final Parcel mo12398h() {
        int i = this.f1143f;
        if (i != 0) {
            if (i == 1) {
                C3897a.m11106b(this.f1139b, this.f1144g);
            }
            return this.f1139b;
        }
        int a = C3897a.m11105a(this.f1139b);
        this.f1144g = a;
        C3897a.m11106b(this.f1139b, a);
        this.f1143f = 2;
        return this.f1139b;
    }

    @NonNull
    public final String toString() {
        C0917i.m1420k(this.f1141d, "Cannot convert to JSON on client side.");
        Parcel h = mo12398h();
        h.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        m1562i(sb, (Map) C0917i.m1419j(this.f1141d.mo12413W((String) C0917i.m1419j(this.f1142e))), h);
        return sb.toString();
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 1, this.f1138a);
        C3897a.m11120p(parcel, 2, mo12398h(), false);
        C3897a.m11121q(parcel, 3, this.f1140c != 0 ? this.f1141d : null, i, false);
        C3897a.m11106b(parcel, a);
    }
}
