package com.miot.service.manager.discovery;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.PowerManager;
import android.os.RemoteException;
import androidx.core.content.ContextCompat;
import com.miot.api.IDeviceHandler;
import com.miot.common.device.Device;
import com.miot.common.utils.Logger;
import com.miot.service.log.MyLogger;
import com.miot.service.manager.discovery.impl.DeviceFactory;
import com.miot.service.manager.discovery.impl.MiotWifiDevice;
import java.util.ArrayList;
import java.util.List;

public class WifiDeviceScan implements DeviceScan {
    private static final String TAG = "WifiDeviceScan";
    private ConnectivityManager mConnectivityManager;
    private Context mContext;
    private IDeviceHandler mHandler;
    private boolean mIsStart = false;
    private PowerManager mPowerManager;
    private BroadcastReceiver mReceiver = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.net.wifi.SCAN_RESULTS")) {
                WifiDeviceScan.this.updateDeviceList();
            }
        }
    };
    private WifiManager mWifiManager;

    public WifiDeviceScan(Context context) {
        this.mContext = context;
        this.mWifiManager = (WifiManager) context.getSystemService("wifi");
        this.mPowerManager = (PowerManager) this.mContext.getSystemService("power");
        this.mConnectivityManager = (ConnectivityManager) this.mContext.getSystemService("connectivity");
    }

    @TargetApi(23)
    private boolean hasPermission() {
        return Build.VERSION.SDK_INT < 23 || (ContextCompat.checkSelfPermission(this.mContext, "android.permission.ACCESS_FINE_LOCATION") == 0 && ContextCompat.checkSelfPermission(this.mContext, "android.permission.ACCESS_COARSE_LOCATION") == 0);
    }

    private boolean isMiDevice(ScanResult scanResult) {
        return (scanResult.SSID.contains("_miap") || scanResult.SSID.contains("_mibt")) && scanResult.level > -70;
    }

    private boolean isNeedScan() {
        NetworkInfo activeNetworkInfo = this.mConnectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return false;
        }
        return activeNetworkInfo.getType() == 1 && activeNetworkInfo.isConnected() && this.mPowerManager.isScreenOn();
    }

    private void notifyDeviceState(List<ScanResult> list) {
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (ScanResult next : list) {
                Logger.m7499d(TAG, "device ssid:" + next.SSID);
                MiotWifiDevice miotWifiDevice = new MiotWifiDevice();
                miotWifiDevice.setBssid(next.BSSID);
                miotWifiDevice.setSsid(next.SSID);
                miotWifiDevice.setCapabilities(next.capabilities);
                miotWifiDevice.setRssi(next.level);
                miotWifiDevice.setScanResult(next);
                Device createFrom = DeviceFactory.createFrom(this.mContext, miotWifiDevice);
                if (createFrom != null) {
                    arrayList.add(createFrom);
                }
            }
            int size = arrayList.size();
            if (size == 0) {
                this.mHandler.onSucceed((Device) null, 0, 0);
                return;
            }
            for (int i = 0; i < size; i++) {
                this.mHandler.onSucceed((Device) arrayList.get(i), i, size);
            }
        }
    }

    /* access modifiers changed from: private */
    public void updateDeviceList() {
        ArrayList arrayList = new ArrayList();
        for (ScanResult next : this.mWifiManager.getScanResults()) {
            if (isMiDevice(next)) {
                next.SSID.equals("mijia-demo-v1_mibt51be");
                arrayList.add(next);
            }
        }
        try {
            notifyDeviceState(arrayList);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void setHandler(IDeviceHandler iDeviceHandler) {
        this.mHandler = iDeviceHandler;
    }

    public synchronized void start() {
        MyLogger.getInstance().log(TAG, "start");
        try {
            if (this.mIsStart) {
                this.mHandler.onFailed(1011, "already start");
                return;
            } else if (!hasPermission()) {
                this.mHandler.onFailed(1015, "no ACCESS_FINE_PERMISSION permission:");
                return;
            } else {
                this.mContext.registerReceiver(this.mReceiver, new IntentFilter("android.net.wifi.SCAN_RESULTS"));
                if (isNeedScan()) {
                    MyLogger.getInstance().log(TAG, "start scan BEGIN.");
                    this.mWifiManager.startScan();
                }
                this.mIsStart = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return;
    }

    public synchronized void stop() {
        MyLogger.getInstance().log(TAG, "stop");
        if (this.mIsStart) {
            try {
                this.mContext.unregisterReceiver(this.mReceiver);
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.mIsStart = false;
        }
    }
}
