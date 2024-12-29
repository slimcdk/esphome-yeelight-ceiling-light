package com.xiaomi.push;

import android.text.TextUtils;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4632ek;
import com.xiaomi.push.C4680fs;
import com.xiaomi.push.service.C4860ap;
import com.xiaomi.push.service.C4877ay;
import com.xiaomi.push.service.C4884be;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.fq */
public class C4678fq extends C4688fz {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C4674fm f8744a;

    /* renamed from: a */
    private C4675fn f8745a;

    /* renamed from: a */
    private Thread f8746a;

    /* renamed from: a */
    private byte[] f8747a;

    public C4678fq(XMPushService xMPushService, C4682ft ftVar) {
        super(xMPushService, ftVar);
    }

    /* renamed from: a */
    private C4673fl mo25140a(boolean z) {
        C4677fp fpVar = new C4677fp();
        if (z) {
            fpVar.mo25116a(TimerCodec.ENABLE);
        }
        byte[] a = C4731hg.m14522a();
        if (a != null) {
            C4632ek.C4642j jVar = new C4632ek.C4642j();
            jVar.mo25023a(C4489a.m13247a(a));
            fpVar.mo25119a(jVar.mo24930a(), (String) null);
        }
        return fpVar;
    }

    /* renamed from: h */
    private void m14263h() {
        try {
            this.f8744a = new C4674fm(this.f8786a.getInputStream(), this);
            this.f8745a = new C4675fn(this.f8786a.getOutputStream(), this);
            C4679fr frVar = new C4679fr(this, "Blob Reader (" + this.f8760b + ")");
            this.f8746a = frVar;
            frVar.start();
        } catch (Exception e) {
            throw new C4694gd("Error to init reader and writer", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void mo25134a() {
        m14263h();
        this.f8745a.mo25131a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void mo25135a(int i, Exception exc) {
        if (this.f8744a != null) {
            this.f8744a.mo25129b();
            this.f8744a = null;
        }
        if (this.f8745a != null) {
            try {
                this.f8745a.mo25132b();
            } catch (Exception e) {
                C3989b.m10678a((Throwable) e);
            }
            this.f8745a = null;
        }
        this.f8747a = null;
        super.mo25135a(i, exc);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo25136a(C4673fl flVar) {
        if (flVar != null) {
            if (flVar.mo25112a()) {
                C3989b.m10669a("[Slim] RCV blob chid=" + flVar.mo25112a() + "; id=" + flVar.mo25124e() + "; errCode=" + flVar.mo25120b() + "; err=" + flVar.mo25122c());
            }
            if (flVar.mo25112a() == 0) {
                if ("PING".equals(flVar.mo25112a())) {
                    C3989b.m10669a("[Slim] RCV ping id=" + flVar.mo25124e());
                    mo25170g();
                } else if ("CLOSE".equals(flVar.mo25112a())) {
                    mo25168c(13, (Exception) null);
                }
            }
            for (C4680fs.C4681a a : this.f8759a.values()) {
                a.mo25158a(flVar);
            }
        }
    }

    @Deprecated
    /* renamed from: a */
    public void mo25137a(C4701gj gjVar) {
        mo25142b(C4673fl.m14224a(gjVar, (String) null));
    }

    /* renamed from: a */
    public synchronized void mo25138a(C4860ap.C4862b bVar) {
        C4672fk.m14222a(bVar, mo25155c(), (C4680fs) this);
    }

    /* renamed from: a */
    public synchronized void mo25139a(String str, String str2) {
        C4672fk.m14223a(str, str2, (C4680fs) this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void m14270a(boolean z) {
        if (this.f8745a != null) {
            C4673fl a = mo25140a(z);
            C3989b.m10669a("[Slim] SND ping id=" + a.mo25124e());
            mo25142b(a);
            mo25169f();
            return;
        }
        throw new C4694gd("The BlobWriter is null.");
    }

    /* renamed from: a */
    public void mo25141a(C4673fl[] flVarArr) {
        for (C4673fl b : flVarArr) {
            mo25142b(b);
        }
    }

    /* renamed from: a */
    public boolean m14272a() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized byte[] m14273a() {
        if (this.f8747a == null && !TextUtils.isEmpty(this.f8756a)) {
            String a = C4884be.mo25947a();
            this.f8747a = C4877ay.m15654a(this.f8756a.getBytes(), (this.f8756a.substring(this.f8756a.length() / 2) + a.substring(a.length() / 2)).getBytes());
        }
        return this.f8747a;
    }

    /* renamed from: b */
    public void mo25142b(C4673fl flVar) {
        C4675fn fnVar = this.f8745a;
        if (fnVar != null) {
            try {
                int a = fnVar.mo25130a(flVar);
                this.f8766d = System.currentTimeMillis();
                String f = flVar.mo25125f();
                if (!TextUtils.isEmpty(f)) {
                    C4718gx.m14478a(this.f8755a, f, (long) a, false, true, System.currentTimeMillis());
                }
                for (C4680fs.C4681a a2 : this.f8763b.values()) {
                    a2.mo25158a(flVar);
                }
            } catch (Exception e) {
                throw new C4694gd((Throwable) e);
            }
        } else {
            throw new C4694gd("the writer is null.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo25143b(C4701gj gjVar) {
        if (gjVar != null) {
            for (C4680fs.C4681a a : this.f8759a.values()) {
                a.mo25159a(gjVar);
            }
        }
    }
}
