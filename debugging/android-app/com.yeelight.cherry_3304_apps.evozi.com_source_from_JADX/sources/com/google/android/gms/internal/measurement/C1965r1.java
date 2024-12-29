package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.util.Map;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.internal.measurement.r1 */
public final class C1965r1 {

    /* renamed from: a */
    private final Map<String, Map<String, String>> f3693a;

    C1965r1(Map<String, Map<String, String>> map) {
        this.f3693a = map;
    }

    @Nullable
    /* renamed from: a */
    public final String mo11977a(@Nullable Uri uri, @Nullable String str, @Nullable String str2, String str3) {
        if (uri != null) {
            str = uri.toString();
        } else if (str == null) {
            return null;
        }
        Map map = this.f3693a.get(str);
        if (map == null) {
            return null;
        }
        if (str2 != null) {
            String valueOf = String.valueOf(str2);
            String valueOf2 = String.valueOf(str3);
            str3 = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        return (String) map.get(str3);
    }
}
