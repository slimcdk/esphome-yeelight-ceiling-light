package org.fourthline.cling.model.types;

import androidx.constraintlayout.core.motion.utils.TypedValues;

public enum ErrorCode {
    INVALID_ACTION(TypedValues.CycleType.TYPE_CURVE_FIT, "No action by that name at this service"),
    INVALID_ARGS(TypedValues.CycleType.TYPE_VISIBILITY, "Not enough IN args, too many IN args, no IN arg by that name, one or more IN args are of the wrong data type"),
    ACTION_FAILED(TypedValues.PositionType.TYPE_TRANSITION_EASING, "Current state of service prevents invoking that action"),
    ARGUMENT_VALUE_INVALID(600, "The argument value is invalid"),
    ARGUMENT_VALUE_OUT_OF_RANGE(601, "An argument value is less than the minimum or more than the maximum value of the allowedValueRange, or is not in the allowedValueList"),
    OPTIONAL_ACTION(TypedValues.MotionType.TYPE_QUANTIZE_MOTION_PHASE, "The requested action is optional and is not implemented by the device"),
    OUT_OF_MEMORY(TypedValues.MotionType.TYPE_EASING, "The device does not have sufficient memory available to complete the action"),
    HUMAN_INTERVENTION_REQUIRED(TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR, "The device has encountered an error condition which it cannot resolve itself"),
    ARGUMENT_TOO_LONG(TypedValues.MotionType.TYPE_ANIMATE_RELATIVE_TO, "A string argument is too long for the device to handle properly"),
    ACTION_NOT_AUTHORIZED(TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO, "The action requested requires authorization and the sender was not authorized"),
    SIGNATURE_FAILURE(TypedValues.MotionType.TYPE_PATHMOTION_ARC, "The sender's signature failed to verify"),
    SIGNATURE_MISSING(TypedValues.MotionType.TYPE_DRAW_PATH, "The action requested requires a digital signature and there was none provided"),
    NOT_ENCRYPTED(TypedValues.MotionType.TYPE_POLAR_RELATIVETO, "This action requires confidentiality but the action was not delivered encrypted"),
    INVALID_SEQUENCE(TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, "The sequence provided was not valid"),
    INVALID_CONTROL_URL(TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_TYPE, "The controlURL within the freshness element does not match the controlURL of the action actually invoked"),
    NO_SUCH_SESSION(TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, "The session key reference is to a non-existent session"),
    TRANSPORT_LOCKED(TypedValues.TransitionType.TYPE_INTERPOLATOR, "Transport locked"),
    ILLEGAL_MIME_TYPE(714, "Illegal mime-type");
    
    private int code;
    private String description;

    private ErrorCode(int i, String str) {
        this.code = i;
        this.description = str;
    }

    public static ErrorCode getByCode(int i) {
        for (ErrorCode errorCode : values()) {
            if (errorCode.getCode() == i) {
                return errorCode;
            }
        }
        return null;
    }

    public int getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }
}
