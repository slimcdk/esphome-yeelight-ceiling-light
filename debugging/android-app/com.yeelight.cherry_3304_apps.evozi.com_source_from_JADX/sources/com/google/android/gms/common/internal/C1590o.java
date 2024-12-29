package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p011c.p012a.p019b.p028b.p032c.p034b.C0572b;
import p011c.p012a.p019b.p028b.p032c.p034b.C0573c;

/* renamed from: com.google.android.gms.common.internal.o */
public interface C1590o extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.o$a */
    public static abstract class C1591a extends C0572b implements C1590o {
        public C1591a() {
            super("com.google.android.gms.common.internal.IGmsCallbacks");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo8548a(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                mo11189h0(parcel.readInt(), parcel.readStrongBinder(), (Bundle) C0573c.m347b(parcel, Bundle.CREATOR));
            } else if (i == 2) {
                mo11188a0(parcel.readInt(), (Bundle) C0573c.m347b(parcel, Bundle.CREATOR));
            } else if (i != 3) {
                return false;
            } else {
                mo11187T(parcel.readInt(), parcel.readStrongBinder(), (zzb) C0573c.m347b(parcel, zzb.CREATOR));
            }
            parcel2.writeNoException();
            return true;
        }
    }

    /* renamed from: T */
    void mo11187T(int i, IBinder iBinder, zzb zzb);

    /* renamed from: a0 */
    void mo11188a0(int i, Bundle bundle);

    /* renamed from: h0 */
    void mo11189h0(int i, IBinder iBinder, Bundle bundle);
}
