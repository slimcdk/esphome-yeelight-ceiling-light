package com.xiaomi.push;

import java.io.PrintStream;
import java.io.PrintWriter;

/* renamed from: com.xiaomi.push.gd */
public class C4694gd extends Exception {

    /* renamed from: a */
    private C4706gm f8806a = null;

    /* renamed from: a */
    private C4707gn f8807a = null;

    /* renamed from: a */
    private Throwable f8808a = null;

    public C4694gd() {
    }

    public C4694gd(C4706gm gmVar) {
        this.f8806a = gmVar;
    }

    public C4694gd(String str) {
        super(str);
    }

    public C4694gd(String str, Throwable th) {
        super(str);
        this.f8808a = th;
    }

    public C4694gd(Throwable th) {
        this.f8808a = th;
    }

    /* renamed from: a */
    public Throwable mo25174a() {
        return this.f8808a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r1 = r2.f8806a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getMessage() {
        /*
            r2 = this;
            java.lang.String r0 = super.getMessage()
            if (r0 != 0) goto L_0x000f
            com.xiaomi.push.gn r1 = r2.f8807a
            if (r1 == 0) goto L_0x000f
            java.lang.String r0 = r1.toString()
            return r0
        L_0x000f:
            if (r0 != 0) goto L_0x0019
            com.xiaomi.push.gm r1 = r2.f8806a
            if (r1 == 0) goto L_0x0019
            java.lang.String r0 = r1.toString()
        L_0x0019:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4694gd.getMessage():java.lang.String");
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        if (this.f8808a != null) {
            printStream.println("Nested Exception: ");
            this.f8808a.printStackTrace(printStream);
        }
    }

    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        if (this.f8808a != null) {
            printWriter.println("Nested Exception: ");
            this.f8808a.printStackTrace(printWriter);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String message = super.getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(": ");
        }
        C4707gn gnVar = this.f8807a;
        if (gnVar != null) {
            sb.append(gnVar);
        }
        C4706gm gmVar = this.f8806a;
        if (gmVar != null) {
            sb.append(gmVar);
        }
        if (this.f8808a != null) {
            sb.append("\n  -- caused by: ");
            sb.append(this.f8808a);
        }
        return sb.toString();
    }
}
