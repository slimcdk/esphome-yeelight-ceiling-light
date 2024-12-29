package com.yeelight.yeelib.utils;

import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import com.yeelight.yeelib.R$array;
import java.io.UnsupportedEncodingException;

/* renamed from: com.yeelight.yeelib.utils.b0 */
public class C10536b0 implements TextWatcher {

    /* renamed from: a */
    private int f20157a;

    /* renamed from: b */
    private EditText f20158b;

    /* renamed from: c */
    private C10537a f20159c;

    /* renamed from: d */
    private int f20160d;

    /* renamed from: com.yeelight.yeelib.utils.b0$a */
    public interface C10537a {
        /* renamed from: a */
        void mo26122a(String str);
    }

    public C10536b0(int i, int i2, EditText editText, C10537a aVar) {
        this.f20157a = 0;
        this.f20158b = null;
        this.f20160d = 0;
        this.f20158b = editText;
        this.f20159c = aVar;
        this.f20160d = i2;
        this.f20157a = mo33373c() ? i * 2 : i;
    }

    public C10536b0(int i, EditText editText) {
        this(i, editText, (C10537a) null);
    }

    public C10536b0(int i, EditText editText, C10537a aVar) {
        this(i, 0, editText, aVar);
    }

    /* renamed from: e */
    private String m25664e(String str) {
        int i;
        int i2 = 1;
        while (true) {
            if (i2 > str.length()) {
                i = 0;
                break;
            } else if (str.substring(0, i2).getBytes("utf-8").length > this.f20157a) {
                i = i2 - 1;
                break;
            } else {
                i2++;
            }
        }
        return i > 0 ? str.substring(0, i) : str;
    }

    /* renamed from: a */
    public int mo33369a() {
        int i = 0;
        for (int i2 = 0; i2 < this.f20158b.getText().length(); i2++) {
            i = this.f20158b.getText().charAt(i2) < 128 ? i + 1 : i + 2;
        }
        "EditText actual length: " + i;
        return i;
    }

    public void afterTextChanged(Editable editable) {
    }

    /* renamed from: b */
    public int mo33371b(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = this.f20158b.getText().charAt(i3) < 128 ? i2 + 1 : i2 + 2;
        }
        "EditText selection actual length: " + i2;
        return i2;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* renamed from: c */
    public boolean mo33373c() {
        String[] stringArray = this.f20158b.getContext().getResources().getStringArray(R$array.language_with_double_length_char);
        String language = C10550q.m25766b().mo33378a().getLanguage();
        "language : " + language;
        for (String equals : stringArray) {
            if (TextUtils.equals(language, equals)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public String mo33374d(String str) {
        int i = 0;
        int i2 = 0;
        while (i < str.length() && i2 <= this.f20157a) {
            i2 = str.charAt(i) < 128 ? i2 + 1 : i2 + 2;
            i++;
        }
        return str.substring(0, i - 1);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        "length: " + this.f20158b.getText().length() + ", max length: " + this.f20157a;
        String charSequence2 = charSequence.toString();
        if (this.f20160d != 0) {
            try {
                if (charSequence.toString().getBytes("utf-8").length > this.f20157a) {
                    charSequence2 = m25664e(this.f20158b.getText().toString());
                    this.f20158b.setText(charSequence2);
                    Selection.setSelection(this.f20158b.getText(), charSequence2.length());
                }
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        } else if (mo33369a() > this.f20157a) {
            int selectionEnd = Selection.getSelectionEnd(this.f20158b.getText());
            int b = mo33371b(selectionEnd);
            String d = mo33374d(this.f20158b.getText().toString());
            this.f20158b.setText(d);
            if (b > this.f20157a) {
                selectionEnd = this.f20158b.getText().length();
            }
            Selection.setSelection(this.f20158b.getText(), selectionEnd);
            charSequence2 = d;
        }
        C10537a aVar = this.f20159c;
        if (aVar != null) {
            aVar.mo26122a(charSequence2);
        }
    }
}
