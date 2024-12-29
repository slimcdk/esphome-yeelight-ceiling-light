package com.yeelight.cherry.p141ui.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import com.yeelight.cherry.C12224R$drawable;
import p051j4.C9193k;
import p112w2.C3894a;

/* renamed from: com.yeelight.cherry.ui.view.CurtainControlView */
public class CurtainControlView extends View implements GestureDetector.OnGestureListener {

    /* renamed from: a */
    private int f12186a;

    /* renamed from: b */
    private int f12187b;

    /* renamed from: c */
    private Paint f12188c;

    /* renamed from: d */
    private Paint f12189d;

    /* renamed from: e */
    private int f12190e;

    /* renamed from: f */
    private int f12191f;

    /* renamed from: g */
    private Path f12192g;

    /* renamed from: h */
    private RectF f12193h;

    /* renamed from: i */
    private RectF f12194i;

    /* renamed from: j */
    private RectF f12195j;

    /* renamed from: k */
    private RectF f12196k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public float f12197l = 1.0f;

    /* renamed from: m */
    private int f12198m;

    /* renamed from: n */
    private int f12199n = 1;

    /* renamed from: o */
    private GestureDetector f12200o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C6025b f12201p;

    /* renamed from: q */
    private ValueAnimator f12202q;

    /* renamed from: com.yeelight.cherry.ui.view.CurtainControlView$a */
    class C6024a implements ValueAnimator.AnimatorUpdateListener {
        C6024a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float unused = CurtainControlView.this.f12197l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            CurtainControlView.this.invalidate();
            if (CurtainControlView.this.f12201p != null) {
                CurtainControlView.this.f12201p.mo30362f((int) (CurtainControlView.this.f12197l * 100.0f));
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.view.CurtainControlView$b */
    public interface C6025b {
        /* renamed from: a */
        void mo30361a(int i);

        /* renamed from: f */
        void mo30362f(int i);
    }

    public CurtainControlView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m17540i();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        if (r8 > 0.0f) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        if (r8 < 0.0f) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        if (r8 > 0.0f) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        if (r8 <= 0.0f) goto L_0x0043;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0071  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m17537e(android.view.MotionEvent r7, float r8) {
        /*
            r6 = this;
            int r0 = r6.f12190e
            int r1 = r6.f12191f
            r2 = 2
            int r1 = r1 * 2
            int r0 = r0 - r1
            int r1 = r6.f12187b
            int r1 = r1 * 2
            int r0 = r0 - r1
            int r1 = r6.f12199n
            r3 = 1
            if (r1 != r3) goto L_0x0014
            int r0 = r0 / 2
        L_0x0014:
            float r0 = (float) r0
            float r8 = r8 / r0
            float r0 = r6.f12197l
            r4 = 0
            r5 = 0
            if (r1 != r3) goto L_0x003a
            float r7 = r7.getX()
            int r0 = r6.f12190e
            int r0 = r0 / r2
            float r0 = (float) r0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 > 0) goto L_0x0031
            float r7 = r6.f12197l
            float r0 = r7 - r8
            int r7 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x0042
            goto L_0x0043
        L_0x0031:
            float r7 = r6.f12197l
            float r0 = r7 + r8
            int r7 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0042
            goto L_0x0043
        L_0x003a:
            if (r1 != r2) goto L_0x0045
            float r0 = r0 - r8
            int r7 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            r3 = 0
        L_0x0043:
            r4 = r3
            goto L_0x004e
        L_0x0045:
            r7 = 3
            if (r1 != r7) goto L_0x004e
            float r0 = r0 + r8
            int r7 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0042
            goto L_0x0043
        L_0x004e:
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x0055
            r6.f12197l = r5
            goto L_0x006d
        L_0x0055:
            r7 = 1065353216(0x3f800000, float:1.0)
            int r8 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r8 > 0) goto L_0x006b
            if (r4 == 0) goto L_0x0068
            double r1 = (double) r0
            r3 = 4606732058837280358(0x3fee666666666666, double:0.95)
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 <= 0) goto L_0x0068
            goto L_0x006b
        L_0x0068:
            r6.f12197l = r0
            goto L_0x006d
        L_0x006b:
            r6.f12197l = r7
        L_0x006d:
            com.yeelight.cherry.ui.view.CurtainControlView$b r7 = r6.f12201p
            if (r7 == 0) goto L_0x007b
            float r8 = r6.f12197l
            r0 = 1120403456(0x42c80000, float:100.0)
            float r8 = r8 * r0
            int r8 = (int) r8
            r7.mo30362f(r8)
        L_0x007b:
            q3.a r7 = new q3.a
            r7.<init>(r6)
            r6.post(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p141ui.view.CurtainControlView.m17537e(android.view.MotionEvent, float):void");
    }

    /* renamed from: g */
    private void m17538g(Canvas canvas, float f) {
        canvas.save();
        canvas.clipPath(this.f12192g);
        this.f12188c.setColor(Color.parseColor("#fafafa"));
        canvas.drawRect(this.f12193h, this.f12188c);
        this.f12188c.setColor(Color.parseColor("#FDC148"));
        canvas.drawRect(this.f12194i, this.f12188c);
        int i = this.f12199n;
        if (1 == i) {
            int i2 = this.f12190e;
            int i3 = this.f12187b;
            int i4 = this.f12191f;
            int i5 = (int) ((((float) ((i2 - (i3 * 2)) - (i4 * 2))) * f) / 2.0f);
            RectF rectF = this.f12195j;
            rectF.right = (float) (i4 + i3 + i5);
            this.f12196k.left = (float) (((i2 - i3) - i5) - i4);
            canvas.drawRect(rectF, this.f12189d);
            canvas.drawRect(this.f12196k, this.f12189d);
            RectF rectF2 = this.f12195j;
            float f2 = rectF2.right;
            Canvas canvas2 = canvas;
            canvas2.drawLine(f2, rectF2.top, f2, rectF2.bottom, this.f12188c);
            RectF rectF3 = this.f12196k;
            float f3 = rectF3.left;
            canvas2.drawLine(f3, rectF3.top, f3, rectF3.bottom, this.f12188c);
        } else if (2 == i) {
            int i6 = this.f12190e;
            int i7 = this.f12187b;
            int i8 = this.f12191f;
            int i9 = (int) (((float) ((i6 - i7) - (i8 * 2))) * f);
            RectF rectF4 = this.f12195j;
            rectF4.right = (float) (i8 + i7 + i9);
            canvas.drawRect(rectF4, this.f12189d);
        } else if (3 == i) {
            int i10 = this.f12190e;
            int i11 = this.f12187b;
            int i12 = this.f12191f;
            RectF rectF5 = this.f12196k;
            rectF5.left = (float) (((i10 - i12) - i11) - ((int) (((float) ((i10 - i11) - (i12 * 2))) * f)));
            canvas.drawRect(rectF5, this.f12189d);
        }
        canvas.restore();
    }

    private Bitmap getMoveBitmap() {
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), C12224R$drawable.icon_yeelight_curtain_drag);
        int b = C9193k.m22151b(getContext(), 40.0f);
        return Bitmap.createScaledBitmap(decodeResource, b, b, true);
    }

