package com.xiaomi.push;

import android.os.SystemClock;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4686ff;
import com.xiaomi.push.service.C4906bg;
import com.xiaomi.push.service.XMPushService;
import java.util.Hashtable;

/* renamed from: com.xiaomi.push.fj */
public class C4692fj {

    /* renamed from: a */
    private static final int f8162a = C4679ez.PING_RTT.mo29089a();

    /* renamed from: a */
    private static long f8163a = 0;

    /* renamed from: com.xiaomi.push.fj$a */
    static class C4693a {

        /* renamed from: a */
        static Hashtable<Integer, Long> f8164a = new Hashtable<>();
    }

    /* renamed from: a */
    public static void m13848a() {
        if (f8163a == 0 || SystemClock.elapsedRealtime() - f8163a > 7200000) {
            f8163a = SystemClock.elapsedRealtime();
            m13850a(0, f8162a);
        }
    }

    /* renamed from: a */
    public static void m13849a(int i) {
        C4681fa a = C4689fh.mo29139a().mo29139a();
        a.mo29092a(C4679ez.CHANNEL_STATS_COUNTER.mo29089a());
        a.mo29102c(i);
        C4689fh.mo29139a().mo29141a(a);
    }

    /* renamed from: a */
    public static synchronized void m13850a(int i, int i2) {
        synchronized (C4692fj.class) {
            if (i2 < 16777215) {
                C4693a.f8164a.put(Integer.valueOf((i << 24) | i2), Long.valueOf(System.currentTimeMillis()));
            } else {
                C4408b.m12483d("stats key should less than 16777215");
            }
        }
    }

    /* renamed from: a */
    public static void m13851a(int i, int i2, int i3, String str, int i4) {
        C4681fa a = C4689fh.mo29139a().mo29139a();
        a.mo29091a((byte) i);
        a.mo29092a(i2);
        a.mo29097b(i3);
        a.mo29098b(str);
        a.mo29102c(i4);
        C4689fh.mo29139a().mo29141a(a);
    }

    /* renamed from: a */
    public static synchronized void m13852a(int i, int i2, String str, int i3) {
        synchronized (C4692fj.class) {
            long currentTimeMillis = System.currentTimeMillis();
            int i4 = (i << 24) | i2;
            if (C4693a.f8164a.containsKey(Integer.valueOf(i4))) {
                C4681fa a = C4689fh.mo29139a().mo29139a();
                a.mo29092a(i2);
                a.mo29097b((int) (currentTimeMillis - C4693a.f8164a.get(Integer.valueOf(i4)).longValue()));
                a.mo29098b(str);
                if (i3 > -1) {
                    a.mo29102c(i3);
                }
                C4689fh.mo29139a().mo29141a(a);
                C4693a.f8164a.remove(Integer.valueOf(i2));
            } else {
                C4408b.m12483d("stats key not found");
            }
        }
    }

    /* renamed from: a */
    public static void m13853a(XMPushService xMPushService, C4906bg.C4908b bVar) {
        new C4683fc(xMPushService, bVar).mo29131a();
    }

    /* renamed from: a */
    public static void m13854a(String str, int i, Exception exc) {
        C4681fa a = C4689fh.mo29139a().mo29139a();
        if (!(C4689fh.mo29139a() == null || C4689fh.mo29139a().f8146a == null)) {
            a.mo29102c(C4551bj.m13001c(C4689fh.mo29139a().f8146a) ? 1 : 0);
        }
        if (i > 0) {
            a.mo29092a(C4679ez.GSLB_REQUEST_SUCCESS.mo29089a());
            a.mo29098b(str);
            a.mo29097b(i);
            C4689fh.mo29139a().mo29141a(a);
            return;
        }
        try {
            C4686ff.C4687a a2 = C4686ff.m13822a(exc);
            a.mo29092a(a2.f8141a.mo29089a());
            a.mo29103c(a2.f8142a);
            a.mo29098b(str);
            C4689fh.mo29139a().mo29141a(a);
        } catch (NullPointerException unused) {
        }
    }

    /* renamed from: a */
    public static void m13855a(String str, Exception exc) {
        try {
            C4686ff.C4687a b = C4686ff.m13824b(exc);
            C4681fa a = C4689fh.mo29139a().mo29139a();
            a.mo29092a(b.f8141a.mo29089a());
            a.mo29103c(b.f8142a);
            a.mo29098b(str);
            if (!(C4689fh.mo29139a() == null || C4689fh.mo29139a().f8146a == null)) {
                a.mo29102c(C4551bj.m13001c(C4689fh.mo29139a().f8146a) ? 1 : 0);
            }
            C4689fh.mo29139a().mo29141a(a);
        } catch (NullPointerException unused) {
        }
    }

    /* renamed from: a */
    public static byte[] m13856a() {
        C4682fb a = C4689fh.mo29139a().mo29139a();
        if (a != null) {
            return C4797it.m14834a(a);
        }
        return null;
    }

    /* renamed from: b */
    public static void m13857b() {
        m13852a(0, f8162a, (String) null, -1);
    }

    /* renamed from: b */
    public static void m13858b(String str, Exception exc) {
        try {
            C4686ff.C4687a d = C4686ff.m13826d(exc);
            C4681fa a = C4689fh.mo29139a().mo29139a();
            a.mo29092a(d.f8141a.mo29089a());
            a.mo29103c(d.f8142a);
            a.mo29098b(str);
            if (!(C4689fh.mo29139a() == null || C4689fh.mo29139a().f8146a == null)) {
                a.mo29102c(C4551bj.m13001c(C4689fh.mo29139a().f8146a) ? 1 : 0);
            }
            C4689fh.mo29139a().mo29141a(a);
        } catch (NullPointerException unused) {
        }
    }
}
