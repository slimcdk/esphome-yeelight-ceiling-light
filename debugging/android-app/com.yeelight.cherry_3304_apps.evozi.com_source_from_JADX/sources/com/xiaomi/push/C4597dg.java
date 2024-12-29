package com.xiaomi.push;

/* renamed from: com.xiaomi.push.dg */
/* synthetic */ class C4597dg {

    /* renamed from: a */
    static final /* synthetic */ int[] f8378a;

    /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|26) */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
    static {
        /*
            com.xiaomi.push.hm[] r0 = com.xiaomi.push.C4739hm.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            f8378a = r0
            com.xiaomi.push.hm r1 = com.xiaomi.push.C4739hm.Registration     // Catch:{ NoSuchFieldError -> 0x0012 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
            r2 = 1
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
        L_0x0012:
            int[] r0 = f8378a     // Catch:{ NoSuchFieldError -> 0x001d }
            com.xiaomi.push.hm r1 = com.xiaomi.push.C4739hm.UnRegistration     // Catch:{ NoSuchFieldError -> 0x001d }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
            r2 = 2
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
        L_0x001d:
            int[] r0 = f8378a     // Catch:{ NoSuchFieldError -> 0x0028 }
            com.xiaomi.push.hm r1 = com.xiaomi.push.C4739hm.Subscription     // Catch:{ NoSuchFieldError -> 0x0028 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
            r2 = 3
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
        L_0x0028:
            int[] r0 = f8378a     // Catch:{ NoSuchFieldError -> 0x0033 }
            com.xiaomi.push.hm r1 = com.xiaomi.push.C4739hm.UnSubscription     // Catch:{ NoSuchFieldError -> 0x0033 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
            r2 = 4
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
        L_0x0033:
            int[] r0 = f8378a     // Catch:{ NoSuchFieldError -> 0x003e }
            com.xiaomi.push.hm r1 = com.xiaomi.push.C4739hm.SendMessage     // Catch:{ NoSuchFieldError -> 0x003e }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
            r2 = 5
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
        L_0x003e:
            int[] r0 = f8378a     // Catch:{ NoSuchFieldError -> 0x0049 }
            com.xiaomi.push.hm r1 = com.xiaomi.push.C4739hm.AckMessage     // Catch:{ NoSuchFieldError -> 0x0049 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
            r2 = 6
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
        L_0x0049:
            int[] r0 = f8378a     // Catch:{ NoSuchFieldError -> 0x0054 }
            com.xiaomi.push.hm r1 = com.xiaomi.push.C4739hm.SetConfig     // Catch:{ NoSuchFieldError -> 0x0054 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
            r2 = 7
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
        L_0x0054:
            int[] r0 = f8378a     // Catch:{ NoSuchFieldError -> 0x0060 }
            com.xiaomi.push.hm r1 = com.xiaomi.push.C4739hm.ReportFeedback     // Catch:{ NoSuchFieldError -> 0x0060 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
            r2 = 8
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
        L_0x0060:
            int[] r0 = f8378a     // Catch:{ NoSuchFieldError -> 0x006c }
            com.xiaomi.push.hm r1 = com.xiaomi.push.C4739hm.MultiConnectionBroadcast     // Catch:{ NoSuchFieldError -> 0x006c }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
            r2 = 9
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
        L_0x006c:
            int[] r0 = f8378a     // Catch:{ NoSuchFieldError -> 0x0078 }
            com.xiaomi.push.hm r1 = com.xiaomi.push.C4739hm.MultiConnectionResult     // Catch:{ NoSuchFieldError -> 0x0078 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
            r2 = 10
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
        L_0x0078:
            int[] r0 = f8378a     // Catch:{ NoSuchFieldError -> 0x0084 }
            com.xiaomi.push.hm r1 = com.xiaomi.push.C4739hm.Notification     // Catch:{ NoSuchFieldError -> 0x0084 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
            r2 = 11
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
        L_0x0084:
            int[] r0 = f8378a     // Catch:{ NoSuchFieldError -> 0x0090 }
            com.xiaomi.push.hm r1 = com.xiaomi.push.C4739hm.Command     // Catch:{ NoSuchFieldError -> 0x0090 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
            r2 = 12
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4597dg.<clinit>():void");
    }
}
