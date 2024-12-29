package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4596cr;
import com.xiaomi.push.C4600cv;
import com.xiaomi.push.C4614df;
import com.xiaomi.push.C4637dx;
import com.xiaomi.push.C4679ez;
import com.xiaomi.push.C4692fj;
import com.xiaomi.push.C4695fl;
import com.xiaomi.push.C4713fx;
import com.xiaomi.push.C4727gk;
import com.xiaomi.push.C4728gl;
import com.xiaomi.push.C4730gm;
import com.xiaomi.push.C4731gn;
import com.xiaomi.push.C4750hb;
import com.xiaomi.push.service.C4906bg;
import com.xiaomi.push.service.XMPushService;
import java.util.Date;

/* renamed from: com.xiaomi.push.service.be */
public class C4903be {

    /* renamed from: a */
    private XMPushService f9523a;

    C4903be(XMPushService xMPushService) {
        this.f9523a = xMPushService;
    }

    /* renamed from: a */
    private void m15383a(C4727gk gkVar) {
        String c = gkVar.mo29220c();
        if (!TextUtils.isEmpty(c)) {
            String[] split = c.split(";");
            C4596cr a = C4600cv.mo28881a().mo28879a(C4713fx.mo29197a(), false);
            if (a != null && split.length > 0) {
                a.mo28862a(split);
                this.f9523a.mo29929a(20, (Exception) null);
                this.f9523a.mo29937a(true);
            }
        }
    }

    /* renamed from: b */
    private void m15384b(C4731gn gnVar) {
        C4906bg.C4908b a;
        String l = gnVar.mo29254l();
        String k = gnVar.mo29252k();
        if (!TextUtils.isEmpty(l) && !TextUtils.isEmpty(k) && (a = C4906bg.mo30005a().mo30006a(k, l)) != null) {
            C4750hb.m14147a(this.f9523a, a.f9537a, (long) C4750hb.m14139a(gnVar.mo29223a()), true, true, System.currentTimeMillis());
        }
    }

    /* renamed from: c */
    private void m15385c(C4695fl flVar) {
        C4906bg.C4908b a;
        String g = flVar.mo29160g();
        String num = Integer.toString(flVar.mo29145a());
        if (!TextUtils.isEmpty(g) && !TextUtils.isEmpty(num) && (a = C4906bg.mo30005a().mo30006a(num, g)) != null) {
            C4750hb.m14147a(this.f9523a, a.f9537a, (long) flVar.mo29156c(), true, true, System.currentTimeMillis());
        }
    }

    /* renamed from: a */
    public void mo30001a(C4695fl flVar) {
        if (5 != flVar.mo29145a()) {
            m15385c(flVar);
        }
        try {
            mo30003b(flVar);
        } catch (Exception e) {
            C4408b.m12477a("handle Blob chid = " + flVar.mo29145a() + " cmd = " + flVar.mo29145a() + " packetid = " + flVar.mo29158e() + " failure ", (Throwable) e);
        }
    }

    /* renamed from: a */
    public void mo30002a(C4731gn gnVar) {
        if (!"5".equals(gnVar.mo29252k())) {
            m15384b(gnVar);
        }
        String k = gnVar.mo29252k();
        if (TextUtils.isEmpty(k)) {
            k = TimerCodec.ENABLE;
            gnVar.mo29255l(k);
        }
        if (k.equals(TimerCodec.DISENABLE)) {
            C4408b.m12464a("Received wrong packet with chid = 0 : " + gnVar.mo29223a());
        }
        if (gnVar instanceof C4728gl) {
            C4727gk a = gnVar.mo29228a("kick");
            if (a != null) {
                String l = gnVar.mo29254l();
                String a2 = a.mo29217a("type");
                String a3 = a.mo29217a("reason");
                C4408b.m12464a("kicked by server, chid=" + k + " res=" + C4906bg.C4908b.m15409a(l) + " type=" + a2 + " reason=" + a3);
                if ("wait".equals(a2)) {
                    C4906bg.C4908b a4 = C4906bg.mo30005a().mo30006a(k, l);
                    if (a4 != null) {
                        this.f9523a.mo29934a(a4);
                        a4.mo30018a(C4906bg.C4912c.unbind, 3, 0, a3, a2);
                        return;
                    }
                    return;
                }
                this.f9523a.mo29935a(k, l, 3, a3, a2);
                C4906bg.mo30005a().mo30006a(k, l);
                return;
            }
        } else if (gnVar instanceof C4730gm) {
            C4730gm gmVar = (C4730gm) gnVar;
            if ("redir".equals(gmVar.mo29226b())) {
                C4727gk a5 = gmVar.mo29228a("hosts");
                if (a5 != null) {
                    m15383a(a5);
                    return;
                }
                return;
            }
        }
        this.f9523a.mo29940b().mo30053a(this.f9523a, k, gnVar);
    }

