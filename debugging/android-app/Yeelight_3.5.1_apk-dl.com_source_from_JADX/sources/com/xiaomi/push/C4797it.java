package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4807jb;
import com.xiaomi.push.C4818jl;
import com.xiaomi.push.service.C4893ax;

/* renamed from: com.xiaomi.push.it */
public class C4797it {
    /* renamed from: a */
    public static short m14831a(Context context, C4783if ifVar) {
        return m14832a(context, ifVar.f8954b);
    }

    /* renamed from: a */
    public static short m14832a(Context context, String str) {
        int i = 0;
        int a = C4747h.m14127a(context, str, false).mo29273a() + 0 + (C4515ak.m12855b(context) ? 4 : 0) + (C4515ak.m12854a(context) ? 8 : 0);
        if (C4893ax.m15320a(context)) {
            i = 16;
        }
        return (short) (a + i);
    }

    /* renamed from: a */
    public static <T extends C4798iu<T, ?>> void m14833a(T t, byte[] bArr) {
        if (bArr != null) {
            new C4803iy(new C4818jl.C4819a(true, true, bArr.length)).mo29848a(t, bArr);
            return;
        }
        throw new C4804iz("the message byte is empty.");
    }

    /* renamed from: a */
    public static <T extends C4798iu<T, ?>> byte[] m14834a(T t) {
        if (t == null) {
            return null;
        }
        try {
            return new C4806ja(new C4807jb.C4808a()).mo29849a(t);
        } catch (C4804iz e) {
            C4408b.m12477a("convertThriftObjectToBytes catch TException.", (Throwable) e);
            return null;
        }
    }
}
