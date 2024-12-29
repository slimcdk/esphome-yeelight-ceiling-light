package com.miot.service.manager.discovery;

import android.content.Context;
import com.miot.api.IDeviceHandler;
import com.miot.common.device.DiscoveryType;
import com.miot.service.common.manager.ServiceManager;
import java.util.ArrayList;
import java.util.List;

public class ScanDeviceTask {
    private static final int SCAN_DURATION = 10;
    private static final String TAG = "DeviceScanTask";
    private Context mContext;
    private IDeviceHandler mHandler;
    private List<DeviceScan> mScans = new ArrayList();

    public ScanDeviceTask(Context context) {
        this.mContext = context;
    }

    public void setDiscovery(List<DiscoveryType> list) {
        this.mScans.clear();
        for (DiscoveryType create : list) {
            DeviceScan create2 = DeviceScanFactory.create(this.mContext, create);
            create2.setHandler(this.mHandler);
            this.mScans.add(create2);
        }
    }

    public void start() {
        for (DeviceScan start : this.mScans) {
            start.start();
        }
    }

    public void start(IDeviceHandler iDeviceHandler) {
        stop();
        this.mHandler = iDeviceHandler;
        setDiscovery(ServiceManager.getInstance().getAppConfig().getDiscoveryTypes());
        start();
    }

    public void start(List<DiscoveryType> list, IDeviceHandler iDeviceHandler) {
        stop();
        this.mHandler = iDeviceHandler;
        setDiscovery(list);
        start();
    }

    public void stop() {
        for (DeviceScan stop : this.mScans) {
            stop.stop();
        }
    }
}
