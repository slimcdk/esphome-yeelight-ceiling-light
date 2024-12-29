package com.miot.service.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.miot.service.C3602R;

public class SingleCheckLinearLayout extends LinearLayout implements Checkable {
    Context mContext;
    View mSelectImageIconView;
    TextView mTextView;

    public SingleCheckLinearLayout(Context context) {
        super(context);
    }

    public SingleCheckLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean isChecked() {
        return this.mTextView.isSelected();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.mSelectImageIconView = findViewById(C3602R.C3604id.select_icon);
        this.mTextView = (TextView) findViewById(C3602R.C3604id.text1);
    }

    public void setChecked(boolean z) {
        this.mSelectImageIconView.setVisibility(z ? 0 : 4);
        this.mTextView.setSelected(z);
    }

    public void toggle() {
    }
}
