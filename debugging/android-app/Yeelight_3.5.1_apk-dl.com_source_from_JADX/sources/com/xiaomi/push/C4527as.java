package com.xiaomi.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.xiaomi.push.as */
class C4527as implements C4531au {

    /* renamed from: a */
    private static boolean f7569a;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public volatile int f7570a = 0;

    /* renamed from: a */
    private Context f7571a;

    /* renamed from: a */
    private ServiceConnection f7572a;

    /* renamed from: a */
    private final Object f7573a = new Object();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public volatile String f7574a = null;

    /* renamed from: b */
    private volatile String f7575b = null;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public volatile boolean f7576b = false;

    /* renamed from: com.xiaomi.push.as$a */
    private class C4528a implements ServiceConnection {
        private C4528a() {
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
                com.xiaomi.push.as r0 = com.xiaomi.push.C4527as.this     // Catch:{ Exception -> 0x0056, all -> 0x0034 }
                java.lang.String r1 = com.xiaomi.push.C4527as.C4529b.m12901a((android.os.IBinder) r4)     // Catch:{ Exception -> 0x0056, all -> 0x0034 }
                java.lang.String unused = r0.f7574a = r1     // Catch:{ Exception -> 0x0056, all -> 0x0034 }
                com.xiaomi.push.as r0 = com.xiaomi.push.C4527as.this     // Catch:{ Exception -> 0x0056, all -> 0x0034 }
                boolean r4 = com.xiaomi.push.C4527as.C4529b.m12901a((android.os.IBinder) r4)     // Catch:{ Exception -> 0x0056, all -> 0x0034 }
                boolean unused = r0.f7576b = r4     // Catch:{ Exception -> 0x0056, all -> 0x0034 }
                com.xiaomi.push.as r4 = com.xiaomi.push.C4527as.this
                com.xiaomi.push.C4527as.m12891a((com.xiaomi.push.C4527as) r4)
                com.xiaomi.push.as r4 = com.xiaomi.push.C4527as.this
                int unused = r4.f7570a = r3
                com.xiaomi.push.as r3 = com.xiaomi.push.C4527as.this
                java.lang.Object r4 = com.xiaomi.push.C4527as.m12891a((com.xiaomi.push.C4527as) r3)
                monitor-enter(r4)
                com.xiaomi.push.as r3 = com.xiaomi.push.C4527as.this     // Catch:{ Exception -> 0x0030 }
                java.lang.Object r3 = com.xiaomi.push.C4527as.m12891a((com.xiaomi.push.C4527as) r3)     // Catch:{ Exception -> 0x0030 }
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
                com.xiaomi.push.as r0 = com.xiaomi.push.C4527as.this
                com.xiaomi.push.C4527as.m12891a((com.xiaomi.push.C4527as) r0)
                com.xiaomi.push.as r0 = com.xiaomi.push.C4527as.this
                int unused = r0.f7570a = r3
                com.xiaomi.push.as r3 = com.xiaomi.push.C4527as.this
                java.lang.Object r0 = com.xiaomi.push.C4527as.m12891a((com.xiaomi.push.C4527as) r3)
                monitor-enter(r0)
                com.xiaomi.push.as r3 = com.xiaomi.push.C4527as.this     // Catch:{ Exception -> 0x0052 }
                java.lang.Object r3 = com.xiaomi.push.C4527as.m12891a((com.xiaomi.push.C4527as) r3)     // Catch:{ Exception -> 0x0052 }
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
                com.xiaomi.push.as r4 = com.xiaomi.push.C4527as.this
                com.xiaomi.push.C4527as.m12891a((com.xiaomi.push.C4527as) r4)
                com.xiaomi.push.as r4 = com.xiaomi.push.C4527as.this
                int unused = r4.f7570a = r3
                com.xiaomi.push.as r3 = com.xiaomi.push.C4527as.this
                java.lang.Object r3 = com.xiaomi.push.C4527as.m12891a((com.xiaomi.push.C4527as) r3)
                monitor-enter(r3)
                com.xiaomi.push.as r4 = com.xiaomi.push.C4527as.this     // Catch:{ Exception -> 0x0073 }
                java.lang.Object r4 = com.xiaomi.push.C4527as.m12891a((com.xiaomi.push.C4527as) r4)     // Catch:{ Exception -> 0x0073 }
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
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4527as.C4528a.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: com.xiaomi.push.as$b */
    private static class C4529b {
        /* renamed from: a */
        static String m12901a(IBinder iBinder) {
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
        static boolean m12902a(IBinder iBinder) {
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

    public C4527as(Context context) {
        this.f7571a = context;
        mo28753a();
    }

    /* renamed from: a */
    private void mo28753a() {
        boolean z;
        this.f7572a = new C4528a();
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        int i = 1;
        try {
            z = this.f7571a.bindService(intent, this.f7572a, 1);
        } catch (Exception unused) {
            z = false;
        }
        if (!z) {
            i = 2;
        }
        this.f7570a = i;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m12895a(java.lang.String r4) {
        /*
            r3 = this;
            int r0 = r3.f7570a
            r1 = 1
            if (r0 != r1) goto L_0x0039
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 == r1) goto L_0x0039
            java.lang.Object r0 = r3.f7573a
            monitor-enter(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0035 }
            r1.<init>()     // Catch:{ Exception -> 0x0035 }
            java.lang.String r2 = "huawei's "
            r1.append(r2)     // Catch:{ Exception -> 0x0035 }
            r1.append(r4)     // Catch:{ Exception -> 0x0035 }
            java.lang.String r4 = " wait..."
            r1.append(r4)     // Catch:{ Exception -> 0x0035 }
            java.lang.String r4 = r1.toString()     // Catch:{ Exception -> 0x0035 }
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r4)     // Catch:{ Exception -> 0x0035 }
            java.lang.Object r4 = r3.f7573a     // Catch:{ Exception -> 0x0035 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4527as.m12895a(java.lang.String):void");
    }

    /* renamed from: a */
    public static boolean m12896a(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.huawei.hwid", 128);
            boolean z = (packageInfo.applicationInfo.flags & 1) != 0;
            f7569a = packageInfo.versionCode >= 20602000;
            return z;
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private void m12898b() {
        ServiceConnection serviceConnection = this.f7572a;
        if (serviceConnection != null) {
            try {
                this.f7571a.unbindService(serviceConnection);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public String m12899a() {
        m12895a("getOAID");
        return this.f7574a;
    }

    /* renamed from: a */
    public boolean m12900a() {
        return f7569a;
    }
}
