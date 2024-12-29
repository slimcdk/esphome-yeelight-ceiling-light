package com.inuker.bluetooth.library;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.inuker.bluetooth.library.IBluetoothService;
import com.inuker.bluetooth.library.connect.BleConnectManager;
import com.inuker.bluetooth.library.connect.options.BleConnectOptions;
import com.inuker.bluetooth.library.connect.response.BleGeneralResponse;
import com.inuker.bluetooth.library.search.BluetoothSearchManager;
import com.inuker.bluetooth.library.search.SearchRequest;
import java.util.UUID;

public class BluetoothServiceImpl extends IBluetoothService.Stub implements Handler.Callback {
    private static BluetoothServiceImpl sInstance;
    private Handler mHandler = new Handler(Looper.getMainLooper(), this);

    private BluetoothServiceImpl() {
    }

    public static BluetoothServiceImpl getInstance() {
        if (sInstance == null) {
            synchronized (BluetoothServiceImpl.class) {
                if (sInstance == null) {
                    sInstance = new BluetoothServiceImpl();
                }
            }
        }
        return sInstance;
    }

    public void callBluetoothApi(int i, Bundle bundle, final IResponse iResponse) {
        Message obtainMessage = this.mHandler.obtainMessage(i, new BleGeneralResponse() {
            public void onResponse(int i, Bundle bundle) {
                if (iResponse != null) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    try {
                        iResponse.onResponse(i, bundle);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        bundle.setClassLoader(getClass().getClassLoader());
        obtainMessage.setData(bundle);
        obtainMessage.sendToTarget();
    }

    public boolean handleMessage(Message message) {
        Bundle data = message.getData();
        String string = data.getString("extra.mac");
        UUID uuid = (UUID) data.getSerializable("extra.service.uuid");
        UUID uuid2 = (UUID) data.getSerializable("extra.character.uuid");
        UUID uuid3 = (UUID) data.getSerializable(Constants.EXTRA_DESCRIPTOR_UUID);
        byte[] byteArray = data.getByteArray("extra.byte.value");
        BleGeneralResponse bleGeneralResponse = (BleGeneralResponse) message.obj;
        switch (message.what) {
            case 1:
                BleConnectManager.connect(string, (BleConnectOptions) data.getParcelable(Constants.EXTRA_OPTIONS), bleGeneralResponse);
                return true;
            case 2:
                BleConnectManager.disconnect(string);
                return true;
            case 3:
                BleConnectManager.read(string, uuid, uuid2, bleGeneralResponse);
                return true;
            case 4:
                BleConnectManager.write(string, uuid, uuid2, byteArray, bleGeneralResponse);
                return true;
            case 5:
                BleConnectManager.writeNoRsp(string, uuid, uuid2, byteArray, bleGeneralResponse);
                return true;
            case 6:
                BleConnectManager.notify(string, uuid, uuid2, bleGeneralResponse);
                return true;
            case 7:
                BleConnectManager.unnotify(string, uuid, uuid2, bleGeneralResponse);
                return true;
            case 8:
                BleConnectManager.readRssi(string, bleGeneralResponse);
                return true;
            case 10:
                BleConnectManager.indicate(string, uuid, uuid2, bleGeneralResponse);
                return true;
            case 11:
                BluetoothSearchManager.search((SearchRequest) data.getParcelable(Constants.EXTRA_REQUEST), bleGeneralResponse);
                return true;
            case 12:
                BluetoothSearchManager.stopSearch();
                return true;
            case 13:
                BleConnectManager.readDescriptor(string, uuid, uuid2, uuid3, bleGeneralResponse);
                return true;
            case 14:
                BleConnectManager.writeDescriptor(string, uuid, uuid2, uuid3, byteArray, bleGeneralResponse);
                return true;
            case 20:
                BleConnectManager.clearRequest(string, data.getInt(Constants.EXTRA_TYPE, 0));
                return true;
            case 21:
                BleConnectManager.writeNoRspFast(string, uuid, uuid2, byteArray, bleGeneralResponse);
                return true;
            default:
                return true;
        }
    }
}
