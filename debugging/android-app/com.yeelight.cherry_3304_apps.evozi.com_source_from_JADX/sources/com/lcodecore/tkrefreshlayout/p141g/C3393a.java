package com.lcodecore.tkrefreshlayout.p141g;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import com.lcodecore.tkrefreshlayout.C3387a;
import com.lcodecore.tkrefreshlayout.p144j.C3421a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.lcodecore.tkrefreshlayout.g.a */
public class C3393a extends View implements C3387a {

    /* renamed from: a */
    private float f6589a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public float[] f6590b;

    /* renamed from: c */
    private ArrayList<ValueAnimator> f6591c;

    /* renamed from: d */
    private Map<ValueAnimator, ValueAnimator.AnimatorUpdateListener> f6592d;

    /* renamed from: e */
    private Paint f6593e;

    /* renamed from: f */
    private int f6594f;

    /* renamed from: g */
    private int f6595g;

    /* renamed from: com.lcodecore.tkrefreshlayout.g.a$a */
    class C3394a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ int f6596a;

        C3394a(int i) {
            this.f6596a = i;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C3393a.this.f6590b[this.f6596a] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C3393a.this.postInvalidate();
        }
    }

    public C3393a(Context context) {
        this(context, (AttributeSet) null);
    }

    public C3393a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C3393a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6590b = new float[]{1.0f, 1.0f, 1.0f};
        this.f6592d = new HashMap();
        this.f6594f = -1118482;
        this.f6595g = -1615546;
        int a = C3421a.m10616a(context, 50.0f);
        setLayoutParams(new FrameLayout.LayoutParams(a, a, 17));
        this.f6589a = (float) C3421a.m10616a(context, 4.0f);
        Paint paint = new Paint();
        this.f6593e = paint;
        paint.setColor(-1);
        this.f6593e.setStyle(Paint.Style.FILL);
        this.f6593e.setAntiAlias(true);
    }

    /* renamed from: e */
    private void m10532e() {
        this.f6591c = new ArrayList<>();
        int[] iArr = {120, 240, 360};
        for (int i = 0; i < 3; i++) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.3f, 1.0f});
            ofFloat.setDuration(750);
            ofFloat.setRepeatCount(-1);
            ofFloat.setStartDelay((long) iArr[i]);
            this.f6592d.put(ofFloat, new C3394a(i));
            this.f6591c.add(ofFloat);
        }
    }

    /* renamed from: f */
    private boolean m10533f() {
        Iterator<ValueAnimator> it = this.f6591c.iterator();
        if (it.hasNext()) {
            return it.next().isStarted();
        }
        return false;
    }

    /* renamed from: a */
    public void mo18708a(float f, float f2) {
        mo18719g();
    }

    /* renamed from: b */
    public void mo18709b(float f, float f2, float f3) {
        mo18720h();
    }

    /* renamed from: c */
    public void mo18710c(float f, float f2, float f3) {
        mo18720h();
    }

    /* renamed from: g */
    public void mo18719g() {
        if (this.f6591c == null) {
            m10532e();
        }
        if (this.f6591c != null && !m10533f()) {
            for (int i = 0; i < this.f6591c.size(); i++) {
                ValueAnimator valueAnimator = this.f6591c.get(i);
                ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f6592d.get(valueAnimator);
                if (animatorUpdateListener != null) {
                    valueAnimator.addUpdateListener(animatorUpdateListener);
                }
                valueAnimator.start();
            }
            setIndicatorColor(this.f6595g);
        }
    }

    public View getView() {
        return this;
    }

    /* renamed from: h */
    public void mo18720h() {
        ArrayList<ValueAnimator> arrayList = this.f6591c;
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
        setIndicatorColor(this.f6594f);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f6591c != null) {
            for (int i = 0; i < this.f6591c.size(); i++) {
                this.f6591c.get(i).cancel();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float min = (((float) Math.min(getWidth(), getHeight())) - (this.f6589a * 2.0f)) / 6.0f;
        float f = 2.0f * min;
        float width = ((float) (getWidth() / 2)) - (this.f6589a + f);
        float height = (float) (getHeight() / 2);
        for (int i = 0; i < 3; i++) {
            canvas.save();
            float f2 = (float) i;
            canvas.translate((f * f2) + width + (this.f6589a * f2), height);
            float[] fArr = this.f6590b;
            canvas.scale(fArr[i], fArr[i]);
            canvas.drawCircle(0.0f, 0.0f, min, this.f6593e);
            canvas.restore();
        }
    }

    public void reset() {
        mo18720h();
    }

    public void setAnimatingColor(@ColorInt int i) {
        this.f6595g = i;
    }

    public void setIndicatorColor(int i) {
        this.f6593e.setColor(i);
    }

    public void setNormalColor(@ColorInt int i) {
        this.f6594f = i;
    }
}
