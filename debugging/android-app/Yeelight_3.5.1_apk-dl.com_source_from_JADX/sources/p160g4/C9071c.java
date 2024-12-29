package p160g4;

import android.app.Dialog;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.yeelight.yeelib.R$dimen;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.R$style;
import p051j4.C9193k;
import p051j4.C9204t;

/* renamed from: g4.c */
public class C9071c extends Dialog {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f16663a;

    /* renamed from: b */
    private int f16664b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public EditText f16665c;

    /* renamed from: d */
    private TextView f16666d;

    /* renamed from: e */
    private TextView f16667e;

    /* renamed from: f */
    private Button f16668f;

    /* renamed from: g */
    private Button f16669g;

    /* renamed from: h */
    private LayoutInflater f16670h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C9075d f16671i = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C9075d f16672j = null;

    /* renamed from: g4.c$a */
    class C9072a implements View.OnClickListener {
        C9072a() {
        }

        public void onClick(View view) {
            if (C9071c.this.f16671i != null) {
                String str = null;
                if (C9071c.this.f16665c != null) {
                    str = C9071c.this.f16665c.getText().toString();
                }
                C9071c.this.f16671i.mo31271a(str, C9071c.this);
                return;
            }
            C9071c.this.dismiss();
        }
    }

    /* renamed from: g4.c$b */
    class C9073b implements View.OnClickListener {
        C9073b() {
        }

        public void onClick(View view) {
            if (C9071c.this.f16672j != null) {
                String str = null;
                if (C9071c.this.f16665c != null) {
                    str = C9071c.this.f16665c.getText().toString();
                }
                C9071c.this.f16672j.mo31271a(str, C9071c.this);
            }
        }
    }

    /* renamed from: g4.c$c */
    class C9074c implements Runnable {
        C9074c() {
        }

        public void run() {
            C9071c.this.f16665c.setFocusable(true);
            C9071c.this.f16665c.setFocusableInTouchMode(true);
            C9071c.this.f16665c.requestFocus();
            ((InputMethodManager) C9071c.this.f16663a.getSystemService("input_method")).showSoftInput(C9071c.this.f16665c, 0);
        }
    }

    /* renamed from: g4.c$d */
    public interface C9075d {
        /* renamed from: a */
        void mo31271a(String str, C9071c cVar);
    }

    public C9071c(Context context, int i, boolean z) {
        super(context, R$style.dialogstyle);
        this.f16663a = context;
        this.f16670h = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f16664b = i;
        m21726g();
    }

    /* renamed from: e */
    public static C9071c m21725e(Context context, int i) {
        return new C9071c(context, i, false);
    }

