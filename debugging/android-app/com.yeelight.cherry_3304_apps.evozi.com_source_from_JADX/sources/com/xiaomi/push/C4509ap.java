package com.xiaomi.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.xiaomi.push.ap */
class C4509ap implements C4513ar {

    /* renamed from: a */
    private static boolean f8173a;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public volatile int f8174a = 0;

    /* renamed from: a */
    private Context f8175a;

    /* renamed from: a */
    private ServiceConnection f8176a;

    /* renamed from: a */
    private final Object f8177a = new Object();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public volatile String f8178a = null;

    /* renamed from: b */
    private volatile String f8179b = null;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public volatile boolean f8180b = false;

    /* renamed from: com.xiaomi.push.ap$a */
    private class C4510a implements ServiceConnection {
        private C4510a() {
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0052 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0073 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0030 */
        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onServiceConnected(android.content.ComponentName r3, android.os.IBinder r4) {
            /*
                r2 = this;
                r3 = 2
                com.xiaomi.push.ap r0 = com.xiaomi.push.C4509ap.this     // Catch:{ Exception -> 0x0056, all -> 0x0034 }
                java.lang.String r1 = com.xiaomi.push.C4509ap.C4511b.m13317a((android.os.IBinder) r4)     // Catch:{ Exception -> 0x0056, all -> 0x0034 }
                java.lang.String unused = r0.f8178a = r1     // Catch:{ Exception -> 0x0056, all -> 0x0034 }
                com.xiaomi.push.ap r0 = com.xiaomi.push.C4509ap.this     // Catch:{ Exception -> 0x0056, all -> 0x0034 }
                boolean r4 = com.xiaomi.push.C4509ap.C4511b.m13317a((android.os.IBinder) r4)     // Catch:{ Exception -> 0x0056, all -> 0x0034 }
                boolean unused = r0.f8180b = r4     // Catch:{ Exception -> 0x0056, all -> 0x0034 }
                com.xiaomi.push.ap r4 = com.xiaomi.push.C4509ap.this
                com.xiaomi.push.C4509ap.m13303a((com.xiaomi.push.C4509ap) r4)
                com.xiaomi.push.ap r4 = com.xiaomi.push.C4509ap.this
                int unused = r4.f8174a = r3
                com.xiaomi.push.ap r3 = com.xiaomi.push.C4509ap.this
                java.lang.Object r4 = com.xiaomi.push.C4509ap.m13303a((com.xiaomi.push.C4509ap) r3)
                monitor-enter(r4)
                com.xiaomi.push.ap r3 = com.xiaomi.push.C4509ap.this     // Catch:{ Exception -> 0x0030 }
                java.lang.Object r3 = com.xiaomi.push.C4509ap.m13303a((com.xiaomi.push.C4509ap) r3)     // Catch:{ Exception -> 0x0030 }
                r3.notifyAll()     // Catch:{ Exception -> 0x0030 }
                goto L_0x0030
            L_0x002e:
                r3 = move-exception
                goto L_0x0032
            L_0x0030:
                monitor-exit(r4)     // Catch:{ all -> 0x002e }
                goto L_0x0074
            L_0x0032:
                monitor-exit(r4)     // Catch:{ all -> 0x002e }
                throw r3
            L_0x0034:
                r4 = move-exception
                com.xiaomi.push.ap r0 = com.xiaomi.push.C4509ap.this
                com.xiaomi.push.C4509ap.m13303a((com.xiaomi.push.C4509ap) r0)
                com.xiaomi.push.ap r0 = com.xiaomi.push.C4509ap.this
                int unused = r0.f8174a = r3
                com.xiaomi.push.ap r3 = com.xiaomi.push.C4509ap.this
                java.lang.Object r0 = com.xiaomi.push.C4509ap.m13303a((com.xiaomi.push.C4509ap) r3)
                monitor-enter(r0)
                com.xiaomi.push.ap r3 = com.xiaomi.push.C4509ap.this     // Catch:{ Exception -> 0x0052 }
                java.lang.Object r3 = com.xiaomi.push.C4509ap.m13303a((com.xiaomi.push.C4509ap) r3)     // Catch:{ Exception -> 0x0052 }
                r3.notifyAll()     // Catch:{ Exception -> 0x0052 }
                goto L_0x0052
            L_0x0050:
                r3 = move-exception
                goto L_0x0054
            L_0x0052:
                monitor-exit(r0)     // Catch:{ all -> 0x0050 }
                throw r4
            L_0x0054:
                monitor-exit(r0)     // Catch:{ all -> 0x0050 }
                throw r3
            L_0x0056:
                com.xiaomi.push.ap r4 = com.xiaomi.push.C4509ap.this
                com.xiaomi.push.C4509ap.m13303a((com.xiaomi.push.C4509ap) r4)
                com.xiaomi.push.ap r4 = com.xiaomi.push.C4509ap.this
                int unused = r4.f8174a = r3
                com.xiaomi.push.ap r3 = com.xiaomi.push.C4509ap.this
                java.lang.Object r3 = com.xiaomi.push.C4509ap.m13303a((com.xiaomi.push.C4509ap) r3)
                monitor-enter(r3)
                com.xiaomi.push.ap r4 = com.xiaomi.push.C4509ap.this     // Catch:{ Exception -> 0x0073 }
                java.lang.Object r4 = com.xiaomi.push.C4509ap.m13303a((com.xiaomi.push.C4509ap) r4)     // Catch:{ Exception -> 0x0073 }
                r4.notifyAll()     // Catch:{ Exception -> 0x0073 }
                goto L_0x0073
            L_0x0071:
                r4 = move-exception
                goto L_0x0075
            L_0x0073:
                monitor-exit(r3)     // Catch:{ all -> 0x0071 }
            L_0x0074:
                return
            L_0x0075:
                monitor-exit(r3)     // Catch:{ all -> 0x0071 }
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4509ap.C4510a.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: com.xiaomi.push.ap$b */
    private static class C4511b {
        /* renamed from: a */
        static String m13317a(IBinder iBinder) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                iBinder.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        /* renamed from: a */
        static boolean m13318a(IBinder iBinder) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                boolean z = false;
                iBinder.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() != 0) {
                    z = true;
                }
                return z;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    public C4509ap(Context context) {
        this.f8175a = context;
        mo24744a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0027 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m13304a(android.content.Context r5) {
        /*
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0024 }
            r2 = 24
            r3 = 0
            java.lang.String r4 = "aaid"
            if (r1 < r2) goto L_0x0019
            android.content.Context r1 = r5.createDeviceProtectedStorageContext()     // Catch:{ Exception -> 0x0024 }
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r4, r3)     // Catch:{ Exception -> 0x0024 }
            java.lang.String r1 = r1.getString(r4, r0)     // Catch:{ Exception -> 0x0024 }
            if (r1 == 0) goto L_0x001a
            return r1
        L_0x0019:
            r1 = r0
        L_0x001a:
            android.content.SharedPreferences r5 = r5.getSharedPreferences(r4, r3)     // Catch:{ Exception -> 0x0023 }
            java.lang.String r5 = r5.getString(r4, r0)     // Catch:{ Exception -> 0x0023 }
            goto L_0x0025
        L_0x0023:
            r0 = r1
        L_0x0024:
            r5 = r0
        L_0x0025:
            if (r5 != 0) goto L_0x0029
            java.lang.String r5 = ""
        L_0x0029:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4509ap.m13304a(android.content.Context):java.lang.String");
    }

    /* renamed from: a */
    private void mo24744a() {
        boolean z;
        this.f8176a = new C4510a();
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        int i = 1;
        try {
            z = this.f8175a.bindService(intent, this.f8176a, 1);
        } catch (Exception unused) {
            z = false;
        }
        if (!z) {
            i = 2;
        }
        this.f8174a = i;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m13308a(java.lang.String r4) {
        /*
            r3 = this;
            int r0 = r3.f8174a
            r1 = 1
            if (r0 != r1) goto L_0x0039
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 == r1) goto L_0x0039
            java.lang.Object r0 = r3.f8177a
            monitor-enter(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0035 }
            r1.<init>()     // Catch:{ Exception -> 0x0035 }
            java.lang.String r2 = "huawei's "
            r1.append(r2)     // Catch:{ Exception -> 0x0035 }
            r1.append(r4)     // Catch:{ Exception -> 0x0035 }
            java.lang.String r4 = " wait..."
            r1.append(r4)     // Catch:{ Exception -> 0x0035 }
            java.lang.String r4 = r1.toString()     // Catch:{ Exception -> 0x0035 }
            com.xiaomi.channel.commonutils.logger.C3989b.m10669a((java.lang.String) r4)     // Catch:{ Exception -> 0x0035 }
            java.lang.Object r4 = r3.f8177a     // Catch:{ Exception -> 0x0035 }
            r1 = 3000(0xbb8, double:1.482E-320)
            r4.wait(r1)     // Catch:{ Exception -> 0x0035 }
            goto L_0x0035
        L_0x0033:
            r4 = move-exception
            goto L_0x0037
        L_0x0035:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            goto L_0x0039
        L_0x0037:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            throw r4
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4509ap.m13308a(java.lang.String):void");
    }

    /* renamed from: a */
    public static boolean m13309a(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.huawei.hwid", 128);
            boolean z = (packageInfo.applicationInfo.flags & 1) != 0;
            f8173a = packageInfo.versionCode >= 20602000;
            return z;
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private void mo24745b() {
        ServiceConnection serviceConnection = this.f8176a;
        if (serviceConnection != null) {
            try {
                this.f8175a.unbindService(serviceConnection);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public String m13312a() {
        return null;
    }

    /* renamed from: a */
    public boolean m13313a() {
        return f8173a;
    }

    /* renamed from: b */
    public String m13314b() {
        m13308a("getOAID");
        return this.f8178a;
    }

    /* renamed from: c */
    public String mo24746c() {
        return null;
    }

    /* renamed from: d */
    public String mo24747d() {
        if (this.f8179b == null) {
            synchronized (this) {
                if (this.f8179b == null) {
                    this.f8179b = m13304a(this.f8175a);
                }
            }
        }
        return this.f8179b;
    }
}
