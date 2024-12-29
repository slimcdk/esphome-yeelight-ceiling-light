package com.xiaomi.push.service;

import android.content.SharedPreferences;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4521ao;
import com.xiaomi.push.C4572c;
import com.xiaomi.push.C4635dw;
import com.xiaomi.push.C4637dx;
import com.xiaomi.push.C4746gz;
import com.xiaomi.push.C4805j;
import com.xiaomi.push.C4994v;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.xiaomi.push.service.bv */
public class C4929bv {

    /* renamed from: a */
    private static C4929bv f9628a = new C4929bv();

    /* renamed from: a */
    private static String f9629a;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C4521ao.C4523b f9630a;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C4635dw.C4636a f9631a;

    /* renamed from: a */
    private List<C4930a> f9632a = new ArrayList();

    /* renamed from: com.xiaomi.push.service.bv$a */
    public static abstract class C4930a {
        /* renamed from: a */
        public void mo30022a(C4635dw.C4636a aVar) {
        }

        /* renamed from: a */
        public void mo29144a(C4637dx.C4639b bVar) {
        }
    }

    private C4929bv() {
    }

    /* renamed from: a */
    public static C4929bv mo30029a() {
        return f9628a;
    }

    /* renamed from: a */
    public static synchronized String m15467a() {
        String str;
        synchronized (C4929bv.class) {
            if (f9629a == null) {
                SharedPreferences sharedPreferences = C4994v.m15733a().getSharedPreferences("XMPushServiceConfig", 0);
                String string = sharedPreferences.getString("DeviceUUID", (String) null);
                f9629a = string;
                if (string == null) {
                    String a = C4805j.m14864a(C4994v.m15733a(), false);
                    f9629a = a;
                    if (a != null) {
                        sharedPreferences.edit().putString("DeviceUUID", f9629a).commit();
                    }
                }
            }
            str = f9629a;
        }
        return str;
    }

    /* renamed from: b */
    private void m15470b() {
        if (this.f9631a == null) {
            m15472d();
        }
    }

    /* renamed from: c */
    private void m15471c() {
        if (this.f9630a == null) {
            C4931bw bwVar = new C4931bw(this);
            this.f9630a = bwVar;
            C4746gz.m14119a((C4521ao.C4523b) bwVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m15472d() {
        /*
            r4 = this;
            r0 = 0
            android.content.Context r1 = com.xiaomi.push.C4994v.m15733a()     // Catch:{ Exception -> 0x0027, all -> 0x0023 }
            java.lang.String r2 = "XMCloudCfg"
            java.io.FileInputStream r1 = r1.openFileInput(r2)     // Catch:{ Exception -> 0x0027, all -> 0x0023 }
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x0027, all -> 0x0023 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0027, all -> 0x0023 }
            com.xiaomi.push.b r0 = com.xiaomi.push.C4538b.m12924a((java.io.InputStream) r2)     // Catch:{ Exception -> 0x0021 }
            com.xiaomi.push.dw$a r0 = com.xiaomi.push.C4635dw.C4636a.m13364b((com.xiaomi.push.C4538b) r0)     // Catch:{ Exception -> 0x0021 }
            r4.f9631a = r0     // Catch:{ Exception -> 0x0021 }
            r2.close()     // Catch:{ Exception -> 0x0021 }
        L_0x001d:
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r2)
            goto L_0x0043
        L_0x0021:
            r0 = move-exception
            goto L_0x002a
        L_0x0023:
            r1 = move-exception
            r2 = r0
            r0 = r1
            goto L_0x0050
        L_0x0027:
            r1 = move-exception
            r2 = r0
            r0 = r1
        L_0x002a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x004f }
            r1.<init>()     // Catch:{ all -> 0x004f }
            java.lang.String r3 = "load config failure: "
            r1.append(r3)     // Catch:{ all -> 0x004f }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x004f }
            r1.append(r0)     // Catch:{ all -> 0x004f }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x004f }
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r0)     // Catch:{ all -> 0x004f }
            goto L_0x001d
        L_0x0043:
            com.xiaomi.push.dw$a r0 = r4.f9631a
            if (r0 != 0) goto L_0x004e
            com.xiaomi.push.dw$a r0 = new com.xiaomi.push.dw$a
            r0.<init>()
            r4.f9631a = r0
        L_0x004e:
            return
        L_0x004f:
            r0 = move-exception
        L_0x0050:
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r2)
            goto L_0x0055
        L_0x0054:
            throw r0
        L_0x0055:
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.C4929bv.m15472d():void");
    }

    /* renamed from: e */
    private void m15473e() {
        try {
            if (this.f9631a != null) {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(C4994v.m15733a().openFileOutput("XMCloudCfg", 0));
                C4572c a = C4572c.m13103a((OutputStream) bufferedOutputStream);
                this.f9631a.mo28929a(a);
                a.mo28799a();
                bufferedOutputStream.close();
            }
        } catch (Exception e) {
            C4408b.m12464a("save config failure: " + e.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int m15474a() {
        m15470b();
        C4635dw.C4636a aVar = this.f9631a;
        if (aVar != null) {
            return aVar.mo28933c();
        }
        return 0;
    }

    /* renamed from: a */
    public C4635dw.C4636a m15475a() {
        m15470b();
        return this.f9631a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m15476a() {
        this.f9632a.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo30030a(C4637dx.C4639b bVar) {
        C4930a[] aVarArr;
        if (bVar.mo28962d() && bVar.mo28962d() > mo30029a()) {
            m15471c();
        }
        synchronized (this) {
            List<C4930a> list = this.f9632a;
            aVarArr = (C4930a[]) list.toArray(new C4930a[list.size()]);
        }
        for (C4930a a : aVarArr) {
            a.mo29144a(bVar);
        }
    }

    /* renamed from: a */
    public synchronized void mo30031a(C4930a aVar) {
        this.f9632a.add(aVar);
    }
}
