package com.yeelight.cherry.p141ui.activity;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.GroupDeviceModifyActivity_ViewBinding */
public class GroupDeviceModifyActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private GroupDeviceModifyActivity f10545a;

    @UiThread
    public GroupDeviceModifyActivity_ViewBinding(GroupDeviceModifyActivity groupDeviceModifyActivity, View view) {
        this.f10545a = groupDeviceModifyActivity;
        groupDeviceModifyActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297591, "field 'mTitleBar'", CommonTitleBar.class);
        groupDeviceModifyActivity.mDeviceList = (RecyclerView) Utils.findRequiredViewAsType(view, 2131296669, "field 'mDeviceList'", RecyclerView.class);
    }

    @CallSuper
    public void unbind() {
        GroupDeviceModifyActivity groupDeviceModifyActivity = this.f10545a;
        if (groupDeviceModifyActivity != null) {
            this.f10545a = null;
            groupDeviceModifyActivity.mTitleBar = null;
            groupDeviceModifyActivity.mDeviceList = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
