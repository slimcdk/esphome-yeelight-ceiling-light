package com.miot.service.common.manager.store;

import android.content.Context;
import android.content.SharedPreferences;
import com.miot.common.config.AppConfiguration;
import com.miot.common.model.DeviceModel;
import com.miot.common.people.People;
import com.miot.service.log.MyLogger;
import com.miot.service.manager.discovery.impl.MiotWanDevice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p011c.p012a.p046d.C0664f;

public class MiotStore {
    public static final String ACCOUNT = "account";
    public static final String APP_CONFIG = "appConfig";
    public static final String DEVICE_LIST = "deviceList";
    public static final String DEVICE_MODELS = "deviceModels";
    public static final String PREFS_MIOT = "miot";
    private static final String TAG = "MiotStore";
    private C0664f mGson = new C0664f();
    private SharedPreferences mPreferences;

    public MiotStore(Context context) {
        this.mPreferences = context.getSharedPreferences(PREFS_MIOT, 0);
    }

    public void deletePeople() {
        MyLogger.getInstance().log(TAG, "deletePeople!");
        SharedPreferences.Editor edit = this.mPreferences.edit();
        edit.clear();
        edit.apply();
    }

    public AppConfiguration loadAppConfig() {
        String string = this.mPreferences.getString(APP_CONFIG, (String) null);
        if (string != null) {
            return (AppConfiguration) this.mGson.mo8704i(string, AppConfiguration.class);
        }
        return null;
    }

    public List<MiotWanDevice> loadDeviceList() {
        Set<String> stringSet = this.mPreferences.getStringSet(DEVICE_LIST, (Set) null);
        if (stringSet == null || stringSet.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (String next : stringSet) {
            MyLogger instance = MyLogger.getInstance();
            instance.log(TAG, "value: " + next);
            arrayList.add((MiotWanDevice) this.mGson.mo8704i(next, MiotWanDevice.class));
        }
        return arrayList;
    }

    public List<DeviceModel> loadDeviceModels() {
        Set<String> stringSet = this.mPreferences.getStringSet(DEVICE_MODELS, (Set) null);
        ArrayList arrayList = new ArrayList();
        if (stringSet != null) {
            for (String i : stringSet) {
                arrayList.add((DeviceModel) this.mGson.mo8704i(i, DeviceModel.class));
            }
        }
        return arrayList;
    }

    public People loadPeople() {
        String string = this.mPreferences.getString(ACCOUNT, (String) null);
        MyLogger instance = MyLogger.getInstance();
        instance.log(TAG, "loadPeople value = " + string);
        if (string == null) {
            return null;
        }
        People people = (People) this.mGson.mo8704i(string, People.class);
        if (people == null || people.getAccount() == null) {
            MyLogger.getInstance().log(TAG, "loadPeople failed.");
            deletePeople();
            return null;
        }
        MyLogger instance2 = MyLogger.getInstance();
        instance2.log(TAG, "loadPeople people = " + people.toString());
        return people;
    }

    public void saveAppConfig(AppConfiguration appConfiguration) {
        String r = this.mGson.mo8712r(appConfiguration);
        SharedPreferences.Editor edit = this.mPreferences.edit();
        edit.putString(APP_CONFIG, r);
        edit.apply();
    }

    public void saveDeviceList(List<MiotWanDevice> list) {
        if (list != null && !list.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (MiotWanDevice r : list) {
                String r2 = this.mGson.mo8712r(r);
                hashSet.add(r2);
                MyLogger instance = MyLogger.getInstance();
                instance.log(TAG, "saveDeviceList add value: " + r2);
            }
            SharedPreferences.Editor edit = this.mPreferences.edit();
            edit.putStringSet(DEVICE_LIST, hashSet);
            edit.apply();
        }
    }

    public void saveDeviceModels(List<DeviceModel> list) {
        HashSet hashSet = new HashSet();
        for (DeviceModel r : list) {
            hashSet.add(this.mGson.mo8712r(r));
        }
        SharedPreferences.Editor edit = this.mPreferences.edit();
        edit.putStringSet(DEVICE_MODELS, hashSet);
        edit.apply();
    }

    public void savePeople(People people) {
        String r = this.mGson.mo8712r(people);
        MyLogger instance = MyLogger.getInstance();
        instance.log(TAG, "savePeople value = " + r);
        SharedPreferences.Editor edit = this.mPreferences.edit();
        edit.putString(ACCOUNT, r);
        edit.apply();
    }
}
