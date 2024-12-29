package p166h5;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.Arrays;
import java.util.List;
import p135c5.C4008a;
import p151e5.C8998a;
import p151e5.C8999b;
import p161g5.C9082c;
import p171i5.C9120a;

/* renamed from: h5.a */
public class C9094a extends View implements C9082c {

    /* renamed from: a */
    private int f16752a;

    /* renamed from: b */
    private Interpolator f16753b = new LinearInterpolator();

    /* renamed from: c */
    private Interpolator f16754c = new LinearInterpolator();

    /* renamed from: d */
    private float f16755d;

    /* renamed from: e */
    private float f16756e;

    /* renamed from: f */
    private float f16757f;

    /* renamed from: g */
    private float f16758g;

    /* renamed from: h */
    private float f16759h;

    /* renamed from: i */
    private Paint f16760i;

    /* renamed from: j */
    private List<C9120a> f16761j;

    /* renamed from: k */
    private List<Integer> f16762k;

    /* renamed from: l */
    private RectF f16763l = new RectF();

    public C9094a(Context context) {
        super(context);
        m21813b(context);
    }

    /* renamed from: b */
    private void m21813b(Context context) {
        Paint paint = new Paint(1);
        this.f16760i = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f16756e = (float) C8999b.m21447a(context, 3.0d);
        this.f16758g = (float) C8999b.m21447a(context, 10.0d);
    }

    /* renamed from: a */
    public void mo37041a(List<C9120a> list) {
        this.f16761j = list;
    }

    public List<Integer> getColors() {
        return this.f16762k;
    }

    public Interpolator getEndInterpolator() {
        return this.f16754c;
    }

    public float getLineHeight() {
        return this.f16756e;
    }

    public float getLineWidth() {
        return this.f16758g;
    }

    public int getMode() {
        return this.f16752a;
    }

    public Paint getPaint() {
        return this.f16760i;
    }

    public float getRoundRadius() {
        return this.f16759h;
    }

    public Interpolator getStartInterpolator() {
        return this.f16753b;
    }

    public float getXOffset() {
        return this.f16757f;
    }

    public float getYOffset() {
        return this.f16755d;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        RectF rectF = this.f16763l;
        float f = this.f16759h;
        canvas.drawRoundRect(rectF, f, f, this.f16760i);
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
        List<C9120a> list = this.f16761j;
        if (list != null && !list.isEmpty()) {
            List<Integer> list2 = this.f16762k;
            if (list2 != null && list2.size() > 0) {
                this.f16760i.setColor(C8998a.m21446a(f, this.f16762k.get(Math.abs(i) % this.f16762k.size()).intValue(), this.f16762k.get(Math.abs(i + 1) % this.f16762k.size()).intValue()));
            }
            C9120a h = C4008a.m11652h(this.f16761j, i);
            C9120a h2 = C4008a.m11652h(this.f16761j, i + 1);
            int i4 = this.f16752a;
            if (i4 == 0) {
                f6 = this.f16757f;
                f5 = ((float) h.f16857a) + f6;
                f4 = ((float) h2.f16857a) + f6;
                f2 = ((float) h.f16859c) - f6;
                i3 = h2.f16859c;
            } else if (i4 == 1) {
                f6 = this.f16757f;
                f5 = ((float) h.f16861e) + f6;
                f4 = ((float) h2.f16861e) + f6;
                f2 = ((float) h.f16863g) - f6;
                i3 = h2.f16863g;
            } else {
                f5 = ((float) h.f16857a) + ((((float) h.mo37185b()) - this.f16758g) / 2.0f);
                float b = ((float) h2.f16857a) + ((((float) h2.mo37185b()) - this.f16758g) / 2.0f);
                f2 = ((((float) h.mo37185b()) + this.f16758g) / 2.0f) + ((float) h.f16857a);
                f3 = ((((float) h2.mo37185b()) + this.f16758g) / 2.0f) + ((float) h2.f16857a);
                f4 = b;
                this.f16763l.left = f5 + ((f4 - f5) * this.f16753b.getInterpolation(f));
                this.f16763l.right = f2 + ((f3 - f2) * this.f16754c.getInterpolation(f));
                this.f16763l.top = (((float) getHeight()) - this.f16756e) - this.f16755d;
                this.f16763l.bottom = ((float) getHeight()) - this.f16755d;
                invalidate();
            }
            f3 = ((float) i3) - f6;
            this.f16763l.left = f5 + ((f4 - f5) * this.f16753b.getInterpolation(f));
            this.f16763l.right = f2 + ((f3 - f2) * this.f16754c.getInterpolation(f));
            this.f16763l.top = (((float) getHeight()) - this.f16756e) - this.f16755d;
            this.f16763l.bottom = ((float) getHeight()) - this.f16755d;
            invalidate();
        }
    }

    public void onPageSelected(int i) {
    }

    public void setColors(Integer... numArr) {
        this.f16762k = Arrays.asList(numArr);
    }

    public void setEndInterpolator(Interpolator interpolator) {
        this.f16754c = interpolator;
        if (interpolator == null) {
            this.f16754c = new LinearInterpolator();
        }
    }

    public void setLineHeight(float f) {
        this.f16756e = f;
    }

    public void setLineWidth(float f) {
        this.f16758g = f;
    }

    public void setMode(int i) {
        if (i == 2 || i == 0 || i == 1) {
            this.f16752a = i;
            return;
        }
        throw new IllegalArgumentException("mode " + i + " not supported.");
    }

    public void setRoundRadius(float f) {
        this.f16759h = f;
    }

    public void setStartInterpolator(Interpolator interpolator) {
        this.f16753b = interpolator;
        if (interpolator == null) {
            this.f16753b = new LinearInterpolator();
        }
    }

    public void setXOffset(float f) {
        this.f16757f = f;
    }

    public void setYOffset(float f) {
        this.f16755d = f;
    }
}
