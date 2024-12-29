package com.miot.service.negotiator;

import android.content.Context;
import com.miot.api.INegotiator;
import com.miot.common.config.AppConfiguration;
import com.miot.common.model.DeviceModel;
import com.miot.common.utils.CallerUtil;
import com.miot.service.common.manager.ServiceManager;
import com.xiaomi.mipush.sdk.MiPushClient;
import java.util.ArrayList;
import java.util.List;

public class NegotiatorImpl extends INegotiator.Stub {
    private static final String TAG = "NegotiatorImpl";
    private static final String VERSION_1_0 = "1.0";
    private String mCaller;
    private Context mContext;

    public NegotiatorImpl(Context context) {
        this.mContext = context;
        this.mCaller = CallerUtil.getCallerName(context);
    }

    public void addDeviceModels(List<DeviceModel> list) {
        ServiceManager.getInstance().getDeviceManager().addDeviceModels(list);
    }

    public void addSpecModels(List<String> list) {
        ServiceManager.getInstance().getDeviceManager().addSpecModels(list);
    }

    public void addSpecUrn(String str, String str2) {
        ServiceManager.getInstance().getDeviceManager().addSpecUrn(str, str2);
    }

    public List<String> getServiceSupportedVersions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("1.0");
        return arrayList;
    }

    public void setAppConfig(AppConfiguration appConfiguration) {
        StringBuilder sb = new StringBuilder();
        sb.append("setAppConfig: ");
        sb.append(appConfiguration.getLocale());
        ServiceManager.getInstance().setAppConfig(appConfiguration);
    }

    public boolean setClientVersion(String str) {
        return str.equalsIgnoreCase("1.0");
    }

    public void setMiPushAlias(String str, String str2) {
        MiPushClient.setAlias(this.mContext, str, str2);
    }

    public boolean subscribeTopic(String str, String str2) {
        return ServiceManager.getInstance().subscribeTopic(str, str2);
    }

    public void unsetMiPushAlias(String str, String str2) {
        MiPushClient.unsetAlias(this.mContext, str, str2);
    }

    public boolean unsubscribeTopic(String str, String str2) {
        return ServiceManager.getInstance().unsubscribeTopic(str, str2);
    }
}
