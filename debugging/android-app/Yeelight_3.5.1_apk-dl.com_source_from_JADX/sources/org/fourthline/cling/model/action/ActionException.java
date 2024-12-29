package org.fourthline.cling.model.action;

import org.fourthline.cling.model.types.ErrorCode;

public class ActionException extends Exception {
    private int errorCode;

    public ActionException(int i, String str) {
        super(str);
        this.errorCode = i;
    }

    public ActionException(int i, String str, Throwable th) {
        super(str, th);
        this.errorCode = i;
    }

    public ActionException(ErrorCode errorCode2) {
        this(errorCode2.getCode(), errorCode2.getDescription());
    }

    public ActionException(ErrorCode errorCode2, String str) {
        this(errorCode2, str, true);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActionException(org.fourthline.cling.model.types.ErrorCode r3, java.lang.String r4, java.lang.Throwable r5) {
        /*
            r2 = this;
            int r0 = r3.getCode()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r3.getDescription()
            r1.append(r3)
            java.lang.String r3 = ". "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = "."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r2.<init>((int) r0, (java.lang.String) r3, (java.lang.Throwable) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.fourthline.cling.model.action.ActionException.<init>(org.fourthline.cling.model.types.ErrorCode, java.lang.String, java.lang.Throwable):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActionException(org.fourthline.cling.model.types.ErrorCode r2, java.lang.String r3, boolean r4) {
        /*
            r1 = this;
            int r0 = r2.getCode()
            if (r4 == 0) goto L_0x0023
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r2 = r2.getDescription()
            r4.append(r2)
            java.lang.String r2 = ". "
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = "."
            r4.append(r2)
            java.lang.String r3 = r4.toString()
        L_0x0023:
            r1.<init>((int) r0, (java.lang.String) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.fourthline.cling.model.action.ActionException.<init>(org.fourthline.cling.model.types.ErrorCode, java.lang.String, boolean):void");
    }

    public int getErrorCode() {
        return this.errorCode;
    }
}
