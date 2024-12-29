package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C1599s;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Iterator;
import java.util.Map;

@ShowFirstParty
@KeepForSdk
public abstract class FastJsonResponse {

    @ShowFirstParty
    @SafeParcelable.Class(creator = "FieldCreator")
    @VisibleForTesting
    @KeepForSdk
    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final C1635a CREATOR = new C1635a();
        @SafeParcelable.VersionField(getter = "getVersionCode", mo11286id = 1)

        /* renamed from: a */
        private final int f3122a;
        @SafeParcelable.Field(getter = "getTypeIn", mo11280id = 2)

        /* renamed from: b */
        protected final int f3123b;
        @SafeParcelable.Field(getter = "isTypeInArray", mo11280id = 3)

        /* renamed from: c */
        protected final boolean f3124c;
        @SafeParcelable.Field(getter = "getTypeOut", mo11280id = 4)

        /* renamed from: d */
        protected final int f3125d;
        @SafeParcelable.Field(getter = "isTypeOutArray", mo11280id = 5)

        /* renamed from: e */
        protected final boolean f3126e;
        @SafeParcelable.Field(getter = "getOutputFieldName", mo11280id = 6)

        /* renamed from: f */
        protected final String f3127f;
        @SafeParcelable.Field(getter = "getSafeParcelableFieldId", mo11280id = 7)

        /* renamed from: g */
        protected final int f3128g;

        /* renamed from: h */
        protected final Class<? extends FastJsonResponse> f3129h;
        @SafeParcelable.Field(getter = "getConcreteTypeName", mo11280id = 8)

        /* renamed from: i */
        private final String f3130i;

        /* renamed from: j */
        private zak f3131j;
        /* access modifiers changed from: private */
        @SafeParcelable.Field(getter = "getWrappedConverter", mo11280id = 9, type = "com.google.android.gms.common.server.converter.ConverterWrapper")

        /* renamed from: k */
        public C1634a<I, O> f3132k;

        @SafeParcelable.Constructor
        Field(@SafeParcelable.Param(mo11283id = 1) int i, @SafeParcelable.Param(mo11283id = 2) int i2, @SafeParcelable.Param(mo11283id = 3) boolean z, @SafeParcelable.Param(mo11283id = 4) int i3, @SafeParcelable.Param(mo11283id = 5) boolean z2, @SafeParcelable.Param(mo11283id = 6) String str, @SafeParcelable.Param(mo11283id = 7) int i4, @SafeParcelable.Param(mo11283id = 8) String str2, @SafeParcelable.Param(mo11283id = 9) zaa zaa) {
            this.f3122a = i;
            this.f3123b = i2;
            this.f3124c = z;
            this.f3125d = i3;
            this.f3126e = z2;
            this.f3127f = str;
            this.f3128g = i4;
            if (str2 == null) {
                this.f3129h = null;
                this.f3130i = null;
            } else {
                this.f3129h = SafeParcelResponse.class;
                this.f3130i = str2;
            }
            if (zaa == null) {
                this.f3132k = null;
            } else {
                this.f3132k = zaa.mo11330R();
            }
        }

        /* renamed from: T */
        private final String m4525T() {
            String str = this.f3130i;
            if (str == null) {
                return null;
            }
            return str;
        }

        /* renamed from: W */
        private final zaa m4526W() {
            C1634a<I, O> aVar = this.f3132k;
            if (aVar == null) {
                return null;
            }
            return zaa.m4518Q(aVar);
        }

        @KeepForSdk
        /* renamed from: Q */
        public int mo11336Q() {
            return this.f3128g;
        }

        /* renamed from: S */
        public final void mo11337S(zak zak) {
            this.f3131j = zak;
        }

        /* renamed from: V */
        public final boolean mo11338V() {
            return this.f3132k != null;
        }

        /* renamed from: X */
        public final Map<String, Field<?, ?>> mo11339X() {
            C1609u.m4475k(this.f3130i);
            C1609u.m4475k(this.f3131j);
            return this.f3131j.mo11359S(this.f3130i);
        }

        /* renamed from: n */
        public final I mo11340n(O o) {
            return this.f3132k.mo11321n(o);
        }

        public String toString() {
            C1599s.C1600a c = C1599s.m4390c(this);
            c.mo11272a("versionCode", Integer.valueOf(this.f3122a));
            c.mo11272a("typeIn", Integer.valueOf(this.f3123b));
            c.mo11272a("typeInArray", Boolean.valueOf(this.f3124c));
            c.mo11272a("typeOut", Integer.valueOf(this.f3125d));
            c.mo11272a("typeOutArray", Boolean.valueOf(this.f3126e));
            c.mo11272a("outputFieldName", this.f3127f);
            c.mo11272a("safeParcelFieldId", Integer.valueOf(this.f3128g));
            c.mo11272a("concreteTypeName", m4525T());
            Class<? extends FastJsonResponse> cls = this.f3129h;
            if (cls != null) {
                c.mo11272a("concreteType.class", cls.getCanonicalName());
            }
            C1634a<I, O> aVar = this.f3132k;
            if (aVar != null) {
                c.mo11272a("converterName", aVar.getClass().getCanonicalName());
            }
            return c.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a = C1604b.m4435a(parcel);
            C1604b.m4446l(parcel, 1, this.f3122a);
            C1604b.m4446l(parcel, 2, this.f3123b);
            C1604b.m4437c(parcel, 3, this.f3124c);
            C1604b.m4446l(parcel, 4, this.f3125d);
            C1604b.m4437c(parcel, 5, this.f3126e);
            C1604b.m4452r(parcel, 6, this.f3127f, false);
            C1604b.m4446l(parcel, 7, mo11336Q());
            C1604b.m4452r(parcel, 8, m4525T(), false);
            C1604b.m4451q(parcel, 9, m4526W(), i, false);
            C1604b.m4436b(parcel, a);
        }
    }

    @ShowFirstParty
    /* renamed from: com.google.android.gms.common.server.response.FastJsonResponse$a */
    public interface C1634a<I, O> {
        /* renamed from: n */
        I mo11321n(O o);
    }

    /* renamed from: d */
    protected static <O, I> I m4520d(Field<I, O> field, Object obj) {
        return field.f3132k != null ? field.mo11340n(obj) : obj;
    }

    @KeepForSdk
    /* renamed from: a */
    public abstract Map<String, Field<?, ?>> mo11332a();

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: b */
    public boolean mo11333b(Field field) {
        UnsupportedOperationException unsupportedOperationException;
        if (field.f3125d == 11) {
            boolean z = field.f3126e;
            String str = field.f3127f;
            if (z) {
                throw unsupportedOperationException;
            }
            unsupportedOperationException = new UnsupportedOperationException("Concrete types not supported");
            throw unsupportedOperationException;
        }
        mo11334c(field.f3127f);
        throw null;
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: c */
    public abstract boolean mo11334c(String str);

    @KeepForSdk
    public String toString() {
        Map<String, Field<?, ?>> a = mo11332a();
        StringBuilder sb = new StringBuilder(100);
        Iterator<String> it = a.keySet().iterator();
        if (!it.hasNext()) {
            sb.append(sb.length() > 0 ? "}" : "{}");
            return sb.toString();
        }
        mo11333b(a.get(it.next()));
        throw null;
    }
}
