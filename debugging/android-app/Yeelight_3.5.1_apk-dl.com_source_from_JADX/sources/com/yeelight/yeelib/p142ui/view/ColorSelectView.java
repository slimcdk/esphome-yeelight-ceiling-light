package com.yeelight.yeelib.p142ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.p142ui.activity.ColorflowModeActivity;

/* renamed from: com.yeelight.yeelib.ui.view.ColorSelectView */
public class ColorSelectView extends RelativeLayout {

    /* renamed from: a */
    private Bitmap f15652a;

    /* renamed from: b */
    private ImageView f15653b;

    /* renamed from: c */
    private ImageView f15654c;

    /* renamed from: d */
    private int f15655d;

    /* renamed from: e */
    private float f15656e = 1.0f;

    /* renamed from: f */
    private float f15657f;

    /* renamed from: g */
    private float f15658g;

    /* renamed from: h */
    private float f15659h;

    /* renamed from: i */
    private float f15660i;

    /* renamed from: j */
    private double f15661j;

    /* renamed from: k */
    private float f15662k = -361.0f;

    /* renamed from: l */
    private int f15663l;

    /* renamed from: m */
    private int f15664m;

    /* renamed from: n */
    private ColorflowModeActivity.C8384e f15665n;

    /* renamed from: o */
    private float[] f15666o = new float[3];

    /* renamed from: p */
    private int f15667p;

    /* renamed from: q */
    private MotionEvent f15668q;

