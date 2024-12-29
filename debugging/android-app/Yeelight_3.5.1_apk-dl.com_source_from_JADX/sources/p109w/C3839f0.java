package p109w;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0914h;
import com.google.android.gms.common.internal.C0917i;

/* renamed from: w.f0 */
public final class C3839f0 {

    /* renamed from: f */
    private static final Uri f6457f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    @Nullable

    /* renamed from: a */
    private final String f6458a;
    @Nullable

    /* renamed from: b */
    private final String f6459b;
    @Nullable

    /* renamed from: c */
    private final ComponentName f6460c = null;

    /* renamed from: d */
    private final int f6461d;

    /* renamed from: e */
    private final boolean f6462e;

    public C3839f0(String str, String str2, int i, boolean z) {
        C0917i.m1415f(str);
        this.f6458a = str;
        C0917i.m1415f(str2);
        this.f6459b = str2;
        this.f6461d = i;
        this.f6462e = z;
    }

    /* renamed from: a */
    public final int mo26310a() {
        return this.f6461d;
    }

    @Nullable
    /* renamed from: b */
    public final ComponentName mo26311b() {
        return this.f6460c;
    }

    /* renamed from: c */
    public final Intent mo26312c(Context context) {
        Bundle bundle;
        if (this.f6458a == null) {
            return new Intent().setComponent(this.f6460c);
        }
        Intent intent = null;
        if (this.f6462e) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", this.f6458a);
            try {
                bundle = context.getContentResolver().call(f6457f, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e) {
                "Dynamic intent resolution failed: ".concat(e.toString());
                bundle = null;
            }
            if (bundle != null) {
                intent = (Intent) bundle.getParcelable("serviceResponseIntentKey");
            }
            if (intent == null) {
                "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.f6458a));
            }
        }
        return intent != null ? intent : new Intent(this.f6458a).setPackage(this.f6459b);
    }

    @Nullable
    /* renamed from: d */
    public final String mo26313d() {
        return this.f6459b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3839f0)) {
            return false;
        }
        C3839f0 f0Var = (C3839f0) obj;
        return C0914h.m1402a(this.f6458a, f0Var.f6458a) && C0914h.m1402a(this.f6459b, f0Var.f6459b) && C0914h.m1402a(this.f6460c, f0Var.f6460c) && this.f6461d == f0Var.f6461d && this.f6462e == f0Var.f6462e;
    }

    public final int hashCode() {
        return C0914h.m1403b(this.f6458a, this.f6459b, this.f6460c, Integer.valueOf(this.f6461d), Boolean.valueOf(this.f6462e));
    }

    public final String toString() {
        String str = this.f6458a;
        if (str != null) {
            return str;
        }
        C0917i.m1419j(this.f6460c);
        return this.f6460c.flattenToString();
    }
}
