package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4521ao;
import com.xiaomi.push.service.C4929bv;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.xiaomi.push.df */
public class C4614df {

    /* renamed from: a */
    private static volatile C4614df f7787a;

    /* renamed from: a */
    private Context f7788a;

    /* renamed from: a */
    private final ConcurrentLinkedQueue<C4616b> f7789a;

    /* renamed from: com.xiaomi.push.df$a */
    class C4615a extends C4616b {
        C4615a() {
            super();
        }

        /* renamed from: b */
        public void mo28749b() {
            C4614df.m13296a(C4614df.this);
        }
    }

    /* renamed from: com.xiaomi.push.df$b */
    class C4616b extends C4521ao.C4523b {

        /* renamed from: a */
        long f7791a = System.currentTimeMillis();

        C4616b() {
        }

        /* renamed from: a */
        public boolean mo28748a() {
            return true;
        }

        /* renamed from: b */
        public void mo28749b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final boolean m13310b() {
            return System.currentTimeMillis() - this.f7791a > 172800000;
        }
    }

    /* renamed from: com.xiaomi.push.df$c */
    class C4617c extends C4616b {

        /* renamed from: a */
        int f7793a;

        /* renamed from: a */
        File f7795a;

        /* renamed from: a */
        String f7796a;

        /* renamed from: a */
        boolean f7797a;

        /* renamed from: b */
        String f7798b;

        /* renamed from: b */
        boolean f7799b;

        C4617c(String str, String str2, File file, boolean z) {
            super();
            this.f7796a = str;
            this.f7798b = str2;
            this.f7795a = file;
            this.f7799b = z;
        }

        /* renamed from: c */
        private boolean mo28750c() {
            int i;
            int i2 = 0;
            SharedPreferences sharedPreferences = C4614df.m13296a(C4614df.this).getSharedPreferences("log.timestamp", 0);
            String string = sharedPreferences.getString("log.requst", "");
            long currentTimeMillis = System.currentTimeMillis();
            try {
                JSONObject jSONObject = new JSONObject(string);
                currentTimeMillis = jSONObject.getLong("time");
                i = jSONObject.getInt("times");
            } catch (JSONException unused) {
                i = 0;
            }
            if (System.currentTimeMillis() - currentTimeMillis >= 86400000) {
                currentTimeMillis = System.currentTimeMillis();
            } else if (i > 10) {
                return false;
            } else {
                i2 = i;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("time", currentTimeMillis);
                jSONObject2.put("times", i2 + 1);
                sharedPreferences.edit().putString("log.requst", jSONObject2.toString()).commit();
            } catch (JSONException e) {
                C4408b.m12482c("JSONException on put " + e.getMessage());
            }
            return true;
        }

        /* renamed from: a */
        public boolean mo28748a() {
            return C4551bj.m13003e(C4614df.m13296a(C4614df.this)) || (this.f7799b && C4551bj.m13000b(C4614df.m13296a(C4614df.this)));
        }

        /* renamed from: b */
        public void mo28749b() {
            try {
                if (mo28750c()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("uid", C4929bv.mo30029a());
                    hashMap.put("token", this.f7798b);
                    hashMap.put("net", C4551bj.m12985a(C4614df.m13296a(C4614df.this)));
                    C4551bj.m12995a(this.f7796a, hashMap, this.f7795a, "file");
                }
                this.f7797a = true;
            } catch (IOException unused) {
            }
        }

        /* renamed from: c */
        public void m13314c() {
            if (!this.f7797a) {
                int i = this.f7793a + 1;
                this.f7793a = i;
                if (i < 3) {
                    C4614df.m13296a(C4614df.this).add(this);
                }
            }
            if (this.f7797a || this.f7793a >= 3) {
                this.f7795a.delete();
            }
            C4614df.this.m13299a((long) ((1 << this.f7793a) * 1000));
        }
    }

    private C4614df(Context context) {
        ConcurrentLinkedQueue<C4616b> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        this.f7789a = concurrentLinkedQueue;
        this.f7788a = context;
        concurrentLinkedQueue.add(new C4615a());
        m13303b(0);
    }

    /* renamed from: a */
    public static C4614df m13297a(Context context) {
        if (f7787a == null) {
            synchronized (C4614df.class) {
                if (f7787a == null) {
                    f7787a = new C4614df(context);
                }
            }
        }
        f7787a.f7788a = context;
        return f7787a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13299a(long j) {
        C4616b peek = this.f7789a.peek();
        if (peek != null && peek.mo28748a()) {
            m13303b(j);
        }
    }

    /* renamed from: b */
    private void m13302b() {
        if (!C4508ad.m12840b() && !C4508ad.m12838a()) {
            try {
                File file = new File(this.f7788a.getExternalFilesDir((String) null) + "/.logcache");
                if (file.exists() && file.isDirectory()) {
                    for (File delete : file.listFiles()) {
                        delete.delete();
                    }
                }
            } catch (NullPointerException unused) {
            }
        }
    }

    /* renamed from: b */
    private void m13303b(long j) {
        if (!this.f7789a.isEmpty()) {
            C4746gz.m14120a(new C4619dh(this), j);
        }
    }

    /* renamed from: c */
    private void m13304c() {
        while (!this.f7789a.isEmpty()) {
            C4616b peek = this.f7789a.peek();
            if (peek != null) {
                if (peek.mo28749b() || this.f7789a.size() > 6) {
                    C4408b.m12482c("remove Expired task");
                    this.f7789a.remove(peek);
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo28905a() {
        m13304c();
        m13299a(0);
    }

    /* renamed from: a */
    public void mo28906a(String str, String str2, Date date, Date date2, int i, boolean z) {
        this.f7789a.add(new C4618dg(this, i, date, date2, str, str2, z));
        m13303b(0);
    }
}
