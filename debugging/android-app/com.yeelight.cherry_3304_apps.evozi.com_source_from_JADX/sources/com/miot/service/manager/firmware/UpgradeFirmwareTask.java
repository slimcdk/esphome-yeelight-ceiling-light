package com.miot.service.manager.firmware;

import android.os.RemoteException;
import com.miot.api.ICompletionHandler;
import com.miot.common.device.Device;
import com.miot.common.exception.MiotException;
import com.miot.common.people.People;
import com.miot.service.common.miotcloud.HttpResponse;
import com.miot.service.common.miotcloud.JsonResponse;
import com.miot.service.common.miotcloud.MiotCloudApi;
import com.miot.service.common.task.MiotError;
import com.miot.service.common.task.MiotTask;
import com.miot.service.qrcode.ScanBarcodeActivity;
import org.json.JSONException;
import org.json.JSONObject;

public class UpgradeFirmwareTask extends MiotTask<Void> {
    private Device mDevice;
    private ICompletionHandler mHandler;

    public UpgradeFirmwareTask(People people, Device device, ICompletionHandler iCompletionHandler) {
        super(people);
        this.mDevice = device;
        this.mHandler = iCompletionHandler;
    }

    public void deliveryResult(MiotError miotError, Void voidR) {
        try {
            if (miotError.equals(MiotError.f6706OK)) {
                this.mHandler.onSucceed();
            } else {
                this.mHandler.onFailed(miotError.getCode(), miotError.getMessage());
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public HttpResponse executeRequest() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("did", this.mDevice.getDeviceId());
            jSONObject.put(ScanBarcodeActivity.PID, this.mDevice.getProductId());
            return MiotCloudApi.upgradeFirmware(this.mPeople, jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
            throw new MiotException((Throwable) e);
        }
    }

    public Void parseResult(JsonResponse jsonResponse) {
        return null;
    }
}
