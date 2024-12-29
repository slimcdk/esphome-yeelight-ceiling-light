package com.miot.bluetooth.channel.manager;

import com.inuker.bluetooth.library.connect.response.BleWriteResponse;
import com.miot.bluetooth.BluetoothConstants;
import com.miot.bluetooth.MiotBleClient;
import com.miot.bluetooth.channel.ChannelCallback;

public class StandardAuthChannelManager extends ChannelManager {
    private static StandardAuthChannelManager sInstance;

    private StandardAuthChannelManager() {
    }

    public static StandardAuthChannelManager getInstance() {
        if (sInstance == null) {
            synchronized (StandardAuthChannelManager.class) {
                if (sInstance == null) {
                    sInstance = new StandardAuthChannelManager();
                }
            }
        }
        return sInstance;
    }

    public boolean useCrc32Verify() {
        return false;
    }

    public void writeBle(String str, byte[] bArr, final ChannelCallback channelCallback, boolean z) {
        MiotBleClient.getInstance().writeNoRsp(str, BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_STANDARD_AUTH, bArr, new BleWriteResponse() {
            public void onResponse(int i) {
                ChannelCallback channelCallback = channelCallback;
                if (channelCallback != null) {
                    channelCallback.onCallback(i);
                }
            }
        });
    }
}
