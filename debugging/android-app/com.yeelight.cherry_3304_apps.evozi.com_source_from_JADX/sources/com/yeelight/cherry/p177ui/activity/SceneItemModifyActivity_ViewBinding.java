package com.yeelight.cherry.p177ui.activity;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.SceneItemModifyActivity_ViewBinding */
public class SceneItemModifyActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SceneItemModifyActivity f11763a;

    @UiThread
    public SceneItemModifyActivity_ViewBinding(SceneItemModifyActivity sceneItemModifyActivity, View view) {
        this.f11763a = sceneItemModifyActivity;
        sceneItemModifyActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297424, "field 'mTitleBar'", CommonTitleBar.class);
        sceneItemModifyActivity.mDeviceList = (RecyclerView) Utils.findRequiredViewAsType(view, 2131296591, "field 'mDeviceList'", RecyclerView.class);
    }

    @CallSuper
    public void unbind() {
        SceneItemModifyActivity sceneItemModifyActivity = this.f11763a;
        if (sceneItemModifyActivity != null) {
            this.f11763a = null;
            sceneItemModifyActivity.mTitleBar = null;
            sceneItemModifyActivity.mDeviceList = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
