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
import com.yeelight.cherry.C11745R$id;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.PlugControlActivity_ViewBinding */
public class PlugControlActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PlugControlActivity f11587a;

    @UiThread
    public PlugControlActivity_ViewBinding(PlugControlActivity plugControlActivity, View view) {
        this.f11587a = plugControlActivity;
        plugControlActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297424, "field 'mTitleBar'", CommonTitleBar.class);
        plugControlActivity.mTvFirmware = (TextView) Utils.findRequiredViewAsType(view, C11745R$id.tv_firmware, "field 'mTvFirmware'", TextView.class);
        plugControlActivity.mFunctionGridView = (GridView) Utils.findRequiredViewAsType(view, C11745R$id.function_grid_view, "field 'mFunctionGridView'", GridView.class);
        plugControlActivity.mMoreLayout = (LinearLayout) Utils.findRequiredViewAsType(view, C11745R$id.control_view_more, "field 'mMoreLayout'", LinearLayout.class);
        plugControlActivity.mLayoutShadows = (LinearLayout) Utils.findRequiredViewAsType(view, C11745R$id.shadow_view, "field 'mLayoutShadows'", LinearLayout.class);
        plugControlActivity.mLayoutAnimation = (LinearLayout) Utils.findRequiredViewAsType(view, C11745R$id.layout_animation, "field 'mLayoutAnimation'", LinearLayout.class);
        plugControlActivity.mLayoutLeft = (LinearLayout) Utils.findRequiredViewAsType(view, 2131296912, "field 'mLayoutLeft'", LinearLayout.class);
        plugControlActivity.mImageLeft = (ImageView) Utils.findRequiredViewAsType(view, C11745R$id.image_left, "field 'mImageLeft'", ImageView.class);
        plugControlActivity.mLayoutMiddle = (ViewGroup) Utils.findRequiredViewAsType(view, C11745R$id.layout_middle, "field 'mLayoutMiddle'", ViewGroup.class);
        plugControlActivity.mImageMiddle = (ImageView) Utils.findRequiredViewAsType(view, C11745R$id.image_middle, "field 'mImageMiddle'", ImageView.class);
        plugControlActivity.mLayoutRight = (LinearLayout) Utils.findRequiredViewAsType(view, 2131296921, "field 'mLayoutRight'", LinearLayout.class);
        plugControlActivity.mImageRight = (ImageView) Utils.findRequiredViewAsType(view, C11745R$id.image_right, "field 'mImageRight'", ImageView.class);
        plugControlActivity.mDelayEnable = (TextView) Utils.findRequiredViewAsType(view, C11745R$id.delay_enable, "field 'mDelayEnable'", TextView.class);
    }

    @CallSuper
    public void unbind() {
        PlugControlActivity plugControlActivity = this.f11587a;
        if (plugControlActivity != null) {
            this.f11587a = null;
            plugControlActivity.mTitleBar = null;
            plugControlActivity.mTvFirmware = null;
            plugControlActivity.mFunctionGridView = null;
            plugControlActivity.mMoreLayout = null;
            plugControlActivity.mLayoutShadows = null;
            plugControlActivity.mLayoutAnimation = null;
            plugControlActivity.mLayoutLeft = null;
            plugControlActivity.mImageLeft = null;
            plugControlActivity.mLayoutMiddle = null;
            plugControlActivity.mImageMiddle = null;
            plugControlActivity.mLayoutRight = null;
            plugControlActivity.mImageRight = null;
            plugControlActivity.mDelayEnable = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
