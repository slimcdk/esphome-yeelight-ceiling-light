package com.xiaomi.push;

/* renamed from: com.xiaomi.push.ft */
class C4707ft extends Thread {

    /* renamed from: a */
    final /* synthetic */ C4706fs f8204a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4707ft(C4706fs fsVar, String str) {
        super(str);
        this.f8204a = fsVar;
    }

    public void run() {
        try {
            this.f8204a.f8200a.mo29162a();
        } catch (Exception e) {
            this.f8204a.mo29205c(9, e);
        }
    }
}
