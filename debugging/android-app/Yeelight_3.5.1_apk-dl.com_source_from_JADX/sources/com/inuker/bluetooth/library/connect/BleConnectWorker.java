package com.inuker.bluetooth.library.connect;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.inuker.bluetooth.library.Constants;
import com.inuker.bluetooth.library.RuntimeChecker;
import com.inuker.bluetooth.library.connect.listener.GattResponseListener;
import com.inuker.bluetooth.library.connect.listener.IBluetoothGattResponse;
import com.inuker.bluetooth.library.connect.listener.ReadCharacterListener;
import com.inuker.bluetooth.library.connect.listener.ReadDescriptorListener;
import com.inuker.bluetooth.library.connect.listener.ReadRssiListener;
import com.inuker.bluetooth.library.connect.listener.ServiceDiscoverListener;
import com.inuker.bluetooth.library.connect.listener.WriteCharacterListener;
import com.inuker.bluetooth.library.connect.listener.WriteDescriptorListener;
import com.inuker.bluetooth.library.connect.response.BleGeneralResponse;
import com.inuker.bluetooth.library.connect.response.BluetoothGattResponse;
import com.inuker.bluetooth.library.model.BleGattProfile;
import com.inuker.bluetooth.library.utils.BluetoothLog;
import com.inuker.bluetooth.library.utils.BluetoothUtils;
import com.inuker.bluetooth.library.utils.ByteUtils;
import com.inuker.bluetooth.library.utils.Version;
import com.inuker.bluetooth.library.utils.proxy.ProxyBulk;
import com.inuker.bluetooth.library.utils.proxy.ProxyInterceptor;
import com.inuker.bluetooth.library.utils.proxy.ProxyUtils;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class BleConnectWorker implements Handler.Callback, IBleConnectWorker, IBluetoothGattResponse, ProxyInterceptor, RuntimeChecker {
    private static final int MSG_GATT_RESPONSE = 288;
    private BleGattProfile mBleGattProfile;
    private BluetoothDevice mBluetoothDevice;
    private BluetoothGatt mBluetoothGatt;
    private IBluetoothGattResponse mBluetoothGattResponse;
    private volatile int mConnectStatus;
    private Map<UUID, Map<UUID, BluetoothGattCharacteristic>> mDeviceProfile;
    private GattResponseListener mGattResponseListener;
    private RuntimeChecker mRuntimeChecker;
    private Handler mWorkerHandler;

    public BleConnectWorker(String str, RuntimeChecker runtimeChecker) {
        BluetoothAdapter bluetoothAdapter = BluetoothUtils.getBluetoothAdapter();
        if (bluetoothAdapter != null) {
            this.mBluetoothDevice = bluetoothAdapter.getRemoteDevice(str);
            this.mRuntimeChecker = runtimeChecker;
            this.mWorkerHandler = new Handler(Looper.myLooper(), this);
            this.mDeviceProfile = new HashMap();
            this.mBluetoothGattResponse = (IBluetoothGattResponse) ProxyUtils.getProxy(this, IBluetoothGattResponse.class, this);
            return;
        }
        throw new IllegalStateException("ble adapter null");
    }

    private void broadcastCharacterChanged(UUID uuid, UUID uuid2, byte[] bArr) {
        Intent intent = new Intent("action.character_changed");
        intent.putExtra("extra.mac", this.mBluetoothDevice.getAddress());
        intent.putExtra("extra.service.uuid", uuid);
        intent.putExtra("extra.character.uuid", uuid2);
        intent.putExtra("extra.byte.value", bArr);
        BluetoothUtils.sendBroadcast(intent);
    }

    private void broadcastConnectStatus(int i) {
        Intent intent = new Intent("action.connect_status_changed");
        intent.putExtra("extra.mac", this.mBluetoothDevice.getAddress());
        intent.putExtra("extra.status", i);
        BluetoothUtils.sendBroadcast(intent);
    }

    private String getAddress() {
        return this.mBluetoothDevice.getAddress();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.mDeviceProfile.get(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.bluetooth.BluetoothGattCharacteristic getCharacter(java.util.UUID r3, java.util.UUID r4) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0015
            if (r4 == 0) goto L_0x0015
            java.util.Map<java.util.UUID, java.util.Map<java.util.UUID, android.bluetooth.BluetoothGattCharacteristic>> r0 = r2.mDeviceProfile
            java.lang.Object r0 = r0.get(r3)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L_0x0015
            java.lang.Object r0 = r0.get(r4)
            android.bluetooth.BluetoothGattCharacteristic r0 = (android.bluetooth.BluetoothGattCharacteristic) r0
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 != 0) goto L_0x0026
            android.bluetooth.BluetoothGatt r1 = r2.mBluetoothGatt
            if (r1 == 0) goto L_0x0026
            android.bluetooth.BluetoothGattService r3 = r1.getService(r3)
            if (r3 == 0) goto L_0x0026
            android.bluetooth.BluetoothGattCharacteristic r0 = r3.getCharacteristic(r4)
        L_0x0026:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inuker.bluetooth.library.connect.BleConnectWorker.getCharacter(java.util.UUID, java.util.UUID):android.bluetooth.BluetoothGattCharacteristic");
    }

    private boolean isCharacteristicIndicatable(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return (bluetoothGattCharacteristic == null || (bluetoothGattCharacteristic.getProperties() & 32) == 0) ? false : true;
    }

    private boolean isCharacteristicNoRspWritable(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return (bluetoothGattCharacteristic == null || (bluetoothGattCharacteristic.getProperties() & 4) == 0) ? false : true;
    }

    private boolean isCharacteristicNotifyable(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return (bluetoothGattCharacteristic == null || (bluetoothGattCharacteristic.getProperties() & 16) == 0) ? false : true;
    }

    private boolean isCharacteristicReadable(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return (bluetoothGattCharacteristic == null || (bluetoothGattCharacteristic.getProperties() & 2) == 0) ? false : true;
    }

    private boolean isCharacteristicWritable(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return true;
    }

    private boolean refreshGattCache(BluetoothGatt bluetoothGatt) {
        boolean z;
        if (bluetoothGatt != null) {
            try {
                Method method = BluetoothGatt.class.getMethod("refresh", new Class[0]);
                if (method != null) {
                    method.setAccessible(true);
                    z = ((Boolean) method.invoke(bluetoothGatt, new Object[0])).booleanValue();
                    BluetoothLog.m7332v(String.format("refreshDeviceCache return %b", new Object[]{Boolean.valueOf(z)}));
                    return z;
                }
            } catch (Exception e) {
                BluetoothLog.m7330e((Throwable) e);
            }
        }
        z = false;
        BluetoothLog.m7332v(String.format("refreshDeviceCache return %b", new Object[]{Boolean.valueOf(z)}));
        return z;
    }

    private void refreshServiceProfile() {
        BluetoothLog.m7332v(String.format("refreshServiceProfile for %s", new Object[]{this.mBluetoothDevice.getAddress()}));
        List<BluetoothGattService> services = this.mBluetoothGatt.getServices();
        HashMap hashMap = new HashMap();
        for (BluetoothGattService next : services) {
            UUID uuid = next.getUuid();
            Map map = (Map) hashMap.get(uuid);
            if (map == null) {
                BluetoothLog.m7332v("Service: " + uuid);
                map = new HashMap();
                hashMap.put(next.getUuid(), map);
            }
            for (BluetoothGattCharacteristic next2 : next.getCharacteristics()) {
                UUID uuid2 = next2.getUuid();
                BluetoothLog.m7332v("character: uuid = " + uuid2);
                map.put(next2.getUuid(), next2);
            }
        }
        this.mDeviceProfile.clear();
        this.mDeviceProfile.putAll(hashMap);
        this.mBleGattProfile = new BleGattProfile(this.mDeviceProfile);
    }

    private void setConnectStatus(int i) {
        BluetoothLog.m7332v(String.format("setConnectStatus status = %s", new Object[]{Constants.getStatusText(i)}));
        this.mConnectStatus = i;
    }

    public void checkRuntime() {
        this.mRuntimeChecker.checkRuntime();
    }

    public void clearGattResponseListener(GattResponseListener gattResponseListener) {
        checkRuntime();
        if (this.mGattResponseListener == gattResponseListener) {
            this.mGattResponseListener = null;
        }
    }

    public void closeGatt() {
        checkRuntime();
        BluetoothLog.m7332v(String.format("closeGatt for %s", new Object[]{getAddress()}));
        BluetoothGatt bluetoothGatt = this.mBluetoothGatt;
        if (bluetoothGatt != null) {
            bluetoothGatt.close();
            this.mBluetoothGatt = null;
        }
        GattResponseListener gattResponseListener = this.mGattResponseListener;
        if (gattResponseListener != null) {
            gattResponseListener.onConnectStatusChanged(false);
        }
        setConnectStatus(0);
        broadcastConnectStatus(32);
    }

    public boolean discoverService() {
        String format;
        checkRuntime();
        BluetoothLog.m7332v(String.format("discoverService for %s", new Object[]{getAddress()}));
        BluetoothGatt bluetoothGatt = this.mBluetoothGatt;
        if (bluetoothGatt == null) {
            format = String.format("discoverService but gatt is null!", new Object[0]);
        } else if (bluetoothGatt.discoverServices()) {
            return true;
        } else {
            format = String.format("discoverServices failed", new Object[0]);
        }
        BluetoothLog.m7329e(format);
        return false;
    }

    public int getCurrentStatus() {
        checkRuntime();
        return this.mConnectStatus;
    }

    public BleGattProfile getGattProfile() {
        return this.mBleGattProfile;
    }

    public boolean handleMessage(Message message) {
        if (message.what != MSG_GATT_RESPONSE) {
            return true;
        }
        ProxyBulk.safeInvoke(message.obj);
        return true;
    }

    public void isCharacterExist(UUID uuid, UUID uuid2, BleGeneralResponse bleGeneralResponse) {
        if (bleGeneralResponse != null) {
            if (this.mBluetoothGatt == null || this.mDeviceProfile == null) {
                bleGeneralResponse.onResponse(-13, null);
            } else {
                bleGeneralResponse.onResponse(getCharacter(uuid, uuid2) != null ? 0 : -1, null);
            }
        }
    }

    public void onCharacteristicChanged(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        checkRuntime();
        BluetoothLog.m7332v(String.format("onCharacteristicChanged for %s: value = %s, service = 0x%s, character = 0x%s", new Object[]{this.mBluetoothDevice.getAddress(), ByteUtils.byteToString(bArr), bluetoothGattCharacteristic.getService().getUuid(), bluetoothGattCharacteristic.getUuid()}));
        broadcastCharacterChanged(bluetoothGattCharacteristic.getService().getUuid(), bluetoothGattCharacteristic.getUuid(), bArr);
    }

    public void onCharacteristicRead(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i, byte[] bArr) {
        checkRuntime();
        BluetoothLog.m7332v(String.format("onCharacteristicRead for %s: status = %d, service = 0x%s, character = 0x%s, value = %s", new Object[]{this.mBluetoothDevice.getAddress(), Integer.valueOf(i), bluetoothGattCharacteristic.getService().getUuid(), bluetoothGattCharacteristic.getUuid(), ByteUtils.byteToString(bArr)}));
        GattResponseListener gattResponseListener = this.mGattResponseListener;
        if (gattResponseListener != null && (gattResponseListener instanceof ReadCharacterListener)) {
            ((ReadCharacterListener) gattResponseListener).onCharacteristicRead(bluetoothGattCharacteristic, i, bArr);
        }
    }

    public void onCharacteristicWrite(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i, byte[] bArr) {
        checkRuntime();
        BluetoothLog.m7332v(String.format("onCharacteristicWrite for %s: status = %d, service = 0x%s, character = 0x%s, value = %s", new Object[]{this.mBluetoothDevice.getAddress(), Integer.valueOf(i), bluetoothGattCharacteristic.getService().getUuid(), bluetoothGattCharacteristic.getUuid(), ByteUtils.byteToString(bArr)}));
        GattResponseListener gattResponseListener = this.mGattResponseListener;
        if (gattResponseListener != null && (gattResponseListener instanceof WriteCharacterListener)) {
            ((WriteCharacterListener) gattResponseListener).onCharacteristicWrite(bluetoothGattCharacteristic, i, bArr);
        }
    }

    public void onConnectionStateChange(int i, int i2) {
        checkRuntime();
        BluetoothLog.m7332v(String.format("onConnectionStateChange for %s: status = %d, newState = %d", new Object[]{this.mBluetoothDevice.getAddress(), Integer.valueOf(i), Integer.valueOf(i2)}));
        if (i == 0 && i2 == 2) {
            setConnectStatus(2);
            GattResponseListener gattResponseListener = this.mGattResponseListener;
            if (gattResponseListener != null) {
                gattResponseListener.onConnectStatusChanged(true);
                return;
            }
            return;
        }
        closeGatt();
    }

    public void onDescriptorRead(BluetoothGattDescriptor bluetoothGattDescriptor, int i, byte[] bArr) {
        checkRuntime();
        BluetoothLog.m7332v(String.format("onDescriptorRead for %s: status = %d, service = 0x%s, character = 0x%s, descriptor = 0x%s", new Object[]{this.mBluetoothDevice.getAddress(), Integer.valueOf(i), bluetoothGattDescriptor.getCharacteristic().getService().getUuid(), bluetoothGattDescriptor.getCharacteristic().getUuid(), bluetoothGattDescriptor.getUuid()}));
        GattResponseListener gattResponseListener = this.mGattResponseListener;
        if (gattResponseListener != null && (gattResponseListener instanceof ReadDescriptorListener)) {
            ((ReadDescriptorListener) gattResponseListener).onDescriptorRead(bluetoothGattDescriptor, i, bArr);
        }
    }

    public void onDescriptorWrite(BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        checkRuntime();
        BluetoothLog.m7332v(String.format("onDescriptorWrite for %s: status = %d, service = 0x%s, character = 0x%s, descriptor = 0x%s", new Object[]{this.mBluetoothDevice.getAddress(), Integer.valueOf(i), bluetoothGattDescriptor.getCharacteristic().getService().getUuid(), bluetoothGattDescriptor.getCharacteristic().getUuid(), bluetoothGattDescriptor.getUuid()}));
        GattResponseListener gattResponseListener = this.mGattResponseListener;
        if (gattResponseListener != null && (gattResponseListener instanceof WriteDescriptorListener)) {
            ((WriteDescriptorListener) gattResponseListener).onDescriptorWrite(bluetoothGattDescriptor, i);
        }
    }

    public boolean onIntercept(Object obj, Method method, Object[] objArr) {
        this.mWorkerHandler.obtainMessage(MSG_GATT_RESPONSE, new ProxyBulk(obj, method, objArr)).sendToTarget();
        return true;
    }

    public void onReadRemoteRssi(int i, int i2) {
        checkRuntime();
        BluetoothLog.m7332v(String.format("onReadRemoteRssi for %s, rssi = %d, status = %d", new Object[]{this.mBluetoothDevice.getAddress(), Integer.valueOf(i), Integer.valueOf(i2)}));
        GattResponseListener gattResponseListener = this.mGattResponseListener;
        if (gattResponseListener != null && (gattResponseListener instanceof ReadRssiListener)) {
            ((ReadRssiListener) gattResponseListener).onReadRemoteRssi(i, i2);
        }
    }

    public void onServicesDiscovered(int i) {
        checkRuntime();
        BluetoothLog.m7332v(String.format("onServicesDiscovered for %s: status = %d", new Object[]{this.mBluetoothDevice.getAddress(), Integer.valueOf(i)}));
        if (i == 0) {
            setConnectStatus(19);
            broadcastConnectStatus(16);
            refreshServiceProfile();
        }
        GattResponseListener gattResponseListener = this.mGattResponseListener;
        if (gattResponseListener != null && (gattResponseListener instanceof ServiceDiscoverListener)) {
            ((ServiceDiscoverListener) gattResponseListener).onServicesDiscovered(i, this.mBleGattProfile);
        }
    }

    public boolean openGatt() {
        checkRuntime();
        BluetoothLog.m7332v(String.format("openGatt for %s", new Object[]{getAddress()}));
        if (this.mBluetoothGatt != null) {
            BluetoothLog.m7329e(String.format("Previous gatt not closed", new Object[0]));
            return true;
        }
        Context context = BluetoothUtils.getContext();
        BluetoothGattResponse bluetoothGattResponse = new BluetoothGattResponse(this.mBluetoothGattResponse);
        this.mBluetoothGatt = Version.isMarshmallow() ? this.mBluetoothDevice.connectGatt(context, false, bluetoothGattResponse, 2) : this.mBluetoothDevice.connectGatt(context, false, bluetoothGattResponse);
        if (this.mBluetoothGatt != null) {
            return true;
        }
        BluetoothLog.m7329e(String.format("openGatt failed: connectGatt return null!", new Object[0]));
        return false;
    }

    public boolean readCharacteristic(UUID uuid, UUID uuid2) {
        String format;
        BluetoothLog.m7332v(String.format("readCharacteristic for %s: service = 0x%s, character = 0x%s", new Object[]{this.mBluetoothDevice.getAddress(), uuid, uuid2}));
        checkRuntime();
        BluetoothGattCharacteristic character = getCharacter(uuid, uuid2);
        if (character == null) {
            format = String.format("characteristic not exist!", new Object[0]);
        } else if (!isCharacteristicReadable(character)) {
            format = String.format("characteristic not readable!", new Object[0]);
        } else {
            BluetoothGatt bluetoothGatt = this.mBluetoothGatt;
            if (bluetoothGatt == null) {
                format = String.format("ble gatt null", new Object[0]);
            } else if (bluetoothGatt.readCharacteristic(character)) {
                return true;
            } else {
                format = String.format("readCharacteristic failed", new Object[0]);
            }
        }
        BluetoothLog.m7329e(format);
        return false;
    }

    public boolean readDescriptor(UUID uuid, UUID uuid2, UUID uuid3) {
        String format;
        BluetoothLog.m7332v(String.format("readDescriptor for %s: service = 0x%s, character = 0x%s, descriptor = 0x%s", new Object[]{this.mBluetoothDevice.getAddress(), uuid, uuid2, uuid3}));
        checkRuntime();
        BluetoothGattCharacteristic character = getCharacter(uuid, uuid2);
        if (character == null) {
            format = String.format("characteristic not exist!", new Object[0]);
        } else {
            BluetoothGattDescriptor descriptor = character.getDescriptor(uuid3);
            if (descriptor == null) {
                format = String.format("descriptor not exist", new Object[0]);
            } else {
                BluetoothGatt bluetoothGatt = this.mBluetoothGatt;
                if (bluetoothGatt == null) {
                    format = String.format("ble gatt null", new Object[0]);
                } else if (bluetoothGatt.readDescriptor(descriptor)) {
                    return true;
                } else {
                    format = String.format("readDescriptor failed", new Object[0]);
                }
            }
        }
        BluetoothLog.m7329e(format);
        return false;
    }

    public boolean readRemoteRssi() {
        String format;
        checkRuntime();
        BluetoothLog.m7332v(String.format("readRemoteRssi for %s", new Object[]{getAddress()}));
        BluetoothGatt bluetoothGatt = this.mBluetoothGatt;
        if (bluetoothGatt == null) {
            format = String.format("ble gatt null", new Object[0]);
        } else if (bluetoothGatt.readRemoteRssi()) {
            return true;
        } else {
            format = String.format("readRemoteRssi failed", new Object[0]);
        }
        BluetoothLog.m7329e(format);
        return false;
    }

    public boolean refreshDeviceCache() {
        String format;
        BluetoothLog.m7332v(String.format("refreshDeviceCache for %s", new Object[]{getAddress()}));
        checkRuntime();
        BluetoothGatt bluetoothGatt = this.mBluetoothGatt;
        if (bluetoothGatt == null) {
            format = String.format("ble gatt null", new Object[0]);
        } else if (refreshGattCache(bluetoothGatt)) {
            return true;
        } else {
            format = String.format("refreshDeviceCache failed", new Object[0]);
        }
        BluetoothLog.m7329e(format);
        return false;
    }

    public void registerGattResponseListener(GattResponseListener gattResponseListener) {
        checkRuntime();
        this.mGattResponseListener = gattResponseListener;
    }

    public boolean setCharacteristicIndication(UUID uuid, UUID uuid2, boolean z) {
        String format;
        checkRuntime();
        BluetoothLog.m7332v(String.format("setCharacteristicIndication for %s, service = %s, character = %s, enable = %b", new Object[]{getAddress(), uuid, uuid2, Boolean.valueOf(z)}));
        BluetoothGattCharacteristic character = getCharacter(uuid, uuid2);
        if (character == null) {
            format = String.format("characteristic not exist!", new Object[0]);
        } else if (!isCharacteristicIndicatable(character)) {
            format = String.format("characteristic not indicatable!", new Object[0]);
        } else {
            BluetoothGatt bluetoothGatt = this.mBluetoothGatt;
            if (bluetoothGatt == null) {
                format = String.format("ble gatt null", new Object[0]);
            } else if (!bluetoothGatt.setCharacteristicNotification(character, z)) {
                format = String.format("setCharacteristicIndication failed", new Object[0]);
            } else {
                BluetoothGattDescriptor descriptor = character.getDescriptor(Constants.CLIENT_CHARACTERISTIC_CONFIG);
                if (descriptor == null) {
                    format = String.format("getDescriptor for indicate null!", new Object[0]);
                } else {
                    if (!descriptor.setValue(z ? BluetoothGattDescriptor.ENABLE_INDICATION_VALUE : BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE)) {
                        format = String.format("setValue for indicate descriptor failed!", new Object[0]);
                    } else if (this.mBluetoothGatt.writeDescriptor(descriptor)) {
                        return true;
                    } else {
                        format = String.format("writeDescriptor for indicate failed", new Object[0]);
                    }
                }
            }
        }
        BluetoothLog.m7329e(format);
        return false;
    }

    public boolean setCharacteristicNotification(UUID uuid, UUID uuid2, boolean z) {
        String format;
        checkRuntime();
        BluetoothLog.m7332v(String.format("setCharacteristicNotification for %s, service = %s, character = %s, enable = %b", new Object[]{getAddress(), uuid, uuid2, Boolean.valueOf(z)}));
        BluetoothGattCharacteristic character = getCharacter(uuid, uuid2);
        if (character == null) {
            format = String.format("characteristic not exist!", new Object[0]);
        } else if (!isCharacteristicNotifyable(character)) {
            format = String.format("characteristic not notifyable!", new Object[0]);
        } else {
            BluetoothGatt bluetoothGatt = this.mBluetoothGatt;
            if (bluetoothGatt == null) {
                format = String.format("ble gatt null", new Object[0]);
            } else if (!bluetoothGatt.setCharacteristicNotification(character, z)) {
                format = String.format("setCharacteristicNotification failed", new Object[0]);
            } else {
                BluetoothGattDescriptor descriptor = character.getDescriptor(Constants.CLIENT_CHARACTERISTIC_CONFIG);
                if (descriptor == null) {
                    format = String.format("getDescriptor for notify null!", new Object[0]);
                } else {
                    if (!descriptor.setValue(z ? BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE : BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE)) {
                        format = String.format("setValue for notify descriptor failed!", new Object[0]);
                    } else if (this.mBluetoothGatt.writeDescriptor(descriptor)) {
                        return true;
                    } else {
                        format = String.format("writeDescriptor for notify failed", new Object[0]);
                    }
                }
            }
        }
        BluetoothLog.m7329e(format);
        return false;
    }

    public boolean writeCharacteristic(UUID uuid, UUID uuid2, byte[] bArr) {
        String format;
        BluetoothLog.m7332v(String.format("writeCharacteristic for %s: service = 0x%s, character = 0x%s, value = 0x%s", new Object[]{this.mBluetoothDevice.getAddress(), uuid, uuid2, ByteUtils.byteToString(bArr)}));
        checkRuntime();
        BluetoothGattCharacteristic character = getCharacter(uuid, uuid2);
        if (character == null) {
            format = String.format("characteristic not exist!", new Object[0]);
        } else if (!isCharacteristicWritable(character)) {
            format = String.format("characteristic not writable!", new Object[0]);
        } else if (this.mBluetoothGatt == null) {
            format = String.format("ble gatt null", new Object[0]);
        } else {
            if (bArr == null) {
                bArr = ByteUtils.EMPTY_BYTES;
            }
            character.setValue(bArr);
            if (this.mBluetoothGatt.writeCharacteristic(character)) {
                return true;
            }
            format = String.format("writeCharacteristic failed", new Object[0]);
        }
        BluetoothLog.m7329e(format);
        return false;
    }

    public boolean writeCharacteristicWithNoRsp(UUID uuid, UUID uuid2, byte[] bArr) {
        String format;
        BluetoothLog.m7332v(String.format("writeCharacteristicWithNoRsp for %s: service = 0x%s, character = 0x%s, value = 0x%s", new Object[]{this.mBluetoothDevice.getAddress(), uuid, uuid2, ByteUtils.byteToString(bArr)}));
        checkRuntime();
        BluetoothGattCharacteristic character = getCharacter(uuid, uuid2);
        if (character == null) {
            format = String.format("characteristic not exist!", new Object[0]);
        } else if (!isCharacteristicNoRspWritable(character)) {
            format = String.format("characteristic not norsp writable!", new Object[0]);
        } else if (this.mBluetoothGatt == null) {
            format = String.format("ble gatt null", new Object[0]);
        } else {
            if (bArr == null) {
                bArr = ByteUtils.EMPTY_BYTES;
            }
            character.setValue(bArr);
            character.setWriteType(1);
            if (this.mBluetoothGatt.writeCharacteristic(character)) {
                return true;
            }
            format = String.format("writeCharacteristic failed", new Object[0]);
        }
        BluetoothLog.m7329e(format);
        return false;
    }

    public boolean writeDescriptor(UUID uuid, UUID uuid2, UUID uuid3, byte[] bArr) {
        String format;
        BluetoothLog.m7332v(String.format("writeDescriptor for %s: service = 0x%s, character = 0x%s, descriptor = 0x%s, value = 0x%s", new Object[]{this.mBluetoothDevice.getAddress(), uuid, uuid2, uuid3, ByteUtils.byteToString(bArr)}));
        checkRuntime();
        BluetoothGattCharacteristic character = getCharacter(uuid, uuid2);
        if (character == null) {
            format = String.format("characteristic not exist!", new Object[0]);
        } else {
            BluetoothGattDescriptor descriptor = character.getDescriptor(uuid3);
            if (descriptor == null) {
                format = String.format("descriptor not exist", new Object[0]);
            } else if (this.mBluetoothGatt == null) {
                format = String.format("ble gatt null", new Object[0]);
            } else {
                if (bArr == null) {
                    bArr = ByteUtils.EMPTY_BYTES;
                }
                descriptor.setValue(bArr);
                if (this.mBluetoothGatt.writeDescriptor(descriptor)) {
                    return true;
                }
                format = String.format("writeDescriptor failed", new Object[0]);
            }
        }
        BluetoothLog.m7329e(format);
        return false;
    }
}
