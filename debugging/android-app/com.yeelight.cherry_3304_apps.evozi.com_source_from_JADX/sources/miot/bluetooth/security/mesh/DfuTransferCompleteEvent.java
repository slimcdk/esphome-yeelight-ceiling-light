package miot.bluetooth.security.mesh;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class DfuTransferCompleteEvent extends AbsDfuEvent {
    private int mIndex = -1;
    private int mStatus = -1;

    public DfuTransferCompleteEvent(byte[] bArr) {
        super(bArr);
        initData();
    }

    private void initData() {
        byte[] bArr = this.mParams;
        if (bArr.length >= 3) {
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            this.mStatus = order.get();
            this.mIndex = order.getShort();
        }
    }

    public int getIndex() {
        return this.mIndex;
    }

    public int getStatus() {
        return this.mStatus;
    }

    public String toString() {
        return "DfuTransferCompleteEvent{Status=" + this.mStatus + "Index=" + this.mIndex + '}';
    }
}
