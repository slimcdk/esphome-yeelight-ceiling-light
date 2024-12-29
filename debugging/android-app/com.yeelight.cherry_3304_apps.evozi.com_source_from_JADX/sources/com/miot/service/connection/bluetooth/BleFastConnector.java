package com.miot.service.connection.bluetooth;

import android.os.Bundle;
import android.text.TextUtils;
import com.inuker.bluetooth.library.utils.BluetoothLog;
import com.inuker.bluetooth.library.utils.ByteUtils;
import com.miot.api.bluetooth.response.BleResponse;
import com.miot.bluetooth.BleSecurityStatusResponse;
import com.miot.bluetooth.BluetoothConstants;
import com.miot.bluetooth.MiotBleClient;
import com.miot.common.config.AppConfiguration;
import com.miot.common.people.People;
import com.miot.service.common.manager.ServiceManager;
import com.miot.service.connection.bluetooth.BLEBytesWriter;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;
import miot.bluetooth.security.cache.BluetoothCache;

public class BleFastConnector implements IBleFastConnector {
    private static final byte[] RESTORE_COMMAND = "Facebook".getBytes();
    private static final byte[] RETRY_COMMAND = "AirBnb".getBytes();
    private static final int TYPE_MIID = 0;
    private static final int TYPE_PWD = 2;
    private static final int TYPE_RESTORE = 4;
    private static final int TYPE_RETRY = 3;
    private static final int TYPE_SSID = 1;
    private static final int TYPE_TIME_ZONE = 5;
    private static final int TYPE_ZONE_CODE = 6;
    private final BleSecurityStatusResponse mBleConnectResponse = new BleSecurityStatusResponse() {
        public void onAuthResponse(int i, Bundle bundle) {
        }

        public void onBindResponse(int i, Bundle bundle) {
        }

        public void onConnectResponse(int i, Bundle bundle) {
        }

        public void onResponse(int i, Bundle bundle) {
            BluetoothLog.m10338v(String.format("BleFastConnector onResponse, code = %d", new Object[]{Integer.valueOf(i)}));
            if (i == 0) {
                BleFastConnector bleFastConnector = BleFastConnector.this;
                byte[] unused = bleFastConnector.mToken = BluetoothCache.getPropTokenBytes(bleFastConnector.mMac);
                BleFastConnector.this.sendUserId();
                return;
            }
            BleFastConnector.this.onFastConnectFailed();
        }
    };
    /* access modifiers changed from: private */
    public String mMac;
    private byte[] mPwdBytes;
    private BleFastConnectResponse mResponse;
    private byte[] mSSIDBytes;
    /* access modifiers changed from: private */
    public byte[] mToken;

    public interface BleFastConnectResponse extends BleResponse<Void> {
    }

    public BleFastConnector(String str, String str2, String str3) {
        this.mMac = str;
        this.mSSIDBytes = str2.getBytes();
        this.mPwdBytes = str3.getBytes();
    }

    /* access modifiers changed from: private */
    public void onFastConnectFailed() {
        BleFastConnectResponse bleFastConnectResponse = this.mResponse;
        if (bleFastConnectResponse != null) {
            bleFastConnectResponse.onResponse(-1, null);
        }
    }

    /* access modifiers changed from: private */
    public void onFastConnectSuccess() {
        BleFastConnectResponse bleFastConnectResponse = this.mResponse;
        if (bleFastConnectResponse != null) {
            bleFastConnectResponse.onResponse(0, null);
        }
    }

