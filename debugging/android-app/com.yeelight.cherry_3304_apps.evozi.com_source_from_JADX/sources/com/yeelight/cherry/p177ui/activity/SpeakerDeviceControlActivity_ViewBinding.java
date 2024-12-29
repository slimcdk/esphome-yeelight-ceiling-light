package com.yeelight.cherry.p177ui.activity;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.SpeakerDeviceControlActivity_ViewBinding */
public class SpeakerDeviceControlActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SpeakerDeviceControlActivity f11882a;

    @UiThread
    public SpeakerDeviceControlActivity_ViewBinding(SpeakerDeviceControlActivity speakerDeviceControlActivity, View view) {
        this.f11882a = speakerDeviceControlActivity;
        speakerDeviceControlActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297424, "field 'mTitleBar'", CommonTitleBar.class);
        speakerDeviceControlActivity.mTvVersion = (TextView) Utils.findRequiredViewAsType(view, C11745R$id.tv_version, "field 'mTvVersion'", TextView.class);
    }

    @CallSuper
    public void unbind() {
        SpeakerDeviceControlActivity speakerDeviceControlActivity = this.f11882a;
        if (speakerDeviceControlActivity != null) {
            this.f11882a = null;
            speakerDeviceControlActivity.mTitleBar = null;
            speakerDeviceControlActivity.mTvVersion = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
