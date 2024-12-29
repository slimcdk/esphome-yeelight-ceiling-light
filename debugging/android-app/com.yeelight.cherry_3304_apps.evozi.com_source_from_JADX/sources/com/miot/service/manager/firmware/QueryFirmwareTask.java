package com.miot.service.manager.firmware;

import android.os.RemoteException;
import com.miot.api.IQueryFirmwareHandler;
import com.miot.common.device.Device;
import com.miot.common.device.firmware.MiotFirmware;
import com.miot.common.exception.MiotException;
import com.miot.common.exception.general.InvalidResponseException;
import com.miot.common.people.People;
import com.miot.service.common.miotcloud.HttpResponse;
import com.miot.service.common.miotcloud.JsonResponse;
import com.miot.service.common.miotcloud.MiotCloudApi;
import com.miot.service.common.task.MiotError;
import com.miot.service.common.task.MiotTask;
import com.miot.service.qrcode.ScanBarcodeActivity;
import org.json.JSONException;
import org.json.JSONObject;

public class QueryFirmwareTask extends MiotTask<MiotFirmware> {
    private Device mDevice;
    private IQueryFirmwareHandler mHandler;

    public QueryFirmwareTask(People people, Device device, IQueryFirmwareHandler iQueryFirmwareHandler) {
        super(people);
        this.mDevice = device;
        this.mHandler = iQueryFirmwareHandler;
    }

    public void deliveryResult(MiotError miotError, MiotFirmware miotFirmware) {
        if (this.mHandler != null) {
            try {
                if (miotError.equals(MiotError.f6706OK)) {
                    this.mHandler.onSucceed(miotFirmware);
                } else {
                    this.mHandler.onFailed(miotError.getCode(), miotError.getMessage());
                }
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    public HttpResponse executeRequest() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ScanBarcodeActivity.PID, this.mDevice.getProductId());
            jSONObject.put("did", this.mDevice.getDeviceId());
            return MiotCloudApi.queryFirmware(this.mPeople, jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
            throw new MiotException((Throwable) e);
        }
    }

    public MiotFirmware parseResult(JsonResponse jsonResponse) {
        JSONObject result = jsonResponse.getResult();
        if (result != null) {
            boolean optBoolean = result.optBoolean("updating", false);
            String optString = result.optString("curr");
            String optString2 = result.optString("latest");
            boolean optBoolean2 = result.optBoolean("isLatest", false);
            String optString3 = result.optString("description");
            int optInt = result.optInt("ota_progress");
            String optString4 = result.optString("ota_status");
            MiotFirmware miotFirmware = new MiotFirmware();
            miotFirmware.setIsUpgrading(optBoolean);
            miotFirmware.setCurrentVersion(optString);
            miotFirmware.setLatestVersion(optString2);
            miotFirmware.setIsLatest(optBoolean2);
            miotFirmware.setDescription(optString3);
            miotFirmware.setOtaProgress(optInt);
            miotFirmware.setOtaStatus(optString4);
            return miotFirmware;
        }
        throw new InvalidResponseException("result is null");
    }
}
