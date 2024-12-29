package p170i4;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.squareup.picasso.Picasso;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$style;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.p142ui.view.CircleImageView;
import com.yeelight.yeelib.p142ui.widget.InputTextView;
import java.util.Timer;
import java.util.TimerTask;
import p051j4.C9193k;

/* renamed from: i4.d */
public class C9113d extends Dialog {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public InputTextView f16834a;

    /* renamed from: b */
    private ImageView f16835b;

    /* renamed from: c */
    private ImageView f16836c;

    /* renamed from: d */
    private TextView f16837d;

    /* renamed from: e */
    private TextView f16838e;

    /* renamed from: f */
    private Button f16839f;

    /* renamed from: g */
    private Button f16840g;

    /* renamed from: h */
    private View f16841h;

    /* renamed from: i */
    private View f16842i;

    /* renamed from: j */
    private LinearLayout f16843j;

    /* renamed from: k */
    private CircleImageView f16844k;

    /* renamed from: l */
    private CircleImageView f16845l;

    /* renamed from: m */
    private LayoutInflater f16846m;

    /* renamed from: n */
    private int f16847n = getContext().getResources().getDisplayMetrics().widthPixels;

    /* renamed from: o */
    private View f16848o;

    /* renamed from: i4.d$a */
    class C9114a implements View.OnClickListener {
        C9114a() {
        }

        public void onClick(View view) {
            C9113d.this.dismiss();
        }
    }

    /* renamed from: i4.d$b */
    class C9115b extends TimerTask {
        C9115b() {
        }

        public void run() {
            ((InputMethodManager) C9113d.this.getContext().getSystemService("input_method")).showSoftInput(C9113d.this.f16834a, 2);
        }
    }

    /* renamed from: i4.d$c */
    class C9116c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogInterface.OnClickListener f16851a;

        C9116c(DialogInterface.OnClickListener onClickListener) {
            this.f16851a = onClickListener;
        }

