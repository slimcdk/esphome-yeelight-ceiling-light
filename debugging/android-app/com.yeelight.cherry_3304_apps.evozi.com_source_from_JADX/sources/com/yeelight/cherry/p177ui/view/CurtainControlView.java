package com.yeelight.cherry.p177ui.view;

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
import com.lcodecore.tkrefreshlayout.p144j.C3421a;
import com.yeelight.cherry.C11744R$drawable;
import com.yeelight.yeelib.utils.C10547m;

/* renamed from: com.yeelight.cherry.ui.view.CurtainControlView */
public class CurtainControlView extends View implements GestureDetector.OnGestureListener {

    /* renamed from: a */
    private int f12591a;

    /* renamed from: b */
    private int f12592b;

    /* renamed from: c */
    private Paint f12593c;

    /* renamed from: d */
    private Paint f12594d;

    /* renamed from: e */
    private int f12595e;

    /* renamed from: f */
    private int f12596f;

    /* renamed from: g */
    private Path f12597g;

    /* renamed from: h */
    private RectF f12598h;

    /* renamed from: i */
    private RectF f12599i;

    /* renamed from: j */
    private RectF f12600j;

    /* renamed from: k */
    private RectF f12601k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public float f12602l = 1.0f;

    /* renamed from: m */
    private int f12603m;

    /* renamed from: n */
    private int f12604n = 1;

    /* renamed from: o */
    private GestureDetector f12605o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C5963b f12606p;

    /* renamed from: q */
    private ValueAnimator f12607q;

