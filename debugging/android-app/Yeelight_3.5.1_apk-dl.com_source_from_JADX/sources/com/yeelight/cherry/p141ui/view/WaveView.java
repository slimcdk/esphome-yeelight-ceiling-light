package com.yeelight.cherry.p141ui.view;

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
import p051j4.C9193k;

/* renamed from: com.yeelight.cherry.ui.view.WaveView */
public class WaveView extends View {

    /* renamed from: r */
    public static final int f12210r = Color.parseColor("#AAFFFFFF");

    /* renamed from: s */
    public static final int f12211s = Color.parseColor("#FFFFFFFF");

    /* renamed from: t */
    public static final ShapeType f12212t = ShapeType.CIRCLE;

    /* renamed from: a */
    private boolean f12213a;

    /* renamed from: b */
    private BitmapShader f12214b;

    /* renamed from: c */
    private Matrix f12215c;

    /* renamed from: d */
    private Paint f12216d;

    /* renamed from: e */
    private Paint f12217e;

    /* renamed from: f */
    private Paint f12218f;

    /* renamed from: g */
    private float f12219g;

    /* renamed from: h */
    private float f12220h;

    /* renamed from: i */
    private float f12221i;

    /* renamed from: j */
    private double f12222j;

    /* renamed from: k */
    private float f12223k = 0.05f;

    /* renamed from: l */
    private float f12224l = 1.0f;

    /* renamed from: m */
    private float f12225m = 0.4f;

    /* renamed from: n */
    private float f12226n = 0.0f;

    /* renamed from: o */
    private int f12227o = f12210r;

    /* renamed from: p */
    private int f12228p = f12211s;

    /* renamed from: q */
    private ShapeType f12229q = f12212t;

    /* renamed from: com.yeelight.cherry.ui.view.WaveView$ShapeType */
    public enum ShapeType {
        CIRCLE,
        SQUARE
    }

