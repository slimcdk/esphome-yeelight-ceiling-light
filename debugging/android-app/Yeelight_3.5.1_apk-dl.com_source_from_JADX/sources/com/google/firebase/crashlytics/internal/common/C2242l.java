package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.io.IOException;
import p033f1.C3160f;
import p118y0.C3916f;

/* renamed from: com.google.firebase.crashlytics.internal.common.l */
class C2242l {

    /* renamed from: a */
    private final String f3617a;

    /* renamed from: b */
    private final C3160f f3618b;

    public C2242l(String str, C3160f fVar) {
        this.f3617a = str;
        this.f3618b = fVar;
    }

    /* renamed from: b */
    private File m5713b() {
        return this.f3618b.mo23659e(this.f3617a);
    }

    /* renamed from: a */
    public boolean mo18598a() {
        try {
            return m5713b().createNewFile();
        } catch (IOException e) {
            C3916f f = C3916f.m11190f();
            f.mo26402e("Error creating marker: " + this.f3617a, e);
            return false;
        }
    }

    /* renamed from: c */
    public boolean mo18599c() {
        return m5713b().exists();
    }

    /* renamed from: d */
    public boolean mo18600d() {
        return m5713b().delete();
    }
}
