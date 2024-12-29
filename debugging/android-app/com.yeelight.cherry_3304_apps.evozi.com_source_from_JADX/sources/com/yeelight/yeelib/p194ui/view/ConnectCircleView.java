package com.yeelight.yeelib.p194ui.view;

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
import androidx.core.internal.view.SupportMenu;

/* renamed from: com.yeelight.yeelib.ui.view.ConnectCircleView */
public class ConnectCircleView extends View {

    /* renamed from: a */
    private Paint f19431a;

    /* renamed from: b */
    private Paint f19432b;

    /* renamed from: c */
    private int f19433c = 0;

    /* renamed from: d */
    private SweepGradient f19434d;

    /* renamed from: e */
    private ObjectAnimator f19435e;

    /* renamed from: f */
    private boolean f19436f = false;

    public ConnectCircleView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m25136a();
    }

    /* renamed from: a */
    private void m25136a() {
        this.f19431a = new Paint();
        this.f19432b = new Paint();
        this.f19431a.setAntiAlias(true);
        this.f19433c = getResources().getDisplayMetrics().widthPixels;
        int i = this.f19433c;
        new RectF((float) (i / 7), (float) (i / 7), (float) ((i * 6) / 7), (float) ((i * 6) / 7));
        int i2 = this.f19433c;
        this.f19434d = new SweepGradient((float) (i2 / 2), (float) (i2 / 2), new int[]{Color.parseColor("#03ff0000"), Color.parseColor("#20ff0000"), Color.parseColor("#60ff0000"), -65536}, (float[]) null);
        this.f19432b.setAntiAlias(true);
        setLayerType(1, this.f19431a);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "rotation", new float[]{0.0f, 359.0f});
        this.f19435e = ofFloat;
        ofFloat.setInterpolator(new LinearInterpolator());
        this.f19435e.setDuration(1500);
        this.f19435e.setRepeatMode(1);
        this.f19435e.setRepeatCount(-1);
        this.f19435e.start();
    }

    /* renamed from: b */
    public void mo32848b() {
        this.f19435e.start();
    }

    /* renamed from: c */
    public void mo32849c() {
        this.f19435e.cancel();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        SweepGradient sweepGradient;
        Paint paint;
        super.onDraw(canvas);
        this.f19432b.setStyle(Paint.Style.STROKE);
        this.f19432b.setColor(SupportMenu.CATEGORY_MASK);
        this.f19432b.setStrokeWidth(10.0f);
        if (!this.f19436f) {
            paint = this.f19432b;
            sweepGradient = this.f19434d;
        } else {
            paint = this.f19432b;
            sweepGradient = null;
        }
        paint.setShader(sweepGradient);
        int i = this.f19433c;
        canvas.drawCircle((float) (i / 2), (float) (i / 2), ((float) i) * 0.37f, this.f19432b);
        this.f19431a.setColor(-1);
        this.f19431a.setShadowLayer(60.0f, 0.0f, 0.0f, Color.parseColor("#27f44d55"));
        int i2 = this.f19433c;
        canvas.drawCircle((float) (i2 / 2), (float) (i2 / 2), ((float) i2) * 0.3f, this.f19431a);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3 = this.f19433c;
        setMeasuredDimension(i3, i3);
    }

    public void setComplete(boolean z) {
        this.f19436f = z;
        postInvalidate();
    }
}
