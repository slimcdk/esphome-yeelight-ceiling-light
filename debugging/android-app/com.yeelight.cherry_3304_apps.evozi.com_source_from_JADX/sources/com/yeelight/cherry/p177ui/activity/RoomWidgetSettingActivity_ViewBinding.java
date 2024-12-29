package com.yeelight.cherry.p177ui.activity;

import android.view.View;
import android.widget.ListView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.RoomWidgetSettingActivity_ViewBinding */
public class RoomWidgetSettingActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private RoomWidgetSettingActivity f11716a;

    @UiThread
    public RoomWidgetSettingActivity_ViewBinding(RoomWidgetSettingActivity roomWidgetSettingActivity, View view) {
        this.f11716a = roomWidgetSettingActivity;
        roomWidgetSettingActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297424, "field 'mTitleBar'", CommonTitleBar.class);
        roomWidgetSettingActivity.mRoomLv = (ListView) Utils.findRequiredViewAsType(view, C11745R$id.lv_room_list, "field 'mRoomLv'", ListView.class);
    }

    @CallSuper
    public void unbind() {
        RoomWidgetSettingActivity roomWidgetSettingActivity = this.f11716a;
        if (roomWidgetSettingActivity != null) {
            this.f11716a = null;
            roomWidgetSettingActivity.mTitleBar = null;
            roomWidgetSettingActivity.mRoomLv = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
