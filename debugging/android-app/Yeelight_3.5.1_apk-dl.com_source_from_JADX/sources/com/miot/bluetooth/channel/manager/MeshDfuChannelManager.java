package com.miot.bluetooth.channel.manager;

import com.inuker.bluetooth.library.connect.response.BleWriteResponse;
import com.miot.bluetooth.BluetoothConstants;
import com.miot.bluetooth.MiotBleClient;
import com.miot.bluetooth.channel.ChannelCallback;

public class MeshDfuChannelManager extends ChannelManager {
    private static MeshDfuChannelManager sInstance;

    private MeshDfuChannelManager() {
    }

    public static MeshDfuChannelManager getInstance() {
        if (sInstance == null) {
            synchronized (MeshDfuChannelManager.class) {
                if (sInstance == null) {
                    sInstance = new MeshDfuChannelManager();
                }
            }
        }
        return sInstance;
    }

    public boolean useCrc32Verify() {
        return false;
    }

    public void writeBle(String str, byte[] bArr, ChannelCallback channelCallback, boolean z) {
        final ChannelCallback channelCallback2 = channelCallback;
        if (z) {
            MiotBleClient.getInstance().writeNoRspFast(str, BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_MESH_DFU_DATA_FRAGMENT, bArr, new BleWriteResponse() {
                public void onResponse(int i) {
                    ChannelCallback channelCallback = channelCallback2;
                    if (channelCallback != null) {
                        channelCallback.onCallback(i);
                    }
                }
            });
            return;
        }
        MiotBleClient.getInstance().writeNoRsp(str, BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_MESH_DFU_DATA_FRAGMENT, bArr, new BleWriteResponse() {
            public void onResponse(int i) {
                ChannelCallback channelCallback = channelCallback2;
                if (channelCallback != null) {
                    channelCallback.onCallback(i);
                }
            }
        });
    }
}
