package com.yeelight.cherry.p177ui.activity;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.MeshGrpDeviceModifyActivity_ViewBinding */
public class MeshGrpDeviceModifyActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MeshGrpDeviceModifyActivity f11251a;

    @UiThread
    public MeshGrpDeviceModifyActivity_ViewBinding(MeshGrpDeviceModifyActivity meshGrpDeviceModifyActivity, View view) {
        this.f11251a = meshGrpDeviceModifyActivity;
        meshGrpDeviceModifyActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297424, "field 'mTitleBar'", CommonTitleBar.class);
        meshGrpDeviceModifyActivity.mDeviceList = (RecyclerView) Utils.findRequiredViewAsType(view, 2131296591, "field 'mDeviceList'", RecyclerView.class);
    }

    @CallSuper
    public void unbind() {
        MeshGrpDeviceModifyActivity meshGrpDeviceModifyActivity = this.f11251a;
        if (meshGrpDeviceModifyActivity != null) {
            this.f11251a = null;
            meshGrpDeviceModifyActivity.mTitleBar = null;
            meshGrpDeviceModifyActivity.mDeviceList = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
