package com.yeelight.cherry.p177ui.activity;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.RoomDeviceModifyActivity_ViewBinding */
public class RoomDeviceModifyActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private RoomDeviceModifyActivity f11676a;

    @UiThread
    public RoomDeviceModifyActivity_ViewBinding(RoomDeviceModifyActivity roomDeviceModifyActivity, View view) {
        this.f11676a = roomDeviceModifyActivity;
        roomDeviceModifyActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297424, "field 'mTitleBar'", CommonTitleBar.class);
        roomDeviceModifyActivity.mDeviceList = (RecyclerView) Utils.findRequiredViewAsType(view, 2131296591, "field 'mDeviceList'", RecyclerView.class);
    }

    @CallSuper
    public void unbind() {
        RoomDeviceModifyActivity roomDeviceModifyActivity = this.f11676a;
        if (roomDeviceModifyActivity != null) {
            this.f11676a = null;
            roomDeviceModifyActivity.mTitleBar = null;
            roomDeviceModifyActivity.mDeviceList = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
