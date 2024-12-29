package com.miot.bluetooth;

import com.inuker.bluetooth.library.connect.options.BleConnectOptions;
import com.inuker.bluetooth.library.connect.response.BleConnectResponse;
import com.inuker.bluetooth.library.connect.response.BleNotifyResponse;
import com.inuker.bluetooth.library.connect.response.BleReadResponse;
import com.inuker.bluetooth.library.connect.response.BleReadRssiResponse;
import com.inuker.bluetooth.library.connect.response.BleUnnotifyResponse;
import com.inuker.bluetooth.library.connect.response.BleWriteResponse;
import com.inuker.bluetooth.library.search.SearchRequest;
import com.inuker.bluetooth.library.search.response.SearchResponse;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.combo.BleComboWifiConfig;
import java.util.UUID;
import miot.bluetooth.security.mesh.IBleMeshUpgradeResponse;

public interface IMiotBleClient {
    void bleComboStandardAuth(String str, int i, BleComboWifiConfig bleComboWifiConfig, BleConnectOptions bleConnectOptions, BleSecurityStatusResponse bleSecurityStatusResponse);

    void bleMeshBind(String str, BleSecurityStatusResponse bleSecurityStatusResponse);

    void bleMeshConnect(String str, String str2, String str3, BleSecurityStatusResponse bleSecurityStatusResponse);

    void bleStandardAuthBind(String str, BleSecurityStatusResponse bleSecurityStatusResponse);

    void bleStandardAuthConnect(String str, BleSecurityStatusResponse bleSecurityStatusResponse);

    void cancelBleMeshUpgrade(String str);

    void clearLocalToken(String str);

    void connect(String str, BleConnectResponse bleConnectResponse);

    void disconnect(String str);

    void notify(String str, UUID uuid, UUID uuid2, BleNotifyResponse bleNotifyResponse);

    void read(String str, UUID uuid, UUID uuid2, BleReadResponse bleReadResponse);

    void readRemoteRssi(String str, BleReadRssiResponse bleReadRssiResponse);

    void search(SearchRequest searchRequest, SearchResponse searchResponse);

    void secureConnect(String str, BleSecurityStatusResponse bleSecurityStatusResponse);

    void secureLogin(String str, byte[] bArr, BleSecurityStatusResponse bleSecurityStatusResponse);

    void setDeviceConfig(MiotBleDeviceConfig miotBleDeviceConfig);

    void startBleMeshUpgrade(String str, String str2, String str3, String str4, IBleMeshUpgradeResponse iBleMeshUpgradeResponse);

    void stopSearch();

    void unnotify(String str, UUID uuid, UUID uuid2, BleUnnotifyResponse bleUnnotifyResponse);

    void write(String str, UUID uuid, UUID uuid2, byte[] bArr, BleWriteResponse bleWriteResponse);

    void writeNoRsp(String str, UUID uuid, UUID uuid2, byte[] bArr, BleWriteResponse bleWriteResponse);

    void writeNoRspFast(String str, UUID uuid, UUID uuid2, byte[] bArr, BleWriteResponse bleWriteResponse);
}
