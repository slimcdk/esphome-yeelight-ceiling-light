package p100t2;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p096s2.C3686a;
import p112w2.C3894a;

/* renamed from: t2.a */
public class C3704a extends View implements C3686a {

    /* renamed from: a */
    private float f6220a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public float[] f6221b;

    /* renamed from: c */
    private ArrayList<ValueAnimator> f6222c;

    /* renamed from: d */
    private Map<ValueAnimator, ValueAnimator.AnimatorUpdateListener> f6223d;

    /* renamed from: e */
    private Paint f6224e;

    /* renamed from: f */
    private int f6225f;

    /* renamed from: g */
    private int f6226g;

    /* renamed from: t2.a$a */
    class C3705a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ int f6227a;

        C3705a(int i) {
            this.f6227a = i;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C3704a.this.f6221b[this.f6227a] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C3704a.this.postInvalidate();
        }
    }

    public C3704a(Context context) {
        this(context, (AttributeSet) null);
    }

    public C3704a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C3704a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6221b = new float[]{1.0f, 1.0f, 1.0f};
        this.f6223d = new HashMap();
        this.f6225f = -1118482;
        this.f6226g = -1615546;
        int a = C3894a.m11093a(context, 50.0f);
        setLayoutParams(new FrameLayout.LayoutParams(a, a, 17));
        this.f6220a = (float) C3894a.m11093a(context, 4.0f);
        Paint paint = new Paint();
        this.f6224e = paint;
        paint.setColor(-1);
        this.f6224e.setStyle(Paint.Style.FILL);
        this.f6224e.setAntiAlias(true);
    }

    /* renamed from: e */
    private void m10579e() {
        this.f6222c = new ArrayList<>();
        int[] iArr = {120, 240, 360};
        for (int i = 0; i < 3; i++) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.3f, 1.0f});
            ofFloat.setDuration(750);
            ofFloat.setRepeatCount(-1);
            ofFloat.setStartDelay((long) iArr[i]);
            this.f6223d.put(ofFloat, new C3705a(i));
            this.f6222c.add(ofFloat);
        }
    }

    /* renamed from: f */
    private boolean m10580f() {
        Iterator<ValueAnimator> it = this.f6222c.iterator();
        if (it.hasNext()) {
            return it.next().isStarted();
        }
        return false;
    }

    /* renamed from: a */
    public void mo26093a(float f, float f2) {
        mo26112g();
    }

    /* renamed from: b */
    public void mo26094b(float f, float f2, float f3) {
        mo26113h();
    }

    /* renamed from: c */
    public void mo26095c(float f, float f2, float f3) {
        mo26113h();
    }

    /* renamed from: g */
    public void mo26112g() {
        if (this.f6222c == null) {
            m10579e();
        }
        if (this.f6222c != null && !m10580f()) {
            for (int i = 0; i < this.f6222c.size(); i++) {
                ValueAnimator valueAnimator = this.f6222c.get(i);
                ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f6223d.get(valueAnimator);
                if (animatorUpdateListener != null) {
                    valueAnimator.addUpdateListener(animatorUpdateListener);
                }
                valueAnimator.start();
            }
            setIndicatorColor(this.f6226g);
        }
    }

    public View getView() {
        return this;
    }

    /* renamed from: h */
    public void mo26113h() {
        ArrayList<ValueAnimator> arrayList = this.f6222c;
        if (arrayList != null) {
            Iterator<ValueAnimator> it = arrayList.iterator();
            while (it.hasNext()) {
                ValueAnimator next = it.next();
                if (next != null && next.isStarted()) {
                    next.removeAllUpdateListeners();
                    next.end();
                }
            }
        }
        setIndicatorColor(this.f6225f);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f6222c != null) {
            for (int i = 0; i < this.f6222c.size(); i++) {
                this.f6222c.get(i).cancel();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float min = (((float) Math.min(getWidth(), getHeight())) - (this.f6220a * 2.0f)) / 6.0f;
        float f = 2.0f * min;
        float width = ((float) (getWidth() / 2)) - (this.f6220a + f);
        float height = (float) (getHeight() / 2);
        for (int i = 0; i < 3; i++) {
            canvas.save();
            float f2 = (float) i;
            canvas.translate((f * f2) + width + (this.f6220a * f2), height);
            float[] fArr = this.f6221b;
            canvas.scale(fArr[i], fArr[i]);
            canvas.drawCircle(0.0f, 0.0f, min, this.f6224e);
            canvas.restore();
        }
    }

    public void reset() {
        mo26113h();
    }

    public void setAnimatingColor(@ColorInt int i) {
        this.f6226g = i;
    }

    public void setIndicatorColor(int i) {
        this.f6224e.setColor(i);
    }

    public void setNormalColor(@ColorInt int i) {
        this.f6225f = i;
    }
}
