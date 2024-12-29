package p011c.p012a.p019b.p028b.p029a.p030a;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.C1533g;

/* renamed from: c.a.b.b.a.a.c */
public final class C0560c {

    /* renamed from: a */
    private SharedPreferences f225a;

    public C0560c(Context context) {
        try {
            Context d = C1533g.m4151d(context);
            this.f225a = d == null ? null : d.getSharedPreferences("google_ads_flags", 0);
        } catch (Throwable unused) {
            this.f225a = null;
        }
    }

    /* renamed from: a */
    public final boolean mo8537a(String str, boolean z) {
        try {
            if (this.f225a == null) {
                return false;
            }
            return this.f225a.getBoolean(str, false);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final float mo8538b(String str, float f) {
        try {
            if (this.f225a == null) {
                return 0.0f;
            }
            return this.f225a.getFloat(str, 0.0f);
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final String mo8539c(String str, String str2) {
        try {
            return this.f225a == null ? str2 : this.f225a.getString(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }
}
