package p051j4;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.yeelight.yeelib.R$string;
import java.io.UnsupportedEncodingException;
import p160g4.C9071c;

/* renamed from: j4.t */
public class C9204t implements TextWatcher {

    /* renamed from: a */
    private EditText f17018a;

    /* renamed from: b */
    private C9071c f17019b;

    static {
        Class<C9204t> cls = C9204t.class;
    }

    public C9204t(EditText editText, C9071c cVar) {
        this.f17018a = editText;
        this.f17019b = cVar;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C9071c cVar;
        int i4;
        if (!charSequence.toString().equals("") && charSequence.toString().replace(" ", "").equals("")) {
            this.f17018a.setText("");
        }
        String obj = this.f17018a.getText().toString();
        try {
            if (obj.length() != 0) {
                if (obj.getBytes("utf-8").length <= 26) {
                    this.f17019b.mo37015f(true);
                    this.f17019b.mo37019k("");
                    return;
                }
            }
            this.f17019b.mo37015f(false);
            if (obj.length() == 0) {
                cVar = this.f17019b;
                i4 = R$string.common_text_name_no_empty;
            } else if (obj.getBytes("utf-8").length > 26) {
                cVar = this.f17019b;
                i4 = R$string.common_dialog_input_too_long;
            } else {
                return;
            }
            cVar.mo37018j(i4);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
