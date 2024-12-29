package com.yeelight.yeelib.p194ui.widget;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$style;
import com.yeelight.yeelib.utils.C10547m;

/* renamed from: com.yeelight.yeelib.ui.widget.a */
public class C10514a extends Dialog {

    /* renamed from: a */
    private LayoutInflater f20065a;

    /* renamed from: b */
    private int f20066b = getContext().getResources().getDisplayMetrics().widthPixels;

    /* renamed from: c */
    private View f20067c;

    /* renamed from: d */
    private ImageView f20068d;

    /* renamed from: e */
    private TextView f20069e;

    /* renamed from: f */
    private TextView f20070f;

    public C10514a(@NonNull Context context) {
        super(context, R$style.dialogstyle);
        LayoutInflater from = LayoutInflater.from(context);
        this.f20065a = from;
        this.f20067c = from.inflate(R$layout.yl_auth_dialog, (ViewGroup) null, false);
        int i = (int) (((float) this.f20066b) * 0.8f);
        int i2 = (int) (((float) i) * 1.18f);
        if (getWindow() != null) {
            getWindow().requestFeature(1);
        }
        setContentView(this.f20067c);
        getWindow().setLayout(i, i2);
        m25591b();
    }

    /* renamed from: a */
    private Bitmap m25590a(int i) {
        int i2;
        int i3;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        if (i == -1) {
            Bitmap decodeResource = BitmapFactory.decodeResource(getContext().getResources(), R$drawable.yl_dialog_image_bg);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(decodeResource, tileMode, tileMode));
            i3 = decodeResource.getWidth();
            i2 = decodeResource.getHeight();
        } else {
            int b = C10547m.m25752b(getContext(), 150.0f);
            paint.setColor(i);
            i2 = b;
            i3 = (int) (((float) this.f20066b) * 0.78f);
        }
        Bitmap createBitmap = Bitmap.createBitmap(i3, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float b2 = (float) C10547m.m25752b(getContext(), 3.0f);
        RectF rectF = new RectF(0.0f, 0.0f, (float) i3, (float) i2);
        Path path = new Path();
        path.addRoundRect(rectF, new float[]{b2, b2, b2, b2, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
        canvas.drawPath(path, paint);
        return createBitmap;
    }

    /* renamed from: b */
    private void m25591b() {
        this.f20069e = (TextView) this.f20067c.findViewById(R$id.yl_dialog_title);
        this.f20070f = (TextView) this.f20067c.findViewById(R$id.yl_dialog_message);
        this.f20068d = (ImageView) this.f20067c.findViewById(R$id.yl_abs_height_image);
        setCancelable(false);
    }

    /* renamed from: c */
    public void mo33276c(int i) {
        this.f20068d.setImageResource(i);
        this.f20068d.setBackground(new BitmapDrawable(m25590a(-1)));
    }

    /* renamed from: d */
    public void mo33277d(int i) {
        this.f20070f.setText(i);
    }

    public void setTitle(int i) {
        this.f20069e.setText(i);
    }
}
