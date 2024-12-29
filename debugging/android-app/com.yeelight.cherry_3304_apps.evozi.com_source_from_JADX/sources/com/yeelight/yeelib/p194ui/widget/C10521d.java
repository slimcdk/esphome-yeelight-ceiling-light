package com.yeelight.yeelib.p194ui.widget;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
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
import com.yeelight.yeelib.p194ui.widget.YLAlertController;
import java.io.UnsupportedEncodingException;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.yeelight.yeelib.ui.widget.d */
public class C10521d extends Dialog implements DialogInterface {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public YLAlertController f20110a;

    /* renamed from: b */
    private Context f20111b;

    /* renamed from: c */
    private C10525c f20112c;

    /* renamed from: d */
    private int f20113d;

    /* renamed from: com.yeelight.yeelib.ui.widget.d$a */
    class C10522a extends TimerTask {
        C10522a() {
        }

        public void run() {
            ((InputMethodManager) C10521d.this.getContext().getSystemService("input_method")).showSoftInput(C10521d.this.f20110a.mo33262x(), 2);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.widget.d$b */
    public static class C10523b {

        /* renamed from: a */
        private final YLAlertController.C10505c f20115a;

        /* renamed from: b */
        private Context f20116b;

        /* renamed from: com.yeelight.yeelib.ui.widget.d$b$a */
        class C10524a implements TextWatcher {

            /* renamed from: a */
            final /* synthetic */ int f20117a;

            /* renamed from: b */
            final /* synthetic */ EditText f20118b;

            C10524a(C10523b bVar, int i, EditText editText) {
                this.f20117a = i;
                this.f20118b = editText;
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
                if ((i != 0 || i3 != 0) && this.f20117a != 0) {
                    try {
                        if (this.f20118b.getText().toString().getBytes("utf-8").length > this.f20117a) {
                            int selectionEnd = Selection.getSelectionEnd(this.f20118b.getText());
                            String obj = this.f20118b.getText().toString();
                            int i4 = i3 + i;
                            if (i4 == obj.length()) {
                                str = obj.substring(0, i);
                            } else {
                                str = obj.substring(0, i) + obj.substring(i4, obj.length());
                            }
                            this.f20118b.setText(str);
                            Editable text = this.f20118b.getText();
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

        public C10523b(Context context) {
            this.f20116b = context;
            this.f20115a = new YLAlertController.C10505c(context);
        }

        /* renamed from: a */
        public C10521d mo33316a() {
            C10521d dVar = new C10521d(this.f20115a.f20021a);
            YLAlertController.C10505c cVar = this.f20115a;
            CharSequence[] charSequenceArr = cVar.f20037q;
            cVar.mo33266a(dVar.f20110a);
            dVar.setCancelable(this.f20115a.f20034n);
            if (this.f20115a.f20034n) {
                dVar.setCanceledOnTouchOutside(true);
            }
            dVar.setOnCancelListener(this.f20115a.f20035o);
            DialogInterface.OnKeyListener onKeyListener = this.f20115a.f20036p;
            if (onKeyListener != null) {
                dVar.setOnKeyListener(onKeyListener);
            }
            dVar.mo33307d(this.f20115a.f20018M);
            return dVar;
        }

        /* renamed from: b */
        public C10523b mo33317b(boolean z) {
            this.f20115a.f20017L = z;
            return this;
        }

        /* renamed from: c */
        public C10523b mo33318c(boolean z) {
            this.f20115a.f20034n = z;
            return this;
        }

        /* renamed from: d */
        public C10523b mo33319d(String str, boolean z, int i) {
            View inflate = View.inflate(this.f20116b, R$layout.yl_alert_dialog_input_view, (ViewGroup) null);
            mo33327l(inflate, this.f20116b.getResources().getDimensionPixelSize(R$dimen.alertdialog_button_panel_padding_horizontal), 0, this.f20116b.getResources().getDimensionPixelSize(R$dimen.alertdialog_button_panel_padding_horizontal), this.f20116b.getResources().getDimensionPixelSize(R$dimen.alertdialog_custom_panel_padding_bottom));
            EditText editText = (EditText) inflate.findViewById(R$id.input_text);
            editText.setSingleLine(z);
            editText.addTextChangedListener(new C10524a(this, i, editText));
            if (!TextUtils.isEmpty(str)) {
                editText.setText(str);
            } else {
                editText.setHint("");
            }
            editText.requestFocus();
            return this;
        }

        /* renamed from: e */
        public C10523b mo33320e(CharSequence charSequence) {
            this.f20115a.f20027g = charSequence;
            return this;
        }

        /* renamed from: f */
        public C10523b mo33321f(int i, DialogInterface.OnClickListener onClickListener) {
            YLAlertController.C10505c cVar = this.f20115a;
            cVar.f20030j = cVar.f20021a.getText(i);
            this.f20115a.f20031k = onClickListener;
            return this;
        }

        /* renamed from: g */
        public C10523b mo33322g(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            YLAlertController.C10505c cVar = this.f20115a;
            cVar.f20030j = charSequence;
            cVar.f20031k = onClickListener;
            return this;
        }

        /* renamed from: h */
        public C10523b mo33323h(int i, DialogInterface.OnClickListener onClickListener) {
            YLAlertController.C10505c cVar = this.f20115a;
            cVar.f20028h = cVar.f20021a.getText(i);
            this.f20115a.f20029i = onClickListener;
            return this;
        }

        /* renamed from: i */
        public C10523b mo33324i(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            YLAlertController.C10505c cVar = this.f20115a;
            cVar.f20028h = charSequence;
            cVar.f20029i = onClickListener;
            return this;
        }

        /* renamed from: j */
        public C10523b mo33325j(CharSequence charSequence) {
            this.f20115a.f20025e = charSequence;
            return this;
        }

        /* renamed from: k */
        public C10523b mo33326k(View view) {
            YLAlertController.C10505c cVar = this.f20115a;
            cVar.f20040t = view;
            cVar.f20045y = false;
            return this;
        }

        /* renamed from: l */
        public C10523b mo33327l(View view, int i, int i2, int i3, int i4) {
            YLAlertController.C10505c cVar = this.f20115a;
            cVar.f20040t = view;
            cVar.f20045y = true;
            cVar.f20041u = i;
            cVar.f20042v = i2;
            cVar.f20043w = i3;
            cVar.f20044x = i4;
            return this;
        }

        /* renamed from: m */
        public C10521d mo33328m() {
            C10521d a = mo33316a();
            a.show();
            WindowManager.LayoutParams attributes = a.getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -2;
            a.getWindow().setAttributes(attributes);
            return a;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.widget.d$c */
    public interface C10525c {
        void afterDismissCallBack();

        void beforeDismissCallBack();
    }

    protected C10521d(Context context) {
        this(context, R$style.V5_AlertDialog);
    }

    protected C10521d(Context context, int i) {
        this(context, i, 80, 0);
    }

    protected C10521d(Context context, int i, int i2, int i3) {
        super(context, i);
        this.f20113d = 0;
        this.f20110a = new YLAlertController(context, this, getWindow(), i2);
        this.f20111b = context;
        this.f20113d = i3;
    }

    /* renamed from: c */
    private void m25609c() {
        if (this.f20110a.mo33262x() != null) {
            ((InputMethodManager) this.f20111b.getSystemService("input_method")).hideSoftInputFromWindow(this.f20110a.mo33262x().getWindowToken(), 0);
        }
    }

    /* renamed from: f */
    private void m25610f() {
        if (this.f20110a.mo33262x() != null && (this.f20110a.mo33262x() instanceof EditText)) {
            new Timer().schedule(new C10522a(), 200);
        }
    }

    /* renamed from: b */
    public EditText mo33306b() {
        return (EditText) this.f20110a.mo33262x();
    }

    /* renamed from: d */
    public void mo33307d(C10525c cVar) {
        this.f20112c = cVar;
    }

    public void dismiss() {
        C10525c cVar = this.f20112c;
        if (cVar != null) {
            cVar.beforeDismissCallBack();
        }
        m25609c();
        super.dismiss();
        C10525c cVar2 = this.f20112c;
        if (cVar2 != null) {
            cVar2.afterDismissCallBack();
        }
    }

    /* renamed from: e */
    public void mo33309e(View view) {
        this.f20110a.mo33260L(view);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.f20110a.mo33263y();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f20110a.mo33264z(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f20110a.mo33250A(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f20110a.mo33259K(charSequence);
    }

    public void show() {
        super.show();
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.y = this.f20113d;
        attributes.width = -1;
        attributes.height = -2;
        getWindow().setAttributes(attributes);
        m25610f();
    }
}
