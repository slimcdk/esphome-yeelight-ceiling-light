package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class ImageViewCompat {

    @RequiresApi(21)
    static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        static ColorStateList getImageTintList(ImageView imageView) {
            return imageView.getImageTintList();
        }

        @DoNotInline
        static PorterDuff.Mode getImageTintMode(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        @DoNotInline
        static void setImageTintList(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        @DoNotInline
        static void setImageTintMode(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }

    private ImageViewCompat() {
    }

    @Nullable
    public static ColorStateList getImageTintList(@NonNull ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return Api21Impl.getImageTintList(imageView);
        }
        if (imageView instanceof TintableImageSourceView) {
            return ((TintableImageSourceView) imageView).getSupportImageTintList();
        }
        return null;
    }

    @Nullable
    public static PorterDuff.Mode getImageTintMode(@NonNull ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return Api21Impl.getImageTintMode(imageView);
        }
        if (imageView instanceof TintableImageSourceView) {
            return ((TintableImageSourceView) imageView).getSupportImageTintMode();
        }
        return null;
    }

    public static void setImageTintList(@NonNull ImageView imageView, @Nullable ColorStateList colorStateList) {
        Drawable drawable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            Api21Impl.setImageTintList(imageView, colorStateList);
            if (i == 21 && (drawable = imageView.getDrawable()) != null && Api21Impl.getImageTintList(imageView) != null) {
                if (drawable.isStateful()) {
                    drawable.setState(imageView.getDrawableState());
                }
                imageView.setImageDrawable(drawable);
            }
        } else if (imageView instanceof TintableImageSourceView) {
            ((TintableImageSourceView) imageView).setSupportImageTintList(colorStateList);
        }
    }

    public static void setImageTintMode(@NonNull ImageView imageView, @Nullable PorterDuff.Mode mode) {
        Drawable drawable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            Api21Impl.setImageTintMode(imageView, mode);
            if (i == 21 && (drawable = imageView.getDrawable()) != null && Api21Impl.getImageTintList(imageView) != null) {
                if (drawable.isStateful()) {
                    drawable.setState(imageView.getDrawableState());
                }
                imageView.setImageDrawable(drawable);
            }
        } else if (imageView instanceof TintableImageSourceView) {
            ((TintableImageSourceView) imageView).setSupportImageTintMode(mode);
        }
    }
}
