package com.telink.bluetooth.light;

import androidx.annotation.Nullable;
import com.google.p017ar.schemas.sceneform.ParameterInitDefType;

public enum Opcode {
    BLE_GATT_OP_PAIR_REQ((byte) 1, ""),
    BLE_GATT_OP_PAIR_RSP((byte) 2, ""),
    BLE_GATT_OP_PAIR_REJECT((byte) 3, ""),
    BLE_GATT_OP_PAIR_NETWORK_NAME((byte) 4, ""),
    BLE_GATT_OP_PAIR_PASS((byte) 5, ""),
    BLE_GATT_OP_PAIR_LTK((byte) 6, ""),
    BLE_GATT_OP_PAIR_CONFIRM((byte) 7, ""),
    BLE_GATT_OP_PAIR_LTK_REQ((byte) 8, ""),
    BLE_GATT_OP_PAIR_LTK_RSP((byte) 9, ""),
    BLE_GATT_OP_PAIR_DELETE((byte) 10, ""),
    BLE_GATT_OP_PAIR_DEL_RSP((byte) 11, ""),
    BLE_GATT_OP_PAIR_ENC_REQ((byte) 12, ""),
    BLE_GATT_OP_PAIR_ENC_RSP(ParameterInitDefType.IntVec3Init, ""),
    BLE_GATT_OP_PAIR_ENC_FAIL(ParameterInitDefType.IntVec4Init, ""),
    BLE_GATT_OP_CTRL_D0((byte) -48, "on off"),
    BLE_GATT_OP_CTRL_D1((byte) -47, "reserved"),
    BLE_GATT_OP_CTRL_D2((byte) -46, "set brightness and color"),
    BLE_GATT_OP_CTRL_D3((byte) -45, "reserved"),
    BLE_GATT_OP_CTRL_D4((byte) -44, "response to short group id query"),
    BLE_GATT_OP_CTRL_D5((byte) -43, "response to long group id query"),
    BLE_GATT_OP_CTRL_D6((byte) -42, "response to long group id query"),
    BLE_GATT_OP_CTRL_D7((byte) -41, "add group or remove group"),
    BLE_GATT_OP_CTRL_D8((byte) -40, "reserved"),
    BLE_GATT_OP_CTRL_D9((byte) -39, "reserved"),
    BLE_GATT_OP_CTRL_DA((byte) -38, "status query"),
    BLE_GATT_OP_CTRL_DB((byte) -37, "status response"),
    BLE_GATT_OP_CTRL_DC((byte) -36, "online status report"),
    BLE_GATT_OP_CTRL_DD((byte) -35, "group id query"),
    BLE_GATT_OP_CTRL_DE((byte) -34, "reserved"),
    BLE_GATT_OP_CTRL_DF((byte) -33, "reserved"),
    BLE_GATT_OP_CTRL_E0((byte) -32, "set device address"),
    BLE_GATT_OP_CTRL_E1((byte) -31, "notify the device address information"),
    BLE_GATT_OP_CTRL_E2((byte) -30, "configure rgb value"),
    BLE_GATT_OP_CTRL_E3((byte) -29, "kick out / reset factory"),
    BLE_GATT_OP_CTRL_E4((byte) -28, "set device time"),
    BLE_GATT_OP_CTRL_E5((byte) -27, "alarm operation opcode"),
    BLE_GATT_OP_CTRL_E6((byte) -26, "get device alarm"),
    BLE_GATT_OP_CTRL_E7((byte) -25, "alarm response"),
    BLE_GATT_OP_CTRL_E8((byte) -24, "get device time"),
    BLE_GATT_OP_CTRL_E9((byte) -23, "time response"),
    BLE_GATT_OP_CTRL_EA((byte) -22, "user all"),
    BLE_GATT_OP_CTRL_EB((byte) -21, "user all notify"),
    BLE_GATT_OP_CTRL_EE((byte) -18, "scene operation opcode"),
    BLE_GATT_OP_CTRL_EF((byte) -17, "load scene opcode"),
    BLE_GATT_OP_CTRL_C0((byte) -64, "get scene opcode"),
    BLE_GATT_OP_CTRL_C1((byte) -63, "scene response");
    
    private final String info;
    private final byte value;

    private Opcode(byte b, @Nullable String str) {
        this.value = b;
        this.info = str;
    }

    public static Opcode valueOf(byte b) {
        byte b2 = (byte) (b & 255);
        for (Opcode opcode : values()) {
            if (opcode.getValue() == b2) {
                return opcode;
            }
        }
        return null;
    }

    public String getInfo() {
        return this.info;
    }

    public byte getValue() {
        return (byte) (this.value & 255);
    }
}
