package com.xiaomi.push;

import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4725hc;
import com.xiaomi.push.service.C4860ap;
import com.xiaomi.push.service.XMPushService;
import java.util.Hashtable;

/* renamed from: com.xiaomi.push.hg */
public class C4731hg {

    /* renamed from: a */
    private static final int f8958a = C4669fh.PING_RTT.mo25070a();

    /* renamed from: com.xiaomi.push.hg$a */
    static class C4732a {

        /* renamed from: a */
        static Hashtable<Integer, Long> f8959a = new Hashtable<>();
    }

    /* renamed from: a */
    public static void m14522a() {
        m14524a(0, f8958a);
    }

    /* renamed from: a */
    public static void m14523a(int i) {
        C4670fi a = C4728he.mo25240a().mo25240a();
        a.mo25073a(C4669fh.CHANNEL_STATS_COUNTER.mo25070a());
        a.mo25083c(i);
        C4728he.mo25240a().mo25242a(a);
    }

    /* renamed from: a */
    public static synchronized void m14524a(int i, int i2) {
        synchronized (C4731hg.class) {
            if (i2 < 16777215) {
                C4732a.f8959a.put(Integer.valueOf((i << 24) | i2), Long.valueOf(System.currentTimeMillis()));
            } else {
                C3989b.m10681d("stats key should less than 16777215");
            }
        }
    }

    /* renamed from: a */
    public static void m14525a(int i, int i2, int i3, String str, int i4) {
        C4670fi a = C4728he.mo25240a().mo25240a();
        a.mo25072a((byte) i);
        a.mo25073a(i2);
        a.mo25078b(i3);
        a.mo25079b(str);
        a.mo25083c(i4);
        C4728he.mo25240a().mo25242a(a);
    }

    /* renamed from: a */
    public static synchronized void m14526a(int i, int i2, String str, int i3) {
        synchronized (C4731hg.class) {
            long currentTimeMillis = System.currentTimeMillis();
            int i4 = (i << 24) | i2;
            if (C4732a.f8959a.containsKey(Integer.valueOf(i4))) {
                C4670fi a = C4728he.mo25240a().mo25240a();
                a.mo25073a(i2);
                a.mo25078b((int) (currentTimeMillis - C4732a.f8959a.get(Integer.valueOf(i4)).longValue()));
                a.mo25079b(str);
                if (i3 > -1) {
                    a.mo25083c(i3);
                }
                C4728he.mo25240a().mo25242a(a);
                C4732a.f8959a.remove(Integer.valueOf(i2));
            } else {
                C3989b.m10681d("stats key not found");
            }
        }
    }

    /* renamed from: a */
    public static void m14527a(XMPushService xMPushService, C4860ap.C4862b bVar) {
        new C4721gz(xMPushService, bVar).mo25237a();
    }

    /* renamed from: a */
    public static void m14528a(String str, int i, Exception exc) {
        C4670fi a = C4728he.mo25240a().mo25240a();
        if (i > 0) {
            a.mo25073a(C4669fh.GSLB_REQUEST_SUCCESS.mo25070a());
            a.mo25079b(str);
            a.mo25078b(i);
            C4728he.mo25240a().mo25242a(a);
            return;
        }
        try {
            C4725hc.C4726a a2 = C4725hc.m14496a(exc);
            a.mo25073a(a2.f8937a.mo25070a());
            a.mo25084c(a2.f8938a);
            a.mo25079b(str);
            C4728he.mo25240a().mo25242a(a);
        } catch (NullPointerException unused) {
        }
    }

    /* renamed from: a */
    public static void m14529a(String str, Exception exc) {
        try {
            C4725hc.C4726a b = C4725hc.m14498b(exc);
            C4670fi a = C4728he.mo25240a().mo25240a();
            a.mo25073a(b.f8937a.mo25070a());
            a.mo25084c(b.f8938a);
            a.mo25079b(str);
            C4728he.mo25240a().mo25242a(a);
        } catch (NullPointerException unused) {
        }
    }

    /* renamed from: a */
    public static byte[] m14530a() {
        C4671fj a = C4728he.mo25240a().mo25240a();
        if (a != null) {
            return C4776iw.m15225a(a);
        }
        return null;
    }

    /* renamed from: b */
    public static void m14531b() {
        m14526a(0, f8958a, (String) null, -1);
    }

    /* renamed from: b */
    public static void m14532b(String str, Exception exc) {
        try {
            C4725hc.C4726a d = C4725hc.m14500d(exc);
            C4670fi a = C4728he.mo25240a().mo25240a();
            a.mo25073a(d.f8937a.mo25070a());
            a.mo25084c(d.f8938a);
            a.mo25079b(str);
            C4728he.mo25240a().mo25242a(a);
        } catch (NullPointerException unused) {
        }
    }
}
