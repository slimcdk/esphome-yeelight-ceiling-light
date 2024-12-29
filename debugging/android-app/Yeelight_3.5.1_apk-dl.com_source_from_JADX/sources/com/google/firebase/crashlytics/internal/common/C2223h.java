package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.google.firebase.crashlytics.internal.common.h */
public final /* synthetic */ class C2223h implements FilenameFilter {

    /* renamed from: a */
    public static final /* synthetic */ C2223h f3551a = new C2223h();

    private /* synthetic */ C2223h() {
    }

    public final boolean accept(File file, String str) {
        return str.startsWith(".ae");
    }
}
