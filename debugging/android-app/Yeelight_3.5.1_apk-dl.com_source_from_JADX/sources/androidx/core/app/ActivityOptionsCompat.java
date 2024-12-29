package androidx.core.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class ActivityOptionsCompat {
    public static final String EXTRA_USAGE_TIME_REPORT = "android.activity.usage_time";
    public static final String EXTRA_USAGE_TIME_REPORT_PACKAGES = "android.usage_time_packages";

    @RequiresApi(16)
    private static class ActivityOptionsCompatImpl extends ActivityOptionsCompat {
        private final ActivityOptions mActivityOptions;

        ActivityOptionsCompatImpl(ActivityOptions activityOptions) {
            this.mActivityOptions = activityOptions;
        }

        public Rect getLaunchBounds() {
            if (Build.VERSION.SDK_INT < 24) {
                return null;
            }
            return Api24Impl.getLaunchBounds(this.mActivityOptions);
        }

        public void requestUsageTimeReport(@NonNull PendingIntent pendingIntent) {
            if (Build.VERSION.SDK_INT >= 23) {
                Api23Impl.requestUsageTimeReport(this.mActivityOptions, pendingIntent);
            }
        }

        @NonNull
        public ActivityOptionsCompat setLaunchBounds(@Nullable Rect rect) {
            return Build.VERSION.SDK_INT < 24 ? this : new ActivityOptionsCompatImpl(Api24Impl.setLaunchBounds(this.mActivityOptions, rect));
        }

        public Bundle toBundle() {
            return this.mActivityOptions.toBundle();
        }

        public void update(@NonNull ActivityOptionsCompat activityOptionsCompat) {
            if (activityOptionsCompat instanceof ActivityOptionsCompatImpl) {
                this.mActivityOptions.update(((ActivityOptionsCompatImpl) activityOptionsCompat).mActivityOptions);
            }
        }
    }

    @RequiresApi(16)
    static class Api16Impl {
        private Api16Impl() {
        }

        @DoNotInline
        static ActivityOptions makeCustomAnimation(Context context, int i, int i2) {
            return ActivityOptions.makeCustomAnimation(context, i, i2);
        }

        @DoNotInline
        static ActivityOptions makeScaleUpAnimation(View view, int i, int i2, int i3, int i4) {
            return ActivityOptions.makeScaleUpAnimation(view, i, i2, i3, i4);
        }

        @DoNotInline
        static ActivityOptions makeThumbnailScaleUpAnimation(View view, Bitmap bitmap, int i, int i2) {
            return ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i, i2);
        }
    }

    @RequiresApi(21)
    static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        static ActivityOptions makeSceneTransitionAnimation(Activity activity, View view, String str) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, view, str);
        }

        @DoNotInline
        @SafeVarargs
        static ActivityOptions makeSceneTransitionAnimation(Activity activity, Pair<View, String>... pairArr) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, pairArr);
        }

        @DoNotInline
        static ActivityOptions makeTaskLaunchBehind() {
            return ActivityOptions.makeTaskLaunchBehind();
        }
    }

    @RequiresApi(23)
    static class Api23Impl {
        private Api23Impl() {
        }

        @DoNotInline
        static ActivityOptions makeBasic() {
            return ActivityOptions.makeBasic();
        }

        @DoNotInline
        static ActivityOptions makeClipRevealAnimation(View view, int i, int i2, int i3, int i4) {
            return ActivityOptions.makeClipRevealAnimation(view, i, i2, i3, i4);
        }

        @DoNotInline
        static void requestUsageTimeReport(ActivityOptions activityOptions, PendingIntent pendingIntent) {
            activityOptions.requestUsageTimeReport(pendingIntent);
        }
    }

    @RequiresApi(24)
    static class Api24Impl {
        private Api24Impl() {
        }

        @DoNotInline
        static Rect getLaunchBounds(ActivityOptions activityOptions) {
            return activityOptions.getLaunchBounds();
        }

        @DoNotInline
        static ActivityOptions setLaunchBounds(ActivityOptions activityOptions, Rect rect) {
            return activityOptions.setLaunchBounds(rect);
        }
    }

    protected ActivityOptionsCompat() {
    }

    @NonNull
    public static ActivityOptionsCompat makeBasic() {
        return Build.VERSION.SDK_INT >= 23 ? new ActivityOptionsCompatImpl(Api23Impl.makeBasic()) : new ActivityOptionsCompat();
    }

    @NonNull
    public static ActivityOptionsCompat makeClipRevealAnimation(@NonNull View view, int i, int i2, int i3, int i4) {
        return Build.VERSION.SDK_INT >= 23 ? new ActivityOptionsCompatImpl(Api23Impl.makeClipRevealAnimation(view, i, i2, i3, i4)) : new ActivityOptionsCompat();
    }

    @NonNull
    public static ActivityOptionsCompat makeCustomAnimation(@NonNull Context context, int i, int i2) {
        return Build.VERSION.SDK_INT >= 16 ? new ActivityOptionsCompatImpl(Api16Impl.makeCustomAnimation(context, i, i2)) : new ActivityOptionsCompat();
    }

    @NonNull
    public static ActivityOptionsCompat makeScaleUpAnimation(@NonNull View view, int i, int i2, int i3, int i4) {
        return Build.VERSION.SDK_INT >= 16 ? new ActivityOptionsCompatImpl(Api16Impl.makeScaleUpAnimation(view, i, i2, i3, i4)) : new ActivityOptionsCompat();
    }

    @NonNull
    public static ActivityOptionsCompat makeSceneTransitionAnimation(@NonNull Activity activity, @NonNull View view, @NonNull String str) {
        return Build.VERSION.SDK_INT >= 21 ? new ActivityOptionsCompatImpl(Api21Impl.makeSceneTransitionAnimation(activity, view, str)) : new ActivityOptionsCompat();
    }

    @NonNull
    public static ActivityOptionsCompat makeSceneTransitionAnimation(@NonNull Activity activity, @Nullable androidx.core.util.Pair<View, String>... pairArr) {
        if (Build.VERSION.SDK_INT < 21) {
            return new ActivityOptionsCompat();
        }
        Pair[] pairArr2 = null;
        if (pairArr != null) {
            pairArr2 = new Pair[pairArr.length];
            for (int i = 0; i < pairArr.length; i++) {
                pairArr2[i] = Pair.create((View) pairArr[i].first, (String) pairArr[i].second);
            }
        }
        return new ActivityOptionsCompatImpl(Api21Impl.makeSceneTransitionAnimation(activity, pairArr2));
    }

    @NonNull
    public static ActivityOptionsCompat makeTaskLaunchBehind() {
        return Build.VERSION.SDK_INT >= 21 ? new ActivityOptionsCompatImpl(Api21Impl.makeTaskLaunchBehind()) : new ActivityOptionsCompat();
    }

    @NonNull
    public static ActivityOptionsCompat makeThumbnailScaleUpAnimation(@NonNull View view, @NonNull Bitmap bitmap, int i, int i2) {
        return Build.VERSION.SDK_INT >= 16 ? new ActivityOptionsCompatImpl(Api16Impl.makeThumbnailScaleUpAnimation(view, bitmap, i, i2)) : new ActivityOptionsCompat();
    }

    @Nullable
    public Rect getLaunchBounds() {
        return null;
    }

    public void requestUsageTimeReport(@NonNull PendingIntent pendingIntent) {
    }

    @NonNull
    public ActivityOptionsCompat setLaunchBounds(@Nullable Rect rect) {
        return this;
    }

    @Nullable
    public Bundle toBundle() {
        return null;
    }

    public void update(@NonNull ActivityOptionsCompat activityOptionsCompat) {
    }
}
