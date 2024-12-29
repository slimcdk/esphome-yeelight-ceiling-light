package com.miot.service.connection.wifi.step;

import android.content.Context;
import android.os.Message;
import android.os.RemoteException;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.miot.api.ICompletionHandler;
import com.miot.service.C3602R;
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
        this.mIcon = (ImageView) view.findViewById(C3602R.C3604id.smart_config_common_icon);
        this.mNextButton = (Button) view.findViewById(C3602R.C3604id.next_btn);
    }

    public void onCreateStep(Context context) {
        setContentView(context, C3602R.layout.smart_config_success_ui);
        this.mIcon.setImageResource(C3602R.C3603drawable.kuailian_success_icon);
        this.mNextButton.setText(C3602R.string.common_complete);
        this.mNextButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                SuccessStep.this.finishSmartConfig(true);
                ICompletionHandler iCompletionHandler = (ICompletionHandler) SmartConfigDataProvider.getInstance().get(SmartConfigDataProvider.KEY_HANDLER);
                if (iCompletionHandler != null) {
                    try {
                        iCompletionHandler.onSucceed();
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
