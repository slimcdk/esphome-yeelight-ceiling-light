package com.yeelight.cherry.p141ui.activity;

import android.view.View;
import android.widget.Button;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.SelectNetworkActivity_ViewBinding */
public class SelectNetworkActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SelectNetworkActivity f11446a;

    @UiThread
    public SelectNetworkActivity_ViewBinding(SelectNetworkActivity selectNetworkActivity, View view) {
        this.f11446a = selectNetworkActivity;
        selectNetworkActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297591, "field 'mTitleBar'", CommonTitleBar.class);
        selectNetworkActivity.mNetworkList = (RecyclerView) Utils.findRequiredViewAsType(view, C12225R$id.network_list, "field 'mNetworkList'", RecyclerView.class);
        selectNetworkActivity.mBtnNext = (Button) Utils.findRequiredViewAsType(view, C12225R$id.next, "field 'mBtnNext'", Button.class);
    }

    @CallSuper
    public void unbind() {
        SelectNetworkActivity selectNetworkActivity = this.f11446a;
        if (selectNetworkActivity != null) {
            this.f11446a = null;
            selectNetworkActivity.mTitleBar = null;
            selectNetworkActivity.mNetworkList = null;
            selectNetworkActivity.mBtnNext = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
