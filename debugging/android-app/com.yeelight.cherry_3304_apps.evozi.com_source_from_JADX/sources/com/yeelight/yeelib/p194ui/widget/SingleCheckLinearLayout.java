package com.yeelight.yeelib.p194ui.widget;

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
    View f19897a;

    /* renamed from: b */
    TextView f19898b;

    public SingleCheckLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean isChecked() {
        return this.f19898b.isSelected();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f19897a = findViewById(R$id.select_icon);
        this.f19898b = (TextView) findViewById(R$id.text);
    }

    public void setChecked(boolean z) {
        this.f19897a.setVisibility(z ? 0 : 4);
        this.f19898b.setSelected(z);
    }

    public void toggle() {
    }
}
