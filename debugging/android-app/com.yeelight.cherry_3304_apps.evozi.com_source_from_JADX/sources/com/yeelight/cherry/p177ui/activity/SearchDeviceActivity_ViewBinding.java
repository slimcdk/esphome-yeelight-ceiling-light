package com.yeelight.cherry.p177ui.activity;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceActivity_ViewBinding */
public class SearchDeviceActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SearchDeviceActivity f11795a;

    /* renamed from: b */
    private View f11796b;

    /* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceActivity_ViewBinding$a */
    class C5631a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchDeviceActivity f11797a;

        C5631a(SearchDeviceActivity_ViewBinding searchDeviceActivity_ViewBinding, SearchDeviceActivity searchDeviceActivity) {
            this.f11797a = searchDeviceActivity;
        }

        public void doClick(View view) {
            this.f11797a.next(view);
        }
    }

    @UiThread
    public SearchDeviceActivity_ViewBinding(SearchDeviceActivity searchDeviceActivity, View view) {
        this.f11795a = searchDeviceActivity;
        searchDeviceActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297424, "field 'mTitleBar'", CommonTitleBar.class);
        searchDeviceActivity.mDeviceList = (RecyclerView) Utils.findRequiredViewAsType(view, 2131296591, "field 'mDeviceList'", RecyclerView.class);
        searchDeviceActivity.mTitle = (TextView) Utils.findRequiredViewAsType(view, 2131297422, "field 'mTitle'", TextView.class);
        searchDeviceActivity.mSubInfo = (TextView) Utils.findRequiredViewAsType(view, C11745R$id.sub_info, "field 'mSubInfo'", TextView.class);
        searchDeviceActivity.mProductIcon = (ImageView) Utils.findRequiredViewAsType(view, 2131297109, "field 'mProductIcon'", ImageView.class);
        View findRequiredView = Utils.findRequiredView(view, C11745R$id.next, "field 'mBtnNext' and method 'next'");
        searchDeviceActivity.mBtnNext = (Button) Utils.castView(findRequiredView, C11745R$id.next, "field 'mBtnNext'", Button.class);
        this.f11796b = findRequiredView;
        findRequiredView.setOnClickListener(new C5631a(this, searchDeviceActivity));
        searchDeviceActivity.mRefreshText = (TextView) Utils.findRequiredViewAsType(view, C11745R$id.refresh_text, "field 'mRefreshText'", TextView.class);
        searchDeviceActivity.mRefreshProgress = (ProgressBar) Utils.findRequiredViewAsType(view, C11745R$id.refresh_progress, "field 'mRefreshProgress'", ProgressBar.class);
        searchDeviceActivity.mRefreshImg = (ImageView) Utils.findRequiredViewAsType(view, C11745R$id.refresh_retry_img, "field 'mRefreshImg'", ImageView.class);
        searchDeviceActivity.mRefreshLayout = Utils.findRequiredView(view, 2131297152, "field 'mRefreshLayout'");
        searchDeviceActivity.mBtnRetry = (TextView) Utils.findRequiredViewAsType(view, C11745R$id.btn_retry, "field 'mBtnRetry'", TextView.class);
        searchDeviceActivity.mTopLayout = (FrameLayout) Utils.findRequiredViewAsType(view, C11745R$id.content_top, "field 'mTopLayout'", FrameLayout.class);
    }

    @CallSuper
    public void unbind() {
        SearchDeviceActivity searchDeviceActivity = this.f11795a;
        if (searchDeviceActivity != null) {
            this.f11795a = null;
            searchDeviceActivity.mTitleBar = null;
            searchDeviceActivity.mDeviceList = null;
            searchDeviceActivity.mTitle = null;
            searchDeviceActivity.mSubInfo = null;
            searchDeviceActivity.mProductIcon = null;
            searchDeviceActivity.mBtnNext = null;
            searchDeviceActivity.mRefreshText = null;
            searchDeviceActivity.mRefreshProgress = null;
            searchDeviceActivity.mRefreshImg = null;
            searchDeviceActivity.mRefreshLayout = null;
            searchDeviceActivity.mBtnRetry = null;
            searchDeviceActivity.mTopLayout = null;
            this.f11796b.setOnClickListener((View.OnClickListener) null);
            this.f11796b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
