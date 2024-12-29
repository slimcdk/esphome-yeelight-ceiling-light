package com.xiaomi.push;

import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.C4637dx;
import com.xiaomi.push.C4711fw;
import com.xiaomi.push.service.C4902bd;
import com.xiaomi.push.service.C4906bg;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/* renamed from: com.xiaomi.push.fu */
public class C4708fu implements C4725gi {

    /* renamed from: a */
    public static boolean f8205a = false;

    /* renamed from: a */
    private C4709a f8206a = null;

    /* renamed from: a */
    private C4711fw f8207a = null;

    /* renamed from: a */
    private C4715fz f8208a = null;

    /* renamed from: a */
    private final String f8209a = "[Slim] ";

    /* renamed from: a */
    private SimpleDateFormat f8210a = new SimpleDateFormat("hh:mm:ss aaa");

    /* renamed from: b */
    private C4709a f8211b = null;

    /* renamed from: com.xiaomi.push.fu$a */
    class C4709a implements C4718gb, C4726gj {

        /* renamed from: a */
        String f8213a;

        /* renamed from: a */
        private boolean f8214a = true;

        C4709a(boolean z) {
            this.f8214a = z;
            this.f8213a = z ? " RCV " : " Sent ";
        }

        /* renamed from: a */
        public void mo29181a(C4695fl flVar) {
            String str;
            StringBuilder sb;
            if (C4708fu.f8205a) {
                sb = new StringBuilder();
                sb.append("[Slim] ");
                sb.append(C4708fu.m13929a(C4708fu.this).format(new Date()));
                sb.append(this.f8213a);
                str = flVar.toString();
            } else {
                sb = new StringBuilder();
                sb.append("[Slim] ");
                sb.append(C4708fu.m13929a(C4708fu.this).format(new Date()));
                sb.append(this.f8213a);
                sb.append(" Blob [");
                sb.append(flVar.mo29145a());
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb.append(flVar.mo29145a());
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb.append(C4902bd.m15381a(flVar.mo29158e()));
                str = "]";
            }
            sb.append(str);
            C4408b.m12482c(sb.toString());
            if (flVar != null && flVar.mo29145a() == 99999) {
                String a = flVar.mo29145a();
                C4695fl flVar2 = null;
                if (!this.f8214a) {
                    if ("BIND".equals(a)) {
                        C4408b.m12464a("build binded result for loopback.");
                        C4637dx.C4641d dVar = new C4637dx.C4641d();
                        dVar.mo28975a(true);
                        dVar.mo28977c("login success.");
                        dVar.mo28976b("success");
                        dVar.mo28974a("success");
                        C4695fl flVar3 = new C4695fl();
                        flVar3.mo29152a(dVar.mo28924a(), (String) null);
                        flVar3.mo29151a(2);
                        flVar3.mo29147a(99999);
                        flVar3.mo29150a("BIND", (String) null);
                        flVar3.mo29149a(flVar.mo29158e());
                        flVar3.mo29155b((String) null);
                        flVar3.mo29157c(flVar.mo29160g());
                        flVar2 = flVar3;
                    } else if (!"UBND".equals(a) && "SECMSG".equals(a)) {
                        C4695fl flVar4 = new C4695fl();
                        flVar4.mo29147a(99999);
                        flVar4.mo29150a("SECMSG", (String) null);
                        flVar4.mo29157c(flVar.mo29160g());
                        flVar4.mo29149a(flVar.mo29158e());
                        flVar4.mo29151a(flVar.mo29145a());
                        flVar4.mo29155b(flVar.mo29159f());
                        flVar4.mo29152a(flVar.mo29149a(C4906bg.mo30005a().mo30006a(String.valueOf(99999), flVar.mo29160g()).f9548h), (String) null);
                        flVar2 = flVar4;
                    }
                }
                if (flVar2 != null) {
                    for (Map.Entry entry : C4708fu.m13929a(C4708fu.this).mo29170a().entrySet()) {
                        if (C4708fu.m13929a(C4708fu.this) != entry.getKey()) {
                            ((C4711fw.C4712a) entry.getValue()).mo29195a(flVar2);
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo29182a(C4731gn gnVar) {
            String str;
            StringBuilder sb;
            if (C4708fu.f8205a) {
                sb = new StringBuilder();
                sb.append("[Slim] ");
                sb.append(C4708fu.m13929a(C4708fu.this).format(new Date()));
                sb.append(this.f8213a);
                sb.append(" PKT ");
                str = gnVar.mo29223a();
            } else {
                sb = new StringBuilder();
                sb.append("[Slim] ");
                sb.append(C4708fu.m13929a(C4708fu.this).format(new Date()));
                sb.append(this.f8213a);
                sb.append(" PKT [");
                sb.append(gnVar.mo29252k());
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb.append(gnVar.mo29251j());
                str = "]";
            }
            sb.append(str);
            C4408b.m12482c(sb.toString());
        }

        /* renamed from: a */
        public boolean m13935a(C4731gn gnVar) {
            return true;
        }
    }

    public C4708fu(C4711fw fwVar) {
        this.f8207a = fwVar;
        m13932a();
    }

    /* renamed from: a */
    private void m13932a() {
        this.f8206a = new C4709a(true);
        this.f8211b = new C4709a(false);
        C4711fw fwVar = this.f8207a;
        C4709a aVar = this.f8206a;
        fwVar.mo29185a((C4718gb) aVar, (C4726gj) aVar);
        C4711fw fwVar2 = this.f8207a;
        C4709a aVar2 = this.f8211b;
        fwVar2.mo29191b((C4718gb) aVar2, (C4726gj) aVar2);
        this.f8208a = new C4710fv(this);
    }
}
