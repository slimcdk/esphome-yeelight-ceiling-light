package com.yeelight.cherry.p177ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.yeelight.yeelib.utils.C10547m;

/* renamed from: com.yeelight.cherry.ui.view.WaveView */
public class WaveView extends View {

    /* renamed from: r */
    public static final int f12615r = Color.parseColor("#AAFFFFFF");

    /* renamed from: s */
    public static final int f12616s = Color.parseColor("#FFFFFFFF");

    /* renamed from: t */
    public static final C5965b f12617t = C5965b.CIRCLE;

    /* renamed from: a */
    private boolean f12618a;

    /* renamed from: b */
    private BitmapShader f12619b;

    /* renamed from: c */
    private Matrix f12620c;

    /* renamed from: d */
    private Paint f12621d;

    /* renamed from: e */
    private Paint f12622e;

    /* renamed from: f */
    private Paint f12623f;

    /* renamed from: g */
    private float f12624g;

    /* renamed from: h */
    private float f12625h;

    /* renamed from: i */
    private float f12626i;

    /* renamed from: j */
    private double f12627j;

    /* renamed from: k */
    private float f12628k = 0.05f;

    /* renamed from: l */
    private float f12629l = 1.0f;

    /* renamed from: m */
    private float f12630m = 0.4f;

    /* renamed from: n */
    private float f12631n = 0.0f;

    /* renamed from: o */
    private int f12632o = f12615r;

    /* renamed from: p */
    private int f12633p = f12616s;

    /* renamed from: q */
    private C5965b f12634q = f12617t;

    /* renamed from: com.yeelight.cherry.ui.view.WaveView$a */
    static /* synthetic */ class C5964a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12635a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.cherry.ui.view.WaveView$b[] r0 = com.yeelight.cherry.p177ui.view.WaveView.C5965b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12635a = r0
                com.yeelight.cherry.ui.view.WaveView$b r1 = com.yeelight.cherry.p177ui.view.WaveView.C5965b.CIRCLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12635a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.cherry.ui.view.WaveView$b r1 = com.yeelight.cherry.p177ui.view.WaveView.C5965b.SQUARE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p177ui.view.WaveView.C5964a.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.view.WaveView$b */
    public enum C5965b {
        CIRCLE,
        SQUARE
    }

