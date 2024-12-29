package p170i4;

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
import p051j4.C9193k;

/* renamed from: i4.a */
public class C9106a extends Dialog {

    /* renamed from: a */
    private LayoutInflater f16789a;

    /* renamed from: b */
    private int f16790b = getContext().getResources().getDisplayMetrics().widthPixels;

    /* renamed from: c */
    private View f16791c;

    /* renamed from: d */
    private ImageView f16792d;

    /* renamed from: e */
    private TextView f16793e;

    /* renamed from: f */
    private TextView f16794f;

    public C9106a(@NonNull Context context) {
        super(context, R$style.dialogstyle);
        LayoutInflater from = LayoutInflater.from(context);
        this.f16789a = from;
        this.f16791c = from.inflate(R$layout.yl_auth_dialog, (ViewGroup) null, false);
        int i = (int) (((float) this.f16790b) * 0.8f);
        int i2 = (int) (((float) i) * 1.18f);
        if (getWindow() != null) {
            getWindow().requestFeature(1);
        }
        setContentView(this.f16791c);
        getWindow().setLayout(i, i2);
        m21858b();
    }

    /* renamed from: a */
    private Bitmap m21857a(int i) {
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
            int b = C9193k.m22151b(getContext(), 150.0f);
            paint.setColor(i);
            i2 = b;
            i3 = (int) (((float) this.f16790b) * 0.78f);
        }
        Bitmap createBitmap = Bitmap.createBitmap(i3, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float b2 = (float) C9193k.m22151b(getContext(), 3.0f);
        RectF rectF = new RectF(0.0f, 0.0f, (float) i3, (float) i2);
        Path path = new Path();
        path.addRoundRect(rectF, new float[]{b2, b2, b2, b2, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
        canvas.drawPath(path, paint);
        return createBitmap;
    }

    /* renamed from: b */
    private void m21858b() {
        this.f16793e = (TextView) this.f16791c.findViewById(R$id.yl_dialog_title);
        this.f16794f = (TextView) this.f16791c.findViewById(R$id.yl_dialog_message);
        this.f16792d = (ImageView) this.f16791c.findViewById(R$id.yl_abs_height_image);
        setCancelable(false);
    }

    /* renamed from: c */
    public void mo37123c(int i) {
        this.f16792d.setImageResource(i);
        this.f16792d.setBackground(new BitmapDrawable(m21857a(-1)));
    }

    /* renamed from: d */
    public void mo37124d(int i) {
        this.f16794f.setText(i);
    }

    public void setTitle(int i) {
        this.f16793e.setText(i);
    }
}
