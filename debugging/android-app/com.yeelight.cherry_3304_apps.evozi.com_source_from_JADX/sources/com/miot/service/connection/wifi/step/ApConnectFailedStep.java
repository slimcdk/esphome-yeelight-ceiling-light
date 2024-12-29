package com.miot.service.connection.wifi.step;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.ScanResult;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Message;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.miot.service.C3602R;
import com.miot.service.connection.wifi.ConnectionUtils;
import com.miot.service.connection.wifi.SmartConfigDataProvider;
import com.miot.service.connection.wifi.step.SmartConfigStep;

public class ApConnectFailedStep extends SmartConfigStep {
    public static final int REQUESR_CODE_SYSTEM_CHECKWIFI = 102;
    private View mBottomContainer;
    private TextView mCurrentWifi;
    private ImageView mIcon;
    private TextView mInfo;
    private TextView mInfoSubTitle;
    private TextView mLeftBtn;
    private View mMainIconContainer;
    private TextView mManualIcon;
    private TextView mManualText;
    private View mManualView;
    private TextView mRightBtn;
    private Button mSettingWifiBtn;
    private TextView mSwitchSysSetting;

    private void checkConnect() {
        WifiManager wifiManager = (WifiManager) this.mContext.getApplicationContext().getSystemService("wifi");
        if (wifiManager != null) {
            WifiInfo connectionInfo = wifiManager.getConnectionInfo();
            "WifiState" + connectionInfo;
            if (connectionInfo != null && !TextUtils.isEmpty(connectionInfo.getSSID()) && !connectionInfo.getSSID().contains("<unknown ssid>") && connectionInfo.getSupplicantState() == SupplicantState.COMPLETED && ConnectionUtils.isEqualWifi(connectionInfo.getSSID(), ((ScanResult) SmartConfigDataProvider.getInstance().get(SmartConfigDataProvider.KEY_DEVICE_AP)).SSID)) {
                finishCurrentStep();
            }
        }
    }

    public SmartConfigStep.Step getStep() {
        return SmartConfigStep.Step.STEP_CONNECT_AP_ERROR;
    }

    public void handleMessage(Message message) {
        if (message.what == 101) {
            checkConnect();
        }
    }

    /* access modifiers changed from: protected */
    public void initView(View view) {
        this.mMainIconContainer = view.findViewById(C3602R.C3604id.base_ui_main_icon);
        this.mIcon = (ImageView) view.findViewById(C3602R.C3604id.smart_config_common_icon);
        this.mInfo = (TextView) view.findViewById(C3602R.C3604id.smart_config_common_main_title);
        this.mInfoSubTitle = (TextView) view.findViewById(C3602R.C3604id.smart_config_common_main_sub_title);
        this.mBottomContainer = view.findViewById(C3602R.C3604id.bottom_btn_container);
        this.mManualView = view.findViewById(C3602R.C3604id.base_ui_connect_manually);
        this.mManualText = (TextView) view.findViewById(C3602R.C3604id.manual_text);
        this.mSwitchSysSetting = (TextView) view.findViewById(C3602R.C3604id.switch_system_setting_btn);
        this.mLeftBtn = (TextView) view.findViewById(C3602R.C3604id.left_btn);
        this.mRightBtn = (TextView) view.findViewById(C3602R.C3604id.right_btn);
        this.mSettingWifiBtn = (Button) view.findViewById(C3602R.C3604id.next_btn);
        this.mManualIcon = (TextView) view.findViewById(C3602R.C3604id.manual_connect_icon);
        this.mCurrentWifi = (TextView) view.findViewById(C3602R.C3604id.current_connected_wifi);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 102) {
            checkConnect();
        }
    }

    public boolean onBackPressed() {
        finishSmartConfig(false);
        return true;
    }

    public void onCreateStep(Context context) {
        setContentView(context, C3602R.layout.smart_config_connect_ap_failed_ui);
        switchToFirstPage();
    }

    public void onFinishStep() {
    }

    public void onPauseStep() {
    }

    public void onResumeStep() {
    }

    /* access modifiers changed from: package-private */
    public void switchToFirstPage() {
        this.mMainIconContainer.setVisibility(0);
        this.mBottomContainer.setVisibility(0);
        this.mSettingWifiBtn.setVisibility(8);
        this.mManualView.setVisibility(8);
        this.mSwitchSysSetting.setVisibility(0);
        this.mIcon.setImageResource(C3602R.C3603drawable.config_failed_unable_connect);
        this.mInfo.setText(C3602R.string.smart_config_failed_connect_ap);
        this.mInfoSubTitle.setText(C3602R.string.smart_config_failed_connect_ap_solution);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(this.mContext.getString(C3602R.string.switch_router_manually));
        valueOf.setSpan(new ClickableSpan() {
            public void onClick(View view) {
                ApConnectFailedStep.this.switchToSettingHint();
            }

            public void updateDrawState(TextPaint textPaint) {
                textPaint.setColor(ApConnectFailedStep.this.mContext.getResources().getColor(C3602R.color.class_text_27));
                textPaint.setUnderlineText(true);
            }
        }, 0, valueOf.length(), 33);
        this.mSwitchSysSetting.setText(valueOf);
        this.mSwitchSysSetting.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ApConnectFailedStep.this.switchToSettingHint();
            }
        });
        this.mLeftBtn.setText(C3602R.string.cancel);
        this.mLeftBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ApConnectFailedStep.this.finishSmartConfig(true);
            }
        });
        this.mRightBtn.setText(C3602R.string.common_retry);
        this.mRightBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ApConnectFailedStep.this.finishCurrentStep();
            }
        });
        switchToSettingHint();
    }

    /* access modifiers changed from: package-private */
    public void switchToSettingHint() {
        if (this.mContext != null) {
            this.mMainIconContainer.setVisibility(8);
            this.mBottomContainer.setVisibility(8);
            this.mManualView.setVisibility(0);
            this.mSwitchSysSetting.setVisibility(8);
            this.mSettingWifiBtn.setVisibility(0);
            this.mSettingWifiBtn.setText(C3602R.string.smart_config_set_wifi_btn);
            WifiInfo connectionInfo = ((WifiManager) this.mContext.getSystemService("wifi")).getConnectionInfo();
            if (connectionInfo != null && !TextUtils.isEmpty(connectionInfo.getSSID())) {
                this.mCurrentWifi.setVisibility(0);
                "wifiInfo.getSSID(): " + connectionInfo.getSSID();
                this.mCurrentWifi.setText(String.format(this.mContext.getString(C3602R.string.smart_config_current_wifi), new Object[]{connectionInfo.getSSID()}));
            }
            Context applicationContext = this.mContext.getApplicationContext();
            String charSequence = this.mContext.getText(C3602R.string.mijia_app_name).toString();
            if (applicationContext != null) {
                charSequence = applicationContext.getPackageManager().getApplicationLabel(applicationContext.getApplicationInfo()).toString();
            }
            String str = ((ScanResult) SmartConfigDataProvider.getInstance().get(SmartConfigDataProvider.KEY_DEVICE_AP)).SSID;
            String format = String.format(this.mContext.getText(C3602R.string.smart_config_manual_text).toString(), new Object[]{str, charSequence});
            this.mManualIcon.setText(str);
            this.mManualText.setText(format);
            this.mSettingWifiBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent();
                    intent.setAction("android.net.wifi.PICK_WIFI_NETWORK");
                    ((Activity) ApConnectFailedStep.this.mContext).startActivityForResult(intent, 102);
                }
            });
        }
    }
}
