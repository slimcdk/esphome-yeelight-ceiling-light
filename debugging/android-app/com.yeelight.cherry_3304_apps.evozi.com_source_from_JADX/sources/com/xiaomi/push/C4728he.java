package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4527bb;
import com.xiaomi.push.C4800jo;
import com.xiaomi.push.service.C4884be;
import com.xiaomi.push.service.XMPushService;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/* renamed from: com.xiaomi.push.he */
public class C4728he {

    /* renamed from: a */
    private int f8950a;

    /* renamed from: a */
    private long f8951a;

    /* renamed from: a */
    private C4527bb f8952a = C4527bb.mo24766a();

    /* renamed from: a */
    private C4727hd f8953a;

    /* renamed from: a */
    private String f8954a;

    /* renamed from: a */
    private boolean f8955a = false;

    /* renamed from: com.xiaomi.push.he$a */
    static class C4729a {

        /* renamed from: a */
        static final C4728he f8956a = new C4728he();
    }

    /* renamed from: a */
    private C4670fi m14509a(C4527bb.C4528a aVar) {
        if (aVar.f8218a == 0) {
            Object obj = aVar.f8219a;
            if (obj instanceof C4670fi) {
                return (C4670fi) obj;
            }
            return null;
        }
        C4670fi a = mo25240a();
        a.mo25073a(C4669fh.CHANNEL_STATS_COUNTER.mo25070a());
        a.mo25083c(aVar.f8218a);
        a.mo25084c(aVar.f8220a);
        return a;
    }

    /* renamed from: a */
    private C4671fj mo25241a(int i) {
        ArrayList arrayList = new ArrayList();
        C4671fj fjVar = new C4671fj(this.f8954a, arrayList);
        if (!C4521az.m13368d(this.f8953a.f8942a)) {
            fjVar.mo25104a(C4753i.m14767m(this.f8953a.f8942a));
        }
        C4803jq jqVar = new C4803jq(i);
        C4794ji a = new C4800jo.C4801a().mo25839a(jqVar);
        try {
            fjVar.mo25080b(a);
        } catch (C4787jc unused) {
        }
        LinkedList a2 = this.f8952a.mo24766a();
        while (true) {
            try {
                if (a2.size() <= 0) {
                    break;
                }
                C4670fi a3 = m14509a((C4527bb.C4528a) a2.getLast());
                if (a3 != null) {
                    a3.mo25080b(a);
                }
                if (jqVar.mo25843a_() > i) {
                    break;
                }
                if (a3 != null) {
                    arrayList.add(a3);
                }
                a2.removeLast();
            } catch (C4787jc | NoSuchElementException unused2) {
            }
        }
        return fjVar;
    }

    /* renamed from: a */
    public static C4727hd mo25240a() {
        C4727hd hdVar;
        synchronized (C4729a.f8956a) {
            hdVar = C4729a.f8956a.f8953a;
        }
        return hdVar;
    }

    /* renamed from: a */
    public static C4728he m14512a() {
        return C4729a.f8956a;
    }

    /* renamed from: a */
    private void m14513a() {
        if (this.f8955a && System.currentTimeMillis() - this.f8951a > ((long) this.f8950a)) {
            this.f8955a = false;
            this.f8951a = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized C4670fi m14514a() {
        C4670fi fiVar;
        fiVar = new C4670fi();
        fiVar.mo25074a(C4521az.m13351a((Context) this.f8953a.f8942a));
        fiVar.f8702a = 0;
        fiVar.f8706b = 1;
        fiVar.mo25088d((int) (System.currentTimeMillis() / 1000));
        return fiVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized C4671fj m14515a() {
        C4671fj fjVar;
        fjVar = null;
        if (mo25244b()) {
            int i = 750;
            if (!C4521az.m13368d(this.f8953a.f8942a)) {
                i = 375;
            }
            fjVar = mo25241a(i);
        }
        return fjVar;
    }

    /* renamed from: a */
    public void m14516a(int i) {
        if (i > 0) {
            int i2 = i * 1000;
            if (i2 > 604800000) {
                i2 = 604800000;
            }
            if (this.f8950a != i2 || !this.f8955a) {
                this.f8955a = true;
                this.f8951a = System.currentTimeMillis();
                this.f8950a = i2;
                C3989b.m10680c("enable dot duration = " + i2 + " start = " + this.f8951a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo25242a(C4670fi fiVar) {
        this.f8952a.mo24767a(fiVar);
    }

    /* renamed from: a */
    public synchronized void mo25243a(XMPushService xMPushService) {
        this.f8953a = new C4727hd(xMPushService);
        this.f8954a = "";
        C4884be.mo25947a().mo25949a((C4884be.C4885a) new C4730hf(this));
    }

    /* renamed from: a */
    public boolean m14519a() {
        return this.f8955a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo25244b() {
        mo25240a();
        return this.f8955a && this.f8952a.mo24766a() > 0;
    }
}
