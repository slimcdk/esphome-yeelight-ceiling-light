package com.miot.service.manager.devicedata;

import android.os.RemoteException;
import com.miot.api.IDeviceLogHandler;
import com.miot.common.ReturnCode;
import com.miot.common.devicelog.DeviceLog;
import com.miot.common.devicelog.DeviceLogQueryParams;
import com.miot.common.people.People;
import com.miot.common.utils.Logger;
import com.miot.service.common.miotcloud.HttpResponse;
import com.miot.service.common.miotcloud.MiotCloudApi;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p011c.p012a.p046d.C0664f;

public class QueryDeviceLogTask implements Runnable {
    private static final String TAG = "QueryDeviceLogTask";
    private C0664f mGson = new C0664f();
    private IDeviceLogHandler mHandler;
    private People mPeople;
    private DeviceLogQueryParams mQueryParams;

    public QueryDeviceLogTask(People people, DeviceLogQueryParams deviceLogQueryParams, IDeviceLogHandler iDeviceLogHandler) {
        this.mPeople = people;
        this.mQueryParams = deviceLogQueryParams;
        this.mHandler = iDeviceLogHandler;
    }

    private List<DeviceLog> parseDeviceLogs(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("result");
            for (int i = 0; i < jSONArray.length(); i++) {
                DeviceLog create = DeviceLog.create(jSONArray.getJSONObject(i));
                if (create.getValue() == null) {
                    Logger.m10630e(TAG, "parseDeviceLog error: value is null");
                }
                arrayList.add(create);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    public void run() {
        try {
            if (this.mPeople == null) {
                this.mHandler.onFailed(ReturnCode.E_ACCOUNT_NOT_LOGIN, "account not login");
            } else if (this.mQueryParams.getTimeStart() >= this.mQueryParams.getTimeEnd()) {
                this.mHandler.onFailed(ReturnCode.E_INVALID_OPERATION, "startTime must before endTime");
            } else {
                HttpResponse deviceLog = MiotCloudApi.getDeviceLog(this.mPeople, this.mQueryParams);
                if (deviceLog.getCode() != 0) {
                    this.mHandler.onFailed(deviceLog.getCode(), deviceLog.getMessage());
                    return;
                }
                this.mHandler.onSucceed(parseDeviceLogs(deviceLog.getResult()));
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