    /* renamed from: b */
    public void mo30003b(C4695fl flVar) {
        StringBuilder sb;
        String a;
        String str;
        int i;
        int i2;
        C4906bg.C4912c cVar;
        String a2 = flVar.mo29145a();
        if (flVar.mo29145a() != 0) {
            String num = Integer.toString(flVar.mo29145a());
            if ("SECMSG".equals(flVar.mo29145a())) {
                if (!flVar.mo29145a()) {
                    this.f9523a.mo29940b().mo30052a(this.f9523a, num, flVar);
                    return;
                }
                sb = new StringBuilder();
                sb.append("Recv SECMSG errCode = ");
                sb.append(flVar.mo29153b());
                sb.append(" errStr = ");
                a = flVar.mo29156c();
            } else if ("BIND".equals(a2)) {
                C4637dx.C4641d a3 = C4637dx.C4641d.m13465a(flVar.mo29145a());
                String g = flVar.mo29160g();
                C4906bg.C4908b a4 = C4906bg.mo30005a().mo30006a(num, g);
                if (a4 != null) {
                    if (a3.mo28924a()) {
                        C4408b.m12464a("SMACK: channel bind succeeded, chid=" + flVar.mo29145a());
                        a4.mo30018a(C4906bg.C4912c.binded, 1, 0, (String) null, (String) null);
                        return;
                    }
                    String a5 = a3.mo28924a();
                    if ("auth".equals(a5)) {
                        if ("invalid-sig".equals(a3.mo28930b())) {
                            C4408b.m12464a("SMACK: bind error invalid-sig token = " + a4.f9543c + " sec = " + a4.f9548h);
                            C4692fj.m13851a(0, C4679ez.BIND_INVALID_SIG.mo29089a(), 1, (String) null, 0);
                        }
                        cVar = C4906bg.C4912c.unbind;
                        i2 = 1;
                        i = 5;
                    } else if ("cancel".equals(a5)) {
                        cVar = C4906bg.C4912c.unbind;
                        i2 = 1;
                        i = 7;
                    } else {
                        if ("wait".equals(a5)) {
                            this.f9523a.mo29934a(a4);
                            a4.mo30018a(C4906bg.C4912c.unbind, 1, 7, a3.mo28930b(), a5);
                        }
                        str = "SMACK: channel bind failed, chid=" + num + " reason=" + a3.mo28930b();
                        C4408b.m12464a(str);
                    }
                    a4.mo30018a(cVar, i2, i, a3.mo28930b(), a5);
                    C4906bg.mo30005a().mo30006a(num, g);
                    str = "SMACK: channel bind failed, chid=" + num + " reason=" + a3.mo28930b();
                    C4408b.m12464a(str);
                }
                return;
            } else if ("KICK".equals(a2)) {
                C4637dx.C4644g a6 = C4637dx.C4644g.m13533a(flVar.mo29145a());
                String g2 = flVar.mo29160g();
                String a7 = a6.mo28924a();
                String b = a6.mo28930b();
                C4408b.m12464a("kicked by server, chid=" + num + " res= " + C4906bg.C4908b.m15409a(g2) + " type=" + a7 + " reason=" + b);
                if ("wait".equals(a7)) {
                    C4906bg.C4908b a8 = C4906bg.mo30005a().mo30006a(num, g2);
                    if (a8 != null) {
                        this.f9523a.mo29934a(a8);
                        a8.mo30018a(C4906bg.C4912c.unbind, 3, 0, b, a7);
                        return;
                    }
                    return;
                }
                this.f9523a.mo29935a(num, g2, 3, b, a7);
                C4906bg.mo30005a().mo30006a(num, g2);
                return;
            } else {
                return;
            }
        } else if ("PING".equals(a2)) {
            byte[] a9 = flVar.mo29145a();
            if (a9 != null && a9.length > 0) {
                C4637dx.C4647j a10 = C4637dx.C4647j.m13569a(a9);
                if (a10.mo28930b()) {
                    C4929bv.mo30029a().mo30030a(a10.mo28924a());
                }
            }
            if (!"com.xiaomi.xmsf".equals(this.f9523a.getPackageName())) {
                this.f9523a.mo29927a();
            }
            if (TimerCodec.ENABLE.equals(flVar.mo29158e())) {
                C4408b.m12464a("received a server ping");
            } else {
                C4692fj.m13857b();
            }
            this.f9523a.mo29940b();
            return;
        } else if ("SYNC".equals(a2)) {
            if ("CONF".equals(flVar.mo29153b())) {
                C4929bv.mo30029a().mo30030a(C4637dx.C4639b.m13424a(flVar.mo29145a()));
                return;
            } else if (TextUtils.equals("U", flVar.mo29153b())) {
                C4637dx.C4648k a11 = C4637dx.C4648k.m13581a(flVar.mo29145a());
                C4614df.m13297a((Context) this.f9523a).mo28906a(a11.mo28924a(), a11.mo28930b(), new Date(a11.mo28924a()), new Date(a11.mo28930b()), a11.mo29019c() * 1024, a11.mo29021e());
                C4695fl flVar2 = new C4695fl();
                flVar2.mo29147a(0);
                flVar2.mo29150a(flVar.mo29145a(), "UCA");
                flVar2.mo29149a(flVar.mo29158e());
                XMPushService xMPushService = this.f9523a;
                xMPushService.mo29931a((XMPushService.C4849j) new C4927bt(xMPushService, flVar2));
                return;
            } else if (TextUtils.equals("P", flVar.mo29153b())) {
                C4637dx.C4646i a12 = C4637dx.C4646i.m13560a(flVar.mo29145a());
                C4695fl flVar3 = new C4695fl();
                flVar3.mo29147a(0);
                flVar3.mo29150a(flVar.mo29145a(), "PCA");
                flVar3.mo29149a(flVar.mo29158e());
                C4637dx.C4646i iVar = new C4637dx.C4646i();
                if (a12.mo28924a()) {
                    iVar.mo29010a(a12.mo28924a());
                }
                flVar3.mo29152a(iVar.mo28924a(), (String) null);
                XMPushService xMPushService2 = this.f9523a;
                xMPushService2.mo29931a((XMPushService.C4849j) new C4927bt(xMPushService2, flVar3));
                sb = new StringBuilder();
                sb.append("ACK msgP: id = ");
                a = flVar.mo29158e();
            } else {
                return;
            }
        } else if ("NOTIFY".equals(flVar.mo29145a())) {
            C4637dx.C4645h a13 = C4637dx.C4645h.m13548a(flVar.mo29145a());
            sb = new StringBuilder();
            sb.append("notify by server err = ");
            sb.append(a13.mo29009c());
            sb.append(" desc = ");
            a = a13.mo28924a();
        } else {
            return;
        }
        sb.append(a);
        str = sb.toString();
        C4408b.m12464a(str);
    }
}
