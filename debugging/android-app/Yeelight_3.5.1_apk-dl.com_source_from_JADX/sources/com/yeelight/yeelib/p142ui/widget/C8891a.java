package com.yeelight.yeelib.p142ui.widget;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.yeelight.yeelib.R$dimen;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$style;
import com.yeelight.yeelib.p142ui.widget.YLAlertController;
import java.io.UnsupportedEncodingException;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.yeelight.yeelib.ui.widget.a */
public class C8891a extends Dialog {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public YLAlertController f16323a;

    /* renamed from: b */
    private Context f16324b;

    /* renamed from: c */
    private C8895c f16325c;

    /* renamed from: d */
    private int f16326d;

    /* renamed from: com.yeelight.yeelib.ui.widget.a$a */
    class C8892a extends TimerTask {
        C8892a() {
        }

        public void run() {
            ((InputMethodManager) C8891a.this.getContext().getSystemService("input_method")).showSoftInput(C8891a.this.f16323a.mo36631x(), 2);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.widget.a$b */
    public static class C8893b {

        /* renamed from: a */
        private final YLAlertController.C8882c f16328a;

        /* renamed from: b */
        private Context f16329b;

        /* renamed from: com.yeelight.yeelib.ui.widget.a$b$a */
        class C8894a implements TextWatcher {

            /* renamed from: a */
            final /* synthetic */ int f16330a;

            /* renamed from: b */
            final /* synthetic */ EditText f16331b;

            C8894a(C8893b bVar, int i, EditText editText) {
                this.f16330a = i;
                this.f16331b = editText;
            }

            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                String str;
                if (i2 > 0) {
                    return;
                }
                if ((i != 0 || i3 != 0) && this.f16330a != 0) {
                    try {
                        if (this.f16331b.getText().toString().getBytes("utf-8").length > this.f16330a) {
                            int selectionEnd = Selection.getSelectionEnd(this.f16331b.getText());
                            String obj = this.f16331b.getText().toString();
                            int i4 = i3 + i;
                            if (i4 == obj.length()) {
                                str = obj.substring(0, i);
                            } else {
                                str = obj.substring(0, i) + obj.substring(i4, obj.length());
                            }
                            this.f16331b.setText(str);
                            Editable text = this.f16331b.getText();
                            if (selectionEnd > text.length()) {
                                selectionEnd = text.length();
                            }
                            Selection.setSelection(text, selectionEnd);
                        }
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        public C8893b(Context context) {
            this.f16329b = context;
            this.f16328a = new YLAlertController.C8882c(context);
        }

        /* renamed from: a */
        public C8891a mo36655a() {
            C8891a aVar = new C8891a(this.f16328a.f16279a);
            YLAlertController.C8882c cVar = this.f16328a;
            CharSequence[] charSequenceArr = cVar.f16295q;
            cVar.mo36635a(aVar.f16323a);
            aVar.setCancelable(this.f16328a.f16292n);
            if (this.f16328a.f16292n) {
                aVar.setCanceledOnTouchOutside(true);
            }
            aVar.setOnCancelListener(this.f16328a.f16293o);
            DialogInterface.OnKeyListener onKeyListener = this.f16328a.f16294p;
            if (onKeyListener != null) {
                aVar.setOnKeyListener(onKeyListener);
            }
            aVar.mo36646d(this.f16328a.f16276M);
            return aVar;
        }

        /* renamed from: b */
        public C8893b mo36656b(boolean z) {
            this.f16328a.f16275L = z;
            return this;
        }

        /* renamed from: c */
        public C8893b mo36657c(boolean z) {
            this.f16328a.f16292n = z;
            return this;
        }

        /* renamed from: d */
        public C8893b mo36658d(String str, boolean z, int i) {
            View inflate = View.inflate(this.f16329b, R$layout.yl_alert_dialog_input_view, (ViewGroup) null);
            Resources resources = this.f16329b.getResources();
            int i2 = R$dimen.alertdialog_button_panel_padding_horizontal;
            mo36666l(inflate, resources.getDimensionPixelSize(i2), 0, this.f16329b.getResources().getDimensionPixelSize(i2), this.f16329b.getResources().getDimensionPixelSize(R$dimen.alertdialog_custom_panel_padding_bottom));
            EditText editText = (EditText) inflate.findViewById(R$id.input_text);
            editText.setSingleLine(z);
            editText.addTextChangedListener(new C8894a(this, i, editText));
            if (!TextUtils.isEmpty(str)) {
                editText.setText(str);
            } else {
                editText.setHint("");
            }
            editText.requestFocus();
            return this;
        }

        /* renamed from: e */
        public C8893b mo36659e(CharSequence charSequence) {
            this.f16328a.f16285g = charSequence;
            return this;
        }

        /* renamed from: f */
        public C8893b mo36660f(int i, DialogInterface.OnClickListener onClickListener) {
            YLAlertController.C8882c cVar = this.f16328a;
            cVar.f16288j = cVar.f16279a.getText(i);
            this.f16328a.f16289k = onClickListener;
            return this;
        }

        /* renamed from: g */
        public C8893b mo36661g(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            YLAlertController.C8882c cVar = this.f16328a;
            cVar.f16288j = charSequence;
            cVar.f16289k = onClickListener;
            return this;
        }

        /* renamed from: h */
        public C8893b mo36662h(int i, DialogInterface.OnClickListener onClickListener) {
            YLAlertController.C8882c cVar = this.f16328a;
            cVar.f16286h = cVar.f16279a.getText(i);
            this.f16328a.f16287i = onClickListener;
            return this;
        }

        /* renamed from: i */
        public C8893b mo36663i(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            YLAlertController.C8882c cVar = this.f16328a;
            cVar.f16286h = charSequence;
            cVar.f16287i = onClickListener;
            return this;
        }

        /* renamed from: j */
        public C8893b mo36664j(CharSequence charSequence) {
            this.f16328a.f16283e = charSequence;
            return this;
        }

        /* renamed from: k */
        public C8893b mo36665k(View view) {
            YLAlertController.C8882c cVar = this.f16328a;
            cVar.f16298t = view;
            cVar.f16303y = false;
            return this;
        }

        /* renamed from: l */
        public C8893b mo36666l(View view, int i, int i2, int i3, int i4) {
            YLAlertController.C8882c cVar = this.f16328a;
            cVar.f16298t = view;
            cVar.f16303y = true;
            cVar.f16299u = i;
            cVar.f16300v = i2;
            cVar.f16301w = i3;
            cVar.f16302x = i4;
            return this;
        }

        /* renamed from: m */
        public C8891a mo36667m() {
            C8891a a = mo36655a();
            a.show();
            WindowManager.LayoutParams attributes = a.getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -2;
            a.getWindow().setAttributes(attributes);
            return a;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.widget.a$c */
    public interface C8895c {
        void afterDismissCallBack();

        void beforeDismissCallBack();
    }

    protected C8891a(Context context) {
        this(context, R$style.V5_AlertDialog);
    }

    protected C8891a(Context context, int i) {
        this(context, i, 80, 0);
    }

    protected C8891a(Context context, int i, int i2, int i3) {
        super(context, i);
        this.f16326d = 0;
        this.f16323a = new YLAlertController(context, this, getWindow(), i2);
        this.f16324b = context;
        this.f16326d = i3;
    }

    /* renamed from: c */
    private void m21205c() {
        if (this.f16323a.mo36631x() != null) {
            ((InputMethodManager) this.f16324b.getSystemService("input_method")).hideSoftInputFromWindow(this.f16323a.mo36631x().getWindowToken(), 0);
        }
    }

    /* renamed from: f */
    private void m21206f() {
        if (this.f16323a.mo36631x() != null && (this.f16323a.mo36631x() instanceof EditText)) {
            new Timer().schedule(new C8892a(), 200);
        }
    }

    /* renamed from: b */
    public EditText mo36645b() {
        return (EditText) this.f16323a.mo36631x();
    }

    /* renamed from: d */
    public void mo36646d(C8895c cVar) {
        this.f16325c = cVar;
    }

    public void dismiss() {
        C8895c cVar = this.f16325c;
        if (cVar != null) {
            cVar.beforeDismissCallBack();
        }
        m21205c();
        super.dismiss();
        C8895c cVar2 = this.f16325c;
        if (cVar2 != null) {
            cVar2.afterDismissCallBack();
        }
    }

    /* renamed from: e */
    public void mo36648e(View view) {
        this.f16323a.mo36629L(view);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.f16323a.mo36632y();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f16323a.mo36633z(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f16323a.mo36619A(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f16323a.mo36628K(charSequence);
    }

    public void show() {
        super.show();
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.y = this.f16326d;
        attributes.width = -1;
        attributes.height = -2;
        getWindow().setAttributes(attributes);
        m21206f();
    }
}
