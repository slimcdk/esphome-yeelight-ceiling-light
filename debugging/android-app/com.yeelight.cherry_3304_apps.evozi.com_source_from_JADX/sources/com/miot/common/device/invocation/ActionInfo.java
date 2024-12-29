package com.miot.common.device.invocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.device.Action;
import com.miot.common.property.Property;
import java.util.List;

public class ActionInfo implements Parcelable {
    public static final Parcelable.Creator<ActionInfo> CREATOR = new Parcelable.Creator<ActionInfo>() {
        public ActionInfo createFromParcel(Parcel parcel) {
            return new ActionInfo(parcel);
        }

        public ActionInfo[] newArray(int i) {
            return new ActionInfo[i];
        }
    };
    private static final String TAG = "ActionInfo";
    private Action mAction;
    private InvokeInfo mInvokeInfo = new InvokeInfo();

    public ActionInfo() {
    }

    protected ActionInfo(Parcel parcel) {
        this.mInvokeInfo = (InvokeInfo) parcel.readParcelable(InvokeInfo.class.getClassLoader());
        this.mAction = (Action) parcel.readParcelable(Action.class.getClassLoader());
    }

    public int describeContents() {
        return 0;
    }

    public Action getAction() {
        return this.mAction;
    }

    public Object getArgumentValue(String str) {
        return this.mAction.getArgumentValue(str);
    }

    public List<Property> getArguments() {
        return this.mAction.getInArguments();
    }

    public String getDescription() {
        return this.mAction.getDescription();
    }

    public String getDeviceId() {
        return this.mInvokeInfo.getDeviceId();
    }

    public String getFriendlyName() {
        return this.mAction.getFriendlyName();
    }

    public String getInternalName() {
        return this.mAction.getInternalName();
    }

    public InvokeInfo getInvokeInfo() {
        return this.mInvokeInfo;
    }

    public List<Property> getResults() {
        return this.mAction.getOutArguments();
    }

    public String getServiceType() {
        return this.mAction.getServiceType();
    }

    public void setAction(Action action) {
        this.mAction = action;
    }

    public boolean setArgumentValue(String str, Object obj) {
        return this.mAction.setArgumentValue(str, obj);
    }

    public void setInvokeInfo(InvokeInfo invokeInfo) {
        this.mInvokeInfo = invokeInfo;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mInvokeInfo, i);
        parcel.writeParcelable(this.mAction, i);
    }
}
