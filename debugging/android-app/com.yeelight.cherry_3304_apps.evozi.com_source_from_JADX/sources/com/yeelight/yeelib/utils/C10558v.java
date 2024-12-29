package com.yeelight.yeelib.utils;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.p191j.p192a.C9897c;
import java.io.UnsupportedEncodingException;

/* renamed from: com.yeelight.yeelib.utils.v */
public class C10558v implements TextWatcher {

    /* renamed from: a */
    private EditText f20173a;

    /* renamed from: b */
    private C9897c f20174b;

    static {
        Class<C10558v> cls = C10558v.class;
    }

    public C10558v(EditText editText, C9897c cVar) {
        this.f20173a = editText;
        this.f20174b = cVar;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C9897c cVar;
        int i4;
        if (!charSequence.toString().equals("") && charSequence.toString().replace(" ", "").equals("")) {
            this.f20173a.setText("");
        }
        String obj = this.f20173a.getText().toString();
        try {
            if (obj.length() != 0) {
                if (obj.getBytes("utf-8").length <= 26) {
                    this.f20174b.mo32003f(true);
                    this.f20174b.mo32007k("");
                    return;
                }
            }
            this.f20174b.mo32003f(false);
            if (obj.length() == 0) {
                cVar = this.f20174b;
                i4 = R$string.common_text_name_no_empty;
            } else if (obj.getBytes("utf-8").length > 26) {
                cVar = this.f20174b;
                i4 = R$string.common_dialog_input_too_long;
            } else {
                return;
            }
            cVar.mo32006j(i4);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
