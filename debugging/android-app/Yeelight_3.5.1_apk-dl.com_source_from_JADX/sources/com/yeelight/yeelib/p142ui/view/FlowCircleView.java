package com.yeelight.yeelib.p142ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.yeelight.yeelib.R$dimen;
import com.yeelight.yeelib.R$drawable;
import p051j4.C9193k;

/* renamed from: com.yeelight.yeelib.ui.view.FlowCircleView */
public class FlowCircleView extends View {

    /* renamed from: a */
    private boolean f15748a = false;

    /* renamed from: b */
    private Paint f15749b = new Paint();

    /* renamed from: c */
    private Paint f15750c = new Paint();

    /* renamed from: d */
    private int f15751d;

    /* renamed from: e */
    private Bitmap f15752e;

    public FlowCircleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setClickable(true);
        this.f15752e = BitmapFactory.decodeResource(getResources(), R$drawable.icon_yeelight_flow_circle_edit);
        setColor(-16711936);
        setWillNotDraw(false);
    }

    /* renamed from: a */
    public boolean mo36251a() {
        return this.f15748a;
    }

    public int getColor() {
        return this.f15751d;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        this.f15749b.setStyle(Paint.Style.FILL);
        this.f15749b.setAntiAlias(true);
        this.f15749b.setColor(this.f15751d);
        this.f15750c.setAntiAlias(true);
        this.f15750c.setStyle(Paint.Style.STROKE);
        this.f15750c.setAntiAlias(true);
        this.f15750c.setStrokeWidth((float) C9193k.m22152c(getContext(), 2.0f));
        this.f15750c.setColor(this.f15751d);
        canvas.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), (float) (getContext().getResources().getDimensionPixelSize(R$dimen.color_flow_circle_inner_view) / 2), this.f15749b);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R$dimen.color_flow_circle_arc_view) / 2;
        canvas.drawArc(new RectF((float) ((getWidth() / 2) - dimensionPixelSize), (float) ((getHeight() / 2) - dimensionPixelSize), (float) ((getWidth() / 2) + dimensionPixelSize), (float) ((getHeight() / 2) + dimensionPixelSize)), 0.0f, 360.0f, false, this.f15750c);
        if (this.f15748a) {
            canvas.drawBitmap(this.f15752e, (float) ((getWidth() / 2) - (this.f15752e.getWidth() / 2)), (float) ((getHeight() / 2) - (this.f15752e.getHeight() / 2)), this.f15749b);
        }
        super.onDraw(canvas);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            setAlpha(0.5f);
            setSelected(true);
        }
        if (motionEvent.getAction() == 1) {
            setAlpha(0.999f);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setColor(int i) {
        this.f15751d = i;
        invalidate();
    }

    public void setSelected(boolean z) {
        this.f15748a = z;
        invalidate();
    }
}
