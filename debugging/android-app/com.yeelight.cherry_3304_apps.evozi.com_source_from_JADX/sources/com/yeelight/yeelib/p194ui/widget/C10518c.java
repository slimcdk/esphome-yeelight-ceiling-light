package com.yeelight.yeelib.p194ui.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import com.miot.service.connection.wifi.step.SmartConfigStep;
import com.yeelight.yeelib.R$drawable;

/* renamed from: com.yeelight.yeelib.ui.widget.c */
public class C10518c extends CheckBox {

    /* renamed from: a */
    protected Drawable f20081a;

    /* renamed from: b */
    protected Drawable f20082b;

    /* renamed from: c */
    protected int f20083c;

    /* renamed from: d */
    protected Drawable f20084d;

    /* renamed from: e */
    protected Bitmap f20085e;

    /* renamed from: f */
    protected Paint f20086f;

    /* renamed from: g */
    protected Bitmap f20087g;

    /* renamed from: h */
    protected Paint f20088h;

    /* renamed from: i */
    protected Bitmap f20089i;

    /* renamed from: j */
    protected int f20090j;

    /* renamed from: k */
    protected int f20091k;

    /* renamed from: l */
    protected int f20092l;

    /* renamed from: m */
    protected int f20093m;

    /* renamed from: n */
    protected int f20094n;

    /* renamed from: o */
    protected int f20095o;

    /* renamed from: p */
    protected int f20096p;

    /* renamed from: q */
    protected int f20097q;

    /* renamed from: r */
    protected boolean f20098r;

    /* renamed from: s */
    protected boolean f20099s;

    /* renamed from: t */
    protected int f20100t;

    /* renamed from: u */
    protected CompoundButton.OnCheckedChangeListener f20101u;

    /* renamed from: v */
    protected Rect f20102v;

    /* renamed from: w */
    protected Animator f20103w;

    /* renamed from: x */
    protected Animator.AnimatorListener f20104x;

    /* renamed from: y */
    protected boolean f20105y;

    /* renamed from: com.yeelight.yeelib.ui.widget.c$a */
    class C10519a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f20106a;

        /* renamed from: com.yeelight.yeelib.ui.widget.c$a$a */
        class C10520a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ boolean f20108a;

            C10520a(boolean z) {
                this.f20108a = z;
            }

