package com.yeelight.cherry.p141ui.activity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.p142ui.view.ConnectCircleView;

/* renamed from: com.yeelight.cherry.ui.activity.BleMeshConnectActivity_ViewBinding */
public class BleMeshConnectActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BleMeshConnectActivity f9903a;

    @UiThread
    public BleMeshConnectActivity_ViewBinding(BleMeshConnectActivity bleMeshConnectActivity, View view) {
        this.f9903a = bleMeshConnectActivity;
        bleMeshConnectActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297591, "field 'mTitleBar'", CommonTitleBar.class);
        bleMeshConnectActivity.mTitleView = (TextView) Utils.findRequiredViewAsType(view, 2131297589, "field 'mTitleView'", TextView.class);
        bleMeshConnectActivity.mSubView = (TextView) Utils.findRequiredViewAsType(view, C12225R$id.sub_info, "field 'mSubView'", TextView.class);
        bleMeshConnectActivity.mProgressView = (TextView) Utils.findRequiredViewAsType(view, C12225R$id.progress_text, "field 'mProgressView'", TextView.class);
        bleMeshConnectActivity.mBtnRetry = (Button) Utils.findRequiredViewAsType(view, C12225R$id.btn_retry, "field 'mBtnRetry'", Button.class);
        bleMeshConnectActivity.mCircleView = (ConnectCircleView) Utils.findRequiredViewAsType(view, C12225R$id.progressView, "field 'mCircleView'", ConnectCircleView.class);
        bleMeshConnectActivity.mFailedLayout = (ImageView) Utils.findRequiredViewAsType(view, C12225R$id.failed_layout, "field 'mFailedLayout'", ImageView.class);
        bleMeshConnectActivity.mProgressLayout = (RelativeLayout) Utils.findRequiredViewAsType(view, C12225R$id.progress_layout, "field 'mProgressLayout'", RelativeLayout.class);
    }

    @CallSuper
    public void unbind() {
        BleMeshConnectActivity bleMeshConnectActivity = this.f9903a;
        if (bleMeshConnectActivity != null) {
            this.f9903a = null;
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
