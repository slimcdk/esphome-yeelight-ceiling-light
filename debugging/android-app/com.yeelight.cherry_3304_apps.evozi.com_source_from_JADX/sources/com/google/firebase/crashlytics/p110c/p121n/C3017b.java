package com.google.firebase.crashlytics.p110c.p121n;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.nio.charset.Charset;
import p011c.p012a.p019b.p020a.C0462e;

/* renamed from: com.google.firebase.crashlytics.c.n.b */
final /* synthetic */ class C3017b implements C0462e {

    /* renamed from: a */
    private static final C3017b f5864a = new C3017b();

    private C3017b() {
    }

    /* renamed from: a */
    public static C0462e m9338a() {
        return f5864a;
    }

    public Object apply(Object obj) {
        return C3018c.f5865b.mo17738F((CrashlyticsReport) obj).getBytes(Charset.forName("UTF-8"));
    }
}
