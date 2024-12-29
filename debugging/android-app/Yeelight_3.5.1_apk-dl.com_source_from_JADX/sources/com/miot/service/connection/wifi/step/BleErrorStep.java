package com.miot.service.connection.wifi.step;

import android.content.Context;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.inuker.bluetooth.library.utils.BluetoothLog;
import com.miot.service.C2875R;
import com.miot.service.connection.wifi.SmartConfigDataProvider;
import com.miot.service.connection.wifi.step.SmartConfigStep;

public class BleErrorStep extends SmartConfigStep {
    ImageView mIcon;
    TextView mLeftBtn;
    TextView mMainTitle;
    TextView mRightBtn;
    TextView mSubMainTitle;

    public SmartConfigStep.Step getStep() {
        return SmartConfigStep.Step.STEP_BLE_ERROR;
    }

    public void handleMessage(Message message) {
    }

    /* access modifiers changed from: protected */
    public void initView(View view) {
        this.mIcon = (ImageView) view.findViewById(C2875R.C2877id.smart_config_common_icon);
        this.mMainTitle = (TextView) view.findViewById(C2875R.C2877id.smart_config_common_main_title);
        this.mSubMainTitle = (TextView) view.findViewById(C2875R.C2877id.smart_config_common_main_sub_title);
        this.mLeftBtn = (TextView) view.findViewById(C2875R.C2877id.left_btn);
        this.mRightBtn = (TextView) view.findViewById(C2875R.C2877id.right_btn);
    }

    public boolean onBackPressed() {
        BluetoothLog.m7332v(String.format("%s.onBackPressed", new Object[]{getClass().getSimpleName()}));
        SmartConfigDataProvider.getInstance().set(SmartConfigDataProvider.KEY_RESTORE_WIFI, Boolean.TRUE);
        return super.onBackPressed();
    }

    public void onCreateStep(Context context) {
        setContentView(context, C2875R.layout.smart_config_base_left_right_ui);
        this.mIcon.setImageResource(C2875R.C2876drawable.config_failed_disconnect);
        this.mMainTitle.setText(C2875R.string.ble_combo_error);
        this.mSubMainTitle.setText("");
        this.mLeftBtn.setText(C2875R.string.cancel);
        this.mLeftBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                BluetoothLog.m7332v(String.format("Cancel Button Pressed", new Object[0]));
                SmartConfigDataProvider.getInstance().set(SmartConfigDataProvider.KEY_RESTORE_WIFI, Boolean.TRUE);
                BleErrorStep.this.finishSmartConfig(true);
            }
        });
        this.mRightBtn.setText(C2875R.string.retry);
        this.mRightBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                SmartConfigDataProvider.getInstance().set(SmartConfigDataProvider.KEY_SEND_PASSWD_SUCCESS, Boolean.FALSE);
                BleErrorStep.this.finishCurrentStep();
            }
        });
    }

    public void onFinishStep() {
        BluetoothLog.m7332v(String.format("%s.onFinishStep", new Object[]{getClass().getSimpleName()}));
    }

    public void onPauseStep() {
        BluetoothLog.m7332v(String.format("%s.onPauseStep", new Object[]{getClass().getSimpleName()}));
    }

    public void onResumeStep() {
        BluetoothLog.m7332v(String.format("%s.onResumeStep", new Object[]{getClass().getSimpleName()}));
    }
}
