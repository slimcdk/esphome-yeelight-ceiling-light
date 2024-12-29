package com.yeelight.yeelib.p194ui.view;

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
import com.yeelight.yeelib.utils.C10547m;

/* renamed from: com.yeelight.yeelib.ui.view.FlowCircleView */
public class FlowCircleView extends View {

    /* renamed from: a */
    private boolean f19486a = false;

    /* renamed from: b */
    private Paint f19487b = new Paint();

    /* renamed from: c */
    private Paint f19488c = new Paint();

    /* renamed from: d */
    private int f19489d;

    /* renamed from: e */
    private Bitmap f19490e;

    public FlowCircleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setClickable(true);
        this.f19490e = BitmapFactory.decodeResource(getResources(), R$drawable.icon_yeelight_flow_circle_edit);
        setColor(-16711936);
        setWillNotDraw(false);
    }

    /* renamed from: a */
    public boolean mo32881a() {
        return this.f19486a;
    }

    public int getColor() {
        return this.f19489d;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        this.f19487b.setStyle(Paint.Style.FILL);
        this.f19487b.setAntiAlias(true);
        this.f19487b.setColor(this.f19489d);
        this.f19488c.setAntiAlias(true);
        this.f19488c.setStyle(Paint.Style.STROKE);
        this.f19488c.setAntiAlias(true);
        this.f19488c.setStrokeWidth((float) C10547m.m25753c(getContext(), 2.0f));
        this.f19488c.setColor(this.f19489d);
        canvas.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), (float) (getContext().getResources().getDimensionPixelSize(R$dimen.color_flow_circle_inner_view) / 2), this.f19487b);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R$dimen.color_flow_circle_arc_view) / 2;
        canvas.drawArc(new RectF((float) ((getWidth() / 2) - dimensionPixelSize), (float) ((getHeight() / 2) - dimensionPixelSize), (float) ((getWidth() / 2) + dimensionPixelSize), (float) ((getHeight() / 2) + dimensionPixelSize)), 0.0f, 360.0f, false, this.f19488c);
        if (this.f19486a) {
            canvas.drawBitmap(this.f19490e, (float) ((getWidth() / 2) - (this.f19490e.getWidth() / 2)), (float) ((getHeight() / 2) - (this.f19490e.getHeight() / 2)), this.f19487b);
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
        this.f19489d = i;
        invalidate();
    }

    public void setSelected(boolean z) {
        this.f19486a = z;
        invalidate();
    }
}
