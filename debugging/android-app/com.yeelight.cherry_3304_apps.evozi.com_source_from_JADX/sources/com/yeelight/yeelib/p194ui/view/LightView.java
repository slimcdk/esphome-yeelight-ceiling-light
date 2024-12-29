package com.yeelight.yeelib.p194ui.view;

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
    private int[] f19577a;

    /* renamed from: b */
    private float[] f19578b;

    /* renamed from: c */
    SweepGradient f19579c;

    /* renamed from: d */
    private Paint f19580d;

    public LightView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Random();
        m25273a();
    }

    /* renamed from: a */
    private void m25273a() {
        this.f19580d = new Paint();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        this.f19580d.setAntiAlias(true);
        int[] iArr = this.f19577a;
        if (iArr != null && iArr.length > 0) {
            getWidth();
            int width = getWidth() / 2;
            int[] iArr2 = this.f19577a;
            if (iArr2.length == 1) {
                this.f19580d.setColor(iArr2[0]);
                this.f19580d.setShader((Shader) null);
                f = (float) width;
            } else {
                f = (float) width;
                SweepGradient sweepGradient = new SweepGradient(f, f, this.f19577a, this.f19578b);
                this.f19579c = sweepGradient;
                this.f19580d.setShader(sweepGradient);
            }
            canvas.drawCircle(f, f, f, this.f19580d);
        }
        super.onDraw(canvas);
    }

    public void setColors(int[] iArr) {
        if (iArr != null) {
            this.f19577a = iArr;
            int i = 0;
            if (iArr.length > 1) {
                int[] iArr2 = new int[(iArr.length + 1)];
                this.f19577a = iArr2;
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                this.f19577a[iArr.length] = iArr[0];
            }
            this.f19578b = new float[this.f19577a.length];
            while (true) {
                int[] iArr3 = this.f19577a;
                if (i < iArr3.length) {
                    float[] fArr = this.f19578b;
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
