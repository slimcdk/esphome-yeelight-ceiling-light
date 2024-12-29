package com.xiaomi.push;

/* renamed from: com.xiaomi.push.fr */
class C4679fr extends Thread {

    /* renamed from: a */
    final /* synthetic */ C4678fq f8748a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4679fr(C4678fq fqVar, String str) {
        super(str);
        this.f8748a = fqVar;
    }

    public void run() {
        try {
            this.f8748a.f8744a.mo25128a();
        } catch (Exception e) {
            this.f8748a.mo25168c(9, e);
        }
    }
}
