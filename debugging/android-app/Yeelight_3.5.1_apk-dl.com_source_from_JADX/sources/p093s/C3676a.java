package p093s;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0877b;
import com.google.android.gms.common.C0879d;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.stats.C0956a;
import com.google.android.gms.common.util.VisibleForTesting;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import p036g0.C3211e;
import p036g0.C3212f;
import p101u.C3706a;

@KeepForSdk
@ParametersAreNonnullByDefault
/* renamed from: s.a */
public class C3676a {
    @GuardedBy("this")
    @Nullable

    /* renamed from: a */
    C3706a f6191a;
    @GuardedBy("this")
    @Nullable

    /* renamed from: b */
    C3212f f6192b;
    @GuardedBy("this")

    /* renamed from: c */
    boolean f6193c;

    /* renamed from: d */
    final Object f6194d = new Object();
    @GuardedBy("mAutoDisconnectTaskLock")
    @Nullable

    /* renamed from: e */
    C3679c f6195e;
    @GuardedBy("this")

    /* renamed from: f */
    private final Context f6196f;

    /* renamed from: g */
    final long f6197g;

    @KeepForSdkWithMembers
    /* renamed from: s.a$a */
    public static final class C3677a {
        @Nullable

        /* renamed from: a */
        private final String f6198a;

        /* renamed from: b */
        private final boolean f6199b;

        @Deprecated
        public C3677a(@Nullable String str, boolean z) {
            this.f6198a = str;
            this.f6199b = z;
        }

        @Nullable
        /* renamed from: a */
        public String mo26085a() {
            return this.f6198a;
        }

        /* renamed from: b */
        public boolean mo26086b() {
            return this.f6199b;
        }

