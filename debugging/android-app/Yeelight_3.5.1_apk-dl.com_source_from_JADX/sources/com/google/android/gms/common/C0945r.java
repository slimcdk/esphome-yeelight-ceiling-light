package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.errorprone.annotations.CheckReturnValue;
import java.security.MessageDigest;
import p014c0.C0612a;
import p014c0.C0621j;
import p032f0.C3157b;
import p101u.C3709d;
import p109w.C3828a0;
import p109w.C3866z;

@CheckReturnValue
/* renamed from: com.google.android.gms.common.r */
final class C0945r {

    /* renamed from: a */
    static final C0943p f1111a = new C0938l(C0941n.m1525f("0\u0004C0\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000ÂàFdJ00"));

    /* renamed from: b */
    static final C0943p f1112b = new C0939m(C0941n.m1525f("0\u0004¨0\u0003 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ¸l}ÓNõ0"));

    /* renamed from: c */
    private static volatile C3828a0 f1113c;

    /* renamed from: d */
    private static final Object f1114d = new Object();

    /* renamed from: e */
    private static Context f1115e;

    static {
        new C0936j(C0941n.m1525f("0\u0005È0\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010e\bsù/Qí"));
        new C0937k(C0941n.m1525f("0\u0006\u00040\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²­×árÊkì"));
    }

    /* renamed from: a */
    static C0964w m1532a(String str, C0941n nVar, boolean z, boolean z2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return m1537f(str, nVar, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* renamed from: b */
    static C0964w m1533b(String str, boolean z, boolean z2, boolean z3) {
        return m1538g(str, z, false, false, true);
    }

    /* renamed from: c */
    static /* synthetic */ String m1534c(boolean z, String str, C0941n nVar) {
        String str2 = true != (!z && m1537f(str, nVar, true, false).f1177a) ? "not allowed" : "debug cert rejected";
        MessageDigest b = C0612a.m186b("SHA-256");
        C0917i.m1419j(b);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", new Object[]{str2, str, C0621j.m218a(b.digest(nVar.mo12361T())), Boolean.valueOf(z), "12451000.false"});
    }

    /* renamed from: d */
    static synchronized void m1535d(Context context) {
        synchronized (C0945r.class) {
            if (f1115e != null) {
                return;
            }
            if (context != null) {
                f1115e = context.getApplicationContext();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    static boolean m1536e() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            m1539h();
            boolean d = f1113c.mo26301d();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return d;
        } catch (RemoteException | DynamiteModule.LoadingException unused) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return false;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    /* renamed from: f */
    private static C0964w m1537f(String str, C0941n nVar, boolean z, boolean z2) {
        try {
            m1539h();
            C0917i.m1419j(f1115e);
            try {
                return f1113c.mo26302o0(new zzs(str, nVar, z, z2), C3157b.m8427T(f1115e.getPackageManager())) ? C0964w.m1592b() : new C0963v(new C0888i(z, str, nVar), (C3709d) null);
            } catch (RemoteException e) {
                return C0964w.m1594d("module call", e);
            }
        } catch (DynamiteModule.LoadingException e2) {
            return C0964w.m1594d("module init: ".concat(String.valueOf(e2.getMessage())), e2);
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [f0.a, android.os.IBinder] */
    /* renamed from: g */
    private static C0964w m1538g(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        C0964w wVar;
        String concat;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            C0917i.m1419j(f1115e);
            try {
                m1539h();
                zzo zzo = new zzo(str, z, false, C3157b.m8427T(f1115e), false);
                zzq P = z4 ? f1113c.mo26299P(zzo) : f1113c.mo26300c0(zzo);
                if (P.mo12436W()) {
                    wVar = C0964w.m1595f(P.mo12437c0());
                } else {
                    String V = P.mo12435V();
                    PackageManager.NameNotFoundException nameNotFoundException = P.mo12438d0() == 4 ? new PackageManager.NameNotFoundException() : null;
                    if (V == null) {
                        V = "error checking package certificate";
                    }
                    wVar = C0964w.m1596g(P.mo12437c0(), P.mo12438d0(), V, nameNotFoundException);
                }
            } catch (DynamiteModule.LoadingException e) {
                e = e;
                concat = "module init: ".concat(String.valueOf(e.getMessage()));
                wVar = C0964w.m1594d(concat, e);
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return wVar;
            }
        } catch (RemoteException e2) {
            e = e2;
            concat = "module call";
            wVar = C0964w.m1594d(concat, e);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return wVar;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return wVar;
    }

    /* renamed from: h */
    private static void m1539h() {
        if (f1113c == null) {
            C0917i.m1419j(f1115e);
            synchronized (f1114d) {
                if (f1113c == null) {
                    f1113c = C3866z.m10972e(DynamiteModule.m1606d(f1115e, DynamiteModule.f1194c, "com.google.android.gms.googlecertificates").mo12441c("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            }
        }
    }
}
