package com.xiaomi.push;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.C4503al;
import com.xiaomi.push.providers.C4813a;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.xiaomi.push.gx */
public class C4718gx {

    /* renamed from: a */
    private static volatile int f8914a = -1;

    /* renamed from: a */
    private static long f8915a = System.currentTimeMillis();

    /* renamed from: a */
    private static C4503al f8916a = new C4503al(true);

    /* renamed from: a */
    private static C4813a f8917a = null;

    /* renamed from: a */
    private static final Object f8918a = new Object();

    /* renamed from: a */
    private static String f8919a = "";

    /* renamed from: a */
    private static List<C4719a> f8920a = Collections.synchronizedList(new ArrayList());

    /* renamed from: com.xiaomi.push.gx$a */
    static class C4719a {

        /* renamed from: a */
        public int f8921a = -1;

        /* renamed from: a */
        public long f8922a = 0;

        /* renamed from: a */
        public String f8923a = "";

        /* renamed from: b */
        public int f8924b = -1;

        /* renamed from: b */
        public long f8925b = 0;

        /* renamed from: b */
        public String f8926b = "";

        public C4719a(String str, long j, int i, int i2, String str2, long j2) {
            this.f8923a = str;
            this.f8922a = j;
            this.f8921a = i;
            this.f8924b = i2;
            this.f8926b = str2;
            this.f8925b = j2;
        }

        /* renamed from: a */
        public boolean mo25236a(C4719a aVar) {
            return TextUtils.equals(aVar.f8923a, this.f8923a) && TextUtils.equals(aVar.f8926b, this.f8926b) && aVar.f8921a == this.f8921a && aVar.f8924b == this.f8924b && Math.abs(aVar.f8922a - this.f8922a) <= 5000;
        }
    }

    /* renamed from: a */
    public static int m14469a(Context context) {
        if (f8914a == -1) {
            f8914a = m14482b(context);
        }
        return f8914a;
    }

    /* renamed from: a */
    public static int m14470a(String str) {
        try {
            return str.getBytes("UTF-8").length;
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes().length;
        }
    }

    /* renamed from: a */
    private static long m14471a(int i, long j, boolean z, long j2, boolean z2) {
        if (z && z2) {
            long j3 = f8915a;
            f8915a = j2;
            if (j2 - j3 > 30000 && j > 1024) {
                return j * 2;
            }
        }
        return (j * ((long) (i == 0 ? 13 : 11))) / 10;
    }

    /* renamed from: a */
    private static C4813a m14472a(Context context) {
        C4813a aVar = f8917a;
        if (aVar != null) {
            return aVar;
        }
        C4813a aVar2 = new C4813a(context);
        f8917a = aVar2;
        return aVar2;
    }

    /* renamed from: a */
    private static synchronized String m14474a(Context context) {
        synchronized (C4718gx.class) {
            if (TextUtils.isEmpty(f8919a)) {
                return "";
            }
            String str = f8919a;
            return str;
        }
    }

    /* renamed from: a */
    public static void m14476a(Context context) {
        f8914a = m14482b(context);
    }

    /* renamed from: a */
    private static void m14477a(Context context, String str, long j, boolean z, long j2) {
        int a;
        boolean isEmpty;
        if (context != null && !TextUtils.isEmpty(str) && "com.xiaomi.xmsf".equals(context.getPackageName())) {
            String str2 = str;
            if (!"com.xiaomi.xmsf".equals(str) && -1 != (a = m14469a(context))) {
                synchronized (f8918a) {
                    isEmpty = f8920a.isEmpty();
                    m14480a(new C4719a(str, j2, a, z ? 1 : 0, a == 0 ? m14469a(context) : "", j));
                }
                if (isEmpty) {
                    f8916a.mo24736a((C4503al.C4505b) new C4720gy(context), 5000);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m14478a(Context context, String str, long j, boolean z, boolean z2, long j2) {
        m14477a(context, str, m14471a(m14469a(context), j, z, j2, z2), z, j2);
    }

    /* renamed from: a */
    private static void m14480a(C4719a aVar) {
        for (C4719a next : f8920a) {
            if (next.mo25236a(aVar)) {
                next.f8925b += aVar.f8925b;
                return;
            }
        }
        f8920a.add(aVar);
    }

    /* renamed from: a */
    public static synchronized void m14481a(String str) {
        synchronized (C4718gx.class) {
            if (!C4808l.m15366d() && !TextUtils.isEmpty(str)) {
                f8919a = str;
            }
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m14482b(android.content.Context r2) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4718gx.m14482b(android.content.Context):int");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m14483b(Context context, List<C4719a> list) {
        try {
            synchronized (C4813a.f9865a) {
                SQLiteDatabase writableDatabase = m14469a(context).getWritableDatabase();
                writableDatabase.beginTransaction();
                try {
                    for (C4719a next : list) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(Constants.PACKAGE_NAME, next.f8923a);
                        contentValues.put("message_ts", Long.valueOf(next.f8922a));
                        contentValues.put("network_type", Integer.valueOf(next.f8921a));
                        contentValues.put("bytes", Long.valueOf(next.f8925b));
                        contentValues.put("rcv", Integer.valueOf(next.f8924b));
                        contentValues.put("imsi", next.f8926b);
                        writableDatabase.insert("traffic", (String) null, contentValues);
                    }
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (SQLiteException e) {
            C3989b.m10678a((Throwable) e);
        }
    }
}
