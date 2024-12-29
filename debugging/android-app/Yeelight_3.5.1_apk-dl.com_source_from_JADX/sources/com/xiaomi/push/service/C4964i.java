package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4786ii;
import com.xiaomi.push.C4830m;
import com.xiaomi.push.C4994v;

/* renamed from: com.xiaomi.push.service.i */
public class C4964i {

    /* renamed from: a */
    private static C4965a f9691a;

    /* renamed from: a */
    private static C4966b f9692a;

    /* renamed from: com.xiaomi.push.service.i$a */
    public interface C4965a {
        /* renamed from: a */
        boolean mo30045a(C4786ii iiVar);
    }

    /* renamed from: com.xiaomi.push.service.i$b */
    public interface C4966b {
    }

    /* renamed from: a */
    public static void m15557a(C4966b bVar) {
        f9692a = bVar;
    }

    /* renamed from: a */
    public static boolean m15558a(C4786ii iiVar) {
        String str;
        if (f9691a == null || iiVar == null) {
            str = "rc params is null, not cpra";
        } else if (C4830m.m14998a(C4994v.m15733a())) {
            return f9691a.mo30045a(iiVar);
        } else {
            str = "rc app not permission to cpra";
        }
        C4408b.m12464a(str);
        return false;
    }
}
