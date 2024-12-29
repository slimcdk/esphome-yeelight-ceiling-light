package com.miot.service.common.manager;

import android.content.Context;
import android.text.TextUtils;
import com.miot.common.model.DeviceModel;
import com.miot.service.common.manager.store.DeviceModelStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class DeviceManager {
    private Context mContext;
    private List<DeviceModel> mDeviceModels = new ArrayList();
    private List<String> mSpecModels = new ArrayList();
    private Map<String, String> mSpecProfiles = new HashMap();
    private Map<String, String> mSpecUrns = new HashMap();

    public DeviceManager(Context context) {
        this.mContext = context;
        List<DeviceModel> load = new DeviceModelStore(context).load();
        if (load != null) {
            this.mDeviceModels.addAll(load);
        }
    }

    public synchronized void addDeviceModels(List<DeviceModel> list) {
        this.mDeviceModels.addAll(list);
        new DeviceModelStore(this.mContext).save(list);
    }

    public synchronized void addSpecModels(List<String> list) {
        this.mSpecModels.clear();
        this.mSpecModels.addAll(list);
    }

    public synchronized void addSpecUrn(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !this.mSpecUrns.containsKey(str)) {
            this.mSpecUrns.put(str, str2);
        }
    }

    public synchronized Class<?> getClazz(String str) {
        Class<?> cls;
        cls = null;
        Iterator<DeviceModel> it = this.mDeviceModels.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            DeviceModel next = it.next();
            if (TextUtils.equals(next.getModel(), str)) {
                cls = next.getClazz();
                break;
            }
        }
        return cls;
    }

    public synchronized List<String> getSpecModels() {
        return this.mSpecModels;
    }

    public synchronized Map<String, String> getSpecProfiles() {
        return this.mSpecProfiles;
    }

    public synchronized String getUrl(String str) {
        String str2;
        str2 = null;
        Iterator<DeviceModel> it = this.mDeviceModels.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            DeviceModel next = it.next();
            if (TextUtils.equals(next.getModel(), str)) {
                str2 = next.getUrl();
                break;
            }
        }
        return str2;
    }

    public synchronized String getUrn(String str) {
        if (!this.mSpecUrns.containsKey(str)) {
            return "";
        }
        return this.mSpecUrns.get(str);
    }
}
