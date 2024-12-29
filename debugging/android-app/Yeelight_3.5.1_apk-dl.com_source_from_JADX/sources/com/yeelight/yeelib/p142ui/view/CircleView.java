package com.yeelight.yeelib.p142ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.yeelight.yeelib.R$dimen;
import com.yeelight.yeelib.R$drawable;

/* renamed from: com.yeelight.yeelib.ui.view.CircleView */
public class CircleView extends View {

    /* renamed from: a */
    private boolean f15639a = false;

    /* renamed from: b */
    private Paint f15640b = new Paint();

    /* renamed from: c */
    private int f15641c;

    /* renamed from: d */
    private Bitmap f15642d;

    public CircleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setClickable(true);
        this.f15642d = BitmapFactory.decodeResource(getResources(), R$drawable.circle_view_bg);
        setColor(-16711936);
        setWillNotDraw(false);
    }

    public int getColor() {
        return this.f15641c;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        this.f15640b.setStyle(Paint.Style.FILL);
        this.f15640b.setColor(this.f15641c);
        canvas.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), (float) (getContext().getResources().getDimensionPixelSize(R$dimen.color_flow_circle_view) / 2), this.f15640b);
        if (this.f15639a) {
            canvas.drawBitmap(this.f15642d, (float) ((getWidth() / 2) - (this.f15642d.getWidth() / 2)), (float) ((getHeight() / 2) - (this.f15642d.getHeight() / 2)), this.f15640b);
        }
        super.onDraw(canvas);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            setAlpha(0.5f);
        }
        if (motionEvent.getAction() == 1) {
            setAlpha(0.999f);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setColor(int i) {
        this.f15641c = i;
        invalidate();
    }

    public void setIsCurrent(boolean z) {
        this.f15639a = z;
        invalidate();
    }
}
