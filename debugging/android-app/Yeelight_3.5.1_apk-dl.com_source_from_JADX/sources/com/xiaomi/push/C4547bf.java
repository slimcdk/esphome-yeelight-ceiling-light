package com.xiaomi.push;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import com.miot.service.manager.timer.TimerCodec;

/* renamed from: com.xiaomi.push.bf */
class C4547bf implements C4531au {

    /* renamed from: a */
    private static String f7636a = "content://com.vivo.vms.IdProvider/IdentifierId/";

    /* renamed from: b */
    private static String f7637b = (f7636a + "OAID");

    /* renamed from: c */
    private static String f7638c = (f7636a + "VAID_");

    /* renamed from: d */
    private static String f7639d = (f7636a + "AAID_");

    /* renamed from: e */
    private static String f7640e = (f7636a + "OAIDSTATUS");

    /* renamed from: f */
    private static String f7641f = "persist.sys.identifierid.supported";

    /* renamed from: a */
    private Context f7642a;

    public C4547bf(Context context) {
        this.f7642a = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r10 != null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        if (r10 != null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m12976a(java.lang.String r10) {
        /*
            r9 = this;
            r0 = 0
            android.content.Context r1 = r9.f7642a     // Catch:{ Exception -> 0x003a, all -> 0x0030 }
            android.content.ContentResolver r2 = r1.getContentResolver()     // Catch:{ Exception -> 0x003a, all -> 0x0030 }
            android.net.Uri r3 = android.net.Uri.parse(r10)     // Catch:{ Exception -> 0x003a, all -> 0x0030 }
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r10 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x003a, all -> 0x0030 }
            if (r10 == 0) goto L_0x002a
            boolean r1 = r10.moveToNext()     // Catch:{ Exception -> 0x0028, all -> 0x0026 }
            if (r1 == 0) goto L_0x002a
            java.lang.String r1 = "value"
            int r1 = r10.getColumnIndex(r1)     // Catch:{ Exception -> 0x0028, all -> 0x0026 }
            java.lang.String r0 = r10.getString(r1)     // Catch:{ Exception -> 0x0028, all -> 0x0026 }
            goto L_0x002a
        L_0x0026:
            r0 = move-exception
            goto L_0x0034
        L_0x0028:
            goto L_0x003b
        L_0x002a:
            if (r10 == 0) goto L_0x003e
        L_0x002c:
            r10.close()
            goto L_0x003e
        L_0x0030:
            r10 = move-exception
            r8 = r0
            r0 = r10
            r10 = r8
        L_0x0034:
            if (r10 == 0) goto L_0x0039
            r10.close()
        L_0x0039:
            throw r0
        L_0x003a:
            r10 = r0
        L_0x003b:
            if (r10 == 0) goto L_0x003e
            goto L_0x002c
        L_0x003e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4547bf.m12976a(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static boolean m12977a(Context context) {
        try {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(Uri.parse(f7636a).getAuthority(), 128);
            if (resolveContentProvider != null) {
                if ((resolveContentProvider.applicationInfo.flags & 1) != 0) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: a */
    public String mo28753a() {
        return m12976a(f7637b);
    }

    /* renamed from: a */
    public boolean m12979a() {
        return TimerCodec.ENABLE.equals(C4993u.m15732a(f7641f, TimerCodec.DISENABLE));
    }
}
