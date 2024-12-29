package com.miot.service.connection.wifi.step;

import android.content.Context;
import android.os.Message;
import android.os.RemoteException;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.miot.api.IConfigHandler;
import com.miot.service.C2875R;
import com.miot.service.connection.wifi.SmartConfigDataProvider;
import com.miot.service.connection.wifi.step.SmartConfigStep;
import java.util.List;

public class SuccessStep extends SmartConfigStep {
    boolean mExpanded = false;
    private ImageView mIcon;
    private Button mNextButton;
    List<String> mTagStringList;

    public SmartConfigStep.Step getStep() {
        return SmartConfigStep.Step.STEP_SUCCESS;
    }

    public void handleMessage(Message message) {
    }

    /* access modifiers changed from: protected */
    public void initView(View view) {
        this.mIcon = (ImageView) view.findViewById(C2875R.C2877id.smart_config_common_icon);
        this.mNextButton = (Button) view.findViewById(C2875R.C2877id.next_btn);
    }

    public void onCreateStep(Context context) {
        setContentView(context, C2875R.layout.smart_config_success_ui);
        this.mIcon.setImageResource(C2875R.C2876drawable.kuailian_success_icon);
        this.mNextButton.setText(C2875R.string.common_complete);
        this.mNextButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                SuccessStep.this.finishSmartConfig(true);
                IConfigHandler iConfigHandler = (IConfigHandler) SmartConfigDataProvider.getInstance().get(SmartConfigDataProvider.KEY_HANDLER);
                if (iConfigHandler != null) {
                    try {
                        iConfigHandler.onSucceed((String) SmartConfigDataProvider.getInstance().get(SmartConfigDataProvider.KEY_DEVICE_ID));
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
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
