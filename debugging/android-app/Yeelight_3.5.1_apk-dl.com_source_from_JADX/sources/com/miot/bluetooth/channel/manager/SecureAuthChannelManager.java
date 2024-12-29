package com.miot.bluetooth.channel.manager;

import com.inuker.bluetooth.library.connect.response.BleWriteResponse;
import com.miot.bluetooth.BluetoothConstants;
import com.miot.bluetooth.MiotBleClient;
import com.miot.bluetooth.channel.ChannelCallback;

public class SecureAuthChannelManager extends ChannelManager {
    private static SecureAuthChannelManager sInstance;

    private SecureAuthChannelManager() {
    }

    public static SecureAuthChannelManager getInstance() {
        if (sInstance == null) {
            synchronized (SecureAuthChannelManager.class) {
                if (sInstance == null) {
                    sInstance = new SecureAuthChannelManager();
                }
            }
        }
        return sInstance;
    }

    public boolean useCrc32Verify() {
        return false;
    }

    public void writeBle(String str, byte[] bArr, final ChannelCallback channelCallback, boolean z) {
        MiotBleClient.getInstance().writeNoRsp(str, BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_SECURE_AUTH, bArr, new BleWriteResponse() {
            public void onResponse(int i) {
                ChannelCallback channelCallback = channelCallback;
                if (channelCallback != null) {
                    channelCallback.onCallback(i);
                }
            }
        });
    }
}
