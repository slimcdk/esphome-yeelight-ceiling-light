package com.yeelight.yeelib.p194ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Xfermode;
import android.view.View;
import com.yeelight.yeelib.R$dimen;
import com.yeelight.yeelib.R$drawable;

/* renamed from: com.yeelight.yeelib.ui.view.c */
public class C10497c extends View {

    /* renamed from: a */
    private float f19878a;

    /* renamed from: b */
    private float f19879b;

    /* renamed from: c */
    private boolean f19880c = false;

    /* renamed from: d */
    private boolean f19881d = false;

    /* renamed from: e */
    private int f19882e;

    /* renamed from: f */
    private Bitmap f19883f;

    /* renamed from: g */
    private Bitmap f19884g;

    /* renamed from: h */
    private Bitmap f19885h;

    /* renamed from: i */
    private Paint f19886i;

    /* renamed from: j */
    private Matrix f19887j;

    /* renamed from: k */
    private int f19888k;

    /* renamed from: l */
    private int f19889l;

    /* renamed from: m */
    private float f19890m;

    public C10497c(Context context) {
        super(context);
        setLayerType(1, (Paint) null);
        setWillNotDraw(false);
        this.f19886i = new Paint();
        this.f19887j = new Matrix();
        this.f19886i.setFilterBitmap(true);
        this.f19886i.setAntiAlias(true);
        this.f19886i.setDither(true);
        this.f19883f = BitmapFactory.decodeResource(getResources(), R$drawable.color_pin_selected);
        this.f19884g = BitmapFactory.decodeResource(getResources(), R$drawable.color_pin_normal);
        this.f19885h = BitmapFactory.decodeResource(getResources(), R$drawable.color_pin_capture);
    }

    /* renamed from: a */
    private void m25518a(Canvas canvas, Bitmap bitmap) {
        this.f19887j.setScale(((float) getWidth()) / ((float) bitmap.getWidth()), ((float) getHeight()) / ((float) bitmap.getHeight()));
        this.f19886i.setXfermode((Xfermode) null);
        canvas.drawBitmap(bitmap, this.f19887j, this.f19886i);
        this.f19886i.setColor(this.f19882e);
        if (this.f19889l == 0) {
            this.f19889l = ((int) (((((float) getWidth()) * 0.63f) * ((float) getHeight())) / ((float) bitmap.getHeight()))) / 2;
            this.f19889l = (int) ((((float) getWidth()) * 0.63f) / 2.0f);
        }
        canvas.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), (float) this.f19889l, this.f19886i);
    }

    /* renamed from: b */
    private void m25519b(Canvas canvas, Bitmap bitmap, boolean z) {
        float f;
        float f2;
        this.f19887j.setScale(((float) getWidth()) / ((float) bitmap.getWidth()), ((float) getHeight()) / ((float) bitmap.getHeight()));
        this.f19886i.setXfermode((Xfermode) null);
        canvas.drawBitmap(bitmap, this.f19887j, this.f19886i);
        this.f19886i.setColor(this.f19882e);
        if (this.f19888k == 0) {
            if (z) {
                int width = (int) ((((float) bitmap.getWidth()) * 0.71f) / 2.0f);
                this.f19888k = width;
                this.f19888k = (int) ((((float) width) * ((float) getWidth())) / ((float) bitmap.getWidth()));
                f = (float) bitmap.getHeight();
                f2 = 0.13f;
            } else {
                int width2 = (int) ((((float) bitmap.getWidth()) * 0.63f) / 2.0f);
                this.f19888k = width2;
                this.f19888k = (int) ((((float) width2) * ((float) getWidth())) / ((float) bitmap.getWidth()));
                f = (float) bitmap.getHeight();
                f2 = 0.16f;
            }
            this.f19890m = (((f * f2) * ((float) getHeight())) / ((float) bitmap.getHeight())) + ((float) this.f19888k);
        }
        canvas.drawCircle((float) (getWidth() / 2), this.f19890m, (float) this.f19888k, this.f19886i);
    }

    /* renamed from: c */
    public float mo33177c(int i) {
        boolean z = this.f19880c;
        return (this.f19878a * ((float) i)) - ((float) (getWidth() / 2));
    }

    /* renamed from: d */
    public float mo33178d(int i) {
        boolean z = this.f19880c;
        return (this.f19879b * ((float) i)) - ((float) getHeight());
    }

    public int getColor() {
        return this.f19882e;
    }

    public float getInParentX() {
        return this.f19878a;
    }

    public float getInParentY() {
        return this.f19879b;
    }

    public boolean isSelected() {
        return this.f19880c;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Bitmap bitmap;
        boolean z;
        this.f19887j.reset();
        if (this.f19880c) {
            bitmap = this.f19883f;
            z = true;
        } else if (this.f19881d) {
            m25518a(canvas, this.f19885h);
            super.onDraw(canvas);
        } else {
            bitmap = this.f19884g;
            z = false;
        }
        m25519b(canvas, bitmap, z);
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.f19881d) {
            i4 = getResources().getDimensionPixelSize(R$dimen.capture_seletor_size);
            i3 = i4;
        } else {
            i4 = getResources().getDimensionPixelSize(R$dimen.color_pin_seletor_width_size);
            i3 = getResources().getDimensionPixelSize(R$dimen.color_pin_seletor_height_size);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
    }

    public void setCapture(boolean z) {
        this.f19881d = z;
        this.f19880c = false;
        invalidate();
    }

    public void setColor(int i) {
        this.f19882e = i;
        invalidate();
    }

    public void setInParentX(float f) {
        this.f19878a = f;
    }

    public void setInParentY(float f) {
        this.f19879b = f;
    }

    public void setSelected(boolean z) {
        this.f19881d = false;
        this.f19880c = z;
        this.f19888k = 0;
        invalidate();
    }
}
