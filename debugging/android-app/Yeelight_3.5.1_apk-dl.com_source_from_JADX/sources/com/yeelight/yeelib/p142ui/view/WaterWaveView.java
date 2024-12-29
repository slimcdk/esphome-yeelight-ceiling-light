package com.yeelight.yeelib.p142ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.core.internal.view.SupportMenu;
import java.util.ArrayList;
import java.util.List;
import p112w2.C3894a;

/* renamed from: com.yeelight.yeelib.ui.view.WaterWaveView */
public class WaterWaveView extends View {

    /* renamed from: a */
    private Context f16108a;

    /* renamed from: b */
    private Paint f16109b;

    /* renamed from: c */
    private float f16110c;

    /* renamed from: d */
    private float f16111d;

    /* renamed from: e */
    private List<C8868a> f16112e;

    /* renamed from: f */
    private float f16113f = 5.0f;

    /* renamed from: g */
    private int f16114g = 12;

    /* renamed from: h */
    private int f16115h = SupportMenu.CATEGORY_MASK;

    /* renamed from: i */
    private int f16116i;

    /* renamed from: j */
    private boolean f16117j;

    /* renamed from: k */
    private boolean f16118k = true;

    /* renamed from: com.yeelight.yeelib.ui.view.WaterWaveView$a */
    class C8868a {

        /* renamed from: a */
        float f16119a;

        /* renamed from: b */
        int f16120b;

        C8868a(WaterWaveView waterWaveView, float f, int i) {
            this.f16119a = f;
            this.f16120b = i;
        }
    }

    public WaterWaveView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m21121b();
    }

    /* renamed from: a */
    private void m21120a(Canvas canvas) {
        for (int i = 0; i < this.f16112e.size(); i++) {
            if (this.f16112e.get(i).f16119a > this.f16110c / 2.0f) {
                this.f16112e.remove(i);
            }
        }
        for (int i2 = 0; i2 < this.f16112e.size(); i2++) {
            C8868a aVar = this.f16112e.get(i2);
            this.f16109b.setAlpha(aVar.f16120b);
            canvas.drawCircle(this.f16110c / 2.0f, this.f16111d / 2.0f, aVar.f16119a - this.f16109b.getStrokeWidth(), this.f16109b);
            if (this.f16118k) {
                double d = (double) aVar.f16119a;
                double d2 = (double) this.f16110c;
                Double.isNaN(d2);
                Double.isNaN(d);
                double d3 = 255.0d - (d * (255.0d / (d2 / 2.0d)));
                aVar.f16120b = d3 > 0.0d ? (int) (d3 * 0.9d) : 0;
            }
            float f = (((float) aVar.f16120b) / 255.0f) * this.f16113f;
            if (f <= 2.0f) {
                f = 2.0f;
            }
            aVar.f16119a += f;
        }
        if (this.f16112e.size() > 0) {
            List<C8868a> list = this.f16112e;
            float f2 = list.get(list.size() - 1).f16119a;
            int a = C3894a.m11093a(this.f16108a, (float) this.f16114g);
            int i3 = this.f16116i;
            if (f2 > ((float) (a + i3))) {
                this.f16112e.add(new C8868a(this, (float) i3, 255));
            }
        }
        invalidate();
    }

    /* renamed from: b */
    private void m21121b() {
        Paint.Style style;
        Paint paint;
        this.f16108a = getContext();
        Paint paint2 = new Paint();
        this.f16109b = paint2;
        paint2.setColor(this.f16115h);
        this.f16109b.setStrokeWidth((float) C3894a.m11093a(this.f16108a, 1.0f));
        if (this.f16117j) {
            paint = this.f16109b;
            style = Paint.Style.FILL;
        } else {
            paint = this.f16109b;
            style = Paint.Style.STROKE;
        }
        paint.setStyle(style);
        this.f16109b.setStrokeCap(Paint.Cap.ROUND);
        this.f16109b.setAntiAlias(true);
        this.f16112e = new ArrayList();
        int a = C3894a.m11093a(this.f16108a, 23.0f);
        this.f16116i = a;
        this.f16112e.add(new C8868a(this, (float) a, 255));
        this.f16114g = C3894a.m11093a(this.f16108a, (float) this.f16114g);
        setBackgroundColor(0);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m21120a(canvas);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            size = C3894a.m11093a(this.f16108a, 120.0f);
        }
        this.f16110c = (float) size;
        this.f16111d = mode2 == 1073741824 ? (float) size2 : (float) C3894a.m11093a(this.f16108a, 120.0f);
        setMeasuredDimension((int) this.f16110c, (int) this.f16111d);
    }
}
