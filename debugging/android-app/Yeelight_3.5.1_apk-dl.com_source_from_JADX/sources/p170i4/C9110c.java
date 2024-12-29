package p170i4;

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

/* renamed from: i4.c */
public class C9110c extends CheckBox {

    /* renamed from: a */
    protected Drawable f16805a;

    /* renamed from: b */
    protected Drawable f16806b;

    /* renamed from: c */
    protected int f16807c;

    /* renamed from: d */
    protected Drawable f16808d;

    /* renamed from: e */
    protected Bitmap f16809e;

    /* renamed from: f */
    protected Paint f16810f;

    /* renamed from: g */
    protected Bitmap f16811g;

    /* renamed from: h */
    protected Paint f16812h;

    /* renamed from: i */
    protected Bitmap f16813i;

    /* renamed from: j */
    protected int f16814j;

    /* renamed from: k */
    protected int f16815k;

    /* renamed from: l */
    protected int f16816l;

    /* renamed from: m */
    protected int f16817m;

    /* renamed from: n */
    protected int f16818n;

    /* renamed from: o */
    protected int f16819o;

    /* renamed from: p */
    protected int f16820p;

    /* renamed from: q */
    protected int f16821q;

    /* renamed from: r */
    protected boolean f16822r;

    /* renamed from: s */
    protected boolean f16823s;

    /* renamed from: t */
    protected int f16824t;

    /* renamed from: u */
    protected CompoundButton.OnCheckedChangeListener f16825u;

    /* renamed from: v */
    protected Rect f16826v;

    /* renamed from: w */
    protected Animator f16827w;

    /* renamed from: x */
    protected Animator.AnimatorListener f16828x;

    /* renamed from: y */
    protected boolean f16829y;

    /* renamed from: i4.c$a */
    class C9111a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f16830a;

        /* renamed from: i4.c$a$a */
        class C9112a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ boolean f16832a;

            C9112a(boolean z) {
                this.f16832a = z;
            }

