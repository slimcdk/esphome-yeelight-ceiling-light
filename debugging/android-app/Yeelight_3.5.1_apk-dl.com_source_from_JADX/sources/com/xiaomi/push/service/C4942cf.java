package com.xiaomi.push.service;

/* renamed from: com.xiaomi.push.service.cf */
/* synthetic */ class C4942cf {

    /* renamed from: a */
    static final /* synthetic */ int[] f9658a;

    /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
    static {
        /*
            com.xiaomi.push.hj[] r0 = com.xiaomi.push.C4760hj.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            f9658a = r0
            com.xiaomi.push.hj r1 = com.xiaomi.push.C4760hj.Registration     // Catch:{ NoSuchFieldError -> 0x0012 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
            r2 = 1
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
        L_0x0012:
            int[] r0 = f9658a     // Catch:{ NoSuchFieldError -> 0x001d }
            com.xiaomi.push.hj r1 = com.xiaomi.push.C4760hj.UnRegistration     // Catch:{ NoSuchFieldError -> 0x001d }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
            r2 = 2
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
        L_0x001d:
            int[] r0 = f9658a     // Catch:{ NoSuchFieldError -> 0x0028 }
            com.xiaomi.push.hj r1 = com.xiaomi.push.C4760hj.Subscription     // Catch:{ NoSuchFieldError -> 0x0028 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
            r2 = 3
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
        L_0x0028:
            int[] r0 = f9658a     // Catch:{ NoSuchFieldError -> 0x0033 }
            com.xiaomi.push.hj r1 = com.xiaomi.push.C4760hj.UnSubscription     // Catch:{ NoSuchFieldError -> 0x0033 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
            r2 = 4
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
        L_0x0033:
            int[] r0 = f9658a     // Catch:{ NoSuchFieldError -> 0x003e }
            com.xiaomi.push.hj r1 = com.xiaomi.push.C4760hj.SendMessage     // Catch:{ NoSuchFieldError -> 0x003e }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
            r2 = 5
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
        L_0x003e:
            int[] r0 = f9658a     // Catch:{ NoSuchFieldError -> 0x0049 }
            com.xiaomi.push.hj r1 = com.xiaomi.push.C4760hj.AckMessage     // Catch:{ NoSuchFieldError -> 0x0049 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
            r2 = 6
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
        L_0x0049:
            int[] r0 = f9658a     // Catch:{ NoSuchFieldError -> 0x0054 }
            com.xiaomi.push.hj r1 = com.xiaomi.push.C4760hj.SetConfig     // Catch:{ NoSuchFieldError -> 0x0054 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
            r2 = 7
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
        L_0x0054:
            int[] r0 = f9658a     // Catch:{ NoSuchFieldError -> 0x0060 }
            com.xiaomi.push.hj r1 = com.xiaomi.push.C4760hj.ReportFeedback     // Catch:{ NoSuchFieldError -> 0x0060 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
            r2 = 8
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
        L_0x0060:
            int[] r0 = f9658a     // Catch:{ NoSuchFieldError -> 0x006c }
            com.xiaomi.push.hj r1 = com.xiaomi.push.C4760hj.Notification     // Catch:{ NoSuchFieldError -> 0x006c }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
            r2 = 9
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
        L_0x006c:
            int[] r0 = f9658a     // Catch:{ NoSuchFieldError -> 0x0078 }
            com.xiaomi.push.hj r1 = com.xiaomi.push.C4760hj.Command     // Catch:{ NoSuchFieldError -> 0x0078 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
            r2 = 10
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
        L_0x0078:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.C4942cf.<clinit>():void");
    }
}