        @NonNull
        public String toString() {
            String str = this.f6198a;
            boolean z = this.f6199b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    @VisibleForTesting
    public C3676a(@NonNull Context context, long j, boolean z, boolean z2) {
        Context applicationContext;
        C0917i.m1419j(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f6196f = context;
        this.f6193c = false;
        this.f6197g = j;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public static C3677a m10512a(@NonNull Context context) {
        C3676a aVar = new C3676a(context, -1, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aVar.mo26082d(false);
            C3677a f = aVar.m10514f(-1);
            aVar.mo26083e(f, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, "", (Throwable) null);
            aVar.mo26081c();
            return f;
        } catch (Throwable th) {
            aVar.mo26081c();
            throw th;
        }
    }

    @ShowFirstParty
    @KeepForSdk
    /* renamed from: b */
    public static void m10513b(boolean z) {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:39|40|41) */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0063, code lost:
        throw new java.io.IOException("Remote exception");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x005c */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p093s.C3676a.C3677a m10514f(int r4) {
        /*
            r3 = this;
            java.lang.String r4 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.common.internal.C0917i.m1418i(r4)
            monitor-enter(r3)
            boolean r4 = r3.f6193c     // Catch:{ all -> 0x0064 }
            if (r4 != 0) goto L_0x003b
            java.lang.Object r4 = r3.f6194d     // Catch:{ all -> 0x0064 }
            monitor-enter(r4)     // Catch:{ all -> 0x0064 }
            s.c r0 = r3.f6195e     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0030
            boolean r0 = r0.f6204d     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0030
            monitor-exit(r4)     // Catch:{ all -> 0x0038 }
            r4 = 0
            r3.mo26082d(r4)     // Catch:{ Exception -> 0x0027 }
            boolean r4 = r3.f6193c     // Catch:{ all -> 0x0064 }
            if (r4 == 0) goto L_0x001f
            goto L_0x003b
        L_0x001f:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x0064 }
            java.lang.String r0 = "AdvertisingIdClient cannot reconnect."
            r4.<init>(r0)     // Catch:{ all -> 0x0064 }
            throw r4     // Catch:{ all -> 0x0064 }
        L_0x0027:
            r4 = move-exception
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0064 }
            java.lang.String r1 = "AdvertisingIdClient cannot reconnect."
            r0.<init>(r1, r4)     // Catch:{ all -> 0x0064 }
            throw r0     // Catch:{ all -> 0x0064 }
        L_0x0030:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0038 }
            java.lang.String r1 = "AdvertisingIdClient is not connected."
            r0.<init>(r1)     // Catch:{ all -> 0x0038 }
            throw r0     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0038 }
            throw r0     // Catch:{ all -> 0x0064 }
        L_0x003b:
            u.a r4 = r3.f6191a     // Catch:{ all -> 0x0064 }
            com.google.android.gms.common.internal.C0917i.m1419j(r4)     // Catch:{ all -> 0x0064 }
            g0.f r4 = r3.f6192b     // Catch:{ all -> 0x0064 }
            com.google.android.gms.common.internal.C0917i.m1419j(r4)     // Catch:{ all -> 0x0064 }
            s.a$a r4 = new s.a$a     // Catch:{ RemoteException -> 0x005c }
            g0.f r0 = r3.f6192b     // Catch:{ RemoteException -> 0x005c }
            java.lang.String r0 = r0.mo23774E()     // Catch:{ RemoteException -> 0x005c }
            g0.f r1 = r3.f6192b     // Catch:{ RemoteException -> 0x005c }
            r2 = 1
            boolean r1 = r1.mo23775s(r2)     // Catch:{ RemoteException -> 0x005c }
            r4.<init>(r0, r1)     // Catch:{ RemoteException -> 0x005c }
            monitor-exit(r3)     // Catch:{ all -> 0x0064 }
            r3.m10515g()
            return r4
        L_0x005c:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x0064 }
            java.lang.String r0 = "Remote exception"
            r4.<init>(r0)     // Catch:{ all -> 0x0064 }
            throw r4     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0064 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p093s.C3676a.m10514f(int):s.a$a");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|(3:5|6|7)|8|9|(1:11)|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0011 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0019  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m10515g() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f6194d
            monitor-enter(r0)
            s.c r1 = r6.f6195e     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x0011
            java.util.concurrent.CountDownLatch r1 = r1.f6203c     // Catch:{ all -> 0x0022 }
            r1.countDown()     // Catch:{ all -> 0x0022 }
            s.c r1 = r6.f6195e     // Catch:{ InterruptedException -> 0x0011 }
            r1.join()     // Catch:{ InterruptedException -> 0x0011 }
        L_0x0011:
            long r1 = r6.f6197g     // Catch:{ all -> 0x0022 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0020
            s.c r3 = new s.c     // Catch:{ all -> 0x0022 }
            r3.<init>(r6, r1)     // Catch:{ all -> 0x0022 }
            r6.f6195e = r3     // Catch:{ all -> 0x0022 }
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            return
        L_0x0022:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p093s.C3676a.m10515g():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo26081c() {
        /*
            r3 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.common.internal.C0917i.m1418i(r0)
            monitor-enter(r3)
            android.content.Context r0 = r3.f6196f     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x0028
            u.a r0 = r3.f6191a     // Catch:{ all -> 0x002a }
            if (r0 != 0) goto L_0x000f
            goto L_0x0028
        L_0x000f:
            boolean r0 = r3.f6193c     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x001e
            com.google.android.gms.common.stats.a r0 = com.google.android.gms.common.stats.C0956a.m1580b()     // Catch:{ all -> 0x001e }
            android.content.Context r1 = r3.f6196f     // Catch:{ all -> 0x001e }
            u.a r2 = r3.f6191a     // Catch:{ all -> 0x001e }
            r0.mo12424c(r1, r2)     // Catch:{ all -> 0x001e }
        L_0x001e:
            r0 = 0
            r3.f6193c = r0     // Catch:{ all -> 0x002a }
            r0 = 0
            r3.f6192b = r0     // Catch:{ all -> 0x002a }
            r3.f6191a = r0     // Catch:{ all -> 0x002a }
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
        throw new UnsupportedOperationException("Method not decompiled: p093s.C3676a.mo26081c():void");
    }

    /* access modifiers changed from: protected */
    @VisibleForTesting
    /* renamed from: d */
    public final void mo26082d(boolean z) {
        C0917i.m1418i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f6193c) {
                mo26081c();
            }
            Context context = this.f6196f;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int j = C0877b.m1212h().mo11774j(context, C0879d.f886a);
                if (j != 0) {
                    if (j != 2) {
                        throw new IOException("Google Play services not available");
                    }
                }
                C3706a aVar = new C3706a();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (C0956a.m1580b().mo12423a(context, intent, aVar, 1)) {
                    this.f6191a = aVar;
                    this.f6192b = C3211e.m8641c(aVar.mo26120a(10000, TimeUnit.MILLISECONDS));
                    this.f6193c = true;
                    if (z) {
                        m10515g();
                    }
                } else {
                    throw new IOException("Connection failure");
                }
            } catch (PackageManager.NameNotFoundException unused) {
                throw new GooglePlayServicesNotAvailableException(9);
            } catch (InterruptedException unused2) {
                throw new IOException("Interrupted exception");
            } catch (Throwable th) {
                throw new IOException(th);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: e */
    public final boolean mo26083e(@Nullable C3677a aVar, boolean z, float f, long j, String str, @Nullable Throwable th) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap hashMap = new HashMap();
        String str2 = TimerCodec.ENABLE;
        hashMap.put("app_context", str2);
        if (aVar != null) {
            if (true != aVar.mo26086b()) {
                str2 = TimerCodec.DISENABLE;
            }
            hashMap.put("limit_ad_tracking", str2);
            String a = aVar.mo26085a();
            if (a != null) {
                hashMap.put("ad_id_size", Integer.toString(a.length()));
            }
        }
        if (th != null) {
            hashMap.put(XiaomiOAuthConstants.EXTRA_ERROR_CODE_2, th.getClass().getName());
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j));
        new C3678b(this, hashMap).start();
        return true;
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        mo26081c();
        super.finalize();
    }
}
