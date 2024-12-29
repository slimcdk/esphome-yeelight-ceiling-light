package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4783if;
import java.util.Map;

/* renamed from: com.xiaomi.push.service.ag */
public class C4867ag {

    /* renamed from: a */
    private static C4868a f9445a;

    /* renamed from: a */
    private static C4869b f9446a;

    /* renamed from: com.xiaomi.push.service.ag$a */
    public interface C4868a {
        /* renamed from: a */
        Map<String, String> mo29961a(Context context, C4783if ifVar);

        /* renamed from: a */
        void m15185a(Context context, C4783if ifVar);

        /* renamed from: a */
        boolean mo29962a(Context context, C4783if ifVar, boolean z);
    }

    /* renamed from: com.xiaomi.push.service.ag$b */
    public interface C4869b {
        /* renamed from: a */
        void mo29963a(C4783if ifVar);

        /* renamed from: a */
        void mo29964a(String str);

        /* renamed from: a */
        boolean m15189a(C4783if ifVar);
    }

    /* renamed from: a */
    public static Map<String, String> m15178a(Context context, C4783if ifVar) {
        C4868a aVar = f9445a;
        if (aVar != null && ifVar != null) {
            return aVar.mo29961a(context, ifVar);
        }
        C4408b.m12464a("pepa listener or container is null");
        return null;
    }

    /* renamed from: a */
    public static void m15179a(Context context, C4783if ifVar) {
        C4868a aVar = f9445a;
        if (aVar == null || ifVar == null) {
            C4408b.m12464a("handle msg wrong");
        } else {
            aVar.mo29961a(context, ifVar);
        }
    }

    /* renamed from: a */
    public static void m15180a(C4783if ifVar) {
        C4869b bVar = f9446a;
        if (bVar == null || ifVar == null) {
            C4408b.m12464a("pepa clearMessage is null");
        } else {
            bVar.mo29963a(ifVar);
        }
    }

    /* renamed from: a */
    public static void m15181a(String str) {
        C4869b bVar = f9446a;
        if (bVar == null || str == null) {
            C4408b.m12464a("pepa clearMessage is null");
        } else {
            bVar.mo29964a(str);
        }
    }

    /* renamed from: a */
    public static boolean m15182a(Context context, C4783if ifVar, boolean z) {
        C4868a aVar = f9445a;
        if (aVar != null && ifVar != null) {
            return aVar.mo29962a(context, ifVar, z);
        }
        C4408b.m12464a("pepa judement listener or container is null");
        return false;
    }

    /* renamed from: a */
    public static boolean m15183a(C4783if ifVar) {
        C4869b bVar = f9446a;
        if (bVar != null && ifVar != null) {
            return bVar.mo29963a(ifVar);
        }
        C4408b.m12464a("pepa handleReceiveMessage is null");
        return false;
    }
}
