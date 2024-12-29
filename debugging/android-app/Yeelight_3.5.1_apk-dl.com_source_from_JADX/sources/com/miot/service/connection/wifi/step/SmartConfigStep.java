package com.miot.service.connection.wifi.step;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

public abstract class SmartConfigStep {
    public static final int CONNECTING_TIME_OUT = 103;
    public static final int CONNECTION_RESULT = 106;
    public static final int MSG_BLE_NOTIFY_TIME_OUT = 127;
    public static final int MSG_CONFIG_STAGE_SUCCESS = 111;
    public static final int MSG_CONNECT_BLE_TIME_OUT = 125;
    public static final int MSG_DISCONNECT_TIME_OUT = 115;
    public static final int MSG_DOWNLOAD_TIME_OUT = 118;
    public static final int MSG_GEN_CODE = 120;
    public static final int MSG_GEN_REFRES_UI = 121;
    public static final int MSG_GET_DEVICE_MODEL = 124;
    public static final int MSG_GET_ROUTER_INFO_TIME_OUT = 116;
    public static final int MSG_RECONNECT_DEVICE_AP = 123;
    public static final int MSG_RESEND_LAP_BIND_DEVICE = 126;
    public static final int MSG_SEND_DEVICE_MSG = 114;
    public static final int MSG_SMART_CONFIG_STAGE_TIMEOUT = 110;
    public static final int MSG_START_NETWORK_TEST = 109;
    public static final int MSG_UPDATE_CHECKOUT = 122;
    public static final int MSG_UPDATE_CONFIRM_STATE = 113;
    public static final int MSG_UPDATE_DEVICE_STATE = 112;
    public static final int MSG_UPDATE_RESCAN_DEVICE_STATE = 119;
    public static final int MSG_UPDATE_ROUTER_PROGRESS_STATE = 117;
    public static final int NETWORK_STATE_CHANGED = 101;
    public static final int REQUEST_LAYOUT = 107;
    public static final int SCAN_RESULT_AVAILABLE = 100;
    public static final int SCAN_TIME_OUT = 104;
    public static final int WIFI_CONNECTION_DELAY = 108;
    public static final int WIFI_STATE_CHANGED = 102;
    private static HashMap<Step, Class> mStepClassMap;
    protected Context mContext;
    protected boolean mIsFinished = false;
    protected boolean mIsPaused = false;
    private StepListener mListener;
    protected View mRootView;
    protected Handler mWorkHandler;
    protected HandlerThread mWorkHandlerThread;

    public enum Step {
        STEP_DEVICE_INFO,
        STEP_GET_ROUTER_INFO,
        STEP_CHOOSE_WIFI,
        STEP_CHOOSE_WIFI_ONLY,
        STEP_SMART_CONFIG_STEP,
        STEP_MULTICAST_CONFIG_STEP,
        STEP_AP_CONFIG_STEP,
        STEP_CONNECT_AP_ERROR,
        STEP_SEND_ROUTER_INFO_ERROR,
        STEP_CONNECT_SELECTED_AP_FAILED,
        STEP_FIND_DEVICE_FAILED,
        STEP_SUCCESS,
        STEP_QR_SCAN,
        STEP_QR_CONFIG,
        STEP_QR_HELP,
        STEP_NBIOT,
        STEP_SCAN_QR,
        STEP_PREPARE_SCAN_QR,
        STEP_SCAN_QR_FAIL_BIND,
        STEP_SCAN_QR_FAIL_FIND,
        STEP_BLE_COMBO_CONFIG,
        STEP_AP_DEVICE_CONFIG_PASSWD_CHOOSER,
        STEP_AP_DEVICE_CONFIG_STEP,
        STEP_BLE_PWD_ERROR,
        STEP_BLE_ERROR
    }

    public interface StepListener {
        Handler getHandler();

        void onCurrentStepFinish();

        void onCurrentStepFinish(Step step, Step step2);

        void onCurrentStepPause(Step step, Step step2);

        void onFinishSmartConfig(boolean z);
    }

