package com.yeelight.cherry.p141ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import p051j4.C9193k;

/* renamed from: com.yeelight.cherry.ui.view.TriangleBadgeTextView */
public class TriangleBadgeTextView extends TextView {

    /* renamed from: a */
    private Rect f12206a = new Rect();

    /* renamed from: b */
    private int f12207b;

    /* renamed from: c */
    private Paint f12208c = new Paint();

    /* renamed from: d */
    private Path f12209d = new Path();

    public TriangleBadgeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m17549a();
    }

    /* renamed from: a */
    private void m17549a() {
        this.f12208c.setAntiAlias(true);
        this.f12208c.setStyle(Paint.Style.FILL);
        this.f12208c.setColor(Color.parseColor("#999999"));
        this.f12207b = (int) ((getPaint().getFontMetrics().descent - getPaint().getFontMetrics().ascent) * 0.37f);
        setSingleLine(true);
        setEllipsize(TextUtils.TruncateAt.END);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (getText().length() > 0) {
            getFocusedRect(this.f12206a);
            this.f12209d.moveTo((float) (this.f12206a.right - this.f12207b), ((float) getBaseline()) + (getPaint().getFontMetrics().descent / 2.0f));
            this.f12209d.lineTo((float) this.f12206a.right, (((float) getBaseline()) + (getPaint().getFontMetrics().descent / 2.0f)) - ((float) this.f12207b));
            this.f12209d.lineTo((float) this.f12206a.right, ((float) getBaseline()) + (getPaint().getFontMetrics().descent / 2.0f));
            this.f12209d.close();
            canvas.drawPath(this.f12209d, this.f12208c);
        }
        this.f12209d.reset();
        StringBuilder sb = new StringBuilder();
        sb.append("Text = ");
        sb.append(getText());
        sb.append(", this = ");
        sb.append(this);
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth() + (this.f12207b * 2) + C9193k.m22151b(getContext(), 4.0f), getMeasuredHeight());
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        invalidate();
    }

    public void setTextSize(float f) {
        super.setTextSize(f);
        this.f12207b = (int) ((getPaint().getFontMetrics().descent - getPaint().getFontMetrics().ascent) * 0.37f);
    }
}
