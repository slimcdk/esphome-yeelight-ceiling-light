package com.xiaomi.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import java.security.MessageDigest;

/* renamed from: com.xiaomi.push.bb */
class C4540bb implements C4531au {

    /* renamed from: a */
    private static boolean f7622a;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public volatile int f7623a = 0;

    /* renamed from: a */
    private Context f7624a;

    /* renamed from: a */
    private ServiceConnection f7625a;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public volatile C4541a f7626a = null;

    /* renamed from: a */
    private final Object f7627a = new Object();

    /* renamed from: com.xiaomi.push.bb$a */
    private class C4541a {

        /* renamed from: a */
        String f7629a;

        /* renamed from: b */
        String f7630b;

        /* renamed from: c */
        String f7631c;

        /* renamed from: d */
        String f7632d;

        private C4541a() {
            this.f7629a = null;
            this.f7630b = null;
            this.f7631c = null;
            this.f7632d = null;
        }
    }

    /* renamed from: com.xiaomi.push.bb$b */
    private class C4542b implements ServiceConnection {
        private C4542b() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (C4540bb.m12960a(C4540bb.this) == null) {
                new Thread(new C4545bd(this, iBinder)).start();
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: com.xiaomi.push.bb$c */
    private static class C4543c {
        /* renamed from: a */
        static String m12973a(IBinder iBinder, String str, String str2, String str3) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.heytap.openid.IOpenID");
                obtain.writeString(str);
                obtain.writeString(str2);
                obtain.writeString(str3);
                iBinder.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    public C4540bb(Context context) {
        this.f7624a = context;
        mo28753a();
    }

    /* renamed from: a */
    private void mo28753a() {
        boolean z;
        this.f7625a = new C4542b();
        Intent intent = new Intent();
        intent.setClassName("com.heytap.openid", "com.heytap.openid.IdentifyService");
        intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
        int i = 1;
        try {
            z = this.f7624a.bindService(intent, this.f7625a, 1);
        } catch (Exception unused) {
            z = false;
        }
        if (!z) {
            i = 2;
        }
        this.f7623a = i;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m12967a(java.lang.String r4) {
        /*
            r3 = this;
            int r0 = r3.f7623a
            r1 = 1
            if (r0 != r1) goto L_0x0039
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 == r1) goto L_0x0039
            java.lang.Object r0 = r3.f7627a
            monitor-enter(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0035 }
            r1.<init>()     // Catch:{ Exception -> 0x0035 }
            java.lang.String r2 = "oppo's "
            r1.append(r2)     // Catch:{ Exception -> 0x0035 }
            r1.append(r4)     // Catch:{ Exception -> 0x0035 }
            java.lang.String r4 = " wait..."
            r1.append(r4)     // Catch:{ Exception -> 0x0035 }
            java.lang.String r4 = r1.toString()     // Catch:{ Exception -> 0x0035 }
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r4)     // Catch:{ Exception -> 0x0035 }
            java.lang.Object r4 = r3.f7627a     // Catch:{ Exception -> 0x0035 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4540bb.m12967a(java.lang.String):void");
    }

    /* renamed from: a */
    public static boolean m12968a(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.heytap.openid", 128);
            if (packageInfo != null) {
                long longVersionCode = Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : (long) packageInfo.versionCode;
                boolean z = (packageInfo.applicationInfo.flags & 1) != 0;
                f7622a = longVersionCode >= 1;
                if (z) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: b */
    private String m12969b() {
        try {
            Signature[] signatureArr = this.f7624a.getPackageManager().getPackageInfo(this.f7624a.getPackageName(), 64).signatures;
            MessageDigest instance = MessageDigest.getInstance("SHA1");
            StringBuilder sb = new StringBuilder();
            byte[] digest = instance.digest(signatureArr[0].toByteArray());
            for (byte b : digest) {
                sb.append(Integer.toHexString((b & 255) | 256).substring(1, 3));
            }
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: b */
    private void m12970b() {
        ServiceConnection serviceConnection = this.f7625a;
        if (serviceConnection != null) {
            try {
                this.f7624a.unbindService(serviceConnection);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public String m12971a() {
        m12967a("getOAID");
        if (this.f7626a == null) {
            return null;
        }
        return this.f7626a.f7630b;
    }

    /* renamed from: a */
    public boolean m12972a() {
        return f7622a;
    }
}
