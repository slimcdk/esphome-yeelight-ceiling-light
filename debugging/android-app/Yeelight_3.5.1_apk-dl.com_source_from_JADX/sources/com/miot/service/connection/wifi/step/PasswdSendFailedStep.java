package com.miot.service.connection.wifi.step;

import android.content.Context;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.miot.service.C2875R;
import com.miot.service.connection.wifi.SmartConfigDataProvider;
import com.miot.service.connection.wifi.step.SmartConfigStep;

public class PasswdSendFailedStep extends SmartConfigStep {
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
        this.mIcon = (ImageView) view.findViewById(C2875R.C2877id.smart_config_common_icon);
        this.mMainTitle = (TextView) view.findViewById(C2875R.C2877id.smart_config_common_main_title);
        this.mSubMainTitle = (TextView) view.findViewById(C2875R.C2877id.smart_config_common_main_sub_title);
        this.mLeftBtn = (TextView) view.findViewById(C2875R.C2877id.left_btn);
        this.mRightBtn = (TextView) view.findViewById(C2875R.C2877id.right_btn);
    }

    public void onCreateStep(Context context) {
        setContentView(context, C2875R.layout.smart_config_base_left_right_ui);
        this.mIcon.setImageResource(C2875R.C2876drawable.config_failed_disconnect);
        this.mMainTitle.setText(C2875R.string.smart_config_passwd_failed);
        this.mSubMainTitle.setText(C2875R.string.smart_config_passwd_failed_sub_title);
        this.mLeftBtn.setText(C2875R.string.cancel);
        this.mLeftBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                PasswdSendFailedStep.this.finishSmartConfig(true);
            }
        });
        this.mRightBtn.setText(C2875R.string.common_retry);
        this.mRightBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                SmartConfigDataProvider.getInstance().set(SmartConfigDataProvider.KEY_SEND_PASSWD_SUCCESS, Boolean.FALSE);
                PasswdSendFailedStep.this.finishCurrentStep();
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
