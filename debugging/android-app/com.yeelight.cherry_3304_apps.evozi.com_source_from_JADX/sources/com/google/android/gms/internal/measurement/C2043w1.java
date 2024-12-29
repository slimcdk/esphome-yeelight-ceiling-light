package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;

/* renamed from: com.google.android.gms.internal.measurement.w1 */
public final class C2043w1 {
    @GuardedBy("PhenotypeConstants.class")

    /* renamed from: a */
    private static final ArrayMap<String, Uri> f3799a = new ArrayMap<>();

    /* renamed from: a */
    public static synchronized Uri m6255a(String str) {
        Uri uri;
        synchronized (C2043w1.class) {
            uri = f3799a.get(str);
            if (uri == null) {
                String valueOf = String.valueOf(Uri.encode(str));
                uri = Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/"));
                f3799a.put(str, uri);
            }
        }
        return uri;
    }
}