    static {
        HashMap<Step, Class> hashMap = new HashMap<>();
        mStepClassMap = hashMap;
        hashMap.put(Step.STEP_CHOOSE_WIFI, ChooseWifiStepV2.class);
        mStepClassMap.put(Step.STEP_CHOOSE_WIFI_ONLY, ChooseWifiStepOnly.class);
        mStepClassMap.put(Step.STEP_AP_CONFIG_STEP, ApConfigStep.class);
        mStepClassMap.put(Step.STEP_CONNECT_AP_ERROR, ApConnectFailedStep.class);
        mStepClassMap.put(Step.STEP_SEND_ROUTER_INFO_ERROR, PasswdSendFailedStep.class);
        mStepClassMap.put(Step.STEP_CONNECT_SELECTED_AP_FAILED, ConnectSelectApFailedStep.class);
        mStepClassMap.put(Step.STEP_FIND_DEVICE_FAILED, FindDeviceFailedStep.class);
        mStepClassMap.put(Step.STEP_SUCCESS, SuccessStep.class);
        mStepClassMap.put(Step.STEP_BLE_COMBO_CONFIG, BleComboStep.class);
        mStepClassMap.put(Step.STEP_BLE_PWD_ERROR, BlePwdErrorStep.class);
        mStepClassMap.put(Step.STEP_BLE_ERROR, BleErrorStep.class);
        mStepClassMap.put(Step.STEP_NBIOT, NbiotStep.class);
    }

    public static SmartConfigStep createNewStep(Step step) {
        Class cls = mStepClassMap.get(step);
        if (cls == null) {
            return null;
        }
        try {
            return (SmartConfigStep) cls.newInstance();
        } catch (IllegalAccessException | InstantiationException unused) {
            return null;
        }
    }

    public void createCurrentStep(Context context) {
        this.mIsFinished = false;
        this.mIsPaused = false;
        this.mContext = context;
        onCreateStep(context);
    }

    public void destoryCurrentStep() {
        if (!this.mIsFinished) {
            this.mIsPaused = true;
            this.mIsFinished = true;
            onFinishStep();
            unregisterListener();
            this.mContext = null;
        }
    }

    /* access modifiers changed from: protected */
    public void finishCurrentStep() {
        if (!this.mIsFinished) {
            this.mIsPaused = true;
            this.mIsFinished = true;
            onFinishStep();
            this.mContext = null;
            this.mListener.onCurrentStepFinish();
            unregisterListener();
        }
    }

    /* access modifiers changed from: protected */
    public void finishCurrentStep(Step step) {
        if (!this.mIsFinished) {
            this.mIsPaused = true;
            this.mIsFinished = true;
            onFinishStep();
            this.mContext = null;
            this.mListener.onCurrentStepFinish(getStep(), step);
            unregisterListener();
        }
    }

    /* access modifiers changed from: protected */
    public void finishSmartConfig(boolean z) {
        if (!this.mIsFinished) {
            this.mIsPaused = true;
            this.mIsFinished = true;
            onFinishStep();
            this.mContext = null;
            this.mListener.onFinishSmartConfig(z);
            unregisterListener();
        }
    }

    public Handler getHandler() {
        StepListener stepListener = this.mListener;
        if (stepListener != null) {
            return stepListener.getHandler();
        }
        return null;
    }

    public abstract Step getStep();

    public View getView() {
        return this.mRootView;
    }

    public Handler getWorkHandler() {
        if (this.mWorkHandler == null) {
            HandlerThread handlerThread = new HandlerThread("config_handler_thread");
            this.mWorkHandlerThread = handlerThread;
            handlerThread.start();
            this.mWorkHandler = new Handler(this.mWorkHandlerThread.getLooper());
        }
        return this.mWorkHandler;
    }

    public abstract void handleMessage(Message message);

    /* access modifiers changed from: protected */
    public abstract void initView(View view);

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public boolean onBackPressed() {
        return false;
    }

    public abstract void onCreateStep(Context context);

    public abstract void onFinishStep();

    public abstract void onPauseStep();

    public abstract void onResumeStep();

    public void pauseCurrentStep(Step step) {
        if (!this.mIsPaused) {
            this.mIsPaused = true;
            onPauseStep();
            this.mListener.onCurrentStepPause(getStep(), step);
        }
    }

    public void registerListener(StepListener stepListener) {
        this.mListener = stepListener;
    }

    public void resumeCurrentStep() {
        this.mIsPaused = false;
        onResumeStep();
    }

    /* access modifiers changed from: protected */
    public void setContentView(Context context, int i) {
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) null);
        this.mRootView = inflate;
        initView(inflate);
    }

    public void unregisterListener() {
        this.mListener = null;
    }
}
