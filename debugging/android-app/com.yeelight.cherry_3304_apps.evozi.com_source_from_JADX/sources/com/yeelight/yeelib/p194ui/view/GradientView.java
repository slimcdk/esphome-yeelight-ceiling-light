package com.yeelight.yeelib.p194ui.view;

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
import com.yeelight.yeelib.utils.C10547m;

/* renamed from: com.yeelight.yeelib.ui.view.GradientView */
public class GradientView extends View {

    /* renamed from: v */
    private static final int[] f19512v = {SupportMenu.CATEGORY_MASK, InputDeviceCompat.SOURCE_ANY, -16711936, -16711681, -16776961, -65281, SupportMenu.CATEGORY_MASK};

    /* renamed from: w */
    private static final int[] f19513w = {-1, 0};

    /* renamed from: a */
    private GradientView f19514a;

    /* renamed from: b */
    private Shader f19515b;

    /* renamed from: c */
    private Drawable f19516c;

    /* renamed from: d */
    private Paint f19517d;

    /* renamed from: e */
    private Paint f19518e;

    /* renamed from: f */
    private RectF f19519f = new RectF();

    /* renamed from: g */
    private float[] f19520g = {1.0f, 1.0f, 1.0f};

    /* renamed from: h */
    private float f19521h = 0.0f;

    /* renamed from: i */
    private int f19522i = 0;

    /* renamed from: j */
    private boolean f19523j = false;

    /* renamed from: k */
    private boolean f19524k = false;

    /* renamed from: l */
    private int f19525l = Integer.MIN_VALUE;

    /* renamed from: m */
    private int f19526m;

    /* renamed from: n */
    private int f19527n;

    /* renamed from: o */
    private int f19528o;

    /* renamed from: p */
    private boolean f19529p = false;

    /* renamed from: q */
    private C10431b f19530q;

    /* renamed from: r */
    private C10432c f19531r;

    /* renamed from: s */
    private int f19532s;

    /* renamed from: t */
    private float f19533t;

    /* renamed from: u */
    private float f19534u;

    /* renamed from: com.yeelight.yeelib.ui.view.GradientView$SavedState */
    private static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C10429a();

        /* renamed from: a */
        int f19535a;

        /* renamed from: b */
        boolean f19536b;

