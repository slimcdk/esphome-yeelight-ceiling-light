package com.google.android.gms.common.server.response;

import android.os.Parcel;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C0914h;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Map;
import p014c0.C0622k;
import p113x.C3897a;

@ShowFirstParty
@KeepForSdk
public abstract class FastJsonResponse {

    @ShowFirstParty
    @SafeParcelable.Class(creator = "FieldCreator")
    @VisibleForTesting
    @KeepForSdk
    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final C0951a CREATOR = new C0951a();
        @SafeParcelable.VersionField(getter = "getVersionCode", mo12321id = 1)

        /* renamed from: a */
        private final int f1127a;
        @SafeParcelable.Field(getter = "getTypeIn", mo12312id = 2)

        /* renamed from: b */
        protected final int f1128b;
        @SafeParcelable.Field(getter = "isTypeInArray", mo12312id = 3)

        /* renamed from: c */
        protected final boolean f1129c;
        @SafeParcelable.Field(getter = "getTypeOut", mo12312id = 4)

        /* renamed from: d */
        protected final int f1130d;
        @SafeParcelable.Field(getter = "isTypeOutArray", mo12312id = 5)

        /* renamed from: e */
        protected final boolean f1131e;
        @SafeParcelable.Field(getter = "getOutputFieldName", mo12312id = 6)
        @NonNull

        /* renamed from: f */
        protected final String f1132f;
        @SafeParcelable.Field(getter = "getSafeParcelableFieldId", mo12312id = 7)

        /* renamed from: g */
        protected final int f1133g;
        @Nullable

        /* renamed from: h */
        protected final Class f1134h;
        @SafeParcelable.Field(getter = "getConcreteTypeName", mo12312id = 8)
        @Nullable

        /* renamed from: i */
        protected final String f1135i;

        /* renamed from: j */
        private zan f1136j;
        /* access modifiers changed from: private */
        @SafeParcelable.Field(getter = "getWrappedConverter", mo12312id = 9, type = "com.google.android.gms.common.server.converter.ConverterWrapper")
        @Nullable

        /* renamed from: k */
        public C0950a f1137k;

        @SafeParcelable.Constructor
        Field(@SafeParcelable.Param(mo12315id = 1) int i, @SafeParcelable.Param(mo12315id = 2) int i2, @SafeParcelable.Param(mo12315id = 3) boolean z, @SafeParcelable.Param(mo12315id = 4) int i3, @SafeParcelable.Param(mo12315id = 5) boolean z2, @SafeParcelable.Param(mo12315id = 6) String str, @SafeParcelable.Param(mo12315id = 7) int i4, @SafeParcelable.Param(mo12315id = 8) @Nullable String str2, @SafeParcelable.Param(mo12315id = 9) @Nullable zaa zaa) {
            this.f1127a = i;
            this.f1128b = i2;
            this.f1129c = z;
            this.f1130d = i3;
            this.f1131e = z2;
            this.f1132f = str;
            this.f1133g = i4;
            if (str2 == null) {
                this.f1134h = null;
                this.f1135i = null;
            } else {
                this.f1134h = SafeParcelResponse.class;
                this.f1135i = str2;
            }
            if (zaa == null) {
                this.f1137k = null;
            } else {
                this.f1137k = zaa.mo12377W();
            }
        }

        @KeepForSdk
        /* renamed from: V */
        public int mo12386V() {
            return this.f1133g;
        }

        /* access modifiers changed from: package-private */
        @Nullable
        /* renamed from: W */
        public final zaa mo12387W() {
            C0950a aVar = this.f1137k;
            if (aVar == null) {
                return null;
            }
            return zaa.m1542V(aVar);
        }

        @NonNull
        /* renamed from: d0 */
        public final Object mo12388d0(@NonNull Object obj) {
            C0917i.m1419j(this.f1137k);
            return this.f1137k.mo12368B(obj);
        }

        /* access modifiers changed from: package-private */
        @Nullable
        /* renamed from: f0 */
        public final String mo12389f0() {
            String str = this.f1135i;
            if (str == null) {
                return null;
            }
            return str;
        }

        @NonNull
        /* renamed from: g0 */
        public final Map mo12390g0() {
            C0917i.m1419j(this.f1135i);
            C0917i.m1419j(this.f1136j);
            return (Map) C0917i.m1419j(this.f1136j.mo12413W(this.f1135i));
        }

        /* renamed from: h0 */
        public final void mo12391h0(zan zan) {
            this.f1136j = zan;
        }

        /* renamed from: k0 */
        public final boolean mo12392k0() {
            return this.f1137k != null;
        }

