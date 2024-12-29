package com.yeelight.cherry.p177ui.activity;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.MeshGatewayControlActivity_ViewBinding */
public class MeshGatewayControlActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MeshGatewayControlActivity f11219a;

    @UiThread
    public MeshGatewayControlActivity_ViewBinding(MeshGatewayControlActivity meshGatewayControlActivity, View view) {
        this.f11219a = meshGatewayControlActivity;
        meshGatewayControlActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297424, "field 'mTitleBar'", CommonTitleBar.class);
        meshGatewayControlActivity.mTvVersion = (TextView) Utils.findRequiredViewAsType(view, C11745R$id.tv_version, "field 'mTvVersion'", TextView.class);
    }

    @CallSuper
    public void unbind() {
        MeshGatewayControlActivity meshGatewayControlActivity = this.f11219a;
        if (meshGatewayControlActivity != null) {
            this.f11219a = null;
            meshGatewayControlActivity.mTitleBar = null;
            meshGatewayControlActivity.mTvVersion = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
