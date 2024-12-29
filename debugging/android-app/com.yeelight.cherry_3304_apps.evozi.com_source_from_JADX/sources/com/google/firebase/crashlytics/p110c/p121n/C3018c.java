package com.google.firebase.crashlytics.p110c.p121n;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.datatransport.cct.C1263a;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.p127w.C3173h;
import com.google.firebase.crashlytics.p110c.p112g.C2943n;
import p011c.p012a.p019b.p020a.C0459b;
import p011c.p012a.p019b.p020a.C0460c;
import p011c.p012a.p019b.p020a.C0462e;
import p011c.p012a.p019b.p020a.C0463f;
import p011c.p012a.p019b.p020a.p021i.C0492p;
import p011c.p012a.p019b.p028b.p038e.C0619h;
import p011c.p012a.p019b.p028b.p038e.C0620i;

/* renamed from: com.google.firebase.crashlytics.c.n.c */
public class C3018c {

    /* renamed from: b */
    private static final C3173h f5865b = new C3173h();

    /* renamed from: c */
    private static final String f5866c = m9342d("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: d */
    private static final String f5867d = m9342d("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: e */
    private static final C0462e<CrashlyticsReport, byte[]> f5868e = C3017b.m9338a();

    /* renamed from: a */
    private final C0463f<CrashlyticsReport> f5869a;

    C3018c(C0463f<CrashlyticsReport> fVar, C0462e<CrashlyticsReport, byte[]> eVar) {
        this.f5869a = fVar;
    }

    /* renamed from: a */
    public static C3018c m9339a(Context context) {
        C0492p.m146f(context);
        return new C3018c(C0492p.m144c().mo8473g(new C1263a(f5866c, f5867d)).mo8403a("FIREBASE_CRASHLYTICS_REPORT", CrashlyticsReport.class, C0459b.m41b("json"), f5868e), f5868e);
    }

    /* renamed from: b */
    static /* synthetic */ void m9340b(C0620i iVar, C2943n nVar, Exception exc) {
        if (exc != null) {
            iVar.mo8669d(exc);
        } else {
            iVar.mo8670e(nVar);
        }
    }

    /* renamed from: d */
    private static String m9342d(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    @NonNull
    /* renamed from: e */
    public C0619h<C2943n> mo17408e(@NonNull C2943n nVar) {
        CrashlyticsReport b = nVar.mo17159b();
        C0620i iVar = new C0620i();
        this.f5869a.mo8402a(C0460c.m43d(b), C3016a.m9336b(iVar, nVar));
        return iVar.mo8666a();
    }
}
