package com.yeelight.yeelib.p191j.p192a;

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
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C10558v;

/* renamed from: com.yeelight.yeelib.j.a.c */
public class C9897c extends Dialog {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f17994a;

    /* renamed from: b */
    private int f17995b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public EditText f17996c;

    /* renamed from: d */
    private TextView f17997d;

    /* renamed from: e */
    private TextView f17998e;

    /* renamed from: f */
    private Button f17999f;

    /* renamed from: g */
    private Button f18000g;

    /* renamed from: h */
    private LayoutInflater f18001h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C9901d f18002i = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C9901d f18003j = null;

    /* renamed from: com.yeelight.yeelib.j.a.c$a */
    class C9898a implements View.OnClickListener {
        C9898a() {
        }

        public void onClick(View view) {
            if (C9897c.this.f18002i != null) {
                String str = null;
                if (C9897c.this.f17996c != null) {
                    str = C9897c.this.f17996c.getText().toString();
                }
                C9897c.this.f18002i.mo27312a(str, C9897c.this);
                return;
            }
            C9897c.this.dismiss();
        }
    }

    /* renamed from: com.yeelight.yeelib.j.a.c$b */
    class C9899b implements View.OnClickListener {
        C9899b() {
        }

        public void onClick(View view) {
            if (C9897c.this.f18003j != null) {
                String str = null;
                if (C9897c.this.f17996c != null) {
                    str = C9897c.this.f17996c.getText().toString();
                }
                C9897c.this.f18003j.mo27312a(str, C9897c.this);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.j.a.c$c */
    class C9900c implements Runnable {
        C9900c() {
        }

        public void run() {
            C9897c.this.f17996c.setFocusable(true);
            C9897c.this.f17996c.setFocusableInTouchMode(true);
            C9897c.this.f17996c.requestFocus();
            ((InputMethodManager) C9897c.this.f17994a.getSystemService("input_method")).showSoftInput(C9897c.this.f17996c, 0);
        }
    }

    /* renamed from: com.yeelight.yeelib.j.a.c$d */
    public interface C9901d {
        /* renamed from: a */
        void mo27312a(String str, C9897c cVar);
    }

    public C9897c(Context context, int i, boolean z) {
        super(context, R$style.dialogstyle);
        this.f17994a = context;
        this.f18001h = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f17995b = i;
        m24273g();
    }

    /* renamed from: e */
    public static C9897c m24272e(Context context, int i) {
        return new C9897c(context, i, false);
    }

    /* renamed from: g */
    private void m24273g() {
        int i;
        ImageView imageView;
        View inflate = this.f18001h.inflate(this.f17995b != 0 ? R$layout.common_dialog_message : R$layout.common_dialog_input, (ViewGroup) null, false);
        this.f17998e = (TextView) inflate.findViewById(R$id.dialog_message);
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
        this.f18000g = (Button) inflate.findViewById(R$id.dialog_btn_left);
        this.f17999f = (Button) inflate.findViewById(R$id.dialog_btn_right);
        this.f17997d = (TextView) inflate.findViewById(R$id.dialog_title);
        this.f18000g.setOnClickListener(new C9898a());
        this.f17999f.setOnClickListener(new C9899b());
        TextView textView = this.f17997d;
        Context context = this.f17994a;
        textView.setTextSize((float) C10547m.m25757g(context, (float) context.getResources().getDimensionPixelSize(R$dimen.common_dialog_title_normal)));
        int i2 = this.f17995b;
        if (i2 != 0) {
            if (i2 == 1) {
                this.f17997d.setVisibility(0);
                mo32006j(R$string.setting_unbind_text_1);
                setTitle(R$string.common_text_unbind);
                inflate.findViewById(R$id.dialog_imgs).setVisibility(0);
                imageView = (ImageView) inflate.findViewById(R$id.dialog_img);
                i = R$drawable.setting_unbind_large;
            } else if (i2 == 2) {
                this.f17997d.setVisibility(0);
                mo32006j(R$string.recovery_info);
                setTitle(R$string.feature_restore);
                inflate.findViewById(R$id.dialog_imgs).setVisibility(0);
                imageView = (ImageView) inflate.findViewById(R$id.dialog_img);
                i = R$drawable.setting_recovery_large;
            } else if (i2 == 5) {
                this.f17997d.setVisibility(0);
                mo32006j(R$string.mi_band_bind_unbind_sub);
                setTitle(R$string.common_text_unbind);
                inflate.findViewById(R$id.dialog_imgs).setVisibility(0);
                imageView = (ImageView) inflate.findViewById(R$id.dialog_img);
                i = R$drawable.mi_bind_icon_large;
            } else if (i2 == 6) {
                TextView textView2 = this.f17997d;
                Context context2 = this.f17994a;
                textView2.setTextSize((float) C10547m.m25757g(context2, (float) context2.getResources().getDimensionPixelSize(R$dimen.common_dialog_title_notice)));
                inflate.findViewById(R$id.dialog_imgs).setVisibility(8);
                this.f17997d.setVisibility(0);
                this.f17998e.setVisibility(8);
                return;
            } else if (i2 == 7) {
                this.f17997d.setVisibility(0);
                mo32006j(R$string.mi_band_bind_unbind_sub);
                setTitle(R$string.common_text_unbind);
                inflate.findViewById(R$id.dialog_imgs).setVisibility(0);
                imageView = (ImageView) inflate.findViewById(R$id.dialog_img);
                i = R$drawable.miband_luna_remove_tip;
            } else if (i2 == 8) {
                this.f17997d.setVisibility(0);
                mo32006j(R$string.mi_band_bind_unbind_sub);
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
        this.f17997d.setVisibility(0);
        EditText editText = (EditText) inflate.findViewById(R$id.dialog_et);
        this.f17996c = editText;
        editText.addTextChangedListener(new C10558v(this.f17996c, this));
        mo32009m(R$string.common_text_save);
    }

    /* renamed from: p */
    public static C9897c m24274p(Context context, String str, String str2, String str3, C9901d dVar, C9901d dVar2) {
        return m24275q(context, str, str2, str3, dVar, dVar2, true);
    }

    /* renamed from: q */
    public static C9897c m24275q(Context context, String str, String str2, String str3, C9901d dVar, C9901d dVar2, boolean z) {
        C9897c e = m24272e(context, 6);
        e.setCancelable(z);
        e.mo32011o(str);
        e.mo32004h(dVar);
        e.mo32008l(dVar2);
        if (str2 != null) {
            e.mo32005i(str2);
        }
        if (str3 != null) {
            e.mo32010n(str3);
        }
        e.show();
        return e;
    }

    /* renamed from: f */
    public void mo32003f(boolean z) {
        this.f17999f.setEnabled(z);
    }

    /* renamed from: h */
    public void mo32004h(C9901d dVar) {
        this.f18002i = dVar;
    }

    /* renamed from: i */
    public void mo32005i(String str) {
        Button button = this.f18000g;
        if (button != null) {
            button.setText(str);
        }
    }

    /* renamed from: j */
    public void mo32006j(int i) {
        mo32007k(this.f17994a.getResources().getString(i));
    }

    /* renamed from: k */
    public void mo32007k(String str) {
        TextView textView = this.f17998e;
        if (textView != null) {
            if (!textView.isShown()) {
                this.f17998e.setVisibility(0);
            }
            this.f17998e.setText(str);
        }
    }

    /* renamed from: l */
    public void mo32008l(C9901d dVar) {
        this.f18003j = dVar;
    }

    /* renamed from: m */
    public void mo32009m(int i) {
        mo32010n(this.f17994a.getResources().getString(i));
    }

    /* renamed from: n */
    public void mo32010n(String str) {
        Button button = this.f17999f;
        if (button != null) {
            button.setText(str);
        }
    }

    /* renamed from: o */
    public void mo32011o(String str) {
        TextView textView = this.f17997d;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setTitle(int i) {
        mo32011o(this.f17994a.getResources().getString(i));
    }

    public void show() {
        super.show();
        if (this.f17995b == 0) {
            new Handler(Looper.getMainLooper()).postDelayed(new C9900c(), 200);
        }
    }
}
