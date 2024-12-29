package com.yeelight.yeelib.p142ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import java.util.Random;

/* renamed from: com.yeelight.yeelib.ui.view.LightView */
public class LightView extends View {

    /* renamed from: a */
    private int[] f15835a;

    /* renamed from: b */
    private float[] f15836b;

    /* renamed from: c */
    SweepGradient f15837c;

    /* renamed from: d */
    private Paint f15838d;

    public LightView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Random();
        m20884a();
    }

    /* renamed from: a */
    private void m20884a() {
        this.f15838d = new Paint();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        this.f15838d.setAntiAlias(true);
        int[] iArr = this.f15835a;
        if (iArr != null && iArr.length > 0) {
            getWidth();
            int width = getWidth() / 2;
            int[] iArr2 = this.f15835a;
            if (iArr2.length == 1) {
                this.f15838d.setColor(iArr2[0]);
                this.f15838d.setShader((Shader) null);
                f = (float) width;
            } else {
                f = (float) width;
                SweepGradient sweepGradient = new SweepGradient(f, f, this.f15835a, this.f15836b);
                this.f15837c = sweepGradient;
                this.f15838d.setShader(sweepGradient);
            }
            canvas.drawCircle(f, f, f, this.f15838d);
        }
        super.onDraw(canvas);
    }

    public void setColors(int[] iArr) {
        if (iArr != null) {
            this.f15835a = iArr;
            int i = 0;
            if (iArr.length > 1) {
                int[] iArr2 = new int[(iArr.length + 1)];
                this.f15835a = iArr2;
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                this.f15835a[iArr.length] = iArr[0];
            }
            this.f15836b = new float[this.f15835a.length];
            while (true) {
                int[] iArr3 = this.f15835a;
                if (i < iArr3.length) {
                    float[] fArr = this.f15836b;
                    float length = 1.0f / ((float) iArr3.length);
                    int i2 = i + 1;
                    fArr[i] = length * ((float) i2);
                    i = i2;
                } else {
                    invalidate();
                    return;
                }
            }
        }
    }
}
