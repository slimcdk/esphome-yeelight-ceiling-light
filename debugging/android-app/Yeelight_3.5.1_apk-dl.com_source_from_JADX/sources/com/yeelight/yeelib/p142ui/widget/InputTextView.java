package com.yeelight.yeelib.p142ui.widget;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.EditText;

/* renamed from: com.yeelight.yeelib.ui.widget.InputTextView */
public class InputTextView extends EditText {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C8876b f16153a;

    /* renamed from: com.yeelight.yeelib.ui.widget.InputTextView$a */
    class C8875a implements TextWatcher {
        C8875a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (charSequence.length() < 1 || charSequence.toString().trim().equals("")) {
                if (InputTextView.this.f16153a != null) {
                    InputTextView.this.f16153a.mo36564a(false);
                }
            } else if (InputTextView.this.f16153a != null) {
                InputTextView.this.f16153a.mo36564a(true);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.widget.InputTextView$b */
    public interface C8876b {
        /* renamed from: a */
        void mo36564a(boolean z);
    }

    public InputTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m21137b();
    }

    /* renamed from: b */
    private void m21137b() {
        addTextChangedListener(new C8875a());
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getAction();
        return super.onTouchEvent(motionEvent);
    }

    public void setAffirmListener(C8876b bVar) {
        this.f16153a = bVar;
    }
}
