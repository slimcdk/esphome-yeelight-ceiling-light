package com.p022mi.iot.service.push.subscribe;

import android.os.IBinder;
import android.os.RemoteException;
import com.miot.service.common.manager.ServiceManager;
import com.miot.service.common.mipush.MiotpnMessageProcessor;
import com.miot.service.qrcode.ScanBarcodeActivity;
import com.p022mi.iot.common.instance.Property;
import com.p022mi.iot.common.parser.DeviceParser;
import com.p022mi.iot.common.util.SpecUtil;
import com.p022mi.iot.service.push.MiPushMessageType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.mi.iot.service.push.subscribe.SpecNotificationManager */
public class SpecNotificationManager {
    /* access modifiers changed from: private */
    public static final String TAG = "SpecNotificationManager";
    private static SpecNotificationManager sInstance;
    /* access modifiers changed from: private */
    public IBinder.DeathRecipient mDeathRecipient = new IBinder.DeathRecipient() {
        public void binderDied() {
            String unused = SpecNotificationManager.TAG;
            for (SubscriptionInfo listener : SpecNotificationManager.this.mSubscriptions.values()) {
                listener.getListener().asBinder().unlinkToDeath(SpecNotificationManager.this.mDeathRecipient, 0);
            }
            SpecNotificationManager.this.mSubscriptions.clear();
        }
    };
    private MiotpnMessageProcessor mProcessor = new MiotpnMessageProcessor() {
        public boolean onProcess(JSONObject jSONObject) {
            JSONArray optJSONArray;
            if (!(MiPushMessageType.create(jSONObject.optString("topic")) != MiPushMessageType.PROPERTY || (optJSONArray = jSONObject.optJSONArray(DeviceParser.PROPERTIES)) == null || optJSONArray.length() == 0)) {
                ArrayList arrayList = new ArrayList();
                try {
                    SubscriptionInfo subscription = SpecNotificationManager.this.getSubscription(optJSONArray.optJSONObject(0).optString(ScanBarcodeActivity.PID));
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        Property property = subscription.getProperty(optJSONObject.optString(ScanBarcodeActivity.PID));
                        property.setValue(optJSONObject.get("value"));
                        arrayList.add(property);
                    }
                    if (subscription == null) {
                        String unused = SpecNotificationManager.TAG;
                        return false;
                    }
                    try {
                        subscription.getListener().onChanged(arrayList);
                        return true;
                    } catch (RemoteException e) {
                        e.printStackTrace();
                        return true;
                    }
                } catch (Exception unused2) {
                    String unused3 = SpecNotificationManager.TAG;
                }
            }
            return false;
        }
    };
    /* access modifiers changed from: private */
    public Map<String, SubscriptionInfo> mSubscriptions = new HashMap();

    private SpecNotificationManager() {
        ServiceManager.getInstance().getPushManager().addSpecProcessor(MiPushMessageType.PROPERTY, this.mProcessor);
    }

    public static synchronized SpecNotificationManager getInstance() {
        SpecNotificationManager specNotificationManager;
        synchronized (SpecNotificationManager.class) {
            if (sInstance == null) {
                sInstance = new SpecNotificationManager();
            }
            specNotificationManager = sInstance;
        }
        return specNotificationManager;
    }

    public void addSubscription(SubscriptionInfo subscriptionInfo) {
        String tag = subscriptionInfo.getTag();
        StringBuilder sb = new StringBuilder();
        sb.append("addSubscription did = ");
        sb.append(tag);
        sb.append(", sub props size = ");
        sb.append(subscriptionInfo.getProperties().size());
        try {
            subscriptionInfo.getListener().asBinder().linkToDeath(this.mDeathRecipient, 0);
            this.mSubscriptions.put(tag, subscriptionInfo);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public SubscriptionInfo containSubscription(String str) {
        return this.mSubscriptions.get(str);
    }

    public MiotpnMessageProcessor getProcessor() {
        return this.mProcessor;
    }

    public SubscriptionInfo getSubscription(String str) {
        return this.mSubscriptions.get(SpecUtil.getDeviceId(str));
    }

    public void removeSubscription(SubscriptionInfo subscriptionInfo) {
        SubscriptionInfo remove = this.mSubscriptions.remove(subscriptionInfo.getTag());
        if (remove != null) {
            remove.getListener().asBinder().unlinkToDeath(this.mDeathRecipient, 0);
        }
    }
}
