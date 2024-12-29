package com.miot.service.connection.bluetooth;

import com.miot.service.connection.bluetooth.MiotBleAdvPacket;

public class MiotPacketParser {
    public static MiotBleAdvPacket parse(BleAdvertiseItem bleAdvertiseItem) {
        if (bleAdvertiseItem.type != 22) {
            return null;
        }
        PacketReader packetReader = new PacketReader(bleAdvertiseItem);
        if (packetReader.getShort() != 65173) {
            return null;
        }
        try {
            return tryParse(packetReader);
        } catch (Exception unused) {
            return parseZimiPower(packetReader);
        }
    }

    private static MiotBleAdvPacket parseZimiPower(PacketReader packetReader) {
        MiotBleAdvPacket miotBleAdvPacket = new MiotBleAdvPacket();
        try {
            miotBleAdvPacket.productId = packetReader.getLastShort();
            return miotBleAdvPacket;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static MiotBleAdvPacket tryParse(PacketReader packetReader) {
        MiotBleAdvPacket miotBleAdvPacket = new MiotBleAdvPacket();
        miotBleAdvPacket.frameControl = new MiotBleAdvPacket.FrameControl();
        int i = packetReader.getByte();
        miotBleAdvPacket.frameControl.encrypted = packetReader.getBit(i, 3);
        miotBleAdvPacket.frameControl.withMac = packetReader.getBit(i, 4);
        miotBleAdvPacket.frameControl.withCapability = packetReader.getBit(i, 5);
        miotBleAdvPacket.frameControl.withEvent = packetReader.getBit(i, 6);
        miotBleAdvPacket.frameControl.withMesh = packetReader.getBit(i, 7);
        int i2 = packetReader.getByte();
        miotBleAdvPacket.frameControl.registered = packetReader.getBit(i2, 0);
        miotBleAdvPacket.frameControl.bindingCfm = packetReader.getBit(i2, 1);
        miotBleAdvPacket.frameControl.authMode = packetReader.getInt(i2, 2, 3);
        miotBleAdvPacket.frameControl.version = packetReader.getInt(i2, 4, 7);
        miotBleAdvPacket.productId = packetReader.getShort();
        miotBleAdvPacket.frameCounter = packetReader.getByte();
        if (miotBleAdvPacket.frameControl.withMac) {
            miotBleAdvPacket.mac = packetReader.getMac();
        }
        if (miotBleAdvPacket.frameControl.withCapability) {
            int i3 = packetReader.getByte();
            MiotBleAdvPacket.Capability capability = new MiotBleAdvPacket.Capability();
            miotBleAdvPacket.capability = capability;
            capability.connectable = packetReader.getBit(i3, 0);
            miotBleAdvPacket.capability.centralable = packetReader.getBit(i3, 1);
            miotBleAdvPacket.capability.encryptable = packetReader.getBit(i3, 2);
            miotBleAdvPacket.capability.bindable = packetReader.getInt(i3, 3, 4);
            miotBleAdvPacket.capability.ioCapabilityable = packetReader.getBit(i3, 5);
        }
        if (miotBleAdvPacket.isComboPacket()) {
            miotBleAdvPacket.comboKey = packetReader.getShortString();
        }
        if (miotBleAdvPacket.frameControl.withCapability && miotBleAdvPacket.capability.ioCapabilityable) {
            int i4 = packetReader.getByte();
            MiotBleAdvPacket.IoCapability ioCapability = new MiotBleAdvPacket.IoCapability();
            miotBleAdvPacket.ioCapability = ioCapability;
            ioCapability.inputCapability = packetReader.getInt(i4, 0, 3);
            miotBleAdvPacket.ioCapability.outputCapability = packetReader.getInt(i4, 4, 7);
            packetReader.getByte();
        }
        if (miotBleAdvPacket.frameControl.withEvent) {
            MiotBleAdvPacket.Event event = new MiotBleAdvPacket.Event();
            miotBleAdvPacket.event = event;
            if (miotBleAdvPacket.frameControl.version >= 5) {
                event.eventLength = packetReader.getByte();
                miotBleAdvPacket.event.eventId = packetReader.getByte();
            } else {
                event.eventId = packetReader.getShort();
                miotBleAdvPacket.event.eventLength = packetReader.getByte();
            }
            MiotBleAdvPacket.Event event2 = miotBleAdvPacket.event;
            int i5 = event2.eventLength;
            if (i5 > 0) {
                event2.eventData = new int[i5];
                int i6 = 0;
                while (true) {
                    MiotBleAdvPacket.Event event3 = miotBleAdvPacket.event;
                    if (i6 >= event3.eventLength) {
                        break;
                    }
                    event3.eventData[i6] = packetReader.getByte();
                    i6++;
                }
            }
        }
        if (miotBleAdvPacket.frameControl.encrypted) {
            int[] iArr = new int[3];
            miotBleAdvPacket.extendedFrameCounter = iArr;
            iArr[0] = packetReader.getByte();
            miotBleAdvPacket.extendedFrameCounter[1] = packetReader.getByte();
            miotBleAdvPacket.extendedFrameCounter[2] = packetReader.getByte();
            if (miotBleAdvPacket.frameControl.version >= 4) {
                int[] iArr2 = new int[4];
                miotBleAdvPacket.messageIntegrityCheck = iArr2;
                iArr2[0] = packetReader.getByte();
                miotBleAdvPacket.messageIntegrityCheck[1] = packetReader.getByte();
                miotBleAdvPacket.messageIntegrityCheck[2] = packetReader.getByte();
                miotBleAdvPacket.messageIntegrityCheck[3] = packetReader.getByte();
            } else {
                int[] iArr3 = new int[1];
                miotBleAdvPacket.messageIntegrityCheck = iArr3;
                iArr3[0] = packetReader.getByte();
            }
        }
        if (miotBleAdvPacket.frameControl.withMesh) {
            miotBleAdvPacket.mesh = new MiotBleAdvPacket.Mesh();
            int i7 = packetReader.getByte();
            miotBleAdvPacket.mesh.pbType = packetReader.getInt(i7, 0, 1);
            miotBleAdvPacket.mesh.state = packetReader.getInt(i7, 2, 3);
            miotBleAdvPacket.mesh.version = packetReader.getInt(i7, 4, 7);
            packetReader.getByte();
        }
        return miotBleAdvPacket;
    }
}
