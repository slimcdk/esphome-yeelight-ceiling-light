package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p011c.p012a.p019b.p028b.p032c.p034b.C0571a;
import p011c.p012a.p019b.p028b.p032c.p034b.C0572b;
import p011c.p012a.p019b.p028b.p032c.p034b.C0573c;

/* renamed from: com.google.android.gms.common.internal.m */
public interface C1584m extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.m$a */
    public static abstract class C1585a extends C0572b implements C1584m {

        /* renamed from: com.google.android.gms.common.internal.m$a$a */
        public static class C1586a extends C0571a implements C1584m {
            C1586a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }

            /* renamed from: j */
            public final Account mo11261j() {
                Parcel e = mo8547e(2, mo8546c());
                Account account = (Account) C0573c.m347b(e, Account.CREATOR);
                e.recycle();
                return account;
            }
        }

        /* renamed from: c */
        public static C1584m m4365c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof C1584m ? (C1584m) queryLocalInterface : new C1586a(iBinder);
        }
    }

    /* renamed from: j */
    Account mo11261j();
}
