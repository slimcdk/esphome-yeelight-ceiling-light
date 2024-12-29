package com.yeelight.yeelib.p142ui.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.widget.Key;
import androidx.core.internal.view.SupportMenu;

/* renamed from: com.yeelight.yeelib.ui.view.ConnectCircleView */
public class ConnectCircleView extends View {

    /* renamed from: a */
    private Paint f15693a;

    /* renamed from: b */
    private Paint f15694b;

    /* renamed from: c */
    private int f15695c = 0;

    /* renamed from: d */
    private SweepGradient f15696d;

    /* renamed from: e */
    private ObjectAnimator f15697e;

    /* renamed from: f */
    private boolean f15698f = false;

    public ConnectCircleView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m20747a();
    }

    /* renamed from: a */
    private void m20747a() {
        this.f15693a = new Paint();
        this.f15694b = new Paint();
        this.f15693a.setAntiAlias(true);
        this.f15695c = getResources().getDisplayMetrics().widthPixels;
        int i = this.f15695c;
        new RectF((float) (i / 7), (float) (i / 7), (float) ((i * 6) / 7), (float) ((i * 6) / 7));
        int i2 = this.f15695c;
        this.f15696d = new SweepGradient((float) (i2 / 2), (float) (i2 / 2), new int[]{Color.parseColor("#03ff0000"), Color.parseColor("#20ff0000"), Color.parseColor("#60ff0000"), -65536}, (float[]) null);
        this.f15694b.setAntiAlias(true);
        setLayerType(1, this.f15693a);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, Key.ROTATION, new float[]{0.0f, 359.0f});
        this.f15697e = ofFloat;
        ofFloat.setInterpolator(new LinearInterpolator());
        this.f15697e.setDuration(1500);
        this.f15697e.setRepeatMode(1);
        this.f15697e.setRepeatCount(-1);
        this.f15697e.start();
    }

    /* renamed from: b */
    public void mo36218b() {
        this.f15697e.start();
    }

    /* renamed from: c */
    public void mo36219c() {
        this.f15697e.cancel();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        SweepGradient sweepGradient;
        Paint paint;
        super.onDraw(canvas);
        this.f15694b.setStyle(Paint.Style.STROKE);
        this.f15694b.setColor(SupportMenu.CATEGORY_MASK);
        this.f15694b.setStrokeWidth(10.0f);
        if (!this.f15698f) {
            paint = this.f15694b;
            sweepGradient = this.f15696d;
        } else {
            paint = this.f15694b;
            sweepGradient = null;
        }
        paint.setShader(sweepGradient);
        int i = this.f15695c;
        canvas.drawCircle((float) (i / 2), (float) (i / 2), ((float) i) * 0.37f, this.f15694b);
        this.f15693a.setColor(-1);
        this.f15693a.setShadowLayer(60.0f, 0.0f, 0.0f, Color.parseColor("#27f44d55"));
        int i2 = this.f15695c;
        canvas.drawCircle((float) (i2 / 2), (float) (i2 / 2), ((float) i2) * 0.3f, this.f15693a);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3 = this.f15695c;
        setMeasuredDimension(i3, i3);
    }

    public void setComplete(boolean z) {
        this.f15698f = z;
        postInvalidate();
    }
}
