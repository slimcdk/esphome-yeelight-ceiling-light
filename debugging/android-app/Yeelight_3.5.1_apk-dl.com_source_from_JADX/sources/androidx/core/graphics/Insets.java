package androidx.core.graphics;

import android.graphics.Rect;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

public final class Insets {
    @NonNull
    public static final Insets NONE = new Insets(0, 0, 0, 0);
    public final int bottom;
    public final int left;
    public final int right;
    public final int top;

    @RequiresApi(29)
    static class Api29Impl {
        private Api29Impl() {
        }

        @DoNotInline
        /* renamed from: of */
        static android.graphics.Insets m29of(int i, int i2, int i3, int i4) {
            return android.graphics.Insets.of(i, i2, i3, i4);
        }
    }

    private Insets(int i, int i2, int i3, int i4) {
        this.left = i;
        this.top = i2;
        this.right = i3;
        this.bottom = i4;
    }

    @NonNull
    public static Insets add(@NonNull Insets insets, @NonNull Insets insets2) {
        return m27of(insets.left + insets2.left, insets.top + insets2.top, insets.right + insets2.right, insets.bottom + insets2.bottom);
    }

    @NonNull
    public static Insets max(@NonNull Insets insets, @NonNull Insets insets2) {
        return m27of(Math.max(insets.left, insets2.left), Math.max(insets.top, insets2.top), Math.max(insets.right, insets2.right), Math.max(insets.bottom, insets2.bottom));
    }

    @NonNull
    public static Insets min(@NonNull Insets insets, @NonNull Insets insets2) {
        return m27of(Math.min(insets.left, insets2.left), Math.min(insets.top, insets2.top), Math.min(insets.right, insets2.right), Math.min(insets.bottom, insets2.bottom));
    }

    @NonNull
    /* renamed from: of */
    public static Insets m27of(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? NONE : new Insets(i, i2, i3, i4);
    }

    @NonNull
    /* renamed from: of */
    public static Insets m28of(@NonNull Rect rect) {
        return m27of(rect.left, rect.top, rect.right, rect.bottom);
    }

    @NonNull
    public static Insets subtract(@NonNull Insets insets, @NonNull Insets insets2) {
        return m27of(insets.left - insets2.left, insets.top - insets2.top, insets.right - insets2.right, insets.bottom - insets2.bottom);
    }

    @RequiresApi(api = 29)
    @NonNull
    public static Insets toCompatInsets(@NonNull android.graphics.Insets insets) {
        return m27of(insets.left, insets.top, insets.right, insets.bottom);
    }

    @RequiresApi(api = 29)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @NonNull
    @Deprecated
    public static Insets wrap(@NonNull android.graphics.Insets insets) {
        return toCompatInsets(insets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Insets.class != obj.getClass()) {
            return false;
        }
        Insets insets = (Insets) obj;
        return this.bottom == insets.bottom && this.left == insets.left && this.right == insets.right && this.top == insets.top;
    }

    public int hashCode() {
        return (((((this.left * 31) + this.top) * 31) + this.right) * 31) + this.bottom;
    }

    @RequiresApi(29)
    @NonNull
    public android.graphics.Insets toPlatformInsets() {
        return Api29Impl.m29of(this.left, this.top, this.right, this.bottom);
    }

    @NonNull
    public String toString() {
        return "Insets{left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + '}';
    }
}
