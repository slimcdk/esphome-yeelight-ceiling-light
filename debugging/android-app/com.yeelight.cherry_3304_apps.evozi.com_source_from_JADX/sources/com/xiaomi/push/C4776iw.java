package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4789je;
import com.xiaomi.push.C4800jo;

/* renamed from: com.xiaomi.push.iw */
public class C4776iw {
    /* renamed from: a */
    public static short m15223a(Context context, C4762ii iiVar) {
        int i = 0;
        int a = C4689g.m14350a(context, iiVar.f9495b).mo25171a() + 0 + (C4497ah.m13268b(context) ? 4 : 0);
        if (C4497ah.m13267a(context)) {
            i = 8;
        }
        return (short) (a + i);
    }

    /* renamed from: a */
    public static <T extends C4777ix<T, ?>> void m15224a(T t, byte[] bArr) {
        if (bArr != null) {
            new C4786jb(new C4800jo.C4801a(true, true, bArr.length)).mo25814a(t, bArr);
            return;
        }
        throw new C4787jc("the message byte is empty.");
    }

    /* renamed from: a */
    public static <T extends C4777ix<T, ?>> byte[] m15225a(T t) {
        if (t == null) {
            return null;
        }
        try {
            return new C4788jd(new C4789je.C4790a()).mo25815a(t);
        } catch (C4787jc e) {
            C3989b.m10677a("convertThriftObjectToBytes catch TException.", (Throwable) e);
            return null;
        }
    }
}
