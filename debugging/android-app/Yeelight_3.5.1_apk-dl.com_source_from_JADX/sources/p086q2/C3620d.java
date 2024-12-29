package p086q2;

/* renamed from: q2.d */
class C3620d extends Thread {

    /* renamed from: b */
    private static final String[] f6027b;

    /* renamed from: a */
    final C3617a f6028a;

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0081 A[LOOP:1: B:21:0x0060->B:33:0x0081, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0083 A[EDGE_INSN: B:39:0x0083->B:34:0x0083 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0022  */
    static {
        /*
            r0 = 6
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 4
            r2 = 0
            java.lang.String r3 = "\u001bG\u0012Q{'c*"
            r4 = 3
            r5 = 2
            r6 = 1
            java.lang.String r7 = "\u001as=gq>s:\"j-g+gk<:~qh)a0kv/6=mv&s=vq'xp"
            r8 = -1
            r9 = 0
        L_0x000e:
            char[] r7 = r7.toCharArray()
            int r10 = r7.length
            r11 = r10
            r12 = 0
            if (r10 > r6) goto L_0x001c
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r0
            goto L_0x005f
        L_0x001c:
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r0
        L_0x0020:
            if (r11 > r12) goto L_0x005f
            java.lang.String r11 = new java.lang.String
            r11.<init>(r8)
            java.lang.String r8 = r11.intern()
            if (r9 == 0) goto L_0x0053
            if (r9 == r6) goto L_0x004c
            if (r9 == r5) goto L_0x0046
            if (r9 == r4) goto L_0x0040
            if (r9 == r1) goto L_0x003b
            r0[r10] = r8
            r0 = r7
            r8 = 0
            r9 = 1
            goto L_0x0051
        L_0x003b:
            r0[r10] = r8
            f6027b = r7
            return
        L_0x0040:
            r0[r10] = r8
            r9 = 5
            r0 = r7
            r8 = 4
            goto L_0x0051
        L_0x0046:
            r0[r10] = r8
            r0 = r7
            r8 = 3
            r9 = 4
            goto L_0x0051
        L_0x004c:
            r0[r10] = r8
            r0 = r7
            r8 = 2
            r9 = 3
        L_0x0051:
            r7 = r3
            goto L_0x000e
        L_0x0053:
            r0[r10] = r8
            java.lang.String r0 = "\u000ew7n},6*m8)u=gh<6=mv&s=vq'x"
            r8 = 1
            r9 = 2
            r16 = r7
            r7 = r0
            r0 = r16
            goto L_0x000e
        L_0x005f:
            r13 = r12
        L_0x0060:
            char r14 = r8[r12]
            int r15 = r13 % 5
            if (r15 == 0) goto L_0x0077
            if (r15 == r6) goto L_0x0074
            if (r15 == r5) goto L_0x0071
            if (r15 == r4) goto L_0x006f
            r15 = 24
            goto L_0x0079
        L_0x006f:
            r15 = 2
            goto L_0x0079
        L_0x0071:
            r15 = 94
            goto L_0x0079
        L_0x0074:
            r15 = 22
            goto L_0x0079
        L_0x0077:
            r15 = 72
        L_0x0079:
            r14 = r14 ^ r15
            char r14 = (char) r14
            r8[r12] = r14
            int r13 = r13 + 1
            if (r11 != 0) goto L_0x0083
            r12 = r11
            goto L_0x0060
        L_0x0083:
            r12 = r13
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: p086q2.C3620d.<clinit>():void");
    }

    private C3620d(C3617a aVar) {
        this.f6028a = aVar;
    }

    C3620d(C3617a aVar, C3618b bVar) {
        this(aVar);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:32|33|(3:36|37|38)|39|40|(1:68)(2:43|44)) */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r3 = f6027b;
        r2 = android.util.Log.isLoggable(r3[3], 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r2 = r3[1];
        r2 = r3[2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r2 = p086q2.C3617a.m10276b(r6.f6028a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x006a, code lost:
        if (r0 != 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        p086q2.C3617a.m10276b(r6.f6028a).close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0079, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x007a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x007b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x007d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r3 = p086q2.C3617a.m10276b(r6.f6028a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        p086q2.C3617a.m10276b(r6.f6028a).close();
        p086q2.C3617a.m10277c(r6.f6028a, (android.net.LocalServerSocket) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0097, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0098, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x009a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x0051 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r6 = this;
            int r0 = p086q2.C3619c.f6023c
        L_0x0002:
            r1 = 0
            r2 = 4
            q2.a r3 = r6.f6028a     // Catch:{ IOException -> 0x0051 }
            android.net.LocalServerSocket r3 = p086q2.C3617a.m10276b(r3)     // Catch:{ IOException -> 0x0051 }
            if (r3 != 0) goto L_0x000e
            if (r0 == 0) goto L_0x0030
        L_0x000e:
            android.net.LocalSocket r3 = r3.accept()     // Catch:{ IOException -> 0x0051 }
            java.lang.String[] r4 = f6027b     // Catch:{ IOException -> 0x004b }
            r5 = 5
            r5 = r4[r5]     // Catch:{ IOException -> 0x004b }
            boolean r5 = android.util.Log.isLoggable(r5, r2)     // Catch:{ IOException -> 0x004b }
            if (r0 != 0) goto L_0x0024
            if (r5 == 0) goto L_0x0024
            r5 = r4[r2]     // Catch:{ IOException -> 0x004d }
            r5 = 0
            r4 = r4[r5]     // Catch:{ IOException -> 0x004d }
        L_0x0024:
            q2.c r4 = new q2.c     // Catch:{ IOException -> 0x0051 }
            q2.a r5 = r6.f6028a     // Catch:{ IOException -> 0x0051 }
            r4.<init>(r5, r3)     // Catch:{ IOException -> 0x0051 }
            r4.run()     // Catch:{ IOException -> 0x0051 }
            if (r0 == 0) goto L_0x0002
        L_0x0030:
            q2.a r2 = r6.f6028a     // Catch:{ IOException -> 0x0049 }
            android.net.LocalServerSocket r2 = p086q2.C3617a.m10276b(r2)     // Catch:{ IOException -> 0x0049 }
            if (r0 != 0) goto L_0x0078
            if (r2 == 0) goto L_0x0078
            q2.a r0 = r6.f6028a     // Catch:{ IOException -> 0x0078 }
            android.net.LocalServerSocket r0 = p086q2.C3617a.m10276b(r0)     // Catch:{ IOException -> 0x0078 }
            r0.close()     // Catch:{ IOException -> 0x0078 }
        L_0x0043:
            q2.a r0 = r6.f6028a     // Catch:{ IOException -> 0x0078 }
            p086q2.C3617a.m10277c(r0, r1)     // Catch:{ IOException -> 0x0078 }
            goto L_0x0078
        L_0x0049:
            r0 = move-exception
            throw r0
        L_0x004b:
            r3 = move-exception
            throw r3     // Catch:{ IOException -> 0x004d }
        L_0x004d:
            r3 = move-exception
            throw r3     // Catch:{ IOException -> 0x0051 }
        L_0x004f:
            r2 = move-exception
            goto L_0x007f
        L_0x0051:
            java.lang.String[] r3 = f6027b     // Catch:{ IOException -> 0x007b }
            r4 = 3
            r4 = r3[r4]     // Catch:{ IOException -> 0x007b }
            boolean r2 = android.util.Log.isLoggable(r4, r2)     // Catch:{ IOException -> 0x007b }
            if (r0 != 0) goto L_0x0064
            if (r2 == 0) goto L_0x0064
            r2 = 1
            r2 = r3[r2]     // Catch:{ IOException -> 0x007d }
            r2 = 2
            r2 = r3[r2]     // Catch:{ IOException -> 0x007d }
        L_0x0064:
            q2.a r2 = r6.f6028a     // Catch:{ IOException -> 0x0079 }
            android.net.LocalServerSocket r2 = p086q2.C3617a.m10276b(r2)     // Catch:{ IOException -> 0x0079 }
            if (r0 != 0) goto L_0x0078
            if (r2 == 0) goto L_0x0078
            q2.a r0 = r6.f6028a     // Catch:{ IOException -> 0x0078 }
            android.net.LocalServerSocket r0 = p086q2.C3617a.m10276b(r0)     // Catch:{ IOException -> 0x0078 }
            r0.close()     // Catch:{ IOException -> 0x0078 }
            goto L_0x0043
        L_0x0078:
            return
        L_0x0079:
            r0 = move-exception
            throw r0
        L_0x007b:
            r2 = move-exception
            throw r2     // Catch:{ IOException -> 0x007d }
        L_0x007d:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x004f }
        L_0x007f:
            q2.a r3 = r6.f6028a     // Catch:{ IOException -> 0x0098 }
            android.net.LocalServerSocket r3 = p086q2.C3617a.m10276b(r3)     // Catch:{ IOException -> 0x0098 }
            if (r0 != 0) goto L_0x0097
            if (r3 == 0) goto L_0x0097
            q2.a r0 = r6.f6028a     // Catch:{ IOException -> 0x0097 }
            android.net.LocalServerSocket r0 = p086q2.C3617a.m10276b(r0)     // Catch:{ IOException -> 0x0097 }
            r0.close()     // Catch:{ IOException -> 0x0097 }
            q2.a r0 = r6.f6028a     // Catch:{ IOException -> 0x0097 }
            p086q2.C3617a.m10277c(r0, r1)     // Catch:{ IOException -> 0x0097 }
        L_0x0097:
            throw r2
        L_0x0098:
            r0 = move-exception
            goto L_0x009b
        L_0x009a:
            throw r0
        L_0x009b:
            goto L_0x009a
        */
        throw new UnsupportedOperationException("Method not decompiled: p086q2.C3620d.run():void");
    }
}
