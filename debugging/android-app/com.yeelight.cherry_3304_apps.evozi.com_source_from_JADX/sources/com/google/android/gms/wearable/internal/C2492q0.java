package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import p011c.p012a.p019b.p028b.p032c.p036d.C0582b;
import p011c.p012a.p019b.p028b.p032c.p036d.C0583c;

/* renamed from: com.google.android.gms.wearable.internal.q0 */
public abstract class C2492q0 extends C0582b implements C2488p0 {
    public C2492q0() {
        super("com.google.android.gms.wearable.internal.IWearableCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo8558a(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 2:
                mo13279o((zzdw) C0583c.m358a(parcel, zzdw.CREATOR));
                throw null;
            case 3:
                mo13277n((zzfu) C0583c.m358a(parcel, zzfu.CREATOR));
                break;
            case 4:
                mo13270Q((zzec) C0583c.m358a(parcel, zzec.CREATOR));
                throw null;
            case 5:
                mo13263G0((DataHolder) C0583c.m358a(parcel, DataHolder.CREATOR));
                throw null;
            case 6:
                mo13272d0((zzdg) C0583c.m358a(parcel, zzdg.CREATOR));
                throw null;
            case 7:
                mo13268M((zzga) C0583c.m358a(parcel, zzga.CREATOR));
                break;
            case 8:
                mo13278n0((zzee) C0583c.m358a(parcel, zzee.CREATOR));
                throw null;
            case 9:
                mo13265H0((zzeg) C0583c.m358a(parcel, zzeg.CREATOR));
                throw null;
            case 10:
                mo13275l((zzea) C0583c.m358a(parcel, zzea.CREATOR));
                break;
            case 11:
                mo13282v0((Status) C0583c.m358a(parcel, Status.CREATOR));
                break;
            case 12:
                mo13261E0((zzge) C0583c.m358a(parcel, zzge.CREATOR));
                throw null;
            case 13:
                mo13271W((zzdy) C0583c.m358a(parcel, zzdy.CREATOR));
                throw null;
            case 14:
                mo13276m0((zzfq) C0583c.m358a(parcel, zzfq.CREATOR));
                throw null;
            case 15:
                mo13258A0((zzbt) C0583c.m358a(parcel, zzbt.CREATOR));
                throw null;
            case 16:
                mo13280q0((zzbt) C0583c.m358a(parcel, zzbt.CREATOR));
                throw null;
            case 17:
                mo13260D0((zzdm) C0583c.m358a(parcel, zzdm.CREATOR));
                throw null;
            case 18:
                mo13273h((zzdo) C0583c.m358a(parcel, zzdo.CREATOR));
                throw null;
            case 19:
                mo13269M0((zzbn) C0583c.m358a(parcel, zzbn.CREATOR));
                throw null;
            case 20:
                mo13259B((zzbp) C0583c.m358a(parcel, zzbp.CREATOR));
                throw null;
            case 22:
                mo13274i0((zzdk) C0583c.m358a(parcel, zzdk.CREATOR));
                throw null;
            case 23:
                mo13266J((zzdi) C0583c.m358a(parcel, zzdi.CREATOR));
                throw null;
            case 26:
                mo13262G((zzf) C0583c.m358a(parcel, zzf.CREATOR));
                throw null;
            case 27:
                mo13281r0((zzfy) C0583c.m358a(parcel, zzfy.CREATOR));
                throw null;
            case 28:
                mo13283z0((zzdr) C0583c.m358a(parcel, zzdr.CREATOR));
                throw null;
            case 29:
                mo13264H((zzdv) C0583c.m358a(parcel, zzdv.CREATOR));
                throw null;
            case 30:
                mo13267L0((zzdt) C0583c.m358a(parcel, zzdt.CREATOR));
                throw null;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
