package androidx.core.view.animation;

import android.graphics.Path;
import android.os.Build;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

public final class PathInterpolatorCompat {

    @RequiresApi(21)
    static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        static PathInterpolator createPathInterpolator(float f, float f2) {
            return new PathInterpolator(f, f2);
        }

        @DoNotInline
        static PathInterpolator createPathInterpolator(float f, float f2, float f3, float f4) {
            return new PathInterpolator(f, f2, f3, f4);
        }

        @DoNotInline
        static PathInterpolator createPathInterpolator(Path path) {
            return new PathInterpolator(path);
        }
    }

    private PathInterpolatorCompat() {
    }

    @NonNull
    public static Interpolator create(float f, float f2) {
        return Build.VERSION.SDK_INT >= 21 ? Api21Impl.createPathInterpolator(f, f2) : new PathInterpolatorApi14(f, f2);
    }

    @NonNull
    public static Interpolator create(float f, float f2, float f3, float f4) {
        return Build.VERSION.SDK_INT >= 21 ? Api21Impl.createPathInterpolator(f, f2, f3, f4) : new PathInterpolatorApi14(f, f2, f3, f4);
    }

    @NonNull
    public static Interpolator create(@NonNull Path path) {
        return Build.VERSION.SDK_INT >= 21 ? Api21Impl.createPathInterpolator(path) : new PathInterpolatorApi14(path);
    }
}
