package com.xiaomi.push.service;

import android.content.SharedPreferences;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4503al;
import com.xiaomi.push.C4554c;
import com.xiaomi.push.C4630ej;
import com.xiaomi.push.C4632ek;
import com.xiaomi.push.C4716gv;
import com.xiaomi.push.C4753i;
import com.xiaomi.push.C4937t;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.xiaomi.push.service.be */
public class C4884be {

    /* renamed from: a */
    private static C4884be f10085a = new C4884be();

    /* renamed from: a */
    private static String f10086a;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C4503al.C4505b f10087a;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C4630ej.C4631a f10088a;

    /* renamed from: a */
    private List<C4885a> f10089a = new ArrayList();

    /* renamed from: com.xiaomi.push.service.be$a */
    public static abstract class C4885a {
        /* renamed from: a */
        public void mo25937a(C4630ej.C4631a aVar) {
        }

        /* renamed from: a */
        public void mo25245a(C4632ek.C4634b bVar) {
        }
    }

    private C4884be() {
    }

    /* renamed from: a */
    public static C4884be mo25947a() {
        return f10085a;
    }

    /* renamed from: a */
    public static synchronized String m15676a() {
        String str;
        synchronized (C4884be.class) {
            if (f10086a == null) {
                SharedPreferences sharedPreferences = C4937t.m15865a().getSharedPreferences("XMPushServiceConfig", 0);
                String string = sharedPreferences.getString("DeviceUUID", (String) null);
                f10086a = string;
                if (string == null) {
                    String a = C4753i.m14741a(C4937t.m15865a(), false);
                    f10086a = a;
                    if (a != null) {
                        sharedPreferences.edit().putString("DeviceUUID", f10086a).commit();
                    }
                }
            }
            str = f10086a;
        }
        return str;
    }

    /* renamed from: b */
    private void m15679b() {
        if (this.f10088a == null) {
            m15681d();
        }
    }

    /* renamed from: c */
    private void m15680c() {
        if (this.f10087a == null) {
            C4886bf bfVar = new C4886bf(this);
            this.f10087a = bfVar;
            C4716gv.m14465a((C4503al.C4505b) bfVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m15681d() {
        /*
            r4 = this;
            r0 = 0
            android.content.Context r1 = com.xiaomi.push.C4937t.m15865a()     // Catch:{ Exception -> 0x0027, all -> 0x0023 }
            java.lang.String r2 = "XMCloudCfg"
            java.io.FileInputStream r1 = r1.openFileInput(r2)     // Catch:{ Exception -> 0x0027, all -> 0x0023 }
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x0027, all -> 0x0023 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0027, all -> 0x0023 }
            com.xiaomi.push.b r0 = com.xiaomi.push.C4524b.m13373a((java.io.InputStream) r2)     // Catch:{ Exception -> 0x0021 }
            com.xiaomi.push.ej$a r0 = com.xiaomi.push.C4630ej.C4631a.m13832b((com.xiaomi.push.C4524b) r0)     // Catch:{ Exception -> 0x0021 }
            r4.f10088a = r0     // Catch:{ Exception -> 0x0021 }
            r2.close()     // Catch:{ Exception -> 0x0021 }
        L_0x001d:
            com.xiaomi.push.C4942y.m15884a((java.io.Closeable) r2)
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
            com.xiaomi.channel.commonutils.logger.C3989b.m10669a((java.lang.String) r0)     // Catch:{ all -> 0x004f }
            goto L_0x001d
        L_0x0043:
            com.xiaomi.push.ej$a r0 = r4.f10088a
            if (r0 != 0) goto L_0x004e
            com.xiaomi.push.ej$a r0 = new com.xiaomi.push.ej$a
            r0.<init>()
            r4.f10088a = r0
        L_0x004e:
            return
        L_0x004f:
            r0 = move-exception
        L_0x0050:
            com.xiaomi.push.C4942y.m15884a((java.io.Closeable) r2)
            goto L_0x0055
        L_0x0054:
            throw r0
        L_0x0055:
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.C4884be.m15681d():void");
    }

    /* renamed from: e */
    private void m15682e() {
        try {
            if (this.f10088a != null) {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(C4937t.m15865a().openFileOutput("XMCloudCfg", 0));
                C4554c a = C4554c.m13513a((OutputStream) bufferedOutputStream);
                this.f10088a.mo24934a(a);
                a.mo24798a();
                bufferedOutputStream.close();
            }
        } catch (Exception e) {
            C3989b.m10669a("save config failure: " + e.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int m15683a() {
        m15679b();
        C4630ej.C4631a aVar = this.f10088a;
        if (aVar != null) {
            return aVar.mo24945c();
        }
        return 0;
    }

    /* renamed from: a */
    public C4630ej.C4631a m15684a() {
        m15679b();
        return this.f10088a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m15685a() {
        this.f10089a.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo25948a(C4632ek.C4634b bVar) {
        C4885a[] aVarArr;
        if (bVar.mo24974d() && bVar.mo24974d() > mo25947a()) {
            m15680c();
        }
        synchronized (this) {
            aVarArr = (C4885a[]) this.f10089a.toArray(new C4885a[this.f10089a.size()]);
        }
        for (C4885a a : aVarArr) {
            a.mo25245a(bVar);
        }
    }

    /* renamed from: a */
    public synchronized void mo25949a(C4885a aVar) {
        this.f10089a.add(aVar);
    }
}
