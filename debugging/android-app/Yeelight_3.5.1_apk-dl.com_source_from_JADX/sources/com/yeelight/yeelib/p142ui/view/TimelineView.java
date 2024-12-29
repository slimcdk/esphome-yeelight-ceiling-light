package com.yeelight.yeelib.p142ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.yeelight.yeelib.R$color;
import p051j4.C9193k;

/* renamed from: com.yeelight.yeelib.ui.view.TimelineView */
public class TimelineView extends View {

    /* renamed from: a */
    private int f16102a = 1;

    /* renamed from: b */
    private int f16103b;

    /* renamed from: c */
    private int f16104c;

    /* renamed from: d */
    private Paint f16105d;

    /* renamed from: e */
    private int f16106e;

    /* renamed from: f */
    private int f16107f;

    public TimelineView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f16105d = paint;
        paint.setAntiAlias(true);
        this.f16106e = C9193k.m22151b(context, 5.7f);
        this.f16107f = C9193k.m22151b(context, 0.67f);
    }

    /* renamed from: a */
    private void m21117a(Canvas canvas) {
        this.f16105d.setStyle(Paint.Style.STROKE);
        this.f16105d.setStrokeWidth((float) this.f16107f);
        this.f16105d.setColor(getResources().getColor(R$color.timeline_line_color));
        int i = this.f16103b;
        int i2 = this.f16104c;
        Canvas canvas2 = canvas;
        canvas2.drawLine((float) (i / 2), (float) ((i2 / 2) - this.f16106e), (float) (i / 2), (float) i2, this.f16105d);
    }

    /* renamed from: b */
    private void m21118b(Canvas canvas, boolean z) {
        if (z) {
            this.f16105d.setStyle(Paint.Style.FILL);
        } else {
            this.f16105d.setStyle(Paint.Style.STROKE);
            this.f16105d.setStrokeWidth((float) this.f16107f);
        }
        this.f16105d.setColor(getResources().getColor(R$color.timeline_circle_color));
        canvas.drawCircle((float) (this.f16103b / 2), (float) (this.f16104c / 2), (float) this.f16106e, this.f16105d);
    }

    /* renamed from: c */
    private void m21119c(Canvas canvas) {
        this.f16105d.setStyle(Paint.Style.STROKE);
        this.f16105d.setStrokeWidth((float) this.f16107f);
        this.f16105d.setColor(getResources().getColor(R$color.timeline_line_color));
        int i = this.f16103b;
        canvas.drawLine((float) (i / 2), 0.0f, (float) (i / 2), (float) ((this.f16104c / 2) - this.f16106e), this.f16105d);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f16103b == 0) {
            this.f16103b = getWidth();
            this.f16104c = getHeight();
        }
        int i = this.f16102a;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    m21119c(canvas);
                } else if (i == 3) {
                    m21119c(canvas);
                    m21118b(canvas, true);
                } else if (i != 4) {
                    return;
                }
                m21118b(canvas, false);
                return;
            }
            m21119c(canvas);
        }
        m21117a(canvas);
        m21118b(canvas, true);
    }

    public void setMode(int i) {
        this.f16102a = i;
        invalidate();
    }
}
