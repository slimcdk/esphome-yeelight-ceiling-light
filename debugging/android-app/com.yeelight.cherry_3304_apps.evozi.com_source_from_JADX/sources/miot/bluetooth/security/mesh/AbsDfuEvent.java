package miot.bluetooth.security.mesh;

public abstract class AbsDfuEvent {
    public static final int EVENT_COMMAND_COMPLETE = 1;
    public static final int EVENT_TRANSFER_COMPLETE = 2;
    public static final int STATUS_AUTHENTICATION_FAILURE = 2;
    public static final int STATUS_DEVICE_BUSY = 5;
    public static final int STATUS_INVALID_PARAMETERS = 3;
    public static final int STATUS_MEMORY_CAPACITY_EXCEEDED = 4;
    public static final int STATUS_SUCCESS = 0;
    public static final int STATUS_UNKNOWN_COMMAND = 1;
    public static final int STATUS_UNSPECIFIED_ERROR = 6;
    private int mEvent;
    protected byte[] mParams = new byte[0];

    public AbsDfuEvent(byte[] bArr) {
        int min;
        if (bArr != null && bArr.length > 0) {
            this.mEvent = bArr[0];
            if (bArr.length > 1 && (min = Math.min(bArr[1], bArr.length - 2)) > 0) {
                byte[] bArr2 = new byte[min];
                this.mParams = bArr2;
                System.arraycopy(bArr, 2, bArr2, 0, min);
            }
        }
    }

    public int getEvent() {
        return this.mEvent;
    }

    public abstract int getStatus();
}
