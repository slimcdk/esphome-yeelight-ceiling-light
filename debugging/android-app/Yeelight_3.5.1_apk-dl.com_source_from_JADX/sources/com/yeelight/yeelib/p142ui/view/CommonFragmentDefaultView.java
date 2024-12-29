package com.yeelight.yeelib.p142ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;

/* renamed from: com.yeelight.yeelib.ui.view.CommonFragmentDefaultView */
public class CommonFragmentDefaultView extends FrameLayout {

    /* renamed from: a */
    ImageView f15681a = ((ImageView) findViewById(R$id.image_default_img));

    /* renamed from: b */
    TextView f15682b = ((TextView) findViewById(R$id.main_text_msg));

    /* renamed from: c */
    TextView f15683c = ((TextView) findViewById(R$id.main_text_info));

    /* renamed from: d */
    Button f15684d = ((Button) findViewById(R$id.btn_create));

    public CommonFragmentDefaultView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R$layout.common_fragment_default_page, this);
    }

    /* renamed from: a */
    public void mo36194a(int i, int i2, int i3, int i4, View.OnClickListener onClickListener) {
        this.f15681a.setImageResource(i);
        this.f15682b.setText(i2);
        this.f15683c.setText(i3);
        this.f15684d.setText(i4);
        this.f15684d.setOnClickListener(onClickListener);
    }
}
