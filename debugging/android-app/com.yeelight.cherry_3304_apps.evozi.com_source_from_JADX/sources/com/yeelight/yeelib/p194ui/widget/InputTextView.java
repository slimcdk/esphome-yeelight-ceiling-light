package com.yeelight.yeelib.p194ui.widget;

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
    public C10499b f19895a;

    /* renamed from: com.yeelight.yeelib.ui.widget.InputTextView$a */
    class C10498a implements TextWatcher {
        C10498a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (charSequence.length() < 1 || charSequence.toString().trim().equals("")) {
                if (InputTextView.this.f19895a != null) {
                    InputTextView.this.f19895a.mo33195a(false);
                }
            } else if (InputTextView.this.f19895a != null) {
                InputTextView.this.f19895a.mo33195a(true);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.widget.InputTextView$b */
    public interface C10499b {
        /* renamed from: a */
        void mo33195a(boolean z);
    }

    public InputTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m25523b();
    }

    /* renamed from: b */
    private void m25523b() {
        addTextChangedListener(new C10498a());
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getAction();
        return super.onTouchEvent(motionEvent);
    }

    public void setAffirmListener(C10499b bVar) {
        this.f19895a = bVar;
    }
}
