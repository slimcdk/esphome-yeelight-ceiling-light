package p185m4;

import android.content.Intent;
import android.os.Bundle;

/* renamed from: m4.a */
public final class C9547a {
    /* renamed from: a */
    public static boolean m23216a(Intent intent) {
        if (intent == null) {
            return false;
        }
        return m23217b(intent.getExtras());
    }

    /* renamed from: b */
    public static boolean m23217b(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        try {
            bundle.containsKey((String) null);
            return false;
        } catch (Exception unused) {
            bundle.clear();
            return true;
        }
    }
}
