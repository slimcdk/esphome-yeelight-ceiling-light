package org.eclipse.jetty.http;

import androidx.constraintlayout.core.motion.utils.TypedValues;

public class HttpStatus {

    /* renamed from: a */
    private static final Code[] f17983a = new Code[TypedValues.PositionType.TYPE_CURVE_FIT];

    public enum Code {
        CONTINUE(100, "Continue"),
        SWITCHING_PROTOCOLS(101, "Switching Protocols"),
        PROCESSING(102, "Processing"),
        OK(200, "OK"),
        CREATED(201, "Created"),
        ACCEPTED(202, "Accepted"),
        NON_AUTHORITATIVE_INFORMATION(203, "Non Authoritative Information"),
        NO_CONTENT(204, "No Content"),
        RESET_CONTENT(205, "Reset Content"),
        PARTIAL_CONTENT(206, "Partial Content"),
        MULTI_STATUS(207, "Multi-Status"),
        MULTIPLE_CHOICES(300, "Multiple Choices"),
        MOVED_PERMANENTLY(301, "Moved Permanently"),
        MOVED_TEMPORARILY(302, "Moved Temporarily"),
        FOUND(302, "Found"),
        SEE_OTHER(303, "See Other"),
        NOT_MODIFIED(304, "Not Modified"),
        USE_PROXY(305, "Use Proxy"),
        TEMPORARY_REDIRECT(307, "Temporary Redirect"),
        BAD_REQUEST(400, "Bad Request"),
        UNAUTHORIZED(TypedValues.CycleType.TYPE_CURVE_FIT, "Unauthorized"),
        PAYMENT_REQUIRED(TypedValues.CycleType.TYPE_VISIBILITY, "Payment Required"),
        FORBIDDEN(TypedValues.CycleType.TYPE_ALPHA, "Forbidden"),
        NOT_FOUND(404, "Not Found"),
        METHOD_NOT_ALLOWED(405, "Method Not Allowed"),
        NOT_ACCEPTABLE(406, "Not Acceptable"),
        PROXY_AUTHENTICATION_REQUIRED(407, "Proxy Authentication Required"),
        REQUEST_TIMEOUT(408, "Request Timeout"),
        CONFLICT(409, "Conflict"),
        GONE(410, "Gone"),
        LENGTH_REQUIRED(411, "Length Required"),
        PRECONDITION_FAILED(412, "Precondition Failed"),
        REQUEST_ENTITY_TOO_LARGE(413, "Request Entity Too Large"),
        REQUEST_URI_TOO_LONG(414, "Request-URI Too Long"),
        UNSUPPORTED_MEDIA_TYPE(415, "Unsupported Media Type"),
        REQUESTED_RANGE_NOT_SATISFIABLE(TypedValues.CycleType.TYPE_PATH_ROTATE, "Requested Range Not Satisfiable"),
        EXPECTATION_FAILED(417, "Expectation Failed"),
        UNPROCESSABLE_ENTITY(TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE, "Unprocessable Entity"),
        LOCKED(TypedValues.CycleType.TYPE_WAVE_PERIOD, "Locked"),
        FAILED_DEPENDENCY(TypedValues.CycleType.TYPE_WAVE_OFFSET, "Failed Dependency"),
        INTERNAL_SERVER_ERROR(500, "Server Error"),
        NOT_IMPLEMENTED(TypedValues.PositionType.TYPE_TRANSITION_EASING, "Not Implemented"),
        BAD_GATEWAY(TypedValues.PositionType.TYPE_DRAWPATH, "Bad Gateway"),
        SERVICE_UNAVAILABLE(TypedValues.PositionType.TYPE_PERCENT_WIDTH, "Service Unavailable"),
        GATEWAY_TIMEOUT(TypedValues.PositionType.TYPE_PERCENT_HEIGHT, "Gateway Timeout"),
        HTTP_VERSION_NOT_SUPPORTED(TypedValues.PositionType.TYPE_SIZE_PERCENT, "HTTP Version Not Supported"),
        INSUFFICIENT_STORAGE(TypedValues.PositionType.TYPE_PERCENT_Y, "Insufficient Storage");
        
        /* access modifiers changed from: private */
        public final int _code;
        private final String _message;

        private Code(int i, String str) {
            this._code = i;
            this._message = str;
        }

        public boolean equals(int i) {
            return this._code == i;
        }

        public int getCode() {
            return this._code;
        }

        public String getMessage() {
            return this._message;
        }

        public boolean isClientError() {
            return HttpStatus.m24065c(this._code);
        }

        public boolean isInformational() {
            return HttpStatus.m24066d(this._code);
        }

        public boolean isRedirection() {
            return HttpStatus.m24067e(this._code);
        }

        public boolean isServerError() {
            return HttpStatus.m24068f(this._code);
        }

        public boolean isSuccess() {
            return HttpStatus.m24069g(this._code);
        }

        public String toString() {
            return String.format("[%03d %s]", new Object[]{Integer.valueOf(this._code), getMessage()});
        }
    }

    static {
        for (Code code : Code.values()) {
            f17983a[code._code] = code;
        }
    }

    /* renamed from: a */
    public static Code m24063a(int i) {
        if (i <= 507) {
            return f17983a[i];
        }
        return null;
    }

    /* renamed from: b */
    public static String m24064b(int i) {
        Code a = m24063a(i);
        return a != null ? a.getMessage() : Integer.toString(i);
    }

    /* renamed from: c */
    public static boolean m24065c(int i) {
        return 400 <= i && i <= 499;
    }

    /* renamed from: d */
    public static boolean m24066d(int i) {
        return 100 <= i && i <= 199;
    }

    /* renamed from: e */
    public static boolean m24067e(int i) {
        return 300 <= i && i <= 399;
    }

    /* renamed from: f */
    public static boolean m24068f(int i) {
        return 500 <= i && i <= 599;
    }

    /* renamed from: g */
    public static boolean m24069g(int i) {
        return 200 <= i && i <= 299;
    }
}
