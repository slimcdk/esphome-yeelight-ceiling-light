package p181l3;

import android.os.Bundle;

/* renamed from: l3.c */
public final class C9524c {
    /* renamed from: a */
    public static String m23174a(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        try {
            return bundle.getString(str);
        } catch (Exception e) {
            C9523b.m23172b("MicroMsg.IntentUtil", "getStringExtra exception:" + e.getMessage());
            return null;
        }
    }
}