    /* renamed from: com.yeelight.cherry.ui.view.WaveView$a */
    static /* synthetic */ class C6026a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12230a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.cherry.ui.view.WaveView$ShapeType[] r0 = com.yeelight.cherry.p141ui.view.WaveView.ShapeType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12230a = r0
                com.yeelight.cherry.ui.view.WaveView$ShapeType r1 = com.yeelight.cherry.p141ui.view.WaveView.ShapeType.CIRCLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12230a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.cherry.ui.view.WaveView$ShapeType r1 = com.yeelight.cherry.p141ui.view.WaveView.ShapeType.SQUARE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p141ui.view.WaveView.C6026a.<clinit>():void");
        }
    }

    public WaveView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m17551b();
    }

    /* renamed from: a */
    private void m17550a() {
        double width = (double) getWidth();
        Double.isNaN(width);
        this.f12222j = 6.283185307179586d / width;
        this.f12219g = ((float) getHeight()) * 0.05f;
        this.f12220h = ((float) getHeight()) * 0.4f;
        this.f12221i = (float) getWidth();
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setStrokeWidth(2.0f);
        paint.setAntiAlias(true);
        int width2 = getWidth() + 1;
        int height = getHeight() + 1;
        float[] fArr = new float[width2];
        paint.setShader(new LinearGradient(0.0f, (float) getWidth(), 0.0f, (float) (getWidth() / 2), Color.parseColor("#ffffff"), Color.parseColor("#fda0c1"), Shader.TileMode.MIRROR));
        paint.setColor(this.f12227o);
        for (int i = 0; i < width2; i++) {
            double d = (double) i;
            double d2 = this.f12222j;
            Double.isNaN(d);
            double d3 = d * d2;
            double d4 = (double) this.f12220h;
            double d5 = (double) this.f12219g;
            double sin = Math.sin(d3);
            Double.isNaN(d5);
            Double.isNaN(d4);
            float f = (float) (d4 + (d5 * sin));
            float f2 = (float) i;
            canvas.drawLine(f2, f, f2, (float) height, paint);
            fArr[i] = f;
        }
        paint.setColor(this.f12228p);
        int i2 = (int) (this.f12221i / 3.0f);
        for (int i3 = 0; i3 < width2; i3++) {
            float f3 = (float) i3;
            canvas.drawLine(f3, fArr[(i3 + i2) % width2], f3, (float) height, paint);
        }
        BitmapShader bitmapShader = new BitmapShader(createBitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP);
        this.f12214b = bitmapShader;
        this.f12216d.setShader(bitmapShader);
    }

    /* renamed from: b */
    private void m17551b() {
        this.f12215c = new Matrix();
        Paint paint = new Paint();
        this.f12216d = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f12218f = paint2;
        paint2.setAntiAlias(true);
    }

    /* renamed from: c */
    public void mo31395c(int i, int i2) {
        if (this.f12217e == null) {
            Paint paint = new Paint();
            this.f12217e = paint;
            paint.setAntiAlias(true);
            this.f12217e.setStyle(Paint.Style.STROKE);
        }
        this.f12217e.setColor(i2);
        this.f12217e.setStrokeWidth((float) i);
        invalidate();
    }

    /* renamed from: d */
    public void mo31396d(int i, int i2) {
        this.f12227o = i;
        this.f12228p = i2;
        this.f12214b = null;
        m17550a();
        invalidate();
    }

    public float getAmplitudeRatio() {
        return this.f12223k;
    }

    public float getWaterLevelRatio() {
        return this.f12225m;
    }

    public float getWaveLengthRatio() {
        return this.f12224l;
    }

    public float getWaveShiftRatio() {
        return this.f12226n;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f12213a || this.f12214b == null) {
            this.f12216d.setShader((Shader) null);
            return;
        }
        if (this.f12216d.getShader() == null) {
            this.f12216d.setShader(this.f12214b);
        }
        this.f12215c.setScale(this.f12224l / 1.0f, this.f12223k / 0.05f, 0.0f, this.f12220h);
        this.f12215c.postTranslate(this.f12226n * ((float) getWidth()), (0.4f - this.f12225m) * ((float) getHeight()));
        this.f12214b.setLocalMatrix(this.f12215c);
        Paint paint = this.f12217e;
        float strokeWidth = paint == null ? 0.0f : paint.getStrokeWidth();
        int b = C9193k.m22151b(getContext(), 7.0f);
        float f = (float) b;
        float width = ((((float) getWidth()) / 2.0f) - strokeWidth) - f;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        this.f12218f.setColor(Color.parseColor("#ff367c"));
        this.f12218f.setStyle(Paint.Style.FILL);
        canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, width, this.f12218f);
        int i = C6026a.f12230a[this.f12229q.ordinal()];
        if (i == 1) {
            if (strokeWidth > 0.0f) {
                canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, ((((float) getWidth()) - strokeWidth) / 2.0f) - 1.0f, this.f12217e);
            }
            canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, width, this.f12216d);
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
                canvas.drawRect(f2, f2, (((float) getWidth()) - f2) - 0.5f, (((float) getHeight()) - f2) - 0.5f, this.f12217e);
            }
            canvas.drawRect(strokeWidth, strokeWidth, ((float) getWidth()) - strokeWidth, ((float) getHeight()) - strokeWidth, this.f12216d);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m17550a();
    }

    public void setAmplitudeRatio(float f) {
        if (this.f12223k != f) {
            this.f12223k = f;
            invalidate();
        }
    }

    public void setShapeType(ShapeType shapeType) {
        this.f12229q = shapeType;
        invalidate();
    }

    public void setShowWave(boolean z) {
        this.f12213a = z;
    }

    public void setWaterLevelRatio(float f) {
        if (this.f12225m != f) {
            this.f12225m = f;
            invalidate();
        }
    }

    public void setWaveLengthRatio(float f) {
        this.f12224l = f;
    }

    public void setWaveShiftRatio(float f) {
        if (this.f12226n != f) {
            this.f12226n = f;
            invalidate();
        }
    }
}
