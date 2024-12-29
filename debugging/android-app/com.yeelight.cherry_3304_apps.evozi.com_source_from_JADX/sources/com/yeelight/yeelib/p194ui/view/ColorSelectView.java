package com.yeelight.yeelib.p194ui.view;

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
import com.yeelight.yeelib.p194ui.activity.ColorflowModeActivity;

/* renamed from: com.yeelight.yeelib.ui.view.ColorSelectView */
public class ColorSelectView extends RelativeLayout {

    /* renamed from: a */
    private Bitmap f19390a;

    /* renamed from: b */
    private ImageView f19391b;

    /* renamed from: c */
    private ImageView f19392c;

    /* renamed from: d */
    private int f19393d;

    /* renamed from: e */
    private float f19394e = 1.0f;

    /* renamed from: f */
    private float f19395f;

    /* renamed from: g */
    private float f19396g;

    /* renamed from: h */
    private float f19397h;

    /* renamed from: i */
    private float f19398i;

    /* renamed from: j */
    private double f19399j;

    /* renamed from: k */
    private float f19400k = -361.0f;

    /* renamed from: l */
    private int f19401l;

    /* renamed from: m */
    private int f19402m;

    /* renamed from: n */
    private ColorflowModeActivity.C9967e f19403n;

    /* renamed from: o */
    private float[] f19404o = new float[3];

    /* renamed from: p */
    private int f19405p;

    /* renamed from: q */
    private MotionEvent f19406q;

