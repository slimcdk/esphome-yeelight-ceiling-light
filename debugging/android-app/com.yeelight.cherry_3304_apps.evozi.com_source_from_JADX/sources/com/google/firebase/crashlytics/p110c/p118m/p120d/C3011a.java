package com.google.firebase.crashlytics.p110c.p118m.p120d;

import com.google.firebase.crashlytics.p110c.p118m.p119c.C3006a;

/* renamed from: com.google.firebase.crashlytics.c.m.d.a */
public class C3011a implements C3013b {

    /* renamed from: a */
    private final C3014c f5857a;

    /* renamed from: b */
    private final C3015d f5858b;

    /* renamed from: com.google.firebase.crashlytics.c.m.d.a$a */
    static /* synthetic */ class C3012a {

        /* renamed from: a */
        static final /* synthetic */ int[] f5859a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.google.firebase.crashlytics.c.m.c.c$a[] r0 = com.google.firebase.crashlytics.p110c.p118m.p119c.C3008c.C3009a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5859a = r0
                com.google.firebase.crashlytics.c.m.c.c$a r1 = com.google.firebase.crashlytics.p110c.p118m.p119c.C3008c.C3009a.JAVA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5859a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.crashlytics.c.m.c.c$a r1 = com.google.firebase.crashlytics.p110c.p118m.p119c.C3008c.C3009a.NATIVE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.p110c.p118m.p120d.C3011a.C3012a.<clinit>():void");
        }
    }

    public C3011a(C3014c cVar, C3015d dVar) {
        this.f5857a = cVar;
        this.f5858b = dVar;
    }

    /* renamed from: b */
    public boolean mo17407b(C3006a aVar, boolean z) {
        int i = C3012a.f5859a[aVar.f5849c.getType().ordinal()];
        if (i == 1) {
            this.f5857a.mo17407b(aVar, z);
            return true;
        } else if (i != 2) {
            return false;
        } else {
            this.f5858b.mo17407b(aVar, z);
            return true;
        }
    }
}
