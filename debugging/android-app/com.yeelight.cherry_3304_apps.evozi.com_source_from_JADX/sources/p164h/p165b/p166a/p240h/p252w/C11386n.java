package p164h.p165b.p166a.p240h.p252w;

/* renamed from: h.b.a.h.w.n */
public enum C11386n {
    INVALID_ACTION(401, "No action by that name at this service"),
    INVALID_ARGS(402, "Not enough IN args, too many IN args, no IN arg by that name, one or more IN args are of the wrong data type"),
    ACTION_FAILED(501, "Current state of service prevents invoking that action"),
    ARGUMENT_VALUE_INVALID(600, "The argument value is invalid"),
    ARGUMENT_VALUE_OUT_OF_RANGE(601, "An argument value is less than the minimum or more than the maximum value of the allowedValueRange, or is not in the allowedValueList"),
    OPTIONAL_ACTION(602, "The requested action is optional and is not implemented by the device"),
    OUT_OF_MEMORY(603, "The device does not have sufficient memory available to complete the action"),
    HUMAN_INTERVENTION_REQUIRED(604, "The device has encountered an error condition which it cannot resolve itself"),
    ARGUMENT_TOO_LONG(605, "A string argument is too long for the device to handle properly"),
    ACTION_NOT_AUTHORIZED(606, "The action requested requires authorization and the sender was not authorized"),
    SIGNATURE_FAILURE(607, "The sender's signature failed to verify"),
    SIGNATURE_MISSING(608, "The action requested requires a digital signature and there was none provided"),
    NOT_ENCRYPTED(609, "This action requires confidentiality but the action was not delivered encrypted"),
    INVALID_SEQUENCE(610, "The sequence provided was not valid"),
    INVALID_CONTROL_URL(611, "The controlURL within the freshness element does not match the controlURL of the action actually invoked"),
    NO_SUCH_SESSION(612, "The session key reference is to a non-existent session"),
    TRANSPORT_LOCKED(705, "Transport locked"),
    ILLEGAL_MIME_TYPE(714, "Illegal mime-type");
    

    /* renamed from: a */
    private int f22639a;

    /* renamed from: b */
    private String f22640b;

    private C11386n(int i, String str) {
        this.f22639a = i;
        this.f22640b = str;
    }

    /* renamed from: a */
    public static C11386n m29846a(int i) {
        for (C11386n nVar : values()) {
            if (nVar.mo36107b() == i) {
                return nVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    public int mo36107b() {
        return this.f22639a;
    }

    /* renamed from: c */
    public String mo36108c() {
        return this.f22640b;
    }
}
