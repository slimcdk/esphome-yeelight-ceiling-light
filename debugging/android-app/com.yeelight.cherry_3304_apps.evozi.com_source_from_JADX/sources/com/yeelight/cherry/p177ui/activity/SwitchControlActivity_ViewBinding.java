package com.yeelight.cherry.p177ui.activity;

import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.google.android.material.tabs.TabLayout;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.SwitchControlActivity_ViewBinding */
public class SwitchControlActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SwitchControlActivity f11903a;

    @UiThread
    public SwitchControlActivity_ViewBinding(SwitchControlActivity switchControlActivity, View view) {
        this.f11903a = switchControlActivity;
        switchControlActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297424, "field 'mTitleBar'", CommonTitleBar.class);
        switchControlActivity.mTabLayout = (TabLayout) Utils.findRequiredViewAsType(view, 2131297374, "field 'mTabLayout'", TabLayout.class);
        switchControlActivity.mTvFirmware = (TextView) Utils.findRequiredViewAsType(view, C11745R$id.tv_firmware, "field 'mTvFirmware'", TextView.class);
        switchControlActivity.mFunctionGridView = (GridView) Utils.findRequiredViewAsType(view, C11745R$id.function_grid_view, "field 'mFunctionGridView'", GridView.class);
        switchControlActivity.mMoreLayout = (LinearLayout) Utils.findRequiredViewAsType(view, C11745R$id.control_view_more, "field 'mMoreLayout'", LinearLayout.class);
        switchControlActivity.mLayoutShadows = (LinearLayout) Utils.findRequiredViewAsType(view, C11745R$id.shadow_view, "field 'mLayoutShadows'", LinearLayout.class);
        switchControlActivity.mLayoutAnimation = (LinearLayout) Utils.findRequiredViewAsType(view, C11745R$id.layout_animation, "field 'mLayoutAnimation'", LinearLayout.class);
        switchControlActivity.mLayoutLeft = (LinearLayout) Utils.findRequiredViewAsType(view, 2131296912, "field 'mLayoutLeft'", LinearLayout.class);
        switchControlActivity.mImageLeft = (ImageView) Utils.findRequiredViewAsType(view, C11745R$id.image_left, "field 'mImageLeft'", ImageView.class);
        switchControlActivity.mLayoutMiddle = (ViewGroup) Utils.findRequiredViewAsType(view, C11745R$id.layout_middle, "field 'mLayoutMiddle'", ViewGroup.class);
        switchControlActivity.mImageMiddle = (ImageView) Utils.findRequiredViewAsType(view, C11745R$id.image_middle, "field 'mImageMiddle'", ImageView.class);
        switchControlActivity.mLayoutRight = (LinearLayout) Utils.findRequiredViewAsType(view, 2131296921, "field 'mLayoutRight'", LinearLayout.class);
        switchControlActivity.mImageRight = (ImageView) Utils.findRequiredViewAsType(view, C11745R$id.image_right, "field 'mImageRight'", ImageView.class);
        switchControlActivity.mDelayEnable = (TextView) Utils.findRequiredViewAsType(view, C11745R$id.delay_enable, "field 'mDelayEnable'", TextView.class);
    }

    @CallSuper
    public void unbind() {
        SwitchControlActivity switchControlActivity = this.f11903a;
        if (switchControlActivity != null) {
            this.f11903a = null;
            switchControlActivity.mTitleBar = null;
            switchControlActivity.mTabLayout = null;
            switchControlActivity.mTvFirmware = null;
            switchControlActivity.mFunctionGridView = null;
            switchControlActivity.mMoreLayout = null;
            switchControlActivity.mLayoutShadows = null;
            switchControlActivity.mLayoutAnimation = null;
            switchControlActivity.mLayoutLeft = null;
            switchControlActivity.mImageLeft = null;
            switchControlActivity.mLayoutMiddle = null;
            switchControlActivity.mImageMiddle = null;
            switchControlActivity.mLayoutRight = null;
            switchControlActivity.mImageRight = null;
            switchControlActivity.mDelayEnable = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
