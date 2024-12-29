package miot.bluetooth.security.standardauth;

import android.os.Bundle;
import android.text.TextUtils;
import com.inuker.bluetooth.library.connect.options.BleConnectOptions;
import com.miot.bluetooth.BluetoothConstants;
import com.miot.service.common.manager.ServiceManager;
import com.miot.service.common.miotcloud.MiotCloud;
import com.miot.service.common.miotcloud.MiotCloudApi;
import com.miot.service.qrcode.ScanBarcodeActivity;
import miot.bluetooth.security.BleSecurityConnector;
import miot.bluetooth.security.BleSecurityLauncher;
import miot.bluetooth.security.cache.BluetoothCache;
import org.json.JSONException;
import org.json.JSONObject;

public class BleStandardAuthRegister extends BleSecurityLauncher {
    /* access modifiers changed from: private */
    public BleStandardAuthRegisterConnector mRegisterConnector;

    public BleStandardAuthRegister(String str, int i, BleConnectOptions bleConnectOptions) {
        super(str, i, bleConnectOptions);
        this.mRegisterConnector = new BleStandardAuthRegisterConnector(this.mLauncher, bleConnectOptions.getQrcodeOob());
    }

    private void notifySuccess(int i) {
        notifyBindProcess(BleSecurityLauncher.ACTION_BLE_BIND, 0);
        dispatchResult(i);
        this.mRegisterConnector.disconnect();
    }

    /* access modifiers changed from: protected */
    public BleSecurityConnector getSecurityConnector() {
        return this.mRegisterConnector;
    }

    /* access modifiers changed from: protected */
    public void onPostConnect(int i, Bundle bundle) {
        if (i == 0) {
            byte[] byteArray = bundle.getByteArray(BluetoothConstants.KEY_TOKEN);
            BluetoothCache.setPropBoundStatus(this.mDeviceMac, 2);
            BluetoothCache.setPropDid(this.mDeviceMac, this.mRegisterConnector.getDidText());
            BluetoothCache.setPropTokenBytes(this.mDeviceMac, byteArray);
            notifySuccess(i);
            return;
        }
        dispatchResult(i);
    }

    /* access modifiers changed from: protected */
    public void onPostConnectFailed(int i) {
        if (i != 0 && BluetoothCache.getPropBoundStatus(this.mDeviceMac) == 2 && !TextUtils.isEmpty(this.mRegisterConnector.getDidText())) {
            ServiceManager.getInstance().postRunnable(new Runnable() {
                public void run() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(ScanBarcodeActivity.PID, BleStandardAuthRegister.this.mProductId);
                        jSONObject.put("did", BleStandardAuthRegister.this.mRegisterConnector.getDidText());
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    MiotCloudApi.unbindDevice(ServiceManager.getInstance().getPeople(), jSONObject, new MiotCloud.ResponseHandler() {
                        public void onFailure(int i, String str) {
                        }

                        public void onSuccess(JSONObject jSONObject) {
                            BluetoothCache.setPropBoundStatus(BleStandardAuthRegister.this.mDeviceMac, 0);
                        }
                    });
                }
            });
        }
    }
}