    public ColorSelectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m25122a();
    }

    /* renamed from: a */
    private void m25122a() {
        int i = getContext().getResources().getDisplayMetrics().widthPixels;
        this.f19393d = i;
        this.f19394e = ((float) i) / 1080.0f;
        this.f19392c = new ImageView(getContext());
        this.f19391b = new ImageView(getContext());
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        int i2 = this.f19393d;
        options.outHeight = i2;
        options.outWidth = i2;
        options.inSampleSize = 1;
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), R$drawable.colorflow_panel, options);
        this.f19390a = decodeResource;
        int i3 = this.f19393d;
        Bitmap c = m25124c(decodeResource, (double) i3, (double) i3);
        this.f19390a = c;
        this.f19391b.setImageBitmap(c);
        this.f19392c.setImageResource(R$drawable.colorflow_panel_cur);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        addView(this.f19392c, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        addView(this.f19391b, layoutParams2);
    }

    /* renamed from: b */
    private boolean m25123b(MotionEvent motionEvent) {
        try {
            return this.f19390a.getPixel((int) motionEvent.getX(), (int) motionEvent.getY()) != 0;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: c */
    private Bitmap m25124c(Bitmap bitmap, double d, double d2) {
        float width = (float) bitmap.getWidth();
        float height = (float) bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(((float) d) / width, ((float) d2) / height);
        return Bitmap.createBitmap(bitmap, 0, 0, (int) width, (int) height, matrix, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x02f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            int r1 = r16.getWidth()
            r2 = 2
            int r1 = r1 / r2
            float r1 = (float) r1
            r0.f19398i = r1
            int r1 = r16.getHeight()
            int r1 = r1 / r2
            float r1 = (float) r1
            r0.f19397h = r1
            float r3 = r0.f19398i
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 / r4
            r0.f19398i = r3
            float r1 = r1 / r4
            r0.f19397h = r1
            float r1 = r17.getX()
            r0.f19396g = r1
            float r1 = r17.getY()
            r0.f19395f = r1
            int r1 = r17.getAction()
            r7 = 4645040803167600640(0x4076800000000000, double:360.0)
            r3 = 1
            r9 = 4633260481411531256(0x404ca5dc1a63c1f8, double:57.29577951308232)
            r11 = 0
            r12 = 4640537203540230144(0x4066800000000000, double:180.0)
            if (r1 == 0) goto L_0x0269
            if (r1 == r3) goto L_0x025b
            if (r1 == r2) goto L_0x0046
            goto L_0x0305
        L_0x0046:
            float r1 = r17.getX()
            r0.f19396g = r1
            float r1 = r17.getY()
            r0.f19395f = r1
            android.view.MotionEvent r14 = r0.f19406q
            if (r14 != 0) goto L_0x005b
            r14 = r17
            r0.f19406q = r14
            return r3
        L_0x005b:
            float r14 = r0.f19397h
            int r15 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r15 < 0) goto L_0x0075
            float r15 = r0.f19396g
            float r5 = r0.f19398i
            int r6 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r6 < 0) goto L_0x0075
            float r1 = r1 - r14
            float r15 = r15 - r5
            float r1 = r1 / r15
            double r5 = (double) r1
            double r5 = java.lang.Math.atan(r5)
            double r5 = r5 * r9
            double r5 = r5 + r12
            goto L_0x00cc
        L_0x0075:
            float r1 = r0.f19395f
            float r5 = r0.f19397h
            int r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x0092
            float r6 = r0.f19396g
            float r14 = r0.f19398i
            int r15 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r15 >= 0) goto L_0x0092
            float r1 = r1 - r5
            float r14 = r14 - r6
            float r1 = r1 / r14
            double r5 = (double) r1
            double r5 = java.lang.Math.atan(r5)
            double r5 = r5 * r9
            double r5 = r7 - r5
            goto L_0x00cc
        L_0x0092:
            float r1 = r0.f19396g
            float r5 = r0.f19398i
            int r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r6 >= 0) goto L_0x00ad
            float r6 = r0.f19395f
            float r7 = r0.f19397h
            int r8 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r8 >= 0) goto L_0x00ad
            float r7 = r7 - r6
            float r5 = r5 - r1
            float r7 = r7 / r5
            double r5 = (double) r7
            double r5 = java.lang.Math.atan(r5)
            double r5 = r5 * r9
            goto L_0x00cc
        L_0x00ad:
            float r1 = r0.f19396g
            float r5 = r0.f19398i
            int r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x00ca
            float r6 = r0.f19395f
            float r7 = r0.f19397h
            int r8 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r8 >= 0) goto L_0x00ca
            float r7 = r7 - r6
            float r1 = r1 - r5
            float r7 = r7 / r1
            double r5 = (double) r7
            double r5 = java.lang.Math.atan(r5)
            double r5 = r5 * r9
            double r5 = r12 - r5
            goto L_0x00cc
        L_0x00ca:
            r5 = 0
        L_0x00cc:
            double r7 = r0.f19399j
            double r5 = r5 - r7
            float r1 = (float) r5
            r0.f19400k = r1
            r5 = 0
            r6 = 1135869952(0x43b40000, float:360.0)
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 >= 0) goto L_0x00dc
            float r1 = r1 + r6
            r0.f19400k = r1
        L_0x00dc:
            float r1 = r0.f19400k
            float r1 = r1 % r6
            r0.f19400k = r1
            android.widget.ImageView r5 = r0.f19391b
            r5.setRotation(r1)
            android.widget.ImageView r1 = r0.f19391b
            float r1 = r1.getRotation()
            r5 = 1116471296(0x428c0000, float:70.0)
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x00f8
            float[] r7 = r0.f19404o
            float r5 = r5 - r1
            r7[r11] = r5
            goto L_0x00ff
        L_0x00f8:
            float[] r5 = r0.f19404o
            r7 = 1138163712(0x43d70000, float:430.0)
            float r7 = r7 - r1
            r5[r11] = r7
        L_0x00ff:
            float[] r1 = r0.f19404o
            r5 = r1[r11]
            r7 = 1124532224(0x43070000, float:135.0)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x010f
            r5 = r1[r11]
            float r5 = r5 - r7
            r1[r11] = r5
            goto L_0x0116
        L_0x010f:
            r5 = r1[r11]
            r7 = 1130430464(0x43610000, float:225.0)
            float r5 = r5 + r7
            r1[r11] = r5
        L_0x0116:
            float[] r1 = r0.f19404o
            r1[r3] = r4
            r1[r2] = r4
            android.widget.ImageView r1 = r0.f19391b
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
            r0.f19401l = r1
            android.widget.ImageView r1 = r0.f19391b
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
            r0.f19402m = r1
            android.widget.ImageView r1 = r0.f19391b
            float r1 = r1.getRotation()
            r2 = 1119092736(0x42b40000, float:90.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x0199
            android.widget.ImageView r1 = r0.f19391b
            float r1 = r1.getRotation()
            double r1 = (double) r1
            java.lang.Double.isNaN(r1)
            double r1 = r1 * r4
            double r1 = r1 / r12
            double r1 = java.lang.Math.sin(r1)
            double r1 = r1 * r7
            double r1 = r9 - r1
            int r1 = (int) r1
            r0.f19401l = r1
            android.widget.ImageView r1 = r0.f19391b
            float r1 = r1.getRotation()
            double r1 = (double) r1
            java.lang.Double.isNaN(r1)
            double r1 = r1 * r4
            double r1 = r1 / r12
            double r1 = java.lang.Math.cos(r1)
        L_0x0191:
            double r1 = r1 * r7
            double r9 = r9 - r1
            int r1 = (int) r9
        L_0x0195:
            r0.f19402m = r1
            goto L_0x0238
        L_0x0199:
            android.widget.ImageView r1 = r0.f19391b
            float r1 = r1.getRotation()
            r6 = 1127481344(0x43340000, float:180.0)
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 > 0) goto L_0x01d5
            android.widget.ImageView r1 = r0.f19391b
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
            r0.f19401l = r1
            android.widget.ImageView r1 = r0.f19391b
            float r1 = r1.getRotation()
            float r1 = r1 - r2
            double r1 = (double) r1
            java.lang.Double.isNaN(r1)
            double r1 = r1 * r4
            double r1 = r1 / r12
            double r1 = java.lang.Math.sin(r1)
        L_0x01d0:
            double r1 = r1 * r7
            double r1 = r1 + r9
            int r1 = (int) r1
            goto L_0x0195
        L_0x01d5:
            android.widget.ImageView r1 = r0.f19391b
            float r1 = r1.getRotation()
            r2 = 1132920832(0x43870000, float:270.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x020c
            android.widget.ImageView r1 = r0.f19391b
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
            r0.f19401l = r1
            android.widget.ImageView r1 = r0.f19391b
            float r1 = r1.getRotation()
            float r1 = r1 - r6
            double r1 = (double) r1
            java.lang.Double.isNaN(r1)
            double r1 = r1 * r4
            double r1 = r1 / r12
            double r1 = java.lang.Math.cos(r1)
            goto L_0x01d0
        L_0x020c:
            android.widget.ImageView r1 = r0.f19391b
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
            r0.f19401l = r1
            android.widget.ImageView r1 = r0.f19391b
            float r1 = r1.getRotation()
            float r1 = r1 - r2
            double r1 = (double) r1
            java.lang.Double.isNaN(r1)
            double r1 = r1 * r4
            double r1 = r1 / r12
            double r1 = java.lang.Math.sin(r1)
            goto L_0x0191
        L_0x0238:
            android.graphics.Bitmap r1 = r0.f19390a
            int r2 = r0.f19401l
            float r2 = (float) r2
            float r4 = r0.f19394e
            float r2 = r2 * r4
            int r2 = (int) r2
            int r5 = r0.f19402m
            float r5 = (float) r5
            float r5 = r5 * r4
            int r4 = (int) r5
            int r1 = r1.getPixel(r2, r4)
            r0.f19405p = r1
            r16.invalidate()
            com.yeelight.yeelib.ui.activity.ColorflowModeActivity$e r1 = r0.f19403n
            if (r1 == 0) goto L_0x025a
            int r2 = r0.f19405p
            r1.mo32221a(r2)
        L_0x025a:
            return r3
        L_0x025b:
            r1 = 0
            r0.f19406q = r1
            com.yeelight.yeelib.ui.activity.ColorflowModeActivity$e r1 = r0.f19403n
            if (r1 == 0) goto L_0x0305
            int r2 = r0.f19405p
            r1.mo32221a(r2)
            goto L_0x0305
        L_0x0269:
            r14 = r17
            boolean r1 = r16.m25123b(r17)
            if (r1 != 0) goto L_0x0279
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.String r2 = "touch false"
            r1.println(r2)
            return r11
        L_0x0279:
            float r1 = r0.f19395f
            float r2 = r0.f19397h
            int r4 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x0297
            float r4 = r0.f19396g
            float r5 = r0.f19398i
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 < 0) goto L_0x0297
            float r1 = r1 - r2
            float r4 = r4 - r5
            float r1 = r1 / r4
            double r1 = (double) r1
            double r1 = java.lang.Math.atan(r1)
            double r1 = r1 * r9
            double r1 = r1 + r12
        L_0x0294:
            r0.f19399j = r1
            goto L_0x02ec
        L_0x0297:
            float r1 = r0.f19395f
            float r2 = r0.f19397h
            int r4 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x02b4
            float r4 = r0.f19396g
            float r5 = r0.f19398i
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 >= 0) goto L_0x02b4
            float r1 = r1 - r2
            float r5 = r5 - r4
            float r1 = r1 / r5
            double r1 = (double) r1
            double r1 = java.lang.Math.atan(r1)
            double r1 = r1 * r9
            double r1 = r7 - r1
            goto L_0x0294
        L_0x02b4:
            float r1 = r0.f19396g
            float r2 = r0.f19398i
            int r4 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x02cf
            float r4 = r0.f19395f
            float r5 = r0.f19397h
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 >= 0) goto L_0x02cf
            float r5 = r5 - r4
            float r2 = r2 - r1
            float r5 = r5 / r2
            double r1 = (double) r5
            double r1 = java.lang.Math.atan(r1)
            double r1 = r1 * r9
            goto L_0x0294
        L_0x02cf:
            float r1 = r0.f19396g
            float r2 = r0.f19398i
            int r4 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x02ec
            float r4 = r0.f19395f
            float r5 = r0.f19397h
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 >= 0) goto L_0x02ec
            float r5 = r5 - r4
            float r1 = r1 - r2
            float r5 = r5 / r1
            double r1 = (double) r5
            double r1 = java.lang.Math.atan(r1)
            double r1 = r1 * r9
            double r12 = r12 - r1
            r0.f19399j = r12
        L_0x02ec:
            double r1 = r0.f19399j
            r4 = 0
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x02f7
            double r1 = r1 + r7
            r0.f19399j = r1
        L_0x02f7:
            double r1 = r0.f19399j
            float r4 = r0.f19400k
            double r4 = (double) r4
            java.lang.Double.isNaN(r4)
            double r1 = r1 - r4
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r1 = r1 + r4
            r0.f19399j = r1
        L_0x0305:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p194ui.view.ColorSelectView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setColor(int i) {
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        Color.colorToHSV(i, this.f19404o);
        float f = 0.0f;
        while (f <= 360.0f) {
            double d = (double) f;
            Double.isNaN(d);
            double d2 = (d * 3.141592653589793d) / 180.0d;
            this.f19401l = (int) (540.0d - (Math.sin(d2) * 312.0d));
            int cos = (int) (540.0d - (Math.cos(d2) * 312.0d));
            this.f19402m = cos;
            Bitmap bitmap = this.f19390a;
            float f2 = this.f19394e;
            int pixel = bitmap.getPixel((int) (((float) this.f19401l) * f2), (int) (((float) cos) * f2));
            if (Math.abs(Color.red(pixel) - red) >= 5 || Math.abs(Color.green(pixel) - green) >= 5 || Math.abs(Color.blue(pixel) - blue) >= 5) {
                f += 0.2f;
            } else {
                this.f19405p = i;
                this.f19391b.setRotation(f);
                this.f19400k = f;
                return;
            }
        }
    }

    public void setColorChangedListener(ColorflowModeActivity.C9967e eVar) {
        this.f19403n = eVar;
    }
}
