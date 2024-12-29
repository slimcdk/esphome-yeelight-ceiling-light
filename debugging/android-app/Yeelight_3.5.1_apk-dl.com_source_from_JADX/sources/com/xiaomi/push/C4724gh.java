package com.xiaomi.push;

import java.io.PrintStream;
import java.io.PrintWriter;

/* renamed from: com.xiaomi.push.gh */
public class C4724gh extends Exception {

    /* renamed from: a */
    private C4736gq f8271a = null;

    /* renamed from: a */
    private C4737gr f8272a = null;

    /* renamed from: a */
    private Throwable f8273a = null;

    public C4724gh() {
    }

    public C4724gh(C4736gq gqVar) {
        this.f8271a = gqVar;
    }

    public C4724gh(String str) {
        super(str);
    }

    public C4724gh(String str, Throwable th) {
        super(str);
        this.f8273a = th;
    }

    public C4724gh(Throwable th) {
        this.f8273a = th;
    }

    /* renamed from: a */
    public Throwable mo29210a() {
        return this.f8273a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r1 = r2.f8271a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getMessage() {
        /*
            r2 = this;
            java.lang.String r0 = super.getMessage()
            if (r0 != 0) goto L_0x000f
            com.xiaomi.push.gr r1 = r2.f8272a
            if (r1 == 0) goto L_0x000f
            java.lang.String r0 = r1.toString()
            return r0
        L_0x000f:
            if (r0 != 0) goto L_0x0019
            com.xiaomi.push.gq r1 = r2.f8271a
            if (r1 == 0) goto L_0x0019
            java.lang.String r0 = r1.toString()
        L_0x0019:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4724gh.getMessage():java.lang.String");
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        if (this.f8273a != null) {
            printStream.println("Nested Exception: ");
            this.f8273a.printStackTrace(printStream);
        }
    }

    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        if (this.f8273a != null) {
            printWriter.println("Nested Exception: ");
            this.f8273a.printStackTrace(printWriter);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String message = super.getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(": ");
        }
        C4737gr grVar = this.f8272a;
        if (grVar != null) {
            sb.append(grVar);
        }
        C4736gq gqVar = this.f8271a;
        if (gqVar != null) {
            sb.append(gqVar);
        }
        if (this.f8273a != null) {
            sb.append("\n  -- caused by: ");
            sb.append(this.f8273a);
        }
        return sb.toString();
    }
}
