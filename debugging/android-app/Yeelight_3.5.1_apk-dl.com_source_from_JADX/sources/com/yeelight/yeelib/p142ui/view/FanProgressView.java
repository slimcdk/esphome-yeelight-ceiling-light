package com.yeelight.yeelib.p142ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.yeelight.yeelib.R$drawable;

/* renamed from: com.yeelight.yeelib.ui.view.FanProgressView */
public class FanProgressView extends View implements GestureDetector.OnGestureListener {

    /* renamed from: s */
    private static final String f15717s = FanProgressView.class.getSimpleName();

    /* renamed from: a */
    private final GestureDetector f15718a = new GestureDetector(getContext(), this);

    /* renamed from: b */
    private Drawable f15719b = getResources().getDrawable(R$drawable.icon_yeelight_control_view_seek_thumb_pressed);

    /* renamed from: c */
    private int f15720c = 2;

    /* renamed from: d */
    private int f15721d = 4;

    /* renamed from: e */
    private float f15722e;

    /* renamed from: f */
    private float f15723f;

    /* renamed from: g */
    private float f15724g;

    /* renamed from: h */
    private float f15725h;

    /* renamed from: i */
    private float f15726i;

    /* renamed from: j */
    private int f15727j;

    /* renamed from: k */
    private int f15728k;

    /* renamed from: l */
    private Paint f15729l;

    /* renamed from: m */
    private Paint f15730m;

    /* renamed from: n */
    private Paint f15731n;

    /* renamed from: o */
    private int f15732o;

    /* renamed from: p */
    private int f15733p;

    /* renamed from: q */
    private float f15734q;

    /* renamed from: r */
    private C8802a f15735r;

    /* renamed from: com.yeelight.yeelib.ui.view.FanProgressView$a */
    public interface C8802a {
        /* renamed from: a */
        void mo31083a(int i);
    }

    public FanProgressView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15722e = m20761a(context, 3.0f);
        this.f15723f = m20761a(context, 20.0f);
        this.f15724g = m20761a(context, 5.0f);
        this.f15725h = m20761a(getContext(), 13.0f);
        this.f15726i = m20761a(getContext(), 25.0f);
        this.f15727j = (int) m20761a(getContext(), 17.0f);
        Paint paint = new Paint();
        this.f15729l = paint;
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.f15729l.setColor(Color.parseColor("#FDC24B"));
        this.f15729l.setStrokeWidth(this.f15722e);
        this.f15729l.setAntiAlias(true);
        this.f15729l.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f15730m = paint2;
        paint2.setColor(Color.parseColor("#D5D7E0"));
        this.f15730m.setStrokeWidth(this.f15722e);
        this.f15730m.setAntiAlias(true);
        this.f15730m.setStyle(Paint.Style.FILL);
        this.f15730m.setStrokeCap(Paint.Cap.ROUND);
        Paint paint3 = new Paint();
        this.f15731n = paint3;
        paint3.setColor(Color.parseColor("#666666"));
        this.f15731n.setAntiAlias(true);
        this.f15731n.setTextSize(this.f15725h);
        this.f15731n.setTextAlign(Paint.Align.CENTER);
    }

    /* renamed from: a */
    private float m20761a(Context context, float f) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    /* renamed from: b */
    private int m20762b(int i) {
        return Math.round((((float) i) - this.f15723f) / this.f15734q);
    }

    /* renamed from: c */
    private void m20763c(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float f = this.f15723f;
        if (x < f) {
            x = f;
        } else {
            int i = this.f15732o;
            if (x > ((float) i) - f) {
                x = ((float) i) - f;
            }
        }
        this.f15728k = (int) x;
        invalidate();
    }

    private int getThumbX() {
        float f = this.f15723f;
        return (int) (f + (((((float) getMeasuredWidth()) - (2.0f * f)) / ((float) (this.f15721d - 1))) * ((float) this.f15720c)));
    }

    public boolean onDown(MotionEvent motionEvent) {
        m20763c(motionEvent);
        return false;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        Paint paint;
        super.onDraw(canvas);
        int save = canvas.save();
        int i = this.f15733p / 2;
        int i2 = 0;
        while (true) {
            int i3 = this.f15721d;
            if (i2 < i3) {
                float f5 = this.f15723f;
                float f6 = this.f15734q;
                float f7 = (float) i2;
                if ((f6 * f7) + f5 < ((float) this.f15728k)) {
                    f3 = f5 + (f6 * f7);
                    f2 = (float) i;
                    f = f5 + (f6 * f7);
                    f4 = f2 - this.f15724g;
                    paint = this.f15729l;
                } else {
                    if (i2 == i3 - 1) {
                        int i4 = this.f15732o;
                        f3 = ((float) i4) - f5;
                        f2 = (float) i;
                        f = ((float) i4) - f5;
                    } else {
                        f3 = f5 + (f6 * f7);
                        f2 = (float) i;
                        f = f5 + (f6 * f7);
                    }
                    f4 = f2 - this.f15724g;
                    paint = this.f15730m;
                }
                canvas.drawLine(f3, f2, f, f4, paint);
                i2++;
                canvas.drawText(Integer.valueOf(i2).toString(), this.f15723f + (this.f15734q * f7), ((float) i) + this.f15726i, this.f15731n);
            } else {
                float f8 = this.f15723f;
                float f9 = (float) i;
                canvas.drawLine(f8, f9, ((float) this.f15732o) - f8, f9, this.f15730m);
                canvas.drawLine(this.f15723f, f9, (float) this.f15728k, f9, this.f15729l);
                Drawable drawable = this.f15719b;
                int i5 = this.f15728k;
                int i6 = this.f15727j;
                drawable.setBounds(i5 - i6, i - i6, i5 + i6, i + i6);
                this.f15719b.draw(canvas);
                canvas.restoreToCount(save);
                return;
            }
        }
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f15728k = getThumbX();
        this.f15732o = getMeasuredWidth();
        this.f15733p = getMeasuredHeight();
        this.f15734q = (((float) this.f15732o) - (this.f15723f * 2.0f)) / ((float) (this.f15721d - 1));
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        m20763c(motionEvent2);
        return false;
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.f15718a;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 1) {
            this.f15720c = m20762b(this.f15728k);
            StringBuilder sb = new StringBuilder();
            sb.append("onTouchEvent mProgress: ");
            sb.append(this.f15720c);
            this.f15728k = getThumbX();
            invalidate();
            C8802a aVar = this.f15735r;
            if (aVar != null) {
                aVar.mo31083a(this.f15720c);
            }
        }
        return true;
    }

    public void setOnProgressChangeListener(C8802a aVar) {
        this.f15735r = aVar;
    }

    public void setProgress(int i) {
        this.f15720c = i;
        this.f15728k = getThumbX();
        invalidate();
    }

    public void setTotalProgress(int i) {
        this.f15721d = i;
        this.f15734q = (((float) this.f15732o) - (this.f15723f * 2.0f)) / ((float) (i - 1));
        this.f15728k = getThumbX();
        invalidate();
    }
}