    /* renamed from: h */
    private void m17539h(Canvas canvas) {
        float f;
        Bitmap moveBitmap = getMoveBitmap();
        int width = (int) (this.f12195j.right - ((float) (moveBitmap.getWidth() / 2)));
        RectF rectF = this.f12195j;
        float f2 = rectF.bottom;
        float f3 = rectF.top;
        int height = (int) ((((f2 - f3) / 2.0f) + f3) - ((float) (moveBitmap.getHeight() / 2)));
        int width2 = (int) (this.f12196k.left - ((float) (moveBitmap.getWidth() / 2)));
        int i = this.f12199n;
        if (1 == i) {
            float f4 = (float) height;
            canvas.drawBitmap(moveBitmap, (float) width, f4, this.f12188c);
            canvas.drawBitmap(moveBitmap, (float) width2, f4, this.f12188c);
            moveBitmap.recycle();
            return;
        }
        if (2 == i) {
            f = (float) width;
        } else if (3 == i) {
            f = (float) width2;
        } else {
            return;
        }
        canvas.drawBitmap(moveBitmap, f, (float) height, this.f12188c);
    }

    /* renamed from: i */
    private void m17540i() {
        GestureDetector gestureDetector = new GestureDetector(getContext(), this);
        this.f12200o = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.f12186a = C9193k.m22151b(getContext(), 16.5f);
        this.f12187b = C9193k.m22151b(getContext(), 17.0f);
        this.f12191f = C9193k.m22151b(getContext(), 20.0f);
        Paint paint = new Paint();
        this.f12188c = paint;
        paint.setAntiAlias(true);
        this.f12188c.setStrokeWidth((float) C3894a.m11093a(getContext(), 1.0f));
        Paint paint2 = new Paint();
        this.f12189d = paint2;
        paint2.setAntiAlias(true);
        this.f12193h = new RectF((float) this.f12191f, 0.0f, 0.0f, 0.0f);
        this.f12194i = new RectF((float) this.f12191f, 0.0f, 0.0f, (float) this.f12186a);
        this.f12195j = new RectF((float) this.f12191f, (float) this.f12186a, (float) this.f12187b, 0.0f);
        this.f12196k = new RectF((float) this.f12191f, (float) this.f12186a, 0.0f, 0.0f);
        this.f12192g = new Path();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m17541j() {
        invalidate();
    }

    /* renamed from: n */
    private void m17542n(float f) {
        if (f != this.f12197l) {
            if (this.f12202q == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f12202q = valueAnimator;
                valueAnimator.setInterpolator(new LinearInterpolator());
                this.f12202q.addUpdateListener(new C6024a());
            }
            this.f12202q.cancel();
            this.f12202q.setDuration((long) (((float) (this.f12198m * 1000)) * Math.abs(f - this.f12197l)));
            this.f12202q.setFloatValues(new float[]{this.f12197l, f});
            this.f12202q.start();
        }
    }

    /* renamed from: f */
    public void mo31369f() {
        m17542n(1.0f);
    }

    /* renamed from: k */
    public int mo31370k(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        return mode == 1073741824 ? size : mode == Integer.MIN_VALUE ? Math.min(i, size) : i;
    }

    /* renamed from: l */
    public void mo31371l() {
        m17542n(0.0f);
    }

    /* renamed from: m */
    public void mo31372m() {
        ValueAnimator valueAnimator = this.f12202q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        m17538g(canvas, this.f12197l);
        m17539h(canvas);
        super.onDraw(canvas);
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int k = mo31370k(C9193k.m22151b(getContext(), 200.0f), i);
        this.f12190e = k;
        int i3 = this.f12191f;
        double d = (double) (k - (i3 * 2));
        Double.isNaN(d);
        int i4 = (int) (d * 1.128d);
        RectF rectF = this.f12193h;
        rectF.right = (float) (k - i3);
        float f = (float) i4;
        rectF.bottom = f;
        this.f12194i.right = (float) (k - i3);
        this.f12195j.bottom = f;
        RectF rectF2 = this.f12196k;
        rectF2.bottom = f;
        rectF2.left = (float) ((k - this.f12187b) - i3);
        rectF2.right = (float) (k - i3);
        int a = C3894a.m11093a(getContext(), 12.0f);
        this.f12192g.reset();
        float f2 = (float) a;
        this.f12192g.addRoundRect(this.f12193h, f2, f2, Path.Direction.CW);
        this.f12189d.setShader(new LinearGradient(0.0f, (float) this.f12186a, 0.0f, f, Color.parseColor("#FFDE97"), Color.parseColor("#FDD179"), Shader.TileMode.CLAMP));
        setMeasuredDimension(this.f12190e, i4);
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        m17537e(motionEvent, f);
        return false;
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C6025b bVar;
        GestureDetector gestureDetector = this.f12200o;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 1 && (bVar = this.f12201p) != null) {
            bVar.mo30361a((int) (this.f12197l * 100.0f));
        }
        return true;
    }

    public void setCurtainMode(int i) {
        if (i == 0) {
            i = 1;
        }
        this.f12199n = i;
        invalidate();
    }

    public void setOnStatusChangeListener(C6025b bVar) {
        this.f12201p = bVar;
    }

    public void setProgress(int i) {
        this.f12197l = ((float) (100 - i)) / 100.0f;
        invalidate();
    }

    public void setRouteTime(int i) {
        if (i < 1) {
            i = 1;
        } else if (i > 255) {
            i = 255;
        }
        this.f12198m = i;
    }
}
