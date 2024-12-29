package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4556bl;
import com.xiaomi.push.C4818jl;
import com.xiaomi.push.service.C4929bv;
import com.xiaomi.push.service.XMPushService;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/* renamed from: com.xiaomi.push.fh */
public class C4689fh {

    /* renamed from: a */
    private int f8154a;

    /* renamed from: a */
    private long f8155a;

    /* renamed from: a */
    private C4556bl f8156a = C4556bl.mo28780a();

    /* renamed from: a */
    private C4688fg f8157a;

    /* renamed from: a */
    private String f8158a;

    /* renamed from: a */
    private boolean f8159a = false;

    /* renamed from: com.xiaomi.push.fh$a */
    static class C4690a {

        /* renamed from: a */
        static final C4689fh f8160a = new C4689fh();
    }

    /* renamed from: a */
    private C4681fa m13835a(C4556bl.C4557a aVar) {
        if (aVar.f7659a == 0) {
            Object obj = aVar.f7660a;
            if (obj instanceof C4681fa) {
                return (C4681fa) obj;
            }
            return null;
        }
        C4681fa a = mo29139a();
        a.mo29092a(C4679ez.CHANNEL_STATS_COUNTER.mo29089a());
        a.mo29102c(aVar.f7659a);
        a.mo29103c(aVar.f7661a);
        return a;
    }

    /* renamed from: a */
    private C4682fb mo29140a(int i) {
        ArrayList arrayList = new ArrayList();
        C4682fb fbVar = new C4682fb(this.f8158a, arrayList);
        if (!C4551bj.m13003e(this.f8157a.f8146a)) {
            fbVar.mo29123a(C4805j.m14887k(this.f8157a.f8146a));
        }
        C4821jn jnVar = new C4821jn(i);
        C4812jf a = new C4818jl.C4819a().mo29873a(jnVar);
        try {
            fbVar.mo29099b(a);
        } catch (C4804iz unused) {
        }
        LinkedList a2 = this.f8156a.mo28780a();
        while (true) {
            try {
                if (a2.size() <= 0) {
                    break;
                }
                C4681fa a3 = m13835a((C4556bl.C4557a) a2.getLast());
                if (a3 != null) {
                    a3.mo29099b(a);
                }
                if (jnVar.mo29877a_() > i) {
                    break;
                }
                if (a3 != null) {
                    arrayList.add(a3);
                }
                a2.removeLast();
            } catch (C4804iz | NoSuchElementException unused2) {
            }
        }
        return fbVar;
    }

    /* renamed from: a */
    public static C4688fg mo29139a() {
        C4688fg fgVar;
        C4689fh fhVar = C4690a.f8160a;
        synchronized (fhVar) {
            fgVar = fhVar.f8157a;
        }
        return fgVar;
    }

    /* renamed from: a */
    public static C4689fh m13838a() {
        return C4690a.f8160a;
    }

    /* renamed from: a */
    private void m13839a() {
        if (this.f8159a && System.currentTimeMillis() - this.f8155a > ((long) this.f8154a)) {
            this.f8159a = false;
            this.f8155a = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized C4681fa m13840a() {
        C4681fa faVar;
        faVar = new C4681fa();
        faVar.mo29093a(C4551bj.m12985a((Context) this.f8157a.f8146a));
        faVar.f8115a = 0;
        faVar.f8119b = 1;
        faVar.mo29107d((int) (System.currentTimeMillis() / 1000));
        return faVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized C4682fb m13841a() {
        C4682fb fbVar;
        fbVar = null;
        if (mo29143b()) {
            int i = 750;
            if (!C4551bj.m13003e(this.f8157a.f8146a)) {
                i = 375;
            }
            fbVar = mo29140a(i);
        }
        return fbVar;
    }

    /* renamed from: a */
    public void m13842a(int i) {
        if (i > 0) {
            int i2 = i * 1000;
            if (i2 > 604800000) {
                i2 = 604800000;
            }
            if (this.f8154a != i2 || !this.f8159a) {
                this.f8159a = true;
                this.f8155a = System.currentTimeMillis();
                this.f8154a = i2;
                C4408b.m12482c("enable dot duration = " + i2 + " start = " + this.f8155a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo29141a(C4681fa faVar) {
        this.f8156a.mo28781a(faVar);
    }

    /* renamed from: a */
    public synchronized void mo29142a(XMPushService xMPushService) {
        this.f8157a = new C4688fg(xMPushService);
        this.f8158a = "";
        C4929bv.mo30029a().mo30031a((C4929bv.C4930a) new C4691fi(this));
    }

    /* renamed from: a */
    public boolean m13845a() {
        return this.f8159a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo29143b() {
        mo29139a();
        return this.f8159a && this.f8156a.mo28780a() > 0;
    }
}
