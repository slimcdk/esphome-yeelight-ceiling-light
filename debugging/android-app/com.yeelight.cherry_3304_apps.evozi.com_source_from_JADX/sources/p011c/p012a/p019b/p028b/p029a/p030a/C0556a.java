package p011c.p012a.p019b.p028b.p029a.p030a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C1381a;
import com.google.android.gms.common.C1520d;
import com.google.android.gms.common.C1531e;
import com.google.android.gms.common.C1533g;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.stats.C1640a;
import com.google.android.gms.common.util.VisibleForTesting;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import p011c.p012a.p019b.p028b.p032c.p033a.C0568d;
import p011c.p012a.p019b.p028b.p032c.p033a.C0569e;

@KeepForSdk
@ParametersAreNonnullByDefault
/* renamed from: c.a.b.b.a.a.a */
public class C0556a {
    @GuardedBy("this")
    @Nullable

    /* renamed from: a */
    private C1381a f210a;
    @GuardedBy("this")
    @Nullable

    /* renamed from: b */
    private C0568d f211b;
    @GuardedBy("this")

    /* renamed from: c */
    private boolean f212c;

    /* renamed from: d */
    private final Object f213d = new Object();
    @GuardedBy("mAutoDisconnectTaskLock")
    @Nullable

    /* renamed from: e */
    private C0558b f214e;
    @GuardedBy("this")

    /* renamed from: f */
    private final Context f215f;

    /* renamed from: g */
    private final boolean f216g;

    /* renamed from: h */
    private final long f217h;

    @KeepForSdkWithMembers
    /* renamed from: c.a.b.b.a.a.a$a */
    public static final class C0557a {

        /* renamed from: a */
        private final String f218a;

        /* renamed from: b */
        private final boolean f219b;

        public C0557a(String str, boolean z) {
            this.f218a = str;
            this.f219b = z;
        }

        /* renamed from: a */
        public final String mo8532a() {
            return this.f218a;
        }

        /* renamed from: b */
        public final boolean mo8533b() {
            return this.f219b;
        }

        public final String toString() {
            String str = this.f218a;
            boolean z = this.f219b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    @VisibleForTesting
    /* renamed from: c.a.b.b.a.a.a$b */
    static class C0558b extends Thread {

        /* renamed from: a */
        private WeakReference<C0556a> f220a;

        /* renamed from: b */
        private long f221b;

        /* renamed from: c */
        CountDownLatch f222c = new CountDownLatch(1);

        /* renamed from: d */
        boolean f223d = false;

        public C0558b(C0556a aVar, long j) {
            this.f220a = new WeakReference<>(aVar);
            this.f221b = j;
            start();
        }

        /* renamed from: b */
        private final void m329b() {
            C0556a aVar = (C0556a) this.f220a.get();
            if (aVar != null) {
                aVar.mo8529a();
                this.f223d = true;
            }
        }

        public final void run() {
            try {
                if (!this.f222c.await(this.f221b, TimeUnit.MILLISECONDS)) {
                    m329b();
                }
            } catch (InterruptedException unused) {
                m329b();
            }
        }
    }

    @VisibleForTesting
    private C0556a(Context context, long j, boolean z, boolean z2) {
        Context applicationContext;
        C1609u.m4475k(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f215f = context;
        this.f212c = false;
        this.f217h = j;
        this.f216g = z2;
    }

    @KeepForSdk
    /* renamed from: b */
    public static C0557a m318b(Context context) {
        C0560c cVar = new C0560c(context);
        boolean a = cVar.mo8537a("gads:ad_id_app_context:enabled", false);
        float b = cVar.mo8538b("gads:ad_id_app_context:ping_ratio", 0.0f);
        String c = cVar.mo8539c("gads:ad_id_use_shared_preference:experiment_id", "");
        C0556a aVar = new C0556a(context, -1, a, cVar.mo8537a("gads:ad_id_use_persistent_service:enabled", false));
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aVar.m323h(false);
            C0557a c2 = aVar.mo8530c();
            aVar.m324i(c2, a, b, SystemClock.elapsedRealtime() - elapsedRealtime, c, (Throwable) null);
            aVar.mo8529a();
            return c2;
        } catch (Throwable th) {
            aVar.mo8529a();
            throw th;
        }
    }

    @KeepForSdk
    /* renamed from: d */
    public static void m319d(boolean z) {
    }

    /* renamed from: e */
    private static C1381a m320e(Context context, boolean z) {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            int j = C1520d.m4113h().mo11045j(context, C1533g.f2900a);
            if (j == 0 || j == 2) {
                String str = z ? "com.google.android.gms.ads.identifier.service.PERSISTENT_START" : "com.google.android.gms.ads.identifier.service.START";
                C1381a aVar = new C1381a();
                Intent intent = new Intent(str);
                intent.setPackage("com.google.android.gms");
                try {
                    if (C1640a.m4551b().mo11370a(context, intent, aVar, 1)) {
                        return aVar;
                    }
                    throw new IOException("Connection failure");
                } catch (Throwable th) {
                    throw new IOException(th);
                }
            } else {
                throw new IOException("Google Play services not available");
            }
        } catch (PackageManager.NameNotFoundException unused) {
            throw new C1531e(9);
        }
    }

