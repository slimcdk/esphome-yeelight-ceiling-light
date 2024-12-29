package com.google.android.gms.measurement.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.C1698a;
import com.google.android.gms.internal.measurement.C1978s;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.q3 */
public final class C2295q3 extends C1698a implements C2273o3 {
    C2295q3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* renamed from: I0 */
    public final void mo12665I0(zzm zzm) {
        Parcel c = mo11409c();
        C1978s.m5922c(c, zzm);
        mo11411f(4, c);
    }

    /* renamed from: K */
    public final void mo12666K(zzm zzm) {
        Parcel c = mo11409c();
        C1978s.m5922c(c, zzm);
        mo11411f(18, c);
    }

    /* renamed from: K0 */
    public final void mo12667K0(zzaq zzaq, zzm zzm) {
        Parcel c = mo11409c();
        C1978s.m5922c(c, zzaq);
        C1978s.m5922c(c, zzm);
        mo11411f(1, c);
    }

    /* renamed from: N */
    public final List<zzy> mo12668N(String str, String str2, zzm zzm) {
        Parcel c = mo11409c();
        c.writeString(str);
        c.writeString(str2);
        C1978s.m5922c(c, zzm);
        Parcel e = mo11410e(16, c);
        ArrayList<zzy> createTypedArrayList = e.createTypedArrayList(zzy.CREATOR);
        e.recycle();
        return createTypedArrayList;
    }

    /* renamed from: S */
    public final void mo12670S(zzy zzy) {
        Parcel c = mo11409c();
        C1978s.m5922c(c, zzy);
        mo11411f(13, c);
    }

    /* renamed from: U */
    public final List<zzkn> mo12671U(String str, String str2, boolean z, zzm zzm) {
        Parcel c = mo11409c();
        c.writeString(str);
        c.writeString(str2);
        C1978s.m5923d(c, z);
        C1978s.m5922c(c, zzm);
        Parcel e = mo11410e(14, c);
        ArrayList<zzkn> createTypedArrayList = e.createTypedArrayList(zzkn.CREATOR);
        e.recycle();
        return createTypedArrayList;
    }

    /* renamed from: X */
    public final void mo12672X(long j, String str, String str2, String str3) {
        Parcel c = mo11409c();
        c.writeLong(j);
        c.writeString(str);
        c.writeString(str2);
        c.writeString(str3);
        mo11411f(10, c);
    }

    /* renamed from: Z */
    public final List<zzy> mo12673Z(String str, String str2, String str3) {
        Parcel c = mo11409c();
        c.writeString(str);
        c.writeString(str2);
        c.writeString(str3);
        Parcel e = mo11410e(17, c);
        ArrayList<zzy> createTypedArrayList = e.createTypedArrayList(zzy.CREATOR);
        e.recycle();
        return createTypedArrayList;
    }

    /* renamed from: f0 */
    public final void mo12674f0(zzkn zzkn, zzm zzm) {
        Parcel c = mo11409c();
        C1978s.m5922c(c, zzkn);
        C1978s.m5922c(c, zzm);
        mo11411f(2, c);
    }

    /* renamed from: k */
    public final byte[] mo12675k(zzaq zzaq, String str) {
        Parcel c = mo11409c();
        C1978s.m5922c(c, zzaq);
        c.writeString(str);
        Parcel e = mo11410e(9, c);
        byte[] createByteArray = e.createByteArray();
        e.recycle();
        return createByteArray;
    }

    /* renamed from: k0 */
    public final void mo12676k0(zzm zzm) {
        Parcel c = mo11409c();
        C1978s.m5922c(c, zzm);
        mo11411f(6, c);
    }

    /* renamed from: u0 */
    public final String mo12677u0(zzm zzm) {
        Parcel c = mo11409c();
        C1978s.m5922c(c, zzm);
        Parcel e = mo11410e(11, c);
        String readString = e.readString();
        e.recycle();
        return readString;
    }

    /* renamed from: w */
    public final List<zzkn> mo12678w(zzm zzm, boolean z) {
        Parcel c = mo11409c();
        C1978s.m5922c(c, zzm);
        C1978s.m5923d(c, z);
        Parcel e = mo11410e(7, c);
        ArrayList<zzkn> createTypedArrayList = e.createTypedArrayList(zzkn.CREATOR);
        e.recycle();
        return createTypedArrayList;
    }

    /* renamed from: x */
    public final void mo12679x(zzaq zzaq, String str, String str2) {
        Parcel c = mo11409c();
        C1978s.m5922c(c, zzaq);
        c.writeString(str);
        c.writeString(str2);
        mo11411f(5, c);
    }

    /* renamed from: y */
    public final List<zzkn> mo12680y(String str, String str2, String str3, boolean z) {
        Parcel c = mo11409c();
        c.writeString(str);
        c.writeString(str2);
        c.writeString(str3);
        C1978s.m5923d(c, z);
        Parcel e = mo11410e(15, c);
        ArrayList<zzkn> createTypedArrayList = e.createTypedArrayList(zzkn.CREATOR);
        e.recycle();
        return createTypedArrayList;
    }

    /* renamed from: z */
    public final void mo12681z(zzy zzy, zzm zzm) {
        Parcel c = mo11409c();
        C1978s.m5922c(c, zzy);
        C1978s.m5922c(c, zzm);
        mo11411f(12, c);
    }
}
