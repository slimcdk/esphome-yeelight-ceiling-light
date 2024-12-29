package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.util.Map;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.internal.measurement.x5 */
public final class C1375x5 {

    /* renamed from: a */
    private final Map f1705a;

    C1375x5(Map map) {
        this.f1705a = map;
    }

    @Nullable
    /* renamed from: a */
    public final String mo13494a(@Nullable Uri uri, @Nullable String str, @Nullable String str2, String str3) {
        if (uri == null) {
            return null;
        }
        Map map = (Map) this.f1705a.get(uri.toString());
        if (map == null) {
            return null;
        }
        return (String) map.get("".concat(String.valueOf(str3)));
    }
}