        public void onClick(View view) {
            DialogInterface.OnClickListener onClickListener = this.f16851a;
            if (onClickListener != null) {
                onClickListener.onClick(C9113d.this, -1);
            } else {
                C9113d.this.dismiss();
            }
        }
    }

    /* renamed from: i4.d$d */
    class C9117d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogInterface.OnClickListener f16853a;

        C9117d(DialogInterface.OnClickListener onClickListener) {
            this.f16853a = onClickListener;
        }

        public void onClick(View view) {
            DialogInterface.OnClickListener onClickListener = this.f16853a;
            if (onClickListener != null) {
                onClickListener.onClick(C9113d.this, -2);
            } else {
                C9113d.this.dismiss();
            }
        }
    }

    /* renamed from: i4.d$e */
    public static class C9118e {

        /* renamed from: a */
        private C9113d f16855a;

        public C9118e(Context context) {
            this.f16855a = new C9113d(context);
        }

        /* renamed from: a */
        public C9118e mo37171a(Bitmap bitmap, String str) {
            this.f16855a.mo37157h(bitmap, str);
            return this;
        }

        /* renamed from: b */
        public C9113d mo37172b() {
            return this.f16855a;
        }

        /* renamed from: c */
        public C9118e mo37173c(int i) {
            this.f16855a.mo37155f(i);
            return this;
        }

        /* renamed from: d */
        public C9118e mo37174d(int i, String str, DialogInterface.OnClickListener onClickListener) {
            this.f16855a.mo37156g(i, str, onClickListener);
            return this;
        }

        /* renamed from: e */
        public C9118e mo37175e(int i) {
            this.f16855a.mo37158i(i);
            return this;
        }

        /* renamed from: f */
        public C9118e mo37176f(int i) {
            this.f16855a.mo37159j(i);
            return this;
        }

        /* renamed from: g */
        public C9118e mo37177g(String str) {
            this.f16855a.mo37160k(str);
            return this;
        }

        /* renamed from: h */
        public C9118e mo37178h(int i) {
            this.f16855a.setTitle(i);
            return this;
        }

        /* renamed from: i */
        public C9118e mo37179i(String str) {
            this.f16855a.setTitle((CharSequence) str);
            return this;
        }

        /* renamed from: j */
        public C9118e mo37180j() {
            this.f16855a.show();
            return this;
        }

        /* renamed from: k */
        public C9118e mo37181k(boolean z) {
            this.f16855a.mo37163n(z);
            return this;
        }
    }

    protected C9113d(Context context) {
        super(context, R$style.dialogstyle);
        LayoutInflater from = LayoutInflater.from(context);
        this.f16846m = from;
        this.f16848o = from.inflate(R$layout.yl_dialog_layout, (ViewGroup) null, false);
        double d = (double) this.f16847n;
        Double.isNaN(d);
        int i = (int) (d * 0.781d);
        if (getWindow() != null) {
            getWindow().requestFeature(1);
        }
        setContentView(this.f16848o);
        getWindow().setLayout(i, -2);
        getWindow().getDecorView().setBackground((Drawable) null);
        m21877e();
    }

    /* renamed from: b */
    private Bitmap m21876b(int i) {
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
            i3 = (int) (((float) this.f16847n) * 0.78f);
        }
        Bitmap createBitmap = Bitmap.createBitmap(i3, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float b2 = (float) C9193k.m22151b(getContext(), 5.0f);
        RectF rectF = new RectF(0.0f, 0.0f, (float) i3, (float) i2);
        Path path = new Path();
        path.addRoundRect(rectF, new float[]{b2, b2, b2, b2, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
        canvas.drawPath(path, paint);
        return createBitmap;
    }

    /* renamed from: e */
    private void m21877e() {
        this.f16834a = (InputTextView) this.f16848o.findViewById(R$id.yl_dialog_input);
        this.f16835b = (ImageView) this.f16848o.findViewById(R$id.yl_dialog_image);
        this.f16837d = (TextView) this.f16848o.findViewById(R$id.yl_dialog_title);
        this.f16838e = (TextView) this.f16848o.findViewById(R$id.yl_dialog_message);
        this.f16839f = (Button) this.f16848o.findViewById(R$id.yl_dialog_btn_left);
        this.f16840g = (Button) this.f16848o.findViewById(R$id.yl_dialog_btn_right);
        Button button = (Button) this.f16848o.findViewById(R$id.yl_dialog_btn_up);
        Button button2 = (Button) this.f16848o.findViewById(R$id.yl_dialog_btn_down);
        LinearLayout linearLayout = (LinearLayout) this.f16848o.findViewById(R$id.btn_layout_left_right);
        LinearLayout linearLayout2 = (LinearLayout) this.f16848o.findViewById(R$id.btn_layout_up_down);
        this.f16841h = this.f16848o.findViewById(R$id.yl_dialog_title_space);
        this.f16842i = this.f16848o.findViewById(R$id.yl_dialog_btn_space);
        this.f16843j = (LinearLayout) this.f16848o.findViewById(R$id.yl_dialog_share_device);
        this.f16844k = (CircleImageView) this.f16848o.findViewById(R$id.share_device_type_view);
        this.f16845l = (CircleImageView) this.f16848o.findViewById(R$id.share_device_user);
        this.f16836c = (ImageView) this.f16848o.findViewById(R$id.yl_abs_height_image);
        this.f16840g.setOnClickListener(new C9114a());
        setCancelable(false);
    }

    /* renamed from: c */
    public InputTextView mo37153c() {
        return this.f16834a;
    }

    /* renamed from: d */
    public void mo37154d() {
        if (this.f16834a != null) {
            ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f16834a.getWindowToken(), 0);
        }
    }

    /* renamed from: f */
    public void mo37155f(int i) {
        this.f16841h.setVisibility(8);
        this.f16836c.setVisibility(0);
        this.f16836c.setImageResource(i);
        this.f16836c.setBackground(new BitmapDrawable(m21876b(-1)));
    }

    /* renamed from: g */
    public void mo37156g(int i, String str, DialogInterface.OnClickListener onClickListener) {
        View.OnClickListener onClickListener2;
        Button button;
        if (i == -2) {
            this.f16839f.setVisibility(0);
            this.f16842i.setVisibility(0);
            this.f16839f.setText(str);
            button = this.f16839f;
            onClickListener2 = new C9117d(onClickListener);
        } else if (i == -1) {
            this.f16840g.setText(str);
            button = this.f16840g;
            onClickListener2 = new C9116c(onClickListener);
        } else {
            return;
        }
        button.setOnClickListener(onClickListener2);
    }

    /* renamed from: h */
    public void mo37157h(Bitmap bitmap, String str) {
        this.f16843j.setVisibility(0);
        this.f16844k.setImageBitmap(bitmap);
        if (str == null || str.isEmpty()) {
            this.f16845l.setImageResource(R$drawable.icon_yeelight_user_default_avata);
        } else {
            Picasso.m12253o(C3108x.f4951e).mo28111j(str).mo28225f(R$drawable.icon_yeelight_user_default_avata).mo28223d(this.f16845l);
        }
    }

    /* renamed from: i */
    public void mo37158i(int i) {
        mo37162m(true);
        this.f16835b.setImageResource(i);
    }

    /* renamed from: j */
    public void mo37159j(int i) {
        this.f16838e.setText(i);
        this.f16838e.setVisibility(0);
    }

    /* renamed from: k */
    public void mo37160k(String str) {
        this.f16838e.setText(str);
        this.f16838e.setVisibility(0);
    }

    /* renamed from: l */
    public void mo37161l(int i) {
        this.f16838e.setTextColor(getContext().getResources().getColor(i));
    }

    /* renamed from: m */
    public void mo37162m(boolean z) {
        if (z) {
            this.f16835b.setVisibility(0);
            this.f16841h.setVisibility(8);
            return;
        }
        this.f16835b.setVisibility(8);
        this.f16841h.setVisibility(0);
    }

    /* renamed from: n */
    public void mo37163n(boolean z) {
        this.f16834a.setVisibility(z ? 0 : 8);
    }

    /* renamed from: o */
    public void mo37164o() {
        if (this.f16834a != null) {
            new Timer().schedule(new C9115b(), 500);
        }
    }

    public void setTitle(@StringRes int i) {
        this.f16837d.setText(i);
        this.f16837d.setVisibility(0);
    }

    public void setTitle(@Nullable CharSequence charSequence) {
        this.f16837d.setText(charSequence);
        this.f16837d.setVisibility(0);
    }
}
