package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.WorkerThread;

/* renamed from: com.google.android.gms.measurement.internal.x9 */
public final class C2378x9 {

    /* renamed from: a */
    private final C2111a5 f4722a;

    public C2378x9(C2111a5 a5Var) {
        this.f4722a = a5Var;
    }

    /* renamed from: d */
    private final boolean m7766d() {
        return m7767e() && this.f4722a.mo12429f().mo11378a() - this.f4722a.mo12406A().f4218C.mo12849a() > this.f4722a.mo12443x().mo12471p((String) null, C2302r.f4492R0);
    }

    /* renamed from: e */
    private final boolean m7767e() {
        return this.f4722a.mo12406A().f4218C.mo12849a() > 0;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: a */
    public final void mo13127a() {
        this.f4722a.mo12426a().mo12567h();
        if (m7767e()) {
            if (m7766d()) {
                this.f4722a.mo12406A().f4217B.mo12870b((String) null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1);
                this.f4722a.mo12411F().mo12709S("auto", "_cmpx", bundle);
            } else {
                String a = this.f4722a.mo12406A().f4217B.mo12869a();
                if (TextUtils.isEmpty(a)) {
                    this.f4722a.mo12427b().mo13097G().mo13130a("Cache still valid but referrer not found");
                } else {
                    long a2 = ((this.f4722a.mo12406A().f4218C.mo12849a() / 3600000) - 1) * 3600000;
                    Uri parse = Uri.parse(a);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String next : parse.getQueryParameterNames()) {
                        bundle2.putString(next, parse.getQueryParameter(next));
                    }
                    ((Bundle) pair.second).putLong("_cc", a2);
                    this.f4722a.mo12411F().mo12709S((String) pair.first, "_cmp", (Bundle) pair.second);
                }
                this.f4722a.mo12406A().f4217B.mo12870b((String) null);
            }
            this.f4722a.mo12406A().f4218C.mo12850b(0);
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: b */
    public final void mo13128b(String str, Bundle bundle) {
        String str2;
        this.f4722a.mo12426a().mo12567h();
        if (!this.f4722a.mo12436p()) {
            if (bundle == null || bundle.isEmpty()) {
                str2 = null;
            } else {
                if (str == null || str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String str3 : bundle.keySet()) {
                    builder.appendQueryParameter(str3, bundle.getString(str3));
                }
                str2 = builder.build().toString();
            }
            if (!TextUtils.isEmpty(str2)) {
                this.f4722a.mo12406A().f4217B.mo12870b(str2);
                this.f4722a.mo12406A().f4218C.mo12850b(this.f4722a.mo12429f().mo11378a());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo13129c() {
        if (m7767e() && m7766d()) {
            this.f4722a.mo12406A().f4217B.mo12870b((String) null);
        }
    }
}
