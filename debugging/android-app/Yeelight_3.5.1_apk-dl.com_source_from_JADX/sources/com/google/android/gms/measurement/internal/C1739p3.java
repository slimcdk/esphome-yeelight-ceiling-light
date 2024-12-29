package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.C1214n0;
import com.google.android.gms.internal.measurement.C1246p0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.p3 */
public final class C1739p3 extends C1214n0 implements C1763r3 {
    C1739p3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* renamed from: N */
    public final void mo14190N(zzlo zzlo, zzq zzq) {
        Parcel c = mo13002c();
        C1246p0.m2432e(c, zzlo);
        C1246p0.m2432e(c, zzq);
        mo13004f(2, c);
    }

    /* renamed from: Q */
    public final void mo14191Q(zzaw zzaw, zzq zzq) {
        Parcel c = mo13002c();
        C1246p0.m2432e(c, zzaw);
        C1246p0.m2432e(c, zzq);
        mo13004f(1, c);
    }

    /* renamed from: V */
    public final void mo14192V(zzq zzq) {
        Parcel c = mo13002c();
        C1246p0.m2432e(c, zzq);
        mo13004f(4, c);
    }

    /* renamed from: W */
    public final List mo14193W(String str, String str2, zzq zzq) {
        Parcel c = mo13002c();
        c.writeString(str);
        c.writeString(str2);
        C1246p0.m2432e(c, zzq);
        Parcel e = mo13003e(16, c);
        ArrayList<zzac> createTypedArrayList = e.createTypedArrayList(zzac.CREATOR);
        e.recycle();
        return createTypedArrayList;
    }

    /* renamed from: b0 */
    public final void mo14194b0(long j, String str, String str2, String str3) {
        Parcel c = mo13002c();
        c.writeLong(j);
        c.writeString(str);
        c.writeString(str2);
        c.writeString(str3);
        mo13004f(10, c);
    }

    /* renamed from: i */
    public final void mo14197i(zzq zzq) {
        Parcel c = mo13002c();
        C1246p0.m2432e(c, zzq);
        mo13004f(6, c);
    }

    /* renamed from: k */
    public final void mo14198k(Bundle bundle, zzq zzq) {
        Parcel c = mo13002c();
        C1246p0.m2432e(c, bundle);
        C1246p0.m2432e(c, zzq);
        mo13004f(19, c);
    }

    /* renamed from: k0 */
    public final void mo14199k0(zzq zzq) {
        Parcel c = mo13002c();
        C1246p0.m2432e(c, zzq);
        mo13004f(20, c);
    }

    /* renamed from: l */
    public final List mo14200l(String str, String str2, String str3, boolean z) {
        Parcel c = mo13002c();
        c.writeString((String) null);
        c.writeString(str2);
        c.writeString(str3);
        C1246p0.m2431d(c, z);
        Parcel e = mo13003e(15, c);
        ArrayList<zzlo> createTypedArrayList = e.createTypedArrayList(zzlo.CREATOR);
        e.recycle();
        return createTypedArrayList;
    }

    /* renamed from: l0 */
    public final List mo14201l0(String str, String str2, boolean z, zzq zzq) {
        Parcel c = mo13002c();
        c.writeString(str);
        c.writeString(str2);
        C1246p0.m2431d(c, z);
        C1246p0.m2432e(c, zzq);
        Parcel e = mo13003e(14, c);
        ArrayList<zzlo> createTypedArrayList = e.createTypedArrayList(zzlo.CREATOR);
        e.recycle();
        return createTypedArrayList;
    }

    /* renamed from: q */
    public final byte[] mo14204q(zzaw zzaw, String str) {
        Parcel c = mo13002c();
        C1246p0.m2432e(c, zzaw);
        c.writeString(str);
        Parcel e = mo13003e(9, c);
        byte[] createByteArray = e.createByteArray();
        e.recycle();
        return createByteArray;
    }

    /* renamed from: r0 */
    public final void mo14205r0(zzq zzq) {
        Parcel c = mo13002c();
        C1246p0.m2432e(c, zzq);
        mo13004f(18, c);
    }

    /* renamed from: s0 */
    public final void mo14206s0(zzac zzac, zzq zzq) {
        Parcel c = mo13002c();
        C1246p0.m2432e(c, zzac);
        C1246p0.m2432e(c, zzq);
        mo13004f(12, c);
    }

    /* renamed from: t */
    public final String mo14207t(zzq zzq) {
        Parcel c = mo13002c();
        C1246p0.m2432e(c, zzq);
        Parcel e = mo13003e(11, c);
        String readString = e.readString();
        e.recycle();
        return readString;
    }

    /* renamed from: z */
    public final List mo14208z(String str, String str2, String str3) {
        Parcel c = mo13002c();
        c.writeString((String) null);
        c.writeString(str2);
        c.writeString(str3);
        Parcel e = mo13003e(17, c);
        ArrayList<zzac> createTypedArrayList = e.createTypedArrayList(zzac.CREATOR);
        e.recycle();
        return createTypedArrayList;
    }
}
