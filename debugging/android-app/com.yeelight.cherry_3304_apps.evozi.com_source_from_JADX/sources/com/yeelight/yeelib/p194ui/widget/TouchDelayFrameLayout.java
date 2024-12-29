package com.yeelight.yeelib.p194ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yeelight.yeelib.R$color;

/* renamed from: com.yeelight.yeelib.ui.widget.TouchDelayFrameLayout */
public class TouchDelayFrameLayout extends FrameLayout {

    /* renamed from: a */
    private long f19899a = 0;

    /* renamed from: b */
    private Handler f19900b = new C10500a();

    /* renamed from: com.yeelight.yeelib.ui.widget.TouchDelayFrameLayout$a */
    class C10500a extends Handler {
        C10500a() {
        }

        public void handleMessage(Message message) {
            TouchDelayFrameLayout touchDelayFrameLayout;
            int i;
            Resources resources;
            super.handleMessage(message);
            int i2 = message.what;
            if (i2 == 10086) {
                touchDelayFrameLayout = TouchDelayFrameLayout.this;
                resources = touchDelayFrameLayout.getResources();
                i = R$color.device_list_click_bg;
            } else if (i2 == 10087) {
                touchDelayFrameLayout = TouchDelayFrameLayout.this;
                resources = touchDelayFrameLayout.getResources();
                i = R$color.white;
            } else {
                return;
            }
            touchDelayFrameLayout.setBackgroundColor(resources.getColor(i));
        }
    }

    public TouchDelayFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f19899a = System.currentTimeMillis();
            this.f19900b.sendEmptyMessageDelayed(10086, 100);
        } else if (action == 1) {
            if (Math.abs(System.currentTimeMillis() - this.f19899a) < 100) {
                setBackgroundColor(getResources().getColor(R$color.common_text_click_bg));
            }
            this.f19900b.sendEmptyMessageDelayed(10087, 300);
        } else if (action == 3) {
            this.f19900b.removeMessages(10086);
            this.f19900b.sendEmptyMessage(10087);
        }
        return super.onTouchEvent(motionEvent);
    }
}
