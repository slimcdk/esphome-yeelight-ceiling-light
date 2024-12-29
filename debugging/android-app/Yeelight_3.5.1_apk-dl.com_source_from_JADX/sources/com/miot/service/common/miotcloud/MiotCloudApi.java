package com.miot.service.common.miotcloud;

import com.google.gson.C2469e;
import com.inuker.bluetooth.library.connect.response.BleReadResponse;
import com.inuker.bluetooth.library.utils.ByteUtils;
import com.miot.bluetooth.BluetoothConstants;
import com.miot.bluetooth.MiotBleClient;
import com.miot.bluetooth.channel.packet.Packet;
import com.miot.common.device.Device;
import com.miot.common.devicelog.DeviceLogQueryParams;
import com.miot.common.people.People;
import com.miot.common.scene.SceneBean;
import com.miot.service.common.manager.ServiceManager;
import com.miot.service.common.miotcloud.MiotCloud;
import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.miot.service.common.miotcloud.impl.OpenMiotCloudImpl;
import com.miot.service.qrcode.ScanBarcodeActivity;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MiotCloudApi {
    public static HttpResponse addTimer(People people, JSONObject jSONObject) {
        return getMiotCloud(people).post("/scene/edit", formatParam(jSONObject));
    }

    public static void bindWithBindkey(People people, String str, MiotCloud.ResponseHandler responseHandler) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("bind_key", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        getMiotCloud(people).post(MiotAppPath.BIND_WITH_BINDKEY, formatParam(jSONObject), responseHandler);
    }

    public static void blemeshBind(People people, long j, String str, String str2, String str3, String str4, MiotCloud.ResponseHandler responseHandler) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pdid", j);
            jSONObject.put("mac", str);
            jSONObject.put("sign", str2);
            jSONObject.put("did", str3);
            jSONObject.put("token", str4);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        getMiotCloud(people).post(MiotAppPath.MESH_BIND, formatParam(jSONObject), responseHandler);
    }

    public static void blemeshQueryBindInfo(People people, String str, MiotCloud.ResponseHandler responseHandler) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("did", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        getMiotCloud(people).post(MiotAppPath.MESH_QUERY_DEV, formatParam(jSONObject), responseHandler);
    }

    public static void blemeshQueryCtlInfo(People people, MiotCloud.ResponseHandler responseHandler) {
        getMiotCloud(people).post(MiotAppPath.MESH_CTL_INFO, formatParam(new JSONObject()), responseHandler);
    }

    public static void blemeshQueryModel(People people, int i, MiotCloud.ResponseHandler responseHandler) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pdid", i);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        getMiotCloud(people).post(MiotAppPath.MESH_QUERY_MODEL, formatParam(jSONObject), responseHandler);
    }

    public static void blemeshReportDevInfo(People people, String str, String str2, String str3, String str4, String str5, String str6, MiotCloud.ResponseHandler responseHandler) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("did", str);
            jSONObject.put("fw_ver", str2);
            jSONObject.put("hw_ver", str3);
            jSONObject.put("latitude", str4);
            jSONObject.put("longitude", str5);
            jSONObject.put("iternetip", str6);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        getMiotCloud(people).post(MiotAppPath.MESH_DEV_INFO, formatParam(jSONObject), responseHandler);
    }

    public static void blemeshReportVersion(final People people, String str, final String str2, final MiotCloud.ResponseHandler responseHandler) {
        MiotBleClient.getInstance().read(str, BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_FIRMWARE_VERSION, new BleReadResponse() {
            public void onResponse(int i, byte[] bArr) {
                String str;
                MiotCloud.ResponseHandler responseHandler;
                if (i != 0 || ByteUtils.isEmpty(bArr)) {
                    responseHandler = MiotCloud.ResponseHandler.this;
                    str = "";
                } else {
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < bArr.length && bArr[i2] != 0) {
                        i3++;
                        i2++;
                    }
                    if (i3 == 0) {
                        responseHandler = MiotCloud.ResponseHandler.this;
                        str = "validLength == 0";
                    } else {
                        byte[] bArr2 = new byte[i3];
                        for (int i4 = 0; i4 < i3; i4++) {
                            bArr2[i4] = bArr[i4];
                        }
                        MiotCloudApi.blemeshReportDevInfo(people, str2, new String(bArr2), "", "", "", "", MiotCloud.ResponseHandler.this);
                        return;
                    }
                }
                responseHandler.onFailure(-1, str);
            }
        });
    }

    public static void blemeshSendProvisionDone(People people, boolean z, String str, String str2, String str3, MiotCloud.ResponseHandler responseHandler) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("result", z ? 0 : 1);
            jSONObject.put("did", str);
            jSONObject.put("device_key", str2);
            jSONObject.put("auth", str3);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        getMiotCloud(people).post(MiotAppPath.MESH_PROVISION_DONE, formatParam(jSONObject), responseHandler);
    }

    public static void blemeshauth(People people, int i, String str, long j, String str2, String str3, String str4, MiotCloud.ResponseHandler responseHandler) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pdid", i);
            jSONObject.put("dev_mesh_pub", str);
            jSONObject.put("manu_cert_id", j + "");
            jSONObject.put("dev_cert", str2);
            jSONObject.put("dev_info", str3);
            jSONObject.put("code", str4);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        getMiotCloud(people).post(MiotAppPath.MESH_AUTH, formatParam(jSONObject), responseHandler);
    }

    public static HttpResponse callSmarthomeApi(People people, String str, JSONObject jSONObject) {
        return getMiotCloud(people).post(str, formatParam(jSONObject));
    }

    public static HttpResponse cancelShare(People people, JSONObject jSONObject) {
        return getMiotCloud(people).post(MiotAppPath.CANCEL_SHARE, formatParam(jSONObject));
    }

    public static HttpResponse checkBindKey(People people, JSONObject jSONObject) {
        return getMiotCloud(people).post(MiotAppPath.CHECK_BINDKEY, formatParam(jSONObject));
    }

    public static HttpResponse checkPinCode(People people, JSONObject jSONObject) {
        return getMiotCloud(people).post(MiotAppPath.PINCODE_CHECK, formatParam(jSONObject));
    }

    public static void createLightGroup(People people, List<String> list, String str, MiotCloud.ResponseHandler responseHandler) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", str);
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < list.size(); i++) {
                jSONArray.put(list.get(i));
            }
            jSONObject.put("member_dids", jSONArray);
            getMiotCloud(people).post(MiotAppPath.MESH_GROUP_CREATE, formatParam(jSONObject), responseHandler);
        } catch (JSONException e) {
            if (responseHandler != null) {
                responseHandler.onFailure(-1, e.toString());
            }
        }
    }

    public static void defLightGroup(People people, MiotCloud.ResponseHandler responseHandler) {
        getMiotCloud(people).post(MiotAppPath.MESH_GROUP_DEF, formatParam(new JSONObject()), responseHandler);
    }

    public static HttpResponse disclaimOwnership(People people, Device device, JSONObject jSONObject) {
        return getMiotCloud(people).post(device.getOwnership() == Device.Ownership.OTHERS ? "/share/cancel" : "/device/unbind", formatParam(jSONObject));
    }

    public static HttpResponse editScene(People people, SceneBean sceneBean) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(new C2469e().mo19234r(sceneBean));
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject = null;
        }
        return getMiotCloud(people).post("/scene/edit", formatParam(jSONObject));
    }

    public static HttpResponse editScene(People people, JSONObject jSONObject) {
        return getMiotCloud(people).post("/scene/edit", formatParam(jSONObject));
    }

    public static HttpResponse editTimer(People people, JSONObject jSONObject) {
        return getMiotCloud(people).post("/scene/edit", formatParam(jSONObject));
    }

    private static List<NameValuePair> formatParam(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        if (ServiceManager.getInstance().isDemoApp()) {
            OpenMiotCloudImpl.getInstance();
            jSONObject2 = OpenMiotCloudImpl.specialClientIdEncrypt(jSONObject);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair(Packet.DATA, jSONObject2));
        return arrayList;
    }

    public static HttpResponse getBindKey(People people, JSONObject jSONObject) {
        return getMiotCloud(people).post(MiotAppPath.GET_BINDKEY, formatParam(jSONObject));
    }

    public static void getBindKey(People people, JSONObject jSONObject, MiotCloud.ResponseHandler responseHandler) {
        getMiotCloud(people).post(MiotAppPath.GET_BINDKEY, formatParam(jSONObject), responseHandler);
    }

    public static void getBleMeshFirmwareUpdateInfo(People people, String str, MiotCloud.ResponseHandler responseHandler) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("did", str);
            getMiotCloud(people).post(MiotAppPath.MESH_OTA_LATEST_VERSION, formatParam(jSONObject), responseHandler);
        } catch (JSONException e) {
            if (responseHandler != null) {
                responseHandler.onFailure(-1, e.toString());
            }
        }
    }

    public static void getBleMeshFirmwareUpdateInfoBatch(People people, List<String> list, MiotCloud.ResponseHandler responseHandler) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            for (String put : list) {
                jSONArray.put(put);
            }
            jSONObject.put("dids", jSONArray);
            getMiotCloud(people).post(MiotAppPath.MESH_OTA_BATCH_LATEST_VERSION, formatParam(jSONObject), responseHandler);
        } catch (JSONException e) {
            if (responseHandler != null) {
                responseHandler.onFailure(-1, e.toString());
            }
        }
    }

    public static int getCameraPassword(String str) {
        return 1003;
    }

    public static int getDeviceInfo(String str) {
        return 1003;
    }

    public static HttpResponse getDeviceLog(People people, DeviceLogQueryParams deviceLogQueryParams) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(new C2469e().mo19234r(deviceLogQueryParams));
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject = null;
        }
        return getMiotCloud(people).post(MiotAppPath.QUERY_USER_DEVICE_DATA, formatParam(jSONObject));
    }

    public static MiotCloud getMiotCloud(People people) {
        MiotCloud instance = people.isOauth() ? OpenMiotCloudImpl.getInstance() : MiotCloudImpl.getInstance();
        instance.setPeople(people);
        return instance;
    }

    public static void getNewConnDeviceList(JSONObject jSONObject, People people, MiotCloud.ResponseHandler responseHandler) {
        getMiotCloud(people).post("/user/device_new", formatParam(jSONObject), responseHandler);
    }

    public static int getUserData() {
        return 1003;
    }

    public static HttpResponse getUserProfile(People people, JSONObject jSONObject) {
        return getMiotCloud(people).post(MiotAppPath.GET_USER_PROFILE, formatParam(jSONObject));
    }

    public static int getUsersInfo() {
        return 1003;
    }

    public static HttpResponse invokeAction(People people, String str, JSONObject jSONObject) {
        String str2 = people.isOauth() ? "/device/rpc/" : "/home/rpc/";
        MiotCloud miotCloud = getMiotCloud(people);
        return miotCloud.post(str2 + str, formatParam(jSONObject));
    }

    public static void modLightGroup(People people, String str, List<String> list, List<String> list2, MiotCloud.ResponseHandler responseHandler) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("group_did", str);
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < list.size(); i++) {
                jSONArray.put(list.get(i));
            }
            jSONObject.put("add_dids", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            for (int i2 = 0; i2 < list2.size(); i2++) {
                jSONArray2.put(list2.get(i2));
            }
            jSONObject.put("remove_dids", jSONArray2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        getMiotCloud(people).post(MiotAppPath.MESH_GROUP_MOD, formatParam(jSONObject), responseHandler);
    }

    public static HttpResponse pollResult(People people, JSONObject jSONObject) {
        return getMiotCloud(people).post(MiotAppPath.POLL_VOICE_RESULT, formatParam(jSONObject));
    }

    public static HttpResponse queryDeviceList(People people, JSONObject jSONObject) {
        return getMiotCloud(people).post(people.isOauth() ? MiotOpenAppPath.GET_DEVICE_LIST : MiotAppPath.GET_DEVICE_LIST, formatParam(jSONObject));
    }

    public static HttpResponse queryFirmware(People people, JSONObject jSONObject) {
        return getMiotCloud(people).post("/home/checkversion", formatParam(jSONObject));
    }

    public static void queryLightGroup(People people, List<String> list, MiotCloud.ResponseHandler responseHandler) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < list.size(); i++) {
                jSONArray.put(list.get(i));
            }
            jSONObject.put("group_did", jSONArray);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        getMiotCloud(people).post(MiotAppPath.MESH_GROUP_QUERY, formatParam(jSONObject), responseHandler);
    }

    public static HttpResponse queryMessages(People people, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("timestamp", j);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(1);
            jSONObject.put("type", jSONArray);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return getMiotCloud(people).post(MiotAppPath.QUERY_MESSAGES, formatParam(jSONObject));
    }

    public static HttpResponse queryScene(People people, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("us_id", i);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return getMiotCloud(people).post("/scene/get", formatParam(jSONObject));
    }

    public static HttpResponse queryScene(People people, JSONObject jSONObject) {
        return getMiotCloud(people).post("/scene/get", formatParam(jSONObject));
    }

    public static HttpResponse querySceneList(People people, JSONObject jSONObject) {
        return getMiotCloud(people).post("/scene/list", formatParam(jSONObject));
    }

    public static HttpResponse querySharedRequests(People people, JSONObject jSONObject) {
        return getMiotCloud(people).post(MiotAppPath.QUERY_SHARED_REQUESTS, formatParam(jSONObject));
    }

    public static HttpResponse querySharedUsers(People people, JSONObject jSONObject) {
        return getMiotCloud(people).post(MiotAppPath.QUERY_SHARED_USERS, formatParam(jSONObject));
    }

    public static HttpResponse queryTimerList(People people, JSONObject jSONObject) {
        return getMiotCloud(people).post("/scene/list", formatParam(jSONObject));
    }

    public static HttpResponse registerDeviceForMipush(People people, JSONObject jSONObject) {
        return getMiotCloud(people).post("/mipush/reg", formatParam(jSONObject));
    }

    public static HttpResponse removeTimer(People people, JSONObject jSONObject) {
        return getMiotCloud(people).post("/scene/delete", formatParam(jSONObject));
    }

    public static void remove_push_regId(People people, String str, String str2, String str3, MiotCloud.ResponseHandler responseHandler) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pushid", str);
            jSONObject.put("deviceid", str2);
            jSONObject.put("appid", str3);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        getMiotCloud(people).post(MiotAppPath.PUSH_UNREG, formatParam(jSONObject), responseHandler);
    }

    public static HttpResponse replyShareRequest(People people, JSONObject jSONObject) {
        return getMiotCloud(people).post(MiotAppPath.REPLY_SHARED_REQUEST, formatParam(jSONObject));
    }

    public static HttpResponse runScene(People people, JSONObject jSONObject) {
        return getMiotCloud(people).post(MiotAppPath.RUN_SCENE, formatParam(jSONObject));
    }

    public static HttpResponse setPinCode(People people, JSONObject jSONObject) {
        return getMiotCloud(people).post(MiotAppPath.PINCODE_SET, formatParam(jSONObject));
    }

    public static HttpResponse shareBatchDevice(People people, JSONObject jSONObject) {
        return getMiotCloud(people).post(MiotAppPath.SHARE_BATCH_TO_OTHER, formatParam(jSONObject));
    }

    public static HttpResponse shareDevice(People people, JSONObject jSONObject) {
        return getMiotCloud(people).post(MiotAppPath.SHARE_TO_OTHER, formatParam(jSONObject));
    }

    public static HttpResponse startSession(People people, JSONObject jSONObject) {
        return getMiotCloud(people).post(MiotAppPath.START_SESSION, formatParam(jSONObject));
    }

    public static HttpResponse subscribeDeviceProperty(People people, JSONObject jSONObject) {
        return getMiotCloud(people).post("/mipush/eventsub", formatParam(jSONObject));
    }

    public static HttpResponse takeOwnership(People people, JSONObject jSONObject) {
        return getMiotCloud(people).post("/device/bind", formatParam(jSONObject));
    }

    public static void takeOwnership(People people, String str, String str2, String str3, MiotCloud.ResponseHandler responseHandler) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("did", str);
            jSONObject.put("token", str3);
            jSONObject.put("model", str2);
            jSONObject.put(ScanBarcodeActivity.PID, 0);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        getMiotCloud(people).post("/device/bind", formatParam(jSONObject), responseHandler);
    }

    public static void unbindDevice(People people, JSONObject jSONObject, MiotCloud.ResponseHandler responseHandler) {
        getMiotCloud(people).post("/device/unbind", formatParam(jSONObject), responseHandler);
    }

    public static HttpResponse unregisterDeviceForMipush(People people, JSONObject jSONObject) {
        return getMiotCloud(people).post("/mipush/unreg", formatParam(jSONObject));
    }

    public static HttpResponse unsubscribeDeviceProperty(People people, JSONObject jSONObject) {
        return getMiotCloud(people).post("/mipush/eventunsub", formatParam(jSONObject));
    }

    public static HttpResponse updateDeviceInfo(People people, JSONObject jSONObject) {
        return getMiotCloud(people).post(MiotAppPath.UPDATE_DEVICE_INFO, formatParam(jSONObject));
    }

    public static HttpResponse upgradeFirmware(People people, JSONObject jSONObject) {
        return getMiotCloud(people).post("/home/devupgrade", formatParam(jSONObject));
    }

    public static void upload_push_regId(People people, String str, String str2, String str3, String str4, MiotCloud.ResponseHandler responseHandler) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pushid", str);
            jSONObject.put("deviceid", str2);
            jSONObject.put("region", str3);
            jSONObject.put("appid", str4);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        getMiotCloud(people).post(MiotAppPath.PUSH_REG, formatParam(jSONObject), responseHandler);
    }

    public static HttpResponse voiceInvoke(People people, JSONObject jSONObject) {
        return getMiotCloud(people).post(MiotAppPath.VOICE_INVOKE, formatParam(jSONObject));
    }
}
