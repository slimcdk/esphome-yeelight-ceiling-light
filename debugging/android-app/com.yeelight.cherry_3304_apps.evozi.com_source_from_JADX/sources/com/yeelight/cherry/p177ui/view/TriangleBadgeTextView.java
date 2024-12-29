package com.yeelight.cherry.p177ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.yeelight.yeelib.utils.C10547m;

/* renamed from: com.yeelight.cherry.ui.view.TriangleBadgeTextView */
public class TriangleBadgeTextView extends TextView {

    /* renamed from: a */
    private Rect f12611a = new Rect();

    /* renamed from: b */
    private int f12612b;

    /* renamed from: c */
    private Paint f12613c = new Paint();

    /* renamed from: d */
    private Path f12614d = new Path();

    public TriangleBadgeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m17475a();
    }

    /* renamed from: a */
    private void m17475a() {
        this.f12613c.setAntiAlias(true);
        this.f12613c.setStyle(Paint.Style.FILL);
        this.f12613c.setColor(Color.parseColor("#999999"));
        this.f12612b = (int) ((getPaint().getFontMetrics().descent - getPaint().getFontMetrics().ascent) * 0.37f);
        setSingleLine(true);
        setEllipsize(TextUtils.TruncateAt.END);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (getText().length() > 0) {
            getFocusedRect(this.f12611a);
            this.f12614d.moveTo((float) (this.f12611a.right - this.f12612b), ((float) getBaseline()) + (getPaint().getFontMetrics().descent / 2.0f));
            this.f12614d.lineTo((float) this.f12611a.right, (((float) getBaseline()) + (getPaint().getFontMetrics().descent / 2.0f)) - ((float) this.f12612b));
            this.f12614d.lineTo((float) this.f12611a.right, ((float) getBaseline()) + (getPaint().getFontMetrics().descent / 2.0f));
            this.f12614d.close();
            canvas.drawPath(this.f12614d, this.f12613c);
        }
        this.f12614d.reset();
        "Text = " + getText() + ", this = " + this;
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth() + (this.f12612b * 2) + C10547m.m25752b(getContext(), 4.0f), getMeasuredHeight());
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        invalidate();
    }

    public void setTextSize(float f) {
        super.setTextSize(f);
        this.f12612b = (int) ((getPaint().getFontMetrics().descent - getPaint().getFontMetrics().ascent) * 0.37f);
    }
}
