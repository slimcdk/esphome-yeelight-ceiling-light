package com.yeelight.cherry.p141ui.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceAutoActivity_ViewBinding */
public class SearchDeviceAutoActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SearchDeviceAutoActivity f11383a;

    /* renamed from: b */
    private View f11384b;

    /* renamed from: c */
    private View f11385c;

    /* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceAutoActivity_ViewBinding$a */
    class C5677a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchDeviceAutoActivity f11386a;

        C5677a(SearchDeviceAutoActivity_ViewBinding searchDeviceAutoActivity_ViewBinding, SearchDeviceAutoActivity searchDeviceAutoActivity) {
            this.f11386a = searchDeviceAutoActivity;
        }

        public void doClick(View view) {
            this.f11386a.onViewClick(view);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceAutoActivity_ViewBinding$b */
    class C5678b extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchDeviceAutoActivity f11387a;

        C5678b(SearchDeviceAutoActivity_ViewBinding searchDeviceAutoActivity_ViewBinding, SearchDeviceAutoActivity searchDeviceAutoActivity) {
            this.f11387a = searchDeviceAutoActivity;
        }

        public void doClick(View view) {
            this.f11387a.onViewClick(view);
        }
    }

    @UiThread
    public SearchDeviceAutoActivity_ViewBinding(SearchDeviceAutoActivity searchDeviceAutoActivity, View view) {
        this.f11383a = searchDeviceAutoActivity;
        searchDeviceAutoActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297591, "field 'mTitleBar'", CommonTitleBar.class);
        searchDeviceAutoActivity.mClScnanning = Utils.findRequiredView(view, C12225R$id.cl_scanning, "field 'mClScnanning'");
        searchDeviceAutoActivity.mImgScanning = (ImageView) Utils.findRequiredViewAsType(view, C12225R$id.img_scanning, "field 'mImgScanning'", ImageView.class);
        searchDeviceAutoActivity.mTvPermissionDenied = (TextView) Utils.findRequiredViewAsType(view, C12225R$id.tv_permission_denied, "field 'mTvPermissionDenied'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, C12225R$id.tv_go_setting, "field 'mTvGoSetting' and method 'onViewClick'");
        searchDeviceAutoActivity.mTvGoSetting = (TextView) Utils.castView(findRequiredView, C12225R$id.tv_go_setting, "field 'mTvGoSetting'", TextView.class);
        this.f11384b = findRequiredView;
        findRequiredView.setOnClickListener(new C5677a(this, searchDeviceAutoActivity));
        searchDeviceAutoActivity.mRvScannedDevice = (RecyclerView) Utils.findRequiredViewAsType(view, C12225R$id.rv_scanned_device, "field 'mRvScannedDevice'", RecyclerView.class);
        searchDeviceAutoActivity.mRvCategory = (RecyclerView) Utils.findRequiredViewAsType(view, C12225R$id.rv_category, "field 'mRvCategory'", RecyclerView.class);
        View findRequiredView2 = Utils.findRequiredView(view, C12225R$id.img_more, "field 'mImgMore' and method 'onViewClick'");
        searchDeviceAutoActivity.mImgMore = (ImageView) Utils.castView(findRequiredView2, C12225R$id.img_more, "field 'mImgMore'", ImageView.class);
        this.f11385c = findRequiredView2;
        findRequiredView2.setOnClickListener(new C5678b(this, searchDeviceAutoActivity));
        searchDeviceAutoActivity.mTvScanNoDevice = (TextView) Utils.findRequiredViewAsType(view, C12225R$id.tv_scan_no_device, "field 'mTvScanNoDevice'", TextView.class);
    }

    @CallSuper
    public void unbind() {
        SearchDeviceAutoActivity searchDeviceAutoActivity = this.f11383a;
        if (searchDeviceAutoActivity != null) {
            this.f11383a = null;
            searchDeviceAutoActivity.mTitleBar = null;
            searchDeviceAutoActivity.mClScnanning = null;
            searchDeviceAutoActivity.mImgScanning = null;
            searchDeviceAutoActivity.mTvPermissionDenied = null;
            searchDeviceAutoActivity.mTvGoSetting = null;
            searchDeviceAutoActivity.mRvScannedDevice = null;
            searchDeviceAutoActivity.mRvCategory = null;
            searchDeviceAutoActivity.mImgMore = null;
            searchDeviceAutoActivity.mTvScanNoDevice = null;
            this.f11384b.setOnClickListener((View.OnClickListener) null);
            this.f11384b = null;
            this.f11385c.setOnClickListener((View.OnClickListener) null);
            this.f11385c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