    /* renamed from: com.yeelight.cherry.ui.view.CurtainControlView$a */
    class C5962a implements ValueAnimator.AnimatorUpdateListener {
        C5962a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float unused = CurtainControlView.this.f12602l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            CurtainControlView.this.invalidate();
            if (CurtainControlView.this.f12606p != null) {
                CurtainControlView.this.f12606p.mo26320f((int) (CurtainControlView.this.f12602l * 100.0f));
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.view.CurtainControlView$b */
    public interface C5963b {
        /* renamed from: a */
        void mo26319a(int i);

        /* renamed from: f */
        void mo26320f(int i);
    }

    public CurtainControlView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m17466h();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
        if (r8 > 0.0f) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        if (r8 < 0.0f) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        if (r8 > 0.0f) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        if (r8 <= 0.0f) goto L_0x0045;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m17463d(android.view.MotionEvent r7, float r8) {
        /*
            r6 = this;
            int r0 = r6.f12595e
            int r1 = r6.f12596f
            r2 = 2
            int r1 = r1 * 2
            int r0 = r0 - r1
            int r1 = r6.f12592b
            int r1 = r1 * 2
            int r0 = r0 - r1
            int r1 = r6.f12604n
            r3 = 1
            if (r1 != r3) goto L_0x0014
            int r0 = r0 / 2
        L_0x0014:
            float r0 = (float) r0
            float r8 = r8 / r0
            float r0 = r6.f12602l
            int r1 = r6.f12604n
            r4 = 0
            r5 = 0
            if (r1 != r3) goto L_0x003c
            float r7 = r7.getX()
            int r0 = r6.f12595e
            int r0 = r0 / r2
            float r0 = (float) r0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 > 0) goto L_0x0033
            float r7 = r6.f12602l
            float r0 = r7 - r8
            int r7 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x0044
            goto L_0x0045
        L_0x0033:
            float r7 = r6.f12602l
            float r0 = r7 + r8
            int r7 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0044
            goto L_0x0045
        L_0x003c:
            if (r1 != r2) goto L_0x0047
            float r0 = r0 - r8
            int r7 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r3 = 0
        L_0x0045:
            r4 = r3
            goto L_0x0050
        L_0x0047:
            r7 = 3
            if (r1 != r7) goto L_0x0050
            float r0 = r0 + r8
            int r7 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0044
            goto L_0x0045
        L_0x0050:
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x0057
            r6.f12602l = r5
            goto L_0x006f
        L_0x0057:
            r7 = 1065353216(0x3f800000, float:1.0)
            int r8 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r8 > 0) goto L_0x006d
            if (r4 == 0) goto L_0x006a
            double r1 = (double) r0
            r3 = 4606732058837280358(0x3fee666666666666, double:0.95)
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 <= 0) goto L_0x006a
            goto L_0x006d
        L_0x006a:
            r6.f12602l = r0
            goto L_0x006f
        L_0x006d:
            r6.f12602l = r7
        L_0x006f:
            com.yeelight.cherry.ui.view.CurtainControlView$b r7 = r6.f12606p
            if (r7 == 0) goto L_0x007d
            float r8 = r6.f12602l
            r0 = 1120403456(0x42c80000, float:100.0)
            float r8 = r8 * r0
            int r8 = (int) r8
            r7.mo26320f(r8)
        L_0x007d:
            com.yeelight.cherry.ui.view.a r7 = new com.yeelight.cherry.ui.view.a
            r7.<init>(r6)
            r6.post(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p177ui.view.CurtainControlView.m17463d(android.view.MotionEvent, float):void");
    }

    /* renamed from: f */
    private void m17464f(Canvas canvas, float f) {
        canvas.save();
        canvas.clipPath(this.f12597g);
        this.f12593c.setColor(Color.parseColor("#fafafa"));
        canvas.drawRect(this.f12598h, this.f12593c);
        this.f12593c.setColor(Color.parseColor("#FDC148"));
        canvas.drawRect(this.f12599i, this.f12593c);
        int i = this.f12604n;
        if (1 == i) {
            int i2 = this.f12595e;
            int i3 = this.f12592b;
            int i4 = this.f12596f;
            int i5 = (int) ((((float) ((i2 - (i3 * 2)) - (i4 * 2))) * f) / 2.0f);
            RectF rectF = this.f12600j;
            rectF.right = (float) (i4 + i3 + i5);
            this.f12601k.left = (float) (((i2 - i3) - i5) - i4);
            canvas.drawRect(rectF, this.f12594d);
            canvas.drawRect(this.f12601k, this.f12594d);
            RectF rectF2 = this.f12600j;
            float f2 = rectF2.right;
            Canvas canvas2 = canvas;
            canvas2.drawLine(f2, rectF2.top, f2, rectF2.bottom, this.f12593c);
            RectF rectF3 = this.f12601k;
            float f3 = rectF3.left;
            canvas2.drawLine(f3, rectF3.top, f3, rectF3.bottom, this.f12593c);
        } else if (2 == i) {
            int i6 = this.f12595e;
            int i7 = this.f12592b;
            int i8 = this.f12596f;
            int i9 = (int) (((float) ((i6 - i7) - (i8 * 2))) * f);
            RectF rectF4 = this.f12600j;
            rectF4.right = (float) (i8 + i7 + i9);
            canvas.drawRect(rectF4, this.f12594d);
        } else if (3 == i) {
            int i10 = this.f12595e;
            int i11 = this.f12592b;
            int i12 = this.f12596f;
            RectF rectF5 = this.f12601k;
            rectF5.left = (float) (((i10 - i12) - i11) - ((int) (((float) ((i10 - i11) - (i12 * 2))) * f)));
            canvas.drawRect(rectF5, this.f12594d);
        }
        canvas.restore();
    }

    /* renamed from: g */
    private void m17465g(Canvas canvas) {
        float f;
        Bitmap moveBitmap = getMoveBitmap();
        int width = (int) (this.f12600j.right - ((float) (moveBitmap.getWidth() / 2)));
        RectF rectF = this.f12600j;
        float f2 = rectF.bottom;
        float f3 = rectF.top;
        int height = (int) ((((f2 - f3) / 2.0f) + f3) - ((float) (moveBitmap.getHeight() / 2)));
        int width2 = (int) (this.f12601k.left - ((float) (moveBitmap.getWidth() / 2)));
        int i = this.f12604n;
        if (1 == i) {
            float f4 = (float) height;
            canvas.drawBitmap(moveBitmap, (float) width, f4, this.f12593c);
            canvas.drawBitmap(moveBitmap, (float) width2, f4, this.f12593c);
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
        canvas.drawBitmap(moveBitmap, f, (float) height, this.f12593c);
    }

    private Bitmap getMoveBitmap() {
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), C11744R$drawable.icon_yeelight_curtain_drag);
        int b = C10547m.m25752b(getContext(), 40.0f);
        return Bitmap.createScaledBitmap(decodeResource, b, b, true);
    }

    /* renamed from: h */
    private void m17466h() {
        GestureDetector gestureDetector = new GestureDetector(getContext(), this);
        this.f12605o = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.f12591a = C10547m.m25752b(getContext(), 16.5f);
        this.f12592b = C10547m.m25752b(getContext(), 17.0f);
        this.f12596f = C10547m.m25752b(getContext(), 20.0f);
        Paint paint = new Paint();
        this.f12593c = paint;
        paint.setAntiAlias(true);
        this.f12593c.setStrokeWidth((float) C3421a.m10616a(getContext(), 1.0f));
        Paint paint2 = new Paint();
        this.f12594d = paint2;
        paint2.setAntiAlias(true);
        this.f12598h = new RectF((float) this.f12596f, 0.0f, 0.0f, 0.0f);
        this.f12599i = new RectF((float) this.f12596f, 0.0f, 0.0f, (float) this.f12591a);
        this.f12600j = new RectF((float) this.f12596f, (float) this.f12591a, (float) this.f12592b, 0.0f);
        this.f12601k = new RectF((float) this.f12596f, (float) this.f12591a, 0.0f, 0.0f);
        this.f12597g = new Path();
    }

    /* renamed from: m */
    private void m17467m(float f) {
        if (f != this.f12602l) {
            if (this.f12607q == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f12607q = valueAnimator;
                valueAnimator.setInterpolator(new LinearInterpolator());
                this.f12607q.addUpdateListener(new C5962a());
            }
            this.f12607q.cancel();
            this.f12607q.setDuration((long) (((float) (this.f12603m * 1000)) * Math.abs(f - this.f12602l)));
            this.f12607q.setFloatValues(new float[]{this.f12602l, f});
            this.f12607q.start();
        }
    }

    /* renamed from: e */
    public void mo27425e() {
        m17467m(1.0f);
    }

    /* renamed from: i */
    public /* synthetic */ void mo27426i() {
        invalidate();
    }

    /* renamed from: j */
    public int mo27427j(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        return mode == 1073741824 ? size : mode == Integer.MIN_VALUE ? Math.min(i, size) : i;
    }

    /* renamed from: k */
    public void mo27428k() {
        m17467m(0.0f);
    }

    /* renamed from: l */
    public void mo27429l() {
        ValueAnimator valueAnimator = this.f12607q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        m17464f(canvas, this.f12602l);
        m17465g(canvas);
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
        int j = mo27427j(C10547m.m25752b(getContext(), 200.0f), i);
        this.f12595e = j;
        int i3 = this.f12596f;
        double d = (double) (j - (i3 * 2));
        Double.isNaN(d);
        int i4 = (int) (d * 1.128d);
        RectF rectF = this.f12598h;
        rectF.right = (float) (j - i3);
        float f = (float) i4;
        rectF.bottom = f;
        this.f12599i.right = (float) (j - i3);
        this.f12600j.bottom = f;
        RectF rectF2 = this.f12601k;
        rectF2.bottom = f;
        rectF2.left = (float) ((j - this.f12592b) - i3);
        rectF2.right = (float) (j - i3);
        int a = C3421a.m10616a(getContext(), 12.0f);
        this.f12597g.reset();
        float f2 = (float) a;
        this.f12597g.addRoundRect(this.f12598h, f2, f2, Path.Direction.CW);
        this.f12594d.setShader(new LinearGradient(0.0f, (float) this.f12591a, 0.0f, f, Color.parseColor("#FFDE97"), Color.parseColor("#FDD179"), Shader.TileMode.CLAMP));
        setMeasuredDimension(this.f12595e, i4);
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        m17463d(motionEvent, f);
        return false;
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C5963b bVar;
        GestureDetector gestureDetector = this.f12605o;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 1 && (bVar = this.f12606p) != null) {
            bVar.mo26319a((int) (this.f12602l * 100.0f));
        }
        return true;
    }

    public void setCurtainMode(int i) {
        if (i == 0) {
            i = 1;
        }
        this.f12604n = i;
        invalidate();
    }

    public void setOnStatusChangeListener(C5963b bVar) {
        this.f12606p = bVar;
    }

    public void setProgress(int i) {
        this.f12602l = ((float) (100 - i)) / 100.0f;
        invalidate();
    }

    public void setRouteTime(int i) {
        if (i < 1) {
            i = 1;
        } else if (i > 255) {
            i = 255;
        }
        this.f12603m = i;
    }
}
