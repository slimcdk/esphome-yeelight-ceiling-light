package com.xiaomi.push;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.C4521ao;
import com.xiaomi.push.providers.C4834a;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.xiaomi.push.hb */
public class C4750hb {

    /* renamed from: a */
    private static volatile int f8384a = -1;

    /* renamed from: a */
    private static long f8385a = System.currentTimeMillis();

    /* renamed from: a */
    private static C4521ao f8386a = new C4521ao(true);

    /* renamed from: a */
    private static C4834a f8387a = null;

    /* renamed from: a */
    private static final Object f8388a = new Object();

    /* renamed from: a */
    private static String f8389a = "";

    /* renamed from: a */
    private static List<C4751a> f8390a = Collections.synchronizedList(new ArrayList());

    /* renamed from: com.xiaomi.push.hb$a */
    static class C4751a {

        /* renamed from: a */
        public int f8391a = -1;

        /* renamed from: a */
        public long f8392a = 0;

        /* renamed from: a */
        public String f8393a = "";

        /* renamed from: b */
        public int f8394b = -1;

        /* renamed from: b */
        public long f8395b = 0;

        /* renamed from: b */
        public String f8396b = "";

        public C4751a(String str, long j, int i, int i2, String str2, long j2) {
            this.f8393a = str;
            this.f8392a = j;
            this.f8391a = i;
            this.f8394b = i2;
            this.f8396b = str2;
            this.f8395b = j2;
        }

        /* renamed from: a */
        public boolean mo29274a(C4751a aVar) {
            return TextUtils.equals(aVar.f8393a, this.f8393a) && TextUtils.equals(aVar.f8396b, this.f8396b) && aVar.f8391a == this.f8391a && aVar.f8394b == this.f8394b && Math.abs(aVar.f8392a - this.f8392a) <= 5000;
        }
    }

    /* renamed from: a */
    public static int m14138a(Context context) {
        if (f8384a == -1) {
            f8384a = m14151b(context);
        }
        return f8384a;
    }

    /* renamed from: a */
    public static int m14139a(String str) {
        try {
            return str.getBytes("UTF-8").length;
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes().length;
        }
    }

    /* renamed from: a */
    private static long m14140a(int i, long j, boolean z, long j2, boolean z2) {
        if (z && z2) {
            long j3 = f8385a;
            f8385a = j2;
            if (j2 - j3 > 30000 && j > 1024) {
                return j * 2;
            }
        }
        return (j * ((long) (i == 0 ? 13 : 11))) / 10;
    }

    /* renamed from: a */
    private static C4834a m14141a(Context context) {
        C4834a aVar = f8387a;
        if (aVar != null) {
            return aVar;
        }
        C4834a aVar2 = new C4834a(context);
        f8387a = aVar2;
        return aVar2;
    }

    /* renamed from: a */
    private static synchronized String m14143a(Context context) {
        synchronized (C4750hb.class) {
            if (TextUtils.isEmpty(f8389a)) {
                return "";
            }
            String str = f8389a;
            return str;
        }
    }

    /* renamed from: a */
    public static void m14145a(Context context) {
        f8384a = m14151b(context);
    }

    /* renamed from: a */
    private static void m14146a(Context context, String str, long j, boolean z, long j2) {
        int a;
        boolean isEmpty;
        if (context != null && !TextUtils.isEmpty(str) && "com.xiaomi.xmsf".equals(context.getPackageName())) {
            String str2 = str;
            if (!"com.xiaomi.xmsf".equals(str) && -1 != (a = m14138a(context))) {
                synchronized (f8388a) {
                    isEmpty = f8390a.isEmpty();
                    m14149a(new C4751a(str, j2, a, z ? 1 : 0, a == 0 ? m14138a(context) : "", j));
                }
                if (isEmpty) {
                    f8386a.mo28745a((C4521ao.C4523b) new C4752hc(context), 5000);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m14147a(Context context, String str, long j, boolean z, boolean z2, long j2) {
        m14146a(context, str, m14140a(m14138a(context), j, z, j2, z2), z, j2);
    }

    /* renamed from: a */
    private static void m14149a(C4751a aVar) {
        for (C4751a next : f8390a) {
            if (next.mo29274a(aVar)) {
                next.f8395b += aVar.f8395b;
                return;
            }
        }
        f8390a.add(aVar);
    }

    /* renamed from: a */
    public static synchronized void m14150a(String str) {
        synchronized (C4750hb.class) {
            if (!C4830m.m15015d() && !TextUtils.isEmpty(str)) {
                f8389a = str;
            }
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m14151b(android.content.Context r2) {
        /*
            r0 = -1
            java.lang.String r1 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r1)     // Catch:{ Exception -> 0x0018 }
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2     // Catch:{ Exception -> 0x0018 }
            if (r2 != 0) goto L_0x000c
            return r0
        L_0x000c:
            android.net.NetworkInfo r2 = r2.getActiveNetworkInfo()     // Catch:{  }
            if (r2 != 0) goto L_0x0013
            return r0
        L_0x0013:
            int r2 = r2.getType()
            return r2
        L_0x0018:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4750hb.m14151b(android.content.Context):int");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m14152b(Context context, List<C4751a> list) {
        try {
            synchronized (C4834a.f9333a) {
                SQLiteDatabase writableDatabase = m14138a(context).getWritableDatabase();
                writableDatabase.beginTransaction();
                try {
                    for (C4751a next : list) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(Constants.PACKAGE_NAME, next.f8393a);
                        contentValues.put("message_ts", Long.valueOf(next.f8392a));
                        contentValues.put("network_type", Integer.valueOf(next.f8391a));
                        contentValues.put("bytes", Long.valueOf(next.f8395b));
                        contentValues.put("rcv", Integer.valueOf(next.f8394b));
                        contentValues.put("imsi", next.f8396b);
                        writableDatabase.insert("traffic", (String) null, contentValues);
                    }
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (Throwable th) {
            C4408b.m12478a(th);
        }
    }
}
