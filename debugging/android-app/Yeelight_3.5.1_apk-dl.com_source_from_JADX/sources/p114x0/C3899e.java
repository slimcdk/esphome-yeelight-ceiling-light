package p114x0;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;
import p106v0.C3730a;
import p118y0.C3916f;
import p121z0.C3924b;

/* renamed from: x0.e */
class C3899e implements C3730a.C3732b {

    /* renamed from: a */
    private C3924b f6537a;

    /* renamed from: b */
    private C3924b f6538b;

    C3899e() {
    }

    /* renamed from: b */
    private static void m11141b(@Nullable C3924b bVar, @NonNull String str, @NonNull Bundle bundle) {
        if (bVar != null) {
            bVar.onEvent(str, bundle);
        }
    }

    /* renamed from: c */
    private void m11142c(@NonNull String str, @NonNull Bundle bundle) {
        m11141b("clx".equals(bundle.getString("_o")) ? this.f6537a : this.f6538b, str, bundle);
    }

    /* renamed from: a */
    public void mo26157a(int i, @Nullable Bundle bundle) {
        String string;
        C3916f.m11190f().mo26405i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", new Object[]{Integer.valueOf(i), bundle}));
        if (bundle != null && (string = bundle.getString("name")) != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            m11142c(string, bundle2);
        }
    }

    /* renamed from: d */
    public void mo26382d(@Nullable C3924b bVar) {
        this.f6538b = bVar;
    }

    /* renamed from: e */
    public void mo26383e(@Nullable C3924b bVar) {
        this.f6537a = bVar;
    }
}
