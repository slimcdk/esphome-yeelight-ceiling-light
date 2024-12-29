package com.yeelight.yeelib.p194ui.view;

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
    private static final ImageView.ScaleType f19355u = ImageView.ScaleType.CENTER_CROP;

    /* renamed from: v */
    private static final Bitmap.Config f19356v = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    private final RectF f19357a;

    /* renamed from: b */
    private final RectF f19358b;

    /* renamed from: c */
    private final Matrix f19359c;

    /* renamed from: d */
    private final Paint f19360d;

    /* renamed from: e */
    private final Paint f19361e;

    /* renamed from: f */
    private final Paint f19362f;

    /* renamed from: g */
    private int f19363g;

    /* renamed from: h */
    private int f19364h;

    /* renamed from: i */
    private int f19365i;

    /* renamed from: j */
    private Bitmap f19366j;

    /* renamed from: k */
    private BitmapShader f19367k;

    /* renamed from: l */
    private int f19368l;

    /* renamed from: m */
    private int f19369m;

    /* renamed from: n */
    private float f19370n;

    /* renamed from: o */
    private float f19371o;

    /* renamed from: p */
    private ColorFilter f19372p;

    /* renamed from: q */
    private boolean f19373q;

    /* renamed from: r */
    private boolean f19374r;

    /* renamed from: s */
    private boolean f19375s;

    /* renamed from: t */
    private boolean f19376t;

    public CircleImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f19357a = new RectF();
        this.f19358b = new RectF();
        this.f19359c = new Matrix();
        this.f19360d = new Paint();
        this.f19361e = new Paint();
        this.f19362f = new Paint();
        this.f19363g = ViewCompat.MEASURED_STATE_MASK;
        this.f19364h = 0;
        this.f19365i = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CircleImageView, i, 0);
        this.f19364h = obtainStyledAttributes.getDimensionPixelSize(R$styleable.CircleImageView_civ_border_width, 0);
        this.f19363g = obtainStyledAttributes.getColor(R$styleable.CircleImageView_civ_border_color, ViewCompat.MEASURED_STATE_MASK);
        this.f19375s = obtainStyledAttributes.getBoolean(R$styleable.CircleImageView_civ_border_overlay, false);
        this.f19365i = obtainStyledAttributes.getColor(R$styleable.CircleImageView_civ_fill_color, 0);
        obtainStyledAttributes.recycle();
        m25107d();
    }

    /* renamed from: a */
    private void m25104a() {
        Paint paint = this.f19360d;
        if (paint != null) {
            paint.setColorFilter(this.f19372p);
        }
    }

    /* renamed from: b */
    private RectF m25105b() {
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int min = Math.min(width, height);
        float paddingLeft = ((float) getPaddingLeft()) + (((float) (width - min)) / 2.0f);
        float paddingTop = ((float) getPaddingTop()) + (((float) (height - min)) / 2.0f);
        float f = (float) min;
        return new RectF(paddingLeft, paddingTop, paddingLeft + f, f + paddingTop);
    }

    /* renamed from: c */
    private Bitmap m25106c(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap createBitmap = drawable instanceof ColorDrawable ? Bitmap.createBitmap(2, 2, f19356v) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), f19356v);
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
    private void m25107d() {
        super.setScaleType(f19355u);
        this.f19373q = true;
        if (this.f19374r) {
            m25109f();
            this.f19374r = false;
        }
    }

    /* renamed from: e */
    private void m25108e() {
        this.f19366j = this.f19376t ? null : m25106c(getDrawable());
        m25109f();
    }

    /* renamed from: f */
    private void m25109f() {
        int i;
        if (!this.f19373q) {
            this.f19374r = true;
        } else if (getWidth() != 0 || getHeight() != 0) {
            if (this.f19366j == null) {
                invalidate();
                return;
            }
            Bitmap bitmap = this.f19366j;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f19367k = new BitmapShader(bitmap, tileMode, tileMode);
            this.f19360d.setAntiAlias(true);
            this.f19360d.setShader(this.f19367k);
            this.f19361e.setStyle(Paint.Style.STROKE);
            this.f19361e.setAntiAlias(true);
            this.f19361e.setColor(this.f19363g);
            this.f19361e.setStrokeWidth((float) this.f19364h);
            this.f19362f.setStyle(Paint.Style.FILL);
            this.f19362f.setAntiAlias(true);
            this.f19362f.setColor(this.f19365i);
            this.f19369m = this.f19366j.getHeight();
            this.f19368l = this.f19366j.getWidth();
            this.f19358b.set(m25105b());
            this.f19371o = Math.min((this.f19358b.height() - ((float) this.f19364h)) / 2.0f, (this.f19358b.width() - ((float) this.f19364h)) / 2.0f);
            this.f19357a.set(this.f19358b);
            if (!this.f19375s && (i = this.f19364h) > 0) {
                this.f19357a.inset(((float) i) - 1.0f, ((float) i) - 1.0f);
            }
            this.f19370n = Math.min(this.f19357a.height() / 2.0f, this.f19357a.width() / 2.0f);
            m25104a();
            m25110g();
            invalidate();
        }
    }

    /* renamed from: g */
    private void m25110g() {
        float f;
        float f2;
        this.f19359c.set((Matrix) null);
        float f3 = 0.0f;
        if (((float) this.f19368l) * this.f19357a.height() > this.f19357a.width() * ((float) this.f19369m)) {
            f2 = this.f19357a.height() / ((float) this.f19369m);
            f3 = (this.f19357a.width() - (((float) this.f19368l) * f2)) * 0.5f;
            f = 0.0f;
        } else {
            f2 = this.f19357a.width() / ((float) this.f19368l);
            f = (this.f19357a.height() - (((float) this.f19369m) * f2)) * 0.5f;
        }
        this.f19359c.setScale(f2, f2);
        Matrix matrix = this.f19359c;
        RectF rectF = this.f19357a;
        matrix.postTranslate(((float) ((int) (f3 + 0.5f))) + rectF.left, ((float) ((int) (f + 0.5f))) + rectF.top);
        this.f19367k.setLocalMatrix(this.f19359c);
    }

    public int getBorderColor() {
        return this.f19363g;
    }

    public int getBorderWidth() {
        return this.f19364h;
    }

    public ColorFilter getColorFilter() {
        return this.f19372p;
    }

    @Deprecated
    public int getFillColor() {
        return this.f19365i;
    }

    public ImageView.ScaleType getScaleType() {
        return f19355u;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f19376t) {
            super.onDraw(canvas);
        } else if (this.f19366j != null) {
            if (this.f19365i != 0) {
                canvas.drawCircle(this.f19357a.centerX(), this.f19357a.centerY(), this.f19370n, this.f19362f);
            }
            canvas.drawCircle(this.f19357a.centerX(), this.f19357a.centerY(), this.f19370n, this.f19360d);
            if (this.f19364h > 0) {
                canvas.drawCircle(this.f19358b.centerX(), this.f19358b.centerY(), this.f19371o, this.f19361e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m25109f();
    }

    public void setAdjustViewBounds(boolean z) {
        if (z) {
            throw new IllegalArgumentException("adjustViewBounds not supported.");
        }
    }

    public void setBorderColor(@ColorInt int i) {
        if (i != this.f19363g) {
            this.f19363g = i;
            this.f19361e.setColor(i);
            invalidate();
        }
    }

    @Deprecated
    public void setBorderColorResource(@ColorRes int i) {
        setBorderColor(getContext().getResources().getColor(i));
    }

    public void setBorderOverlay(boolean z) {
        if (z != this.f19375s) {
            this.f19375s = z;
            m25109f();
        }
    }

    public void setBorderWidth(int i) {
        if (i != this.f19364h) {
            this.f19364h = i;
            m25109f();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter != this.f19372p) {
            this.f19372p = colorFilter;
            m25104a();
            invalidate();
        }
    }

    public void setDisableCircularTransformation(boolean z) {
        if (this.f19376t != z) {
            this.f19376t = z;
            m25108e();
        }
    }

    @Deprecated
    public void setFillColor(@ColorInt int i) {
        if (i != this.f19365i) {
            this.f19365i = i;
            this.f19362f.setColor(i);
            invalidate();
        }
    }

    @Deprecated
    public void setFillColorResource(@ColorRes int i) {
        setFillColor(getContext().getResources().getColor(i));
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        m25108e();
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        m25108e();
    }

    public void setImageResource(@DrawableRes int i) {
        super.setImageResource(i);
        m25108e();
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        m25108e();
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        m25109f();
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        m25109f();
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType != f19355u) {
            throw new IllegalArgumentException(String.format("ScaleType %s not supported.", new Object[]{scaleType}));
        }
    }
}
