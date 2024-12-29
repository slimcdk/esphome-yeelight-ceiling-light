package com.miot.service.connection.wifi.step;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.miot.service.C3602R;
import com.miot.service.common.widget.PieProgressBar;
import com.miot.service.connection.wifi.QConnectCallback;
import com.miot.service.connection.wifi.step.SmartConfigStep;
import com.miot.service.log.MyLogger;
import com.miot.service.manager.discovery.impl.MiotWanDevice;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public abstract class ConfigStep extends SmartConfigStep {
    private static final int MSG_INVALIDATE = 1000;
    private static final String TAG = "ConfigStep";
    private long mAnimStartTime = 0;
    private long mAnimTotalTime = 0;
    protected QConnectCallback mApNetworkCallback;
    protected TextView mBarText;
    protected String mBindkey;
    protected long mConfigStartTime = 0;
    private List<ConfigTime> mConfigTimeList = new ArrayList();
    protected ConnectivityManager mConnectivityManager;
    private int mCurStepStartTime = 0;
    protected boolean mDownloadAfterConfig = false;
    private long mDuring = 0;
    private int mEndPercent = 0;
    private Queue<ConfigTime> mLeftConfigStepList = new LinkedList();
    private Queue<Integer> mLeftPercentList = new LinkedList();
    protected TextView mMainSubTitle;
    protected TextView mMainTitle;
    protected Button mNextButton;
    private long mOriginAnimStartTime = 0;
    protected PieProgressBar mProgressBar;
    protected View mProgressContainer;
    private int mStartPercent = 0;
    private long mStartTime = 0;
    protected WifiManager mWifiManager;

    public static class ConfigTime {
        int index;
        int startPercent = -1;
        long time;
    }

    public interface DeviceFinderCallback {
        void onDeviceConnectionBind(MiotWanDevice miotWanDevice);

        void onDeviceConnectionFailure();

        void onDeviceConnectionSuccess(MiotWanDevice miotWanDevice);
    }

    private void startAnimation(int i, int i2, long j) {
        this.mStartTime = System.currentTimeMillis();
        this.mStartPercent = i;
        this.mEndPercent = i2;
        this.mDuring = j;
        getHandler().sendEmptyMessage(1000);
    }

    private void startConfig() {
        this.mCurStepStartTime = 0;
        this.mProgressBar.setPercentView(this.mBarText);
        int currentStageIndex = getCurrentStageIndex();
        if (currentStageIndex != -1) {
            while (!this.mLeftConfigStepList.isEmpty() && this.mLeftConfigStepList.peek().index != currentStageIndex) {
                this.mLeftConfigStepList.poll();
                this.mCurStepStartTime = this.mLeftPercentList.poll().intValue();
            }
            int i = this.mCurStepStartTime;
            if (this.mLeftConfigStepList.peek().startPercent != -1) {
                i = this.mLeftConfigStepList.peek().startPercent;
            }
            startAnimation(i, this.mLeftPercentList.peek().intValue(), this.mLeftConfigStepList.peek().time);
            startConnection(currentStageIndex);
            if (getHandler() != null) {
                getHandler().sendEmptyMessageDelayed(110, this.mLeftConfigStepList.peek().time);
            }
            setMainTitle(this.mMainTitle);
            setSubMainTitle(this.mMainSubTitle);
        }
    }

    public abstract ArrayList<ConfigTime> getAllConfigStages();

    public abstract int getCurrentStageIndex();

    public void handleMessage(Message message) {
        MyLogger instance = MyLogger.getInstance();
        instance.log(TAG, "handleMessage, msg.what = " + message.what);
        int i = message.what;
        if (i != 110) {
            if (i == 111) {
                if (!this.mLeftPercentList.isEmpty()) {
                    this.mCurStepStartTime = this.mLeftPercentList.poll().intValue();
                    this.mLeftConfigStepList.poll();
                }
                if ((this.mLeftPercentList.size() != 0 || !this.mDownloadAfterConfig) && this.mLeftPercentList.size() != 0) {
                    startAnimation((int) this.mProgressBar.getPercent(), this.mLeftPercentList.peek().intValue(), this.mLeftConfigStepList.peek().time);
                    getHandler().sendEmptyMessageDelayed(110, this.mLeftConfigStepList.peek().time);
                    setMainTitle(this.mMainTitle);
                    setSubMainTitle(this.mMainSubTitle);
                    return;
                }
            } else if (i != 118) {
                if (i == 1000) {
                    if (this.mDuring == 0) {
                        this.mProgressBar.setPercent((float) this.mEndPercent);
                        return;
                    }
                    int i2 = this.mStartPercent;
                    int currentTimeMillis = (int) (((long) i2) + ((((long) (this.mEndPercent - i2)) * (System.currentTimeMillis() - this.mStartTime)) / this.mDuring));
                    int i3 = this.mEndPercent;
                    if (currentTimeMillis >= i3) {
                        this.mProgressBar.setPercent((float) i3);
                    } else {
                        this.mProgressBar.setPercent((float) currentTimeMillis);
                    }
                    getHandler().sendEmptyMessageDelayed(1000, 100);
                    return;
                }
                return;
            }
            finishCurrentStep(SmartConfigStep.Step.STEP_SUCCESS);
            return;
        }
        pauseCurrentStep(onStageTimeOut(this.mLeftConfigStepList.element().index));
    }

    /* access modifiers changed from: protected */
    public void initView(View view) {
        this.mProgressContainer = view.findViewById(C3602R.C3604id.base_ui_progress);
        this.mProgressBar = (PieProgressBar) view.findViewById(C3602R.C3604id.base_ui_progress_bar);
        this.mBarText = (TextView) view.findViewById(C3602R.C3604id.base_ui_progress_bar_text);
        this.mMainTitle = (TextView) view.findViewById(C3602R.C3604id.base_ui_progress_bar_title);
        this.mMainSubTitle = (TextView) view.findViewById(C3602R.C3604id.smart_config_common_main_sub_title);
        this.mNextButton = (Button) view.findViewById(C3602R.C3604id.next_btn);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r0 = r0.getConnectionInfo();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isDeviceApConnected(android.net.wifi.ScanResult r5) {
        /*
            r4 = this;
            android.net.wifi.WifiManager r0 = r4.mWifiManager
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            android.net.wifi.WifiInfo r0 = r0.getConnectionInfo()
            if (r0 == 0) goto L_0x003b
            java.lang.String r2 = r0.getSSID()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x003b
            java.lang.String r2 = r0.getSSID()
            java.lang.String r3 = "<unknown ssid>"
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x0023
            goto L_0x003b
        L_0x0023:
            android.net.wifi.SupplicantState r2 = r0.getSupplicantState()
            android.net.wifi.SupplicantState r3 = android.net.wifi.SupplicantState.COMPLETED
            if (r2 != r3) goto L_0x003b
            if (r5 == 0) goto L_0x003b
            java.lang.String r0 = r0.getSSID()
            java.lang.String r5 = r5.SSID
            boolean r5 = com.miot.service.connection.wifi.ConnectionUtils.isEqualWifi(r0, r5)
            if (r5 == 0) goto L_0x003b
            r5 = 1
            return r5
        L_0x003b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miot.service.connection.wifi.step.ConfigStep.isDeviceApConnected(android.net.wifi.ScanResult):boolean");
    }

    public void onCreateStep(Context context) {
        setContentView(context, C3602R.layout.smart_config_start_config_ui);
        this.mWifiManager = (WifiManager) this.mContext.getSystemService("wifi");
        this.mConnectivityManager = (ConnectivityManager) this.mContext.getSystemService("connectivity");
        ArrayList<ConfigTime> allConfigStages = getAllConfigStages();
        this.mConfigTimeList = allConfigStages;
        this.mLeftConfigStepList.addAll(allConfigStages);
        for (ConfigTime configTime : this.mConfigTimeList) {
            this.mAnimTotalTime += configTime.time;
        }
        int i = 0;
        for (ConfigTime configTime2 : this.mConfigTimeList) {
            i = (int) (((long) i) + configTime2.time);
            this.mLeftPercentList.add(Integer.valueOf((int) (((long) (i * 100)) / this.mAnimTotalTime)));
        }
        this.mCurStepStartTime = 0;
        startConfig();
    }

    public void onCurrentIndexSuccess(int i) {
        if (this.mLeftPercentList.size() == 0) {
            finishCurrentStep(SmartConfigStep.Step.STEP_SUCCESS);
            return;
        }
        int intValue = this.mLeftPercentList.element().intValue();
        this.mStartTime = System.currentTimeMillis();
        this.mStartPercent = (int) this.mProgressBar.getPercent();
        this.mEndPercent = intValue;
        this.mDuring = 1000;
        getHandler().sendEmptyMessage(1000);
        getHandler().sendEmptyMessageDelayed(111, 1000);
        getHandler().removeMessages(110);
    }

    public void onFinishStep() {
        HandlerThread handlerThread;
        QConnectCallback qConnectCallback;
        ConnectivityManager.NetworkCallback networkCallback;
        ConnectivityManager connectivityManager = this.mConnectivityManager;
        if (connectivityManager != null) {
            if (!(Build.VERSION.SDK_INT < 29 || (qConnectCallback = this.mApNetworkCallback) == null || (networkCallback = qConnectCallback.callback) == null)) {
                connectivityManager.unregisterNetworkCallback(networkCallback);
                this.mApNetworkCallback.callback = null;
                this.mApNetworkCallback = null;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                this.mConnectivityManager.bindProcessToNetwork((Network) null);
            }
        }
        getHandler().removeMessages(110);
        getHandler().removeMessages(111);
        getHandler().removeMessages(118);
        getHandler().removeMessages(1000);
        if (this.mWorkHandler != null && (handlerThread = this.mWorkHandlerThread) != null) {
            handlerThread.quit();
            this.mWorkHandlerThread = null;
            this.mWorkHandler = null;
        }
    }

    public void onPauseStep() {
        getHandler().removeMessages(110);
        getHandler().removeMessages(111);
        getHandler().removeMessages(118);
        getHandler().removeMessages(1000);
    }

    public void onResumeStep() {
        this.mConfigTimeList = getAllConfigStages();
        this.mLeftConfigStepList.clear();
        this.mLeftConfigStepList.addAll(this.mConfigTimeList);
        this.mLeftPercentList.clear();
        this.mAnimTotalTime = 0;
        for (ConfigTime configTime : this.mConfigTimeList) {
            this.mAnimTotalTime += configTime.time;
        }
        int i = 0;
        for (ConfigTime configTime2 : this.mConfigTimeList) {
            i = (int) (((long) i) + configTime2.time);
            this.mLeftPercentList.add(Integer.valueOf((int) (((long) (i * 100)) / this.mAnimTotalTime)));
        }
        startConfig();
    }

    public abstract SmartConfigStep.Step onStageTimeOut(int i);

    public void setMainTitle(TextView textView) {
        textView.setText(C3602R.string.smart_config_device_connecting);
    }

    public void setSubMainTitle(TextView textView) {
        textView.setText(C3602R.string.smart_config_connecting_sub_title);
    }

    public void startConnection(int i) {
    }

    /* access modifiers changed from: protected */
    public void triggerTimeoutNow() {
        getHandler().removeMessages(110);
        pauseCurrentStep(onStageTimeOut(this.mLeftConfigStepList.element().index));
    }
}
