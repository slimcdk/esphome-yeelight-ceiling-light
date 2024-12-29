package com.yeelight.yeelib.p142ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.ViewCompat;
import com.yeelight.yeelib.R$styleable;

/* renamed from: com.yeelight.yeelib.ui.view.CircleImageView */
public class CircleImageView extends AppCompatImageView {

    /* renamed from: u */
    private static final ImageView.ScaleType f15617u = ImageView.ScaleType.CENTER_CROP;

    /* renamed from: v */
    private static final Bitmap.Config f15618v = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    private final RectF f15619a;

    /* renamed from: b */
    private final RectF f15620b;

    /* renamed from: c */
    private final Matrix f15621c;

    /* renamed from: d */
    private final Paint f15622d;

    /* renamed from: e */
    private final Paint f15623e;

    /* renamed from: f */
    private final Paint f15624f;

    /* renamed from: g */
    private int f15625g;

    /* renamed from: h */
    private int f15626h;

    /* renamed from: i */
    private int f15627i;

    /* renamed from: j */
    private Bitmap f15628j;

    /* renamed from: k */
    private BitmapShader f15629k;

    /* renamed from: l */
    private int f15630l;

    /* renamed from: m */
    private int f15631m;

    /* renamed from: n */
    private float f15632n;

    /* renamed from: o */
    private float f15633o;

    /* renamed from: p */
    private ColorFilter f15634p;

    /* renamed from: q */
    private boolean f15635q;

    /* renamed from: r */
    private boolean f15636r;

    /* renamed from: s */
    private boolean f15637s;

    /* renamed from: t */
    private boolean f15638t;

