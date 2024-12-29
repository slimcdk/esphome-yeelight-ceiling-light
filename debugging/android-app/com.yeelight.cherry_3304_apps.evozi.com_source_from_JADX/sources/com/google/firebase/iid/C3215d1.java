package com.google.firebase.iid;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.C1520d;
import com.google.android.gms.common.internal.C1597r;
import com.google.firebase.C2816c;
import com.google.firebase.installations.C3277h;
import com.google.firebase.installations.C3283m;
import com.google.firebase.p132h.C3198c;
import com.google.firebase.p138k.C3317h;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p011c.p012a.p019b.p028b.p038e.C0619h;
import p011c.p012a.p019b.p028b.p038e.C0620i;
import p011c.p012a.p019b.p028b.p038e.C0623k;

/* renamed from: com.google.firebase.iid.d1 */
public final class C3215d1 {

    /* renamed from: a */
    private final C2816c f6218a;

    /* renamed from: b */
    private final C3245q f6219b;

    /* renamed from: c */
    private final C3257w f6220c;

    /* renamed from: d */
    private final Executor f6221d;

    /* renamed from: e */
    private final C3317h f6222e;

    /* renamed from: f */
    private final C3198c f6223f;

    /* renamed from: g */
    private final C3277h f6224g;

    @VisibleForTesting
    private C3215d1(C2816c cVar, C3245q qVar, Executor executor, C3257w wVar, C3317h hVar, C3198c cVar2, C3277h hVar2) {
        this.f6218a = cVar;
        this.f6219b = qVar;
        this.f6220c = wVar;
        this.f6221d = executor;
        this.f6222e = hVar;
        this.f6223f = cVar2;
        this.f6224g = hVar2;
    }

    public C3215d1(C2816c cVar, C3245q qVar, Executor executor, C3317h hVar, C3198c cVar2, C3277h hVar2) {
        this(cVar, qVar, executor, new C3257w(cVar.mo17061g(), qVar), hVar, cVar2, hVar2);
    }

    /* renamed from: b */
    private final C0619h<Bundle> m10048b(String str, String str2, String str3, Bundle bundle) {
        C0620i iVar = new C0620i();
        this.f6221d.execute(new C3212c1(this, str, str2, str3, bundle, iVar));
        return iVar.mo8666a();
    }

    /* renamed from: c */
    private final String m10049c() {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(this.f6218a.mo17063i().getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    /* renamed from: e */
    private final Bundle m10050e(String str, String str2, String str3, Bundle bundle) {
        bundle.putString(XiaomiOAuthConstants.EXTRA_SCOPE_2, str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.f6218a.mo17064j().mo17742c());
        bundle.putString("gmsv", Integer.toString(this.f6219b.mo17859g()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f6219b.mo17857e());
        bundle.putString("app_ver_name", this.f6219b.mo17858f());
        bundle.putString("firebase-app-name-hash", m10049c());
        try {
            String b = ((C3283m) C0623k.m534a(this.f6224g.mo17894a(false))).mo17879b();
            if (!TextUtils.isEmpty(b)) {
                bundle.putString("Goog-Firebase-Installations-Auth", b);
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        String b2 = C1597r.m4385a().mo11270b("firebase-iid");
        if ("UNKNOWN".equals(b2)) {
            int i = C1520d.f2875a;
            StringBuilder sb = new StringBuilder(19);
            sb.append("unknown_");
            sb.append(i);
            b2 = sb.toString();
        }
        String valueOf = String.valueOf(b2);
        bundle.putString("cliv", valueOf.length() != 0 ? "fiid-".concat(valueOf) : new String("fiid-"));
        C3198c.C3199a a = this.f6223f.mo17781a("fire-iid");
        if (a != C3198c.C3199a.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(a.mo17782a()));
            bundle.putString("Firebase-Client", this.f6222e.mo17971a());
        }
        return bundle;
    }

    /* renamed from: f */
    private final C0619h<String> m10051f(C0619h<Bundle> hVar) {
        return hVar.mo8647h(this.f6221d, new C3218e1(this));
    }

    /* renamed from: a */
    public final C0619h<String> mo17814a(String str, String str2, String str3) {
        return m10051f(m10048b(str, str2, str3, new Bundle()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo17815d(String str, String str2, String str3, Bundle bundle, C0620i iVar) {
        try {
            m10050e(str, str2, str3, bundle);
            iVar.mo8668c(this.f6220c.mo17866a(bundle));
        } catch (IOException e) {
            iVar.mo8667b(e);
        }
    }
}
