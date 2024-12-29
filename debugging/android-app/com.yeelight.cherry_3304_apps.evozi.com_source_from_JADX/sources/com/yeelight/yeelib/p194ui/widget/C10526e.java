package com.yeelight.yeelib.p194ui.widget;

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
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$style;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.p194ui.view.CircleImageView;
import com.yeelight.yeelib.utils.C10547m;
import java.util.Timer;
import java.util.TimerTask;
import p011c.p083d.p090b.C1203t;
import p011c.p083d.p090b.C1219x;

/* renamed from: com.yeelight.yeelib.ui.widget.e */
public class C10526e extends Dialog {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public InputTextView f20119a;

    /* renamed from: b */
    private ImageView f20120b;

    /* renamed from: c */
    private ImageView f20121c;

    /* renamed from: d */
    private TextView f20122d;

    /* renamed from: e */
    private TextView f20123e;

    /* renamed from: f */
    private Button f20124f;

    /* renamed from: g */
    private Button f20125g;

    /* renamed from: h */
    private View f20126h;

    /* renamed from: i */
    private View f20127i;

    /* renamed from: j */
    private LinearLayout f20128j;

    /* renamed from: k */
    private CircleImageView f20129k;

    /* renamed from: l */
    private CircleImageView f20130l;

    /* renamed from: m */
    private LayoutInflater f20131m;

    /* renamed from: n */
    private int f20132n = getContext().getResources().getDisplayMetrics().widthPixels;

    /* renamed from: o */
    private View f20133o;

    /* renamed from: com.yeelight.yeelib.ui.widget.e$a */
    class C10527a implements View.OnClickListener {
        C10527a() {
        }

