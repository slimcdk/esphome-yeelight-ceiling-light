package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;

/* renamed from: com.google.android.gms.internal.measurement.f6 */
public final class C1092f6 {
    @GuardedBy("PhenotypeConstants.class")

    /* renamed from: a */
    private static final ArrayMap f1322a = new ArrayMap();

    /* renamed from: a */
    public static synchronized Uri m1948a(String str) {
        synchronized (C1092f6.class) {
            ArrayMap arrayMap = f1322a;
            Uri uri = (Uri) arrayMap.get("com.google.android.gms.measurement");
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
            arrayMap.put("com.google.android.gms.measurement", parse);
            return parse;
        }
    }
}