    @VisibleForTesting
    /* renamed from: f */
    private static C0568d m321f(Context context, C1381a aVar) {
        try {
            return C0569e.m341a(aVar.mo10760a(10000, TimeUnit.MILLISECONDS));
        } catch (InterruptedException unused) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|(3:5|6|7)|8|9|(1:11)|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0013 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m322g() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f213d
            monitor-enter(r0)
            c.a.b.b.a.a.a$b r1 = r6.f214e     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x0013
            c.a.b.b.a.a.a$b r1 = r6.f214e     // Catch:{ all -> 0x0026 }
            java.util.concurrent.CountDownLatch r1 = r1.f222c     // Catch:{ all -> 0x0026 }
            r1.countDown()     // Catch:{ all -> 0x0026 }
            c.a.b.b.a.a.a$b r1 = r6.f214e     // Catch:{ InterruptedException -> 0x0013 }
            r1.join()     // Catch:{ InterruptedException -> 0x0013 }
        L_0x0013:
            long r1 = r6.f217h     // Catch:{ all -> 0x0026 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0024
            c.a.b.b.a.a.a$b r1 = new c.a.b.b.a.a.a$b     // Catch:{ all -> 0x0026 }
            long r2 = r6.f217h     // Catch:{ all -> 0x0026 }
            r1.<init>(r6, r2)     // Catch:{ all -> 0x0026 }
            r6.f214e = r1     // Catch:{ all -> 0x0026 }
        L_0x0024:
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            return
        L_0x0026:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p012a.p019b.p028b.p029a.p030a.C0556a.m322g():void");
    }