    /* access modifiers changed from: private */
    public void sendAPPWD() {
        BluetoothLog.m10338v(String.format("sendAPPWD %s", new Object[]{new String(this.mPwdBytes)}));
        BLEBytesWriter.write(this.mMac, BluetoothConstants.CHARACTER_WIFIAPSSID, 2, this.mPwdBytes, this.mToken, new BLEBytesWriter.BLEBytesWriteResponse() {
            public void onResponse(int i, Void voidR) {
                if (i == 0) {
                    BleFastConnector.this.onFastConnectSuccess();
                } else {
                    BleFastConnector.this.onFastConnectFailed();
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void sendAPSSID() {
        BluetoothLog.m10338v(String.format("sendAPSSID %s", new Object[]{new String(this.mSSIDBytes)}));
        BLEBytesWriter.write(this.mMac, BluetoothConstants.CHARACTER_WIFIAPSSID, 1, this.mSSIDBytes, this.mToken, new BLEBytesWriter.BLEBytesWriteResponse() {
            public void onResponse(int i, Void voidR) {
                if (i == 0) {
                    BleFastConnector.this.sendAPPWD();
                } else {
                    BleFastConnector.this.onFastConnectFailed();
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void sendTimeZone() {
        int convert = (int) TimeUnit.SECONDS.convert((long) new GregorianCalendar().getTimeZone().getRawOffset(), TimeUnit.MILLISECONDS);
        BluetoothLog.m10338v(String.format("sendTimeZone %dms", new Object[]{Integer.valueOf(convert)}));
        BLEBytesWriter.write(this.mMac, BluetoothConstants.CHARACTER_WIFIAPSSID, 5, ByteUtils.fromInt(convert), this.mToken, new BLEBytesWriter.BLEBytesWriteResponse() {
            public void onResponse(int i, Void voidR) {
                if (i == 0) {
                    BleFastConnector.this.sendZoneCode();
                } else {
                    BleFastConnector.this.onFastConnectFailed();
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void sendUserId() {
        long j;
        People people = ServiceManager.getInstance().getPeople();
        String userId = people != null ? people.getUserId() : "";
        BluetoothLog.m10334d(BleFastConnector.class.getSimpleName() + "sendUserId" + userId);
        try {
            j = Long.parseLong(userId);
        } catch (Throwable th) {
            BluetoothLog.m10336e(th);
            j = 0;
        }
        if (j > 0) {
            BluetoothLog.m10338v(String.format("sendUserId %s", new Object[]{userId}));
            BLEBytesWriter.write(this.mMac, BluetoothConstants.CHARACTER_WIFIAPSSID, 0, ByteUtils.fromLong(j), this.mToken, new BLEBytesWriter.BLEBytesWriteResponse() {
                public void onResponse(int i, Void voidR) {
                    if (i == 0) {
                        BleFastConnector.this.sendTimeZone();
                    } else {
                        BleFastConnector.this.onFastConnectFailed();
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void sendZoneCode() {
        String str;
        byte[] bArr = {0, 0, 0};
        AppConfiguration.Locale locale = ServiceManager.getInstance().getAppConfig().getLocale();
        if (locale == null || locale == AppConfiguration.Locale.cn) {
            BluetoothLog.m10338v(String.format("local server", new Object[0]));
            str = "";
        } else {
            str = locale.toString();
            BluetoothLog.m10338v(String.format("international server: %s", new Object[]{str}));
        }
        if (!TextUtils.isEmpty(str)) {
            ByteUtils.copy(bArr, str.getBytes(), 0, 0);
        }
        BluetoothLog.m10338v(String.format("sendZoneCode %s", new Object[]{str}));
        BLEBytesWriter.write(this.mMac, BluetoothConstants.CHARACTER_WIFIAPSSID, 6, bArr, this.mToken, new BLEBytesWriter.BLEBytesWriteResponse() {
            public void onResponse(int i, Void voidR) {
                if (i == 0) {
                    BleFastConnector.this.sendAPSSID();
                } else {
                    BleFastConnector.this.onFastConnectFailed();
                }
            }
        });
    }

    public void connect(BleFastConnectResponse bleFastConnectResponse) {
        this.mResponse = bleFastConnectResponse;
        MiotBleClient.getInstance().secureConnect(this.mMac, this.mBleConnectResponse);
    }

    public void sendRestoreCommand(BLEBytesWriter.BLEBytesWriteResponse bLEBytesWriteResponse) {
        BluetoothLog.m10338v(String.format("sendRestoreCommand %s", new Object[]{ByteUtils.byteToString(RESTORE_COMMAND)}));
        BLEBytesWriter.write(this.mMac, BluetoothConstants.CHARACTER_WIFIAPSSID, 4, RESTORE_COMMAND, this.mToken, bLEBytesWriteResponse);
    }

    public void sendRetryCommand(BLEBytesWriter.BLEBytesWriteResponse bLEBytesWriteResponse) {
        BluetoothLog.m10338v(String.format("sendRetryCommand %s", new Object[]{ByteUtils.byteToString(RETRY_COMMAND)}));
        BLEBytesWriter.write(this.mMac, BluetoothConstants.CHARACTER_WIFIAPSSID, 3, RETRY_COMMAND, this.mToken, bLEBytesWriteResponse);
    }
}
