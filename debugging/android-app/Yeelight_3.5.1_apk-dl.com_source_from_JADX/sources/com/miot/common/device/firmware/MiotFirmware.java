package com.miot.common.device.firmware;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.field.FieldList;

public class MiotFirmware implements Parcelable {
    public static final Parcelable.Creator<MiotFirmware> CREATOR = new Parcelable.Creator<MiotFirmware>() {
        public MiotFirmware createFromParcel(Parcel parcel) {
            return new MiotFirmware(parcel);
        }

        public MiotFirmware[] newArray(int i) {
            return new MiotFirmware[i];
        }
    };
    private FieldList fields = new FieldList();

    public MiotFirmware() {
        initialize();
    }

    public MiotFirmware(Parcel parcel) {
        initialize();
        readFromParcel(parcel);
    }

    private void initialize() {
        this.fields.initField(MiotFirmwareDefinition.IsUpgrading, (Object) null);
        this.fields.initField(MiotFirmwareDefinition.CurrentVersion, (Object) null);
        this.fields.initField(MiotFirmwareDefinition.LatestVersion, (Object) null);
        this.fields.initField(MiotFirmwareDefinition.IsLatestVersion, (Object) null);
        this.fields.initField(MiotFirmwareDefinition.Description, (Object) null);
        this.fields.initField(MiotFirmwareDefinition.OtaProgress, (Object) null);
        this.fields.initField(MiotFirmwareDefinition.OtaStatus, (Object) null);
    }

    public int describeContents() {
        return 0;
    }

    public String getCurrentVersion() {
        return (String) this.fields.getValue(MiotFirmwareDefinition.CurrentVersion);
    }

    public String getDescription() {
        return (String) this.fields.getValue(MiotFirmwareDefinition.Description);
    }

    public String getLatestVersion() {
        return (String) this.fields.getValue(MiotFirmwareDefinition.LatestVersion);
    }

    public int getOtaProgress() {
        return ((Integer) this.fields.getValue(MiotFirmwareDefinition.OtaProgress)).intValue();
    }

    public String getOtaStatus() {
        return (String) this.fields.getValue(MiotFirmwareDefinition.OtaStatus);
    }

    public boolean isLatestVersion() {
        return ((Boolean) this.fields.getValue(MiotFirmwareDefinition.IsLatestVersion)).booleanValue();
    }

    public boolean isUpgrading() {
        return ((Boolean) this.fields.getValue(MiotFirmwareDefinition.IsUpgrading)).booleanValue();
    }

    public void readFromParcel(Parcel parcel) {
        this.fields = (FieldList) parcel.readParcelable(FieldList.class.getClassLoader());
    }

    public boolean setCurrentVersion(String str) {
        return this.fields.setValue(MiotFirmwareDefinition.CurrentVersion, (Object) str);
    }

    public boolean setDescription(String str) {
        return this.fields.setValue(MiotFirmwareDefinition.Description, (Object) str);
    }

    public boolean setIsLatest(boolean z) {
        return this.fields.setValue(MiotFirmwareDefinition.IsLatestVersion, (Object) Boolean.valueOf(z));
    }

    public boolean setIsUpgrading(boolean z) {
        return this.fields.setValue(MiotFirmwareDefinition.IsUpgrading, (Object) Boolean.valueOf(z));
    }

    public boolean setLatestVersion(String str) {
        return this.fields.setValue(MiotFirmwareDefinition.LatestVersion, (Object) str);
    }

    public boolean setOtaProgress(int i) {
        return this.fields.setValue(MiotFirmwareDefinition.OtaProgress, (Object) Integer.valueOf(i));
    }

    public boolean setOtaStatus(String str) {
        return this.fields.setValue(MiotFirmwareDefinition.OtaStatus, (Object) str);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.fields, i);
    }
}
