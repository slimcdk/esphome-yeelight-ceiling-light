package com.yeelight.cherry.p141ui.activity;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.SpeakerDeviceControlActivity_ViewBinding */
public class SpeakerDeviceControlActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SpeakerDeviceControlActivity f11454a;

    @UiThread
    public SpeakerDeviceControlActivity_ViewBinding(SpeakerDeviceControlActivity speakerDeviceControlActivity, View view) {
        this.f11454a = speakerDeviceControlActivity;
        speakerDeviceControlActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297591, "field 'mTitleBar'", CommonTitleBar.class);
        speakerDeviceControlActivity.mTvVersion = (TextView) Utils.findRequiredViewAsType(view, C12225R$id.tv_version, "field 'mTvVersion'", TextView.class);
    }

    @CallSuper
    public void unbind() {
        SpeakerDeviceControlActivity speakerDeviceControlActivity = this.f11454a;
        if (speakerDeviceControlActivity != null) {
            this.f11454a = null;
            speakerDeviceControlActivity.mTitleBar = null;
            speakerDeviceControlActivity.mTvVersion = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
