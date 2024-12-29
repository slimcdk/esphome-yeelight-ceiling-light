package miot.bluetooth.security;

import android.os.Bundle;
import com.inuker.bluetooth.library.utils.BluetoothLog;
import com.miot.bluetooth.BleSecurityStatusResponse;
import com.miot.bluetooth.MiotBleClient;
import com.miot.common.people.People;
import com.miot.service.common.manager.ServiceManager;
import com.miot.service.common.miotcloud.MiotCloud;
import com.miot.service.common.miotcloud.MiotCloudApi;
import org.json.JSONObject;

public class BleMeshRegister extends BleSecurityLauncher {
    private People mPeople = ServiceManager.getInstance().getPeople();
    private BleMeshRegisterConnector mRegisterConnector = new BleMeshRegisterConnector(this.mLauncher);

    public BleMeshRegister(String str, int i) {
        super(str, i, (byte[]) null, MiotBleClient.CONNECT_OPTIONS);
    }

    /* access modifiers changed from: private */
    public void notifySuccess(int i) {
        notifyBindProcess(BleSecurityLauncher.ACTION_BLE_BIND, 0);
        dispatchResult(i);
        this.mRegisterConnector.disconnect();
    }

    public static void register(String str, int i, BleSecurityStatusResponse bleSecurityStatusResponse) {
        new BleMeshRegister(str, i).start(bleSecurityStatusResponse);
    }

    /* access modifiers changed from: protected */
    public BleSecurityConnector getSecurityConnector() {
        return this.mRegisterConnector;
    }

    /* access modifiers changed from: protected */
    public void onPostConnect(final int i, Bundle bundle) {
        MiotCloudApi.blemeshReportVersion(this.mPeople, this.mDeviceMac, this.mRegisterConnector.getDeviceDid(), new MiotCloud.ResponseHandler() {
            public void onFailure(int i, String str) {
                if (str != null) {
                    BluetoothLog.m10334d("report version failed: " + str.toString());
                }
                BleMeshRegister.this.notifySuccess(i);
            }

            public void onSuccess(JSONObject jSONObject) {
                BluetoothLog.m10334d("report version success");
                BleMeshRegister.this.notifySuccess(i);
            }
        });
    }
}
