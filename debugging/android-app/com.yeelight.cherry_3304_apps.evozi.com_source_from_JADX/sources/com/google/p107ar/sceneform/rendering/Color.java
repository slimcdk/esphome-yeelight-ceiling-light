package com.google.p107ar.sceneform.rendering;

import androidx.annotation.ColorInt;
import com.google.android.filament.Colors;

/* renamed from: com.google.ar.sceneform.rendering.Color */
public class Color {
    private static final float INT_COLOR_SCALE = 0.003921569f;

    /* renamed from: a */
    public float f5210a;

    /* renamed from: b */
    public float f5211b;

    /* renamed from: g */
    public float f5212g;

    /* renamed from: r */
    public float f5213r;

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
        Color color = new Color(this.f5213r, this.f5212g, this.f5211b, this.f5210a);
        color.f5213r = inverseTonemap(this.f5213r);
        color.f5212g = inverseTonemap(this.f5212g);
        color.f5211b = inverseTonemap(this.f5211b);
        return color;
    }

    public void set(float f, float f2, float f3) {
        set(f, f2, f3, 1.0f);
    }

    public void set(float f, float f2, float f3, float f4) {
        this.f5213r = Math.max(0.0f, Math.min(1.0f, f));
        this.f5212g = Math.max(0.0f, Math.min(1.0f, f2));
        this.f5211b = Math.max(0.0f, Math.min(1.0f, f3));
        this.f5210a = Math.max(0.0f, Math.min(1.0f, f4));
    }

    public void set(@ColorInt int i) {
        int red = android.graphics.Color.red(i);
        int green = android.graphics.Color.green(i);
        int blue = android.graphics.Color.blue(i);
        int alpha = android.graphics.Color.alpha(i);
        float[] linear = Colors.toLinear(Colors.RgbType.SRGB, ((float) red) * INT_COLOR_SCALE, ((float) green) * INT_COLOR_SCALE, ((float) blue) * INT_COLOR_SCALE);
        this.f5213r = linear[0];
        this.f5212g = linear[1];
        this.f5211b = linear[2];
        this.f5210a = ((float) alpha) * INT_COLOR_SCALE;
    }

    public void set(Color color) {
        set(color.f5213r, color.f5212g, color.f5211b, color.f5210a);
    }
}
