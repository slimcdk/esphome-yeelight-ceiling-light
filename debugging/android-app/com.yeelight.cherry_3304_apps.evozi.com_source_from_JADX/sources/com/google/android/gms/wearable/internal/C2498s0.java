package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import p011c.p012a.p019b.p028b.p032c.p036d.C0582b;
import p011c.p012a.p019b.p028b.p032c.p036d.C0583c;

/* renamed from: com.google.android.gms.wearable.internal.s0 */
public abstract class C2498s0 extends C0582b implements C2495r0 {
    public C2498s0() {
        super("com.google.android.gms.wearable.internal.IWearableListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo8558a(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                mo13327v((DataHolder) C0583c.m358a(parcel, DataHolder.CREATOR));
                return true;
            case 2:
                mo13325c0((zzfe) C0583c.m358a(parcel, zzfe.CREATOR));
                return true;
            case 3:
                mo13318I((zzfo) C0583c.m358a(parcel, zzfo.CREATOR));
                return true;
            case 4:
                mo13328w0((zzfo) C0583c.m358a(parcel, zzfo.CREATOR));
                return true;
            case 5:
                mo13320N0(parcel.createTypedArrayList(zzfo.CREATOR));
                return true;
            case 6:
                mo13317C0((zzl) C0583c.m358a(parcel, zzl.CREATOR));
                return true;
            case 7:
                mo13326g((zzaw) C0583c.m358a(parcel, zzaw.CREATOR));
                return true;
            case 8:
                mo13319L((zzah) C0583c.m358a(parcel, zzah.CREATOR));
                return true;
            case 9:
                mo13323V((zzi) C0583c.m358a(parcel, zzi.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