        @NonNull
        public final String toString() {
            C0914h.C0915a a = C0914h.m1404c(this).mo12279a("versionCode", Integer.valueOf(this.f1127a)).mo12279a("typeIn", Integer.valueOf(this.f1128b)).mo12279a("typeInArray", Boolean.valueOf(this.f1129c)).mo12279a("typeOut", Integer.valueOf(this.f1130d)).mo12279a("typeOutArray", Boolean.valueOf(this.f1131e)).mo12279a("outputFieldName", this.f1132f).mo12279a("safeParcelFieldId", Integer.valueOf(this.f1133g)).mo12279a("concreteTypeName", mo12389f0());
            Class cls = this.f1134h;
            if (cls != null) {
                a.mo12279a("concreteType.class", cls.getCanonicalName());
            }
            C0950a aVar = this.f1137k;
            if (aVar != null) {
                a.mo12279a("converterName", aVar.getClass().getCanonicalName());
            }
            return a.toString();
        }

        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            int a = C3897a.m11105a(parcel);
            C3897a.m11116l(parcel, 1, this.f1127a);
            C3897a.m11116l(parcel, 2, this.f1128b);
            C3897a.m11107c(parcel, 3, this.f1129c);
            C3897a.m11116l(parcel, 4, this.f1130d);
            C3897a.m11107c(parcel, 5, this.f1131e);
            C3897a.m11122r(parcel, 6, this.f1132f, false);
            C3897a.m11116l(parcel, 7, mo12386V());
            C3897a.m11122r(parcel, 8, mo12389f0(), false);
            C3897a.m11121q(parcel, 9, mo12387W(), i, false);
            C3897a.m11106b(parcel, a);
        }
    }

    @ShowFirstParty
    /* renamed from: com.google.android.gms.common.server.response.FastJsonResponse$a */
    public interface C0950a<I, O> {
        @NonNull
        /* renamed from: B */
        Object mo12368B(@NonNull Object obj);
    }

    @NonNull
    /* renamed from: f */
    protected static final Object m1544f(@NonNull Field field, @Nullable Object obj) {
        return field.f1137k != null ? field.mo12388d0(obj) : obj;
    }

    /* renamed from: g */
    private static final void m1545g(StringBuilder sb, Field field, Object obj) {
        String fastJsonResponse;
        int i = field.f1128b;
        if (i == 11) {
            Class cls = field.f1134h;
            C0917i.m1419j(cls);
            fastJsonResponse = ((FastJsonResponse) cls.cast(obj)).toString();
        } else if (i == 7) {
            fastJsonResponse = "\"";
            sb.append(fastJsonResponse);
            sb.append(C0622k.m220a((String) obj));
        } else {
            sb.append(obj);
            return;
        }
        sb.append(fastJsonResponse);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public abstract Map<String, Field<?, ?>> mo12380a();

    /* access modifiers changed from: protected */
    @KeepForSdk
    @Nullable
    /* renamed from: b */
    public Object mo12381b(@NonNull Field field) {
        String str = field.f1132f;
        if (field.f1134h == null) {
            return mo12382c(str);
        }
        C0917i.m1425p(mo12382c(str) == null, "Concrete field shouldn't be value object: %s", field.f1132f);
        try {
            char upperCase = Character.toUpperCase(str.charAt(0));
            String substring = str.substring(1);
            return getClass().getMethod("get" + upperCase + substring, new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    @Nullable
    /* renamed from: c */
    public abstract Object mo12382c(@NonNull String str);

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: d */
    public boolean mo12383d(@NonNull Field field) {
        if (field.f1130d != 11) {
            return mo12384e(field.f1132f);
        }
        if (field.f1131e) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: e */
    public abstract boolean mo12384e(@NonNull String str);

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0088, code lost:
        r1.append(r3);
        r1.append("\"");
     */
    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r9 = this;
            java.util.Map r0 = r9.mo12380a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 100
            r1.<init>(r2)
            java.util.Set r2 = r0.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0013:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00aa
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r0.get(r3)
            com.google.android.gms.common.server.response.FastJsonResponse$Field r4 = (com.google.android.gms.common.server.response.FastJsonResponse.Field) r4
            boolean r5 = r9.mo12383d(r4)
            if (r5 == 0) goto L_0x0013
            java.lang.Object r5 = r9.mo12381b(r4)
            java.lang.Object r5 = m1544f(r4, r5)
            int r6 = r1.length()
            java.lang.String r7 = ","
            if (r6 != 0) goto L_0x0041
            java.lang.String r6 = "{"
            r1.append(r6)
            goto L_0x0044
        L_0x0041:
            r1.append(r7)
        L_0x0044:
            java.lang.String r6 = "\""
            r1.append(r6)
            r1.append(r3)
            java.lang.String r3 = "\":"
            r1.append(r3)
            if (r5 != 0) goto L_0x0059
            java.lang.String r3 = "null"
        L_0x0055:
            r1.append(r3)
            goto L_0x0013
        L_0x0059:
            int r3 = r4.f1130d
            switch(r3) {
                case 8: goto L_0x007f;
                case 9: goto L_0x0075;
                case 10: goto L_0x006f;
                default: goto L_0x005e;
            }
        L_0x005e:
            boolean r3 = r4.f1129c
            if (r3 == 0) goto L_0x00a5
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.String r3 = "["
            r1.append(r3)
            int r3 = r5.size()
            r6 = 0
            goto L_0x008f
        L_0x006f:
            java.util.HashMap r5 = (java.util.HashMap) r5
            p014c0.C0623l.m221a(r1, r5)
            goto L_0x0013
        L_0x0075:
            r1.append(r6)
            byte[] r5 = (byte[]) r5
            java.lang.String r3 = p014c0.C0614c.m198b(r5)
            goto L_0x0088
        L_0x007f:
            r1.append(r6)
            byte[] r5 = (byte[]) r5
            java.lang.String r3 = p014c0.C0614c.m197a(r5)
        L_0x0088:
            r1.append(r3)
            r1.append(r6)
            goto L_0x0013
        L_0x008f:
            if (r6 >= r3) goto L_0x00a2
            if (r6 <= 0) goto L_0x0096
            r1.append(r7)
        L_0x0096:
            java.lang.Object r8 = r5.get(r6)
            if (r8 == 0) goto L_0x009f
            m1545g(r1, r4, r8)
        L_0x009f:
            int r6 = r6 + 1
            goto L_0x008f
        L_0x00a2:
            java.lang.String r3 = "]"
            goto L_0x0055
        L_0x00a5:
            m1545g(r1, r4, r5)
            goto L_0x0013
        L_0x00aa:
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x00b3
            java.lang.String r0 = "}"
            goto L_0x00b5
        L_0x00b3:
            java.lang.String r0 = "{}"
        L_0x00b5:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.FastJsonResponse.toString():java.lang.String");
    }
}
