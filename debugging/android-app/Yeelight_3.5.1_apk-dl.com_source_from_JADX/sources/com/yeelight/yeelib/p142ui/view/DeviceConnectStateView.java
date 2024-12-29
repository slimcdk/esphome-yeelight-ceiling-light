package com.yeelight.yeelib.p142ui.view;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.yeelight.yeelib.R$drawable;

/* renamed from: com.yeelight.yeelib.ui.view.DeviceConnectStateView */
public class DeviceConnectStateView extends RelativeLayout {

    /* renamed from: a */
    private ImageView f15699a;

    /* renamed from: b */
    private ProgressBar f15700b;

    /* renamed from: c */
    private int f15701c;

    /* renamed from: com.yeelight.yeelib.ui.view.DeviceConnectStateView$a */
    class C8794a extends Handler {
        C8794a(DeviceConnectStateView deviceConnectStateView) {
        }

        public void handleMessage(Message message) {
        }
    }

    public DeviceConnectStateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new C8794a(this);
        m20750a();
    }

    /* renamed from: a */
    private void m20750a() {
        ImageView imageView = new ImageView(getContext());
        this.f15699a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        addView(this.f15699a, layoutParams);
        ProgressBar progressBar = new ProgressBar(getContext());
        this.f15700b = progressBar;
        progressBar.setIndeterminateDrawable(getResources().getDrawable(R$drawable.device_connect_connecting));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        addView(this.f15700b, layoutParams2);
        setState(3);
    }

    public void setChecked(boolean z) {
        ImageView imageView;
        int i;
        if (this.f15701c == 4) {
            if (z) {
                imageView = this.f15699a;
                i = R$drawable.icon_yeelight_common_choice_selected;
            } else {
                imageView = this.f15699a;
                i = R$drawable.icon_yeelight_common_choice_normal;
            }
            imageView.setImageResource(i);
        }
    }

    public void setState(int i) {
        ImageView imageView;
        int i2;
        this.f15701c = i;
        if (i == 0) {
            imageView = this.f15699a;
            i2 = R$drawable.device_connect_waiting;
        } else if (i == 1) {
            this.f15700b.setVisibility(0);
            this.f15699a.setVisibility(8);
            return;
        } else if (i == 2) {
            imageView = this.f15699a;
            i2 = R$drawable.device_connect_connected;
        } else if (i == 3) {
            imageView = this.f15699a;
            i2 = R$drawable.device_connect_failure;
        } else if (i == 4) {
            this.f15699a.setImageResource(R$drawable.icon_device_add_normal);
            return;
        } else {
            return;
        }
        imageView.setImageResource(i2);
        this.f15700b.setVisibility(8);
        this.f15699a.setVisibility(0);
    }
}
