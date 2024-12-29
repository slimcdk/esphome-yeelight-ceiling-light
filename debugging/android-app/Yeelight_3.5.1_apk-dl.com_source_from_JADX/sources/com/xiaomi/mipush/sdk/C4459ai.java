package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4558bm;
import com.xiaomi.push.C4760hj;
import com.xiaomi.push.C4775hy;
import com.xiaomi.push.C4776hz;
import com.xiaomi.push.C4777i;
import com.xiaomi.push.C4778ia;
import com.xiaomi.push.C4782ie;
import com.xiaomi.push.C4783if;
import com.xiaomi.push.C4786ii;
import com.xiaomi.push.C4788ik;
import com.xiaomi.push.C4789il;
import com.xiaomi.push.C4790im;
import com.xiaomi.push.C4792io;
import com.xiaomi.push.C4794iq;
import com.xiaomi.push.C4796is;
import com.xiaomi.push.C4797it;
import com.xiaomi.push.C4798iu;
import java.nio.ByteBuffer;

/* renamed from: com.xiaomi.mipush.sdk.ai */
public class C4459ai {
    /* renamed from: a */
    protected static <T extends C4798iu<T, ?>> C4783if m12614a(Context context, T t, C4760hj hjVar) {
        return m12615a(context, t, hjVar, !hjVar.equals(C4760hj.Registration), context.getPackageName(), C4475b.m12705a(context).mo28684a());
    }

    /* renamed from: a */
    protected static <T extends C4798iu<T, ?>> C4783if m12615a(Context context, T t, C4760hj hjVar, boolean z, String str, String str2) {
        return m12616a(context, t, hjVar, z, str, str2, true);
    }

    /* renamed from: a */
    protected static <T extends C4798iu<T, ?>> C4783if m12616a(Context context, T t, C4760hj hjVar, boolean z, String str, String str2, boolean z2) {
        String str3;
        byte[] a = C4797it.m14834a(t);
        if (a == null) {
            str3 = "invoke convertThriftObjectToBytes method, return null.";
        } else {
            C4783if ifVar = new C4783if();
            if (z) {
                String d = C4475b.m12705a(context).mo28695d();
                if (TextUtils.isEmpty(d)) {
                    str3 = "regSecret is empty, return null";
                } else {
                    try {
                        a = C4777i.m14413b(C4558bm.m13029a(d), a);
                    } catch (Exception unused) {
                        C4408b.m12483d("encryption error. ");
                    }
                }
            }
            C4775hy hyVar = new C4775hy();
            hyVar.f8813a = 5;
            hyVar.f8814a = "fakeid";
            ifVar.mo29561a(hyVar);
            ifVar.mo29563a(ByteBuffer.wrap(a));
            ifVar.mo29559a(hjVar);
            ifVar.mo29566b(z2);
            ifVar.mo29565b(str);
            ifVar.mo29564a(z);
            ifVar.mo29562a(str2);
            return ifVar;
        }
        C4408b.m12464a(str3);
        return null;
    }

    /* renamed from: a */
    public static C4798iu m12617a(Context context, C4783if ifVar) {
        byte[] bArr;
        if (ifVar.mo29567b()) {
            byte[] a = C4483i.m12779a(context, ifVar, C4479e.ASSEMBLE_PUSH_FCM);
            if (a == null) {
                a = C4558bm.m13029a(C4475b.m12705a(context).mo28695d());
            }
            try {
                bArr = C4777i.m14412a(a, ifVar.mo29558a());
            } catch (Exception e) {
                throw new C4496u("the aes decrypt failed.", e);
            }
        } else {
            bArr = ifVar.mo29558a();
        }
        C4798iu a2 = m12618a(ifVar.mo29558a(), ifVar.f8955b);
        if (a2 != null) {
            C4797it.m14833a(a2, bArr);
        }
        return a2;
    }

    /* renamed from: a */
    private static C4798iu m12618a(C4760hj hjVar, boolean z) {
        switch (C4460aj.f7437a[hjVar.ordinal()]) {
            case 1:
                return new C4788ik();
            case 2:
                return new C4794iq();
            case 3:
                return new C4792io();
            case 4:
                return new C4796is();
            case 5:
                return new C4790im();
            case 6:
                return new C4776hz();
            case 7:
                return new C4782ie();
            case 8:
                return new C4789il();
            case 9:
                if (z) {
                    return new C4786ii();
                }
                C4778ia iaVar = new C4778ia();
                iaVar.mo29481a(true);
                return iaVar;
            case 10:
                return new C4782ie();
            default:
                return null;
        }
    }

    /* renamed from: b */
    protected static <T extends C4798iu<T, ?>> C4783if m12619b(Context context, T t, C4760hj hjVar, boolean z, String str, String str2) {
        return m12616a(context, t, hjVar, z, str, str2, false);
    }
}
