package com.yeelight.cherry.p177ui.activity;

import android.view.View;
import android.widget.Button;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.CreateRoomSelectDeviceActivity_ViewBinding */
public class CreateRoomSelectDeviceActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CreateRoomSelectDeviceActivity f10589a;

    @UiThread
    public CreateRoomSelectDeviceActivity_ViewBinding(CreateRoomSelectDeviceActivity createRoomSelectDeviceActivity, View view) {
        this.f10589a = createRoomSelectDeviceActivity;
        createRoomSelectDeviceActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297424, "field 'mTitleBar'", CommonTitleBar.class);
        createRoomSelectDeviceActivity.mDeviceList = (RecyclerView) Utils.findRequiredViewAsType(view, 2131296591, "field 'mDeviceList'", RecyclerView.class);
        createRoomSelectDeviceActivity.mBtnComplete = (Button) Utils.findRequiredViewAsType(view, 2131297043, "field 'mBtnComplete'", Button.class);
    }

    @CallSuper
    public void unbind() {
        CreateRoomSelectDeviceActivity createRoomSelectDeviceActivity = this.f10589a;
        if (createRoomSelectDeviceActivity != null) {
            this.f10589a = null;
            createRoomSelectDeviceActivity.mTitleBar = null;
            createRoomSelectDeviceActivity.mDeviceList = null;
            createRoomSelectDeviceActivity.mBtnComplete = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
