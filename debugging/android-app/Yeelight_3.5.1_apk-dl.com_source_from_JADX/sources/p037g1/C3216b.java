package p037g1;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.datatransport.cct.C0639a;
import com.google.firebase.crashlytics.internal.common.C2244n;
import com.google.firebase.crashlytics.internal.common.C2259y;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.settings.C2402h;
import p025d1.C3126g;
import p031f.C3150a;
import p031f.C3151b;
import p035g.C3203s;
import p065m0.C3339g;

/* renamed from: g1.b */
public class C3216b {

    /* renamed from: b */
    private static final C3126g f5180b = new C3126g();

    /* renamed from: c */
    private static final String f5181c = m8649e("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: d */
    private static final String f5182d = m8649e("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: e */
    private static final C3151b<CrashlyticsReport, byte[]> f5183e = C9047a.f16612a;

    /* renamed from: a */
    private final C3217d f5184a;

    C3216b(C3217d dVar, C3151b<CrashlyticsReport, byte[]> bVar) {
        this.f5184a = dVar;
    }

    /* renamed from: b */
    public static C3216b m8647b(Context context, C2402h hVar, C2259y yVar) {
        C3203s.m8625f(context);
        C3150a b = C3150a.m8421b("json");
        C3151b<CrashlyticsReport, byte[]> bVar = f5183e;
        return new C3216b(new C3217d(C3203s.m8623c().mo23768g(new C0639a(f5181c, f5182d)).mo23645a("FIREBASE_CRASHLYTICS_REPORT", CrashlyticsReport.class, b, bVar), hVar.mo18973b(), yVar), bVar);
    }

    /* renamed from: e */
    private static String m8649e(String str, String str2) {
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
    /* renamed from: c */
    public C3339g<C2244n> mo23776c(@NonNull C2244n nVar, boolean z) {
        return this.f5184a.mo23777h(nVar, z).mo14736a();
    }
}
