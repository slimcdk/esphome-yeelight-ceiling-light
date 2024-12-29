package com.inuker.bluetooth.library.connect.response;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import com.inuker.bluetooth.library.connect.listener.IBluetoothGattResponse;

public class BluetoothGattResponse extends BluetoothGattCallback {
    private IBluetoothGattResponse response;

    public BluetoothGattResponse(IBluetoothGattResponse iBluetoothGattResponse) {
        this.response = iBluetoothGattResponse;
    }

    public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        this.response.onCharacteristicChanged(bluetoothGattCharacteristic, bluetoothGattCharacteristic.getValue());
    }

    public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        this.response.onCharacteristicRead(bluetoothGattCharacteristic, i, bluetoothGattCharacteristic.getValue());
    }

    public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        this.response.onCharacteristicWrite(bluetoothGattCharacteristic, i, bluetoothGattCharacteristic.getValue());
    }

    public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
        this.response.onConnectionStateChange(i, i2);
    }

    public void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        this.response.onDescriptorRead(bluetoothGattDescriptor, i, bluetoothGattDescriptor.getValue());
    }

    public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        this.response.onDescriptorWrite(bluetoothGattDescriptor, i);
    }

    public void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int i, int i2) {
        this.response.onReadRemoteRssi(i, i2);
    }

    public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
        this.response.onServicesDiscovered(i);
    }
}
