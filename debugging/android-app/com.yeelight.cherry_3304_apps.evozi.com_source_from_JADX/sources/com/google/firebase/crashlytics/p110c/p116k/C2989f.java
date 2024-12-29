package com.google.firebase.crashlytics.p110c.p116k;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.google.firebase.crashlytics.c.k.f */
final /* synthetic */ class C2989f implements FilenameFilter {

    /* renamed from: a */
    private static final C2989f f5809a = new C2989f();

    private C2989f() {
    }

    /* renamed from: a */
    public static FilenameFilter m9168a() {
        return f5809a;
    }

    public boolean accept(File file, String str) {
        return str.startsWith("event");
    }
}
