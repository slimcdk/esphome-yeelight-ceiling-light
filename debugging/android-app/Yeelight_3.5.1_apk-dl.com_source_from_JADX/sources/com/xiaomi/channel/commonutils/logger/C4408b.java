package com.xiaomi.channel.commonutils.logger;

import android.content.Context;
import android.os.Process;
import com.xiaomi.push.C4830m;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.xiaomi.channel.commonutils.logger.b */
public abstract class C4408b {

    /* renamed from: a */
    private static int f7353a = 2;

    /* renamed from: a */
    private static Context f7354a = null;

    /* renamed from: a */
    private static LoggerInterface f7355a = new C4409a();

    /* renamed from: a */
    private static final Integer f7356a = -1;

    /* renamed from: a */
    private static String f7357a = ("XMPush-" + Process.myPid());

    /* renamed from: a */
    private static final HashMap<Integer, Long> f7358a = new HashMap<>();

    /* renamed from: a */
    private static AtomicInteger f7359a = new AtomicInteger(1);

    /* renamed from: a */
    private static boolean f7360a = false;

    /* renamed from: b */
    private static final HashMap<Integer, String> f7361b = new HashMap<>();

    /* renamed from: b */
    private static boolean f7362b = false;

    /* renamed from: com.xiaomi.channel.commonutils.logger.b$a */
    static class C4409a implements LoggerInterface {

        /* renamed from: a */
        private String f7363a = C4408b.m12463a();

        C4409a() {
        }

        public void log(String str) {
        }

        public void log(String str, Throwable th) {
        }

        public void setTag(String str) {
            this.f7363a = str;
        }
    }

    /* renamed from: a */
    public static int m12463a() {
        return f7353a;
    }

    /* renamed from: a */
    public static Integer m12464a(String str) {
        if (f7353a > 1) {
            return f7356a;
        }
        Integer valueOf = Integer.valueOf(f7359a.incrementAndGet());
        f7358a.put(valueOf, Long.valueOf(System.currentTimeMillis()));
        f7361b.put(valueOf, str);
        LoggerInterface loggerInterface = f7355a;
        loggerInterface.log(str + " starts");
        return valueOf;
    }

    /* renamed from: a */
    private static String m12466a(String str) {
        return m12479b() + str;
    }

    /* renamed from: a */
    public static String m12467a(String str, String str2) {
        return "[" + str + "] " + str2;
    }

    /* renamed from: a */
    public static void m12468a(int i) {
        if (i < 0 || i > 5) {
            m12469a(2, "set log level as " + i);
        }
        f7353a = i;
    }

    /* renamed from: a */
    public static void m12469a(int i, String str) {
        if (i >= f7353a) {
            f7355a.log(str);
        }
    }

    /* renamed from: a */
    public static void m12470a(int i, String str, Throwable th) {
        if (i >= f7353a) {
            f7355a.log(str, th);
        }
    }

    /* renamed from: a */
    public static void m12471a(int i, Throwable th) {
        if (i >= f7353a) {
            f7355a.log("", th);
        }
    }

    /* renamed from: a */
    public static void m12472a(Context context) {
        f7354a = context;
        if (C4830m.m14998a(context)) {
            f7360a = true;
        }
        if (C4830m.m14997a()) {
            f7362b = true;
        }
    }

    /* renamed from: a */
    public static void m12473a(LoggerInterface loggerInterface) {
        f7355a = loggerInterface;
    }

    /* renamed from: a */
    public static void m12474a(Integer num) {
        if (f7353a <= 1) {
            HashMap<Integer, Long> hashMap = f7358a;
            if (hashMap.containsKey(num)) {
                long currentTimeMillis = System.currentTimeMillis() - hashMap.remove(num).longValue();
                LoggerInterface loggerInterface = f7355a;
                loggerInterface.log(f7361b.remove(num) + " ends in " + currentTimeMillis + " ms");
            }
        }
    }

    /* renamed from: a */
    public static void m12475a(String str) {
        m12469a(2, m12464a(str));
    }

    /* renamed from: a */
    public static void m12476a(String str, String str2) {
        m12469a(2, m12480b(str, str2));
    }

    /* renamed from: a */
    public static void m12477a(String str, Throwable th) {
        m12470a(4, m12464a(str), th);
    }

    /* renamed from: a */
    public static void m12478a(Throwable th) {
        m12471a(4, th);
    }

    /* renamed from: b */
    private static String m12479b() {
        return "[Tid:" + Thread.currentThread().getId() + "] ";
    }

    /* renamed from: b */
    private static String m12480b(String str, String str2) {
        return m12479b() + m12467a(str, str2);
    }

    /* renamed from: b */
    public static void m12481b(String str) {
        m12469a(0, m12464a(str));
    }

    /* renamed from: c */
    public static void m12482c(String str) {
        m12469a(1, m12464a(str));
    }

    /* renamed from: d */
    public static void m12483d(String str) {
        m12469a(4, m12464a(str));
    }

    /* renamed from: e */
    public static void m12484e(String str) {
        if (!f7360a) {
            m12464a(str);
            if (f7362b) {
                return;
            }
        }
        m12464a(str);
    }
}
