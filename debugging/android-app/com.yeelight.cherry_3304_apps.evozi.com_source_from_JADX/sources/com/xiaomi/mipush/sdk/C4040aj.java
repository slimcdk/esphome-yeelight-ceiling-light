package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4529bc;
import com.xiaomi.push.C4722h;
import com.xiaomi.push.C4739hm;
import com.xiaomi.push.C4755ib;
import com.xiaomi.push.C4756ic;
import com.xiaomi.push.C4757id;
import com.xiaomi.push.C4761ih;
import com.xiaomi.push.C4762ii;
import com.xiaomi.push.C4765il;
import com.xiaomi.push.C4767in;
import com.xiaomi.push.C4768io;
import com.xiaomi.push.C4769ip;
import com.xiaomi.push.C4771ir;
import com.xiaomi.push.C4773it;
import com.xiaomi.push.C4775iv;
import com.xiaomi.push.C4776iw;
import com.xiaomi.push.C4777ix;
import java.nio.ByteBuffer;

/* renamed from: com.xiaomi.mipush.sdk.aj */
public class C4040aj {
    /* renamed from: a */
    protected static <T extends C4777ix<T, ?>> C4762ii m10804a(Context context, T t, C4739hm hmVar) {
        return m10805a(context, t, hmVar, !hmVar.equals(C4739hm.Registration), context.getPackageName(), C4056b.m10888a(context).mo22930a());
    }

    /* renamed from: a */
    protected static <T extends C4777ix<T, ?>> C4762ii m10805a(Context context, T t, C4739hm hmVar, boolean z, String str, String str2) {
        String str3;
        byte[] a = C4776iw.m15225a(t);
        if (a == null) {
            str3 = "invoke convertThriftObjectToBytes method, return null.";
        } else {
            C4762ii iiVar = new C4762ii();
            if (z) {
                String d = C4056b.m10888a(context).mo22941d();
                if (TextUtils.isEmpty(d)) {
                    str3 = "regSecret is empty, return null";
                } else {
                    try {
                        a = C4722h.m14493b(C4529bc.m13418a(d), a);
                    } catch (Exception unused) {
                        C3989b.m10681d("encryption error. ");
                    }
                }
            }
            C4755ib ibVar = new C4755ib();
            ibVar.f9355a = 5;
            ibVar.f9356a = "fakeid";
            iiVar.mo25524a(ibVar);
            iiVar.mo25526a(ByteBuffer.wrap(a));
            iiVar.mo25522a(hmVar);
            iiVar.mo25529b(true);
            iiVar.mo25528b(str);
            iiVar.mo25527a(z);
            iiVar.mo25525a(str2);
            return iiVar;
        }
        C3989b.m10669a(str3);
        return null;
    }

    /* renamed from: a */
    public static C4777ix m10806a(Context context, C4762ii iiVar) {
        byte[] bArr;
        if (iiVar.mo25530b()) {
            try {
                bArr = C4722h.m14492a(C4529bc.m13418a(C4056b.m10888a(context).mo22941d()), iiVar.mo25521a());
            } catch (Exception e) {
                throw new C4076t("the aes decrypt failed.", e);
            }
        } else {
            bArr = iiVar.mo25521a();
        }
        C4777ix a = m10807a(iiVar.mo25521a(), iiVar.f9496b);
        if (a != null) {
            C4776iw.m15224a(a, bArr);
        }
        return a;
    }

    /* renamed from: a */
    private static C4777ix m10807a(C4739hm hmVar, boolean z) {
        switch (C4041ak.f6869a[hmVar.ordinal()]) {
            case 1:
                return new C4767in();
            case 2:
                return new C4773it();
            case 3:
                return new C4771ir();
            case 4:
                return new C4775iv();
            case 5:
                return new C4769ip();
            case 6:
                return new C4756ic();
            case 7:
                return new C4761ih();
            case 8:
                return new C4768io();
            case 9:
                if (z) {
                    return new C4765il();
                }
                C4757id idVar = new C4757id();
                idVar.mo25447a(true);
                return idVar;
            case 10:
                return new C4761ih();
            default:
                return null;
        }
    }
}