        /* renamed from: com.yeelight.yeelib.ui.view.GradientView$SavedState$a */
        static class C10429a implements Parcelable.Creator<SavedState> {
            C10429a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (C10430a) null);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f19535a = parcel.readInt();
            this.f19536b = parcel.readInt() != 1 ? false : true;
        }

        /* synthetic */ SavedState(Parcel parcel, C10430a aVar) {
            this(parcel);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f19535a);
            parcel.writeInt(this.f19536b ? 1 : 0);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.GradientView$a */
    class C10430a implements Runnable {
        C10430a() {
        }

        public void run() {
            GradientView.this.invalidate();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.GradientView$b */
    public interface C10431b {
        /* renamed from: a */
        void mo32937a(GradientView gradientView, int i);
    }

    /* renamed from: com.yeelight.yeelib.ui.view.GradientView$c */
    public interface C10432c {
        /* renamed from: a */
        void mo32938a(GradientView gradientView, float f);
    }

    public GradientView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m25209g(attributeSet);
    }

    /* renamed from: a */
    private int m25205a(float f) {
        float f2 = 1.0f - f;
        RectF rectF = this.f19519f;
        return (int) (rectF.left + (rectF.width() * f2));
    }

    /* renamed from: b */
    private void m25206b() {
    }

    /* renamed from: c */
    private float m25207c(float f, float f2) {
        RectF rectF = this.f19519f;
        float f3 = f - rectF.left;
        float f4 = f2 - rectF.top;
        float width = rectF.width() - 1.0f;
        float height = this.f19519f.height();
        float f5 = height * height;
        return (((f3 * width) + f5) - (height * f4)) / ((width * width) + f5);
    }

    /* renamed from: f */
    private int m25208f(float f) {
        RectF rectF = this.f19519f;
        return (int) (rectF.left + ((f * rectF.width()) / 360.0f));
    }

    /* renamed from: g */
    private void m25209g(AttributeSet attributeSet) {
        setClickable(true);
        this.f19517d = new Paint(1);
        Paint paint = new Paint(1);
        this.f19518e = paint;
        paint.setColor(-1);
        setLayerType(1, isInEditMode() ? null : this.f19517d);
        this.f19521h = TypedValue.applyDimension(1, 10.0f, getResources().getDisplayMetrics());
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
    private void m25210i(Canvas canvas) {
        float f;
        float f2;
        if (this.f19516c != null) {
            int height = getHeight();
            int i = this.f19528o >> 1;
            int i2 = this.f19527n;
            int i3 = i2 >> 1;
            if (!this.f19523j) {
                float f3 = (float) (this.f19525l - i);
                float f4 = (float) (this.f19526m - i3);
                if (this.f19529p) {
                    int b = C10547m.m25752b(getContext(), 7.0f);
                    int b2 = C10547m.m25752b(getContext(), 3.0f);
                    RectF rectF = this.f19519f;
                    float f5 = (float) b2;
                    f2 = Math.max(rectF.left - f5, Math.min(f3, (rectF.right + f5) - ((float) this.f19528o)));
                    RectF rectF2 = this.f19519f;
                    f = Math.max(rectF2.top, Math.min(f4, (rectF2.bottom + ((float) b)) - ((float) this.f19527n)));
                } else {
                    RectF rectF3 = this.f19519f;
                    float f6 = (float) i;
                    f2 = Math.max(rectF3.left - f6, Math.min(f3, rectF3.right - f6));
                    RectF rectF4 = this.f19519f;
                    f = Math.max(rectF4.top - f6, Math.min(f4, rectF4.bottom - ((float) i3)));
                }
            } else {
                float f7 = (float) (this.f19525l - i);
                float f8 = i2 != this.f19516c.getIntrinsicHeight() ? (float) ((height >> 1) - i3) : 0.0f;
                if (this.f19529p) {
                    RectF rectF5 = this.f19519f;
                    float max = Math.max(rectF5.left, Math.min(f7, rectF5.right - ((float) this.f19528o)));
                    RectF rectF6 = this.f19519f;
                    float f9 = max;
                    f = Math.max(rectF6.top, Math.min(f8, rectF6.bottom - ((float) this.f19527n)));
                    f2 = f9;
                } else {
                    RectF rectF7 = this.f19519f;
                    float f10 = (float) i;
                    float max2 = Math.max(rectF7.left - f10, Math.min(f7, rectF7.right - f10));
                    RectF rectF8 = this.f19519f;
                    f = Math.max(rectF8.top - f10, Math.min(f8, rectF8.bottom - ((float) i3)));
                    f2 = max2;
                }
            }
            canvas.translate(f2, f);
            this.f19516c.draw(canvas);
            canvas.translate(-f2, -f);
        }
    }

    /* renamed from: k */
    private float m25211k(float f) {
        RectF rectF = this.f19519f;
        return ((f - rectF.left) * 360.0f) / rectF.width();
    }

    /* renamed from: l */
    private float m25212l(float f) {
        RectF rectF = this.f19519f;
        float height = 1.0f - ((0.7f / rectF.height()) * (f - rectF.top));
        if (((double) height) < 0.95d) {
            return height;
        }
        return 1.0f;
    }

    /* renamed from: m */
    private float m25213m(float f) {
        RectF rectF = this.f19519f;
        return 1.0f - ((1.0f / rectF.width()) * (f - rectF.left));
    }

    /* renamed from: n */
    private int m25214n(float f) {
        float f2 = 1.0f - f;
        RectF rectF = this.f19519f;
        return (int) (rectF.top + (rectF.height() * f2));
    }

    /* renamed from: p */
    private void m25215p() {
        if (this.f19519f.width() != 0.0f && this.f19519f.height() != 0.0f) {
            if (!this.f19523j) {
                this.f19525l = m25208f(this.f19520g[0]);
                this.f19526m = m25214n(this.f19520g[1]);
                return;
            }
            this.f19525l = m25205a(this.f19520g[2]);
        }
    }

    private void setGradientColor(boolean z) {
        setIsBrightnessGradient(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo32909d(int i) {
        if (this.f19532s != i) {
            this.f19532s = i;
            GradientView gradientView = this.f19514a;
            if (gradientView != null) {
                gradientView.mo32915o(i, false);
            }
            C10431b bVar = this.f19530q;
            if (bVar != null) {
                bVar.mo32937a(this, i);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo32910e(float f) {
        if (this.f19533t != f) {
            this.f19533t = f;
            C10432c cVar = this.f19531r;
            if (cVar != null) {
                cVar.mo32938a(this, f);
            }
        }
    }

    public float getRadius() {
        return this.f19521h;
    }

    public int getSelectedColor() {
        return this.f19522i;
    }

    /* renamed from: h */
    public void mo32913h(float f) {
        if (this.f19524k) {
            this.f19534u = f;
        } else {
            Color.colorToHSV((int) f, this.f19520g);
            float[] fArr = this.f19520g;
            double d = (double) fArr[1];
            Double.isNaN(d);
            fArr[1] = (float) ((d - 0.3d) / 0.7d);
        }
        if (this.f19516c != null) {
            int height = (int) this.f19519f.height();
            int intrinsicHeight = this.f19516c.getIntrinsicHeight();
            int intrinsicWidth = this.f19516c.getIntrinsicWidth();
            this.f19527n = intrinsicHeight;
            this.f19528o = intrinsicWidth;
            if (height < intrinsicHeight) {
                this.f19527n = height;
                this.f19528o = (int) (((float) intrinsicWidth) * (((float) height) / ((float) intrinsicHeight)));
            }
            this.f19516c.setBounds(0, 0, this.f19528o, this.f19527n);
            m25215p();
        }
        if (this.f19524k) {
            RectF rectF = this.f19519f;
            float f2 = rectF.right - rectF.left;
            float f3 = this.f19534u;
            this.f19525l = (int) (f2 * f3);
            float f4 = rectF.bottom;
            float f5 = rectF.top;
            this.f19526m = (int) ((f4 - f5) - ((f4 - f5) * f3));
        }
        post(new C10430a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo32914j(int i, int i2) {
        int i3;
        RectF rectF = this.f19519f;
        int max = (int) Math.max(rectF.left, Math.min((float) i, rectF.right));
        RectF rectF2 = this.f19519f;
        int max2 = (int) Math.max(rectF2.top, Math.min((float) i2, rectF2.bottom));
        if (this.f19524k) {
            mo32910e(m25207c((float) max, (float) max2));
            return;
        }
        float f = (float) max;
        if (this.f19523j) {
            float m = m25213m(f);
            float[] fArr = this.f19520g;
            fArr[2] = m;
            i3 = Color.HSVToColor(fArr);
        } else {
            float k = m25211k(f);
            float l = m25212l((float) max2);
            float[] fArr2 = this.f19520g;
            fArr2[0] = k;
            fArr2[1] = l;
            fArr2[2] = 1.0f;
            i3 = Color.HSVToColor(fArr2);
        }
        this.f19522i = i3;
        mo32909d(this.f19522i);
        Integer.toHexString(this.f19522i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo32915o(int i, boolean z) {
        Color.colorToHSV(i, this.f19520g);
        if (this.f19523j) {
            this.f19522i = Color.HSVToColor(this.f19520g);
            m25206b();
            int i2 = this.f19525l;
            if (i2 != Integer.MIN_VALUE) {
                this.f19520g[2] = m25213m((float) i2);
            }
            i = Color.HSVToColor(this.f19520g);
        }
        if (z) {
            m25215p();
        }
        this.f19522i = i;
        invalidate();
        mo32909d(this.f19522i);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f19515b != null) {
            RectF rectF = this.f19519f;
            float f = this.f19521h;
            canvas.drawRoundRect(rectF, f, f, this.f19518e);
            RectF rectF2 = this.f19519f;
            float f2 = this.f19521h;
            canvas.drawRoundRect(rectF2, f2, f2, this.f19517d);
        }
        m25210i(canvas);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f19519f.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) ((i3 - i) - getPaddingRight()), (float) ((i4 - i2) - getPaddingBottom()));
        if (z) {
            m25206b();
        }
        if (this.f19516c != null) {
            int height = (int) this.f19519f.height();
            int intrinsicHeight = this.f19516c.getIntrinsicHeight();
            int intrinsicWidth = this.f19516c.getIntrinsicWidth();
            this.f19527n = intrinsicHeight;
            this.f19528o = intrinsicWidth;
            if (height < intrinsicHeight) {
                this.f19527n = height;
                this.f19528o = (int) (((float) intrinsicWidth) * (((float) height) / ((float) intrinsicHeight)));
            }
            this.f19516c.setBounds(0, 0, this.f19528o, this.f19527n);
            m25215p();
        }
        if (this.f19524k) {
            RectF rectF = this.f19519f;
            float f = rectF.right - rectF.left;
            float f2 = this.f19534u;
            this.f19525l = (int) (f * f2);
            float f3 = rectF.bottom;
            float f4 = rectF.top;
            this.f19526m = (int) ((f3 - f4) - ((f3 - f4) * f2));
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        Drawable drawable = this.f19516c;
        int i4 = 0;
        if (drawable != null) {
            int intrinsicHeight = drawable.getIntrinsicHeight();
            i4 = this.f19516c.getIntrinsicWidth();
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
        this.f19523j = savedState.f19536b;
        mo32915o(savedState.f19535a, true);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f19536b = this.f19523j;
        savedState.f19535a = this.f19522i;
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent viewParent;
        this.f19525l = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        this.f19526m = y;
        mo32914j(this.f19525l, y);
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
        if (this.f19514a != gradientView) {
            this.f19514a = gradientView;
            if (gradientView != null) {
                gradientView.setIsBrightnessGradient(true);
                this.f19514a.setColor(this.f19522i);
            }
        }
    }

    public void setColor(int i) {
        mo32915o(i, true);
    }

    public void setIsBrightnessGradient(boolean z) {
        this.f19523j = z;
    }

    public void setIsCtModeGradient(boolean z) {
        this.f19524k = z;
    }

    public void setLockPointerInBounds(boolean z) {
        if (z != this.f19529p) {
            this.f19529p = z;
            invalidate();
        }
    }

    public void setOnColorChangedListener(C10431b bVar) {
        this.f19530q = bVar;
    }

    public void setOnCtChangedListener(C10432c cVar) {
        this.f19531r = cVar;
    }

    public void setPointerDrawable(Drawable drawable) {
        if (this.f19516c != drawable) {
            this.f19516c = drawable;
            requestLayout();
        }
    }

    public void setRadius(float f) {
        if (f != this.f19521h) {
            this.f19521h = f;
            this.f19521h = f;
            invalidate();
        }
    }
}
