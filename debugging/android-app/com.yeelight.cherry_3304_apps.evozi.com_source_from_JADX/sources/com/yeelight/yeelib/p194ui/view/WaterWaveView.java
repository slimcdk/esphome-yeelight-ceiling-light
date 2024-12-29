package com.yeelight.yeelib.p194ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.core.internal.view.SupportMenu;
import com.lcodecore.tkrefreshlayout.p144j.C3421a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yeelight.yeelib.ui.view.WaterWaveView */
public class WaterWaveView extends View {

    /* renamed from: a */
    private Context f19850a;

    /* renamed from: b */
    private Paint f19851b;

    /* renamed from: c */
    private float f19852c;

    /* renamed from: d */
    private float f19853d;

    /* renamed from: e */
    private List<C10491a> f19854e;

    /* renamed from: f */
    private float f19855f = 5.0f;

    /* renamed from: g */
    private int f19856g = 12;

    /* renamed from: h */
    private int f19857h = SupportMenu.CATEGORY_MASK;

    /* renamed from: i */
    private int f19858i;

    /* renamed from: j */
    private boolean f19859j;

    /* renamed from: k */
    private boolean f19860k = true;

    /* renamed from: com.yeelight.yeelib.ui.view.WaterWaveView$a */
    class C10491a {

        /* renamed from: a */
        float f19861a;

        /* renamed from: b */
        int f19862b;

        C10491a(WaterWaveView waterWaveView, float f, int i) {
            this.f19861a = f;
            this.f19862b = i;
        }
    }

    public WaterWaveView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m25507b();
    }

    /* renamed from: a */
    private void m25506a(Canvas canvas) {
        for (int i = 0; i < this.f19854e.size(); i++) {
            if (this.f19854e.get(i).f19861a > this.f19852c / 2.0f) {
                this.f19854e.remove(i);
            }
        }
        for (int i2 = 0; i2 < this.f19854e.size(); i2++) {
            C10491a aVar = this.f19854e.get(i2);
            this.f19851b.setAlpha(aVar.f19862b);
            canvas.drawCircle(this.f19852c / 2.0f, this.f19853d / 2.0f, aVar.f19861a - this.f19851b.getStrokeWidth(), this.f19851b);
            if (this.f19860k) {
                double d = (double) aVar.f19861a;
                double d2 = (double) this.f19852c;
                Double.isNaN(d2);
                Double.isNaN(d);
                double d3 = 255.0d - (d * (255.0d / (d2 / 2.0d)));
                aVar.f19862b = d3 > 0.0d ? (int) (d3 * 0.9d) : 0;
            }
            float f = (((float) aVar.f19862b) / 255.0f) * this.f19855f;
            if (f <= 2.0f) {
                f = 2.0f;
            }
            aVar.f19861a += f;
        }
        if (this.f19854e.size() > 0) {
            List<C10491a> list = this.f19854e;
            float f2 = list.get(list.size() - 1).f19861a;
            int a = C3421a.m10616a(this.f19850a, (float) this.f19856g);
            int i3 = this.f19858i;
            if (f2 > ((float) (a + i3))) {
                this.f19854e.add(new C10491a(this, (float) i3, 255));
            }
        }
        invalidate();
    }

    /* renamed from: b */
    private void m25507b() {
        Paint.Style style;
        Paint paint;
        this.f19850a = getContext();
        Paint paint2 = new Paint();
        this.f19851b = paint2;
        paint2.setColor(this.f19857h);
        this.f19851b.setStrokeWidth((float) C3421a.m10616a(this.f19850a, 1.0f));
        if (this.f19859j) {
            paint = this.f19851b;
            style = Paint.Style.FILL;
        } else {
            paint = this.f19851b;
            style = Paint.Style.STROKE;
        }
        paint.setStyle(style);
        this.f19851b.setStrokeCap(Paint.Cap.ROUND);
        this.f19851b.setAntiAlias(true);
        this.f19854e = new ArrayList();
        int a = C3421a.m10616a(this.f19850a, 23.0f);
        this.f19858i = a;
        this.f19854e.add(new C10491a(this, (float) a, 255));
        this.f19856g = C3421a.m10616a(this.f19850a, (float) this.f19856g);
        setBackgroundColor(0);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m25506a(canvas);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            size = C3421a.m10616a(this.f19850a, 120.0f);
        }
        this.f19852c = (float) size;
        this.f19853d = mode2 == 1073741824 ? (float) size2 : (float) C3421a.m10616a(this.f19850a, 120.0f);
        setMeasuredDimension((int) this.f19852c, (int) this.f19853d);
    }
}
