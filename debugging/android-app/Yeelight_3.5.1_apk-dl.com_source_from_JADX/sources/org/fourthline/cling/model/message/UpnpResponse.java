package org.fourthline.cling.model.message;

import androidx.constraintlayout.core.motion.utils.TypedValues;

public class UpnpResponse extends C10033g {

    /* renamed from: b */
    private int f18520b;

    /* renamed from: c */
    private String f18521c;

    public enum Status {
        OK(200, "OK"),
        BAD_REQUEST(400, "Bad Request"),
        NOT_FOUND(404, "Not Found"),
        METHOD_NOT_SUPPORTED(405, "Method Not Supported"),
        PRECONDITION_FAILED(412, "Precondition Failed"),
        UNSUPPORTED_MEDIA_TYPE(415, "Unsupported Media Type"),
        INTERNAL_SERVER_ERROR(500, "Internal Server Error"),
        NOT_IMPLEMENTED(TypedValues.PositionType.TYPE_TRANSITION_EASING, "Not Implemented");
        
        private int statusCode;
        private String statusMsg;

        private Status(int i, String str) {
            this.statusCode = i;
            this.statusMsg = str;
        }

        public static Status getByStatusCode(int i) {
            for (Status status : values()) {
                if (status.getStatusCode() == i) {
                    return status;
                }
            }
            return null;
        }

        public int getStatusCode() {
            return this.statusCode;
        }

        public String getStatusMsg() {
            return this.statusMsg;
        }
    }

    public UpnpResponse(int i, String str) {
        this.f18520b = i;
        this.f18521c = str;
    }

    public UpnpResponse(Status status) {
        this.f18520b = status.getStatusCode();
        this.f18521c = status.getStatusMsg();
    }

    /* renamed from: c */
    public String mo40421c() {
        return mo40422d() + " " + mo40423e();
    }

    /* renamed from: d */
    public int mo40422d() {
        return this.f18520b;
    }

    /* renamed from: e */
    public String mo40423e() {
        return this.f18521c;
    }

    /* renamed from: f */
    public boolean mo40424f() {
        return this.f18520b >= 300;
    }

    public String toString() {
        return mo40421c();
    }
}
