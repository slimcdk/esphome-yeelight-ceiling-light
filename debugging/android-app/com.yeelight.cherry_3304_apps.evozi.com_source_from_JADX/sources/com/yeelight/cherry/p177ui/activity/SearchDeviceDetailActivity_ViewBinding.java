package com.yeelight.cherry.p177ui.activity;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceDetailActivity_ViewBinding */
public class SearchDeviceDetailActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SearchDeviceDetailActivity f11820a;

    @UiThread
    public SearchDeviceDetailActivity_ViewBinding(SearchDeviceDetailActivity searchDeviceDetailActivity, View view) {
        this.f11820a = searchDeviceDetailActivity;
        searchDeviceDetailActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297424, "field 'mTitleBar'", CommonTitleBar.class);
        searchDeviceDetailActivity.mRvDevice = (RecyclerView) Utils.findRequiredViewAsType(view, 2131297243, "field 'mRvDevice'", RecyclerView.class);
    }

    @CallSuper
    public void unbind() {
        SearchDeviceDetailActivity searchDeviceDetailActivity = this.f11820a;
        if (searchDeviceDetailActivity != null) {
            this.f11820a = null;
            searchDeviceDetailActivity.mTitleBar = null;
            searchDeviceDetailActivity.mRvDevice = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
