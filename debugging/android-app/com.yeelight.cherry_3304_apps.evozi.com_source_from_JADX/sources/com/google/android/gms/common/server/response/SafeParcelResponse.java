package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.C1649c;
import com.google.android.gms.common.util.C1658l;
import com.google.android.gms.common.util.C1659m;
import com.google.android.gms.common.util.VisibleForTesting;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@KeepForSdk
@SafeParcelable.Class(creator = "SafeParcelResponseCreator")
@VisibleForTesting
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    @KeepForSdk
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new C1639e();
    @SafeParcelable.VersionField(getter = "getVersionCode", mo11286id = 1)

    /* renamed from: a */
    private final int f3133a;
    @SafeParcelable.Field(getter = "getParcel", mo11280id = 2)

    /* renamed from: b */
    private final Parcel f3134b;

    /* renamed from: c */
    private final int f3135c = 2;
    @SafeParcelable.Field(getter = "getFieldMappingDictionary", mo11280id = 3)

    /* renamed from: d */
    private final zak f3136d;

    /* renamed from: e */
    private final String f3137e;

    /* renamed from: f */
    private int f3138f;

    /* renamed from: g */
    private int f3139g;

    @SafeParcelable.Constructor
    SafeParcelResponse(@SafeParcelable.Param(mo11283id = 1) int i, @SafeParcelable.Param(mo11283id = 2) Parcel parcel, @SafeParcelable.Param(mo11283id = 3) zak zak) {
        this.f3133a = i;
        C1609u.m4475k(parcel);
        this.f3134b = parcel;
        this.f3136d = zak;
        this.f3137e = zak == null ? null : zak.mo11358R();
        this.f3138f = 2;
    }

    /* renamed from: e */
    private static void m4534e(StringBuilder sb, int i, Object obj) {
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
                sb.append(C1658l.m4599a(obj.toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                sb.append(C1649c.m4574a((byte[]) obj));
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                sb.append(C1649c.m4575b((byte[]) obj));
                sb.append("\"");
                return;
            case 10:
                C1659m.m4600a(sb, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("Unknown type = ");
                sb2.append(i);
                throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0105, code lost:
        r3 = com.google.android.gms.common.server.response.FastJsonResponse.m4520d(r5, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0109, code lost:
        m4536g(r11, r5, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x021a, code lost:
        r11.append(r3);
        r11.append("\"");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x024a, code lost:
        r11.append(r3);
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m4535f(java.lang.StringBuilder r11, java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> r12, android.os.Parcel r13) {
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
            int r2 = r2.mo11336Q()
            r0.put(r2, r1)
            goto L_0x000d
        L_0x0027:
            r12 = 123(0x7b, float:1.72E-43)
            r11.append(r12)
            int r12 = com.google.android.gms.common.internal.safeparcel.C1602a.m4406K(r13)
            r1 = 1
            r2 = 0
            r3 = 0
        L_0x0033:
            int r4 = r13.dataPosition()
            if (r4 >= r12) goto L_0x0258
            int r4 = com.google.android.gms.common.internal.safeparcel.C1602a.m4398C(r13)
            int r5 = com.google.android.gms.common.internal.safeparcel.C1602a.m4429u(r4)
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
            boolean r3 = r5.mo11338V()
            if (r3 == 0) goto L_0x010e
            int r3 = r5.f3125d
            switch(r3) {
                case 0: goto L_0x00fd;
                case 1: goto L_0x00f8;
                case 2: goto L_0x00ef;
                case 3: goto L_0x00e6;
                case 4: goto L_0x00dd;
                case 5: goto L_0x00d8;
                case 6: goto L_0x00cf;
                case 7: goto L_0x00ca;
                case 8: goto L_0x00c1;
                case 9: goto L_0x00c1;
                case 10: goto L_0x0097;
                case 11: goto L_0x008f;
                default: goto L_0x0074;
            }
        L_0x0074:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            int r12 = r5.f3125d
            r13 = 36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r13)
            java.lang.String r13 = "Unknown field out type = "
            r0.append(r13)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r11.<init>(r12)
            throw r11
        L_0x008f:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Method does not accept concrete type."
            r11.<init>(r12)
            throw r11
        L_0x0097:
            android.os.Bundle r3 = com.google.android.gms.common.internal.safeparcel.C1602a.m4414f(r13, r4)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Set r6 = r3.keySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x00a8:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00bc
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = r3.getString(r7)
            r4.put(r7, r8)
            goto L_0x00a8
        L_0x00bc:
            java.lang.Object r3 = com.google.android.gms.common.server.response.FastJsonResponse.m4520d(r5, r4)
            goto L_0x0109
        L_0x00c1:
            byte[] r3 = com.google.android.gms.common.internal.safeparcel.C1602a.m4415g(r13, r4)
            java.lang.Object r3 = com.google.android.gms.common.server.response.FastJsonResponse.m4520d(r5, r3)
            goto L_0x0109
        L_0x00ca:
            java.lang.String r3 = com.google.android.gms.common.internal.safeparcel.C1602a.m4423o(r13, r4)
            goto L_0x0105
        L_0x00cf:
            boolean r3 = com.google.android.gms.common.internal.safeparcel.C1602a.m4430v(r13, r4)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            goto L_0x0105
        L_0x00d8:
            java.math.BigDecimal r3 = com.google.android.gms.common.internal.safeparcel.C1602a.m4409a(r13, r4)
            goto L_0x0105
        L_0x00dd:
            double r3 = com.google.android.gms.common.internal.safeparcel.C1602a.m4433y(r13, r4)
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            goto L_0x0105
        L_0x00e6:
            float r3 = com.google.android.gms.common.internal.safeparcel.C1602a.m4396A(r13, r4)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            goto L_0x0105
        L_0x00ef:
            long r3 = com.google.android.gms.common.internal.safeparcel.C1602a.m4402G(r13, r4)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L_0x0105
        L_0x00f8:
            java.math.BigInteger r3 = com.google.android.gms.common.internal.safeparcel.C1602a.m4411c(r13, r4)
            goto L_0x0105
        L_0x00fd:
            int r3 = com.google.android.gms.common.internal.safeparcel.C1602a.m4400E(r13, r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x0105:
            java.lang.Object r3 = com.google.android.gms.common.server.response.FastJsonResponse.m4520d(r5, r3)
        L_0x0109:
            r10.m4536g(r11, r5, r3)
            goto L_0x0255
        L_0x010e:
            boolean r3 = r5.f3126e
            if (r3 == 0) goto L_0x0190
            java.lang.String r3 = "["
            r11.append(r3)
            int r3 = r5.f3125d
            switch(r3) {
                case 0: goto L_0x0182;
                case 1: goto L_0x017a;
                case 2: goto L_0x0172;
                case 3: goto L_0x016a;
                case 4: goto L_0x0162;
                case 5: goto L_0x015a;
                case 6: goto L_0x0152;
                case 7: goto L_0x014a;
                case 8: goto L_0x0142;
                case 9: goto L_0x0142;
                case 10: goto L_0x0142;
                case 11: goto L_0x0124;
                default: goto L_0x011c;
            }
        L_0x011c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Unknown field type out."
            r11.<init>(r12)
            throw r11
        L_0x0124:
            android.os.Parcel[] r3 = com.google.android.gms.common.internal.safeparcel.C1602a.m4421m(r13, r4)
            int r4 = r3.length
            r7 = 0
        L_0x012a:
            if (r7 >= r4) goto L_0x0189
            if (r7 <= 0) goto L_0x0131
            r11.append(r6)
        L_0x0131:
            r8 = r3[r7]
            r8.setDataPosition(r2)
            java.util.Map r8 = r5.mo11339X()
            r9 = r3[r7]
            r10.m4535f(r11, r8, r9)
            int r7 = r7 + 1
            goto L_0x012a
        L_0x0142:
            java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException
            java.lang.String r12 = "List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported"
            r11.<init>(r12)
            throw r11
        L_0x014a:
            java.lang.String[] r3 = com.google.android.gms.common.internal.safeparcel.C1602a.m4424p(r13, r4)
            com.google.android.gms.common.util.C1648b.m4573i(r11, r3)
            goto L_0x0189
        L_0x0152:
            boolean[] r3 = com.google.android.gms.common.internal.safeparcel.C1602a.m4413e(r13, r4)
            com.google.android.gms.common.util.C1648b.m4572h(r11, r3)
            goto L_0x0189
        L_0x015a:
            java.math.BigDecimal[] r3 = com.google.android.gms.common.internal.safeparcel.C1602a.m4410b(r13, r4)
            com.google.android.gms.common.util.C1648b.m4571g(r11, r3)
            goto L_0x0189
        L_0x0162:
            double[] r3 = com.google.android.gms.common.internal.safeparcel.C1602a.m4416h(r13, r4)
            com.google.android.gms.common.util.C1648b.m4567c(r11, r3)
            goto L_0x0189
        L_0x016a:
            float[] r3 = com.google.android.gms.common.internal.safeparcel.C1602a.m4417i(r13, r4)
            com.google.android.gms.common.util.C1648b.m4568d(r11, r3)
            goto L_0x0189
        L_0x0172:
            long[] r3 = com.google.android.gms.common.internal.safeparcel.C1602a.m4419k(r13, r4)
            com.google.android.gms.common.util.C1648b.m4570f(r11, r3)
            goto L_0x0189
        L_0x017a:
            java.math.BigInteger[] r3 = com.google.android.gms.common.internal.safeparcel.C1602a.m4412d(r13, r4)
            com.google.android.gms.common.util.C1648b.m4571g(r11, r3)
            goto L_0x0189
        L_0x0182:
            int[] r3 = com.google.android.gms.common.internal.safeparcel.C1602a.m4418j(r13, r4)
            com.google.android.gms.common.util.C1648b.m4569e(r11, r3)
        L_0x0189:
            java.lang.String r3 = "]"
        L_0x018b:
            r11.append(r3)
            goto L_0x0255
        L_0x0190:
            int r3 = r5.f3125d
            switch(r3) {
                case 0: goto L_0x024e;
                case 1: goto L_0x0246;
                case 2: goto L_0x023e;
                case 3: goto L_0x0236;
                case 4: goto L_0x022e;
                case 5: goto L_0x0229;
                case 6: goto L_0x0221;
                case 7: goto L_0x020f;
                case 8: goto L_0x0203;
                case 9: goto L_0x01f7;
                case 10: goto L_0x01ad;
                case 11: goto L_0x019d;
                default: goto L_0x0195;
            }
        L_0x0195:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Unknown field type out"
            r11.<init>(r12)
            throw r11
        L_0x019d:
            android.os.Parcel r3 = com.google.android.gms.common.internal.safeparcel.C1602a.m4420l(r13, r4)
            r3.setDataPosition(r2)
            java.util.Map r4 = r5.mo11339X()
            r10.m4535f(r11, r4, r3)
            goto L_0x0255
        L_0x01ad:
            android.os.Bundle r3 = com.google.android.gms.common.internal.safeparcel.C1602a.m4414f(r13, r4)
            java.util.Set r4 = r3.keySet()
            r4.size()
            java.lang.String r5 = "{"
            r11.append(r5)
            java.util.Iterator r4 = r4.iterator()
            r5 = 1
        L_0x01c2:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x01f4
            java.lang.Object r8 = r4.next()
            java.lang.String r8 = (java.lang.String) r8
            if (r5 != 0) goto L_0x01d3
            r11.append(r6)
        L_0x01d3:
            r11.append(r7)
            r11.append(r8)
            r11.append(r7)
            java.lang.String r5 = ":"
            r11.append(r5)
            r11.append(r7)
            java.lang.String r5 = r3.getString(r8)
            java.lang.String r5 = com.google.android.gms.common.util.C1658l.m4599a(r5)
            r11.append(r5)
            r11.append(r7)
            r5 = 0
            goto L_0x01c2
        L_0x01f4:
            java.lang.String r3 = "}"
            goto L_0x018b
        L_0x01f7:
            byte[] r3 = com.google.android.gms.common.internal.safeparcel.C1602a.m4415g(r13, r4)
            r11.append(r7)
            java.lang.String r3 = com.google.android.gms.common.util.C1649c.m4575b(r3)
            goto L_0x021a
        L_0x0203:
            byte[] r3 = com.google.android.gms.common.internal.safeparcel.C1602a.m4415g(r13, r4)
            r11.append(r7)
            java.lang.String r3 = com.google.android.gms.common.util.C1649c.m4574a(r3)
            goto L_0x021a
        L_0x020f:
            java.lang.String r3 = com.google.android.gms.common.internal.safeparcel.C1602a.m4423o(r13, r4)
            r11.append(r7)
            java.lang.String r3 = com.google.android.gms.common.util.C1658l.m4599a(r3)
        L_0x021a:
            r11.append(r3)
            r11.append(r7)
            goto L_0x0255
        L_0x0221:
            boolean r3 = com.google.android.gms.common.internal.safeparcel.C1602a.m4430v(r13, r4)
            r11.append(r3)
            goto L_0x0255
        L_0x0229:
            java.math.BigDecimal r3 = com.google.android.gms.common.internal.safeparcel.C1602a.m4409a(r13, r4)
            goto L_0x024a
        L_0x022e:
            double r3 = com.google.android.gms.common.internal.safeparcel.C1602a.m4433y(r13, r4)
            r11.append(r3)
            goto L_0x0255
        L_0x0236:
            float r3 = com.google.android.gms.common.internal.safeparcel.C1602a.m4396A(r13, r4)
            r11.append(r3)
            goto L_0x0255
        L_0x023e:
            long r3 = com.google.android.gms.common.internal.safeparcel.C1602a.m4402G(r13, r4)
            r11.append(r3)
            goto L_0x0255
        L_0x0246:
            java.math.BigInteger r3 = com.google.android.gms.common.internal.safeparcel.C1602a.m4411c(r13, r4)
        L_0x024a:
            r11.append(r3)
            goto L_0x0255
        L_0x024e:
            int r3 = com.google.android.gms.common.internal.safeparcel.C1602a.m4400E(r13, r4)
            r11.append(r3)
        L_0x0255:
            r3 = 1
            goto L_0x0033
        L_0x0258:
            int r0 = r13.dataPosition()
            if (r0 != r12) goto L_0x0264
            r12 = 125(0x7d, float:1.75E-43)
            r11.append(r12)
            return
        L_0x0264:
            com.google.android.gms.common.internal.safeparcel.a$a r11 = new com.google.android.gms.common.internal.safeparcel.a$a
            r0 = 37
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Overread allowed size end="
            r1.append(r0)
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            r11.<init>(r12, r13)
            goto L_0x027e
        L_0x027d:
            throw r11
        L_0x027e:
            goto L_0x027d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.SafeParcelResponse.m4535f(java.lang.StringBuilder, java.util.Map, android.os.Parcel):void");
    }

    /* renamed from: g */
    private final void m4536g(StringBuilder sb, FastJsonResponse.Field<?, ?> field, Object obj) {
        if (field.f3124c) {
            ArrayList arrayList = (ArrayList) obj;
            sb.append("[");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (i != 0) {
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                m4534e(sb, field.f3123b, arrayList.get(i));
            }
            sb.append("]");
            return;
        }
        m4534e(sb, field.f3123b, obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        if (r0 != 1) goto L_0x001a;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.os.Parcel m4537h() {
        /*
            r2 = this;
            int r0 = r2.f3138f
            if (r0 == 0) goto L_0x0008
            r1 = 1
            if (r0 == r1) goto L_0x0010
            goto L_0x001a
        L_0x0008:
            android.os.Parcel r0 = r2.f3134b
            int r0 = com.google.android.gms.common.internal.safeparcel.C1604b.m4435a(r0)
            r2.f3139g = r0
        L_0x0010:
            android.os.Parcel r0 = r2.f3134b
            int r1 = r2.f3139g
            com.google.android.gms.common.internal.safeparcel.C1604b.m4436b(r0, r1)
            r0 = 2
            r2.f3138f = r0
        L_0x001a:
            android.os.Parcel r0 = r2.f3134b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.SafeParcelResponse.m4537h():android.os.Parcel");
    }

    /* renamed from: a */
    public Map<String, FastJsonResponse.Field<?, ?>> mo11332a() {
        zak zak = this.f3136d;
        if (zak == null) {
            return null;
        }
        return zak.mo11359S(this.f3137e);
    }

    /* renamed from: c */
    public boolean mo11334c(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public String toString() {
        C1609u.m4476l(this.f3136d, "Cannot convert to JSON on client side.");
        Parcel h = m4537h();
        h.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        m4535f(sb, this.f3136d.mo11359S(this.f3137e), h);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zak zak;
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 1, this.f3133a);
        C1604b.m4450p(parcel, 2, m4537h(), false);
        int i2 = this.f3135c;
        if (i2 == 0) {
            zak = null;
        } else if (i2 == 1 || i2 == 2) {
            zak = this.f3136d;
        } else {
            int i3 = this.f3135c;
            StringBuilder sb = new StringBuilder(34);
            sb.append("Invalid creation type: ");
            sb.append(i3);
            throw new IllegalStateException(sb.toString());
        }
        C1604b.m4451q(parcel, 3, zak, i, false);
        C1604b.m4436b(parcel, a);
    }
}