    /* renamed from: g */
    private void m21726g() {
        int i;
        ImageView imageView;
        View inflate = this.f16670h.inflate(this.f16664b != 0 ? R$layout.common_dialog_message : R$layout.common_dialog_input, (ViewGroup) null, false);
        this.f16667e = (TextView) inflate.findViewById(R$id.dialog_message);
        requestWindowFeature(1);
        setContentView(inflate);
        getWindow().setLayout(-1, -2);
        getWindow().getDecorView().setPadding(0, 0, 0, 0);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.horizontalMargin = 0.0f;
        attributes.verticalMargin = 0.0f;
        attributes.gravity = 80;
        getWindow().setAttributes(attributes);
        getWindow().setWindowAnimations(R$style.alarm_popup_window_animation_style);
        this.f16669g = (Button) inflate.findViewById(R$id.dialog_btn_left);
        this.f16668f = (Button) inflate.findViewById(R$id.dialog_btn_right);
        this.f16666d = (TextView) inflate.findViewById(R$id.dialog_title);
        this.f16669g.setOnClickListener(new C9072a());
        this.f16668f.setOnClickListener(new C9073b());
        TextView textView = this.f16666d;
        Context context = this.f16663a;
        textView.setTextSize((float) C9193k.m22156g(context, (float) context.getResources().getDimensionPixelSize(R$dimen.common_dialog_title_normal)));
        int i2 = this.f16664b;
        if (i2 != 0) {
            if (i2 == 1) {
                this.f16666d.setVisibility(0);
                mo37018j(R$string.setting_unbind_text_1);
                setTitle(R$string.common_text_unbind);
                inflate.findViewById(R$id.dialog_imgs).setVisibility(0);
                imageView = (ImageView) inflate.findViewById(R$id.dialog_img);
                i = R$drawable.setting_unbind_large;
            } else if (i2 == 2) {
                this.f16666d.setVisibility(0);
                mo37018j(R$string.recovery_info);
                setTitle(R$string.feature_restore);
                inflate.findViewById(R$id.dialog_imgs).setVisibility(0);
                imageView = (ImageView) inflate.findViewById(R$id.dialog_img);
                i = R$drawable.setting_recovery_large;
            } else if (i2 == 5) {
                this.f16666d.setVisibility(0);
                mo37018j(R$string.mi_band_bind_unbind_sub);
                setTitle(R$string.common_text_unbind);
                inflate.findViewById(R$id.dialog_imgs).setVisibility(0);
                imageView = (ImageView) inflate.findViewById(R$id.dialog_img);
                i = R$drawable.mi_bind_icon_large;
            } else if (i2 == 6) {
                TextView textView2 = this.f16666d;
                Context context2 = this.f16663a;
                textView2.setTextSize((float) C9193k.m22156g(context2, (float) context2.getResources().getDimensionPixelSize(R$dimen.common_dialog_title_notice)));
                inflate.findViewById(R$id.dialog_imgs).setVisibility(8);
                this.f16666d.setVisibility(0);
                this.f16667e.setVisibility(8);
                return;
            } else if (i2 == 7) {
                this.f16666d.setVisibility(0);
                mo37018j(R$string.mi_band_bind_unbind_sub);
                setTitle(R$string.common_text_unbind);
                inflate.findViewById(R$id.dialog_imgs).setVisibility(0);
                imageView = (ImageView) inflate.findViewById(R$id.dialog_img);
                i = R$drawable.miband_luna_remove_tip;
            } else if (i2 == 8) {
                this.f16666d.setVisibility(0);
                mo37018j(R$string.mi_band_bind_unbind_sub);
                setTitle(R$string.common_text_unbind);
                inflate.findViewById(R$id.dialog_imgs).setVisibility(0);
                imageView = (ImageView) inflate.findViewById(R$id.dialog_img);
                i = R$drawable.miband_eos_remove_tip;
            } else {
                return;
            }
            imageView.setImageResource(i);
            return;
        }
        this.f16666d.setVisibility(0);
        EditText editText = (EditText) inflate.findViewById(R$id.dialog_et);
        this.f16665c = editText;
        editText.addTextChangedListener(new C9204t(this.f16665c, this));
        mo37021m(R$string.common_text_save);
    }

    /* renamed from: p */
    public static C9071c m21727p(Context context, String str, String str2, String str3, C9075d dVar, C9075d dVar2) {
        return m21728q(context, str, str2, str3, dVar, dVar2, true);
    }

    /* renamed from: q */
    public static C9071c m21728q(Context context, String str, String str2, String str3, C9075d dVar, C9075d dVar2, boolean z) {
        C9071c e = m21725e(context, 6);
        e.setCancelable(z);
        e.mo37023o(str);
        e.mo37016h(dVar);
        e.mo37020l(dVar2);
        if (str2 != null) {
            e.mo37017i(str2);
        }
        if (str3 != null) {
            e.mo37022n(str3);
        }
        e.show();
        return e;
    }

    /* renamed from: f */
    public void mo37015f(boolean z) {
        this.f16668f.setEnabled(z);
    }

    /* renamed from: h */
    public void mo37016h(C9075d dVar) {
        this.f16671i = dVar;
    }

    /* renamed from: i */
    public void mo37017i(String str) {
        Button button = this.f16669g;
        if (button != null) {
            button.setText(str);
        }
    }

    /* renamed from: j */
    public void mo37018j(int i) {
        mo37019k(this.f16663a.getResources().getString(i));
    }

    /* renamed from: k */
    public void mo37019k(String str) {
        TextView textView = this.f16667e;
        if (textView != null) {
            if (!textView.isShown()) {
                this.f16667e.setVisibility(0);
            }
            this.f16667e.setText(str);
        }
    }

    /* renamed from: l */
    public void mo37020l(C9075d dVar) {
        this.f16672j = dVar;
    }

    /* renamed from: m */
    public void mo37021m(int i) {
        mo37022n(this.f16663a.getResources().getString(i));
    }

    /* renamed from: n */
    public void mo37022n(String str) {
        Button button = this.f16668f;
        if (button != null) {
            button.setText(str);
        }
    }

    /* renamed from: o */
    public void mo37023o(String str) {
        TextView textView = this.f16666d;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setTitle(int i) {
        mo37023o(this.f16663a.getResources().getString(i));
    }

    public void show() {
        super.show();
        if (this.f16664b == 0) {
            new Handler(Looper.getMainLooper()).postDelayed(new C9074c(), 200);
        }
    }
}