        public void onClick(View view) {
            C10526e.this.dismiss();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.widget.e$b */
    class C10528b extends TimerTask {
        C10528b() {
        }

        public void run() {
            ((InputMethodManager) C10526e.this.getContext().getSystemService("input_method")).showSoftInput(C10526e.this.f20119a, 2);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.widget.e$c */
    class C10529c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogInterface.OnClickListener f20136a;

        C10529c(DialogInterface.OnClickListener onClickListener) {
            this.f20136a = onClickListener;
        }

        public void onClick(View view) {
            DialogInterface.OnClickListener onClickListener = this.f20136a;
            if (onClickListener != null) {
                onClickListener.onClick(C10526e.this, -1);
            } else {
                C10526e.this.dismiss();
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.widget.e$d */
    class C10530d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogInterface.OnClickListener f20138a;

        C10530d(DialogInterface.OnClickListener onClickListener) {
            this.f20138a = onClickListener;
        }

        public void onClick(View view) {
            DialogInterface.OnClickListener onClickListener = this.f20138a;
            if (onClickListener != null) {
                onClickListener.onClick(C10526e.this, -2);
            } else {
                C10526e.this.dismiss();
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.widget.e$e */
    public static class C10531e {

        /* renamed from: a */
        private C10526e f20140a;

        public C10531e(Context context) {
            this.f20140a = new C10526e(context);
        }

        /* renamed from: a */
        public C10531e mo33350a(Bitmap bitmap, String str) {
            this.f20140a.mo33336h(bitmap, str);
            return this;
        }

        /* renamed from: b */
        public C10526e mo33351b() {
            return this.f20140a;
        }

        /* renamed from: c */
        public C10531e mo33352c(int i) {
            this.f20140a.mo33334f(i);
            return this;
        }

        /* renamed from: d */
        public C10531e mo33353d(int i, String str, DialogInterface.OnClickListener onClickListener) {
            this.f20140a.mo33335g(i, str, onClickListener);
            return this;
        }

        /* renamed from: e */
        public C10531e mo33354e(int i) {
            this.f20140a.mo33337i(i);
            return this;
        }

        /* renamed from: f */
        public C10531e mo33355f(int i) {
            this.f20140a.mo33338j(i);
            return this;
        }

        /* renamed from: g */
        public C10531e mo33356g(String str) {
            this.f20140a.mo33339k(str);
            return this;
        }

        /* renamed from: h */
        public C10531e mo33357h(int i) {
            this.f20140a.setTitle(i);
            return this;
        }

        /* renamed from: i */
        public C10531e mo33358i(String str) {
            this.f20140a.setTitle((CharSequence) str);
            return this;
        }

        /* renamed from: j */
        public C10531e mo33359j() {
            this.f20140a.show();
            return this;
        }

        /* renamed from: k */
        public C10531e mo33360k(boolean z) {
            this.f20140a.mo33342n(z);
            return this;
        }
    }

    protected C10526e(Context context) {
        super(context, R$style.dialogstyle);
        LayoutInflater from = LayoutInflater.from(context);
        this.f20131m = from;
        this.f20133o = from.inflate(R$layout.yl_dialog_layout, (ViewGroup) null, false);
        double d = (double) this.f20132n;
        Double.isNaN(d);
        int i = (int) (d * 0.781d);
        if (getWindow() != null) {
            getWindow().requestFeature(1);
        }
        setContentView(this.f20133o);
        getWindow().setLayout(i, -2);
        getWindow().getDecorView().setBackground((Drawable) null);
        m25629e();
    }

    /* renamed from: b */
    private Bitmap m25628b(int i) {
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
            i3 = (int) (((float) this.f20132n) * 0.78f);
        }
        Bitmap createBitmap = Bitmap.createBitmap(i3, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float b2 = (float) C10547m.m25752b(getContext(), 5.0f);
        RectF rectF = new RectF(0.0f, 0.0f, (float) i3, (float) i2);
        Path path = new Path();
        path.addRoundRect(rectF, new float[]{b2, b2, b2, b2, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
        canvas.drawPath(path, paint);
        return createBitmap;
    }

    /* renamed from: e */
    private void m25629e() {
        this.f20119a = (InputTextView) this.f20133o.findViewById(R$id.yl_dialog_input);
        this.f20120b = (ImageView) this.f20133o.findViewById(R$id.yl_dialog_image);
        this.f20122d = (TextView) this.f20133o.findViewById(R$id.yl_dialog_title);
        this.f20123e = (TextView) this.f20133o.findViewById(R$id.yl_dialog_message);
        this.f20124f = (Button) this.f20133o.findViewById(R$id.yl_dialog_btn_left);
        this.f20125g = (Button) this.f20133o.findViewById(R$id.yl_dialog_btn_right);
        Button button = (Button) this.f20133o.findViewById(R$id.yl_dialog_btn_up);
        Button button2 = (Button) this.f20133o.findViewById(R$id.yl_dialog_btn_down);
        LinearLayout linearLayout = (LinearLayout) this.f20133o.findViewById(R$id.btn_layout_left_right);
        LinearLayout linearLayout2 = (LinearLayout) this.f20133o.findViewById(R$id.btn_layout_up_down);
        this.f20126h = this.f20133o.findViewById(R$id.yl_dialog_title_space);
        this.f20127i = this.f20133o.findViewById(R$id.yl_dialog_btn_space);
        this.f20128j = (LinearLayout) this.f20133o.findViewById(R$id.yl_dialog_share_device);
        this.f20129k = (CircleImageView) this.f20133o.findViewById(R$id.share_device_type_view);
        this.f20130l = (CircleImageView) this.f20133o.findViewById(R$id.share_device_user);
        this.f20121c = (ImageView) this.f20133o.findViewById(R$id.yl_abs_height_image);
        this.f20125g.setOnClickListener(new C10527a());
        setCancelable(false);
    }

    /* renamed from: c */
    public InputTextView mo33332c() {
        return this.f20119a;
    }

    /* renamed from: d */
    public void mo33333d() {
        if (this.f20119a != null) {
            ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f20119a.getWindowToken(), 0);
        }
    }

    /* renamed from: f */
    public void mo33334f(int i) {
        this.f20126h.setVisibility(8);
        this.f20121c.setVisibility(0);
        this.f20121c.setImageResource(i);
        this.f20121c.setBackground(new BitmapDrawable(m25628b(-1)));
    }

    /* renamed from: g */
    public void mo33335g(int i, String str, DialogInterface.OnClickListener onClickListener) {
        View.OnClickListener onClickListener2;
        Button button;
        if (i == -2) {
            this.f20124f.setVisibility(0);
            this.f20127i.setVisibility(0);
            this.f20124f.setText(str);
            button = this.f20124f;
            onClickListener2 = new C10530d(onClickListener);
        } else if (i == -1) {
            this.f20125g.setText(str);
            button = this.f20125g;
            onClickListener2 = new C10529c(onClickListener);
        } else {
            return;
        }
        button.setOnClickListener(onClickListener2);
    }

    /* renamed from: h */
    public void mo33336h(Bitmap bitmap, String str) {
        this.f20128j.setVisibility(0);
        this.f20129k.setImageBitmap(bitmap);
        if (str == null || str.isEmpty()) {
            this.f20130l.setImageResource(R$drawable.icon_yeelight_user_default_avata);
            return;
        }
        C1219x j = C1203t.m3106o(C4297y.f7456e).mo10003j(str);
        j.mo10038f(R$drawable.icon_yeelight_user_default_avata);
        j.mo10036d(this.f20130l);
    }

    /* renamed from: i */
    public void mo33337i(int i) {
        mo33341m(true);
        this.f20120b.setImageResource(i);
    }

    /* renamed from: j */
    public void mo33338j(int i) {
        this.f20123e.setText(i);
        this.f20123e.setVisibility(0);
    }

    /* renamed from: k */
    public void mo33339k(String str) {
        this.f20123e.setText(str);
        this.f20123e.setVisibility(0);
    }

    /* renamed from: l */
    public void mo33340l(int i) {
        this.f20123e.setTextColor(getContext().getResources().getColor(i));
    }

    /* renamed from: m */
    public void mo33341m(boolean z) {
        if (z) {
            this.f20120b.setVisibility(0);
            this.f20126h.setVisibility(8);
            return;
        }
        this.f20120b.setVisibility(8);
        this.f20126h.setVisibility(0);
    }

    /* renamed from: n */
    public void mo33342n(boolean z) {
        this.f20119a.setVisibility(z ? 0 : 8);
    }

    /* renamed from: o */
    public void mo33343o() {
        if (this.f20119a != null) {
            new Timer().schedule(new C10528b(), 500);
        }
    }

    public void setTitle(@StringRes int i) {
        this.f20122d.setText(i);
        this.f20122d.setVisibility(0);
    }

    public void setTitle(@Nullable CharSequence charSequence) {
        this.f20122d.setText(charSequence);
        this.f20122d.setVisibility(0);
    }
}
