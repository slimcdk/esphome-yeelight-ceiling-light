package com.google.p017ar.sceneform.rendering;

import androidx.annotation.ColorInt;
import com.google.android.filament.Colors;

/* renamed from: com.google.ar.sceneform.rendering.Color */
public class Color {
    private static final float INT_COLOR_SCALE = 0.003921569f;

    /* renamed from: a */
    public float f3285a;

    /* renamed from: b */
    public float f3286b;

    /* renamed from: g */
    public float f3287g;

    /* renamed from: r */
    public float f3288r;

    public Color() {
        setWhite();
    }

    public Color(float f, float f2, float f3) {
        set(f, f2, f3);
    }

    public Color(float f, float f2, float f3, float f4) {
        set(f, f2, f3, f4);
    }

    public Color(@ColorInt int i) {
        set(i);
    }

    public Color(Color color) {
        set(color);
    }

    private static float inverseTonemap(float f) {
        return (-0.155f * f) / (f - 1.019f);
    }

    private void setWhite() {
        set(1.0f, 1.0f, 1.0f);
    }

    public Color inverseTonemap() {
        Color color = new Color(this.f3288r, this.f3287g, this.f3286b, this.f3285a);
        color.f3288r = inverseTonemap(this.f3288r);
        color.f3287g = inverseTonemap(this.f3287g);
        color.f3286b = inverseTonemap(this.f3286b);
        return color;
    }

    public void set(float f, float f2, float f3) {
        set(f, f2, f3, 1.0f);
    }

    public void set(float f, float f2, float f3, float f4) {
        this.f3288r = Math.max(0.0f, Math.min(1.0f, f));
        this.f3287g = Math.max(0.0f, Math.min(1.0f, f2));
        this.f3286b = Math.max(0.0f, Math.min(1.0f, f3));
        this.f3285a = Math.max(0.0f, Math.min(1.0f, f4));
    }

    public void set(@ColorInt int i) {
        int red = android.graphics.Color.red(i);
        int green = android.graphics.Color.green(i);
        int blue = android.graphics.Color.blue(i);
        int alpha = android.graphics.Color.alpha(i);
        float[] linear = Colors.toLinear(Colors.RgbType.SRGB, ((float) red) * INT_COLOR_SCALE, ((float) green) * INT_COLOR_SCALE, ((float) blue) * INT_COLOR_SCALE);
        this.f3288r = linear[0];
        this.f3287g = linear[1];
        this.f3286b = linear[2];
        this.f3285a = ((float) alpha) * INT_COLOR_SCALE;
    }

    public void set(Color color) {
        set(color.f3288r, color.f3287g, color.f3286b, color.f3285a);
    }
}
