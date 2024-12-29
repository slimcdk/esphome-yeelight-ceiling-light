package com.google.firebase.crashlytics.p110c.p125p;

/* renamed from: com.google.firebase.crashlytics.c.p.b */
public class C3041b implements C3043d {

    /* renamed from: a */
    private final int f5925a;

    public C3041b(int i) {
        this.f5925a = i;
    }

    /* renamed from: a */
    public StackTraceElement[] mo17428a(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i = this.f5925a;
        if (length <= i) {
            return stackTraceElementArr;
        }
        int i2 = i / 2;
        int i3 = i - i2;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i3);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i2, stackTraceElementArr2, i3, i2);
        return stackTraceElementArr2;
    }
}
