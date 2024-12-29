package com.xiaomi.channel.commonutils.logger;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.xiaomi.channel.commonutils.logger.b */
public abstract class C3989b {

    /* renamed from: a */
    private static int f6791a = 2;

    /* renamed from: a */
    private static LoggerInterface f6792a = new C3988a();

    /* renamed from: a */
    private static final Integer f6793a = -1;

    /* renamed from: a */
    private static final HashMap<Integer, Long> f6794a = new HashMap<>();

    /* renamed from: a */
    private static AtomicInteger f6795a = new AtomicInteger(1);

    /* renamed from: b */
    private static final HashMap<Integer, String> f6796b = new HashMap<>();

    /* renamed from: a */
    public static int m10668a() {
        return f6791a;
    }

    /* renamed from: a */
    public static Integer m10669a(String str) {
        if (f6791a > 1) {
            return f6793a;
        }
        Integer valueOf = Integer.valueOf(f6795a.incrementAndGet());
        f6794a.put(valueOf, Long.valueOf(System.currentTimeMillis()));
        f6796b.put(valueOf, str);
        LoggerInterface loggerInterface = f6792a;
        loggerInterface.log(str + " starts");
        return valueOf;
    }

    /* renamed from: a */
    public static void m10670a(int i) {
        if (i < 0 || i > 5) {
            m10671a(2, "set log level as " + i);
        }
        f6791a = i;
    }

    /* renamed from: a */
    public static void m10671a(int i, String str) {
        if (i >= f6791a) {
            f6792a.log(str);
        }
    }

    /* renamed from: a */
    public static void m10672a(int i, String str, Throwable th) {
        if (i >= f6791a) {
            f6792a.log(str, th);
        }
    }

    /* renamed from: a */
    public static void m10673a(int i, Throwable th) {
        if (i >= f6791a) {
            f6792a.log("", th);
        }
    }

    /* renamed from: a */
    public static void m10674a(LoggerInterface loggerInterface) {
        f6792a = loggerInterface;
    }

    /* renamed from: a */
    public static void m10675a(Integer num) {
        if (f6791a <= 1 && f6794a.containsKey(num)) {
            long currentTimeMillis = System.currentTimeMillis() - f6794a.remove(num).longValue();
            LoggerInterface loggerInterface = f6792a;
            loggerInterface.log(f6796b.remove(num) + " ends in " + currentTimeMillis + " ms");
        }
    }

    /* renamed from: a */
    public static void m10676a(String str) {
        m10671a(2, "[Thread:" + Thread.currentThread().getId() + "] " + str);
    }

    /* renamed from: a */
    public static void m10677a(String str, Throwable th) {
        m10672a(4, str, th);
    }

    /* renamed from: a */
    public static void m10678a(Throwable th) {
        m10673a(4, th);
    }

    /* renamed from: b */
    public static void m10679b(String str) {
        m10671a(0, str);
    }

    /* renamed from: c */
    public static void m10680c(String str) {
        m10671a(1, "[Thread:" + Thread.currentThread().getId() + "] " + str);
    }

    /* renamed from: d */
    public static void m10681d(String str) {
        m10671a(4, str);
    }
}
