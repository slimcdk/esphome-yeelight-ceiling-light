package com.xiaomi.push.service;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4695fl;
import com.xiaomi.push.C4728gl;
import com.xiaomi.push.C4730gm;
import com.xiaomi.push.C4731gn;
import com.xiaomi.push.C4733gp;
import com.xiaomi.push.C4759hi;
import com.xiaomi.push.C4830m;
import com.xiaomi.push.service.C4906bg;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.xiaomi.push.service.j */
public class C4967j {

    /* renamed from: a */
    private C4990y f9693a = new C4990y();

    /* renamed from: a */
    public static String m15560a(C4906bg.C4908b bVar) {
        StringBuilder sb;
        String str;
        if (!"9".equals(bVar.f9547g)) {
            sb = new StringBuilder();
            sb.append(bVar.f9537a);
            str = ".permission.MIPUSH_RECEIVE";
        } else {
            sb = new StringBuilder();
            sb.append(bVar.f9537a);
            str = ".permission.MIMC_RECEIVE";
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    private static void m15561a(Context context, Intent intent, C4906bg.C4908b bVar) {
        if ("com.xiaomi.xmsf".equals(context.getPackageName())) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, m15560a(bVar));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C4906bg.C4908b mo30046a(C4695fl flVar) {
        Collection a = C4906bg.mo30005a().mo30007a(Integer.toString(flVar.mo29145a()));
        if (a.isEmpty()) {
            return null;
        }
        Iterator it = a.iterator();
        if (a.size() == 1) {
            return (C4906bg.C4908b) it.next();
        }
        String g = flVar.mo29160g();
        while (it.hasNext()) {
            C4906bg.C4908b bVar = (C4906bg.C4908b) it.next();
            if (TextUtils.equals(g, bVar.f9541b)) {
                return bVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0034  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.xiaomi.push.service.C4906bg.C4908b mo30047a(com.xiaomi.push.C4731gn r6) {
        /*
            r5 = this;
            com.xiaomi.push.service.bg r0 = com.xiaomi.push.service.C4906bg.mo30005a()
            java.lang.String r1 = r6.mo29252k()
            java.util.Collection r0 = r0.mo30007a((java.lang.String) r1)
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
            com.xiaomi.push.service.bg$b r6 = (com.xiaomi.push.service.C4906bg.C4908b) r6
            return r6
        L_0x0026:
            java.lang.String r0 = r6.mo29256m()
            java.lang.String r6 = r6.mo29254l()
        L_0x002e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x004b
            java.lang.Object r3 = r1.next()
            com.xiaomi.push.service.bg$b r3 = (com.xiaomi.push.service.C4906bg.C4908b) r3
            java.lang.String r4 = r3.f9541b
            boolean r4 = android.text.TextUtils.equals(r0, r4)
            if (r4 != 0) goto L_0x004a
            java.lang.String r4 = r3.f9541b
            boolean r4 = android.text.TextUtils.equals(r6, r4)
            if (r4 == 0) goto L_0x002e
        L_0x004a:
            return r3
        L_0x004b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.C4967j.mo30047a(com.xiaomi.push.gn):com.xiaomi.push.service.bg$b");
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: a */
    public void mo30048a(Context context) {
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.service_started");
        if (C4830m.m15013c()) {
            intent.addFlags(16777216);
        }
        C4408b.m12464a("[Bcst] send ***.push.service_started broadcast to inform push service has started.");
        context.sendBroadcast(intent);
    }

    @SuppressLint({"DefaultLocale"})
    /* renamed from: a */
    public void mo30049a(Context context, C4906bg.C4908b bVar, int i) {
        if (!"5".equalsIgnoreCase(bVar.f9547g)) {
            Intent intent = new Intent();
            intent.setAction("com.xiaomi.push.channel_closed");
            intent.setPackage(bVar.f9537a);
            intent.putExtra(C4916bk.f9598t, bVar.f9547g);
            intent.putExtra("ext_reason", i);
            intent.putExtra(C4916bk.f9595q, bVar.f9541b);
            intent.putExtra(C4916bk.f9570F, bVar.f9549i);
            if (bVar.f9531a == null || !"9".equals(bVar.f9547g)) {
                C4408b.m12464a(String.format("[Bcst] notify channel closed. %s,%s,%d", new Object[]{bVar.f9547g, bVar.f9537a, Integer.valueOf(i)}));
                m15561a(context, intent, bVar);
                return;
            }
            try {
                bVar.f9531a.send(Message.obtain((Handler) null, 17, intent));
            } catch (RemoteException unused) {
                bVar.f9531a = null;
                StringBuilder sb = new StringBuilder();
                sb.append("peer may died: ");
                String str = bVar.f9541b;
                sb.append(str.substring(str.lastIndexOf(64)));
                C4408b.m12464a(sb.toString());
            }
        }
    }

    /* renamed from: a */
    public void mo30050a(Context context, C4906bg.C4908b bVar, String str, String str2) {
        if (bVar == null) {
            C4408b.m12483d("error while notify kick by server!");
        } else if ("5".equalsIgnoreCase(bVar.f9547g)) {
            C4408b.m12483d("mipush kicked by server");
        } else {
            Intent intent = new Intent();
            intent.setAction("com.xiaomi.push.kicked");
            intent.setPackage(bVar.f9537a);
            intent.putExtra("ext_kick_type", str);
            intent.putExtra("ext_kick_reason", str2);
            intent.putExtra("ext_chid", bVar.f9547g);
            intent.putExtra(C4916bk.f9595q, bVar.f9541b);
            intent.putExtra(C4916bk.f9570F, bVar.f9549i);
            C4408b.m12464a(String.format("[Bcst] notify packet(blob) arrival. %s,%s,%s", new Object[]{bVar.f9547g, bVar.f9537a, str2}));
            m15561a(context, intent, bVar);
        }
    }

    @SuppressLint({"DefaultLocale"})
    /* renamed from: a */
    public void mo30051a(Context context, C4906bg.C4908b bVar, boolean z, int i, String str) {
        if ("5".equalsIgnoreCase(bVar.f9547g)) {
            this.f9693a.mo30091a(context, bVar, z, i, str);
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.channel_opened");
        intent.setPackage(bVar.f9537a);
        intent.putExtra("ext_succeeded", z);
        if (!z) {
            intent.putExtra("ext_reason", i);
        }
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("ext_reason_msg", str);
        }
        intent.putExtra("ext_chid", bVar.f9547g);
        intent.putExtra(C4916bk.f9595q, bVar.f9541b);
        intent.putExtra(C4916bk.f9570F, bVar.f9549i);
        C4408b.m12464a(String.format("[Bcst] notify channel open result. %s,%s,%b,%d", new Object[]{bVar.f9547g, bVar.f9537a, Boolean.valueOf(z), Integer.valueOf(i)}));
        m15561a(context, intent, bVar);
    }

    /* renamed from: a */
    public void mo30052a(XMPushService xMPushService, String str, C4695fl flVar) {
        C4880ao aoVar;
        C4906bg.C4908b a = mo30046a(flVar);
        if (a == null) {
            C4408b.m12483d("error while notify channel closed! channel " + str + " not registered");
        } else if ("5".equalsIgnoreCase(str)) {
            this.f9693a.mo30092a(xMPushService, flVar, a);
        } else {
            String str2 = a.f9537a;
            Intent intent = new Intent();
            intent.setAction("com.xiaomi.push.new_msg");
            intent.setPackage(str2);
            intent.putExtra("ext_rcv_timestamp", SystemClock.elapsedRealtime());
            intent.putExtra("ext_chid", str);
            intent.putExtra("ext_raw_packet", flVar.mo29149a(a.f9548h));
            intent.putExtra(C4916bk.f9570F, a.f9549i);
            intent.putExtra(C4916bk.f9602x, a.f9548h);
            if (a.f9531a != null) {
                try {
                    a.f9531a.send(Message.obtain((Handler) null, 17, intent));
                    C4408b.m12464a("message was sent by messenger for chid=" + str);
                    return;
                } catch (RemoteException unused) {
                    a.f9531a = null;
                    StringBuilder sb = new StringBuilder();
                    sb.append("peer may died: ");
                    String str3 = a.f9541b;
                    sb.append(str3.substring(str3.lastIndexOf(64)));
                    C4408b.m12464a(sb.toString());
                }
            }
            if (!"com.xiaomi.xmsf".equals(str2)) {
                C4408b.m12464a(String.format("[Bcst] notify packet(blob) arrival. %s,%s,%s", new Object[]{a.f9547g, a.f9537a, flVar.mo29158e()}));
                m15561a((Context) xMPushService, intent, a);
                if ("10".equals(str) && (aoVar = flVar.f8170a) != null) {
                    aoVar.f9476d = System.currentTimeMillis();
                    if (C4759hi.m14180a(xMPushService, 1)) {
                        C4935bz.m15497a("category_coord_down", "coord_down", "com.xiaomi.xmsf", flVar.f8170a);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo30053a(XMPushService xMPushService, String str, C4731gn gnVar) {
        String str2;
        String str3;
        C4906bg.C4908b a = mo30047a(gnVar);
        if (a == null) {
            str3 = "error while notify channel closed! channel " + str + " not registered";
        } else if ("5".equalsIgnoreCase(str)) {
            this.f9693a.mo30093a(xMPushService, gnVar, a);
            return;
        } else {
            String str4 = a.f9537a;
            if (gnVar instanceof C4730gm) {
                str2 = "com.xiaomi.push.new_msg";
            } else if (gnVar instanceof C4728gl) {
                str2 = "com.xiaomi.push.new_iq";
            } else if (gnVar instanceof C4733gp) {
                str2 = "com.xiaomi.push.new_pres";
            } else {
                str3 = "unknown packet type, drop it";
            }
            Intent intent = new Intent();
            intent.setAction(str2);
            intent.setPackage(str4);
            intent.putExtra("ext_chid", str);
            intent.putExtra("ext_packet", gnVar.mo29223a());
            intent.putExtra(C4916bk.f9570F, a.f9549i);
            intent.putExtra(C4916bk.f9602x, a.f9548h);
            C4408b.m12464a(String.format("[Bcst] notify packet arrival. %s,%s,%s", new Object[]{a.f9547g, a.f9537a, gnVar.mo29251j()}));
            m15561a((Context) xMPushService, intent, a);
            return;
        }
        C4408b.m12483d(str3);
    }
}
