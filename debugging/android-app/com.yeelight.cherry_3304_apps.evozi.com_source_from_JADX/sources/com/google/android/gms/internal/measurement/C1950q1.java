package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import androidx.annotation.GuardedBy;
import androidx.core.content.PermissionChecker;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.internal.measurement.q1 */
final class C1950q1 implements C1871l1 {
    @GuardedBy("GservicesLoader.class")

    /* renamed from: c */
    private static C1950q1 f3684c;
    @Nullable

    /* renamed from: a */
    private final Context f3685a;
    @Nullable

    /* renamed from: b */
    private final ContentObserver f3686b;

    private C1950q1() {
        this.f3685a = null;
        this.f3686b = null;
    }

    private C1950q1(Context context) {
        this.f3685a = context;
        this.f3686b = new C1981s1(this, (Handler) null);
        context.getContentResolver().registerContentObserver(C1792g1.f3359a, true, this.f3686b);
    }

    /* renamed from: b */
    static C1950q1 m5827b(Context context) {
        C1950q1 q1Var;
        synchronized (C1950q1.class) {
            if (f3684c == null) {
                f3684c = PermissionChecker.checkSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new C1950q1(context) : new C1950q1();
            }
            q1Var = f3684c;
        }
        return q1Var;
    }

    /* renamed from: c */
    static synchronized void m5828c() {
        synchronized (C1950q1.class) {
            if (!(f3684c == null || f3684c.f3685a == null || f3684c.f3686b == null)) {
                f3684c.f3685a.getContentResolver().unregisterContentObserver(f3684c.f3686b);
            }
            f3684c = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final String mo11597a(String str) {
        if (this.f3685a == null) {
            return null;
        }
        try {
            return (String) C1922o1.m5627a(new C1936p1(this, str));
        } catch (IllegalStateException | SecurityException unused) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "Unable to read GServices for: ".concat(valueOf);
            } else {
                new String("Unable to read GServices for: ");
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ String mo11951d(String str) {
        return C1792g1.m5137a(this.f3685a.getContentResolver(), str, (String) null);
    }
}
