package com.miot.service.common.manager;

import android.content.Context;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.miot.common.config.AppConfiguration;
import com.miot.common.utils.Logger;
import com.miot.service.common.constant.BroadcastConstants;
import com.miot.service.common.deviceId.DeviceIdCompat;
import com.miot.service.common.miotcloud.MiotCloud;
import com.miot.service.common.miotcloud.MiotCloudApi;
import com.miot.service.common.mipush.MiotpnMessageProcessor;
import com.miot.service.common.mipush.MiotpnMessageType;
import com.miot.service.common.mipush.MiotpnRegisterListener;
import com.p022mi.iot.service.push.MiPushMessageType;
import com.xiaomi.mipush.sdk.MiPushClient;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class MiPushManager implements MiotpnRegisterListener {
    private static final String TAG = "MiPushManager";
    private Context mContext;
    private Map<MiotpnMessageType, MiotpnMessageProcessor> mProcessors = new HashMap();
    private String mPushId;
    private Map<MiPushMessageType, MiotpnMessageProcessor> mSpecProcessors = new HashMap();
    private RegisterStatus mStatus = RegisterStatus.unRegister;

    private enum RegisterStatus {
        unRegister,
        registering,
        registered
    }

    public MiPushManager(Context context) {
        this.mContext = context;
    }

    private void removeCloudPushId() {
        MiotCloudApi.remove_push_regId(ServiceManager.getInstance().getPeople(), this.mPushId, DeviceIdCompat.getSHA2Digest(DeviceIdCompat.getDeviceId(this.mContext)), String.valueOf(ServiceManager.getInstance().getAppConfig().getAppId()), new MiotCloud.ResponseHandler() {
            public void onFailure(int i, String str) {
                StringBuilder sb = new StringBuilder();
                sb.append("removeCloudPushId fail:");
                sb.append(i);
                sb.append(", ");
                sb.append(str);
            }

            public void onSuccess(JSONObject jSONObject) {
                StringBuilder sb = new StringBuilder();
                sb.append("removeCloudPushId:");
                sb.append(jSONObject);
            }
        });
    }

    private void uploadPushId(String str) {
        MiotCloudApi.upload_push_regId(ServiceManager.getInstance().getPeople(), str, DeviceIdCompat.getSHA2Digest(DeviceIdCompat.getDeviceId(this.mContext)), MiPushClient.getAppRegion(this.mContext), String.valueOf(ServiceManager.getInstance().getAppConfig().getAppId()), new MiotCloud.ResponseHandler() {
            public void onFailure(int i, String str) {
                StringBuilder sb = new StringBuilder();
                sb.append("upload_push_regId fail:");
                sb.append(i);
                sb.append(", ");
                sb.append(str);
            }

            public void onSuccess(JSONObject jSONObject) {
                StringBuilder sb = new StringBuilder();
                sb.append("upload_push_regId:");
                sb.append(jSONObject);
            }
        });
    }

    public synchronized void addProcessor(MiotpnMessageType miotpnMessageType, MiotpnMessageProcessor miotpnMessageProcessor) {
        this.mProcessors.put(miotpnMessageType, miotpnMessageProcessor);
    }

    public synchronized void addSpecProcessor(MiPushMessageType miPushMessageType, MiotpnMessageProcessor miotpnMessageProcessor) {
        this.mSpecProcessors.put(miPushMessageType, miotpnMessageProcessor);
    }

    public synchronized MiotpnMessageProcessor getProcessor(MiotpnMessageType miotpnMessageType) {
        return this.mProcessors.get(miotpnMessageType);
    }

    public synchronized MiotpnMessageProcessor getProcessor(String str) {
        MiotpnMessageProcessor miotpnMessageProcessor;
        miotpnMessageProcessor = null;
        MiotpnMessageType create = MiotpnMessageType.create(str);
        if (create != null) {
            miotpnMessageProcessor = this.mProcessors.get(create);
        }
        return miotpnMessageProcessor;
    }

    public String getPushId() {
        return this.mPushId;
    }

    public synchronized MiotpnMessageProcessor getSpecProcessor(MiPushMessageType miPushMessageType) {
        return this.mSpecProcessors.get(miPushMessageType);
    }

    public synchronized MiotpnMessageProcessor getSpecProcessor(String str) {
        MiotpnMessageProcessor miotpnMessageProcessor;
        try {
            miotpnMessageProcessor = this.mSpecProcessors.get(MiPushMessageType.create(str));
        } catch (Exception e) {
            e.printStackTrace();
            miotpnMessageProcessor = null;
        }
        return miotpnMessageProcessor;
    }

    public boolean isRegistered() {
        return this.mStatus == RegisterStatus.registered;
    }

    public void onRegisterFailed(long j, String str) {
        Logger.m7500e(TAG, "onRegisterFailed " + j + str);
        this.mStatus = RegisterStatus.unRegister;
    }

    public void onRegisterSucceed(String str) {
        String.format("onRegisterSucceed: %s", new Object[]{str});
        this.mPushId = str;
        this.mStatus = RegisterStatus.registered;
        uploadPushId(str);
        Intent intent = new Intent(BroadcastConstants.ACTION_REGISTER_PUSH_SUCCEED);
        intent.putExtra(BroadcastConstants.EXTRA_PUSH_ID, this.mPushId);
        LocalBroadcastManager.getInstance(this.mContext).sendBroadcast(intent);
    }

    public synchronized void start() {
        RegisterStatus registerStatus = this.mStatus;
        if (registerStatus != RegisterStatus.unRegister) {
            Logger.m7500e(TAG, String.format("start failed, mStatus is %s", new Object[]{registerStatus}));
        } else if (ServiceManager.getInstance().getPeople() == null) {
            Logger.m7500e(TAG, String.format("start failed because no user login.", new Object[0]));
        } else {
            this.mStatus = RegisterStatus.registering;
            AppConfiguration appConfig = ServiceManager.getInstance().getAppConfig();
            MiPushClient.registerPush(this.mContext, String.valueOf(appConfig.getAppId()), appConfig.getAppKey());
        }
    }

    public synchronized void stop(Context context) {
        RegisterStatus registerStatus = this.mStatus;
        if (registerStatus != RegisterStatus.registered) {
            Logger.m7500e(TAG, String.format("stop failed, mStatus is %s", new Object[]{registerStatus}));
            return;
        }
        this.mStatus = RegisterStatus.unRegister;
        MiPushClient.unregisterPush(context);
        removeCloudPushId();
    }

    public boolean subscribe(String str, String str2) {
        if (!isRegistered()) {
            Logger.m7500e(TAG, "Subscribe failed because mipush is not registered!");
            return false;
        }
        String.format("subscribe: %s", new Object[]{str});
        MiPushClient.subscribe(this.mContext, str, str2);
        return true;
    }

    public boolean unsubscribe(String str, String str2) {
        if (!isRegistered()) {
            Logger.m7500e(TAG, "Unsubscribe failed because mipush is not registered!");
            return false;
        }
        String.format("unsubscribe: %s", new Object[]{str});
        MiPushClient.unsubscribe(this.mContext, str, str2);
        return true;
    }
}
