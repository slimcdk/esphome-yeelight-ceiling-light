package com.google.firebase.iid;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.p106s.C1666b;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;
import p011c.p012a.p019b.p028b.p032c.p035c.C0575a;
import p011c.p012a.p019b.p028b.p032c.p035c.C0580f;
import p011c.p012a.p019b.p028b.p038e.C0619h;

/* renamed from: com.google.firebase.iid.e */
public final class C3216e {
    @GuardedBy("MessengerIpcClient.class")

    /* renamed from: e */
    private static C3216e f6225e;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f6226a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ScheduledExecutorService f6227b;
    @GuardedBy("this")

    /* renamed from: c */
    private C3219f f6228c = new C3219f(this);
    @GuardedBy("this")

    /* renamed from: d */
    private int f6229d = 1;

    @VisibleForTesting
    private C3216e(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f6227b = scheduledExecutorService;
        this.f6226a = context.getApplicationContext();
    }

    /* renamed from: a */
    private final synchronized int m10054a() {
        int i;
        i = this.f6229d;
        this.f6229d = i + 1;
        return i;
    }

    /* renamed from: c */
    private final synchronized <T> C0619h<T> m10056c(C3243p<T> pVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(pVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            sb.toString();
        }
        if (!this.f6228c.mo17824e(pVar)) {
            C3219f fVar = new C3219f(this);
            this.f6228c = fVar;
            fVar.mo17824e(pVar);
        }
        return pVar.f6273b.mo8666a();
    }

    /* renamed from: d */
    public static synchronized C3216e m10057d(Context context) {
        C3216e eVar;
        synchronized (C3216e.class) {
            if (f6225e == null) {
                f6225e = new C3216e(context, C0575a.m351a().mo8552a(1, new C1666b("MessengerIpcClient"), C0580f.f232a));
            }
            eVar = f6225e;
        }
        return eVar;
    }

    /* renamed from: e */
    public final C0619h<Bundle> mo17816e(int i, Bundle bundle) {
        return m10056c(new C3247r(m10054a(), 1, bundle));
    }
}
