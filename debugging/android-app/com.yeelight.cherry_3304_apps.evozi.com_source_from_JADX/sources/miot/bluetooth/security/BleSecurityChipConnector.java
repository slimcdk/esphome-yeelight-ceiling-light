package miot.bluetooth.security;

import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import com.inuker.bluetooth.library.IResponse;
import com.inuker.bluetooth.library.connect.response.BleNotifyResponse;
import com.miot.bluetooth.BluetoothConstants;
import com.miot.bluetooth.MiotBleClient;
import com.miot.bluetooth.channel.manager.ChannelManager;
import com.miot.bluetooth.channel.manager.SecureAuthChannelManager;
import com.xiaomi.smarthome.core.server.bluetooth.IBleChannelReader;
import com.xiaomi.smarthome.core.server.bluetooth.IBleChannelWriter;
import java.util.UUID;

public abstract class BleSecurityChipConnector extends BleSecurityConnector {
    private IBleChannelReader mChannelReader = new IBleChannelReader() {
        public IBinder asBinder() {
            return null;
        }

        public void onRead(String str, byte[] bArr, int i) {
            BleSecurityChipConnector.this.onChannelRead(bArr, i);
        }
    };
    private IBleChannelWriter mChannelWriter = SecureAuthChannelManager.getInstance().registerChannelReader(getMac(), this.mChannelReader);

    protected BleSecurityChipConnector(IBleDeviceLauncher iBleDeviceLauncher) {
        super(iBleDeviceLauncher);
    }

    /* access modifiers changed from: protected */
    public abstract void onChannelRead(byte[] bArr, int i);

    /* access modifiers changed from: protected */
    public void openSecureAuthNotify(final BleNotifyResponse bleNotifyResponse) {
        MiotBleClient.getInstance().notify(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_SECURE_AUTH, new BleNotifyResponse() {
            public void onNotify(UUID uuid, UUID uuid2, byte[] bArr) {
            }

            public void onResponse(int i) {
                if (i == 0) {
                    BleSecurityChipConnector.this.registerBleNotifyReceiver();
                }
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
        if (BluetoothConstants.MISERVICE.equals(uuid) && BluetoothConstants.CHARACTER_SECURE_AUTH.equals(uuid2) && (channel = SecureAuthChannelManager.getInstance().getChannel(getMac())) != null) {
            channel.onRead(bArr);
        }
    }

    public void unregisterChannelReader() {
        SecureAuthChannelManager.getInstance().unregisterChannelReader(getMac(), this.mChannelReader);
    }

    /* access modifiers changed from: protected */
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
