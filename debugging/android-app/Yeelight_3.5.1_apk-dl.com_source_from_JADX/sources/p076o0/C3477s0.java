package p076o0;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.wearable.C1414a;
import com.google.android.gms.internal.wearable.C1520v0;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.internal.zzd;
import com.google.android.gms.wearable.internal.zzgg;

/* renamed from: o0.s0 */
public final class C3477s0 extends C1414a {
    C3477s0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wearable.internal.IWearableService");
    }

    /* renamed from: D0 */
    public final void mo24312D0(C3468p0 p0Var) {
        Parcel e = mo13578e();
        C1520v0.m3846c(e, p0Var);
        mo13577c(15, e);
    }

    /* renamed from: E0 */
    public final void mo24313E0(C3468p0 p0Var, zzd zzd) {
        Parcel e = mo13578e();
        C1520v0.m3846c(e, p0Var);
        C1520v0.m3845b(e, zzd);
        mo13577c(16, e);
    }

    /* renamed from: F0 */
    public final void mo24314F0(C3468p0 p0Var, zzgg zzgg) {
        Parcel e = mo13578e();
        C1520v0.m3846c(e, p0Var);
        C1520v0.m3845b(e, zzgg);
        mo13577c(17, e);
    }

    /* renamed from: T */
    public final void mo24315T(C3468p0 p0Var, String str, String str2, byte[] bArr) {
        Parcel e = mo13578e();
        C1520v0.m3846c(e, p0Var);
        e.writeString(str);
        e.writeString(str2);
        e.writeByteArray(bArr);
        mo13577c(12, e);
    }

    /* renamed from: f */
    public final void mo24316f(C3468p0 p0Var, PutDataRequest putDataRequest) {
        Parcel e = mo13578e();
        C1520v0.m3846c(e, p0Var);
        C1520v0.m3845b(e, putDataRequest);
        mo13577c(6, e);
    }
}
