package com.miot.service.manipulator;

import android.os.RemoteException;
import com.miot.api.ICompletionHandler;
import com.miot.common.exception.MiotException;
import com.miot.common.people.People;
import com.miot.common.property.Property;
import com.miot.service.common.manager.ServiceManager;
import com.miot.service.common.miotcloud.HttpResponse;
import com.miot.service.common.miotcloud.JsonResponse;
import com.miot.service.common.miotcloud.MiotCloudApi;
import com.miot.service.common.task.MiotError;
import com.miot.service.common.task.MiotTask;
import com.miot.service.manipulator.subscribe.NotificationInfo;
import com.miot.service.manipulator.subscribe.NotificationManager;
import com.miot.service.qrcode.ScanBarcodeActivity;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SubscribePropertyTask extends MiotTask<Void> {
    private ICompletionHandler mHandler;
    private NotificationInfo mNotificationInfo;

    public SubscribePropertyTask(People people, NotificationInfo notificationInfo, ICompletionHandler iCompletionHandler) {
        super(people);
        this.mNotificationInfo = notificationInfo;
        this.mHandler = iCompletionHandler;
    }

    public void deliveryResult(MiotError miotError, Void voidR) {
        try {
            if (miotError.equals(MiotError.f4701OK)) {
                this.mHandler.onSucceed();
            } else {
                this.mHandler.onFailed(miotError.getCode(), miotError.getMessage());
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public HttpResponse executeRequest() {
        String pushId = ServiceManager.getInstance().getPushManager().getPushId();
        if (pushId != null) {
            JSONArray jSONArray = new JSONArray();
            for (Property definition : this.mNotificationInfo.getPropertyInfo().getProperties()) {
                jSONArray.put(String.format("prop.%s", new Object[]{definition.getDefinition().getInternalName()}));
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("did", this.mNotificationInfo.getDeviceId());
                jSONObject.put(ScanBarcodeActivity.PID, 0);
                jSONObject.put("method", jSONArray);
                jSONObject.put("pushid", pushId);
                jSONObject.put("expire", 60);
                jSONObject.put("clientId", Long.toString(ServiceManager.getInstance().getAppConfig().getAppId().longValue()));
                return MiotCloudApi.subscribeDeviceProperty(this.mPeople, jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
                throw new MiotException((Throwable) e);
            }
        } else {
            throw new MiotException("MiPush not started");
        }
    }

    public Void parseResult(JsonResponse jsonResponse) {
        NotificationManager instance = NotificationManager.getInstance();
        if (instance.containSubscriber(this.mNotificationInfo)) {
            instance.removeSubscurber(this.mNotificationInfo);
        }
        instance.addSubscriber(this.mNotificationInfo);
        return null;
    }
}
