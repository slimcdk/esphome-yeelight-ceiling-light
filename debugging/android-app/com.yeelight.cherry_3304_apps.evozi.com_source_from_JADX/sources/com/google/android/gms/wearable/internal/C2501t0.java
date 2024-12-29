package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import java.util.List;
import p011c.p012a.p019b.p028b.p032c.p036d.C0581a;
import p011c.p012a.p019b.p028b.p032c.p036d.C0583c;

/* renamed from: com.google.android.gms.wearable.internal.t0 */
public final class C2501t0 extends C0581a implements C2495r0 {
    C2501t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wearable.internal.IWearableListener");
    }

    /* renamed from: C0 */
    public final void mo13317C0(zzl zzl) {
        Parcel c = mo8555c();
        C0583c.m360c(c, zzl);
        mo8557f(6, c);
    }

    /* renamed from: I */
    public final void mo13318I(zzfo zzfo) {
        Parcel c = mo8555c();
        C0583c.m360c(c, zzfo);
        mo8557f(3, c);
    }

    /* renamed from: L */
    public final void mo13319L(zzah zzah) {
        Parcel c = mo8555c();
        C0583c.m360c(c, zzah);
        mo8557f(8, c);
    }

    /* renamed from: N0 */
    public final void mo13320N0(List<zzfo> list) {
        Parcel c = mo8555c();
        c.writeTypedList(list);
        mo8557f(5, c);
    }

    /* renamed from: V */
    public final void mo13323V(zzi zzi) {
        Parcel c = mo8555c();
        C0583c.m360c(c, zzi);
        mo8557f(9, c);
    }

    /* renamed from: c0 */
    public final void mo13325c0(zzfe zzfe) {
        Parcel c = mo8555c();
        C0583c.m360c(c, zzfe);
        mo8557f(2, c);
    }

    /* renamed from: g */
    public final void mo13326g(zzaw zzaw) {
        Parcel c = mo8555c();
        C0583c.m360c(c, zzaw);
        mo8557f(7, c);
    }

    /* renamed from: v */
    public final void mo13327v(DataHolder dataHolder) {
        Parcel c = mo8555c();
        C0583c.m360c(c, dataHolder);
        mo8557f(1, c);
    }

    /* renamed from: w0 */
    public final void mo13328w0(zzfo zzfo) {
        Parcel c = mo8555c();
        C0583c.m360c(c, zzfo);
        mo8557f(4, c);
    }
}
