package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.C1660n;
import java.util.concurrent.ExecutorService;
import javax.annotation.concurrent.GuardedBy;
import p011c.p012a.p019b.p028b.p038e.C0619h;
import p011c.p012a.p019b.p028b.p038e.C0623k;

/* renamed from: com.google.firebase.iid.c */
public final class C3210c implements C3211c0 {

    /* renamed from: c */
    private static final Object f6206c = new Object();
    @GuardedBy("lock")

    /* renamed from: d */
    private static C3234k0 f6207d;

    /* renamed from: a */
    private final Context f6208a;

    /* renamed from: b */
    private final ExecutorService f6209b;

    public C3210c(Context context, ExecutorService executorService) {
        this.f6208a = context;
        this.f6209b = executorService;
    }

    /* renamed from: a */
    static final /* synthetic */ C0619h m10038a(Context context, Intent intent, C0619h hVar) {
        return (!C1660n.m4609i() || ((Integer) hVar.mo8650k()).intValue() != 402) ? hVar : m10042f(context, intent).mo8647h(C3250s0.m10106a(), C3244p0.f6276a);
    }

    /* renamed from: c */
    private static C3234k0 m10039c(Context context, String str) {
        C3234k0 k0Var;
        synchronized (f6206c) {
            if (f6207d == null) {
                f6207d = new C3234k0(context, str);
            }
            k0Var = f6207d;
        }
        return k0Var;
    }

    /* renamed from: e */
    static final /* synthetic */ Integer m10041e(C0619h hVar) {
        return -1;
    }

    /* renamed from: f */
    private static C0619h<Integer> m10042f(Context context, Intent intent) {
        boolean isLoggable = Log.isLoggable("FirebaseInstanceId", 3);
        return m10039c(context, "com.google.firebase.MESSAGING_EVENT").mo17841a(intent).mo8647h(C3250s0.m10106a(), C3246q0.f6282a);
    }

    /* renamed from: g */
    static final /* synthetic */ Integer m10043g(C0619h hVar) {
        return 403;
    }

    /* renamed from: b */
    public final C0619h<Integer> mo17810b(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        boolean z = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = this.f6208a;
        boolean z2 = C1660n.m4609i() && context.getApplicationInfo().targetSdkVersion >= 26;
        if ((intent.getFlags() & 268435456) != 0) {
            z = true;
        }
        return (!z2 || z) ? C0623k.m536c(this.f6209b, new C3242o0(context, intent)).mo8648i(this.f6209b, new C3240n0(context, intent)) : m10042f(context, intent);
    }
}
