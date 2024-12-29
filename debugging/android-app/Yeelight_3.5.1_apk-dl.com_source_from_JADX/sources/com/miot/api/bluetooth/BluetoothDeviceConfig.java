package com.miot.api.bluetooth;

import java.io.Serializable;

public class BluetoothDeviceConfig implements Serializable {
    public BindStyle bindStyle;
    public String model;
    public int productId;

    public String toString() {
        return "BluetoothDeviceConfig{model='" + this.model + '\'' + ", productId=" + this.productId + ", bindStyle=" + this.bindStyle + '}';
    }
}
