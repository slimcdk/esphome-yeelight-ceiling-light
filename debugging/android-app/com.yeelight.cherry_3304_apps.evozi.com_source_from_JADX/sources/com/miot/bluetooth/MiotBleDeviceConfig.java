package com.miot.bluetooth;

public class MiotBleDeviceConfig {
    private int bindStyle;
    private String model;
    private int productId;

    public static int bindStyle() {
        MiotBleDeviceConfig config = MiotBleClient.getInstance().getConfig();
        if (config != null) {
            return config.getBindStyle();
        }
        return 0;
    }

    public static String model() {
        MiotBleDeviceConfig config = MiotBleClient.getInstance().getConfig();
        return config != null ? config.getModel() : "";
    }

    public static int productId() {
        MiotBleDeviceConfig config = MiotBleClient.getInstance().getConfig();
        if (config != null) {
            return config.getProductId();
        }
        return 0;
    }

    public int getBindStyle() {
        return this.bindStyle;
    }

    public String getModel() {
        return this.model;
    }

    public int getProductId() {
        return this.productId;
    }

    public void setBindStyle(int i) {
        this.bindStyle = i;
    }

    public void setModel(String str) {
        this.model = str;
    }

    public void setProductId(int i) {
        this.productId = i;
    }

    public String toString() {
        return "BluetoothDeviceConfig{model='" + this.model + '\'' + ", productId=" + this.productId + ", bindStyle=" + this.bindStyle + '}';
    }
}
