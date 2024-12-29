package com.yeelight.yeelib.p194ui.view;

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
    private ImageView f19437a;

    /* renamed from: b */
    private ProgressBar f19438b;

    /* renamed from: c */
    private int f19439c;

    /* renamed from: com.yeelight.yeelib.ui.view.DeviceConnectStateView$a */
    class C10415a extends Handler {
        C10415a(DeviceConnectStateView deviceConnectStateView) {
        }

        public void handleMessage(Message message) {
        }
    }

    public DeviceConnectStateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new C10415a(this);
        m25139a();
    }

    /* renamed from: a */
    private void m25139a() {
        ImageView imageView = new ImageView(getContext());
        this.f19437a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        addView(this.f19437a, layoutParams);
        ProgressBar progressBar = new ProgressBar(getContext());
        this.f19438b = progressBar;
        progressBar.setIndeterminateDrawable(getResources().getDrawable(R$drawable.device_connect_connecting));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        addView(this.f19438b, layoutParams2);
        setState(3);
    }

    public void setChecked(boolean z) {
        ImageView imageView;
        int i;
        if (this.f19439c == 4) {
            if (z) {
                imageView = this.f19437a;
                i = R$drawable.icon_yeelight_common_choice_selected;
            } else {
                imageView = this.f19437a;
                i = R$drawable.icon_yeelight_common_choice_normal;
            }
            imageView.setImageResource(i);
        }
    }

    public void setState(int i) {
        ImageView imageView;
        int i2;
        this.f19439c = i;
        if (i == 0) {
            imageView = this.f19437a;
            i2 = R$drawable.device_connect_waiting;
        } else if (i == 1) {
            this.f19438b.setVisibility(0);
            this.f19437a.setVisibility(8);
            return;
        } else if (i == 2) {
            imageView = this.f19437a;
            i2 = R$drawable.device_connect_connected;
        } else if (i == 3) {
            imageView = this.f19437a;
            i2 = R$drawable.device_connect_failure;
        } else if (i == 4) {
            this.f19437a.setImageResource(R$drawable.icon_device_add_normal);
            return;
        } else {
            return;
        }
        imageView.setImageResource(i2);
        this.f19438b.setVisibility(8);
        this.f19437a.setVisibility(0);
    }
}
