package android.support.p004v4.graphics.drawable;

import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: android.support.v4.graphics.drawable.IconCompatParcelizer */
public final class IconCompatParcelizer extends androidx.core.graphics.drawable.IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel) {
        return androidx.core.graphics.drawable.IconCompatParcelizer.read(versionedParcel);
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        androidx.core.graphics.drawable.IconCompatParcelizer.write(iconCompat, versionedParcel);
    }
}
