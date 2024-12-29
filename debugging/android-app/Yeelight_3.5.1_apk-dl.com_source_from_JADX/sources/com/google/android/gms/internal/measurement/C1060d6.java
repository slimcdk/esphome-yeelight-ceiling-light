package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import androidx.annotation.GuardedBy;
import androidx.core.content.PermissionChecker;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.internal.measurement.d6 */
final class C1060d6 implements C1012a6 {
    @GuardedBy("GservicesLoader.class")

    /* renamed from: c */
    private static C1060d6 f1279c;
    @Nullable

    /* renamed from: a */
    private final Context f1280a;
    @Nullable

    /* renamed from: b */
    private final ContentObserver f1281b;

    private C1060d6() {
        this.f1280a = null;
        this.f1281b = null;
    }

    private C1060d6(Context context) {
        this.f1280a = context;
        C1044c6 c6Var = new C1044c6(this, (Handler) null);
        this.f1281b = c6Var;
        context.getContentResolver().registerContentObserver(C1251p5.f1503a, true, c6Var);
    }

    /* renamed from: b */
    static C1060d6 m1810b(Context context) {
        C1060d6 d6Var;
        synchronized (C1060d6.class) {
            if (f1279c == null) {
                f1279c = PermissionChecker.checkSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new C1060d6(context) : new C1060d6();
            }
            d6Var = f1279c;
        }
        return d6Var;
    }

    /* renamed from: e */
    static synchronized void m1811e() {
        Context context;
        synchronized (C1060d6.class) {
            C1060d6 d6Var = f1279c;
            if (!(d6Var == null || (context = d6Var.f1280a) == null || d6Var.f1281b == null)) {
                context.getContentResolver().unregisterContentObserver(f1279c.f1281b);
            }
            f1279c = null;
        }
    }

    @Nullable
    /* renamed from: c */
    public final String mo12525a(String str) {
        if (this.f1280a == null) {
            return null;
        }
        try {
            return (String) C1390y5.m3297a(new C1028b6(this, str));
        } catch (IllegalStateException | NullPointerException | SecurityException unused) {
            "Unable to read GServices for: ".concat(String.valueOf(str));
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ String mo12650d(String str) {
        return C1251p5.m2448a(this.f1280a.getContentResolver(), str, (String) null);
    }
}
