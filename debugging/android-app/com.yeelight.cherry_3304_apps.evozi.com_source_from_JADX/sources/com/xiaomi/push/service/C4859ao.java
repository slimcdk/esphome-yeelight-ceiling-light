package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4582cv;
import com.xiaomi.push.C4586cz;
import com.xiaomi.push.C4599di;
import com.xiaomi.push.C4632ek;
import com.xiaomi.push.C4669fh;
import com.xiaomi.push.C4673fl;
import com.xiaomi.push.C4682ft;
import com.xiaomi.push.C4697gg;
import com.xiaomi.push.C4698gh;
import com.xiaomi.push.C4700gi;
import com.xiaomi.push.C4701gj;
import com.xiaomi.push.C4718gx;
import com.xiaomi.push.C4731hg;
import com.xiaomi.push.service.C4860ap;
import com.xiaomi.push.service.XMPushService;
import java.util.Date;

/* renamed from: com.xiaomi.push.service.ao */
public class C4859ao {

    /* renamed from: a */
    private XMPushService f9975a;

    C4859ao(XMPushService xMPushService) {
        this.f9975a = xMPushService;
    }

    /* renamed from: a */
    private void m15587a(C4697gg ggVar) {
        String c = ggVar.mo25183c();
        if (!TextUtils.isEmpty(c)) {
            String[] split = c.split(";");
            C4582cv a = C4586cz.mo24892a().mo24890a(C4682ft.mo25160a(), false);
            if (a != null && split.length > 0) {
                a.mo24873a(split);
                this.f9975a.mo25869a(20, (Exception) null);
                this.f9975a.mo25877a(true);
            }
        }
    }

    /* renamed from: b */
    private void m15588b(C4701gj gjVar) {
        C4860ap.C4862b a;
        String l = gjVar.mo25217l();
        String k = gjVar.mo25215k();
        if (!TextUtils.isEmpty(l) && !TextUtils.isEmpty(k) && (a = C4860ap.mo25920a().mo25921a(k, l)) != null) {
            C4718gx.m14478a(this.f9975a, a.f9988a, (long) C4718gx.m14470a(gjVar.mo25186a()), true, true, System.currentTimeMillis());
        }
    }

    /* renamed from: c */
    private void m15589c(C4673fl flVar) {
        C4860ap.C4862b a;
        String g = flVar.mo25126g();
        String num = Integer.toString(flVar.mo25112a());
        if (!TextUtils.isEmpty(g) && !TextUtils.isEmpty(num) && (a = C4860ap.mo25920a().mo25921a(num, g)) != null) {
            C4718gx.m14478a(this.f9975a, a.f9988a, (long) flVar.mo25122c(), true, true, System.currentTimeMillis());
        }
    }

    /* renamed from: a */
    public void mo25917a(C4673fl flVar) {
        if (5 != flVar.mo25112a()) {
            m15589c(flVar);
        }
        try {
            mo25919b(flVar);
        } catch (Exception e) {
            C3989b.m10677a("handle Blob chid = " + flVar.mo25112a() + " cmd = " + flVar.mo25112a() + " packetid = " + flVar.mo25124e() + " failure ", (Throwable) e);
        }
    }

