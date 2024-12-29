package com.miot.service.common.manager.store;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.miot.common.model.DeviceModel;
import com.miot.common.utils.HexUtil;
import com.miot.common.utils.Logger;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DeviceModelStore {
    private static final String DEVICE_MODEL = "deviceModel";
    private static final String PREFS_DEVICE_MODEL = "device_model";
    private static final String TAG = "DeviceModelStore";
    private SharedPreferences mSharedPrefs;

    public DeviceModelStore(Context context) {
        this.mSharedPrefs = context.getSharedPreferences("device_model", 4);
    }

    private List<DeviceModel> decode(@NonNull Set<String> set) {
        ArrayList arrayList = new ArrayList();
        for (String hexStringToByteArray : set) {
            try {
                arrayList.add((DeviceModel) new ObjectInputStream(new ByteArrayInputStream(HexUtil.hexStringToByteArray(hexStringToByteArray))).readObject());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e2) {
                e2.printStackTrace();
            }
        }
        return arrayList;
    }

    private Set<String> encode(@NonNull List<DeviceModel> list) {
        HashSet hashSet = new HashSet();
        for (DeviceModel next : list) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                new ObjectOutputStream(byteArrayOutputStream).writeObject(next);
                hashSet.add(HexUtil.byteArrayToHexString(byteArrayOutputStream.toByteArray()));
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }
        return hashSet;
    }

    public void delete() {
        SharedPreferences.Editor edit = this.mSharedPrefs.edit();
        edit.clear();
        edit.apply();
    }

    public List<DeviceModel> load() {
        Set<String> stringSet = this.mSharedPrefs.getStringSet(DEVICE_MODEL, (Set) null);
        if (stringSet != null) {
            return decode(stringSet);
        }
        return null;
    }

    public void save(@NonNull List<DeviceModel> list) {
        Set<String> encode = encode(list);
        if (encode == null) {
            Logger.m7500e(TAG, "save failed, deviceModels is null");
            return;
        }
        SharedPreferences.Editor edit = this.mSharedPrefs.edit();
        edit.putStringSet(DEVICE_MODEL, encode);
        edit.apply();
    }
}
