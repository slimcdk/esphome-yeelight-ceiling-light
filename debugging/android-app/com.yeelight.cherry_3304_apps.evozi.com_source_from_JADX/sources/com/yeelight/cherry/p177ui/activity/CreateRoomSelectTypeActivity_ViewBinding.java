package com.yeelight.cherry.p177ui.activity;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.CreateRoomSelectTypeActivity_ViewBinding */
public class CreateRoomSelectTypeActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CreateRoomSelectTypeActivity f10592a;

    @UiThread
    public CreateRoomSelectTypeActivity_ViewBinding(CreateRoomSelectTypeActivity createRoomSelectTypeActivity, View view) {
        this.f10592a = createRoomSelectTypeActivity;
        createRoomSelectTypeActivity.mTypeList = (RecyclerView) Utils.findRequiredViewAsType(view, C11745R$id.room_type_list, "field 'mTypeList'", RecyclerView.class);
        createRoomSelectTypeActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297424, "field 'mTitleBar'", CommonTitleBar.class);
    }

    @CallSuper
    public void unbind() {
        CreateRoomSelectTypeActivity createRoomSelectTypeActivity = this.f10592a;
        if (createRoomSelectTypeActivity != null) {
            this.f10592a = null;
            createRoomSelectTypeActivity.mTypeList = null;
            createRoomSelectTypeActivity.mTitleBar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
