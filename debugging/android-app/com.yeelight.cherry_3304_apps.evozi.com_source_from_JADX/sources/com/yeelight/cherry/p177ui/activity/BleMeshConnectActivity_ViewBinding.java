package com.yeelight.cherry.p177ui.activity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.view.ConnectCircleView;

/* renamed from: com.yeelight.cherry.ui.activity.BleMeshConnectActivity_ViewBinding */
public class BleMeshConnectActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BleMeshConnectActivity f10359a;

    @UiThread
    public BleMeshConnectActivity_ViewBinding(BleMeshConnectActivity bleMeshConnectActivity, View view) {
        this.f10359a = bleMeshConnectActivity;
        bleMeshConnectActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297424, "field 'mTitleBar'", CommonTitleBar.class);
        bleMeshConnectActivity.mTitleView = (TextView) Utils.findRequiredViewAsType(view, 2131297422, "field 'mTitleView'", TextView.class);
        bleMeshConnectActivity.mSubView = (TextView) Utils.findRequiredViewAsType(view, C11745R$id.sub_info, "field 'mSubView'", TextView.class);
        bleMeshConnectActivity.mProgressView = (TextView) Utils.findRequiredViewAsType(view, C11745R$id.progress_text, "field 'mProgressView'", TextView.class);
        bleMeshConnectActivity.mBtnRetry = (Button) Utils.findRequiredViewAsType(view, C11745R$id.btn_retry, "field 'mBtnRetry'", Button.class);
        bleMeshConnectActivity.mCircleView = (ConnectCircleView) Utils.findRequiredViewAsType(view, C11745R$id.progressView, "field 'mCircleView'", ConnectCircleView.class);
        bleMeshConnectActivity.mFailedLayout = (ImageView) Utils.findRequiredViewAsType(view, C11745R$id.failed_layout, "field 'mFailedLayout'", ImageView.class);
        bleMeshConnectActivity.mProgressLayout = (RelativeLayout) Utils.findRequiredViewAsType(view, C11745R$id.progress_layout, "field 'mProgressLayout'", RelativeLayout.class);
    }

    @CallSuper
    public void unbind() {
        BleMeshConnectActivity bleMeshConnectActivity = this.f10359a;
        if (bleMeshConnectActivity != null) {
            this.f10359a = null;
            bleMeshConnectActivity.mTitleBar = null;
            bleMeshConnectActivity.mTitleView = null;
            bleMeshConnectActivity.mSubView = null;
            bleMeshConnectActivity.mProgressView = null;
            bleMeshConnectActivity.mBtnRetry = null;
            bleMeshConnectActivity.mCircleView = null;
            bleMeshConnectActivity.mFailedLayout = null;
            bleMeshConnectActivity.mProgressLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
