package p182l4;

import android.content.Context;

/* renamed from: l4.a */
public final class C9529a {
    /* renamed from: a */
    public static int m23178a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (UnsupportedOperationException unused) {
            return 1;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
