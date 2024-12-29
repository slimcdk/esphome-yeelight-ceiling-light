package com.xiaomi.push.service;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4673fl;
import com.xiaomi.push.C4698gh;
import com.xiaomi.push.C4700gi;
import com.xiaomi.push.C4701gj;
import com.xiaomi.push.C4703gl;
import com.xiaomi.push.C4808l;
import com.xiaomi.push.service.C4860ap;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.xiaomi.push.service.d */
public class C4907d {

    /* renamed from: a */
    private C4925p f10128a = new C4925p();

    /* renamed from: a */
    public static String m15728a(C4860ap.C4862b bVar) {
        StringBuilder sb;
        String str;
        if (!"9".equals(bVar.f9998g)) {
            sb = new StringBuilder();
            sb.append(bVar.f9988a);
            str = ".permission.MIPUSH_RECEIVE";
        } else {
            sb = new StringBuilder();
            sb.append(bVar.f9988a);
            str = ".permission.MIMC_RECEIVE";
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    private static void m15729a(Context context, Intent intent, C4860ap.C4862b bVar) {
        if ("com.xiaomi.xmsf".equals(context.getPackageName())) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, m15728a(bVar));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C4860ap.C4862b mo25963a(C4673fl flVar) {
        Collection a = C4860ap.mo25920a().mo25922a(Integer.toString(flVar.mo25112a()));
        if (a.isEmpty()) {
            return null;
        }
        Iterator it = a.iterator();
        if (a.size() == 1) {
            return (C4860ap.C4862b) it.next();
        }
        String g = flVar.mo25126g();
        while (it.hasNext()) {
            C4860ap.C4862b bVar = (C4860ap.C4862b) it.next();
            if (TextUtils.equals(g, bVar.f9992b)) {
                return bVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0034  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.xiaomi.push.service.C4860ap.C4862b mo25964a(com.xiaomi.push.C4701gj r6) {
        /*
            r5 = this;
            com.xiaomi.push.service.ap r0 = com.xiaomi.push.service.C4860ap.mo25920a()
            java.lang.String r1 = r6.mo25215k()
            java.util.Collection r0 = r0.mo25922a((java.lang.String) r1)
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto L_0x0014
            return r2
        L_0x0014:
            java.util.Iterator r1 = r0.iterator()
            int r0 = r0.size()
            r3 = 1
            if (r0 != r3) goto L_0x0026
            java.lang.Object r6 = r1.next()
            com.xiaomi.push.service.ap$b r6 = (com.xiaomi.push.service.C4860ap.C4862b) r6
            return r6
        L_0x0026:
            java.lang.String r0 = r6.mo25219m()
            java.lang.String r6 = r6.mo25217l()
        L_0x002e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x004b
            java.lang.Object r3 = r1.next()
            com.xiaomi.push.service.ap$b r3 = (com.xiaomi.push.service.C4860ap.C4862b) r3
            java.lang.String r4 = r3.f9992b
            boolean r4 = android.text.TextUtils.equals(r0, r4)
            if (r4 != 0) goto L_0x004a
            java.lang.String r4 = r3.f9992b
            boolean r4 = android.text.TextUtils.equals(r6, r4)
            if (r4 == 0) goto L_0x002e
        L_0x004a:
            return r3
        L_0x004b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.C4907d.mo25964a(com.xiaomi.push.gj):com.xiaomi.push.service.ap$b");
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: a */
    public void mo25965a(Context context) {
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.service_started");
        if (C4808l.m15365c()) {
            intent.addFlags(16777216);
        }
        context.sendBroadcast(intent);
    }

    /* renamed from: a */
    public void mo25966a(Context context, C4860ap.C4862b bVar, int i) {
        if (!"5".equalsIgnoreCase(bVar.f9998g)) {
            Intent intent = new Intent();
            intent.setAction("com.xiaomi.push.channel_closed");
            intent.setPackage(bVar.f9988a);
            intent.putExtra(C4870at.f10043r, bVar.f9998g);
            intent.putExtra("ext_reason", i);
            intent.putExtra(C4870at.f10041p, bVar.f9992b);
            intent.putExtra(C4870at.f10018C, bVar.f10000i);
            if (bVar.f9982a == null || !"9".equals(bVar.f9998g)) {
                m15729a(context, intent, bVar);
                return;
            }
            try {
                bVar.f9982a.send(Message.obtain((Handler) null, 17, intent));
            } catch (RemoteException unused) {
                bVar.f9982a = null;
                StringBuilder sb = new StringBuilder();
                sb.append("peer may died: ");
                String str = bVar.f9992b;
                sb.append(str.substring(str.lastIndexOf(64)));
                C3989b.m10669a(sb.toString());
            }
        }
    }

    /* renamed from: a */
    public void mo25967a(Context context, C4860ap.C4862b bVar, String str, String str2) {
        if ("5".equalsIgnoreCase(bVar.f9998g)) {
            C3989b.m10681d("mipush kicked by server");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.kicked");
        intent.setPackage(bVar.f9988a);
        intent.putExtra("ext_kick_type", str);
        intent.putExtra("ext_kick_reason", str2);
        intent.putExtra("ext_chid", bVar.f9998g);
        intent.putExtra(C4870at.f10041p, bVar.f9992b);
        intent.putExtra(C4870at.f10018C, bVar.f10000i);
        m15729a(context, intent, bVar);
    }

    /* renamed from: a */
    public void mo25968a(Context context, C4860ap.C4862b bVar, boolean z, int i, String str) {
        if ("5".equalsIgnoreCase(bVar.f9998g)) {
            this.f10128a.mo25998a(context, bVar, z, i, str);
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.channel_opened");
        intent.setPackage(bVar.f9988a);
        intent.putExtra("ext_succeeded", z);
        if (!z) {
            intent.putExtra("ext_reason", i);
        }
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("ext_reason_msg", str);
        }
        intent.putExtra("ext_chid", bVar.f9998g);
        intent.putExtra(C4870at.f10041p, bVar.f9992b);
        intent.putExtra(C4870at.f10018C, bVar.f10000i);
        m15729a(context, intent, bVar);
    }

    /* renamed from: a */
    public void mo25969a(XMPushService xMPushService, String str, C4673fl flVar) {
        C4860ap.C4862b a = mo25963a(flVar);
        if (a == null) {
            C3989b.m10681d("error while notify channel closed! channel " + str + " not registered");
        } else if ("5".equalsIgnoreCase(str)) {
            this.f10128a.mo25999a(xMPushService, flVar, a);
        } else {
            String str2 = a.f9988a;
            Intent intent = new Intent();
            intent.setAction("com.xiaomi.push.new_msg");
            intent.setPackage(str2);
            intent.putExtra("ext_chid", str);
            intent.putExtra("ext_raw_packet", flVar.mo25116a(a.f9999h));
            intent.putExtra(C4870at.f10018C, a.f10000i);
            intent.putExtra(C4870at.f10047v, a.f9999h);
            if (a.f9982a != null) {
                try {
                    a.f9982a.send(Message.obtain((Handler) null, 17, intent));
                    return;
                } catch (RemoteException unused) {
                    a.f9982a = null;
                    StringBuilder sb = new StringBuilder();
                    sb.append("peer may died: ");
                    String str3 = a.f9992b;
                    sb.append(str3.substring(str3.lastIndexOf(64)));
                    C3989b.m10669a(sb.toString());
                }
            }
            if (!"com.xiaomi.xmsf".equals(str2)) {
                m15729a((Context) xMPushService, intent, a);
            }
        }
    }

    /* renamed from: a */
    public void mo25970a(XMPushService xMPushService, String str, C4701gj gjVar) {
        String str2;
        String str3;
        C4860ap.C4862b a = mo25964a(gjVar);
        if (a == null) {
            str3 = "error while notify channel closed! channel " + str + " not registered";
        } else if ("5".equalsIgnoreCase(str)) {
            this.f10128a.mo26000a(xMPushService, gjVar, a);
            return;
        } else {
            String str4 = a.f9988a;
            if (gjVar instanceof C4700gi) {
                str2 = "com.xiaomi.push.new_msg";
            } else if (gjVar instanceof C4698gh) {
                str2 = "com.xiaomi.push.new_iq";
            } else if (gjVar instanceof C4703gl) {
                str2 = "com.xiaomi.push.new_pres";
            } else {
                str3 = "unknown packet type, drop it";
            }
            Intent intent = new Intent();
            intent.setAction(str2);
            intent.setPackage(str4);
            intent.putExtra("ext_chid", str);
            intent.putExtra("ext_packet", gjVar.mo25186a());
            intent.putExtra(C4870at.f10018C, a.f10000i);
            intent.putExtra(C4870at.f10047v, a.f9999h);
            m15729a((Context) xMPushService, intent, a);
            return;
        }
        C3989b.m10681d(str3);
    }
}