    /* renamed from: a */
    public void mo25918a(C4701gj gjVar) {
        if (!"5".equals(gjVar.mo25215k())) {
            m15588b(gjVar);
        }
        String k = gjVar.mo25215k();
        if (TextUtils.isEmpty(k)) {
            k = TimerCodec.ENABLE;
            gjVar.mo25218l(k);
        }
        if (k.equals(TimerCodec.DISENABLE)) {
            C3989b.m10669a("Received wrong packet with chid = 0 : " + gjVar.mo25186a());
        }
        if (gjVar instanceof C4698gh) {
            C4697gg a = gjVar.mo25191a("kick");
            if (a != null) {
                String l = gjVar.mo25217l();
                String a2 = a.mo25181a("type");
                String a3 = a.mo25181a("reason");
                C3989b.m10669a("kicked by server, chid=" + k + " res=" + C4860ap.C4862b.m15611a(l) + " type=" + a2 + " reason=" + a3);
                if ("wait".equals(a2)) {
                    C4860ap.C4862b a4 = C4860ap.mo25920a().mo25921a(k, l);
                    if (a4 != null) {
                        this.f9975a.mo25874a(a4);
                        a4.mo25933a(C4860ap.C4866c.unbind, 3, 0, a3, a2);
                        return;
                    }
                    return;
                }
                this.f9975a.mo25875a(k, l, 3, a3, a2);
                C4860ap.mo25920a().mo25921a(k, l);
                return;
            }
        } else if (gjVar instanceof C4700gi) {
            C4700gi giVar = (C4700gi) gjVar;
            if ("redir".equals(giVar.mo25189b())) {
                C4697gg a5 = giVar.mo25191a("hosts");
                if (a5 != null) {
                    m15587a(a5);
                    return;
                }
                return;
            }
        }
        this.f9975a.mo25880b().mo25970a(this.f9975a, k, gjVar);
    }

