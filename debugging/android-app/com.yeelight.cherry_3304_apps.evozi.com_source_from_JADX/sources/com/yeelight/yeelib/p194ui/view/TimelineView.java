package com.yeelight.yeelib.p194ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.yeelight.yeelib.R$color;
import com.yeelight.yeelib.utils.C10547m;

/* renamed from: com.yeelight.yeelib.ui.view.TimelineView */
public class TimelineView extends View {

    /* renamed from: a */
    private int f19844a = 1;

    /* renamed from: b */
    private int f19845b;

    /* renamed from: c */
    private int f19846c;

    /* renamed from: d */
    private Paint f19847d;

    /* renamed from: e */
    private int f19848e;

    /* renamed from: f */
    private int f19849f;

    public TimelineView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f19847d = paint;
        paint.setAntiAlias(true);
        this.f19848e = C10547m.m25752b(context, 5.7f);
        this.f19849f = C10547m.m25752b(context, 0.67f);
    }

    /* renamed from: a */
    private void m25503a(Canvas canvas) {
        this.f19847d.setStyle(Paint.Style.STROKE);
        this.f19847d.setStrokeWidth((float) this.f19849f);
        this.f19847d.setColor(getResources().getColor(R$color.timeline_line_color));
        int i = this.f19845b;
        int i2 = this.f19846c;
        Canvas canvas2 = canvas;
        canvas2.drawLine((float) (i / 2), (float) ((i2 / 2) - this.f19848e), (float) (i / 2), (float) i2, this.f19847d);
    }

    /* renamed from: b */
    private void m25504b(Canvas canvas, boolean z) {
        if (z) {
            this.f19847d.setStyle(Paint.Style.FILL);
        } else {
            this.f19847d.setStyle(Paint.Style.STROKE);
            this.f19847d.setStrokeWidth((float) this.f19849f);
        }
        this.f19847d.setColor(getResources().getColor(R$color.timeline_circle_color));
        canvas.drawCircle((float) (this.f19845b / 2), (float) (this.f19846c / 2), (float) this.f19848e, this.f19847d);
    }

    /* renamed from: c */
    private void m25505c(Canvas canvas) {
        this.f19847d.setStyle(Paint.Style.STROKE);
        this.f19847d.setStrokeWidth((float) this.f19849f);
        this.f19847d.setColor(getResources().getColor(R$color.timeline_line_color));
        int i = this.f19845b;
        canvas.drawLine((float) (i / 2), 0.0f, (float) (i / 2), (float) ((this.f19846c / 2) - this.f19848e), this.f19847d);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f19845b == 0) {
            this.f19845b = getWidth();
            this.f19846c = getHeight();
        }
        int i = this.f19844a;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    m25505c(canvas);
                } else if (i == 3) {
                    m25505c(canvas);
                    m25504b(canvas, true);
                } else if (i != 4) {
                    return;
                }
                m25504b(canvas, false);
                return;
            }
            m25505c(canvas);
        }
        m25503a(canvas);
        m25504b(canvas, true);
    }

    public void setMode(int i) {
        this.f19844a = i;
        invalidate();
    }
}
