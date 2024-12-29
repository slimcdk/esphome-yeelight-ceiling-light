package com.yeelight.cherry.p177ui.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceAutoActivity_ViewBinding */
public class SearchDeviceAutoActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SearchDeviceAutoActivity f11812a;

    /* renamed from: b */
    private View f11813b;

    /* renamed from: c */
    private View f11814c;

    /* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceAutoActivity_ViewBinding$a */
    class C5636a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchDeviceAutoActivity f11815a;

        C5636a(SearchDeviceAutoActivity_ViewBinding searchDeviceAutoActivity_ViewBinding, SearchDeviceAutoActivity searchDeviceAutoActivity) {
            this.f11815a = searchDeviceAutoActivity;
        }

        public void doClick(View view) {
            this.f11815a.onViewClick(view);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceAutoActivity_ViewBinding$b */
    class C5637b extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchDeviceAutoActivity f11816a;

        C5637b(SearchDeviceAutoActivity_ViewBinding searchDeviceAutoActivity_ViewBinding, SearchDeviceAutoActivity searchDeviceAutoActivity) {
            this.f11816a = searchDeviceAutoActivity;
        }

        public void doClick(View view) {
            this.f11816a.onViewClick(view);
        }
    }

    @UiThread
    public SearchDeviceAutoActivity_ViewBinding(SearchDeviceAutoActivity searchDeviceAutoActivity, View view) {
        this.f11812a = searchDeviceAutoActivity;
        searchDeviceAutoActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297424, "field 'mTitleBar'", CommonTitleBar.class);
        searchDeviceAutoActivity.mClScnanning = Utils.findRequiredView(view, C11745R$id.cl_scanning, "field 'mClScnanning'");
        searchDeviceAutoActivity.mImgScanning = (ImageView) Utils.findRequiredViewAsType(view, C11745R$id.img_scanning, "field 'mImgScanning'", ImageView.class);
        searchDeviceAutoActivity.mTvPermissionDenied = (TextView) Utils.findRequiredViewAsType(view, C11745R$id.tv_permission_denied, "field 'mTvPermissionDenied'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, C11745R$id.tv_go_setting, "field 'mTvGoSetting' and method 'onViewClick'");
        searchDeviceAutoActivity.mTvGoSetting = (TextView) Utils.castView(findRequiredView, C11745R$id.tv_go_setting, "field 'mTvGoSetting'", TextView.class);
        this.f11813b = findRequiredView;
        findRequiredView.setOnClickListener(new C5636a(this, searchDeviceAutoActivity));
        searchDeviceAutoActivity.mRvScannedDevice = (RecyclerView) Utils.findRequiredViewAsType(view, C11745R$id.rv_scanned_device, "field 'mRvScannedDevice'", RecyclerView.class);
        searchDeviceAutoActivity.mRvCategory = (RecyclerView) Utils.findRequiredViewAsType(view, C11745R$id.rv_category, "field 'mRvCategory'", RecyclerView.class);
        View findRequiredView2 = Utils.findRequiredView(view, C11745R$id.img_more, "field 'mImgMore' and method 'onViewClick'");
        searchDeviceAutoActivity.mImgMore = (ImageView) Utils.castView(findRequiredView2, C11745R$id.img_more, "field 'mImgMore'", ImageView.class);
        this.f11814c = findRequiredView2;
        findRequiredView2.setOnClickListener(new C5637b(this, searchDeviceAutoActivity));
        searchDeviceAutoActivity.mTvScanNoDevice = (TextView) Utils.findRequiredViewAsType(view, C11745R$id.tv_scan_no_device, "field 'mTvScanNoDevice'", TextView.class);
    }

    @CallSuper
    public void unbind() {
        SearchDeviceAutoActivity searchDeviceAutoActivity = this.f11812a;
        if (searchDeviceAutoActivity != null) {
            this.f11812a = null;
            searchDeviceAutoActivity.mTitleBar = null;
            searchDeviceAutoActivity.mClScnanning = null;
            searchDeviceAutoActivity.mImgScanning = null;
            searchDeviceAutoActivity.mTvPermissionDenied = null;
            searchDeviceAutoActivity.mTvGoSetting = null;
            searchDeviceAutoActivity.mRvScannedDevice = null;
            searchDeviceAutoActivity.mRvCategory = null;
            searchDeviceAutoActivity.mImgMore = null;
            searchDeviceAutoActivity.mTvScanNoDevice = null;
            this.f11813b.setOnClickListener((View.OnClickListener) null);
            this.f11813b = null;
            this.f11814c.setOnClickListener((View.OnClickListener) null);
            this.f11814c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
