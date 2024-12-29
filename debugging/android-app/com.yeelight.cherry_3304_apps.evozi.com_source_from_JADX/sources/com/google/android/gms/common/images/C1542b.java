package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.common.internal.C1599s;

/* renamed from: com.google.android.gms.common.images.b */
final class C1542b {

    /* renamed from: a */
    public final Uri f2934a;

    public C1542b(Uri uri) {
        this.f2934a = uri;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1542b)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return C1599s.m4388a(((C1542b) obj).f2934a, this.f2934a);
    }

    public final int hashCode() {
        return C1599s.m4389b(this.f2934a);
    }
}
