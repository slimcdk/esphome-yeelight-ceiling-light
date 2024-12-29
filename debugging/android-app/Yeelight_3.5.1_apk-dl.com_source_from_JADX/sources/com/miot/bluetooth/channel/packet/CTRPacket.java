package com.miot.bluetooth.channel.packet;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class CTRPacket extends Packet {
    private static final int BUFFER_SIZE = 6;
    public static final int CMD_BIND_KEY = 14;
    public static final int CMD_COMMON_DATA = 0;
    public static final int CMD_DEVICE_CERT = 1;
    public static final int CMD_DEVICE_LOGIN_INFO = 5;
    public static final int CMD_DEVICE_PUBLIC_KEY = 3;
    public static final int CMD_DEVICE_SIGNATURE = 4;
    public static final int CMD_LOCK_APP_CONFIRMATION = 10;
    public static final int CMD_LOCK_APP_RANDOM = 11;
    public static final int CMD_LOCK_DEV_CONFIRMATION = 12;
    public static final int CMD_LOCK_DEV_RANDOM = 13;
    public static final int CMD_MANUFACTURE_CERT = 2;
    public static final int CMD_MESH_CONFIG = 9;
    public static final int CMD_SERVER_CERT = 7;
    public static final int CMD_SERVER_SIGNATURE = 8;
    public static final int CMD_SHARE_LOGIN_INFO = 6;
    public static final int CMD_WIFI_CONFIG = 15;
    private final byte[] BUFFER = new byte[6];
    private int frameCount;
    private int packageType;

    public CTRPacket(int i, int i2) {
        this.frameCount = i;
        this.packageType = i2;
    }

    public int getFrameCount() {
        return this.frameCount;
    }

    public String getName() {
        return Packet.CTR;
    }

    public int getPackageType() {
        return this.packageType;
    }

    public byte[] toBytes() {
        ByteBuffer order = ByteBuffer.wrap(this.BUFFER).order(ByteOrder.LITTLE_ENDIAN);
        order.putShort(0);
        order.put((byte) 0);
        order.put((byte) this.packageType);
        order.putShort((short) this.frameCount);
        return order.array();
    }

    public String toString() {
        return "FlowPacket{frameCount=" + this.frameCount + "packageType=" + this.packageType + '}';
    }
}
