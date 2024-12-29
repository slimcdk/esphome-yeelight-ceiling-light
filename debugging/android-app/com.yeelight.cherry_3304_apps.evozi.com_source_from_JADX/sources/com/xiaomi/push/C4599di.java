package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.mistatistic.sdk.MiStatInterface;
import com.xiaomi.push.C4503al;
import com.xiaomi.push.service.C4884be;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.xiaomi.push.di */
public class C4599di {

    /* renamed from: a */
    private static volatile C4599di f8387a;

    /* renamed from: a */
    private Context f8388a;

    /* renamed from: a */
    private final ConcurrentLinkedQueue<C4601b> f8389a;

    /* renamed from: com.xiaomi.push.di$a */
    class C4600a extends C4601b {
        C4600a() {
            super();
        }

        /* renamed from: b */
        public void mo24740b() {
            C4599di.m13720a(C4599di.this);
        }
    }

    /* renamed from: com.xiaomi.push.di$b */
    class C4601b extends C4503al.C4505b {

        /* renamed from: a */
        long f8391a = System.currentTimeMillis();

        C4601b() {
        }

        /* renamed from: a */
        public boolean mo24739a() {
            return true;
        }

        /* renamed from: b */
        public void mo24740b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final boolean m13734b() {
            return System.currentTimeMillis() - this.f8391a > 172800000;
        }
    }

    /* renamed from: com.xiaomi.push.di$c */
    class C4602c extends C4601b {

        /* renamed from: a */
        int f8393a;

        /* renamed from: a */
        File f8395a;

        /* renamed from: a */
        String f8396a;

        /* renamed from: a */
        boolean f8397a;

        /* renamed from: b */
        String f8398b;

        /* renamed from: b */
        boolean f8399b;

        C4602c(String str, String str2, File file, boolean z) {
            super();
            this.f8396a = str;
            this.f8398b = str2;
            this.f8395a = file;
            this.f8399b = z;
        }

        /* renamed from: c */
        private boolean mo24741c() {
            int i;
            int i2 = 0;
            SharedPreferences sharedPreferences = C4599di.m13720a(C4599di.this).getSharedPreferences("log.timestamp", 0);
            String string = sharedPreferences.getString("log.requst", "");
            long currentTimeMillis = System.currentTimeMillis();
            try {
                JSONObject jSONObject = new JSONObject(string);
                currentTimeMillis = jSONObject.getLong("time");
                i = jSONObject.getInt("times");
            } catch (JSONException unused) {
                i = 0;
            }
            if (System.currentTimeMillis() - currentTimeMillis >= MiStatInterface.MAX_UPLOAD_INTERVAL) {
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
                C3989b.m10680c("JSONException on put " + e.getMessage());
            }
            return true;
        }

        /* renamed from: a */
        public boolean mo24739a() {
            return C4521az.m13368d(C4599di.m13720a(C4599di.this)) || (this.f8399b && C4521az.m13366b(C4599di.m13720a(C4599di.this)));
        }

        /* renamed from: b */
        public void mo24740b() {
            try {
                if (mo24741c()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("uid", C4884be.mo25947a());
                    hashMap.put("token", this.f8398b);
                    hashMap.put("net", C4521az.m13351a(C4599di.m13720a(C4599di.this)));
                    C4521az.m13361a(this.f8396a, hashMap, this.f8395a, "file");
                }
                this.f8397a = true;
            } catch (IOException unused) {
            }
        }

        /* renamed from: c */
        public void m13738c() {
            if (!this.f8397a) {
                int i = this.f8393a + 1;
                this.f8393a = i;
                if (i < 3) {
                    C4599di.m13720a(C4599di.this).add(this);
                }
            }
            if (this.f8397a || this.f8393a >= 3) {
                this.f8395a.delete();
            }
            C4599di.this.m13723a((long) ((1 << this.f8393a) * 1000));
        }
    }

    private C4599di(Context context) {
        ConcurrentLinkedQueue<C4601b> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        this.f8389a = concurrentLinkedQueue;
        this.f8388a = context;
        concurrentLinkedQueue.add(new C4600a());
        m13727b(0);
    }

    /* renamed from: a */
    public static C4599di m13721a(Context context) {
        if (f8387a == null) {
            synchronized (C4599di.class) {
                if (f8387a == null) {
                    f8387a = new C4599di(context);
                }
            }
        }
        f8387a.f8388a = context;
        return f8387a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13723a(long j) {
        C4601b peek = this.f8389a.peek();
        if (peek != null && peek.mo24739a()) {
            m13727b(j);
        }
    }

    /* renamed from: b */
    private void m13726b() {
        if (!C4490aa.m13253b() && !C4490aa.m13251a()) {
            try {
                File file = new File(this.f8388a.getExternalFilesDir((String) null) + "/.logcache");
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
    private void m13727b(long j) {
        if (!this.f8389a.isEmpty()) {
            C4716gv.m14466a(new C4604dk(this), j);
        }
    }

    /* renamed from: c */
    private void m13728c() {
        while (!this.f8389a.isEmpty()) {
            C4601b peek = this.f8389a.peek();
            if (peek != null) {
                if (peek.mo24740b() || this.f8389a.size() > 6) {
                    C3989b.m10680c("remove Expired task");
                    this.f8389a.remove(peek);
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo24915a() {
        m13728c();
        m13723a(0);
    }

    /* renamed from: a */
    public void mo24916a(String str, String str2, Date date, Date date2, int i, boolean z) {
        this.f8389a.add(new C4603dj(this, i, date, date2, str, str2, z));
        m13727b(0);
    }
}
