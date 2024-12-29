package com.google.firebase.crashlytics.p110c.p125p;

/* renamed from: com.google.firebase.crashlytics.c.p.a */
public class C3040a implements C3043d {

    /* renamed from: a */
    private final int f5922a;

    /* renamed from: b */
    private final C3043d[] f5923b;

    /* renamed from: c */
    private final C3041b f5924c;

    public C3040a(int i, C3043d... dVarArr) {
        this.f5922a = i;
        this.f5923b = dVarArr;
        this.f5924c = new C3041b(i);
    }

    /* renamed from: a */
    public StackTraceElement[] mo17428a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f5922a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (C3043d dVar : this.f5923b) {
            if (stackTraceElementArr2.length <= this.f5922a) {
                break;
            }
            stackTraceElementArr2 = dVar.mo17428a(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > this.f5922a ? this.f5924c.mo17428a(stackTraceElementArr2) : stackTraceElementArr2;
    }
}
