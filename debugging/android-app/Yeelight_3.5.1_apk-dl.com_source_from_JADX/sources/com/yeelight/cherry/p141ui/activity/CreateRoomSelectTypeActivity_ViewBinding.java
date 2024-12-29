package com.yeelight.cherry.p141ui.activity;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.CreateRoomSelectTypeActivity_ViewBinding */
public class CreateRoomSelectTypeActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CreateRoomSelectTypeActivity f10145a;

    @UiThread
    public CreateRoomSelectTypeActivity_ViewBinding(CreateRoomSelectTypeActivity createRoomSelectTypeActivity, View view) {
        this.f10145a = createRoomSelectTypeActivity;
        createRoomSelectTypeActivity.mTypeList = (RecyclerView) Utils.findRequiredViewAsType(view, C12225R$id.room_type_list, "field 'mTypeList'", RecyclerView.class);
        createRoomSelectTypeActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297591, "field 'mTitleBar'", CommonTitleBar.class);
    }

    @CallSuper
    public void unbind() {
        CreateRoomSelectTypeActivity createRoomSelectTypeActivity = this.f10145a;
        if (createRoomSelectTypeActivity != null) {
            this.f10145a = null;
            createRoomSelectTypeActivity.mTypeList = null;
            createRoomSelectTypeActivity.mTitleBar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