    public ColorSelectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m20733a();
    }

    /* renamed from: a */
    private void m20733a() {
        int i = getContext().getResources().getDisplayMetrics().widthPixels;
        this.f15655d = i;
        this.f15656e = ((float) i) / 1080.0f;
        this.f15654c = new ImageView(getContext());
        this.f15653b = new ImageView(getContext());
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        int i2 = this.f15655d;
        options.outHeight = i2;
        options.outWidth = i2;
        options.inSampleSize = 1;
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), R$drawable.colorflow_panel, options);
        this.f15652a = decodeResource;
        int i3 = this.f15655d;
        Bitmap c = m20735c(decodeResource, (double) i3, (double) i3);
        this.f15652a = c;
        this.f15653b.setImageBitmap(c);
        this.f15654c.setImageResource(R$drawable.colorflow_panel_cur);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        addView(this.f15654c, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        addView(this.f15653b, layoutParams2);
    }

    /* renamed from: b */
    private boolean m20734b(MotionEvent motionEvent) {
        try {
            return this.f15652a.getPixel((int) motionEvent.getX(), (int) motionEvent.getY()) != 0;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: c */
    private Bitmap m20735c(Bitmap bitmap, double d, double d2) {
        float width = (float) bitmap.getWidth();
        float height = (float) bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(((float) d) / width, ((float) d2) / height);
        return Bitmap.createBitmap(bitmap, 0, 0, (int) width, (int) height, matrix, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x02d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            int r1 = r16.getWidth()
            r2 = 2
            int r1 = r1 / r2
            float r1 = (float) r1
            r0.f15660i = r1
            int r1 = r16.getHeight()
            int r1 = r1 / r2
            float r1 = (float) r1
            r0.f15659h = r1
            float r3 = r0.f15660i
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 / r4
            r0.f15660i = r3
            float r1 = r1 / r4
            r0.f15659h = r1
            float r1 = r17.getX()
            r0.f15658g = r1
            float r1 = r17.getY()
            r0.f15657f = r1
            int r1 = r17.getAction()
            r7 = 4645040803167600640(0x4076800000000000, double:360.0)
            r3 = 1
            r9 = 4633260481411531256(0x404ca5dc1a63c1f8, double:57.29577951308232)
            r11 = 0
            r12 = 4640537203540230144(0x4066800000000000, double:180.0)
            if (r1 == 0) goto L_0x0257
            if (r1 == r3) goto L_0x0249
            if (r1 == r2) goto L_0x0046
            goto L_0x02e3
        L_0x0046:
            float r1 = r17.getX()
            r0.f15658g = r1
            float r1 = r17.getY()
            r0.f15657f = r1
            android.view.MotionEvent r14 = r0.f15668q
            if (r14 != 0) goto L_0x005b
            r14 = r17
            r0.f15668q = r14
            return r3
        L_0x005b:
            float r14 = r0.f15659h
            int r15 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r15 < 0) goto L_0x0075
            float r15 = r0.f15658g
            float r5 = r0.f15660i
            int r6 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r6 < 0) goto L_0x0075
            float r1 = r1 - r14
            float r15 = r15 - r5
            float r1 = r1 / r15
            double r5 = (double) r1
            double r5 = java.lang.Math.atan(r5)
            double r5 = r5 * r9
            double r5 = r5 + r12
            goto L_0x00bc
        L_0x0075:
            int r5 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r5 <= 0) goto L_0x008e
            float r5 = r0.f15658g
            float r6 = r0.f15660i
            int r15 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r15 >= 0) goto L_0x008e
            float r1 = r1 - r14
            float r6 = r6 - r5
            float r1 = r1 / r6
            double r5 = (double) r1
            double r5 = java.lang.Math.atan(r5)
            double r5 = r5 * r9
            double r5 = r7 - r5
            goto L_0x00bc
        L_0x008e:
            float r5 = r0.f15658g
            float r6 = r0.f15660i
            int r7 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x00a5
            int r7 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r7 >= 0) goto L_0x00a5
            float r14 = r14 - r1
            float r6 = r6 - r5
            float r14 = r14 / r6
            double r5 = (double) r14
            double r5 = java.lang.Math.atan(r5)
            double r5 = r5 * r9
            goto L_0x00bc
        L_0x00a5:
            int r7 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r7 <= 0) goto L_0x00ba
            int r7 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r7 >= 0) goto L_0x00ba
            float r14 = r14 - r1
            float r5 = r5 - r6
            float r14 = r14 / r5
            double r5 = (double) r14
            double r5 = java.lang.Math.atan(r5)
            double r5 = r5 * r9
            double r5 = r12 - r5
            goto L_0x00bc
        L_0x00ba:
            r5 = 0
        L_0x00bc:
            double r7 = r0.f15661j
            double r5 = r5 - r7
            float r1 = (float) r5
            r0.f15662k = r1
            r5 = 0
            r6 = 1135869952(0x43b40000, float:360.0)
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 >= 0) goto L_0x00cc
            float r1 = r1 + r6
            r0.f15662k = r1
        L_0x00cc:
            float r1 = r0.f15662k
            float r1 = r1 % r6
            r0.f15662k = r1
            android.widget.ImageView r5 = r0.f15653b
            r5.setRotation(r1)
            android.widget.ImageView r1 = r0.f15653b
            float r1 = r1.getRotation()
            r5 = 1116471296(0x428c0000, float:70.0)
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x00e8
            float[] r7 = r0.f15666o
            float r5 = r5 - r1
            r7[r11] = r5
            goto L_0x00ef
        L_0x00e8:
            float[] r5 = r0.f15666o
            r7 = 1138163712(0x43d70000, float:430.0)
            float r7 = r7 - r1
            r5[r11] = r7
        L_0x00ef:
            float[] r1 = r0.f15666o
            r5 = r1[r11]
            r7 = 1124532224(0x43070000, float:135.0)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x00ff
            r5 = r1[r11]
            float r5 = r5 - r7
            r1[r11] = r5
            goto L_0x0106
        L_0x00ff:
            r5 = r1[r11]
            r7 = 1130430464(0x43610000, float:225.0)
            float r5 = r5 + r7
            r1[r11] = r5
        L_0x0106:
            r1[r3] = r4
            r1[r2] = r4
            android.widget.ImageView r1 = r0.f15653b
            float r1 = r1.getRotation()
            float r1 = r6 - r1
            double r1 = (double) r1
            r4 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            java.lang.Double.isNaN(r1)
            double r1 = r1 * r4
            double r1 = r1 / r12
            double r1 = java.lang.Math.sin(r1)
            r7 = 4644196378237468672(0x4073800000000000, double:312.0)
            double r1 = r1 * r7
            r9 = 4647961106050973696(0x4080e00000000000, double:540.0)
            double r1 = r1 + r9
            int r1 = (int) r1
            r0.f15663l = r1
            android.widget.ImageView r1 = r0.f15653b
            float r1 = r1.getRotation()
            float r6 = r6 - r1
            double r1 = (double) r6
            java.lang.Double.isNaN(r1)
            double r1 = r1 * r4
            double r1 = r1 / r12
            double r1 = java.lang.Math.cos(r1)
            double r1 = r1 * r7
            double r1 = r1 + r9
            int r1 = (int) r1
            r0.f15664m = r1
            android.widget.ImageView r1 = r0.f15653b
            float r1 = r1.getRotation()
            r2 = 1119092736(0x42b40000, float:90.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x0187
            android.widget.ImageView r1 = r0.f15653b
            float r1 = r1.getRotation()
            double r1 = (double) r1
            java.lang.Double.isNaN(r1)
            double r1 = r1 * r4
            double r1 = r1 / r12
            double r1 = java.lang.Math.sin(r1)
            double r1 = r1 * r7
            double r1 = r9 - r1
            int r1 = (int) r1
            r0.f15663l = r1
            android.widget.ImageView r1 = r0.f15653b
            float r1 = r1.getRotation()
            double r1 = (double) r1
            java.lang.Double.isNaN(r1)
            double r1 = r1 * r4
            double r1 = r1 / r12
            double r1 = java.lang.Math.cos(r1)
        L_0x017f:
            double r1 = r1 * r7
            double r9 = r9 - r1
            int r1 = (int) r9
        L_0x0183:
            r0.f15664m = r1
            goto L_0x0226
        L_0x0187:
            android.widget.ImageView r1 = r0.f15653b
            float r1 = r1.getRotation()
            r6 = 1127481344(0x43340000, float:180.0)
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 > 0) goto L_0x01c3
            android.widget.ImageView r1 = r0.f15653b
            float r1 = r1.getRotation()
            float r1 = r1 - r2
            double r14 = (double) r1
            java.lang.Double.isNaN(r14)
            double r14 = r14 * r4
            double r14 = r14 / r12
            double r14 = java.lang.Math.cos(r14)
            double r14 = r14 * r7
            double r14 = r9 - r14
            int r1 = (int) r14
            r0.f15663l = r1
            android.widget.ImageView r1 = r0.f15653b
            float r1 = r1.getRotation()
            float r1 = r1 - r2
            double r1 = (double) r1
            java.lang.Double.isNaN(r1)
            double r1 = r1 * r4
            double r1 = r1 / r12
            double r1 = java.lang.Math.sin(r1)
        L_0x01be:
            double r1 = r1 * r7
            double r1 = r1 + r9
            int r1 = (int) r1
            goto L_0x0183
        L_0x01c3:
            android.widget.ImageView r1 = r0.f15653b
            float r1 = r1.getRotation()
            r2 = 1132920832(0x43870000, float:270.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x01fa
            android.widget.ImageView r1 = r0.f15653b
            float r1 = r1.getRotation()
            float r1 = r1 - r6
            double r1 = (double) r1
            java.lang.Double.isNaN(r1)
            double r1 = r1 * r4
            double r1 = r1 / r12
            double r1 = java.lang.Math.sin(r1)
            double r1 = r1 * r7
            double r1 = r1 + r9
            int r1 = (int) r1
            r0.f15663l = r1
            android.widget.ImageView r1 = r0.f15653b
            float r1 = r1.getRotation()
            float r1 = r1 - r6
            double r1 = (double) r1
            java.lang.Double.isNaN(r1)
            double r1 = r1 * r4
            double r1 = r1 / r12
            double r1 = java.lang.Math.cos(r1)
            goto L_0x01be
        L_0x01fa:
            android.widget.ImageView r1 = r0.f15653b
            float r1 = r1.getRotation()
            float r1 = r1 - r2
            double r14 = (double) r1
            java.lang.Double.isNaN(r14)
            double r14 = r14 * r4
            double r14 = r14 / r12
            double r14 = java.lang.Math.cos(r14)
            double r14 = r14 * r7
            double r14 = r14 + r9
            int r1 = (int) r14
            r0.f15663l = r1
            android.widget.ImageView r1 = r0.f15653b
            float r1 = r1.getRotation()
            float r1 = r1 - r2
            double r1 = (double) r1
            java.lang.Double.isNaN(r1)
            double r1 = r1 * r4
            double r1 = r1 / r12
            double r1 = java.lang.Math.sin(r1)
            goto L_0x017f
        L_0x0226:
            android.graphics.Bitmap r1 = r0.f15652a
            int r2 = r0.f15663l
            float r2 = (float) r2
            float r4 = r0.f15656e
            float r2 = r2 * r4
            int r2 = (int) r2
            int r5 = r0.f15664m
            float r5 = (float) r5
            float r5 = r5 * r4
            int r4 = (int) r5
            int r1 = r1.getPixel(r2, r4)
            r0.f15667p = r1
            r16.invalidate()
            com.yeelight.yeelib.ui.activity.ColorflowModeActivity$e r1 = r0.f15665n
            if (r1 == 0) goto L_0x0248
            int r2 = r0.f15667p
            r1.mo35679a(r2)
        L_0x0248:
            return r3
        L_0x0249:
            r1 = 0
            r0.f15668q = r1
            com.yeelight.yeelib.ui.activity.ColorflowModeActivity$e r1 = r0.f15665n
            if (r1 == 0) goto L_0x02e3
            int r2 = r0.f15667p
            r1.mo35679a(r2)
            goto L_0x02e3
        L_0x0257:
            r14 = r17
            boolean r1 = r16.m20734b(r17)
            if (r1 != 0) goto L_0x0267
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.String r2 = "touch false"
            r1.println(r2)
            return r11
        L_0x0267:
            float r1 = r0.f15657f
            float r2 = r0.f15659h
            int r4 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x0285
            float r4 = r0.f15658g
            float r5 = r0.f15660i
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 < 0) goto L_0x0285
            float r1 = r1 - r2
            float r4 = r4 - r5
            float r1 = r1 / r4
            double r1 = (double) r1
            double r1 = java.lang.Math.atan(r1)
            double r1 = r1 * r9
            double r1 = r1 + r12
        L_0x0282:
            r0.f15661j = r1
            goto L_0x02ca
        L_0x0285:
            int r4 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x029e
            float r4 = r0.f15658g
            float r5 = r0.f15660i
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 >= 0) goto L_0x029e
            float r1 = r1 - r2
            float r5 = r5 - r4
            float r1 = r1 / r5
            double r1 = (double) r1
            double r1 = java.lang.Math.atan(r1)
            double r1 = r1 * r9
            double r1 = r7 - r1
            goto L_0x0282
        L_0x029e:
            float r4 = r0.f15658g
            float r5 = r0.f15660i
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 >= 0) goto L_0x02b5
            int r6 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x02b5
            float r2 = r2 - r1
            float r5 = r5 - r4
            float r2 = r2 / r5
            double r1 = (double) r2
            double r1 = java.lang.Math.atan(r1)
            double r1 = r1 * r9
            goto L_0x0282
        L_0x02b5:
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x02ca
            int r6 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x02ca
            float r2 = r2 - r1
            float r4 = r4 - r5
            float r2 = r2 / r4
            double r1 = (double) r2
            double r1 = java.lang.Math.atan(r1)
            double r1 = r1 * r9
            double r12 = r12 - r1
            r0.f15661j = r12
        L_0x02ca:
            double r1 = r0.f15661j
            r4 = 0
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x02d5
            double r1 = r1 + r7
            r0.f15661j = r1
        L_0x02d5:
            double r1 = r0.f15661j
            float r4 = r0.f15662k
            double r4 = (double) r4
            java.lang.Double.isNaN(r4)
            double r1 = r1 - r4
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r1 = r1 + r4
            r0.f15661j = r1
        L_0x02e3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p142ui.view.ColorSelectView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setColor(int i) {
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        Color.colorToHSV(i, this.f15666o);
        float f = 0.0f;
        while (f <= 360.0f) {
            double d = (double) f;
            Double.isNaN(d);
            double d2 = (d * 3.141592653589793d) / 180.0d;
            this.f15663l = (int) (540.0d - (Math.sin(d2) * 312.0d));
            int cos = (int) (540.0d - (Math.cos(d2) * 312.0d));
            this.f15664m = cos;
            Bitmap bitmap = this.f15652a;
            float f2 = this.f15656e;
            int pixel = bitmap.getPixel((int) (((float) this.f15663l) * f2), (int) (((float) cos) * f2));
            if (Math.abs(Color.red(pixel) - red) >= 5 || Math.abs(Color.green(pixel) - green) >= 5 || Math.abs(Color.blue(pixel) - blue) >= 5) {
                f += 0.2f;
            } else {
                this.f15667p = i;
                this.f15653b.setRotation(f);
                this.f15662k = f;
                return;
            }
        }
    }

    public void setColorChangedListener(ColorflowModeActivity.C8384e eVar) {
        this.f15665n = eVar;
    }
}
