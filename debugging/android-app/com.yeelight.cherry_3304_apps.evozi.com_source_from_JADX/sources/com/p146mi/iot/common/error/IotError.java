package com.p146mi.iot.common.error;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.mi.iot.common.error.IotError */
public class IotError implements Comparable<IotError>, Parcelable {
    public static final IotError CLIENT_REQUEST_ERROR = new IotError(-40001, "client request error");
    public static final IotError CLIENT_WRITE_PROPERTY_FAIL = new IotError(-40002, "setProperty,but propertyBean is empty in callback");
    public static final Parcelable.Creator<IotError> CREATOR = new Parcelable.Creator<IotError>() {
        public IotError createFromParcel(Parcel parcel) {
            return new IotError(parcel);
        }

        public IotError[] newArray(int i) {
            return new IotError[i];
        }
    };
    public static final IotError HAP_BUSY = new IotError(-70403, "Resource is busy, try again.");
    public static final IotError HAP_CANNOT_NOTIFY = new IotError(-70406, "Notification is not supported for characteristic.");
    public static final IotError HAP_CANNOT_READ = new IotError(-70405, "Cannot read from a write only characteristic.");
    public static final IotError HAP_CANNOT_WRITE = new IotError(-70404, "Cannot write to read only characteristic.");
    public static final IotError HAP_INVALID_VALUE = new IotError(-70410, "Thing received an invalid value in a write request.");
    public static final IotError HAP_OUT_OF_RESOURCES = new IotError(-70407, "Out of resources to process request.");
    public static final IotError HAP_REQUEST_DENINED = new IotError(-70401, "Request denied due to insufficient privileges.");
    public static final IotError HAP_RESOURCE_NOT_EXIST = new IotError(-70409, "Resource does not exist.");
    public static final IotError HAP_TIMEOUT = new IotError(-70408, "Operation timed out.");
    public static final IotError HAP_UNABLE_COMMUNICATE = new IotError(-70402, "Unable to communicate with requested service.");
    public static final IotError INTERNAL = new IotError(100, "internal error");
    public static final IotError INTERNAL_INTERRUPTED = new IotError(104, "interrupted");
    public static final IotError INTERNAL_INVALID_ARGS = new IotError(103, "INVALID ARGS");
    public static final IotError INTERNAL_INVALID_OPERATION = new IotError(102, "invalid operation");
    public static final IotError INTERNAL_NOT_INITIALIZED = new IotError(101, "not initialized");
    public static final IotError INTERNAL_NO_PERMISSION = new IotError(105, "internal not permission");

    /* renamed from: OK */
    public static final IotError f6687OK = new IotError(0, "OK");
    public static final IotError OTP_ACCEPT = new IotError(1, "Accept");
    public static final IotError OTP_ACTION_NOT_FOUND = new IotError(-70406, "ACTION NOT FOUND");
    public static final IotError OTP_DEVICE_NOT_ALLOWED_TO_BE_ACCESSED = new IotError(-70402, "DEVICE NOT ALLOWED TO BE ACCESSED");
    public static final IotError OTP_DEVICE_NOT_FOUND = new IotError(-70401, "DEVICE NOT FOUND");
    public static final IotError OTP_EVENT_NOT_FOUND = new IotError(-70405, "EVENT NOT FOUND");
    public static final IotError OTP_OK = new IotError(0, "OK");
    public static final IotError OTP_PROPERTY_CANNOT_NOTIFY = new IotError(-70410, "PROPERTY CANNOT NOTIFY");
    public static final IotError OTP_PROPERTY_CANNOT_READ = new IotError(-70408, "PROPERTY CANNOT READ");
    public static final IotError OTP_PROPERTY_CANNOT_WRITE = new IotError(-70409, "PROPERTY CANNOT WRITE");
    public static final IotError OTP_PROPERTY_INVALID_VALUE = new IotError(-70411, "PROPERTY INVALID VALUE");
    public static final IotError OTP_PROPERTY_NOT_FOUND = new IotError(-70407, "PROPERTY NOT FOUND");
    public static final IotError OTP_SERVICE_NOT_FOUND = new IotError(-70404, "SERVICE NOT FOUND");
    public static final IotError OTP_THING_NOT_FOUND = new IotError(-70403, "THING NOT FOUND");
    public static final IotError SERVER_RESPONSE_ERROR = new IotError(5000, "server response error");
    private int code;
    private String message;

    public IotError() {
    }

    public IotError(int i, String str) {
        this.code = i;
        this.message = str;
    }

    public IotError(Parcel parcel) {
        readFromParcel(parcel);
    }

    public int compareTo(IotError iotError) {
        return this.code - iotError.code;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof IotError) && this.code == ((IotError) obj).code;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.code;
    }

    public void readFromParcel(Parcel parcel) {
        this.code = parcel.readInt();
        this.message = parcel.readString();
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public String toString() {
        return String.valueOf(this.code) + ' ' + this.message;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.code);
        String str = this.message;
        if (str == null) {
            str = "";
        }
        parcel.writeString(str);
    }
}