    @VisibleForTesting
    /* renamed from: h */
    private final void m323h(boolean z) {
        C1609u.m4474j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f212c) {
                mo8529a();
            }
            C1381a e = m320e(this.f215f, this.f216g);
            this.f210a = e;
            this.f211b = m321f(this.f215f, e);
            this.f212c = true;
            if (z) {
                m322g();
            }
        }
    }

    @VisibleForTesting
    /* renamed from: i */
    private final boolean m324i(C0557a aVar, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() > ((double) f)) {
            return false;
        }
        HashMap hashMap = new HashMap();
        String str2 = TimerCodec.ENABLE;
        hashMap.put("app_context", z ? str2 : TimerCodec.DISENABLE);
        if (aVar != null) {
            if (!aVar.mo8533b()) {
                str2 = TimerCodec.DISENABLE;
            }
            hashMap.put("limit_ad_tracking", str2);
        }
        if (!(aVar == null || aVar.mo8532a() == null)) {
            hashMap.put("ad_id_size", Integer.toString(aVar.mo8532a().length()));
        }
        if (th != null) {
            hashMap.put(XiaomiOAuthConstants.EXTRA_ERROR_CODE_2, th.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            hashMap.put("experiment_id", str);
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j));
        new C0559b(this, hashMap).start();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8529a() {
        /*
            r3 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.common.internal.C1609u.m4474j(r0)
            monitor-enter(r3)
            android.content.Context r0 = r3.f215f     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x0028
            com.google.android.gms.common.a r0 = r3.f210a     // Catch:{ all -> 0x002a }
            if (r0 != 0) goto L_0x000f
            goto L_0x0028
        L_0x000f:
            boolean r0 = r3.f212c     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x001e
            com.google.android.gms.common.stats.a r0 = com.google.android.gms.common.stats.C1640a.m4551b()     // Catch:{ all -> 0x001e }
            android.content.Context r1 = r3.f215f     // Catch:{ all -> 0x001e }
            com.google.android.gms.common.a r2 = r3.f210a     // Catch:{ all -> 0x001e }
            r0.mo11371c(r1, r2)     // Catch:{ all -> 0x001e }
        L_0x001e:
            r0 = 0
            r3.f212c = r0     // Catch:{ all -> 0x002a }
            r0 = 0
            r3.f211b = r0     // Catch:{ all -> 0x002a }
            r3.f210a = r0     // Catch:{ all -> 0x002a }
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            return
        L_0x0028:
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            return
        L_0x002a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p012a.p019b.p028b.p029a.p030a.C0556a.mo8529a():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:39|40|41) */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0065, code lost:
        throw new java.io.IOException("Remote exception");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x005e */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p011c.p012a.p019b.p028b.p029a.p030a.C0556a.C0557a mo8530c() {
        /*
            r4 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.common.internal.C1609u.m4474j(r0)
            monitor-enter(r4)
            boolean r0 = r4.f212c     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x003d
            java.lang.Object r0 = r4.f213d     // Catch:{ all -> 0x0066 }
            monitor-enter(r0)     // Catch:{ all -> 0x0066 }
            c.a.b.b.a.a.a$b r1 = r4.f214e     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0032
            c.a.b.b.a.a.a$b r1 = r4.f214e     // Catch:{ all -> 0x003a }
            boolean r1 = r1.f223d     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0032
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            r0 = 0
            r4.m323h(r0)     // Catch:{ Exception -> 0x0029 }
            boolean r0 = r4.f212c     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x0021
            goto L_0x003d
        L_0x0021:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "AdvertisingIdClient cannot reconnect."
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x0029:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0066 }
            java.lang.String r2 = "AdvertisingIdClient cannot reconnect."
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0066 }
            throw r1     // Catch:{ all -> 0x0066 }
        L_0x0032:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x003a }
            java.lang.String r2 = "AdvertisingIdClient is not connected."
            r1.<init>(r2)     // Catch:{ all -> 0x003a }
            throw r1     // Catch:{ all -> 0x003a }
        L_0x003a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            throw r1     // Catch:{ all -> 0x0066 }
        L_0x003d:
            com.google.android.gms.common.a r0 = r4.f210a     // Catch:{ all -> 0x0066 }
            com.google.android.gms.common.internal.C1609u.m4475k(r0)     // Catch:{ all -> 0x0066 }
            c.a.b.b.c.a.d r0 = r4.f211b     // Catch:{ all -> 0x0066 }
            com.google.android.gms.common.internal.C1609u.m4475k(r0)     // Catch:{ all -> 0x0066 }
            c.a.b.b.a.a.a$a r0 = new c.a.b.b.a.a.a$a     // Catch:{ RemoteException -> 0x005e }
            c.a.b.b.c.a.d r1 = r4.f211b     // Catch:{ RemoteException -> 0x005e }
            java.lang.String r1 = r1.getId()     // Catch:{ RemoteException -> 0x005e }
            c.a.b.b.c.a.d r2 = r4.f211b     // Catch:{ RemoteException -> 0x005e }
            r3 = 1
            boolean r2 = r2.mo8543d(r3)     // Catch:{ RemoteException -> 0x005e }
            r0.<init>(r1, r2)     // Catch:{ RemoteException -> 0x005e }
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            r4.m322g()
            return r0
        L_0x005e:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "Remote exception"
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p012a.p019b.p028b.p029a.p030a.C0556a.mo8530c():c.a.b.b.a.a.a$a");
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        mo8529a();
        super.finalize();
    }
}
