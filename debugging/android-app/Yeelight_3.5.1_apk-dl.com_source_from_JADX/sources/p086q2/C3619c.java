package p086q2;

import android.net.LocalSocket;
import androidx.annotation.NonNull;

/* renamed from: q2.c */
class C3619c extends Thread {

    /* renamed from: c */
    public static int f6023c;

    /* renamed from: d */
    private static final String[] f6024d;

    /* renamed from: a */
    private final LocalSocket f6025a;

    /* renamed from: b */
    final C3617a f6026b;

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0083 A[LOOP:1: B:22:0x0061->B:34:0x0083, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0085 A[EDGE_INSN: B:40:0x0085->B:35:0x0085 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0022  */
    static {
        /*
            r0 = 6
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r1 = "'\u000e\u00049$\u001b*<"
            r2 = 4
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            java.lang.String r7 = "#-'\u0004 T/:\u00053\u001b<'\u0006g=\u001bhMbE{;"
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
            goto L_0x0060
        L_0x001c:
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r0
        L_0x0020:
            if (r11 > r12) goto L_0x0060
            java.lang.String r11 = new java.lang.String
            r11.<init>(r8)
            java.lang.String r8 = r11.intern()
            if (r9 == 0) goto L_0x0054
            if (r9 == r6) goto L_0x004d
            if (r9 == r5) goto L_0x0046
            if (r9 == r4) goto L_0x0040
            if (r9 == r2) goto L_0x003b
            r0[r10] = r8
            r0 = r7
            r8 = 0
            r9 = 1
            goto L_0x004b
        L_0x003b:
            r0[r10] = r8
            f6024d = r7
            return
        L_0x0040:
            r0[r10] = r8
            r9 = 5
            r0 = r7
            r8 = 4
            goto L_0x004b
        L_0x0046:
            r0[r10] = r8
            r0 = r7
            r8 = 3
            r9 = 4
        L_0x004b:
            r7 = r1
            goto L_0x000e
        L_0x004d:
            r0[r10] = r8
            java.lang.String r0 = "!\u000b\u000eG"
            r8 = 2
            r9 = 3
            goto L_0x005a
        L_0x0054:
            r0[r10] = r8
            java.lang.String r0 = "2>!\u0006\"\u0010<\u0005g\u001c>&\u000e+\u0011+\u0006.\u00111<J5\u0011.=\u000f4\u0000"
            r8 = 1
            r9 = 2
        L_0x005a:
            r16 = r7
            r7 = r0
            r0 = r16
            goto L_0x000e
        L_0x0060:
            r13 = r12
        L_0x0061:
            char r14 = r8[r12]
            int r15 = r13 % 5
            if (r15 == 0) goto L_0x0079
            if (r15 == r6) goto L_0x0076
            if (r15 == r5) goto L_0x0073
            if (r15 == r4) goto L_0x0070
            r15 = 71
            goto L_0x007b
        L_0x0070:
            r15 = 106(0x6a, float:1.49E-43)
            goto L_0x007b
        L_0x0073:
            r15 = 72
            goto L_0x007b
        L_0x0076:
            r15 = 95
            goto L_0x007b
        L_0x0079:
            r15 = 116(0x74, float:1.63E-43)
        L_0x007b:
            r14 = r14 ^ r15
            char r14 = (char) r14
            r8[r12] = r14
            int r13 = r13 + 1
            if (r11 != 0) goto L_0x0085
            r12 = r11
            goto L_0x0061
        L_0x0085:
            r12 = r13
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: p086q2.C3619c.<clinit>():void");
    }

    C3619c(@NonNull C3617a aVar, LocalSocket localSocket) {
        int i = f6023c;
        this.f6026b = aVar;
        this.f6025a = localSocket;
        if (i != 0) {
            C3617a.f6019c++;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0075 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r11 = this;
            int r0 = f6023c
            r1 = 2
            r2 = 1
            java.io.DataInputStream r3 = new java.io.DataInputStream     // Catch:{ IOException -> 0x0075 }
            android.net.LocalSocket r4 = r11.f6025a     // Catch:{ IOException -> 0x0075 }
            java.io.InputStream r4 = r4.getInputStream()     // Catch:{ IOException -> 0x0075 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x0075 }
            java.io.DataOutputStream r4 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x0075 }
            android.net.LocalSocket r5 = r11.f6025a     // Catch:{ IOException -> 0x0075 }
            java.io.OutputStream r5 = r5.getOutputStream()     // Catch:{ IOException -> 0x0075 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x0075 }
            r5 = 0
            long r6 = r3.readLong()     // Catch:{ all -> 0x006a }
            if (r0 != 0) goto L_0x004a
            r8 = 215861493890(0x3242590082, double:1.06649748391E-312)
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0046
            java.lang.String[] r8 = f6024d     // Catch:{ all -> 0x006a }
            r9 = 5
            r9 = r8[r9]     // Catch:{ all -> 0x006a }
            r8 = r8[r5]     // Catch:{ all -> 0x006a }
            java.lang.Object[] r9 = new java.lang.Object[r2]     // Catch:{ all -> 0x006a }
            java.lang.String r6 = java.lang.Long.toHexString(r6)     // Catch:{ all -> 0x006a }
            r9[r5] = r6     // Catch:{ all -> 0x006a }
            java.lang.String.format(r8, r9)     // Catch:{ all -> 0x006a }
            java.io.Closeable[] r6 = new java.io.Closeable[r1]     // Catch:{ IOException -> 0x0075 }
            r6[r5] = r3     // Catch:{ IOException -> 0x0075 }
            r6[r2] = r4     // Catch:{ IOException -> 0x0075 }
            p086q2.C3617a.m10295u(r6)     // Catch:{ IOException -> 0x0075 }
            return
        L_0x0046:
            r6 = 6
            r4.writeInt(r6)     // Catch:{ all -> 0x006a }
        L_0x004a:
            java.lang.String r6 = r3.readUTF()     // Catch:{ all -> 0x006a }
            q2.a r7 = r11.f6026b     // Catch:{ all -> 0x006a }
            java.lang.String r6 = p086q2.C3617a.m10285k(r7, r6)     // Catch:{ all -> 0x006a }
            java.lang.String[] r7 = f6024d     // Catch:{ all -> 0x006a }
            r8 = 3
            r7 = r7[r8]     // Catch:{ all -> 0x006a }
            byte[] r6 = r6.getBytes(r7)     // Catch:{ all -> 0x006a }
            r4.write(r6)     // Catch:{ all -> 0x006a }
            java.io.Closeable[] r6 = new java.io.Closeable[r1]     // Catch:{ IOException -> 0x0075 }
            r6[r5] = r3     // Catch:{ IOException -> 0x0075 }
            r6[r2] = r4     // Catch:{ IOException -> 0x0075 }
            p086q2.C3617a.m10295u(r6)     // Catch:{ IOException -> 0x0075 }
            goto L_0x0086
        L_0x006a:
            r6 = move-exception
            java.io.Closeable[] r7 = new java.io.Closeable[r1]     // Catch:{ IOException -> 0x0075 }
            r7[r5] = r3     // Catch:{ IOException -> 0x0075 }
            r7[r2] = r4     // Catch:{ IOException -> 0x0075 }
            p086q2.C3617a.m10295u(r7)     // Catch:{ IOException -> 0x0075 }
            throw r6     // Catch:{ IOException -> 0x0075 }
        L_0x0075:
            java.lang.String[] r3 = f6024d     // Catch:{ IOException -> 0x0087 }
            r2 = r3[r2]     // Catch:{ IOException -> 0x0087 }
            r4 = 4
            boolean r2 = android.util.Log.isLoggable(r2, r4)     // Catch:{ IOException -> 0x0087 }
            if (r0 != 0) goto L_0x0086
            if (r2 == 0) goto L_0x0086
            r0 = r3[r4]     // Catch:{ IOException -> 0x0089 }
            r0 = r3[r1]     // Catch:{ IOException -> 0x0089 }
        L_0x0086:
            return
        L_0x0087:
            r0 = move-exception
            throw r0     // Catch:{ IOException -> 0x0089 }
        L_0x0089:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p086q2.C3619c.run():void");
    }
}
