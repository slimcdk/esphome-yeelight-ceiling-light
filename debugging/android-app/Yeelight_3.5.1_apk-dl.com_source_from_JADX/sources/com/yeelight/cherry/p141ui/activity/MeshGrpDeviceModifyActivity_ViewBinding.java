package com.yeelight.cherry.p141ui.activity;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.MeshGrpDeviceModifyActivity_ViewBinding */
public class MeshGrpDeviceModifyActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MeshGrpDeviceModifyActivity f10821a;

    @UiThread
    public MeshGrpDeviceModifyActivity_ViewBinding(MeshGrpDeviceModifyActivity meshGrpDeviceModifyActivity, View view) {
        this.f10821a = meshGrpDeviceModifyActivity;
        meshGrpDeviceModifyActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297591, "field 'mTitleBar'", CommonTitleBar.class);
        meshGrpDeviceModifyActivity.mDeviceList = (RecyclerView) Utils.findRequiredViewAsType(view, 2131296669, "field 'mDeviceList'", RecyclerView.class);
    }

    @CallSuper
    public void unbind() {
        MeshGrpDeviceModifyActivity meshGrpDeviceModifyActivity = this.f10821a;
        if (meshGrpDeviceModifyActivity != null) {
            this.f10821a = null;
            meshGrpDeviceModifyActivity.mTitleBar = null;
            meshGrpDeviceModifyActivity.mDeviceList = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
