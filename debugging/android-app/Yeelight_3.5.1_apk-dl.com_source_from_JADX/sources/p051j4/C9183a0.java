package p051j4;

import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import com.yeelight.yeelib.R$array;
import java.io.UnsupportedEncodingException;

/* renamed from: j4.a0 */
public class C9183a0 implements TextWatcher {

    /* renamed from: a */
    private int f17004a;

    /* renamed from: b */
    private EditText f17005b;

    /* renamed from: c */
    private C9184a f17006c;

    /* renamed from: d */
    private int f17007d;

    /* renamed from: j4.a0$a */
    public interface C9184a {
        /* renamed from: a */
        void mo30178a(String str);
    }

    public C9183a0(int i, int i2, EditText editText, C9184a aVar) {
        this.f17004a = 0;
        this.f17005b = null;
        this.f17007d = 0;
        this.f17005b = editText;
        this.f17006c = aVar;
        this.f17007d = i2;
        this.f17004a = mo37272c() ? i * 2 : i;
    }

    public C9183a0(int i, EditText editText) {
        this(i, editText, (C9184a) null);
    }

    public C9183a0(int i, EditText editText, C9184a aVar) {
        this(i, 0, editText, aVar);
    }

    /* renamed from: e */
    private String m22076e(String str) {
        int i;
        int i2 = 1;
        while (true) {
            if (i2 > str.length()) {
                i = 0;
                break;
            } else if (str.substring(0, i2).getBytes("utf-8").length > this.f17004a) {
                i = i2 - 1;
                break;
            } else {
                i2++;
            }
        }
        return i > 0 ? str.substring(0, i) : str;
    }

    /* renamed from: a */
    public int mo37268a() {
        int i = 0;
        for (int i2 = 0; i2 < this.f17005b.getText().length(); i2++) {
            i = this.f17005b.getText().charAt(i2) < 128 ? i + 1 : i + 2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("EditText actual length: ");
        sb.append(i);
        return i;
    }

    public void afterTextChanged(Editable editable) {
    }

    /* renamed from: b */
    public int mo37270b(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = this.f17005b.getText().charAt(i3) < 128 ? i2 + 1 : i2 + 2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("EditText selection actual length: ");
        sb.append(i2);
        return i2;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* renamed from: c */
    public boolean mo37272c() {
        String[] stringArray = this.f17005b.getContext().getResources().getStringArray(R$array.language_with_double_length_char);
        String language = C9196o.m22165b().mo37277a().getLanguage();
        StringBuilder sb = new StringBuilder();
        sb.append("language : ");
        sb.append(language);
        for (String equals : stringArray) {
            if (TextUtils.equals(language, equals)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public String mo37273d(String str) {
        int i = 0;
        int i2 = 0;
        while (i < str.length() && i2 <= this.f17004a) {
            i2 = str.charAt(i) < 128 ? i2 + 1 : i2 + 2;
            i++;
        }
        return str.substring(0, i - 1);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        sb.append("length: ");
        sb.append(this.f17005b.getText().length());
        sb.append(", max length: ");
        sb.append(this.f17004a);
        String charSequence2 = charSequence.toString();
        if (this.f17007d != 0) {
            try {
                if (charSequence.toString().getBytes("utf-8").length > this.f17004a) {
                    charSequence2 = m22076e(this.f17005b.getText().toString());
                    this.f17005b.setText(charSequence2);
                    Selection.setSelection(this.f17005b.getText(), charSequence2.length());
                }
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        } else if (mo37268a() > this.f17004a) {
            int selectionEnd = Selection.getSelectionEnd(this.f17005b.getText());
            int b = mo37270b(selectionEnd);
            String d = mo37273d(this.f17005b.getText().toString());
            this.f17005b.setText(d);
            if (b > this.f17004a) {
                selectionEnd = this.f17005b.getText().length();
            }
            Selection.setSelection(this.f17005b.getText(), selectionEnd);
            charSequence2 = d;
        }
        C9184a aVar = this.f17006c;
        if (aVar != null) {
            aVar.mo30178a(charSequence2);
        }
    }
}
