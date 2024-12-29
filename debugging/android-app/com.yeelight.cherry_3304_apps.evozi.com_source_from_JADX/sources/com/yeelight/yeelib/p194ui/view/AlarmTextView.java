package com.yeelight.yeelib.p194ui.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.yeelight.yeelib.R$color;
import com.yeelight.yeelib.R$drawable;

/* renamed from: com.yeelight.yeelib.ui.view.AlarmTextView */
public class AlarmTextView extends TextView {
    public AlarmTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setSelected(true);
    }

    public void setSelected(boolean z) {
        Context context;
        int i;
        super.setSelected(z);
        if (z) {
            setTextColor(ContextCompat.getColor(getContext(), R$color.alarm_text_red));
            context = getContext();
            i = R$drawable.alarm_item_select_arraw;
        } else {
            setTextColor(ContextCompat.getColor(getContext(), R$color.common_setting_item_text_color));
            context = getContext();
            i = R$drawable.alarm_item_unselect_transparent;
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(ContextCompat.getDrawable(context, i), (Drawable) null, (Drawable) null, (Drawable) null);
    }
}
