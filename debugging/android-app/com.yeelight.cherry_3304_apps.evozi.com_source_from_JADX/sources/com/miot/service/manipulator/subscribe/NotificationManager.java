package com.miot.service.manipulator.subscribe;

import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.miot.api.IPropertyChangedListener;
import com.miot.common.property.Property;
import com.miot.common.utils.Logger;
import com.miot.service.common.manager.ServiceManager;
import com.miot.service.common.mipush.MiotpnMessageProcessor;
import com.miot.service.common.mipush.MiotpnMessageType;
import com.xiaomi.mistatistic.sdk.BaseService;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class NotificationManager {
    private static final String DEVICE_ATTRS_KEY_PREFIX = "prop.";
    private static final String TAG = "NotificationManager";
    private static volatile NotificationManager sInstance;
    /* access modifiers changed from: private */
    public IBinder.DeathRecipient mDeathRecipient = new IBinder.DeathRecipient() {
        public void binderDied() {
            Logger.m10630e(NotificationManager.TAG, "client dead");
            for (NotificationInfo listener : NotificationManager.this.mSubscribers.values()) {
                listener.getListener().asBinder().unlinkToDeath(NotificationManager.this.mDeathRecipient, 0);
            }
            NotificationManager.this.mSubscribers.clear();
        }
    };
    private MiotpnMessageProcessor mNotificationProcessor = new MiotpnMessageProcessor() {
        public boolean onProcess(JSONObject jSONObject) {
            String format;
            String str;
            Logger.m10629d(NotificationManager.TAG, "onProcess: " + jSONObject.toString());
            String optString = jSONObject.optString("did");
            if (optString == null) {
                str = "parse device event failed, deviceId is null";
            } else {
                JSONArray optJSONArray = jSONObject.optJSONArray("attrs");
                if (optJSONArray == null) {
                    str = "parse device event failed, attrs is null";
                } else {
                    boolean z = false;
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject == null) {
                            format = "parse device event failed, attr is null";
                        } else {
                            String optString2 = optJSONObject.optString(BaseService.KEY);
                            if (optString2 == null) {
                                format = "parse device event failed, attr's key is null";
                            } else if (!optString2.startsWith(NotificationManager.DEVICE_ATTRS_KEY_PREFIX)) {
                                format = String.format("%s not startsWith prop", new Object[]{optString2});
                            } else {
                                JSONArray optJSONArray2 = optJSONObject.optJSONArray("value");
                                if (optJSONArray2 == null) {
                                    format = "parse device event failed, attr's value is null";
                                } else {
                                    String substring = optString2.substring(5);
                                    NotificationInfo subscriber = NotificationManager.this.getSubscriber(optString, substring);
                                    if (subscriber == null) {
                                        format = "Subscriber list is null";
                                    } else {
                                        IPropertyChangedListener listener = subscriber.getListener();
                                        if (listener == null) {
                                            format = String.format("[%s] [%s] IPropertyChangedListener is null.", new Object[]{optString, substring});
                                        } else {
                                            Property property = subscriber.getProperty(substring);
                                            Object objectValue = property.getDefinition().getDataType().toObjectValue(optJSONArray2.optString(0));
                                            if (objectValue == null) {
                                                format = String.format("[%s] [%s].value is null.", new Object[]{optString, substring});
                                            } else if (!property.setValue(objectValue)) {
                                                format = String.format("[%s] property(%s) setValue(%s) failed.", new Object[]{optString, substring, objectValue});
                                            } else {
                                                try {
                                                    listener.onPropertyChanged(subscriber.getPropertyInfo(), property.getFriendlyName());
                                                } catch (RemoteException e) {
                                                    e.printStackTrace();
                                                }
                                                z = true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        Logger.m10630e(NotificationManager.TAG, format);
                    }
                    return z;
                }
            }
            Logger.m10630e(NotificationManager.TAG, str);
            return false;
        }
    };
    /* access modifiers changed from: private */
    public Map<String, NotificationInfo> mSubscribers = new HashMap();

    private NotificationManager() {
        ServiceManager.getInstance().getPushManager().addProcessor(MiotpnMessageType.DeviceEvent, this.mNotificationProcessor);
    }

    public static NotificationManager getInstance() {
        if (sInstance == null) {
            synchronized (NotificationManager.class) {
                if (sInstance == null) {
                    sInstance = new NotificationManager();
                }
            }
        }
        return sInstance;
    }

    private String getTag(NotificationInfo notificationInfo) {
        String deviceId = notificationInfo.getDeviceId();
        String serviceType = notificationInfo.getServiceType();
        return deviceId + "#" + serviceType;
    }

    public void addSubscriber(NotificationInfo notificationInfo) {
        String tag = getTag(notificationInfo);
        try {
            notificationInfo.getListener().asBinder().linkToDeath(this.mDeathRecipient, 0);
            this.mSubscribers.put(tag, notificationInfo);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public boolean containSubscriber(NotificationInfo notificationInfo) {
        return this.mSubscribers.containsKey(getTag(notificationInfo));
    }

    public MiotpnMessageProcessor getProcessor() {
        return this.mNotificationProcessor;
    }

    public NotificationInfo getSubscriber(String str) {
        return this.mSubscribers.get(str);
    }

    public NotificationInfo getSubscriber(String str, String str2) {
        for (String next : this.mSubscribers.keySet()) {
            if (TextUtils.equals(next.split("#")[0], str)) {
                NotificationInfo notificationInfo = this.mSubscribers.get(next);
                if (notificationInfo.containProperty(str2)) {
                    return notificationInfo;
                }
            }
        }
        return null;
    }

    public void removeSubscurber(NotificationInfo notificationInfo) {
        this.mSubscribers.remove(getTag(notificationInfo));
    }
}
