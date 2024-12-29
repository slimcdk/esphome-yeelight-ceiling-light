package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.WorkerThread;

/* renamed from: com.google.android.gms.measurement.internal.eb */
public final class C1607eb {

    /* renamed from: a */
    private final C1717n5 f2069a;

    public C1607eb(C1717n5 n5Var) {
        this.f2069a = n5Var;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: a */
    public final void mo14131a(String str, Bundle bundle) {
        String str2;
        this.f2069a.mo14227a().mo14009h();
        if (!this.f2069a.mo14395o()) {
            if (bundle.isEmpty()) {
                str2 = null;
            } else {
                if (true == str.isEmpty()) {
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
                this.f2069a.mo14375F().f2579u.mo14427b(str2);
                this.f2069a.mo14375F().f2580v.mo14369b(this.f2069a.mo14229c().mo11029a());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: b */
    public final void mo14132b() {
        this.f2069a.mo14227a().mo14009h();
        if (mo14134d()) {
            if (mo14135e()) {
                this.f2069a.mo14375F().f2579u.mo14427b((String) null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1);
                this.f2069a.mo14377I().mo14570v("auto", "_cmpx", bundle);
            } else {
                String a = this.f2069a.mo14375F().f2579u.mo14426a();
                if (TextUtils.isEmpty(a)) {
                    this.f2069a.mo14228b().mo14037t().mo14693a("Cache still valid but referrer not found");
                } else {
                    long a2 = ((this.f2069a.mo14375F().f2580v.mo14368a() / 3600000) - 1) * 3600000;
                    Uri parse = Uri.parse(a);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String next : parse.getQueryParameterNames()) {
                        bundle2.putString(next, parse.getQueryParameter(next));
                    }
                    ((Bundle) pair.second).putLong("_cc", a2);
                    Object obj = pair.first;
                    this.f2069a.mo14377I().mo14570v(obj == null ? "app" : (String) obj, "_cmp", (Bundle) pair.second);
                }
                this.f2069a.mo14375F().f2579u.mo14427b((String) null);
            }
            this.f2069a.mo14375F().f2580v.mo14369b(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo14133c() {
        if (mo14134d() && mo14135e()) {
            this.f2069a.mo14375F().f2579u.mo14427b((String) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo14134d() {
        return this.f2069a.mo14375F().f2580v.mo14368a() > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo14135e() {
        return mo14134d() && this.f2069a.mo14229c().mo11029a() - this.f2069a.mo14375F().f2580v.mo14368a() > this.f2069a.mo14402z().mo14177r((String) null, C1727o3.f2420R);
    }
}
