package miot.bluetooth.security.mesh;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class DfuCommandCompleteEvent extends AbsDfuEvent {
    private int mCommandOpcode = -1;
    private int mStatus = -1;
    private byte[] mValue = new byte[0];

    public DfuCommandCompleteEvent(byte[] bArr) {
        super(bArr);
        initData();
    }

    private void initData() {
        byte[] bArr = this.mParams;
        if (bArr.length >= 2) {
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            this.mCommandOpcode = order.getShort();
            if (order.remaining() > 0) {
                this.mStatus = order.get();
                byte[] bArr2 = new byte[order.remaining()];
                this.mValue = bArr2;
                if (bArr2.length > 0) {
                    order.get(bArr2);
                }
            }
        }
    }

    public int getCommandOpcode() {
        return this.mCommandOpcode;
    }

    public int getStatus() {
        return this.mStatus;
    }

    public byte[] getValue() {
        return this.mValue;
    }

    public String toString() {
        return "DfuCommandCompleteEvent{Command Opcode=" + this.mCommandOpcode + "Status=" + this.mStatus + '}';
    }
}
