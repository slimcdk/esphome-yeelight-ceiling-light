package com.yeelight.yeelib.p142ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import com.yeelight.yeelib.R$styleable;
import p051j4.C9193k;

/* renamed from: com.yeelight.yeelib.ui.view.GradientView */
public class GradientView extends View {

    /* renamed from: v */
    private static final int[] f15774v = {SupportMenu.CATEGORY_MASK, InputDeviceCompat.SOURCE_ANY, -16711936, -16711681, -16776961, -65281, SupportMenu.CATEGORY_MASK};

    /* renamed from: w */
    private static final int[] f15775w = {-1, 0};

    /* renamed from: a */
    private GradientView f15776a;

    /* renamed from: b */
    private Shader f15777b;

    /* renamed from: c */
    private Drawable f15778c;

    /* renamed from: d */
    private Paint f15779d;

    /* renamed from: e */
    private Paint f15780e;

    /* renamed from: f */
    private RectF f15781f = new RectF();

    /* renamed from: g */
    private float[] f15782g = {1.0f, 1.0f, 1.0f};

    /* renamed from: h */
    private float f15783h = 0.0f;

    /* renamed from: i */
    private int f15784i = 0;

    /* renamed from: j */
    private boolean f15785j = false;

    /* renamed from: k */
    private boolean f15786k = false;

    /* renamed from: l */
    private int f15787l = Integer.MIN_VALUE;

    /* renamed from: m */
    private int f15788m;

    /* renamed from: n */
    private int f15789n;

    /* renamed from: o */
    private int f15790o;

    /* renamed from: p */
    private boolean f15791p = false;

    /* renamed from: q */
    private C8810b f15792q;

    /* renamed from: r */
    private C8811c f15793r;

    /* renamed from: s */
    private int f15794s;

    /* renamed from: t */
    private float f15795t;

    /* renamed from: u */
    private float f15796u;

    /* renamed from: com.yeelight.yeelib.ui.view.GradientView$SavedState */
    private static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C8808a();

        /* renamed from: a */
        int f15797a;

        /* renamed from: b */
        boolean f15798b;

