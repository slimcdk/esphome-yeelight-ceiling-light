package com.google.android.gms.common.server.response;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C0914h;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.VisibleForTesting;

@ShowFirstParty
@KeepForSdk
public abstract class FastSafeParcelableJsonResponse extends FastJsonResponse implements SafeParcelable {
    @Nullable
    @VisibleForTesting
    /* renamed from: c */
    public Object mo12382c(@NonNull String str) {
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    @VisibleForTesting
    /* renamed from: e */
    public boolean mo12384e(@NonNull String str) {
        return false;
    }

    @KeepForSdk
    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        FastJsonResponse fastJsonResponse = (FastJsonResponse) obj;
        for (FastJsonResponse.Field next : mo12380a().values()) {
            if (mo12383d(next)) {
                if (!fastJsonResponse.mo12383d(next) || !C0914h.m1402a(mo12381b(next), fastJsonResponse.mo12381b(next))) {
                    return false;
                }
            } else if (fastJsonResponse.mo12383d(next)) {
                return false;
            }
        }
        return true;
    }

    @KeepForSdk
    public int hashCode() {
        int i = 0;
        for (FastJsonResponse.Field next : mo12380a().values()) {
            if (mo12383d(next)) {
                i = (i * 31) + C0917i.m1419j(mo12381b(next)).hashCode();
            }
        }
        return i;
    }
}
