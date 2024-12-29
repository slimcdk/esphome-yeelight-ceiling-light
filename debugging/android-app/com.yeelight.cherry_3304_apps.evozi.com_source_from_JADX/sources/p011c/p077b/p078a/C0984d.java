package p011c.p077b.p078a;

/* renamed from: c.b.a.d */
class C0984d extends Thread {

    /* renamed from: b */
    private static final String[] f1184b;

    /* renamed from: a */
    final C0981a f1185a;

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
            f1184b = r7
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
        throw new UnsupportedOperationException("Method not decompiled: p011c.p077b.p078a.C0984d.<clinit>():void");
    }

    private C0984d(C0981a aVar) {
        this.f1185a = aVar;
    }

    C0984d(C0981a aVar, C0982b bVar) {
        this(aVar);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:32|33|(2:36|37)|38|39|(1:67)(2:42|43)) */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0053, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r2 = android.util.Log.isLoggable(f1184b[3], 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r2 = f1184b[1];
        r2 = f1184b[2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r2 = p011c.p077b.p078a.C0981a.m1863b(r6.f1185a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0072, code lost:
        if (r0 != 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        p011c.p077b.p078a.C0981a.m1863b(r6.f1185a).close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0081, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0082, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0083, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0085, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r3 = p011c.p077b.p078a.C0981a.m1863b(r6.f1185a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        p011c.p077b.p078a.C0981a.m1863b(r6.f1185a).close();
        p011c.p077b.p078a.C0981a.m1864c(r6.f1185a, (android.net.LocalServerSocket) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x009f, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00a0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00a2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x0055 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r6 = this;
            int r0 = p011c.p077b.p078a.C0983c.f1180c
        L_0x0002:
            r1 = 0
            r2 = 4
            c.b.a.a r3 = r6.f1185a     // Catch:{ IOException -> 0x0055 }
            android.net.LocalServerSocket r3 = p011c.p077b.p078a.C0981a.m1863b(r3)     // Catch:{ IOException -> 0x0055 }
            if (r3 != 0) goto L_0x000e
            if (r0 == 0) goto L_0x0034
        L_0x000e:
            android.net.LocalSocket r3 = r3.accept()     // Catch:{ IOException -> 0x0055 }
            java.lang.String[] r4 = f1184b     // Catch:{ IOException -> 0x004f }
            r5 = 5
            r4 = r4[r5]     // Catch:{ IOException -> 0x004f }
            boolean r4 = android.util.Log.isLoggable(r4, r2)     // Catch:{ IOException -> 0x004f }
            if (r0 != 0) goto L_0x0028
            if (r4 == 0) goto L_0x0028
            java.lang.String[] r4 = f1184b     // Catch:{ IOException -> 0x0051 }
            r4 = r4[r2]     // Catch:{ IOException -> 0x0051 }
            java.lang.String[] r4 = f1184b     // Catch:{ IOException -> 0x0051 }
            r5 = 0
            r4 = r4[r5]     // Catch:{ IOException -> 0x0051 }
        L_0x0028:
            c.b.a.c r4 = new c.b.a.c     // Catch:{ IOException -> 0x0055 }
            c.b.a.a r5 = r6.f1185a     // Catch:{ IOException -> 0x0055 }
            r4.<init>(r5, r3)     // Catch:{ IOException -> 0x0055 }
            r4.run()     // Catch:{ IOException -> 0x0055 }
            if (r0 == 0) goto L_0x0002
        L_0x0034:
            c.b.a.a r2 = r6.f1185a     // Catch:{ IOException -> 0x004d }
            android.net.LocalServerSocket r2 = p011c.p077b.p078a.C0981a.m1863b(r2)     // Catch:{ IOException -> 0x004d }
            if (r0 != 0) goto L_0x0080
            if (r2 == 0) goto L_0x0080
            c.b.a.a r0 = r6.f1185a     // Catch:{ IOException -> 0x0080 }
            android.net.LocalServerSocket r0 = p011c.p077b.p078a.C0981a.m1863b(r0)     // Catch:{ IOException -> 0x0080 }
            r0.close()     // Catch:{ IOException -> 0x0080 }
        L_0x0047:
            c.b.a.a r0 = r6.f1185a     // Catch:{ IOException -> 0x0080 }
            p011c.p077b.p078a.C0981a.m1864c(r0, r1)     // Catch:{ IOException -> 0x0080 }
            goto L_0x0080
        L_0x004d:
            r0 = move-exception
            throw r0
        L_0x004f:
            r3 = move-exception
            throw r3     // Catch:{ IOException -> 0x0051 }
        L_0x0051:
            r3 = move-exception
            throw r3     // Catch:{ IOException -> 0x0055 }
        L_0x0053:
            r2 = move-exception
            goto L_0x0087
        L_0x0055:
            java.lang.String[] r3 = f1184b     // Catch:{ IOException -> 0x0083 }
            r4 = 3
            r3 = r3[r4]     // Catch:{ IOException -> 0x0083 }
            boolean r2 = android.util.Log.isLoggable(r3, r2)     // Catch:{ IOException -> 0x0083 }
            if (r0 != 0) goto L_0x006c
            if (r2 == 0) goto L_0x006c
            java.lang.String[] r2 = f1184b     // Catch:{ IOException -> 0x0085 }
            r3 = 1
            r2 = r2[r3]     // Catch:{ IOException -> 0x0085 }
            java.lang.String[] r2 = f1184b     // Catch:{ IOException -> 0x0085 }
            r3 = 2
            r2 = r2[r3]     // Catch:{ IOException -> 0x0085 }
        L_0x006c:
            c.b.a.a r2 = r6.f1185a     // Catch:{ IOException -> 0x0081 }
            android.net.LocalServerSocket r2 = p011c.p077b.p078a.C0981a.m1863b(r2)     // Catch:{ IOException -> 0x0081 }
            if (r0 != 0) goto L_0x0080
            if (r2 == 0) goto L_0x0080
            c.b.a.a r0 = r6.f1185a     // Catch:{ IOException -> 0x0080 }
            android.net.LocalServerSocket r0 = p011c.p077b.p078a.C0981a.m1863b(r0)     // Catch:{ IOException -> 0x0080 }
            r0.close()     // Catch:{ IOException -> 0x0080 }
            goto L_0x0047
        L_0x0080:
            return
        L_0x0081:
            r0 = move-exception
            throw r0
        L_0x0083:
            r2 = move-exception
            throw r2     // Catch:{ IOException -> 0x0085 }
        L_0x0085:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0053 }
        L_0x0087:
            c.b.a.a r3 = r6.f1185a     // Catch:{ IOException -> 0x00a0 }
            android.net.LocalServerSocket r3 = p011c.p077b.p078a.C0981a.m1863b(r3)     // Catch:{ IOException -> 0x00a0 }
            if (r0 != 0) goto L_0x009f
            if (r3 == 0) goto L_0x009f
            c.b.a.a r0 = r6.f1185a     // Catch:{ IOException -> 0x009f }
            android.net.LocalServerSocket r0 = p011c.p077b.p078a.C0981a.m1863b(r0)     // Catch:{ IOException -> 0x009f }
            r0.close()     // Catch:{ IOException -> 0x009f }
            c.b.a.a r0 = r6.f1185a     // Catch:{ IOException -> 0x009f }
            p011c.p077b.p078a.C0981a.m1864c(r0, r1)     // Catch:{ IOException -> 0x009f }
        L_0x009f:
            throw r2
        L_0x00a0:
            r0 = move-exception
            goto L_0x00a3
        L_0x00a2:
            throw r0
        L_0x00a3:
            goto L_0x00a2
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p077b.p078a.C0984d.run():void");
    }
}
