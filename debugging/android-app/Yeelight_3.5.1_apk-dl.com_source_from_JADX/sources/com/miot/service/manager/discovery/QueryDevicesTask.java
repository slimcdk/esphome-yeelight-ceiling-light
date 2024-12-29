package com.miot.service.manager.discovery;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.RemoteException;
import android.text.TextUtils;
import com.miot.api.IDeviceHandler;
import com.miot.common.device.Device;
import com.miot.common.exception.MiotException;
import com.miot.common.people.People;
import com.miot.service.common.manager.ServiceManager;
import com.miot.service.common.miotcloud.HttpResponse;
import com.miot.service.common.miotcloud.JsonResponse;
import com.miot.service.common.miotcloud.MiotCloudApi;
import com.miot.service.common.task.MiotError;
import com.miot.service.common.task.MiotTask;
import com.miot.service.connection.wifi.ConnectionUtils;
import com.miot.service.manager.discovery.impl.DeviceFactory;
import com.miot.service.manager.discovery.impl.MiotWanDevice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class QueryDevicesTask extends MiotTask<List<Device>> {
    private static final String TAG = "QueryDevicesTask";
    private Context mContext;
    private IDeviceHandler mHandler;

    public QueryDevicesTask(People people, Context context, IDeviceHandler iDeviceHandler) {
        super(people);
        this.mContext = context;
        this.mHandler = iDeviceHandler;
    }

    private JSONObject genParams() {
        WifiInfo connectionInfo;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("getVirtualModel", true);
        WifiManager wifiManager = (WifiManager) this.mContext.getSystemService("wifi");
        if (wifiManager == null || (connectionInfo = wifiManager.getConnectionInfo()) == null) {
            return jSONObject;
        }
        String ssid = connectionInfo.getSSID();
        String bssid = connectionInfo.getBSSID();
        if (!TextUtils.isEmpty(ssid) && !TextUtils.isEmpty(bssid)) {
            jSONObject.put("ssid", ConnectionUtils.convertToSSID(ssid));
            jSONObject.put("bssid", bssid.toUpperCase());
        }
        return jSONObject;
    }

    public void deliveryResult(MiotError miotError, List<Device> list) {
        try {
            if (miotError.equals(MiotError.f4701OK)) {
                int size = list.size();
                if (size == 0) {
                    this.mHandler.onSucceed((Device) null, 0, 0);
                    return;
                }
                for (int i = 0; i < size; i++) {
                    this.mHandler.onSucceed(list.get(i), i, size);
                }
                return;
            }
            this.mHandler.onFailed(miotError.getCode(), miotError.getMessage());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public HttpResponse executeRequest() {
        try {
            return MiotCloudApi.queryDeviceList(this.mPeople, genParams());
        } catch (JSONException e) {
            e.printStackTrace();
            throw new MiotException((Throwable) e);
        }
    }

    public List<Device> parseResult(JsonResponse jsonResponse) {
        MiotWanDevice create;
        Device createFrom;
        JSONObject result = jsonResponse.getResult();
        if (result != null) {
            JSONArray optJSONArray = result.optJSONArray("list");
            if (optJSONArray == null) {
                throw new MiotException("invalid response, list is null");
            } else if (optJSONArray.length() == 0) {
                return Collections.EMPTY_LIST;
            } else {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (!(optJSONObject == null || (create = MiotWanDevice.create(optJSONObject)) == null || (createFrom = DeviceFactory.createFrom(this.mContext, create)) == null)) {
                        arrayList.add(create);
                        arrayList2.add(createFrom);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    ServiceManager.getInstance().updateDeviceList(arrayList2);
                }
                if (!arrayList.isEmpty()) {
                    ServiceManager.getInstance().saveDeviceList(arrayList);
                }
                return arrayList2;
            }
        } else {
            throw new MiotException("invalid response, result is null");
        }
    }
}
