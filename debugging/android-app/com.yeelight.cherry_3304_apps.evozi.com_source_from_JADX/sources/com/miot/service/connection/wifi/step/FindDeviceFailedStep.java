package com.miot.service.connection.wifi.step;

import android.content.Context;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.miot.service.C3602R;
import com.miot.service.connection.wifi.step.SmartConfigStep;

public class FindDeviceFailedStep extends SmartConfigStep {
    private ImageView mIcon;
    private TextView mLeftBtn;
    private TextView mMainTitle;
    private TextView mRightBtn;
    private TextView mSubMainTitle;

    public SmartConfigStep.Step getStep() {
        return SmartConfigStep.Step.STEP_SEND_ROUTER_INFO_ERROR;
    }

    public void handleMessage(Message message) {
    }

    /* access modifiers changed from: protected */
    public void initView(View view) {
        this.mIcon = (ImageView) view.findViewById(C3602R.C3604id.smart_config_common_icon);
        this.mMainTitle = (TextView) view.findViewById(C3602R.C3604id.smart_config_common_main_title);
        this.mSubMainTitle = (TextView) view.findViewById(C3602R.C3604id.smart_config_common_main_sub_title);
        this.mLeftBtn = (TextView) view.findViewById(C3602R.C3604id.left_btn);
        this.mRightBtn = (TextView) view.findViewById(C3602R.C3604id.right_btn);
    }

    public void onCreateStep(Context context) {
        setContentView(context, C3602R.layout.smart_config_base_left_right_ui);
        this.mIcon.setImageResource(C3602R.C3603drawable.config_failed_timeout);
        this.mMainTitle.setText(C3602R.string.smart_config_connect_timeout_first);
        this.mSubMainTitle.setText(C3602R.string.smart_config_find_new_device_error);
        this.mLeftBtn.setText(C3602R.string.cancel);
        this.mLeftBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                FindDeviceFailedStep.this.finishSmartConfig(true);
            }
        });
        this.mRightBtn.setText(C3602R.string.common_retry);
        this.mRightBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                FindDeviceFailedStep.this.finishCurrentStep();
            }
        });
    }

    public void onFinishStep() {
    }

    public void onPauseStep() {
    }

    public void onResumeStep() {
    }
}
