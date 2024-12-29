package com.yeelight.cherry.p141ui.activity;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.ScanHelpCenterActivity_ViewBinding */
public class ScanHelpCenterActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ScanHelpCenterActivity f11294a;

    @UiThread
    public ScanHelpCenterActivity_ViewBinding(ScanHelpCenterActivity scanHelpCenterActivity, View view) {
        this.f11294a = scanHelpCenterActivity;
        scanHelpCenterActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297591, "field 'mTitleBar'", CommonTitleBar.class);
    }

    @CallSuper
    public void unbind() {
        ScanHelpCenterActivity scanHelpCenterActivity = this.f11294a;
        if (scanHelpCenterActivity != null) {
            this.f11294a = null;
            scanHelpCenterActivity.mTitleBar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