        /* renamed from: com.yeelight.yeelib.ui.view.GradientView$SavedState$a */
        class C8808a implements Parcelable.Creator<SavedState> {
            C8808a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (C8809a) null);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f15797a = parcel.readInt();
            this.f15798b = parcel.readInt() != 1 ? false : true;
        }

        /* synthetic */ SavedState(Parcel parcel, C8809a aVar) {
            this(parcel);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f15797a);
            parcel.writeInt(this.f15798b ? 1 : 0);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.GradientView$a */
    class C8809a implements Runnable {
        C8809a() {
        }

        public void run() {
            GradientView.this.invalidate();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.GradientView$b */
    public interface C8810b {
        /* renamed from: a */
        void mo36307a(GradientView gradientView, int i);
    }

    /* renamed from: com.yeelight.yeelib.ui.view.GradientView$c */
    public interface C8811c {
        /* renamed from: a */
        void mo36308a(GradientView gradientView, float f);
    }

    public GradientView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m20820g(attributeSet);
    }

    /* renamed from: a */
    private int m20816a(float f) {
        float f2 = 1.0f - f;
        RectF rectF = this.f15781f;
        return (int) (rectF.left + (rectF.width() * f2));
    }

    /* renamed from: b */
    private void m20817b() {
    }

    /* renamed from: c */
    private float m20818c(float f, float f2) {
        RectF rectF = this.f15781f;
        float f3 = f - rectF.left;
        float f4 = f2 - rectF.top;
        float width = rectF.width() - 1.0f;
        float height = this.f15781f.height();
        float f5 = height * height;
        return (((f3 * width) + f5) - (height * f4)) / ((width * width) + f5);
    }

    /* renamed from: f */
    private int m20819f(float f) {
        RectF rectF = this.f15781f;
        return (int) (rectF.left + ((f * rectF.width()) / 360.0f));
    }

    /* renamed from: g */
    private void m20820g(AttributeSet attributeSet) {
        setClickable(true);
        this.f15779d = new Paint(1);
        Paint paint = new Paint(1);
        this.f15780e = paint;
        paint.setColor(-1);
        setLayerType(1, isInEditMode() ? null : this.f15779d);
        this.f15783h = TypedValue.applyDimension(1, 10.0f, getResources().getDisplayMetrics());
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.GradientView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R$styleable.GradientView_radius) {
                    setRadius((float) obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R$styleable.GradientView_pointerDrawable) {
                    setPointerDrawable(obtainStyledAttributes.getDrawable(index));
                } else if (index == R$styleable.GradientView_lockPointerInBounds) {
                    setLockPointerInBounds(obtainStyledAttributes.getBoolean(index, false));
                } else if (index == R$styleable.GradientView_ctMode) {
                    setIsCtModeGradient(obtainStyledAttributes.getBoolean(index, false));
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: i */
    private void m20821i(Canvas canvas) {
        float f;
        float f2;
        if (this.f15778c != null) {
            int height = getHeight();
            int i = this.f15790o >> 1;
            int i2 = this.f15789n;
            int i3 = i2 >> 1;
            if (!this.f15785j) {
                float f3 = (float) (this.f15787l - i);
                float f4 = (float) (this.f15788m - i3);
                if (this.f15791p) {
                    int b = C9193k.m22151b(getContext(), 7.0f);
                    int b2 = C9193k.m22151b(getContext(), 3.0f);
                    RectF rectF = this.f15781f;
                    float f5 = (float) b2;
                    f2 = Math.max(rectF.left - f5, Math.min(f3, (rectF.right + f5) - ((float) this.f15790o)));
                    RectF rectF2 = this.f15781f;
                    f = Math.max(rectF2.top, Math.min(f4, (rectF2.bottom + ((float) b)) - ((float) this.f15789n)));
                } else {
                    RectF rectF3 = this.f15781f;
                    float f6 = (float) i;
                    f2 = Math.max(rectF3.left - f6, Math.min(f3, rectF3.right - f6));
                    RectF rectF4 = this.f15781f;
                    f = Math.max(rectF4.top - f6, Math.min(f4, rectF4.bottom - ((float) i3)));
                }
            } else {
                float f7 = (float) (this.f15787l - i);
                float f8 = i2 != this.f15778c.getIntrinsicHeight() ? (float) ((height >> 1) - i3) : 0.0f;
                if (this.f15791p) {
                    RectF rectF5 = this.f15781f;
                    float max = Math.max(rectF5.left, Math.min(f7, rectF5.right - ((float) this.f15790o)));
                    RectF rectF6 = this.f15781f;
                    float f9 = max;
                    f = Math.max(rectF6.top, Math.min(f8, rectF6.bottom - ((float) this.f15789n)));
                    f2 = f9;
                } else {
                    RectF rectF7 = this.f15781f;
                    float f10 = (float) i;
                    float max2 = Math.max(rectF7.left - f10, Math.min(f7, rectF7.right - f10));
                    RectF rectF8 = this.f15781f;
                    f = Math.max(rectF8.top - f10, Math.min(f8, rectF8.bottom - ((float) i3)));
                    f2 = max2;
                }
            }
            canvas.translate(f2, f);
            this.f15778c.draw(canvas);
            canvas.translate(-f2, -f);
        }
    }

    /* renamed from: k */
    private float m20822k(float f) {
        RectF rectF = this.f15781f;
        return ((f - rectF.left) * 360.0f) / rectF.width();
    }

    /* renamed from: l */
    private float m20823l(float f) {
        RectF rectF = this.f15781f;
        float height = 1.0f - ((0.7f / rectF.height()) * (f - rectF.top));
        if (((double) height) < 0.95d) {
            return height;
        }
        return 1.0f;
    }

    /* renamed from: m */
    private float m20824m(float f) {
        RectF rectF = this.f15781f;
        return 1.0f - ((1.0f / rectF.width()) * (f - rectF.left));
    }

    /* renamed from: n */
    private int m20825n(float f) {
        float f2 = 1.0f - f;
        RectF rectF = this.f15781f;
        return (int) (rectF.top + (rectF.height() * f2));
    }

    /* renamed from: p */
    private void m20826p() {
        if (this.f15781f.width() != 0.0f && this.f15781f.height() != 0.0f) {
            if (!this.f15785j) {
                this.f15787l = m20819f(this.f15782g[0]);
                this.f15788m = m20825n(this.f15782g[1]);
                return;
            }
            this.f15787l = m20816a(this.f15782g[2]);
        }
    }

    private void setGradientColor(boolean z) {
        setIsBrightnessGradient(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo36279d(int i) {
        if (this.f15794s != i) {
            this.f15794s = i;
            GradientView gradientView = this.f15776a;
            if (gradientView != null) {
                gradientView.mo36285o(i, false);
            }
            C8810b bVar = this.f15792q;
            if (bVar != null) {
                bVar.mo36307a(this, i);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo36280e(float f) {
        if (this.f15795t != f) {
            this.f15795t = f;
            C8811c cVar = this.f15793r;
            if (cVar != null) {
                cVar.mo36308a(this, f);
            }
        }
    }

    public float getRadius() {
        return this.f15783h;
    }

    public int getSelectedColor() {
        return this.f15784i;
    }

    /* renamed from: h */
    public void mo36283h(float f) {
        if (this.f15786k) {
            this.f15796u = f;
        } else {
            Color.colorToHSV((int) f, this.f15782g);
            float[] fArr = this.f15782g;
            double d = (double) fArr[1];
            Double.isNaN(d);
            fArr[1] = (float) ((d - 0.3d) / 0.7d);
        }
        if (this.f15778c != null) {
            int height = (int) this.f15781f.height();
            int intrinsicHeight = this.f15778c.getIntrinsicHeight();
            int intrinsicWidth = this.f15778c.getIntrinsicWidth();
            this.f15789n = intrinsicHeight;
            this.f15790o = intrinsicWidth;
            if (height < intrinsicHeight) {
                this.f15789n = height;
                this.f15790o = (int) (((float) intrinsicWidth) * (((float) height) / ((float) intrinsicHeight)));
            }
            this.f15778c.setBounds(0, 0, this.f15790o, this.f15789n);
            m20826p();
        }
        if (this.f15786k) {
            RectF rectF = this.f15781f;
            float f2 = rectF.right - rectF.left;
            float f3 = this.f15796u;
            this.f15787l = (int) (f2 * f3);
            float f4 = rectF.bottom;
            float f5 = rectF.top;
            this.f15788m = (int) ((f4 - f5) - ((f4 - f5) * f3));
        }
        post(new C8809a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo36284j(int i, int i2) {
        int i3;
        RectF rectF = this.f15781f;
        int max = (int) Math.max(rectF.left, Math.min((float) i, rectF.right));
        RectF rectF2 = this.f15781f;
        int max2 = (int) Math.max(rectF2.top, Math.min((float) i2, rectF2.bottom));
        if (this.f15786k) {
            mo36280e(m20818c((float) max, (float) max2));
            return;
        }
        float f = (float) max;
        if (this.f15785j) {
            float m = m20824m(f);
            float[] fArr = this.f15782g;
            fArr[2] = m;
            i3 = Color.HSVToColor(fArr);
        } else {
            float k = m20822k(f);
            float l = m20823l((float) max2);
            float[] fArr2 = this.f15782g;
            fArr2[0] = k;
            fArr2[1] = l;
            fArr2[2] = 1.0f;
            i3 = Color.HSVToColor(fArr2);
        }
        this.f15784i = i3;
        mo36279d(this.f15784i);
        Integer.toHexString(this.f15784i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo36285o(int i, boolean z) {
        Color.colorToHSV(i, this.f15782g);
        if (this.f15785j) {
            this.f15784i = Color.HSVToColor(this.f15782g);
            m20817b();
            int i2 = this.f15787l;
            if (i2 != Integer.MIN_VALUE) {
                this.f15782g[2] = m20824m((float) i2);
            }
            i = Color.HSVToColor(this.f15782g);
        }
        if (z) {
            m20826p();
        }
        this.f15784i = i;
        invalidate();
        mo36279d(this.f15784i);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f15777b != null) {
            RectF rectF = this.f15781f;
            float f = this.f15783h;
            canvas.drawRoundRect(rectF, f, f, this.f15780e);
            RectF rectF2 = this.f15781f;
            float f2 = this.f15783h;
            canvas.drawRoundRect(rectF2, f2, f2, this.f15779d);
        }
        m20821i(canvas);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f15781f.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) ((i3 - i) - getPaddingRight()), (float) ((i4 - i2) - getPaddingBottom()));
        if (z) {
            m20817b();
        }
        if (this.f15778c != null) {
            int height = (int) this.f15781f.height();
            int intrinsicHeight = this.f15778c.getIntrinsicHeight();
            int intrinsicWidth = this.f15778c.getIntrinsicWidth();
            this.f15789n = intrinsicHeight;
            this.f15790o = intrinsicWidth;
            if (height < intrinsicHeight) {
                this.f15789n = height;
                this.f15790o = (int) (((float) intrinsicWidth) * (((float) height) / ((float) intrinsicHeight)));
            }
            this.f15778c.setBounds(0, 0, this.f15790o, this.f15789n);
            m20826p();
        }
        if (this.f15786k) {
            RectF rectF = this.f15781f;
            float f = rectF.right - rectF.left;
            float f2 = this.f15796u;
            this.f15787l = (int) (f * f2);
            float f3 = rectF.bottom;
            float f4 = rectF.top;
            this.f15788m = (int) ((f3 - f4) - ((f3 - f4) * f2));
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        Drawable drawable = this.f15778c;
        int i4 = 0;
        if (drawable != null) {
            int intrinsicHeight = drawable.getIntrinsicHeight();
            i4 = this.f15778c.getIntrinsicWidth();
            i3 = intrinsicHeight;
        } else {
            i3 = 0;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            i4 = size;
        } else if (mode == Integer.MIN_VALUE) {
            i4 = Math.min(i4, size);
        }
        if (mode2 == 1073741824) {
            i3 = size2;
        } else if (mode2 == Integer.MIN_VALUE) {
            i3 = Math.min(i3, size2);
        }
        setMeasuredDimension(i4, i3);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f15785j = savedState.f15798b;
        mo36285o(savedState.f15797a, true);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f15798b = this.f15785j;
        savedState.f15797a = this.f15784i;
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent viewParent;
        this.f15787l = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        this.f15788m = y;
        mo36284j(this.f15787l, y);
        invalidate();
        int action = motionEvent.getAction();
        boolean z = true;
        if (action != 0) {
            if (action == 1 || action == 3) {
                viewParent = getParent();
                z = false;
            }
            return super.onTouchEvent(motionEvent);
        }
        viewParent = getParent();
        viewParent.requestDisallowInterceptTouchEvent(z);
        return super.onTouchEvent(motionEvent);
    }

    public void setBrightnessGradientView(GradientView gradientView) {
        if (this.f15776a != gradientView) {
            this.f15776a = gradientView;
            if (gradientView != null) {
                gradientView.setIsBrightnessGradient(true);
                this.f15776a.setColor(this.f15784i);
            }
        }
    }

    public void setColor(int i) {
        mo36285o(i, true);
    }

    public void setIsBrightnessGradient(boolean z) {
        this.f15785j = z;
    }

    public void setIsCtModeGradient(boolean z) {
        this.f15786k = z;
    }

    public void setLockPointerInBounds(boolean z) {
        if (z != this.f15791p) {
            this.f15791p = z;
            invalidate();
        }
    }

    public void setOnColorChangedListener(C8810b bVar) {
        this.f15792q = bVar;
    }

    public void setOnCtChangedListener(C8811c cVar) {
        this.f15793r = cVar;
    }

    public void setPointerDrawable(Drawable drawable) {
        if (this.f15778c != drawable) {
            this.f15778c = drawable;
            requestLayout();
        }
    }

    public void setRadius(float f) {
        if (f != this.f15783h) {
            this.f15783h = f;
            this.f15783h = f;
            invalidate();
        }
    }
}
