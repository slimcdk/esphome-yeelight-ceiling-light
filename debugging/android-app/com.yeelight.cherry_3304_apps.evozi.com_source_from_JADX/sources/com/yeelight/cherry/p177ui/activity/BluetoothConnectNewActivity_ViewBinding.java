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

/* renamed from: com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity_ViewBinding */
public class BluetoothConnectNewActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BluetoothConnectNewActivity f10415a;

    @UiThread
    public BluetoothConnectNewActivity_ViewBinding(BluetoothConnectNewActivity bluetoothConnectNewActivity, View view) {
        this.f10415a = bluetoothConnectNewActivity;
        bluetoothConnectNewActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297424, "field 'mTitleBar'", CommonTitleBar.class);
        bluetoothConnectNewActivity.mTitleView = (TextView) Utils.findRequiredViewAsType(view, 2131297422, "field 'mTitleView'", TextView.class);
        bluetoothConnectNewActivity.mSubView = (TextView) Utils.findRequiredViewAsType(view, C11745R$id.sub_info, "field 'mSubView'", TextView.class);
        bluetoothConnectNewActivity.mProgressView = (TextView) Utils.findRequiredViewAsType(view, C11745R$id.progress_text, "field 'mProgressView'", TextView.class);
        bluetoothConnectNewActivity.mBtnRetry = (Button) Utils.findRequiredViewAsType(view, C11745R$id.btn_retry, "field 'mBtnRetry'", Button.class);
        bluetoothConnectNewActivity.mCircleView = (ConnectCircleView) Utils.findRequiredViewAsType(view, C11745R$id.progressView, "field 'mCircleView'", ConnectCircleView.class);
        bluetoothConnectNewActivity.mFailedLayout = (ImageView) Utils.findRequiredViewAsType(view, C11745R$id.failed_layout, "field 'mFailedLayout'", ImageView.class);
        bluetoothConnectNewActivity.mProgressLayout = (RelativeLayout) Utils.findRequiredViewAsType(view, C11745R$id.progress_layout, "field 'mProgressLayout'", RelativeLayout.class);
    }

    @CallSuper
    public void unbind() {
        BluetoothConnectNewActivity bluetoothConnectNewActivity = this.f10415a;
        if (bluetoothConnectNewActivity != null) {
            this.f10415a = null;
            bluetoothConnectNewActivity.mTitleBar = null;
            bluetoothConnectNewActivity.mTitleView = null;
            bluetoothConnectNewActivity.mSubView = null;
            bluetoothConnectNewActivity.mProgressView = null;
            bluetoothConnectNewActivity.mBtnRetry = null;
            bluetoothConnectNewActivity.mCircleView = null;
            bluetoothConnectNewActivity.mFailedLayout = null;
            bluetoothConnectNewActivity.mProgressLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
