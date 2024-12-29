package miot.bluetooth.security.standardauth;

import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import com.inuker.bluetooth.library.IResponse;
import com.inuker.bluetooth.library.connect.response.BleNotifyResponse;
import com.inuker.bluetooth.library.connect.response.BleReadResponse;
import com.inuker.bluetooth.library.utils.ByteUtils;
import com.miot.api.bluetooth.response.BleResponse;
import com.miot.bluetooth.BluetoothConstants;
import com.miot.bluetooth.MiotBleClient;
import com.miot.bluetooth.channel.manager.ChannelManager;
import com.miot.bluetooth.channel.manager.StandardAuthChannelManager;
import com.xiaomi.smarthome.core.server.bluetooth.IBleChannelReader;
import com.xiaomi.smarthome.core.server.bluetooth.IBleChannelWriter;
import java.util.UUID;
import miot.bluetooth.security.BleSecurityConnector;
import miot.bluetooth.security.IBleDeviceLauncher;

public abstract class BleStandardAuthConnector extends BleSecurityConnector {
    private IBleChannelReader mChannelReader = new IBleChannelReader() {
        public IBinder asBinder() {
            return null;
        }

        public void onRead(String str, byte[] bArr, int i) {
            BleStandardAuthConnector.this.onChannelRead(bArr, i);
        }
    };
    private IBleChannelWriter mChannelWriter = StandardAuthChannelManager.getInstance().registerChannelReader(getMac(), this.mChannelReader);

    protected BleStandardAuthConnector(IBleDeviceLauncher iBleDeviceLauncher) {
        super(iBleDeviceLauncher);
    }

    private void unregisterChannelReader() {
        StandardAuthChannelManager.getInstance().unregisterChannelReader(getMac(), this.mChannelReader);
    }

    public void getBleLockFirmwareVersion(String str, final BleResponse<String> bleResponse) {
        MiotBleClient.getInstance().read(str, BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_FIRMWARE_VERSION, new BleReadResponse() {
            public void onResponse(int i, byte[] bArr) {
                if (i == 0 && !ByteUtils.isEmpty(bArr)) {
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < bArr.length && bArr[i2] != 0) {
                        i3++;
                        i2++;
                    }
                    if (i3 != 0) {
                        byte[] bArr2 = new byte[i3];
                        for (int i4 = 0; i4 < i3; i4++) {
                            bArr2[i4] = bArr[i4];
                        }
                        bleResponse.onResponse(0, new String(bArr2));
                        return;
                    }
                }
                bleResponse.onResponse(-1, "");
            }
        });
    }

    /* access modifiers changed from: protected */
    public abstract void onChannelRead(byte[] bArr, int i);

    /* access modifiers changed from: protected */
    public void onConnectFinished() {
        unregisterChannelReader();
    }

    public void openStandardAuthNotify(final BleNotifyResponse bleNotifyResponse) {
        MiotBleClient.getInstance().notify(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_STANDARD_AUTH, new BleNotifyResponse() {
            public void onNotify(UUID uuid, UUID uuid2, byte[] bArr) {
            }

            public void onResponse(int i) {
                bleNotifyResponse.onResponse(i);
            }
        });
    }

    /* access modifiers changed from: protected */
    public void processHandlerMessage(Message message) {
    }

    /* access modifiers changed from: protected */
    public void processNotify(UUID uuid, UUID uuid2, byte[] bArr) {
        ChannelManager.BleChannel channel;
        if (BluetoothConstants.MISERVICE.equals(uuid) && BluetoothConstants.CHARACTER_STANDARD_AUTH.equals(uuid2) && (channel = StandardAuthChannelManager.getInstance().getChannel(getMac())) != null) {
            channel.onRead(bArr);
        }
    }

    public boolean writeChannel(byte[] bArr, int i, IResponse iResponse) {
        try {
            this.mChannelWriter.write(bArr, i, iResponse);
            return true;
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }
}
