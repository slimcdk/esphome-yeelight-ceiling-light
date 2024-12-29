package com.google.firebase.crashlytics.p110c.p116k;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.google.firebase.crashlytics.c.k.a */
final /* synthetic */ class C2984a implements FilenameFilter {

    /* renamed from: a */
    private final String f5804a;

    private C2984a(String str) {
        this.f5804a = str;
    }

    /* renamed from: a */
    public static FilenameFilter m9163a(String str) {
        return new C2984a(str);
    }

    public boolean accept(File file, String str) {
        return str.startsWith(this.f5804a);
    }
}
