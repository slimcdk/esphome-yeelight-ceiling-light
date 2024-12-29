package com.miot.service.manager.discovery.impl;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.miot.common.device.ConnectionInfo;
import com.miot.common.device.ConnectionType;
import com.miot.common.device.Device;
import com.miot.common.device.Service;
import com.miot.common.people.People;
import com.miot.common.property.Property;
import com.miot.common.property.PropertyDefinition;
import com.miot.common.share.SharedRequestBean;
import com.miot.common.utils.Logger;
import com.miot.service.common.manager.ServiceManager;
import com.miot.service.manager.discovery.MiotCacheDevice;
import com.miot.service.manager.discovery.impl.MiotWanDevice;
import org.json.JSONObject;

public class DeviceFactory {
    private static final String LUMI_CHILD_DEVICE_PREFIX = "lumi";
    public static final String MI_BLUETOOTH = "mi.bluetooth.device";
    private static final String TAG = "DeviceFactory";

    private static boolean checkDevice(MiotWanDevice miotWanDevice) {
        String str;
        if (TextUtils.isEmpty(miotWanDevice.getDeviceId())) {
            str = "checkDevice failed, deviceId is null";
        } else if (TextUtils.isEmpty(miotWanDevice.getModel())) {
            str = "checkDevice failed, deviceModel is null";
        } else if (!miotWanDevice.getDeviceId().startsWith(LUMI_CHILD_DEVICE_PREFIX) || !miotWanDevice.isMainDevice()) {
            return true;
        } else {
            str = "checkDevice failed, lumi child device don't have parentId";
        }
        Logger.m10630e(TAG, str);
        return false;
    }

    private static boolean checkDevice(MiotWifiDevice miotWifiDevice) {
        String str;
        if (TextUtils.isEmpty(miotWifiDevice.getDeviceModel())) {
            str = "checkDevice failed, device model is null";
        } else if (!TextUtils.isEmpty(miotWifiDevice.getAddress())) {
            return true;
        } else {
            str = "checkDevice failed, device address is null";
        }
        Logger.m10630e(TAG, str);
        return false;
    }

    private static Device create(Context context, String str) {
        if (str == null) {
            Logger.m10630e(TAG, "createDevice failed, model is null");
            return null;
        }
        String url = ServiceManager.getInstance().getDeviceManager().getUrl(str);
        if (!TextUtils.isEmpty(url)) {
            return DeviceLoader.loadFromAssets(context, str, url);
        }
        Logger.m10630e(TAG, "create spec device, model: " + str);
        return new Device();
    }

    public static Device createFrom(Context context, BluetoothDevice bluetoothDevice) {
        Device create = create(context, MI_BLUETOOTH);
        if (create != null) {
            create.setAddress(bluetoothDevice.getAddress());
            create.setName(bluetoothDevice.getName());
            create.setConnectionType(ConnectionType.BLE);
            create.setOwnership(Device.Ownership.MINE);
            create.setOnline(true);
        }
        return create;
    }

    public static Device createFrom(Context context, SharedRequestBean sharedRequestBean) {
        Device create = create(context, sharedRequestBean.getModel());
        if (create != null) {
            create.setDeviceId(sharedRequestBean.getDeviceId());
            create.setName(sharedRequestBean.getDeviceName());
            create.setDeviceModel(sharedRequestBean.getModel());
            Device.OwnerInfo ownerInfo = new Device.OwnerInfo();
            ownerInfo.setUserId(sharedRequestBean.getOwnerId());
            ownerInfo.setUserName(sharedRequestBean.getOwnerName());
            create.setOwnerInfo(ownerInfo);
            create.setOwnership(Device.Ownership.OTHERS);
        }
        return create;
    }

    public static Device createFrom(Context context, MiotCacheDevice miotCacheDevice) {
        Device create = create(context, miotCacheDevice.getModel());
        if (create != null) {
            create.setDeviceModel(miotCacheDevice.getModel());
            create.setDeviceId(miotCacheDevice.getDeviceId());
            create.setConnectionType(miotCacheDevice.getConnectionType());
            create.setOwnership(miotCacheDevice.getOwnership());
        }
        return create;
    }