            public void run() {
                C9110c cVar = C9110c.this;
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = cVar.f16825u;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(cVar, this.f16832a);
                }
            }
        }

        C9111a() {
        }

        public void onAnimationCancel(Animator animator) {
            this.f16830a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f16830a) {
                C9110c cVar = C9110c.this;
                cVar.f16827w = null;
                boolean z = cVar.f16819o >= cVar.f16818n;
                if (z != cVar.isChecked()) {
                    C9110c.this.setChecked(z);
                    C9110c cVar2 = C9110c.this;
                    if (cVar2.f16825u != null) {
                        cVar2.post(new C9112a(z));
                    }
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            this.f16830a = false;
        }
    }

    public C9110c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @SuppressLint({"NewApi"})
    public C9110c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16826v = new Rect();
        this.f16829y = true;
        this.f16828x = new C9111a();
        setDrawingCacheEnabled(false);
        this.f16824t = ViewConfiguration.get(context).getScaledTouchSlop() / 2;
        this.f16805a = getResources().getDrawable(R$drawable.sliding_btn_frame_light);
        this.f16806b = getResources().getDrawable(R$drawable.sliding_btn_slider_on_light);
        this.f16808d = getResources().getDrawable(R$drawable.sliding_btn_slider_off_light);
        setBackgroundResource(R$drawable.sliding_btn_bg_light);
        this.f16814j = this.f16805a.getIntrinsicWidth();
        this.f16815k = this.f16805a.getIntrinsicHeight();
        int min = Math.min(this.f16814j, this.f16806b.getIntrinsicWidth());
        this.f16816l = min;
        this.f16817m = 0;
        this.f16818n = this.f16814j - min;
        this.f16819o = 0;
        this.f16809e = Bitmap.createScaledBitmap(new BitmapDrawable(getResources(), BitmapFactory.decodeResource(getResources(), R$drawable.sliding_btn_bar_off_light)).getBitmap(), (this.f16814j * 2) - this.f16816l, this.f16815k, true);
        this.f16811g = Bitmap.createScaledBitmap(new BitmapDrawable(getResources(), BitmapFactory.decodeResource(getResources(), R$drawable.sliding_btn_bar_on_light)).getBitmap(), (this.f16814j * 2) - this.f16816l, this.f16815k, true);
        this.f16805a.setBounds(0, 0, this.f16814j, this.f16815k);
        Drawable drawable = getResources().getDrawable(R$drawable.sliding_btn_mask_light);
        drawable.setBounds(0, 0, this.f16814j, this.f16815k);
        this.f16813i = mo37133c(drawable);
        this.f16810f = new Paint();
        Paint paint = new Paint();
        this.f16812h = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f16810f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void mo37131a(boolean z) {
        Animator animator = this.f16827w;
        if (animator != null) {
            animator.cancel();
            this.f16827w = null;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        int[] iArr = new int[1];
        iArr[0] = z ? this.f16818n : this.f16817m;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "SliderOffset", iArr);
        int[] iArr2 = new int[1];
        iArr2[0] = z ? 255 : 0;
        ObjectAnimator ofInt2 = ObjectAnimator.ofInt(this, "SliderOnAlpha", iArr2);
        ofInt2.setDuration(180);
        ofInt.setDuration(180);
        animatorSet.play(ofInt2).after(ofInt).after(100);
        this.f16827w = animatorSet;
        animatorSet.addListener(this.f16828x);
        this.f16827w.start();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo37132b() {
        mo37131a(!isChecked());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Bitmap mo37133c(Drawable drawable) {
        Rect bounds = drawable.getBounds();
        Bitmap createBitmap = Bitmap.createBitmap(bounds.width(), bounds.height(), Bitmap.Config.ALPHA_8);
        drawable.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo37134d(Canvas canvas) {
        if (this.f16812h.getAlpha() != 0) {
            canvas.drawBitmap(this.f16811g, 0.0f, 0.0f, this.f16812h);
        }
        if (this.f16810f.getAlpha() != 0) {
            canvas.drawBitmap(this.f16809e, 0.0f, 0.0f, this.f16810f);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f16806b.setState(getDrawableState());
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo37136e(int i) {
        int i2 = this.f16819o + i;
        this.f16819o = i2;
        int i3 = this.f16817m;
        if (i2 < i3 || i2 > (i3 = this.f16818n)) {
            this.f16819o = i3;
        }
        setSliderOffset(this.f16819o);
    }

    public int getSliderOffset() {
        return this.f16819o;
    }

    public int getSliderOnAlpha() {
        return this.f16807c;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        canvas.saveLayerAlpha(0.0f, 0.0f, (float) this.f16813i.getWidth(), (float) this.f16813i.getHeight(), isEnabled() ? 255 : SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT, 31);
        canvas.drawBitmap(this.f16813i, 0.0f, 0.0f, (Paint) null);
        mo37134d(canvas);
        this.f16805a.draw(canvas);
        if (this.f16807c <= 255) {
            Drawable drawable = this.f16808d;
            int i = this.f16819o;
            drawable.setBounds(i, 0, this.f16816l + i, this.f16815k);
            this.f16808d.draw(canvas);
        }
        this.f16806b.setAlpha(this.f16807c);
        Drawable drawable2 = this.f16806b;
        int i2 = this.f16819o;
        drawable2.setBounds(i2, 0, this.f16816l + i2, this.f16815k);
        this.f16806b.draw(canvas);
        canvas.restore();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(this.f16814j, this.f16815k);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (!isEnabled() || !this.f16829y) {
            return false;
        }
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        Rect rect = this.f16826v;
        int i = this.f16819o;
        rect.set(i, 0, this.f16816l + i, this.f16815k);
        if (action == 0) {
            if (rect.contains(x, y)) {
                this.f16822r = true;
                setPressed(true);
            } else {
                this.f16822r = false;
            }
            this.f16820p = x;
            this.f16821q = x;
            this.f16823s = false;
        } else if (action == 1) {
            if (!this.f16822r || !this.f16823s) {
                mo37132b();
            } else {
                mo37131a(this.f16819o >= this.f16818n / 2);
            }
            this.f16822r = false;
            this.f16823s = false;
            setPressed(false);
        } else if (action != 2) {
            if (action == 3) {
                this.f16822r = false;
                this.f16823s = false;
                setPressed(false);
                if (this.f16819o >= this.f16818n / 2) {
                    z = true;
                }
                mo37131a(z);
            }
        } else if (this.f16822r) {
            mo37136e(x - this.f16820p);
            this.f16820p = x;
            if (Math.abs(x - this.f16821q) >= this.f16824t) {
                this.f16823s = true;
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
            this.f16819o = z ? this.f16818n : this.f16817m;
            int i = 255;
            this.f16812h.setAlpha(z ? 255 : 0);
            this.f16810f.setAlpha(!z ? 255 : 0);
            if (!z) {
                i = 0;
            }
            this.f16807c = i;
            invalidate();
        }
    }

    public void setOnPerformCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f16825u = onCheckedChangeListener;
    }

    public void setOnTouchEnable(boolean z) {
        this.f16829y = z;
    }

    public void setPressed(boolean z) {
        super.setPressed(z);
        invalidate();
    }

    public void setSliderOffset(int i) {
        this.f16819o = i;
        invalidate();
    }

    public void setSliderOnAlpha(int i) {
        this.f16807c = i;
        invalidate();
    }
}
