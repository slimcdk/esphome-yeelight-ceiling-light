package com.yeelight.cherry.p177ui.activity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.AddMeshDeviceActivity_ViewBinding */
public class AddMeshDeviceActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AddMeshDeviceActivity f10321a;

    @UiThread
    public AddMeshDeviceActivity_ViewBinding(AddMeshDeviceActivity addMeshDeviceActivity, View view) {
        this.f10321a = addMeshDeviceActivity;
        addMeshDeviceActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297424, "field 'mTitleBar'", CommonTitleBar.class);
        addMeshDeviceActivity.mDeviceList = (RecyclerView) Utils.findRequiredViewAsType(view, 2131296591, "field 'mDeviceList'", RecyclerView.class);
        addMeshDeviceActivity.mTitle = (TextView) Utils.findRequiredViewAsType(view, 2131297422, "field 'mTitle'", TextView.class);
        addMeshDeviceActivity.mSubInfo = (TextView) Utils.findRequiredViewAsType(view, C11745R$id.sub_info, "field 'mSubInfo'", TextView.class);
        addMeshDeviceActivity.mProductIcon = (ImageView) Utils.findRequiredViewAsType(view, 2131297109, "field 'mProductIcon'", ImageView.class);
        addMeshDeviceActivity.mBtnNext = (Button) Utils.findRequiredViewAsType(view, C11745R$id.next, "field 'mBtnNext'", Button.class);
        addMeshDeviceActivity.mBtnRetry = (TextView) Utils.findRequiredViewAsType(view, C11745R$id.btn_retry, "field 'mBtnRetry'", TextView.class);
        addMeshDeviceActivity.mRefreshText = (TextView) Utils.findRequiredViewAsType(view, C11745R$id.refresh_text, "field 'mRefreshText'", TextView.class);
        addMeshDeviceActivity.mRefreshProgress = (ProgressBar) Utils.findRequiredViewAsType(view, C11745R$id.refresh_progress, "field 'mRefreshProgress'", ProgressBar.class);
        addMeshDeviceActivity.mRefreshImg = (ImageView) Utils.findRequiredViewAsType(view, C11745R$id.refresh_retry_img, "field 'mRefreshImg'", ImageView.class);
        addMeshDeviceActivity.mRefreshLayout = Utils.findRequiredView(view, 2131297152, "field 'mRefreshLayout'");
    }

    @CallSuper
    public void unbind() {
        AddMeshDeviceActivity addMeshDeviceActivity = this.f10321a;
        if (addMeshDeviceActivity != null) {
            this.f10321a = null;
            addMeshDeviceActivity.mTitleBar = null;
            addMeshDeviceActivity.mDeviceList = null;
            addMeshDeviceActivity.mTitle = null;
            addMeshDeviceActivity.mSubInfo = null;
            addMeshDeviceActivity.mProductIcon = null;
            addMeshDeviceActivity.mBtnNext = null;
            addMeshDeviceActivity.mBtnRetry = null;
            addMeshDeviceActivity.mRefreshText = null;
            addMeshDeviceActivity.mRefreshProgress = null;
            addMeshDeviceActivity.mRefreshImg = null;
            addMeshDeviceActivity.mRefreshLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
