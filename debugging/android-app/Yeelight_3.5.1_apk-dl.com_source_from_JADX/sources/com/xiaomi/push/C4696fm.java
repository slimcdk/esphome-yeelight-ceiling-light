package com.xiaomi.push;

import android.util.Log;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4699fp;

/* renamed from: com.xiaomi.push.fm */
class C4696fm {

    /* renamed from: a */
    private static final boolean f8174a = Log.isLoggable("BCompressed", 3);

    /* renamed from: a */
    static byte[] m13887a(C4695fl flVar, byte[] bArr) {
        try {
            byte[] a = C4699fp.C4700a.m13905a(bArr);
            if (f8174a) {
                C4408b.m12467a("BCompressed", "decompress " + bArr.length + " to " + a.length + " for " + flVar);
                if (flVar.f8168a == 1) {
                    C4408b.m12467a("BCompressed", "decompress not support upStream");
                }
            }
            return a;
        } catch (Exception e) {
            C4408b.m12467a("BCompressed", "decompress error " + e);
            return bArr;
        }
    }
}
