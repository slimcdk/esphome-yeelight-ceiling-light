package com.miot.common.device;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.miot.common.device.urn.UrnType;
import com.miot.common.field.FieldList;
import com.miot.common.property.Property;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Service implements Parcelable {
    public static final Parcelable.Creator<Service> CREATOR = new Parcelable.Creator<Service>() {
        public Service createFromParcel(Parcel parcel) {
            return new Service(parcel);
        }

        public Service[] newArray(int i) {
            return new Service[i];
        }
    };
    private static final String TAG = "Service";
    private Map<String, Action> mActions = new HashMap();
    private Map<String, String> mConfigs = new HashMap();
    private ConnectionInfo mConnectionInfo = new ConnectionInfo();
    private FieldList mFields = new FieldList();
    private volatile List<Property> mProperties = new ArrayList();
    private UrnType mUrnType;

    public Service() {
        initialize();
    }

    public Service(Parcel parcel) {
        readFromParcel(parcel);
    }

    private void initialize() {
        this.mFields.initField(ServiceDefinition.ScpdUrl, (Object) null);
        this.mFields.initField(ServiceDefinition.Description, (Object) null);
        this.mFields.initField(ServiceDefinition.ParentDeviceId, (Object) null);
        this.mFields.initField(ServiceDefinition.DeviceId, (Object) null);
        this.mFields.initField(ServiceDefinition.DeviceModel, (Object) null);
        this.mFields.initField(ServiceDefinition.ConnectionType, (Object) null);
        this.mFields.initField(ServiceDefinition.Token, (Object) null);
    }

    public void addAction(Action action) {
        this.mActions.put(action.getFriendlyName(), action);
    }

    public void addConfig(String str, String str2) {
        if (!this.mConfigs.containsKey(str)) {
            this.mConfigs.put(str, str2);
        }
    }

    public void addProperty(Property property) {
        this.mProperties.add(property);
    }

    public int describeContents() {
        return 0;
    }

    public Action getAction(String str) {
        return this.mActions.get(str);
    }

    public List<Action> getActions() {
        return new ArrayList(this.mActions.values());
    }

    public String getConfig(String str) {
        return this.mConfigs.get(str);
    }

    public ConnectionInfo getConnectionInfo() {
        return this.mConnectionInfo;
    }

    public ConnectionType getConnectionType() {
        return ConnectionType.retrieveType((String) this.mFields.getValue(ServiceDefinition.ConnectionType));
    }

    public String getDescription() {
        return (String) this.mFields.getValue(ServiceDefinition.Description);
    }

    public String getDeviceId() {
        return (String) this.mFields.getValue(ServiceDefinition.DeviceId);
    }

    public String getDeviceModel() {
        return (String) this.mFields.getValue(ServiceDefinition.DeviceModel);
    }

    public String getParentDeviceId() {
        return (String) this.mFields.getValue(ServiceDefinition.ParentDeviceId);
    }

    public List<Property> getProperties() {
        return this.mProperties;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.miot.common.property.Property getProperty(java.lang.String r4) {
        /*
            r3 = this;
            java.util.List<com.miot.common.property.Property> r0 = r3.mProperties
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0027
            java.lang.Object r1 = r0.next()
            com.miot.common.property.Property r1 = (com.miot.common.property.Property) r1
            java.lang.String r2 = r1.getFriendlyName()
            boolean r2 = android.text.TextUtils.equals(r2, r4)
            if (r2 != 0) goto L_0x0028
            java.lang.String r2 = r1.getInternalName()
            boolean r2 = android.text.TextUtils.equals(r2, r4)
            if (r2 == 0) goto L_0x0006
            goto L_0x0028
        L_0x0027:
            r1 = 0
        L_0x0028:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miot.common.device.Service.getProperty(java.lang.String):com.miot.common.property.Property");
    }

    public Property getProperty0(String str) {
        for (Property next : this.mProperties) {
            if (TextUtils.equals(next.getDefinition().getType().toString(), str)) {
                return next;
            }
        }
        return null;
    }

    public String getScpdUrl() {
        return (String) this.mFields.getValue(ServiceDefinition.ScpdUrl);
    }

    public String getToken() {
        return (String) this.mFields.getValue(ServiceDefinition.Token);
    }

    public UrnType getType() {
        return this.mUrnType;
    }

    public void readFromParcel(Parcel parcel) {
        this.mUrnType = (UrnType) parcel.readParcelable(UrnType.class.getClassLoader());
        this.mFields = (FieldList) parcel.readParcelable(FieldList.class.getClassLoader());
        this.mConnectionInfo = (ConnectionInfo) parcel.readParcelable(ConnectionInfo.class.getClassLoader());
        this.mProperties = parcel.createTypedArrayList(Property.CREATOR);
        parcel.readMap(this.mActions, Action.class.getClassLoader());
        parcel.readMap(this.mConfigs, String.class.getClassLoader());
    }

    public void setConnectionInfo(ConnectionInfo connectionInfo) {
        this.mConnectionInfo = connectionInfo;
    }

    public boolean setConnectionType(ConnectionType connectionType) {
        return this.mFields.setValue(ServiceDefinition.ConnectionType, (Object) connectionType.toString());
    }

    public boolean setDescription(String str) {
        return this.mFields.setValue(ServiceDefinition.Description, (Object) str);
    }

    public boolean setDeviceId(String str) {
        return this.mFields.setValue(ServiceDefinition.DeviceId, (Object) str);
    }

    public boolean setDeviceModel(String str) {
        return this.mFields.setValue(ServiceDefinition.DeviceModel, (Object) str);
    }

    public boolean setParentDeviceId(String str) {
        return this.mFields.setValue(ServiceDefinition.ParentDeviceId, (Object) str);
    }

    public boolean setScpdUrl(String str) {
        return this.mFields.setValue(ServiceDefinition.ScpdUrl, (Object) str);
    }

    public boolean setToken(String str) {
        return this.mFields.setValue(ServiceDefinition.Token, (Object) str);
    }

    public void setType(UrnType urnType) {
        this.mUrnType = urnType;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mUrnType, i);
        parcel.writeParcelable(this.mFields, i);
        parcel.writeParcelable(this.mConnectionInfo, i);
        parcel.writeTypedList(this.mProperties);
        parcel.writeMap(this.mActions);
        parcel.writeMap(this.mConfigs);
    }
}
