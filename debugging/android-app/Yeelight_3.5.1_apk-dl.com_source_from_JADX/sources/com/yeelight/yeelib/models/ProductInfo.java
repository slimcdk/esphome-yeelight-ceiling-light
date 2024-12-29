package com.yeelight.yeelib.models;

import java.io.Serializable;

public class ProductInfo implements Serializable {
    private boolean bDisplayInList = true;
    private boolean bEnabled;
    private int mMinFirmwareVer = 0;
    private int mProductIcon;
    private String mProductModel;
    private String mProductName;

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof ProductInfo) {
            return ((ProductInfo) obj).getProductModel().equals(getProductModel());
        }
        return false;
    }

    public int getMinFirmwareVer() {
        return this.mMinFirmwareVer;
    }

    public int getProductIcon() {
        return this.mProductIcon;
    }

    public String getProductModel() {
        return this.mProductModel;
    }

    public String getProductName() {
        return this.mProductName;
    }

    public boolean isDisplayInList() {
        return this.bDisplayInList;
    }

    public boolean isEnabled() {
        return this.bEnabled;
    }

    public void setDisplayInList(boolean z) {
        this.bDisplayInList = z;
    }

    public void setEnabled(boolean z) {
        this.bEnabled = z;
    }

    public void setMinFirmwareVer(int i) {
        this.mMinFirmwareVer = i;
    }

    public void setProductIcon(int i) {
        this.mProductIcon = i;
    }

    public void setProductModel(String str) {
        this.mProductModel = str;
    }

    public void setProductName(String str) {
        this.mProductName = str;
    }
}
