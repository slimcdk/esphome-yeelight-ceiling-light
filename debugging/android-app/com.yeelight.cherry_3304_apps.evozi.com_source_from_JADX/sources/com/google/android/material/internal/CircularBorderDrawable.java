package com.google.android.material.internal;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class CircularBorderDrawable extends Drawable {
    private static final float DRAW_STROKE_WIDTH_MULTIPLE = 1.3333f;
    private ColorStateList borderTint;
    @Dimension
    float borderWidth;
    @ColorInt
    private int bottomInnerStrokeColor;
    @ColorInt
    private int bottomOuterStrokeColor;
    @ColorInt
    private int currentBorderTintColor;
    private boolean invalidateShader = true;
    final Paint paint;
    final Rect rect = new Rect();
    final RectF rectF = new RectF();
    @FloatRange(from = 0.0d, mo599to = 360.0d)
    private float rotation;
    final CircularBorderState state = new CircularBorderState();
    @ColorInt
    private int topInnerStrokeColor;
    @ColorInt
    private int topOuterStrokeColor;

    private class CircularBorderState extends Drawable.ConstantState {
        private CircularBorderState() {
        }

        public int getChangingConfigurations() {
            return 0;
        }

        @NonNull
        public Drawable newDrawable() {
            return CircularBorderDrawable.this;
        }
    }

    public CircularBorderDrawable() {
        Paint paint2 = new Paint(1);
        this.paint = paint2;
        paint2.setStyle(Paint.Style.STROKE);
    }

    private Shader createGradientShader() {
        Rect rect2 = this.rect;
        copyBounds(rect2);
        float height = this.borderWidth / ((float) rect2.height());
        return new LinearGradient(0.0f, (float) rect2.top, 0.0f, (float) rect2.bottom, new int[]{ColorUtils.compositeColors(this.topOuterStrokeColor, this.currentBorderTintColor), ColorUtils.compositeColors(this.topInnerStrokeColor, this.currentBorderTintColor), ColorUtils.compositeColors(ColorUtils.setAlphaComponent(this.topInnerStrokeColor, 0), this.currentBorderTintColor), ColorUtils.compositeColors(ColorUtils.setAlphaComponent(this.bottomInnerStrokeColor, 0), this.currentBorderTintColor), ColorUtils.compositeColors(this.bottomInnerStrokeColor, this.currentBorderTintColor), ColorUtils.compositeColors(this.bottomOuterStrokeColor, this.currentBorderTintColor)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP);
    }

    public void draw(Canvas canvas) {
        if (this.invalidateShader) {
            this.paint.setShader(createGradientShader());
            this.invalidateShader = false;
        }
        float strokeWidth = this.paint.getStrokeWidth() / 2.0f;
        RectF rectF2 = this.rectF;
        copyBounds(this.rect);
        rectF2.set(this.rect);
        rectF2.left += strokeWidth;
        rectF2.top += strokeWidth;
        rectF2.right -= strokeWidth;
        rectF2.bottom -= strokeWidth;
        canvas.save();
        canvas.rotate(this.rotation, rectF2.centerX(), rectF2.centerY());
        canvas.drawOval(rectF2, this.paint);
        canvas.restore();
    }

    @Nullable
    public Drawable.ConstantState getConstantState() {
        return this.state;
    }

    public int getOpacity() {
        return this.borderWidth > 0.0f ? -3 : -2;
    }

    public boolean getPadding(Rect rect2) {
        int round = Math.round(this.borderWidth);
        rect2.set(round, round, round, round);
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.borderTint;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect2) {
        this.invalidateShader = true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.borderTint;
        if (!(colorStateList == null || (colorForState = colorStateList.getColorForState(iArr, this.currentBorderTintColor)) == this.currentBorderTintColor)) {
            this.invalidateShader = true;
            this.currentBorderTintColor = colorForState;
        }
        if (this.invalidateShader) {
            invalidateSelf();
        }
        return this.invalidateShader;
    }

    public void setAlpha(@IntRange(from = 0, mo617to = 255) int i) {
        this.paint.setAlpha(i);
        invalidateSelf();
    }

    public void setBorderTint(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.currentBorderTintColor = colorStateList.getColorForState(getState(), this.currentBorderTintColor);
        }
        this.borderTint = colorStateList;
        this.invalidateShader = true;
        invalidateSelf();
    }

    public void setBorderWidth(@Dimension float f) {
        if (this.borderWidth != f) {
            this.borderWidth = f;
            this.paint.setStrokeWidth(f * DRAW_STROKE_WIDTH_MULTIPLE);
            this.invalidateShader = true;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setGradientColors(@ColorInt int i, @ColorInt int i2, @ColorInt int i3, @ColorInt int i4) {
        this.topOuterStrokeColor = i;
        this.topInnerStrokeColor = i2;
        this.bottomOuterStrokeColor = i3;
        this.bottomInnerStrokeColor = i4;
    }

    public final void setRotation(float f) {
        if (f != this.rotation) {
            this.rotation = f;
            invalidateSelf();
        }
    }
}
