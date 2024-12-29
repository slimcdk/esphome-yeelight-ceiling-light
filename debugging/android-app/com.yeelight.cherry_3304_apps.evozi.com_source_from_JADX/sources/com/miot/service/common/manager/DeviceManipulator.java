package com.miot.service.common.manager;

public class DeviceManipulator {
    private boolean mEnableLanCtrl = true;

    public void enableLanCtrl(boolean z) {
        this.mEnableLanCtrl = z;
    }

    public boolean isLanCtrlEnabled() {
        return this.mEnableLanCtrl;
    }
}