            public void run() {
                C10518c cVar = C10518c.this;
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = cVar.f20101u;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(cVar, this.f20108a);
                }
            }
        }

        C10519a() {
        }

        public void onAnimationCancel(Animator animator) {
            this.f20106a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f20106a) {
                C10518c cVar = C10518c.this;
                cVar.f20103w = null;
                boolean z = cVar.f20095o >= cVar.f20094n;
                if (z != C10518c.this.isChecked()) {
                    C10518c.this.setChecked(z);
                    C10518c cVar2 = C10518c.this;
                    if (cVar2.f20101u != null) {
                        cVar2.post(new C10520a(z));
                    }
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            this.f20106a = false;
        }
    }

    public C10518c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @SuppressLint({"NewApi"})
    public C10518c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20102v = new Rect();
        this.f20105y = true;
        this.f20104x = new C10519a();
        setDrawingCacheEnabled(false);
        this.f20100t = ViewConfiguration.get(context).getScaledTouchSlop() / 2;
        this.f20081a = getResources().getDrawable(R$drawable.sliding_btn_frame_light);
        this.f20082b = getResources().getDrawable(R$drawable.sliding_btn_slider_on_light);
        this.f20084d = getResources().getDrawable(R$drawable.sliding_btn_slider_off_light);
        setBackgroundResource(R$drawable.sliding_btn_bg_light);
        this.f20090j = this.f20081a.getIntrinsicWidth();
        this.f20091k = this.f20081a.getIntrinsicHeight();
        int min = Math.min(this.f20090j, this.f20082b.getIntrinsicWidth());
        this.f20092l = min;
        this.f20093m = 0;
        this.f20094n = this.f20090j - min;
        this.f20095o = 0;
        this.f20085e = Bitmap.createScaledBitmap(new BitmapDrawable(getResources(), BitmapFactory.decodeResource(getResources(), R$drawable.sliding_btn_bar_off_light)).getBitmap(), (this.f20090j * 2) - this.f20092l, this.f20091k, true);
        this.f20087g = Bitmap.createScaledBitmap(new BitmapDrawable(getResources(), BitmapFactory.decodeResource(getResources(), R$drawable.sliding_btn_bar_on_light)).getBitmap(), (this.f20090j * 2) - this.f20092l, this.f20091k, true);
        this.f20081a.setBounds(0, 0, this.f20090j, this.f20091k);
        Drawable drawable = getResources().getDrawable(R$drawable.sliding_btn_mask_light);
        drawable.setBounds(0, 0, this.f20090j, this.f20091k);
        this.f20089i = mo33286c(drawable);
        this.f20086f = new Paint();
        Paint paint = new Paint();
        this.f20088h = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f20086f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void mo33284a(boolean z) {
        Animator animator = this.f20103w;
        if (animator != null) {
            animator.cancel();
            this.f20103w = null;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        int[] iArr = new int[1];
        iArr[0] = z ? this.f20094n : this.f20093m;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "SliderOffset", iArr);
        int[] iArr2 = new int[1];
        iArr2[0] = z ? 255 : 0;
        ObjectAnimator ofInt2 = ObjectAnimator.ofInt(this, "SliderOnAlpha", iArr2);
        ofInt2.setDuration(180);
        ofInt.setDuration(180);
        animatorSet.play(ofInt2).after(ofInt).after(100);
        this.f20103w = animatorSet;
        animatorSet.addListener(this.f20104x);
        this.f20103w.start();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo33285b() {
        mo33284a(!isChecked());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Bitmap mo33286c(Drawable drawable) {
        Rect bounds = drawable.getBounds();
        Bitmap createBitmap = Bitmap.createBitmap(bounds.width(), bounds.height(), Bitmap.Config.ALPHA_8);
        drawable.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo33287d(Canvas canvas) {
        if (this.f20088h.getAlpha() != 0) {
            canvas.drawBitmap(this.f20087g, 0.0f, 0.0f, this.f20088h);
        }
        if (this.f20086f.getAlpha() != 0) {
            canvas.drawBitmap(this.f20085e, 0.0f, 0.0f, this.f20086f);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f20082b.setState(getDrawableState());
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo33289e(int i) {
        int i2 = this.f20095o + i;
        this.f20095o = i2;
        int i3 = this.f20093m;
        if (i2 < i3 || i2 > (i3 = this.f20094n)) {
            this.f20095o = i3;
        }
        setSliderOffset(this.f20095o);
    }

    public int getSliderOffset() {
        return this.f20095o;
    }

    public int getSliderOnAlpha() {
        return this.f20083c;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        canvas.saveLayerAlpha(0.0f, 0.0f, (float) this.f20089i.getWidth(), (float) this.f20089i.getHeight(), isEnabled() ? 255 : SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT, 31);
        canvas.drawBitmap(this.f20089i, 0.0f, 0.0f, (Paint) null);
        mo33287d(canvas);
        this.f20081a.draw(canvas);
        if (this.f20083c <= 255) {
            Drawable drawable = this.f20084d;
            int i = this.f20095o;
            drawable.setBounds(i, 0, this.f20092l + i, this.f20091k);
            this.f20084d.draw(canvas);
        }
        this.f20082b.setAlpha(this.f20083c);
        Drawable drawable2 = this.f20082b;
        int i2 = this.f20095o;
        drawable2.setBounds(i2, 0, this.f20092l + i2, this.f20091k);
        this.f20082b.draw(canvas);
        canvas.restore();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(this.f20090j, this.f20091k);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (!isEnabled() || !this.f20105y) {
            return false;
        }
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        Rect rect = this.f20102v;
        int i = this.f20095o;
        rect.set(i, 0, this.f20092l + i, this.f20091k);
        if (action == 0) {
            if (rect.contains(x, y)) {
                this.f20098r = true;
                setPressed(true);
            } else {
                this.f20098r = false;
            }
            this.f20096p = x;
            this.f20097q = x;
            this.f20099s = false;
        } else if (action == 1) {
            if (!this.f20098r || !this.f20099s) {
                mo33285b();
            } else {
                mo33284a(this.f20095o >= this.f20094n / 2);
            }
            this.f20098r = false;
            this.f20099s = false;
            setPressed(false);
        } else if (action != 2) {
            if (action == 3) {
                this.f20098r = false;
                this.f20099s = false;
                setPressed(false);
                if (this.f20095o >= this.f20094n / 2) {
                    z = true;
                }
                mo33284a(z);
            }
        } else if (this.f20098r) {
            mo33289e(x - this.f20096p);
            this.f20096p = x;
            if (Math.abs(x - this.f20097q) >= this.f20100t) {
                this.f20099s = true;
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        return true;
    }

    public void setButtonDrawable(Drawable drawable) {
    }

    public void setChecked(boolean z) {
        if (isChecked() != z) {
            super.setChecked(z);
            this.f20095o = z ? this.f20094n : this.f20093m;
            int i = 255;
            this.f20088h.setAlpha(z ? 255 : 0);
            this.f20086f.setAlpha(!z ? 255 : 0);
            if (!z) {
                i = 0;
            }
            this.f20083c = i;
            invalidate();
        }
    }

    public void setOnPerformCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f20101u = onCheckedChangeListener;
    }

    public void setOnTouchEnable(boolean z) {
        this.f20105y = z;
    }

    public void setPressed(boolean z) {
        super.setPressed(z);
        invalidate();
    }

    public void setSliderOffset(int i) {
        this.f20095o = i;
        invalidate();
    }

    public void setSliderOnAlpha(int i) {
        this.f20083c = i;
        invalidate();
    }
}
