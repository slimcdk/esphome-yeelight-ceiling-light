package com.yeelight.cherry.p141ui.activity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.BluetoothDeviceUpgradeActivity_ViewBinding */
public class BluetoothDeviceUpgradeActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BluetoothDeviceUpgradeActivity f9981a;

    @UiThread
    public BluetoothDeviceUpgradeActivity_ViewBinding(BluetoothDeviceUpgradeActivity bluetoothDeviceUpgradeActivity, View view) {
        this.f9981a = bluetoothDeviceUpgradeActivity;
        bluetoothDeviceUpgradeActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297591, "field 'mTitleBar'", CommonTitleBar.class);
        bluetoothDeviceUpgradeActivity.mNewUpdateLayout = (LinearLayout) Utils.findRequiredViewAsType(view, C12225R$id.layout_new_update, "field 'mNewUpdateLayout'", LinearLayout.class);
        bluetoothDeviceUpgradeActivity.mNewUpdateCurrentVersion = (TextView) Utils.findRequiredViewAsType(view, C12225R$id.current_version, "field 'mNewUpdateCurrentVersion'", TextView.class);
        bluetoothDeviceUpgradeActivity.mNewUpdateLatestVersion = (TextView) Utils.findRequiredViewAsType(view, C12225R$id.latest_version, "field 'mNewUpdateLatestVersion'", TextView.class);
        bluetoothDeviceUpgradeActivity.mNewUpdateReleaseNote = (TextView) Utils.findRequiredViewAsType(view, C12225R$id.release_note, "field 'mNewUpdateReleaseNote'", TextView.class);
        bluetoothDeviceUpgradeActivity.mBtnUpdate = (Button) Utils.findRequiredViewAsType(view, C12225R$id.btn_update, "field 'mBtnUpdate'", Button.class);
        bluetoothDeviceUpgradeActivity.mBtnRetry = (Button) Utils.findRequiredViewAsType(view, C12225R$id.btn_retry, "field 'mBtnRetry'", Button.class);
        bluetoothDeviceUpgradeActivity.mUpdatingLayout = (LinearLayout) Utils.findRequiredViewAsType(view, C12225R$id.firmware_upgrading_layout, "field 'mUpdatingLayout'", LinearLayout.class);
        bluetoothDeviceUpgradeActivity.mUpdatingHint = (TextView) Utils.findRequiredViewAsType(view, C12225R$id.updating_hint_tx, "field 'mUpdatingHint'", TextView.class);
        bluetoothDeviceUpgradeActivity.mUpdateFailLayout = (LinearLayout) Utils.findRequiredViewAsType(view, C12225R$id.firmware_upgrade_fail_layout, "field 'mUpdateFailLayout'", LinearLayout.class);
        bluetoothDeviceUpgradeActivity.mNoupdateLayout = (LinearLayout) Utils.findRequiredViewAsType(view, C12225R$id.layout_no_update, "field 'mNoupdateLayout'", LinearLayout.class);
        bluetoothDeviceUpgradeActivity.mNoUpdateCurrentVersion = (TextView) Utils.findRequiredViewAsType(view, C12225R$id.no_update_current_version, "field 'mNoUpdateCurrentVersion'", TextView.class);
        bluetoothDeviceUpgradeActivity.mProgressView = (ImageView) Utils.findRequiredViewAsType(view, C12225R$id.progress_bar_upgrade, "field 'mProgressView'", ImageView.class);
        bluetoothDeviceUpgradeActivity.mProgress = (TextView) Utils.findRequiredViewAsType(view, C12225R$id.update_progress, "field 'mProgress'", TextView.class);
    }

    @CallSuper
    public void unbind() {
        BluetoothDeviceUpgradeActivity bluetoothDeviceUpgradeActivity = this.f9981a;
        if (bluetoothDeviceUpgradeActivity != null) {
            this.f9981a = null;
            bluetoothDeviceUpgradeActivity.mTitleBar = null;
            bluetoothDeviceUpgradeActivity.mNewUpdateLayout = null;
            bluetoothDeviceUpgradeActivity.mNewUpdateCurrentVersion = null;
            bluetoothDeviceUpgradeActivity.mNewUpdateLatestVersion = null;
            bluetoothDeviceUpgradeActivity.mNewUpdateReleaseNote = null;
            bluetoothDeviceUpgradeActivity.mBtnUpdate = null;
            bluetoothDeviceUpgradeActivity.mBtnRetry = null;
            bluetoothDeviceUpgradeActivity.mUpdatingLayout = null;
            bluetoothDeviceUpgradeActivity.mUpdatingHint = null;
            bluetoothDeviceUpgradeActivity.mUpdateFailLayout = null;
            bluetoothDeviceUpgradeActivity.mNoupdateLayout = null;
            bluetoothDeviceUpgradeActivity.mNoUpdateCurrentVersion = null;
            bluetoothDeviceUpgradeActivity.mProgressView = null;
            bluetoothDeviceUpgradeActivity.mProgress = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