    public CircleImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f15619a = new RectF();
        this.f15620b = new RectF();
        this.f15621c = new Matrix();
        this.f15622d = new Paint();
        this.f15623e = new Paint();
        this.f15624f = new Paint();
        this.f15625g = ViewCompat.MEASURED_STATE_MASK;
        this.f15626h = 0;
        this.f15627i = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CircleImageView, i, 0);
        this.f15626h = obtainStyledAttributes.getDimensionPixelSize(R$styleable.CircleImageView_civ_border_width, 0);
        this.f15625g = obtainStyledAttributes.getColor(R$styleable.CircleImageView_civ_border_color, ViewCompat.MEASURED_STATE_MASK);
        this.f15637s = obtainStyledAttributes.getBoolean(R$styleable.CircleImageView_civ_border_overlay, false);
        this.f15627i = obtainStyledAttributes.getColor(R$styleable.CircleImageView_civ_fill_color, 0);
        obtainStyledAttributes.recycle();
        m20718d();
    }

    /* renamed from: a */
    private void m20715a() {
        Paint paint = this.f15622d;
        if (paint != null) {
            paint.setColorFilter(this.f15634p);
        }
    }

    /* renamed from: b */
    private RectF m20716b() {
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int min = Math.min(width, height);
        float paddingLeft = ((float) getPaddingLeft()) + (((float) (width - min)) / 2.0f);
        float paddingTop = ((float) getPaddingTop()) + (((float) (height - min)) / 2.0f);
        float f = (float) min;
        return new RectF(paddingLeft, paddingTop, paddingLeft + f, f + paddingTop);
    }

    /* renamed from: c */
    private Bitmap m20717c(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap createBitmap = drawable instanceof ColorDrawable ? Bitmap.createBitmap(2, 2, f15618v) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), f15618v);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return createBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: d */
    private void m20718d() {
        super.setScaleType(f15617u);
        this.f15635q = true;
        if (this.f15636r) {
            m20720f();
            this.f15636r = false;
        }
    }

    /* renamed from: e */
    private void m20719e() {
        this.f15628j = this.f15638t ? null : m20717c(getDrawable());
        m20720f();
    }

    /* renamed from: f */
    private void m20720f() {
        int i;
        if (!this.f15635q) {
            this.f15636r = true;
        } else if (getWidth() != 0 || getHeight() != 0) {
            if (this.f15628j == null) {
                invalidate();
                return;
            }
            Bitmap bitmap = this.f15628j;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f15629k = new BitmapShader(bitmap, tileMode, tileMode);
            this.f15622d.setAntiAlias(true);
            this.f15622d.setShader(this.f15629k);
            this.f15623e.setStyle(Paint.Style.STROKE);
            this.f15623e.setAntiAlias(true);
            this.f15623e.setColor(this.f15625g);
            this.f15623e.setStrokeWidth((float) this.f15626h);
            this.f15624f.setStyle(Paint.Style.FILL);
            this.f15624f.setAntiAlias(true);
            this.f15624f.setColor(this.f15627i);
            this.f15631m = this.f15628j.getHeight();
            this.f15630l = this.f15628j.getWidth();
            this.f15620b.set(m20716b());
            this.f15633o = Math.min((this.f15620b.height() - ((float) this.f15626h)) / 2.0f, (this.f15620b.width() - ((float) this.f15626h)) / 2.0f);
            this.f15619a.set(this.f15620b);
            if (!this.f15637s && (i = this.f15626h) > 0) {
                this.f15619a.inset(((float) i) - 1.0f, ((float) i) - 1.0f);
            }
            this.f15632n = Math.min(this.f15619a.height() / 2.0f, this.f15619a.width() / 2.0f);
            m20715a();
            m20721g();
            invalidate();
        }
    }

    /* renamed from: g */
    private void m20721g() {
        float f;
        float f2;
        this.f15621c.set((Matrix) null);
        float f3 = 0.0f;
        if (((float) this.f15630l) * this.f15619a.height() > this.f15619a.width() * ((float) this.f15631m)) {
            f2 = this.f15619a.height() / ((float) this.f15631m);
            f3 = (this.f15619a.width() - (((float) this.f15630l) * f2)) * 0.5f;
            f = 0.0f;
        } else {
            f2 = this.f15619a.width() / ((float) this.f15630l);
            f = (this.f15619a.height() - (((float) this.f15631m) * f2)) * 0.5f;
        }
        this.f15621c.setScale(f2, f2);
        Matrix matrix = this.f15621c;
        RectF rectF = this.f15619a;
        matrix.postTranslate(((float) ((int) (f3 + 0.5f))) + rectF.left, ((float) ((int) (f + 0.5f))) + rectF.top);
        this.f15629k.setLocalMatrix(this.f15621c);
    }

    public int getBorderColor() {
        return this.f15625g;
    }

    public int getBorderWidth() {
        return this.f15626h;
    }

    public ColorFilter getColorFilter() {
        return this.f15634p;
    }

    @Deprecated
    public int getFillColor() {
        return this.f15627i;
    }

    public ImageView.ScaleType getScaleType() {
        return f15617u;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f15638t) {
            super.onDraw(canvas);
        } else if (this.f15628j != null) {
            if (this.f15627i != 0) {
                canvas.drawCircle(this.f15619a.centerX(), this.f15619a.centerY(), this.f15632n, this.f15624f);
            }
            canvas.drawCircle(this.f15619a.centerX(), this.f15619a.centerY(), this.f15632n, this.f15622d);
            if (this.f15626h > 0) {
                canvas.drawCircle(this.f15620b.centerX(), this.f15620b.centerY(), this.f15633o, this.f15623e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m20720f();
    }

    public void setAdjustViewBounds(boolean z) {
        if (z) {
            throw new IllegalArgumentException("adjustViewBounds not supported.");
        }
    }

    public void setBorderColor(@ColorInt int i) {
        if (i != this.f15625g) {
            this.f15625g = i;
            this.f15623e.setColor(i);
            invalidate();
        }
    }

    @Deprecated
    public void setBorderColorResource(@ColorRes int i) {
        setBorderColor(getContext().getResources().getColor(i));
    }

    public void setBorderOverlay(boolean z) {
        if (z != this.f15637s) {
            this.f15637s = z;
            m20720f();
        }
    }

    public void setBorderWidth(int i) {
        if (i != this.f15626h) {
            this.f15626h = i;
            m20720f();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter != this.f15634p) {
            this.f15634p = colorFilter;
            m20715a();
            invalidate();
        }
    }

    public void setDisableCircularTransformation(boolean z) {
        if (this.f15638t != z) {
            this.f15638t = z;
            m20719e();
        }
    }

    @Deprecated
    public void setFillColor(@ColorInt int i) {
        if (i != this.f15627i) {
            this.f15627i = i;
            this.f15624f.setColor(i);
            invalidate();
        }
    }

    @Deprecated
    public void setFillColorResource(@ColorRes int i) {
        setFillColor(getContext().getResources().getColor(i));
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        m20719e();
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        m20719e();
    }

    public void setImageResource(@DrawableRes int i) {
        super.setImageResource(i);
        m20719e();
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        m20719e();
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        m20720f();
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        m20720f();
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType != f15617u) {
            throw new IllegalArgumentException(String.format("ScaleType %s not supported.", new Object[]{scaleType}));
        }
    }
}
