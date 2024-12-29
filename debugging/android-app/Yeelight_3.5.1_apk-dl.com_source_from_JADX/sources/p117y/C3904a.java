package p117y;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.TelemetryData;
import p040h0.C3230a;
import p040h0.C3232c;

/* renamed from: y.a */
public final class C3904a extends C3230a {
    C3904a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    /* renamed from: T */
    public final void mo26386T(TelemetryData telemetryData) {
        Parcel c = mo23785c();
        C3232c.m8688d(c, telemetryData);
        mo23787f(1, c);
    }
}
