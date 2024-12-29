package com.miot.service.bluetooth;

import android.text.TextUtils;
import com.inuker.bluetooth.library.utils.BluetoothLog;
import com.miot.bluetooth.MiotBleClient;
import com.miot.bluetooth.ResponseHandler;
import com.miot.bluetooth.RestAPI;
import com.miot.bluetooth.channel.packet.Packet;
import com.miot.common.ReturnCode;
import com.miot.common.people.People;
import com.miot.service.common.manager.ServiceManager;
import com.miot.service.common.miotcloud.HttpCallback;
import com.miot.service.common.miotcloud.MiotCloud;
import com.miot.service.common.miotcloud.OkHttpManager;
import com.miot.service.common.miotcloud.impl.OpenMiotCloudImpl;
import com.squareup.okhttp.C4297n;
import com.squareup.okhttp.C4312v;
import com.squareup.okhttp.C4315w;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class RestAPIImpl implements RestAPI {
    private static final String HOST_URL = "https://openapp.io.mi.com/openapp";

    private static C4315w genRequestBody(List<NameValuePair> list) {
        People people = ServiceManager.getInstance().getPeople();
        BluetoothLog.m7328d("MiotManager.getPeople()" + people);
        if (people != null) {
            long longValue = ServiceManager.getInstance().getAppConfig().getAppId().longValue();
            BluetoothLog.m7328d("clientId" + longValue);
            if (longValue != 0) {
                String accessToken = people.getAccessToken();
                BluetoothLog.m7328d("accessToken" + accessToken);
                if (accessToken != null) {
                    C4297n nVar = new C4297n();
                    nVar.mo27923a("clientId", Long.toString(longValue));
                    nVar.mo27923a("accessToken", accessToken);
                    nVar.mo27923a("macKey", people.getMacKey());
                    nVar.mo27923a("macAlgorithm", people.getMacAlgorithm());
                    for (NameValuePair next : list) {
                        if (!ServiceManager.getInstance().isDemoApp() || !Packet.DATA.equals(next.getName())) {
                            nVar.mo27923a(next.getName(), next.getValue());
                        } else {
                            try {
                                JSONObject jSONObject = new JSONObject(next.getValue());
                                OpenMiotCloudImpl.getInstance();
                                nVar.mo27923a(Packet.DATA, OpenMiotCloudImpl.specialClientIdEncrypt(jSONObject));
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    C4315w c = nVar.mo27925c();
                    BluetoothLog.m7328d("builder.build()   body" + accessToken);
                    return c;
                }
            }
        }
        return null;
    }

    private MiotCloud.ResponseHandler getResponse(final ResponseHandler responseHandler) {
        return new MiotCloud.ResponseHandler() {
            public void onFailure(int i, String str) {
                responseHandler.onFailure(i, str);
                BluetoothLog.m7328d(String.format("%d%s", new Object[]{Integer.valueOf(i), str}));
            }

            public void onSuccess(JSONObject jSONObject) {
                responseHandler.onSuccess(jSONObject);
                BluetoothLog.m7328d(jSONObject.toString());
            }
        };
    }

    private static void startHttpRequest(String str, List<NameValuePair> list, final MiotCloud.ResponseHandler responseHandler) {
        C4315w genRequestBody = genRequestBody(list);
        if (genRequestBody != null) {
            BluetoothLog.m7328d("genRequestBody" + genRequestBody.toString());
        }
        if (genRequestBody == null) {
            responseHandler.onFailure(ReturnCode.E_ACCOUNT_NOT_LOGIN, (String) null);
            return;
        }
        final String format = String.format("%s%s", new Object[]{HOST_URL, str});
        OkHttpManager.getInstance().enqueue(new C4312v.C4314b().mo28055o(format).mo28052l(genRequestBody).mo28047g(), new HttpCallback<String>() {
            public void onFailed(int i, String str) {
                BluetoothLog.m7328d("post url: " + format + " onFailed: " + i + " message: " + str);
                responseHandler.onFailure(i, str);
            }

            public void onSucceed(String str) {
                try {
                    if (ServiceManager.getInstance().isDemoApp()) {
                        str = OpenMiotCloudImpl.specialClientIdDecrypt(str);
                    }
                    BluetoothLog.m7328d("post url: " + format + " onSucceed: " + str);
                    responseHandler.onSuccess(new JSONObject(str));
                } catch (JSONException e) {
                    e.printStackTrace();
                    responseHandler.onFailure(1012, e.toString());
                }
            }
        });
    }

    public void bindDeviceSN(String str, String str2, String str3, ResponseHandler responseHandler) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("did", str);
            jSONObject.put("token", str3);
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", "prop");
            jSONObject2.put("key", "bind_key");
            jSONObject2.put("value", str2);
            jSONArray.put(0, jSONObject2);
            jSONObject.put("props", jSONArray);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        BluetoothLog.m7328d("bindSNToServer: " + jSONObject);
        arrayList.add(new BasicNameValuePair(Packet.DATA, jSONObject.toString()));
        startHttpRequest("/device/bltbind", arrayList, getResponse(responseHandler));
    }

    public void getBluetoothFirmwareUpdateInfo(String str, ResponseHandler responseHandler) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("model", str);
                BluetoothLog.m7328d("getBluetoothFirmwareUpdateInfo:  model " + str);
            } else if (MiotBleClient.getInstance().getConfig() != null) {
                BluetoothLog.m7328d("getBluetoothFirmwareUpdateInfo:  MiotBleClient.getInstance().getConfig().getModel() " + MiotBleClient.getInstance().getConfig().getModel());
                jSONObject.put("model", MiotBleClient.getInstance().getConfig().getModel());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        BluetoothLog.m7328d("getBluetoothFirmwareUpdateInfo:  dataobj " + jSONObject);
        arrayList.add(new BasicNameValuePair(Packet.DATA, jSONObject.toString()));
        startHttpRequest("/home/latest_version", arrayList, getResponse(responseHandler));
    }

    public void getDeviceProps(String str, List<String> list, ResponseHandler responseHandler) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("did", str);
            JSONArray jSONArray2 = new JSONArray();
            for (String put : list) {
                jSONArray2.put(put);
            }
            jSONObject.put("props", jSONArray2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        jSONArray.put(jSONObject);
        BluetoothLog.m7328d("getDeviceProps: " + jSONArray);
        arrayList.add(new BasicNameValuePair(Packet.DATA, jSONArray.toString()));
        startHttpRequest("/device/batchdevicedatas", arrayList, getResponse(responseHandler));
    }

    public void getDeviceSN(String str, String str2, String str3, String str4, ResponseHandler responseHandler) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mac", str2);
            jSONObject.put("model", str3);
            jSONObject.put("token", str4);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("did", str);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        BluetoothLog.m7328d("applySNFromServer: " + jSONObject);
        arrayList.add(new BasicNameValuePair(Packet.DATA, jSONObject.toString()));
        startHttpRequest("/device/bltapplydid", arrayList, getResponse(responseHandler));
    }
}