    /* renamed from: b */
    public void mo25919b(C4673fl flVar) {
        StringBuilder sb;
        String a;
        String str;
        int i;
        int i2;
        C4860ap.C4866c cVar;
        String a2 = flVar.mo25112a();
        if (flVar.mo25112a() != 0) {
            String num = Integer.toString(flVar.mo25112a());
            if ("SECMSG".equals(flVar.mo25112a())) {
                if (!flVar.mo25112a()) {
                    this.f9975a.mo25880b().mo25969a(this.f9975a, num, flVar);
                    return;
                }
                sb = new StringBuilder();
                sb.append("Recv SECMSG errCode = ");
                sb.append(flVar.mo25120b());
                sb.append(" errStr = ");
                a = flVar.mo25122c();
            } else if ("BIND".equals(a2)) {
                C4632ek.C4636d a3 = C4632ek.C4636d.m13933a(flVar.mo25112a());
                String g = flVar.mo25126g();
                C4860ap.C4862b a4 = C4860ap.mo25920a().mo25921a(num, g);
                if (a4 != null) {
                    if (a3.mo24930a()) {
                        C3989b.m10669a("SMACK: channel bind succeeded, chid=" + flVar.mo25112a());
                        a4.mo25933a(C4860ap.C4866c.binded, 1, 0, (String) null, (String) null);
                        return;
                    }
                    String a5 = a3.mo24930a();
                    if ("auth".equals(a5)) {
                        if ("invalid-sig".equals(a3.mo24936b())) {
                            C3989b.m10669a("SMACK: bind error invalid-sig token = " + a4.f9994c + " sec = " + a4.f9999h);
                            C4731hg.m14525a(0, C4669fh.BIND_INVALID_SIG.mo25070a(), 1, (String) null, 0);
                        }
                        cVar = C4860ap.C4866c.unbind;
                        i2 = 1;
                        i = 5;
                    } else if ("cancel".equals(a5)) {
                        cVar = C4860ap.C4866c.unbind;
                        i2 = 1;
                        i = 7;
                    } else {
                        if ("wait".equals(a5)) {
                            this.f9975a.mo25874a(a4);
                            a4.mo25933a(C4860ap.C4866c.unbind, 1, 7, a3.mo24936b(), a5);
                        }
                        str = "SMACK: channel bind failed, chid=" + num + " reason=" + a3.mo24936b();
                        C3989b.m10669a(str);
                    }
                    a4.mo25933a(cVar, i2, i, a3.mo24936b(), a5);
                    C4860ap.mo25920a().mo25921a(num, g);
                    str = "SMACK: channel bind failed, chid=" + num + " reason=" + a3.mo24936b();
                    C3989b.m10669a(str);
                }
                return;
            } else if ("KICK".equals(a2)) {
                C4632ek.C4639g a6 = C4632ek.C4639g.m14001a(flVar.mo25112a());
                String g2 = flVar.mo25126g();
                String a7 = a6.mo24930a();
                String b = a6.mo24936b();
                C3989b.m10669a("kicked by server, chid=" + num + " res= " + C4860ap.C4862b.m15611a(g2) + " type=" + a7 + " reason=" + b);
                if ("wait".equals(a7)) {
                    C4860ap.C4862b a8 = C4860ap.mo25920a().mo25921a(num, g2);
                    if (a8 != null) {
                        this.f9975a.mo25874a(a8);
                        a8.mo25933a(C4860ap.C4866c.unbind, 3, 0, b, a7);
                        return;
                    }
                    return;
                }
                this.f9975a.mo25875a(num, g2, 3, b, a7);
                C4860ap.mo25920a().mo25921a(num, g2);
                return;
            } else {
                return;
            }
        } else if ("PING".equals(a2)) {
            byte[] a9 = flVar.mo25112a();
            if (a9 != null && a9.length > 0) {
                C4632ek.C4642j a10 = C4632ek.C4642j.m14037a(a9);
                if (a10.mo24936b()) {
                    C4884be.mo25947a().mo25948a(a10.mo24930a());
                }
            }
            if (!"com.xiaomi.xmsf".equals(this.f9975a.getPackageName())) {
                this.f9975a.mo25867a();
            }
            if (TimerCodec.ENABLE.equals(flVar.mo25124e())) {
                C3989b.m10669a("received a server ping");
            } else {
                C4731hg.m14531b();
            }
            this.f9975a.mo25880b();
            return;
        } else if ("SYNC".equals(a2)) {
            if ("CONF".equals(flVar.mo25120b())) {
                C4884be.mo25947a().mo25948a(C4632ek.C4634b.m13892a(flVar.mo25112a()));
                return;
            } else if (TextUtils.equals("U", flVar.mo25120b())) {
                C4632ek.C4643k a11 = C4632ek.C4643k.m14049a(flVar.mo25112a());
                C4599di.m13721a((Context) this.f9975a).mo24916a(a11.mo24930a(), a11.mo24936b(), new Date(a11.mo24930a()), new Date(a11.mo24936b()), a11.mo25031c() * 1024, a11.mo25033e());
                C4673fl flVar2 = new C4673fl();
                flVar2.mo25114a(0);
                flVar2.mo25117a(flVar.mo25112a(), "UCA");
                flVar2.mo25116a(flVar.mo25124e());
                XMPushService xMPushService = this.f9975a;
                xMPushService.mo25871a((XMPushService.C4827i) new C4880ba(xMPushService, flVar2));
                return;
            } else if (TextUtils.equals("P", flVar.mo25120b())) {
                C4632ek.C4641i a12 = C4632ek.C4641i.m14028a(flVar.mo25112a());
                C4673fl flVar3 = new C4673fl();
                flVar3.mo25114a(0);
                flVar3.mo25117a(flVar.mo25112a(), "PCA");
                flVar3.mo25116a(flVar.mo25124e());
                C4632ek.C4641i iVar = new C4632ek.C4641i();
                if (a12.mo24930a()) {
                    iVar.mo25022a(a12.mo24930a());
                }
                flVar3.mo25119a(iVar.mo24930a(), (String) null);
                XMPushService xMPushService2 = this.f9975a;
                xMPushService2.mo25871a((XMPushService.C4827i) new C4880ba(xMPushService2, flVar3));
                sb = new StringBuilder();
                sb.append("ACK msgP: id = ");
                a = flVar.mo25124e();
            } else {
                return;
            }
        } else if ("NOTIFY".equals(flVar.mo25112a())) {
            C4632ek.C4640h a13 = C4632ek.C4640h.m14016a(flVar.mo25112a());
            sb = new StringBuilder();
            sb.append("notify by server err = ");
            sb.append(a13.mo25021c());
            sb.append(" desc = ");
            a = a13.mo24930a();
        } else {
            return;
        }
        sb.append(a);
        str = sb.toString();
        C3989b.m10669a(str);
    }
}
