package com.yeelight.cherry.p141ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import java.io.PrintStream;

/* renamed from: com.yeelight.cherry.ui.view.CherrySearchCircleView */
public class CherrySearchCircleView extends View {

    /* renamed from: a */
    private int f12180a;

    /* renamed from: b */
    private Paint f12181b;

    /* renamed from: c */
    private int f12182c;

    /* renamed from: d */
    private int f12183d;

    /* renamed from: e */
    private float f12184e;

    /* renamed from: com.yeelight.cherry.ui.view.CherrySearchCircleView$a */
    class C6023a implements Runnable {
        C6023a() {
        }

        public void run() {
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, (float) (CherrySearchCircleView.this.getWidth() / 2), (float) (CherrySearchCircleView.this.getHeight() / 2));
            PrintStream printStream = System.out;
            printStream.println("!!!!!!!! getwidth = " + CherrySearchCircleView.this.getWidth() + " getheight = " + CherrySearchCircleView.this.getHeight());
            rotateAnimation.setRepeatCount(-1);
            rotateAnimation.setDuration(1600);
            rotateAnimation.setInterpolator(new LinearInterpolator());
            CherrySearchCircleView.this.startAnimation(rotateAnimation);
        }
    }

    public CherrySearchCircleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CherrySearchCircleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m17530a();
    }

    /* renamed from: a */
    private void m17530a() {
        int i = getResources().getDisplayMetrics().widthPixels;
        this.f12180a = i;
        float f = ((float) i) / 1080.0f;
        this.f12184e = f;
        double d = (double) i;
        Double.isNaN(d);
        double d2 = (double) f;
        Double.isNaN(d2);
        int i2 = (int) (d * 0.481d * d2);
        this.f12182c = i2;
        if (i2 % 2 != 0) {
            this.f12182c = i2 + 1;
        }
        new Path();
        Paint paint = new Paint();
        this.f12181b = paint;
        paint.setAlpha(80);
        this.f12181b.setAntiAlias(true);
        this.f12181b.setStyle(Paint.Style.STROKE);
        this.f12181b.setColor(-1);
    }

    /* renamed from: b */
    public void mo31362b() {
        new Handler(Looper.getMainLooper()).postDelayed(new C6023a(), (long) (getWidth() == 0 ? 200 : 1));
    }

    /* renamed from: c */
    public void mo31363c() {
        clearAnimation();
    }

    public int getType() {
        return this.f12183d;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        Paint paint;
        super.onDraw(canvas);
        if (this.f12183d == 1) {
            this.f12181b.setAlpha(255);
            double d = (double) this.f12180a;
            Double.isNaN(d);
            int i = (int) (d * 0.55d);
            this.f12182c = i;
            if (i % 2 == 1) {
                this.f12182c = i + 1;
            }
            this.f12181b.setShader(new SweepGradient((float) (getWidth() / 2), (float) (getHeight() / 2), new int[]{1090519039, -520093697}, (float[]) null));
            paint = this.f12181b;
            f = 2.0f;
        } else {
            this.f12181b.setAlpha(80);
            double d2 = (double) this.f12180a;
            Double.isNaN(d2);
            this.f12182c = (int) (d2 * 0.51d);
            this.f12181b.setShader((Shader) null);
            paint = this.f12181b;
            f = 1.0f;
        }
        paint.setStrokeWidth(TypedValue.applyDimension(1, f, getResources().getDisplayMetrics()));
        canvas.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), (float) (this.f12182c / 2), this.f12181b);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i);
    }

    public void setType(int i) {
        this.f12183d = i;
        invalidate();
    }
}
