package com.google.firebase.crashlytics.p110c.p112g;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Comparator;

/* renamed from: com.google.firebase.crashlytics.c.g.d0 */
final /* synthetic */ class C2877d0 implements Comparator {

    /* renamed from: a */
    private static final C2877d0 f5541a = new C2877d0();

    private C2877d0() {
    }

    /* renamed from: a */
    public static Comparator m8756a() {
        return f5541a;
    }

    public int compare(Object obj, Object obj2) {
        return ((CrashlyticsReport.C3048b) obj).mo17452b().compareTo(((CrashlyticsReport.C3048b) obj2).mo17452b());
    }
}
