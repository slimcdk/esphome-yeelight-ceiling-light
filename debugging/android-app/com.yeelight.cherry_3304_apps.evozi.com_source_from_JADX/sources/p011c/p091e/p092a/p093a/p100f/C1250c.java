package p011c.p091e.p092a.p093a.p100f;

import android.os.Bundle;

/* renamed from: c.e.a.a.f.c */
public final class C1250c {
    /* renamed from: a */
    public static String m3237a(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        try {
            return bundle.getString(str);
        } catch (Exception e) {
            C1249b.m3235b("MicroMsg.IntentUtil", "getStringExtra exception:" + e.getMessage());
            return null;
        }
    }
}
