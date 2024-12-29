package p109w;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.zzo;
import com.google.android.gms.common.zzq;
import com.google.android.gms.common.zzs;
import com.google.android.gms.internal.common.C0988a;
import com.google.android.gms.internal.common.C0997j;
import p032f0.C3155a;

/* renamed from: w.y */
public final class C3865y extends C0988a implements C3828a0 {
    C3865y(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    /* renamed from: P */
    public final zzq mo26299P(zzo zzo) {
        Parcel e = mo12459e();
        C0997j.m1655d(e, zzo);
        Parcel c = mo12458c(6, e);
        zzq zzq = (zzq) C0997j.m1652a(c, zzq.CREATOR);
        c.recycle();
        return zzq;
    }

    /* renamed from: c0 */
    public final zzq mo26300c0(zzo zzo) {
        Parcel e = mo12459e();
        C0997j.m1655d(e, zzo);
        Parcel c = mo12458c(8, e);
        zzq zzq = (zzq) C0997j.m1652a(c, zzq.CREATOR);
        c.recycle();
        return zzq;
    }

    /* renamed from: d */
    public final boolean mo26301d() {
        Parcel c = mo12458c(7, mo12459e());
        boolean f = C0997j.m1657f(c);
        c.recycle();
        return f;
    }

    /* renamed from: o0 */
    public final boolean mo26302o0(zzs zzs, C3155a aVar) {
        Parcel e = mo12459e();
        C0997j.m1655d(e, zzs);
        C0997j.m1656e(e, aVar);
        Parcel c = mo12458c(5, e);
        boolean f = C0997j.m1657f(c);
        c.recycle();
        return f;
    }
}
