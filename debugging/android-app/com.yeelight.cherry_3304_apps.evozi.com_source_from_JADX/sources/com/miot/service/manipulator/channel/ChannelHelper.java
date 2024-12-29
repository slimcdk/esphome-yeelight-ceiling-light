package com.miot.service.manipulator.channel;

import android.content.Context;
import android.net.wifi.WifiManager;
import com.miot.common.device.ConnectionInfo;
import com.miot.common.device.Location;
import com.miot.common.device.invocation.InvokeInfo;
import com.miot.service.common.manager.ServiceManager;
import com.miot.service.connection.wifi.ConnectionUtils;

public class ChannelHelper {
    public static LanChannel sLanChannel = new LanChannel();
    public static WanChannel sWanChannel = new WanChannel();

    public static Channel getChannel(Context context, InvokeInfo invokeInfo) {
        WanChannel wanChannel = sWanChannel;
        if (!ServiceManager.getInstance().getDeviceManipulator().isLanCtrlEnabled()) {
            return wanChannel;
        }
        WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
        if (wifiManager.getConnectionInfo() == null || wifiManager.getConnectionInfo().getBSSID() == null) {
            return wanChannel;
        }
        ConnectionUtils.convertToSSID(wifiManager.getConnectionInfo().getSSID());
        String upperCase = wifiManager.getConnectionInfo().getBSSID().toUpperCase();
        ConnectionInfo connectionInfo = invokeInfo.getConnectionInfo();
        return (!upperCase.equalsIgnoreCase(connectionInfo.getBssid()) || connectionInfo.getLocation() != Location.LOCAL) ? wanChannel : sLanChannel;
    }
}
