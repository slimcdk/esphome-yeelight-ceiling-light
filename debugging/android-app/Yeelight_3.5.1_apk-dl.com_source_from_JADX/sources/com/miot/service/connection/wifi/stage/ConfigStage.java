package com.miot.service.connection.wifi.stage;

import com.miot.service.connection.wifi.step.SmartConfigStep;
import java.util.HashMap;

public class ConfigStage {
    public static final int INDEX_AP_CONFIG = 2;
    public static final int INDEX_AP_DEVICE_CONFIG = 6;
    public static final int INDEX_BLE_COMBO_CONFIG = 4;
    public static final int INDEX_MULTICAST_CONFIG = 1;
    public static final int INDEX_NBIOT = 12;
    public static final int INDEX_QR_SCAN_CONFIG = 3;
    public static final int INDEX_SCAN_QR_CONFIG = 5;
    public static final int INDEX_WIFI_CHOOSE_ONLY = 7;
    private static HashMap<Integer, Stage> mStaticStageMap = new HashMap<>();

    static {
        Stage stage = new Stage();
        stage.mNeedWifiPasswd = true;
        stage.mSupportMiui = true;
        stage.mConfigStep = SmartConfigStep.Step.STEP_MULTICAST_CONFIG_STEP;
        mStaticStageMap.put(1, stage);
        Stage stage2 = new Stage();
        stage2.mNeedWifiPasswd = true;
        stage2.mSupportMiui = true;
        stage2.mConfigStep = SmartConfigStep.Step.STEP_AP_CONFIG_STEP;
        mStaticStageMap.put(2, stage2);
        Stage stage3 = new Stage();
        stage3.mNeedWifiPasswd = true;
        stage3.mSupportMiui = false;
        stage3.mConfigStep = SmartConfigStep.Step.STEP_BLE_COMBO_CONFIG;
        mStaticStageMap.put(4, stage3);
        Stage stage4 = new Stage();
        stage4.mNeedWifiPasswd = true;
        stage4.mSupportMiui = false;
        stage4.mConfigStep = SmartConfigStep.Step.STEP_CHOOSE_WIFI_ONLY;
        mStaticStageMap.put(7, stage4);
        Stage stage5 = new Stage();
        stage5.mNeedWifiPasswd = false;
        stage5.mSupportMiui = false;
        stage5.mConfigStep = SmartConfigStep.Step.STEP_NBIOT;
        mStaticStageMap.put(12, stage5);
    }

    public static SmartConfigStep.Step getConfigStage(int i) {
        return mStaticStageMap.get(Integer.valueOf(i)).mConfigStep;
    }

    public static boolean getNeedWifiPasswd(int i) {
        return mStaticStageMap.get(Integer.valueOf(i)).mNeedWifiPasswd;
    }

    public static SmartConfigStep.Step getPrepareStage(int i) {
        return mStaticStageMap.get(Integer.valueOf(i)).mPrepareStep;
    }

    public static boolean getSupportMiui(int i) {
        return mStaticStageMap.get(Integer.valueOf(i)).mSupportMiui;
    }
}