    public WaveView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m17477b();
    }

    /* renamed from: a */
    private void m17476a() {
        double width = (double) getWidth();
        Double.isNaN(width);
        this.f12627j = 6.283185307179586d / width;
        this.f12624g = ((float) getHeight()) * 0.05f;
        this.f12625h = ((float) getHeight()) * 0.4f;
        this.f12626i = (float) getWidth();
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setStrokeWidth(2.0f);
        paint.setAntiAlias(true);
        int width2 = getWidth() + 1;
        int height = getHeight() + 1;
        float[] fArr = new float[width2];
        paint.setShader(new LinearGradient(0.0f, (float) getWidth(), 0.0f, (float) (getWidth() / 2), Color.parseColor("#ffffff"), Color.parseColor("#fda0c1"), Shader.TileMode.MIRROR));
        paint.setColor(this.f12632o);
        for (int i = 0; i < width2; i++) {
            double d = (double) i;
            double d2 = this.f12627j;
            Double.isNaN(d);
            double d3 = d * d2;
            double d4 = (double) this.f12625h;
            double d5 = (double) this.f12624g;
            double sin = Math.sin(d3);
            Double.isNaN(d5);
            Double.isNaN(d4);
            float f = (float) (d4 + (d5 * sin));
            float f2 = (float) i;
            canvas.drawLine(f2, f, f2, (float) height, paint);
            fArr[i] = f;
        }
        paint.setColor(this.f12633p);
        int i2 = (int) (this.f12626i / 3.0f);
        for (int i3 = 0; i3 < width2; i3++) {
            float f3 = (float) i3;
            canvas.drawLine(f3, fArr[(i3 + i2) % width2], f3, (float) height, paint);
        }
        BitmapShader bitmapShader = new BitmapShader(createBitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP);
        this.f12619b = bitmapShader;
        this.f12621d.setShader(bitmapShader);
    }

    /* renamed from: b */
    private void m17477b() {
        this.f12620c = new Matrix();
        Paint paint = new Paint();
        this.f12621d = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f12623f = paint2;
        paint2.setAntiAlias(true);
    }

    /* renamed from: c */
    public void mo27452c(int i, int i2) {
        if (this.f12622e == null) {
            Paint paint = new Paint();
            this.f12622e = paint;
            paint.setAntiAlias(true);
            this.f12622e.setStyle(Paint.Style.STROKE);
        }
        this.f12622e.setColor(i2);
        this.f12622e.setStrokeWidth((float) i);
        invalidate();
    }

    /* renamed from: d */
    public void mo27453d(int i, int i2) {
        this.f12632o = i;
        this.f12633p = i2;
        this.f12619b = null;
        m17476a();
        invalidate();
    }

    public float getAmplitudeRatio() {
        return this.f12628k;
    }

    public float getWaterLevelRatio() {
        return this.f12630m;
    }

    public float getWaveLengthRatio() {
        return this.f12629l;
    }

    public float getWaveShiftRatio() {
        return this.f12631n;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f12618a || this.f12619b == null) {
            this.f12621d.setShader((Shader) null);
            return;
        }
        if (this.f12621d.getShader() == null) {
            this.f12621d.setShader(this.f12619b);
        }
        this.f12620c.setScale(this.f12629l / 1.0f, this.f12628k / 0.05f, 0.0f, this.f12625h);
        this.f12620c.postTranslate(this.f12631n * ((float) getWidth()), (0.4f - this.f12630m) * ((float) getHeight()));
        this.f12619b.setLocalMatrix(this.f12620c);
        Paint paint = this.f12622e;
        float strokeWidth = paint == null ? 0.0f : paint.getStrokeWidth();
        int b = C10547m.m25752b(getContext(), 7.0f);
        float f = (float) b;
        float width = ((((float) getWidth()) / 2.0f) - strokeWidth) - f;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        this.f12623f.setColor(Color.parseColor("#ff367c"));
        this.f12623f.setStyle(Paint.Style.FILL);
        canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, width, this.f12623f);
        int i = C5964a.f12635a[this.f12634q.ordinal()];
        if (i == 1) {
            if (strokeWidth > 0.0f) {
                canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, ((((float) getWidth()) - strokeWidth) / 2.0f) - 1.0f, this.f12622e);
            }
            canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, width, this.f12621d);
            paint2.setStrokeWidth(2.0f);
            paint2.setColor(Color.parseColor("#ffd5e4"));
            canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, width, paint2);
            paint2.setStrokeWidth(f);
            canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, 1.0f + width + ((float) (b / 2)), paint2);
            paint2.setStrokeWidth(2.0f);
            canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, width + f, paint2);
        } else if (i == 2) {
            if (strokeWidth > 0.0f) {
                float f2 = strokeWidth / 2.0f;
                canvas.drawRect(f2, f2, (((float) getWidth()) - f2) - 0.5f, (((float) getHeight()) - f2) - 0.5f, this.f12622e);
            }
            canvas.drawRect(strokeWidth, strokeWidth, ((float) getWidth()) - strokeWidth, ((float) getHeight()) - strokeWidth, this.f12621d);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m17476a();
    }

    public void setAmplitudeRatio(float f) {
        if (this.f12628k != f) {
            this.f12628k = f;
            invalidate();
        }
    }

    public void setShapeType(C5965b bVar) {
        this.f12634q = bVar;
        invalidate();
    }

    public void setShowWave(boolean z) {
        this.f12618a = z;
    }

    public void setWaterLevelRatio(float f) {
        if (this.f12630m != f) {
            this.f12630m = f;
            invalidate();
        }
    }

    public void setWaveLengthRatio(float f) {
        this.f12629l = f;
    }

    public void setWaveShiftRatio(float f) {
        if (this.f12631n != f) {
            this.f12631n = f;
            invalidate();
        }
    }
}
