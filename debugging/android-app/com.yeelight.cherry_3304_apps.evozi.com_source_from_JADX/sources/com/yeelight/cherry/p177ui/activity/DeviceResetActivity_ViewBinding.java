package com.yeelight.cherry.p177ui.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.DeviceResetActivity_ViewBinding */
public class DeviceResetActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private DeviceResetActivity f10776a;

    /* renamed from: b */
    private View f10777b;

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceResetActivity_ViewBinding$a */
    class C5200a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ DeviceResetActivity f10778a;

        C5200a(DeviceResetActivity_ViewBinding deviceResetActivity_ViewBinding, DeviceResetActivity deviceResetActivity) {
            this.f10778a = deviceResetActivity;
        }

        public void doClick(View view) {
            this.f10778a.next(view);
        }
    }

    @UiThread
    public DeviceResetActivity_ViewBinding(DeviceResetActivity deviceResetActivity, View view) {
        this.f10776a = deviceResetActivity;
        deviceResetActivity.mTitle = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297424, "field 'mTitle'", CommonTitleBar.class);
        deviceResetActivity.mProductIcon = (ImageView) Utils.findRequiredViewAsType(view, 2131297109, "field 'mProductIcon'", ImageView.class);
        deviceResetActivity.mTitleView = (TextView) Utils.findRequiredViewAsType(view, 2131297422, "field 'mTitleView'", TextView.class);
        deviceResetActivity.mSubInfo = (TextView) Utils.findRequiredViewAsType(view, C11745R$id.sub_info, "field 'mSubInfo'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, C11745R$id.next, "method 'next'");
        this.f10777b = findRequiredView;
        findRequiredView.setOnClickListener(new C5200a(this, deviceResetActivity));
    }

    @CallSuper
    public void unbind() {
        DeviceResetActivity deviceResetActivity = this.f10776a;
        if (deviceResetActivity != null) {
            this.f10776a = null;
            deviceResetActivity.mTitle = null;
            deviceResetActivity.mProductIcon = null;
            deviceResetActivity.mTitleView = null;
            deviceResetActivity.mSubInfo = null;
            this.f10777b.setOnClickListener((View.OnClickListener) null);
            this.f10777b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
