package com.miot.common.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.device.DiscoveryType;
import java.util.ArrayList;
import java.util.List;

public class AppConfiguration implements Parcelable {
    public static final Parcelable.Creator<AppConfiguration> CREATOR = new Parcelable.Creator<AppConfiguration>() {
        public AppConfiguration createFromParcel(Parcel parcel) {
            return new AppConfiguration(parcel);
        }

        public AppConfiguration[] newArray(int i) {
            return new AppConfiguration[i];
        }
    };
    private Long mAppId;
    private String mAppKey;
    private List<DiscoveryType> mDiscoveryTypes = new ArrayList();
    private boolean mIsPreview;
    private Locale mLocale = Locale.cn;

    public enum Locale {
        cn,
        sg,
        us,
        de,
        ru,
        i2
    }

    public AppConfiguration() {
    }

    protected AppConfiguration(Parcel parcel) {
        this.mAppId = (Long) parcel.readValue(Long.class.getClassLoader());
        this.mAppKey = parcel.readString();
        int readInt = parcel.readInt();
        this.mLocale = readInt == -1 ? null : Locale.values()[readInt];
        this.mIsPreview = parcel.readInt() != 1 ? false : true;
        ArrayList arrayList = new ArrayList();
        this.mDiscoveryTypes = arrayList;
        parcel.readList(arrayList, DiscoveryType.class.getClassLoader());
    }

    public AppConfiguration addDiscoveryType(DiscoveryType discoveryType) {
        if (!this.mDiscoveryTypes.contains(discoveryType)) {
            this.mDiscoveryTypes.add(discoveryType);
        }
        return this;
    }

    public int describeContents() {
        return 0;
    }

    public Long getAppId() {
        return this.mAppId;
    }

    public String getAppKey() {
        return this.mAppKey;
    }

    public List<DiscoveryType> getDiscoveryTypes() {
        return this.mDiscoveryTypes;
    }

    public Locale getLocale() {
        return this.mLocale;
    }

    public boolean isPreview() {
        return this.mIsPreview;
    }

    public AppConfiguration setAppId(Long l) {
        this.mAppId = l;
        return this;
    }

    public AppConfiguration setAppKey(String str) {
        this.mAppKey = str;
        return this;
    }

    public AppConfiguration setDiscoveryTypes(List<DiscoveryType> list) {
        this.mDiscoveryTypes = list;
        return this;
    }

    public void setIsPreview(boolean z) {
        this.mIsPreview = z;
    }

    public AppConfiguration setLocale(Locale locale) {
        this.mLocale = locale;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.mAppId);
        parcel.writeString(this.mAppKey);
        Locale locale = this.mLocale;
        parcel.writeInt(locale == null ? -1 : locale.ordinal());
        parcel.writeInt(this.mIsPreview ? 1 : 0);
        parcel.writeList(this.mDiscoveryTypes);
    }
}
