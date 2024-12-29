package com.miot.common.device;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.api.ICompletionHandler;
import com.miot.api.MiotManager;
import com.miot.common.device.urn.ServiceType;
import com.miot.common.device.urn.UrnType;
import com.miot.common.field.FieldList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Device implements Parcelable {
    public static final Parcelable.Creator<Device> CREATOR = new Parcelable.Creator<Device>() {
        public Device createFromParcel(Parcel parcel) {
            return new Device(parcel);
        }

        public Device[] newArray(int i) {
            return new Device[i];
        }
    };
    private static final String TAG = "Device";
    private boolean isSetPinCode = false;
    /* access modifiers changed from: private */
    public ConnectionInfo mConnectionInfo = new ConnectionInfo();
    private String mDescription;
    private Map<String, Object> mExtra = new HashMap();
    private FieldList mFields = new FieldList();
    private double mLatitude;
    private double mLongitude;
    private OwnerInfo mOwnerInfo;
    private Map<String, Service> mServices = new HashMap();
    private UrnType mUrnType;

    public static class OwnerInfo implements Parcelable {
        public static final Parcelable.Creator<OwnerInfo> CREATOR = new Parcelable.Creator<OwnerInfo>() {
            public OwnerInfo createFromParcel(Parcel parcel) {
                return new OwnerInfo(parcel);
            }

            public OwnerInfo[] newArray(int i) {
                return new OwnerInfo[i];
            }
        };
        private String mIcon;
        private String mUserId;
        private String mUserName;

        public OwnerInfo() {
        }

        protected OwnerInfo(Parcel parcel) {
            this.mUserId = parcel.readString();
            this.mUserName = parcel.readString();
            this.mIcon = parcel.readString();
        }

        public int describeContents() {
            return 0;
        }

        public String getIcon() {
            return this.mIcon;
        }

        public String getUserId() {
            return this.mUserId;
        }

        public String getUserName() {
            return this.mUserName;
        }

        public void setIcon(String str) {
            this.mIcon = str;
        }

        public void setUserId(String str) {
            this.mUserId = str;
        }

        public void setUserName(String str) {
            this.mUserName = str;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mUserId);
            parcel.writeString(this.mUserName);
            parcel.writeString(this.mIcon);
        }
    }

    public enum Ownership {
        NOONES,
        MINE,
        OTHERS
    }

    public Device() {
        initialize();
    }

    public Device(Parcel parcel) {
        initialize();
        readFromParcel(parcel);
    }

    private Service getService(ServiceType serviceType) {
        return this.mServices.get(serviceType.toString());
    }

    private void initialize() {
        this.mFields.initField(DeviceDefinition.DeviceId, (Object) null);
        this.mFields.initField(DeviceDefinition.DeviceToken, (Object) null);
        this.mFields.initField(DeviceDefinition.Name, (Object) null);
        this.mFields.initField(DeviceDefinition.Model, (Object) null);
        this.mFields.initField(DeviceDefinition.Online, (Object) null);
        this.mFields.initField(DeviceDefinition.OwnerShip, (Object) null);
        this.mFields.initField(DeviceDefinition.ConnectionType, (Object) null);
        this.mFields.initField(DeviceDefinition.IsVirtual, Boolean.FALSE);
        this.mFields.initField(DeviceDefinition.Address, (Object) null);
        this.mFields.initField(DeviceDefinition.ProductId, (Object) null);
        this.mFields.initField(DeviceDefinition.ParentDeviceId, (Object) null);
        this.mFields.initField(DeviceDefinition.ParentDeviceModel, (Object) null);
        this.mFields.initField(DeviceDefinition.ModelName, (Object) null);
        this.mFields.initField(DeviceDefinition.ModelNumber, (Object) null);
        this.mFields.initField(DeviceDefinition.ModelDescription, (Object) null);
        this.mFields.initField(DeviceDefinition.Manufacturer, (Object) null);
        this.mFields.initField(DeviceDefinition.ManufacturerUrl, (Object) null);
    }

    public void addService(Service service) {
        UrnType type = service.getType();
        if (type != null) {
            this.mServices.put(type.toString(), service);
            service.setParentDeviceId(getParentDeviceId());
            service.setDeviceId(getDeviceId());
            service.setDeviceModel(getDeviceModel());
            service.setConnectionType(getConnectionType());
            service.setConnectionInfo(this.mConnectionInfo);
            service.setToken(getDeviceToken());
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Device)) {
            return false;
        }
        Device device = (Device) obj;
        return getDeviceId().equals(device.getDeviceId()) && getAddress().equals(device.getAddress());
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x000b A[EDGE_INSN: B:14:0x000b->B:12:0x000b ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.miot.common.device.Action getAction(java.lang.String r6) {
        /*
            r5 = this;
            java.util.Map<java.lang.String, com.miot.common.device.Service> r0 = r5.mServices
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L_0x000b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0041
            java.lang.Object r2 = r0.next()
            com.miot.common.device.Service r2 = (com.miot.common.device.Service) r2
            java.util.List r2 = r2.getActions()
            java.util.Iterator r2 = r2.iterator()
        L_0x001f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x000b
            java.lang.Object r3 = r2.next()
            com.miot.common.device.Action r3 = (com.miot.common.device.Action) r3
            java.lang.String r4 = r3.getFriendlyName()
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x003f
            java.lang.String r4 = r3.getInternalName()
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x001f
        L_0x003f:
            r1 = r3
            goto L_0x000b
        L_0x0041:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miot.common.device.Device.getAction(java.lang.String):com.miot.common.device.Action");
    }

    public String getAddress() {
        return ((String) this.mFields.getValue(DeviceDefinition.Address)).toUpperCase();
    }

    public ConnectionInfo getConnectionInfo() {
        return this.mConnectionInfo;
    }

    public ConnectionType getConnectionType() {
        return ConnectionType.retrieveType((String) this.mFields.getValue(DeviceDefinition.ConnectionType));
    }

    public String getDescription() {
        return this.mDescription;
    }

    public String getDeviceId() {
        return (String) this.mFields.getValue(DeviceDefinition.DeviceId);
    }

    public String getDeviceModel() {
        return (String) this.mFields.getValue(DeviceDefinition.Model);
    }

    public String getDeviceToken() {
        return (String) this.mFields.getValue(DeviceDefinition.DeviceToken);
    }

    public Map<String, Object> getExtra() {
        return this.mExtra;
    }

    public boolean getIsSetPinCode() {
        return this.isSetPinCode;
    }

    public double getLatitude() {
        return this.mLatitude;
    }

    public double getLongitude() {
        return this.mLongitude;
    }

    public String getManufacturer() {
        return (String) this.mFields.getValue(DeviceDefinition.Manufacturer);
    }

    public String getManufacturerUrl() {
        return (String) this.mFields.getValue(DeviceDefinition.ManufacturerUrl);
    }

    public String getModelDescription() {
        return (String) this.mFields.getValue(DeviceDefinition.ModelDescription);
    }

    public String getModelName() {
        return (String) this.mFields.getValue(DeviceDefinition.ModelName);
    }

    public String getModelNumber() {
        return (String) this.mFields.getValue(DeviceDefinition.ModelNumber);
    }

    public String getName() {
        return (String) this.mFields.getValue(DeviceDefinition.Name);
    }

    public OwnerInfo getOwnerInfo() {
        return this.mOwnerInfo;
    }

    public Ownership getOwnership() {
        return Ownership.valueOf((String) this.mFields.getValue(DeviceDefinition.OwnerShip));
    }

    public String getParentDeviceId() {
        return (String) this.mFields.getValue(DeviceDefinition.ParentDeviceId);
    }

    public String getParentDeviceModel() {
        return (String) this.mFields.getValue(DeviceDefinition.ParentDeviceModel);
    }

    public String getProductId() {
        return (String) this.mFields.getValue(DeviceDefinition.ProductId);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x000b A[EDGE_INSN: B:14:0x000b->B:12:0x000b ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.miot.common.property.Property getProperty(java.lang.String r6) {
        /*
            r5 = this;
            java.util.Map<java.lang.String, com.miot.common.device.Service> r0 = r5.mServices
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L_0x000b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0041
            java.lang.Object r2 = r0.next()
            com.miot.common.device.Service r2 = (com.miot.common.device.Service) r2
            java.util.List r2 = r2.getProperties()
            java.util.Iterator r2 = r2.iterator()
        L_0x001f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x000b
            java.lang.Object r3 = r2.next()
            com.miot.common.property.Property r3 = (com.miot.common.property.Property) r3
            java.lang.String r4 = r3.getFriendlyName()
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x003f
            java.lang.String r4 = r3.getInternalName()
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x001f
        L_0x003f:
            r1 = r3
            goto L_0x000b
        L_0x0041:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miot.common.device.Device.getProperty(java.lang.String):com.miot.common.property.Property");
    }

    public Service getService(String str) {
        return this.mServices.get(str);
    }

    public List<Service> getServices() {
        return new ArrayList(this.mServices.values());
    }

    public UrnType getType() {
        return this.mUrnType;
    }

    public int hashCode() {
        String str = (String) this.mFields.getValue(DeviceDefinition.DeviceId);
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public boolean isOnline() {
        return ((Boolean) this.mFields.getValue(DeviceDefinition.Online)).booleanValue();
    }

    public Boolean isVirtual() {
        return (Boolean) this.mFields.getValue(DeviceDefinition.IsVirtual);
    }

    public void localPing() {
        if (getConnectionType() == ConnectionType.MIOT_WAN && this.mConnectionInfo != null && MiotManager.getDeviceManager() != null) {
            MiotManager.getDeviceManager().localPing(this.mConnectionInfo.getHost(), new ICompletionHandler.Stub() {
                public void onFailed(int i, String str) {
                }

                public void onSucceed() {
                    Device.this.mConnectionInfo.setLocation(Location.LOCAL);
                }
            });
        }
    }

    public void readFromParcel(Parcel parcel) {
        this.mUrnType = (UrnType) parcel.readParcelable(UrnType.class.getClassLoader());
        this.mDescription = parcel.readString();
        this.mLongitude = parcel.readDouble();
        this.mLatitude = parcel.readDouble();
        this.mFields = (FieldList) parcel.readParcelable(FieldList.class.getClassLoader());
        this.mOwnerInfo = (OwnerInfo) parcel.readParcelable(OwnerInfo.class.getClassLoader());
        this.mConnectionInfo = (ConnectionInfo) parcel.readParcelable(ConnectionInfo.class.getClassLoader());
        parcel.readMap(this.mExtra, Object.class.getClassLoader());
        int readInt = parcel.readInt();
        boolean z = false;
        for (int i = 0; i < readInt; i++) {
            addService((Service) parcel.readParcelable(Service.class.getClassLoader()));
        }
        if (parcel.readByte() != 0) {
            z = true;
        }
        this.isSetPinCode = z;
    }

    public boolean setAddress(String str) {
        return this.mFields.setValue(DeviceDefinition.Address, (Object) str);
    }

    public void setConnectionInfo(ConnectionInfo connectionInfo) {
        this.mConnectionInfo = connectionInfo;
    }

    public boolean setConnectionType(ConnectionType connectionType) {
        return this.mFields.setValue(DeviceDefinition.ConnectionType, (Object) connectionType.toString());
    }

    public void setDescription(String str) {
        this.mDescription = str;
    }

    public boolean setDeviceId(String str) {
        return this.mFields.setValue(DeviceDefinition.DeviceId, (Object) str);
    }

    public boolean setDeviceModel(String str) {
        return this.mFields.setValue(DeviceDefinition.Model, (Object) str);
    }

    public boolean setDeviceToken(String str) {
        return this.mFields.setValue(DeviceDefinition.DeviceToken, (Object) str);
    }

    public void setExtra(Map<String, Object> map) {
        this.mExtra = map;
        if (map != null && map.get("isSetPincode") != null) {
            try {
                this.isSetPinCode = ((Double) map.get("isSetPincode")).intValue() != 0;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void setLatitude(double d) {
        this.mLatitude = d;
    }

    public void setLongitude(double d) {
        this.mLongitude = d;
    }

    public boolean setManufacturer(String str) {
        return this.mFields.setValue(DeviceDefinition.Manufacturer, (Object) str);
    }

    public boolean setManufacturerUrl(String str) {
        return this.mFields.setValue(DeviceDefinition.ManufacturerUrl, (Object) str);
    }

    public boolean setModelDescription(String str) {
        return this.mFields.setValue(DeviceDefinition.ModelDescription, (Object) str);
    }

    public boolean setModelName(String str) {
        return this.mFields.setValue(DeviceDefinition.ModelName, (Object) str);
    }

    public boolean setModelNumber(String str) {
        return this.mFields.setValue(DeviceDefinition.ModelNumber, (Object) str);
    }

    public boolean setName(String str) {
        return this.mFields.setValue(DeviceDefinition.Name, (Object) str);
    }

    public boolean setOnline(boolean z) {
        return this.mFields.setValue(DeviceDefinition.Online, (Object) Boolean.valueOf(z));
    }

    public void setOwnerInfo(OwnerInfo ownerInfo) {
        this.mOwnerInfo = ownerInfo;
    }

    public boolean setOwnership(Ownership ownership) {
        return this.mFields.setValue(DeviceDefinition.OwnerShip, (Object) ownership.toString());
    }

    public boolean setParentDeviceId(String str) {
        return this.mFields.setValue(DeviceDefinition.ParentDeviceId, (Object) str);
    }

    public boolean setParentDeviceModel(String str) {
        return this.mFields.setValue(DeviceDefinition.ParentDeviceModel, (Object) str);
    }

    public boolean setProductId(String str) {
        return this.mFields.setValue(DeviceDefinition.ProductId, (Object) str);
    }

    public void setType(UrnType urnType) {
        this.mUrnType = urnType;
    }

    public boolean setVirtual(boolean z) {
        return this.mFields.setValue(DeviceDefinition.IsVirtual, (Object) Boolean.valueOf(z));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mUrnType, i);
        parcel.writeString(this.mDescription);
        parcel.writeDouble(this.mLongitude);
        parcel.writeDouble(this.mLatitude);
        parcel.writeParcelable(this.mFields, i);
        parcel.writeParcelable(this.mOwnerInfo, i);
        parcel.writeParcelable(this.mConnectionInfo, i);
        parcel.writeMap(this.mExtra);
        parcel.writeInt(this.mServices.size());
        for (Service writeParcelable : this.mServices.values()) {
            parcel.writeParcelable(writeParcelable, i);
        }
        parcel.writeByte(this.isSetPinCode ? (byte) 1 : 0);
    }
}
