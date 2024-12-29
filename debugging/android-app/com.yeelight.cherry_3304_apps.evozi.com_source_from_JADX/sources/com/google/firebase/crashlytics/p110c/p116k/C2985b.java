package com.google.firebase.crashlytics.p110c.p116k;

import java.io.File;
import java.io.FileFilter;

/* renamed from: com.google.firebase.crashlytics.c.k.b */
final /* synthetic */ class C2985b implements FileFilter {

    /* renamed from: a */
    private final String f5805a;

    private C2985b(String str) {
        this.f5805a = str;
    }

    /* renamed from: a */
    public static FileFilter m9164a(String str) {
        return new C2985b(str);
    }

    public boolean accept(File file) {
        return C2990g.m9195u(this.f5805a, file);
    }
}
