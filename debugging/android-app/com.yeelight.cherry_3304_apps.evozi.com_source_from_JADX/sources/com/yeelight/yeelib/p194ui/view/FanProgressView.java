package com.yeelight.yeelib.p194ui.view;

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
    private static final String f19455s = FanProgressView.class.getSimpleName();

    /* renamed from: a */
    private final GestureDetector f19456a = new GestureDetector(getContext(), this);

    /* renamed from: b */
    private Drawable f19457b = getResources().getDrawable(R$drawable.icon_yeelight_control_view_seek_thumb_pressed);

    /* renamed from: c */
    private int f19458c = 2;

    /* renamed from: d */
    private int f19459d = 4;

    /* renamed from: e */
    private float f19460e;

    /* renamed from: f */
    private float f19461f;

    /* renamed from: g */
    private float f19462g;

    /* renamed from: h */
    private float f19463h;

    /* renamed from: i */
    private float f19464i;

    /* renamed from: j */
    private int f19465j;

    /* renamed from: k */
    private int f19466k;

    /* renamed from: l */
    private Paint f19467l;

    /* renamed from: m */
    private Paint f19468m;

    /* renamed from: n */
    private Paint f19469n;

    /* renamed from: o */
    private int f19470o;

    /* renamed from: p */
    private int f19471p;

    /* renamed from: q */
    private float f19472q;

    /* renamed from: r */
    private C10423a f19473r;

    /* renamed from: com.yeelight.yeelib.ui.view.FanProgressView$a */
    public interface C10423a {
        /* renamed from: a */
        void mo27073a(int i);
    }

    public FanProgressView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19460e = m25150a(context, 3.0f);
        this.f19461f = m25150a(context, 20.0f);
        this.f19462g = m25150a(context, 5.0f);
        this.f19463h = m25150a(getContext(), 13.0f);
        this.f19464i = m25150a(getContext(), 25.0f);
        this.f19465j = (int) m25150a(getContext(), 17.0f);
        Paint paint = new Paint();
        this.f19467l = paint;
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.f19467l.setColor(Color.parseColor("#FDC24B"));
        this.f19467l.setStrokeWidth(this.f19460e);
        this.f19467l.setAntiAlias(true);
        this.f19467l.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f19468m = paint2;
        paint2.setColor(Color.parseColor("#D5D7E0"));
        this.f19468m.setStrokeWidth(this.f19460e);
        this.f19468m.setAntiAlias(true);
        this.f19468m.setStyle(Paint.Style.FILL);
        this.f19468m.setStrokeCap(Paint.Cap.ROUND);
        Paint paint3 = new Paint();
        this.f19469n = paint3;
        paint3.setColor(Color.parseColor("#666666"));
        this.f19469n.setAntiAlias(true);
        this.f19469n.setTextSize(this.f19463h);
        this.f19469n.setTextAlign(Paint.Align.CENTER);
    }

    /* renamed from: a */
    private float m25150a(Context context, float f) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    /* renamed from: b */
    private int m25151b(int i) {
        return Math.round((((float) i) - this.f19461f) / this.f19472q);
    }

    /* renamed from: c */
    private void m25152c(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float f = this.f19461f;
        if (x < f) {
            x = f;
        } else {
            int i = this.f19470o;
            if (x > ((float) i) - f) {
                x = ((float) i) - f;
            }
        }
        this.f19466k = (int) x;
        invalidate();
    }

    private int getThumbX() {
        float f = this.f19461f;
        return (int) (f + (((((float) getMeasuredWidth()) - (2.0f * f)) / ((float) (this.f19459d - 1))) * ((float) this.f19458c)));
    }

    public boolean onDown(MotionEvent motionEvent) {
        m25152c(motionEvent);
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
        int i = this.f19471p / 2;
        int i2 = 0;
        while (true) {
            int i3 = this.f19459d;
            if (i2 < i3) {
                float f5 = this.f19461f;
                float f6 = this.f19472q;
                float f7 = (float) i2;
                if ((f6 * f7) + f5 < ((float) this.f19466k)) {
                    f3 = f5 + (f6 * f7);
                    f2 = (float) i;
                    f = f5 + (f6 * f7);
                    f4 = f2 - this.f19462g;
                    paint = this.f19467l;
                } else {
                    if (i2 == i3 - 1) {
                        int i4 = this.f19470o;
                        f3 = ((float) i4) - f5;
                        f2 = (float) i;
                        f = ((float) i4) - f5;
                    } else {
                        f3 = f5 + (f6 * f7);
                        f2 = (float) i;
                        f = f5 + (f6 * f7);
                    }
                    f4 = f2 - this.f19462g;
                    paint = this.f19468m;
                }
                canvas.drawLine(f3, f2, f, f4, paint);
                i2++;
                canvas.drawText(Integer.valueOf(i2).toString(), this.f19461f + (this.f19472q * f7), ((float) i) + this.f19464i, this.f19469n);
            } else {
                float f8 = this.f19461f;
                float f9 = (float) i;
                canvas.drawLine(f8, f9, ((float) this.f19470o) - f8, f9, this.f19468m);
                canvas.drawLine(this.f19461f, f9, (float) this.f19466k, f9, this.f19467l);
                Drawable drawable = this.f19457b;
                int i5 = this.f19466k;
                int i6 = this.f19465j;
                drawable.setBounds(i5 - i6, i - i6, i5 + i6, i + i6);
                this.f19457b.draw(canvas);
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
        this.f19466k = getThumbX();
        this.f19470o = getMeasuredWidth();
        this.f19471p = getMeasuredHeight();
        this.f19472q = (((float) this.f19470o) - (this.f19461f * 2.0f)) / ((float) (this.f19459d - 1));
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        m25152c(motionEvent2);
        return false;
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.f19456a;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 1) {
            this.f19458c = m25151b(this.f19466k);
            "onTouchEvent mProgress: " + this.f19458c;
            this.f19466k = getThumbX();
            invalidate();
            C10423a aVar = this.f19473r;
            if (aVar != null) {
                aVar.mo27073a(this.f19458c);
            }
        }
        return true;
    }

    public void setOnProgressChangeListener(C10423a aVar) {
        this.f19473r = aVar;
    }

    public void setProgress(int i) {
        this.f19458c = i;
        this.f19466k = getThumbX();
        invalidate();
    }

    public void setTotalProgress(int i) {
        this.f19459d = i;
        this.f19472q = (((float) this.f19470o) - (this.f19461f * 2.0f)) / ((float) (i - 1));
        this.f19466k = getThumbX();
        invalidate();
    }
}
