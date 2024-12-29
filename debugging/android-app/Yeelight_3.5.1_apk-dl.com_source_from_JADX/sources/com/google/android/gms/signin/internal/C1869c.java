package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.C0911g;
import p040h0.C3230a;
import p040h0.C3232c;
import p060l0.C3308c;

/* renamed from: com.google.android.gms.signin.internal.c */
public final class C1869c extends C3230a {
    C1869c(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    /* renamed from: D0 */
    public final void mo14723D0(C0911g gVar, int i, boolean z) {
        Parcel c = mo23785c();
        C3232c.m8689e(c, gVar);
        c.writeInt(i);
        C3232c.m8687c(c, z);
        mo23786e(9, c);
    }

    /* renamed from: E0 */
    public final void mo14724E0(zai zai, C3308c cVar) {
        Parcel c = mo23785c();
        C3232c.m8688d(c, zai);
        C3232c.m8689e(c, cVar);
        mo23786e(12, c);
    }

    /* renamed from: T */
    public final void mo14725T(int i) {
        Parcel c = mo23785c();
        c.writeInt(i);
        mo23786e(7, c);
    }
}
