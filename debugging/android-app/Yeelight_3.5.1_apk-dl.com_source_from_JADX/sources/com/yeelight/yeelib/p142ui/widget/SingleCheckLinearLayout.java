package com.yeelight.yeelib.p142ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yeelight.yeelib.R$id;

/* renamed from: com.yeelight.yeelib.ui.widget.SingleCheckLinearLayout */
public class SingleCheckLinearLayout extends LinearLayout implements Checkable {

    /* renamed from: a */
    View f16155a;

    /* renamed from: b */
    TextView f16156b;

    public SingleCheckLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean isChecked() {
        return this.f16156b.isSelected();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f16155a = findViewById(R$id.select_icon);
        this.f16156b = (TextView) findViewById(R$id.text);
    }

    public void setChecked(boolean z) {
        this.f16155a.setVisibility(z ? 0 : 4);
        this.f16156b.setSelected(z);
    }

    public void toggle() {
    }
}
