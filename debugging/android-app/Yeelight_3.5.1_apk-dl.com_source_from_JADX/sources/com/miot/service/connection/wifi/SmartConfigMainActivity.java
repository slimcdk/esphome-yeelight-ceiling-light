package com.miot.service.connection.wifi;

import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.miot.api.IConfigHandler;
import com.miot.service.C2875R;
import com.miot.service.connection.BinderParcel;
import com.miot.service.connection.wifi.stage.ConfigStage;
import com.miot.service.connection.wifi.step.SmartConfigStep;
import com.miot.service.log.MyLogger;
import com.miot.service.view.TitleBarUtil;
import java.util.GregorianCalendar;
import java.util.Stack;
import java.util.concurrent.TimeUnit;

public class SmartConfigMainActivity extends Activity {
    public static final String EXTRA_PEOPLE = "people";
    private static final String TAG = "SmartConfActivity";
    /* access modifiers changed from: private */
    public SmartConfigStep.Step mConfigStep;
    private FrameLayout mContainer;
    /* access modifiers changed from: private */
    public Handler mHandler = new Handler() {
        public void handleMessage(Message message) {
            if (!SmartConfigMainActivity.this.mStepStack.empty()) {
                ((SmartConfigStep) SmartConfigMainActivity.this.mStepStack.peek()).handleMessage(message);
            }
        }
    };
    SmartConfigStep.StepListener mListener = new SmartConfigStep.StepListener() {
        public Handler getHandler() {
            return SmartConfigMainActivity.this.mHandler;
        }

        public void onCurrentStepFinish() {
            if (!SmartConfigMainActivity.this.mStepStack.isEmpty()) {
                SmartConfigMainActivity.this.mStepStack.pop();
            }
            if (SmartConfigMainActivity.this.mStepStack.empty()) {
                SmartConfigMainActivity smartConfigMainActivity = SmartConfigMainActivity.this;
                smartConfigMainActivity.switchToStep(smartConfigMainActivity.mConfigStep);
                SmartConfigStep.Step unused = SmartConfigMainActivity.this.mConfigStep = null;
                return;
            }
            SmartConfigMainActivity smartConfigMainActivity2 = SmartConfigMainActivity.this;
            smartConfigMainActivity2.resumeStep((SmartConfigStep) smartConfigMainActivity2.mStepStack.peek());
        }

        public void onCurrentStepFinish(SmartConfigStep.Step step, SmartConfigStep.Step step2) {
            MyLogger instance = MyLogger.getInstance();
            instance.log(SmartConfigMainActivity.TAG, "onCurrentStepFinish, current: " + step + ", next: " + step2);
            if (!SmartConfigMainActivity.this.mStepStack.isEmpty()) {
                SmartConfigMainActivity.this.mStepStack.pop();
            }
            SmartConfigMainActivity.this.switchToStep(step2);
        }

        public void onCurrentStepPause(SmartConfigStep.Step step, SmartConfigStep.Step step2) {
            MyLogger instance = MyLogger.getInstance();
            instance.log(SmartConfigMainActivity.TAG, "onCurrentStepPause, current: " + step + ", next: " + step2);
            SmartConfigMainActivity.this.switchToStep(step2);
        }

        public void onFinishSmartConfig(boolean z) {
            if (!SmartConfigMainActivity.this.mStepStack.isEmpty()) {
                SmartConfigMainActivity.this.mStepStack.pop();
            }
            Intent intent = new Intent();
            intent.putExtra("finish", z);
            SmartConfigMainActivity.this.setResult(-1, intent);
            SmartConfigMainActivity.this.finish();
        }
    };
    private Dialog mLoginDialog;
    private BroadcastReceiver mReceiver = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            Handler access$200;
            int i;
            String action = intent.getAction();
            MyLogger instance = MyLogger.getInstance();
            instance.log(SmartConfigMainActivity.TAG, "mReceiver, getAction: " + action);
            if (action.equals("android.net.wifi.SCAN_RESULTS")) {
                access$200 = SmartConfigMainActivity.this.mHandler;
                i = 100;
            } else if (action.equals("android.net.wifi.STATE_CHANGE")) {
                Parcelable parcelableExtra = intent.getParcelableExtra("networkInfo");
                if (parcelableExtra != null) {
                    Message message = new Message();
                    message.what = 101;
                    message.obj = (NetworkInfo) parcelableExtra;
                    SmartConfigMainActivity.this.mHandler.sendMessage(message);
                    return;
                }
                return;
            } else if (action.equals("android.net.wifi.WIFI_STATE_CHANGED")) {
                access$200 = SmartConfigMainActivity.this.mHandler;
                i = 102;
            } else {
                return;
            }
            access$200.sendEmptyMessage(i);
        }
    };
    private boolean mResumeStrategy = false;
    /* access modifiers changed from: private */
    public Stack<SmartConfigStep> mStepStack = new Stack<>();
    private int mStrategyIndex;

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.mStepStack.isEmpty()) {
            this.mStepStack.peek().onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        if (!(!this.mStepStack.isEmpty() ? this.mStepStack.peek().onBackPressed() : false)) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TitleBarUtil.enableTranslucentStatus((Activity) this);
        setContentView(C2875R.layout.smart_config_main_layout);
        this.mContainer = (FrameLayout) findViewById(C2875R.C2877id.main_container);
        prepareConfigData();
        registerListener();
        startFirstPage();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        Object obj;
        MyLogger.getInstance().log(TAG, "onDestroy!");
        super.onDestroy();
        unregisterListener();
        while (!this.mStepStack.isEmpty()) {
            this.mStepStack.pop().destoryCurrentStep();
        }
        if (this.mStrategyIndex == 7 && (obj = SmartConfigDataProvider.getInstance().get(SmartConfigDataProvider.KEY_HANDLER)) != null) {
            try {
                ((IConfigHandler) obj).onSucceed((String) SmartConfigDataProvider.getInstance().get(SmartConfigDataProvider.KEY_DEVICE_ID));
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
    }

    /* access modifiers changed from: package-private */
    public void prepareConfigData() {
        Intent intent = getIntent();
        if (intent != null) {
            this.mResumeStrategy = intent.getBooleanExtra("resume_strategy", false);
            SmartConfigDataProvider.getInstance().set(SmartConfigDataProvider.KEY_GOTO_TO_ERROR_PAGE, Boolean.valueOf(intent.getBooleanExtra(SmartConfigDataProvider.KEY_GOTO_TO_ERROR_PAGE, false)));
            this.mStrategyIndex = intent.getIntExtra("strategy_id", -1);
            if (!this.mResumeStrategy) {
                SmartConfigDataProvider.getInstance().clear();
                SmartConfigDataProvider.getInstance().set("people", getIntent().getParcelableExtra("people"));
                SmartConfigDataProvider.getInstance().set(SmartConfigDataProvider.KEY_DEVICE_AP, intent.getParcelableExtra("scanResult"));
                SmartConfigDataProvider.getInstance().set(SmartConfigDataProvider.KEY_DEVICE_NAME, intent.getStringExtra("name"));
                SmartConfigDataProvider.getInstance().set(SmartConfigDataProvider.KEY_DEVICE_MODEL, intent.getStringExtra("model"));
                SmartConfigDataProvider.getInstance().set(SmartConfigDataProvider.KEY_TARGET_AP_BSSID, intent.getStringExtra("bssid"));
                SmartConfigDataProvider.getInstance().set(SmartConfigDataProvider.KEY_TARGET_AP_PASSWD, intent.getStringExtra("password"));
                SmartConfigDataProvider.getInstance().set(SmartConfigDataProvider.KEY_WIFI_SSID, intent.getStringExtra("ssid"));
                SmartConfigDataProvider.getInstance().set(SmartConfigDataProvider.KEY_WIFI_BSSID, intent.getStringExtra("bssid"));
                BinderParcel binderParcel = (BinderParcel) intent.getParcelableExtra(SmartConfigDataProvider.KEY_HANDLER);
                if (binderParcel != null) {
                    MyLogger.getInstance().log(TAG, "bind handler is not null!");
                    SmartConfigDataProvider.getInstance().set(SmartConfigDataProvider.KEY_HANDLER, IConfigHandler.Stub.asInterface(binderParcel.getBinder()));
                }
                SmartConfigDataProvider.getInstance().set(SmartConfigDataProvider.KEY_SCAN_QR_CODE, intent.getStringExtra(SmartConfigDataProvider.KEY_SCAN_QR_CODE));
                if (this.mStrategyIndex == -1) {
                    finish();
                    return;
                }
                SmartConfigDataProvider.getInstance().set(SmartConfigDataProvider.KEY_TIME_GMT_OFFSET, Integer.valueOf((int) TimeUnit.SECONDS.convert((long) new GregorianCalendar().getTimeZone().getRawOffset(), TimeUnit.MILLISECONDS)));
                SmartConfigDataProvider.getInstance().set(SmartConfigDataProvider.KEY_SCAN_QR_MODEL, intent.getStringExtra("scan_device_model"));
                return;
            }
            return;
        }
        finish();
    }

    /* access modifiers changed from: package-private */
    public void registerListener() {
        registerReceiver(this.mReceiver, new IntentFilter("android.net.wifi.SCAN_RESULTS"));
        registerReceiver(this.mReceiver, new IntentFilter("android.net.wifi.STATE_CHANGE"));
        registerReceiver(this.mReceiver, new IntentFilter("android.net.wifi.WIFI_STATE_CHANGED"));
    }

    /* access modifiers changed from: package-private */
    public void resumeStep(SmartConfigStep smartConfigStep) {
        MyLogger instance = MyLogger.getInstance();
        instance.log(TAG, "resumeStep, step: " + smartConfigStep);
        this.mContainer.removeAllViews();
        smartConfigStep.resumeCurrentStep();
        if (smartConfigStep.getView() != null) {
            this.mContainer.addView(smartConfigStep.getView());
        }
    }

    /* access modifiers changed from: package-private */
    public void startFirstPage() {
        SmartConfigStep.Step prepareStage;
        MyLogger instance = MyLogger.getInstance();
        instance.log(TAG, "mResumeStrategy = " + this.mResumeStrategy + ", mStrategyIndex = " + this.mStrategyIndex);
        if (this.mResumeStrategy) {
            switchToStep(ConfigStage.getConfigStage(this.mStrategyIndex));
            return;
        }
        this.mConfigStep = ConfigStage.getConfigStage(this.mStrategyIndex);
        int i = this.mStrategyIndex;
        if (i == 7) {
            this.mConfigStep = null;
            prepareStage = SmartConfigStep.Step.STEP_CHOOSE_WIFI_ONLY;
        } else if (ConfigStage.getNeedWifiPasswd(i)) {
            SmartConfigDataProvider instance2 = SmartConfigDataProvider.getInstance();
            Boolean bool = Boolean.FALSE;
            prepareStage = ((Boolean) instance2.get(SmartConfigDataProvider.KEY_USE_QR_CODE, bool)).booleanValue() ? SmartConfigStep.Step.STEP_DEVICE_INFO : ((Boolean) SmartConfigDataProvider.getInstance().get(SmartConfigDataProvider.KEY_IS_MI_WIFI_IN_DEVICE_LIST, bool)).booleanValue() ? SmartConfigStep.Step.STEP_GET_ROUTER_INFO : SmartConfigStep.Step.STEP_CHOOSE_WIFI;
        } else if (ConfigStage.getPrepareStage(this.mStrategyIndex) != null) {
            prepareStage = ConfigStage.getPrepareStage(this.mStrategyIndex);
        } else if (ConfigStage.getConfigStage(this.mStrategyIndex) != null) {
            switchToStep(this.mConfigStep);
            this.mConfigStep = null;
            return;
        } else {
            finish();
            return;
        }
        switchToStep(prepareStage);
    }

    /* access modifiers changed from: package-private */
    public void switchToStep(SmartConfigStep.Step step) {
        MyLogger instance = MyLogger.getInstance();
        instance.log(TAG, "switchToStep, step: " + step);
        if (step == null) {
            finish();
            return;
        }
        this.mContainer.removeAllViews();
        SmartConfigStep createNewStep = SmartConfigStep.createNewStep(step);
        if (createNewStep != null) {
            createNewStep.registerListener(this.mListener);
            createNewStep.createCurrentStep(this);
            if (createNewStep.getView() != null) {
                this.mContainer.addView(createNewStep.getView());
                this.mStepStack.push(createNewStep);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void unregisterListener() {
        unregisterReceiver(this.mReceiver);
    }
}
