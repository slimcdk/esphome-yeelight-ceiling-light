package com.google.android.material.canvas;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class CanvasCompat {
    private CanvasCompat() {
    }

    public static int saveLayerAlpha(Canvas canvas, float f, float f2, float f3, float f4, int i) {
        return Build.VERSION.SDK_INT > 21 ? canvas.saveLayerAlpha(f, f2, f3, f4, i) : canvas.saveLayerAlpha(f, f2, f3, f4, i, 31);
    }

    public static int saveLayerAlpha(Canvas canvas, RectF rectF, int i) {
        return Build.VERSION.SDK_INT > 21 ? canvas.saveLayerAlpha(rectF, i) : canvas.saveLayerAlpha(rectF, i, 31);
    }
}
