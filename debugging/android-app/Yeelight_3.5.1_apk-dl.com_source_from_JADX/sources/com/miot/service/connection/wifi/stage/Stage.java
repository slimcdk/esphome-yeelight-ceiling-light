package com.miot.service.connection.wifi.stage;

import com.miot.service.connection.wifi.step.SmartConfigStep;

public class Stage {
    public SmartConfigStep.Step mConfigStep;
    public boolean mNeedWifiPasswd;
    public SmartConfigStep.Step mPrepareStep;
    public boolean mSupportMiui;
}
