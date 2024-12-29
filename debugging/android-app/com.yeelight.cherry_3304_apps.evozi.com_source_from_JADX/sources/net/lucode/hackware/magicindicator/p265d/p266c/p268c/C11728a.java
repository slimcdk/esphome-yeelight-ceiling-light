package net.lucode.hackware.magicindicator.p265d.p266c.p268c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.Arrays;
import java.util.List;
import net.lucode.hackware.magicindicator.C11714a;
import net.lucode.hackware.magicindicator.p265d.C11720a;
import net.lucode.hackware.magicindicator.p265d.C11721b;
import net.lucode.hackware.magicindicator.p265d.p266c.p267b.C11726c;
import net.lucode.hackware.magicindicator.p265d.p266c.p269d.C11729a;

/* renamed from: net.lucode.hackware.magicindicator.d.c.c.a */
public class C11728a extends View implements C11726c {

    /* renamed from: a */
    private int f23082a;

    /* renamed from: b */
    private Interpolator f23083b = new LinearInterpolator();

    /* renamed from: c */
    private Interpolator f23084c = new LinearInterpolator();

    /* renamed from: d */
    private float f23085d;

    /* renamed from: e */
    private float f23086e;

    /* renamed from: f */
    private float f23087f;

    /* renamed from: g */
    private float f23088g;

    /* renamed from: h */
    private float f23089h;

    /* renamed from: i */
    private Paint f23090i;

    /* renamed from: j */
    private List<C11729a> f23091j;

    /* renamed from: k */
    private List<Integer> f23092k;

    /* renamed from: l */
    private RectF f23093l = new RectF();

    public C11728a(Context context) {
        super(context);
        m30444b(context);
    }

    /* renamed from: b */
    private void m30444b(Context context) {
        Paint paint = new Paint(1);
        this.f23090i = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f23086e = (float) C11721b.m30419a(context, 3.0d);
        this.f23088g = (float) C11721b.m30419a(context, 10.0d);
    }

    /* renamed from: a */
    public void mo36855a(List<C11729a> list) {
        this.f23091j = list;
    }

    public List<Integer> getColors() {
        return this.f23092k;
    }

    public Interpolator getEndInterpolator() {
        return this.f23084c;
    }

    public float getLineHeight() {
        return this.f23086e;
    }

    public float getLineWidth() {
        return this.f23088g;
    }

    public int getMode() {
        return this.f23082a;
    }

    public Paint getPaint() {
        return this.f23090i;
    }

    public float getRoundRadius() {
        return this.f23089h;
    }

    public Interpolator getStartInterpolator() {
        return this.f23083b;
    }

    public float getXOffset() {
        return this.f23087f;
    }

    public float getYOffset() {
        return this.f23085d;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        RectF rectF = this.f23093l;
        float f = this.f23089h;
        canvas.drawRoundRect(rectF, f, f, this.f23090i);
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i3;
        List<C11729a> list = this.f23091j;
        if (list != null && !list.isEmpty()) {
            List<Integer> list2 = this.f23092k;
            if (list2 != null && list2.size() > 0) {
                this.f23090i.setColor(C11720a.m30418a(f, this.f23092k.get(Math.abs(i) % this.f23092k.size()).intValue(), this.f23092k.get(Math.abs(i + 1) % this.f23092k.size()).intValue()));
            }
            C11729a h = C11714a.m30395h(this.f23091j, i);
            C11729a h2 = C11714a.m30395h(this.f23091j, i + 1);
            int i4 = this.f23082a;
            if (i4 == 0) {
                f6 = this.f23087f;
                f5 = ((float) h.f23094a) + f6;
                f4 = ((float) h2.f23094a) + f6;
                f2 = ((float) h.f23096c) - f6;
                i3 = h2.f23096c;
            } else if (i4 == 1) {
                f6 = this.f23087f;
                f5 = ((float) h.f23098e) + f6;
                f4 = ((float) h2.f23098e) + f6;
                f2 = ((float) h.f23100g) - f6;
                i3 = h2.f23100g;
            } else {
                f5 = ((float) h.f23094a) + ((((float) h.mo36884b()) - this.f23088g) / 2.0f);
                float b = ((float) h2.f23094a) + ((((float) h2.mo36884b()) - this.f23088g) / 2.0f);
                f2 = ((((float) h.mo36884b()) + this.f23088g) / 2.0f) + ((float) h.f23094a);
                f3 = ((((float) h2.mo36884b()) + this.f23088g) / 2.0f) + ((float) h2.f23094a);
                f4 = b;
                this.f23093l.left = f5 + ((f4 - f5) * this.f23083b.getInterpolation(f));
                this.f23093l.right = f2 + ((f3 - f2) * this.f23084c.getInterpolation(f));
                this.f23093l.top = (((float) getHeight()) - this.f23086e) - this.f23085d;
                this.f23093l.bottom = ((float) getHeight()) - this.f23085d;
                invalidate();
            }
            f3 = ((float) i3) - f6;
            this.f23093l.left = f5 + ((f4 - f5) * this.f23083b.getInterpolation(f));
            this.f23093l.right = f2 + ((f3 - f2) * this.f23084c.getInterpolation(f));
            this.f23093l.top = (((float) getHeight()) - this.f23086e) - this.f23085d;
            this.f23093l.bottom = ((float) getHeight()) - this.f23085d;
            invalidate();
        }
    }

    public void onPageSelected(int i) {
    }

    public void setColors(Integer... numArr) {
        this.f23092k = Arrays.asList(numArr);
    }

    public void setEndInterpolator(Interpolator interpolator) {
        this.f23084c = interpolator;
        if (interpolator == null) {
            this.f23084c = new LinearInterpolator();
        }
    }

    public void setLineHeight(float f) {
        this.f23086e = f;
    }

    public void setLineWidth(float f) {
        this.f23088g = f;
    }

    public void setMode(int i) {
        if (i == 2 || i == 0 || i == 1) {
            this.f23082a = i;
            return;
        }
        throw new IllegalArgumentException("mode " + i + " not supported.");
    }

    public void setRoundRadius(float f) {
        this.f23089h = f;
    }

    public void setStartInterpolator(Interpolator interpolator) {
        this.f23083b = interpolator;
        if (interpolator == null) {
            this.f23083b = new LinearInterpolator();
        }
    }

    public void setXOffset(float f) {
        this.f23087f = f;
    }

    public void setYOffset(float f) {
        this.f23085d = f;
    }
}
