package androidx.core.location;

import android.location.Location;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* renamed from: androidx.core.location.a */
public final /* synthetic */ class C0248a {
    /* renamed from: a */
    public static void m48a(LocationListenerCompat locationListenerCompat, int i) {
    }

    /* renamed from: b */
    public static void m49b(@NonNull LocationListenerCompat locationListenerCompat, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            locationListenerCompat.onLocationChanged((Location) list.get(i));
        }
    }

    /* renamed from: c */
    public static void m50c(@NonNull LocationListenerCompat locationListenerCompat, String str) {
    }

    /* renamed from: d */
    public static void m51d(@NonNull LocationListenerCompat locationListenerCompat, String str) {
    }

    /* renamed from: e */
    public static void m52e(@NonNull LocationListenerCompat locationListenerCompat, String str, @Nullable int i, Bundle bundle) {
    }
}