    public static Device createFrom(Context context, MiotWanDevice miotWanDevice) {
        if (!checkDevice(miotWanDevice)) {
            return null;
        }
        Device create = create(context, miotWanDevice.getModel());
        if (create == null) {
            create = new Device();
        }
        create.setDeviceId(miotWanDevice.getDeviceId());
        create.setAddress(miotWanDevice.getMacAddress());
        create.setName(miotWanDevice.getName());
        create.setDeviceToken(miotWanDevice.getToken());
        create.setDeviceModel(miotWanDevice.getModel());
        create.setProductId(miotWanDevice.getPid());
        create.setLongitude(miotWanDevice.getLongitude());
        create.setLatitude(miotWanDevice.getLatitude());
        create.setConnectionType(ConnectionType.MIOT_WAN);
        ConnectionInfo connectionInfo = new ConnectionInfo();
        connectionInfo.setHost(miotWanDevice.getLocalIp());
        connectionInfo.setBssid(miotWanDevice.getBssid());
        connectionInfo.setSsid(miotWanDevice.getSsid());
        create.setConnectionInfo(connectionInfo);
        create.setOnline(miotWanDevice.isOnline());
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        if (!(wifiManager == null || wifiManager.getConnectionInfo() == null)) {
            String bssid = wifiManager.getConnectionInfo().getBSSID();
            if (!TextUtils.isEmpty(bssid) && bssid.equalsIgnoreCase(connectionInfo.getBssid())) {
                create.localPing();
            }
        }
        if (miotWanDevice.isMine()) {
            create.setOwnership(Device.Ownership.MINE);
            Device.OwnerInfo ownerInfo = new Device.OwnerInfo();
            People people = ServiceManager.getInstance().getPeople();
            if (people != null) {
                ownerInfo.setUserId(people.getUserId());
                ownerInfo.setUserName(people.getUserName());
                ownerInfo.setIcon(people.getIcon());
                create.setOwnerInfo(ownerInfo);
            }
        } else if (miotWanDevice.isShared()) {
            create.setOwnership(Device.Ownership.OTHERS);
            MiotWanDevice.OwnerBean owner = miotWanDevice.getOwner();
            if (owner != null) {
                Device.OwnerInfo ownerInfo2 = new Device.OwnerInfo();
                ownerInfo2.setUserId(owner.getUserid());
                ownerInfo2.setUserName(owner.getNickname());
                ownerInfo2.setIcon(owner.getIcon());
                create.setOwnerInfo(ownerInfo2);
            }
        } else {
            create.setOwnership(Device.Ownership.NOONES);
        }
        if (!miotWanDevice.isMainDevice()) {
            create.setParentDeviceId(miotWanDevice.getParentDeviceId());
            create.setParentDeviceModel(miotWanDevice.getParentModel());
        }
        if (miotWanDevice.getExtra() != null) {
            create.setExtra(miotWanDevice.getExtra());
        }
        if (miotWanDevice.getProp() != null) {
            parseProp(create, new JSONObject(miotWanDevice.getProp()));
        }
        return create;
    }

    public static Device createFrom(Context context, MiotWifiDevice miotWifiDevice) {
        if (!checkDevice(miotWifiDevice)) {
            return null;
        }
        Device create = create(context, miotWifiDevice.getDeviceModel());
        if (create == null) {
            "create device is null, model = " + miotWifiDevice.getDeviceModel();
            return create;
        }
        ConnectionInfo connectionInfo = new ConnectionInfo();
        connectionInfo.setSsid(miotWifiDevice.getSsid());
        connectionInfo.setBssid(miotWifiDevice.getBssid());
        connectionInfo.setRssi(miotWifiDevice.getRssi());
        create.setConnectionInfo(connectionInfo);
        create.setAddress(miotWifiDevice.getAddress());
        create.setDeviceModel(miotWifiDevice.getDeviceModel());
        create.setConnectionType(ConnectionType.MIOT_WIFI);
        create.setOwnership(Device.Ownership.NOONES);
        create.setOnline(false);
        return create;
    }

    public static String getDeviceUid(ScanResult scanResult) {
        return getDeviceUid(scanResult.SSID);
    }

    public static String getDeviceUid(String str) {
        int i;
        int indexOf = str.indexOf("_miio");
        if (indexOf <= 0 && (indexOf = str.indexOf("_miap")) <= 0 && (indexOf = str.indexOf("_mibt")) <= 0) {
            int indexOf2 = str.indexOf("midea_ac_");
            if (indexOf2 < 0) {
                return str;
            }
            i = indexOf2 + 9;
        } else {
            i = indexOf + 5;
        }
        return str.substring(i);
    }

    public static boolean isModelSupport5G(String str) {
        return str.equalsIgnoreCase("mijia.camera.v1") || str.equalsIgnoreCase("xiaomi.wifispeaker.v2") || str.equalsIgnoreCase("xiaomi.wifispeaker.v1") || str.equalsIgnoreCase("yeelink.wifispeaker.v1") || str.equalsIgnoreCase("chuangmi.camera.v6") || str.equalsIgnoreCase("xiaomi.wifispeaker.s12");
    }

    private static void parseProp(Device device, JSONObject jSONObject) {
        for (Service properties : device.getServices()) {
            for (Property next : properties.getProperties()) {
                PropertyDefinition definition = next.getDefinition();
                Object objectValue = definition.getDataType().toObjectValue(jSONObject.optString(definition.getInternalName()));
                if (objectValue != null) {
                    next.setValue(objectValue);
                }
            }
        }
    }
}
