package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.C4760hj;
import com.xiaomi.push.C4776hz;
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

/* renamed from: com.xiaomi.push.service.ce */
public class C4941ce {
    /* renamed from: a */
    public static C4798iu m15521a(Context context, C4783if ifVar) {
        if (ifVar.mo29567b()) {
            return null;
        }
        byte[] a = ifVar.mo29558a();
        C4798iu a2 = m15522a(ifVar.mo29558a(), ifVar.f8955b);
        if (a2 != null) {
            C4797it.m14833a(a2, a);
        }
        return a2;
    }

    /* renamed from: a */
    private static C4798iu m15522a(C4760hj hjVar, boolean z) {
        switch (C4942cf.f9658a[hjVar.ordinal()]) {
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
}
