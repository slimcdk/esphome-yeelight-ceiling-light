package com.miot.bluetooth.channel.manager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.RemoteException;
import com.inuker.bluetooth.library.BleMessageParser;
import com.inuker.bluetooth.library.IResponse;
import com.inuker.bluetooth.library.connect.response.BleWriteResponse;
import com.inuker.bluetooth.library.utils.BluetoothUtils;
import com.miot.bluetooth.BluetoothConstants;
import com.miot.bluetooth.MiotBleClient;
import com.miot.bluetooth.channel.ChannelCallback;
import com.miot.bluetooth.channel.manager.ChannelManager;
import java.util.UUID;
import miot.bluetooth.security.BLECipher;
import miot.bluetooth.security.cache.BluetoothCache;

public class IPCChannelManager extends ChannelManager {
    private static IPCChannelManager sInstance;

    private static class NotifyReceiver extends BroadcastReceiver {
        private ChannelManager channelManager;

        public NotifyReceiver(ChannelManager channelManager2) {
            this.channelManager = channelManager2;
        }

        public void onReceive(Context context, Intent intent) {
            ChannelManager.BleChannel channel;
            if ("action.character_changed".equals(intent.getAction())) {
                String stringExtra = intent.getStringExtra("extra.mac");
                UUID uuid = (UUID) intent.getSerializableExtra("extra.character.uuid");
                byte[] byteArrayExtra = intent.getByteArrayExtra("extra.byte.value");
                if (BluetoothConstants.MISERVICE.equals((UUID) intent.getSerializableExtra("extra.service.uuid")) && BluetoothConstants.CHARACTER_IPC.equals(uuid) && (channel = this.channelManager.getChannel(stringExtra)) != null) {
                    channel.onRead(BLECipher.encrypt(BluetoothCache.getPropTokenBytes(stringExtra), byteArrayExtra));
                }
            }
        }
    }

    private IPCChannelManager() {
    }

    public static IPCChannelManager getInstance() {
        if (sInstance == null) {
            synchronized (IPCChannelManager.class) {
                if (sInstance == null) {
                    sInstance = new IPCChannelManager();
                }
            }
        }
        return sInstance;
    }

    public void init() {
        BluetoothUtils.registerReceiver(new NotifyReceiver(this), new IntentFilter("action.character_changed"));
    }

    public boolean useCrc32Verify() {
        return true;
    }

    public void writeBle(String str, byte[] bArr, final ChannelCallback channelCallback, boolean z) {
        byte[] encrypt = BLECipher.encrypt(BluetoothCache.getPropTokenBytes(str), bArr);
        MiotBleClient instance = MiotBleClient.getInstance();
        UUID uuid = BluetoothConstants.MISERVICE;
        UUID uuid2 = BluetoothConstants.CHARACTER_IPC;
        if (z) {
            instance.write(str, uuid, uuid2, encrypt, new BleWriteResponse() {
                public void onResponse(int i) {
                }
            });
            if (channelCallback != null) {
                channelCallback.onCallback(0);
                return;
            }
            return;
        }
        instance.write(str, uuid, uuid2, encrypt, new BleWriteResponse() {
            public void onResponse(int i) {
                ChannelCallback channelCallback = channelCallback;
                if (channelCallback != null) {
                    channelCallback.onCallback(i);
                }
            }
        });
    }

    public synchronized void writeBlock(String str, byte[] bArr, final IResponse iResponse) {
        ChannelManager.BleChannel channel = getChannel(str);
        if (channel != null) {
            channel.send(BleMessageParser.writeBlockMsgWrapper(bArr), 0, new ChannelCallback() {
                public void onCallback(int i) {
                    IResponse iResponse = iResponse;
                    if (iResponse != null) {
                        try {
                            iResponse.onResponse(i, (Bundle) null);
                        } catch (RemoteException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
        } else if (iResponse != null) {
            try {
                iResponse.onResponse(-1, (Bundle) null);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
        return;
    }
}
