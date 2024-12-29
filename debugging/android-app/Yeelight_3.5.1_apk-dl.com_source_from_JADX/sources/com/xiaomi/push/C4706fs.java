package com.xiaomi.push;

import android.os.SystemClock;
import android.text.TextUtils;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4637dx;
import com.xiaomi.push.C4711fw;
import com.xiaomi.push.service.C4906bg;
import com.xiaomi.push.service.C4923bp;
import com.xiaomi.push.service.C4929bv;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.fs */
public class C4706fs extends C4720gd {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C4697fn f8200a;

    /* renamed from: a */
    private C4698fo f8201a;

    /* renamed from: a */
    private Thread f8202a;

    /* renamed from: a */
    private byte[] f8203a;

    public C4706fs(XMPushService xMPushService, C4713fx fxVar) {
        super(xMPushService, fxVar);
    }

    /* renamed from: a */
    private C4695fl mo29176a(boolean z) {
        C4705fr frVar = new C4705fr();
        if (z) {
            frVar.mo29149a(TimerCodec.ENABLE);
        }
        byte[] a = C4692fj.m13848a();
        if (a != null) {
            C4637dx.C4647j jVar = new C4637dx.C4647j();
            jVar.mo29011a(C4504a.m12825a(a));
            frVar.mo29152a(jVar.mo28924a(), (String) null);
        }
        return frVar;
    }

    /* renamed from: h */
    private void m13916h() {
        try {
            this.f8200a = new C4697fn(this.f8254a.getInputStream(), this, this.f8222a);
            this.f8201a = new C4698fo(this.f8254a.getOutputStream(), this);
            C4707ft ftVar = new C4707ft(this, "Blob Reader (" + this.f8227b + ")");
            this.f8202a = ftVar;
            ftVar.start();
        } catch (Exception e) {
            throw new C4724gh("Error to init reader and writer", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void mo29170a() {
        m13916h();
        this.f8201a.mo29165a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void mo29171a(int i, Exception exc) {
        C4697fn fnVar = this.f8200a;
        if (fnVar != null) {
            fnVar.mo29163b();
            this.f8200a = null;
        }
        C4698fo foVar = this.f8201a;
        if (foVar != null) {
            try {
                foVar.mo29166b();
            } catch (Exception e) {
                C4408b.m12478a((Throwable) e);
            }
            this.f8201a = null;
        }
        this.f8203a = null;
        super.mo29171a(i, exc);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo29172a(C4695fl flVar) {
        if (flVar != null) {
            if (flVar.mo29145a()) {
                C4408b.m12464a("[Slim] RCV blob chid=" + flVar.mo29145a() + "; id=" + flVar.mo29158e() + "; errCode=" + flVar.mo29153b() + "; err=" + flVar.mo29156c());
            }
            if (flVar.mo29145a() == 0) {
                if ("PING".equals(flVar.mo29145a())) {
                    C4408b.m12464a("[Slim] RCV ping id=" + flVar.mo29158e());
                    mo29208g();
                } else if ("CLOSE".equals(flVar.mo29145a())) {
                    mo29205c(13, (Exception) null);
                }
            }
            for (C4711fw.C4712a a : this.f8226a.values()) {
                a.mo29195a(flVar);
            }
        }
    }

    @Deprecated
    /* renamed from: a */
    public void mo29173a(C4731gn gnVar) {
        mo29178b(C4695fl.m13861a(gnVar, (String) null));
    }

    /* renamed from: a */
    public synchronized void mo29174a(C4906bg.C4908b bVar) {
        C4694fk.m13859a(bVar, mo29193c(), (C4711fw) this);
    }

    /* renamed from: a */
    public synchronized void mo29175a(String str, String str2) {
        C4694fk.m13860a(str, str2, (C4711fw) this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void m13923a(boolean z) {
        if (this.f8201a != null) {
            C4695fl a = mo29176a(z);
            C4408b.m12464a("[Slim] SND ping id=" + a.mo29158e());
            mo29178b(a);
            mo29207f();
            return;
        }
        throw new C4724gh("The BlobWriter is null.");
    }

    /* renamed from: a */
    public void mo29177a(C4695fl[] flVarArr) {
        for (C4695fl b : flVarArr) {
            mo29178b(b);
        }
    }

    /* renamed from: a */
    public boolean m13925a() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized byte[] m13926a() {
        if (this.f8203a == null && !TextUtils.isEmpty(this.f8223a)) {
            String a = C4929bv.mo30029a();
            StringBuilder sb = new StringBuilder();
            String str = this.f8223a;
            sb.append(str.substring(str.length() / 2));
            sb.append(a.substring(a.length() / 2));
            this.f8203a = C4923bp.m15452a(this.f8223a.getBytes(), sb.toString().getBytes());
        }
        return this.f8203a;
    }

    /* renamed from: b */
    public void mo29178b(C4695fl flVar) {
        C4698fo foVar = this.f8201a;
        if (foVar != null) {
            try {
                int a = foVar.mo29164a(flVar);
                this.f8233d = SystemClock.elapsedRealtime();
                String f = flVar.mo29159f();
                if (!TextUtils.isEmpty(f)) {
                    C4750hb.m14147a(this.f8222a, f, (long) a, false, true, System.currentTimeMillis());
                }
                for (C4711fw.C4712a a2 : this.f8230b.values()) {
                    a2.mo29195a(flVar);
                }
            } catch (Exception e) {
                throw new C4724gh((Throwable) e);
            }
        } else {
            throw new C4724gh("the writer is null.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo29179b(C4731gn gnVar) {
        if (gnVar != null) {
            for (C4711fw.C4712a a : this.f8226a.values()) {
                a.mo29196a(gnVar);
            }
        }
    }
}
