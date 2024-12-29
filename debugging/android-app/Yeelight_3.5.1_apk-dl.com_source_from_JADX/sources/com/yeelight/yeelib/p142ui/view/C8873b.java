package com.yeelight.yeelib.p142ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Xfermode;
import android.view.View;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.yeelight.yeelib.R$dimen;
import com.yeelight.yeelib.R$drawable;

/* renamed from: com.yeelight.yeelib.ui.view.b */
public class C8873b extends View {

    /* renamed from: a */
    private float f16135a;

    /* renamed from: b */
    private float f16136b;

    /* renamed from: c */
    private boolean f16137c = false;

    /* renamed from: d */
    private boolean f16138d = false;

    /* renamed from: e */
    private int f16139e;

    /* renamed from: f */
    private Bitmap f16140f;

    /* renamed from: g */
    private Bitmap f16141g;

    /* renamed from: h */
    private Bitmap f16142h;

    /* renamed from: i */
    private Paint f16143i;

    /* renamed from: j */
    private Matrix f16144j;

    /* renamed from: k */
    private int f16145k;

    /* renamed from: l */
    private int f16146l;

    /* renamed from: m */
    private float f16147m;

    public C8873b(Context context) {
        super(context);
        setLayerType(1, (Paint) null);
        setWillNotDraw(false);
        this.f16143i = new Paint();
        this.f16144j = new Matrix();
        this.f16143i.setFilterBitmap(true);
        this.f16143i.setAntiAlias(true);
        this.f16143i.setDither(true);
        this.f16140f = BitmapFactory.decodeResource(getResources(), R$drawable.color_pin_selected);
        this.f16141g = BitmapFactory.decodeResource(getResources(), R$drawable.color_pin_normal);
        this.f16142h = BitmapFactory.decodeResource(getResources(), R$drawable.color_pin_capture);
    }

    /* renamed from: a */
    private void m21132a(Canvas canvas, Bitmap bitmap) {
        this.f16144j.setScale(((float) getWidth()) / ((float) bitmap.getWidth()), ((float) getHeight()) / ((float) bitmap.getHeight()));
        this.f16143i.setXfermode((Xfermode) null);
        canvas.drawBitmap(bitmap, this.f16144j, this.f16143i);
        this.f16143i.setColor(this.f16139e);
        if (this.f16146l == 0) {
            this.f16146l = ((int) (((((float) getWidth()) * 0.63f) * ((float) getHeight())) / ((float) bitmap.getHeight()))) / 2;
            this.f16146l = (int) ((((float) getWidth()) * 0.63f) / 2.0f);
        }
        canvas.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), (float) this.f16146l, this.f16143i);
    }

    /* renamed from: b */
    private void m21133b(Canvas canvas, Bitmap bitmap, boolean z) {
        float f;
        float f2;
        this.f16144j.setScale(((float) getWidth()) / ((float) bitmap.getWidth()), ((float) getHeight()) / ((float) bitmap.getHeight()));
        this.f16143i.setXfermode((Xfermode) null);
        canvas.drawBitmap(bitmap, this.f16144j, this.f16143i);
        this.f16143i.setColor(this.f16139e);
        if (this.f16145k == 0) {
            if (z) {
                int width = (int) ((((float) bitmap.getWidth()) * 0.71f) / 2.0f);
                this.f16145k = width;
                this.f16145k = (int) ((((float) width) * ((float) getWidth())) / ((float) bitmap.getWidth()));
                f = (float) bitmap.getHeight();
                f2 = 0.13f;
            } else {
                int width2 = (int) ((((float) bitmap.getWidth()) * 0.63f) / 2.0f);
                this.f16145k = width2;
                this.f16145k = (int) ((((float) width2) * ((float) getWidth())) / ((float) bitmap.getWidth()));
                f = (float) bitmap.getHeight();
                f2 = 0.16f;
            }
            this.f16147m = (((f * f2) * ((float) getHeight())) / ((float) bitmap.getHeight())) + ((float) this.f16145k);
        }
        canvas.drawCircle((float) (getWidth() / 2), this.f16147m, (float) this.f16145k, this.f16143i);
    }

    /* renamed from: c */
    public float mo36545c(int i) {
        boolean z = this.f16137c;
        return (this.f16135a * ((float) i)) - ((float) (getWidth() / 2));
    }

    /* renamed from: d */
    public float mo36546d(int i) {
        boolean z = this.f16137c;
        return (this.f16136b * ((float) i)) - ((float) getHeight());
    }

    public int getColor() {
        return this.f16139e;
    }

    public float getInParentX() {
        return this.f16135a;
    }

    public float getInParentY() {
        return this.f16136b;
    }

    public boolean isSelected() {
        return this.f16137c;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Bitmap bitmap;
        boolean z;
        this.f16144j.reset();
        if (this.f16137c) {
            bitmap = this.f16140f;
            z = true;
        } else if (this.f16138d) {
            m21132a(canvas, this.f16142h);
            super.onDraw(canvas);
        } else {
            bitmap = this.f16141g;
            z = false;
        }
        m21133b(canvas, bitmap, z);
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.f16138d) {
            i4 = getResources().getDimensionPixelSize(R$dimen.capture_seletor_size);
            i3 = i4;
        } else {
            i4 = getResources().getDimensionPixelSize(R$dimen.color_pin_seletor_width_size);
            i3 = getResources().getDimensionPixelSize(R$dimen.color_pin_seletor_height_size);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(i3, BasicMeasure.EXACTLY));
    }

    public void setCapture(boolean z) {
        this.f16138d = z;
        this.f16137c = false;
        invalidate();
    }

    public void setColor(int i) {
        this.f16139e = i;
        invalidate();
    }

    public void setInParentX(float f) {
        this.f16135a = f;
    }

    public void setInParentY(float f) {
        this.f16136b = f;
    }

    public void setSelected(boolean z) {
        this.f16138d = false;
        this.f16137c = z;
        this.f16145k = 0;
        invalidate();
    }
}
