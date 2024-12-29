package miot.bluetooth.security.mesh;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class DfuCommand {
    public static final int COMMAND_READ_FRAGMENT_SIZE = 2;
    public static final int COMMAND_READ_LAST_FRAGMENT_SIZE = 3;
    public static final int COMMAND_READ_PROTOCOL_VERSION = 1;
    public static final int COMMAND_SET_DELAY_TO_SWITCH_FIRMWARE = 4;
    public static final int MAX_VALUE_SIZE = 17;
    private int mCommand;
    private byte[] mParams;

    public DfuCommand(int i, byte[] bArr) {
        if (bArr == null || bArr.length <= 17) {
            this.mCommand = i;
            this.mParams = bArr;
            return;
        }
        throw new Exception("params exceed max size 17");
    }

    public byte[] toBytes() {
        byte[] bArr = this.mParams;
        int length = bArr != null ? bArr.length + 3 : 3;
        ByteBuffer order = ByteBuffer.allocate(length).order(ByteOrder.LITTLE_ENDIAN);
        order.putShort((short) this.mCommand);
        order.put((byte) (length - 3));
        byte[] bArr2 = this.mParams;
        if (bArr2 != null && bArr2.length > 0) {
            order.put(bArr2);
        }
        return order.array();
    }

    public String toString() {
        return "DfuCommand{Command=" + this.mCommand + '}';
    }
}
