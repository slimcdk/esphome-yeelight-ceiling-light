package com.google.firebase.crashlytics.p110c.p116k;

import java.io.File;
import java.util.Comparator;

/* renamed from: com.google.firebase.crashlytics.c.k.e */
final /* synthetic */ class C2988e implements Comparator {

    /* renamed from: a */
    private static final C2988e f5808a = new C2988e();

    private C2988e() {
    }

    /* renamed from: a */
    public static Comparator m9167a() {
        return f5808a;
    }

    public int compare(Object obj, Object obj2) {
        return ((File) obj2).getName().compareTo(((File) obj).getName());
    }
}
