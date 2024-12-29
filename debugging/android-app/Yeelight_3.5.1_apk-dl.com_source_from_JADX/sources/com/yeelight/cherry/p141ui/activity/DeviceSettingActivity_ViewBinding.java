package com.yeelight.cherry.p141ui.activity;

import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.DeviceSettingActivity_ViewBinding */
public class DeviceSettingActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private DeviceSettingActivity f10353a;

    @UiThread
    public DeviceSettingActivity_ViewBinding(DeviceSettingActivity deviceSettingActivity, View view) {
        this.f10353a = deviceSettingActivity;
        deviceSettingActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297591, "field 'mTitleBar'", CommonTitleBar.class);
        deviceSettingActivity.mContentView = (ScrollView) Utils.findRequiredViewAsType(view, 2131297451, "field 'mContentView'", ScrollView.class);
        deviceSettingActivity.mBtnDelete = (TextView) Utils.findRequiredViewAsType(view, 2131296638, "field 'mBtnDelete'", TextView.class);
    }

    @CallSuper
    public void unbind() {
        DeviceSettingActivity deviceSettingActivity = this.f10353a;
        if (deviceSettingActivity != null) {
            this.f10353a = null;
            deviceSettingActivity.mTitleBar = null;
            deviceSettingActivity.mContentView = null;
            deviceSettingActivity.mBtnDelete = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
