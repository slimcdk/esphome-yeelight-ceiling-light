package com.inuker.bluetooth.library.utils;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.inuker.bluetooth.library.BluetoothContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BluetoothUtils {
    private static BluetoothAdapter mBluetoothAdapter;
    private static BluetoothManager mBluetoothManager;
    private static Handler mHandler;

    public static boolean checkMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean closeBluetooth() {
        BluetoothAdapter bluetoothAdapter = getBluetoothAdapter();
        if (bluetoothAdapter != null) {
            return bluetoothAdapter.disable();
        }
        return false;
    }

    public static BluetoothAdapter getBluetoothAdapter() {
        if (mBluetoothAdapter == null) {
            mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        }
        return mBluetoothAdapter;
    }

    public static BluetoothManager getBluetoothManager() {
        if (!isBleSupported()) {
            return null;
        }
        if (mBluetoothManager == null) {
            mBluetoothManager = (BluetoothManager) getContext().getSystemService("bluetooth");
        }
        return mBluetoothManager;
    }

    public static int getBluetoothState() {
        BluetoothAdapter bluetoothAdapter = getBluetoothAdapter();
        if (bluetoothAdapter != null) {
            return bluetoothAdapter.getState();
        }
        return 0;
    }

    public static List<BluetoothDevice> getBondedBluetoothClassicDevices() {
        Set<BluetoothDevice> bondedDevices;
        BluetoothAdapter bluetoothAdapter = getBluetoothAdapter();
        ArrayList arrayList = new ArrayList();
        if (!(bluetoothAdapter == null || (bondedDevices = bluetoothAdapter.getBondedDevices()) == null)) {
            arrayList.addAll(bondedDevices);
        }
        return arrayList;
    }

    @TargetApi(18)
    public static int getConnectStatus(String str) {
        BluetoothManager bluetoothManager = getBluetoothManager();
        if (bluetoothManager == null) {
            return -1;
        }
        try {
            return bluetoothManager.getConnectionState(getRemoteDevice(str), 7);
        } catch (Throwable th) {
            BluetoothLog.m10336e(th);
            return -1;
        }
    }

    @TargetApi(18)
    public static List<BluetoothDevice> getConnectedBluetoothLeDevices() {
        ArrayList arrayList = new ArrayList();
        BluetoothManager bluetoothManager = getBluetoothManager();
        if (bluetoothManager != null) {
            arrayList.addAll(bluetoothManager.getConnectedDevices(7));
        }
        return arrayList;
    }

    public static Context getContext() {
        return BluetoothContext.get();
    }

    private static Handler getHandler() {
        if (mHandler == null) {
            mHandler = new Handler(Looper.getMainLooper());
        }
        return mHandler;
    }

    public static BluetoothDevice getRemoteDevice(String str) {
        BluetoothAdapter bluetoothAdapter;
        if (TextUtils.isEmpty(str) || (bluetoothAdapter = getBluetoothAdapter()) == null) {
            return null;
        }
        return bluetoothAdapter.getRemoteDevice(str);
    }

    public static boolean isBleSupported() {
        return Build.VERSION.SDK_INT >= 18 && getContext() != null && getContext().getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
    }

    public static boolean isBluetoothEnabled() {
        return getBluetoothState() == 12;
    }

    @TargetApi(18)
    public static boolean isDeviceConnected(String str) {
        if (TextUtils.isEmpty(str) || !isBleSupported()) {
            return false;
        }
        return getBluetoothManager().getConnectionState(getBluetoothAdapter().getRemoteDevice(str), 7) == 2;
    }

    public static boolean openBluetooth() {
        BluetoothAdapter bluetoothAdapter = getBluetoothAdapter();
        if (bluetoothAdapter != null) {
            return bluetoothAdapter.enable();
        }
        return false;
    }

    public static void post(Runnable runnable) {
        getHandler().post(runnable);
    }

    private static void registerGlobalReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        getContext().registerReceiver(broadcastReceiver, intentFilter);
    }

    public static void registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        registerGlobalReceiver(broadcastReceiver, intentFilter);
    }

    public static void sendBroadcast(Intent intent) {
        sendGlobalBroadcast(intent);
    }

    public static void sendBroadcast(String str) {
        sendGlobalBroadcast(new Intent(str));
    }

    private static void sendGlobalBroadcast(Intent intent) {
        getContext().sendBroadcast(intent);
    }

    private static void unregisterGlobalReceiver(BroadcastReceiver broadcastReceiver) {
        getContext().unregisterReceiver(broadcastReceiver);
    }

    public static void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        unregisterGlobalReceiver(broadcastReceiver);
    }
}
