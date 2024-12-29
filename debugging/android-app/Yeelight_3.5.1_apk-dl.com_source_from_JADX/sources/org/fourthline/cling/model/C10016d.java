package org.fourthline.cling.model;

import java.util.Date;

/* renamed from: org.fourthline.cling.model.d */
public class C10016d {

    /* renamed from: c */
    private static String f18486c = "d";

    /* renamed from: a */
    private int f18487a = 0;

    /* renamed from: b */
    private long f18488b = mo40339a();

    public C10016d() {
    }

    public C10016d(int i) {
        this.f18487a = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public long mo40339a() {
        return new Date().getTime() / 1000;
    }

    /* renamed from: b */
    public int mo40340b() {
        return this.f18487a;
    }

    /* renamed from: c */
    public long mo40341c() {
        int i = this.f18487a;
        if (i == 0) {
            return 2147483647L;
        }
        return (this.f18488b + ((long) i)) - mo40339a();
    }

    /* renamed from: d */
    public boolean mo40342d() {
        return mo40343e(false);
    }

    /* renamed from: e */
    public boolean mo40343e(boolean z) {
        int i = this.f18487a;
        if (i != 0) {
            if (this.f18488b + ((long) (i / (z ? 2 : 1))) < mo40339a()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public void mo40344f(long j) {
        this.f18488b = j;
    }

    /* renamed from: g */
    public void mo40345g() {
        mo40344f(mo40339a());
    }

    public String toString() {
        return "(" + f18486c + ")" + " MAX AGE: " + this.f18487a;
    }
}
