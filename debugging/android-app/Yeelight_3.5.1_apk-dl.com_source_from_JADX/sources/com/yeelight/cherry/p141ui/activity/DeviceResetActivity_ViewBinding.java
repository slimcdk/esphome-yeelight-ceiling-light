package com.yeelight.cherry.p141ui.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.DeviceResetActivity_ViewBinding */
public class DeviceResetActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private DeviceResetActivity f10338a;

    /* renamed from: b */
    private View f10339b;

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceResetActivity_ViewBinding$a */
    class C5249a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ DeviceResetActivity f10340a;

        C5249a(DeviceResetActivity_ViewBinding deviceResetActivity_ViewBinding, DeviceResetActivity deviceResetActivity) {
            this.f10340a = deviceResetActivity;
        }

        public void doClick(View view) {
            this.f10340a.next(view);
        }
    }

    @UiThread
    public DeviceResetActivity_ViewBinding(DeviceResetActivity deviceResetActivity, View view) {
        this.f10338a = deviceResetActivity;
        deviceResetActivity.mTitle = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297591, "field 'mTitle'", CommonTitleBar.class);
        deviceResetActivity.mProductIcon = (ImageView) Utils.findRequiredViewAsType(view, 2131297242, "field 'mProductIcon'", ImageView.class);
        deviceResetActivity.mTitleView = (TextView) Utils.findRequiredViewAsType(view, 2131297589, "field 'mTitleView'", TextView.class);
        deviceResetActivity.mSubInfo = (TextView) Utils.findRequiredViewAsType(view, C12225R$id.sub_info, "field 'mSubInfo'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, C12225R$id.next, "method 'next'");
        this.f10339b = findRequiredView;
        findRequiredView.setOnClickListener(new C5249a(this, deviceResetActivity));
    }

    @CallSuper
    public void unbind() {
        DeviceResetActivity deviceResetActivity = this.f10338a;
        if (deviceResetActivity != null) {
            this.f10338a = null;
            deviceResetActivity.mTitle = null;
            deviceResetActivity.mProductIcon = null;
            deviceResetActivity.mTitleView = null;
            deviceResetActivity.mSubInfo = null;
            this.f10339b.setOnClickListener((View.OnClickListener) null);
            this.f10339b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
